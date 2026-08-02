package com.getcapacitor.community.facebooklogin;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginConfiguration;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@CapacitorPlugin(requestCodes = {FacebookLogin.FACEBOOK_SDK_REQUEST_CODE_OFFSET})
/* loaded from: classes.dex */
public class FacebookLogin extends Plugin {
    public static final int FACEBOOK_SDK_REQUEST_CODE_OFFSET = 64206;
    CallbackManager callbackManager;
    private String latestCallbackId;
    private AppEventsLogger logger;

    @Override // com.getcapacitor.Plugin
    public void load() {
        Log.d(getLogTag(), "Entering load()");
        this.callbackManager = CallbackManager.Factory.create();
        this.logger = AppEventsLogger.newLogger(getContext());
        LoginManager.getInstance().registerCallback(this.callbackManager, new FacebookCallback<LoginResult>() { // from class: com.getcapacitor.community.facebooklogin.FacebookLogin.1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                Log.d(FacebookLogin.this.getLogTag(), "LoginManager.onSuccess");
                String str = FacebookLogin.this.latestCallbackId;
                FacebookLogin facebookLogin = FacebookLogin.this;
                if (str == null) {
                    Log.e(facebookLogin.getLogTag(), "LoginManager.onSuccess: no plugin saved call found.");
                    return;
                }
                PluginCall savedCall = facebookLogin.bridge.getSavedCall(FacebookLogin.this.latestCallbackId);
                JSObject jSObject = new JSObject();
                jSObject.put("accessToken", (Object) FacebookLogin.this.accessTokenToJson(loginResult.getAccessToken()));
                jSObject.put("recentlyGrantedPermissions", (Object) FacebookLogin.this.collectionToJson(loginResult.getRecentlyGrantedPermissions()));
                jSObject.put("recentlyDeniedPermissions", (Object) FacebookLogin.this.collectionToJson(loginResult.getRecentlyDeniedPermissions()));
                savedCall.resolve(jSObject);
                FacebookLogin.this.latestCallbackId = null;
                FacebookLogin.this.bridge.releaseCall(savedCall);
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                Log.d(FacebookLogin.this.getLogTag(), "LoginManager.onCancel");
                String str = FacebookLogin.this.latestCallbackId;
                FacebookLogin facebookLogin = FacebookLogin.this;
                if (str == null) {
                    Log.e(facebookLogin.getLogTag(), "LoginManager.onCancel: no plugin saved call found.");
                    return;
                }
                PluginCall savedCall = facebookLogin.bridge.getSavedCall(FacebookLogin.this.latestCallbackId);
                JSObject jSObject = new JSObject();
                jSObject.put("accessToken", (String) null);
                savedCall.resolve(jSObject);
                FacebookLogin.this.latestCallbackId = null;
                FacebookLogin.this.bridge.releaseCall(savedCall);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.e(FacebookLogin.this.getLogTag(), "LoginManager.onError", facebookException);
                String str = FacebookLogin.this.latestCallbackId;
                FacebookLogin facebookLogin = FacebookLogin.this;
                if (str == null) {
                    Log.e(facebookLogin.getLogTag(), "LoginManager.onError: no plugin saved call found.");
                    return;
                }
                PluginCall savedCall = facebookLogin.bridge.getSavedCall(FacebookLogin.this.latestCallbackId);
                savedCall.reject(facebookException.toString());
                FacebookLogin.this.latestCallbackId = null;
                FacebookLogin.this.bridge.releaseCall(savedCall);
            }
        });
    }

    @PluginMethod
    public void initialize(PluginCall pluginCall) {
        pluginCall.resolve();
    }

    @PluginMethod
    public void login(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering login()");
        if (this.latestCallbackId != null) {
            Log.e(getLogTag(), "login: overlapped calls not supported");
            pluginCall.reject("Overlapped calls call not supported");
            return;
        }
        try {
            List list = pluginCall.getArray("permissions").toList();
            String string = pluginCall.getString("nonce", "");
            if (string.isEmpty()) {
                LoginManager.getInstance().logIn(getActivity(), new LoginConfiguration(list));
            } else {
                LoginManager.getInstance().logIn(getActivity(), new LoginConfiguration(list, hashWithSha256(string)));
            }
            this.latestCallbackId = pluginCall.getCallbackId();
            this.bridge.saveCall(pluginCall);
        } catch (Exception e) {
            Log.e(getLogTag(), "login: invalid 'permissions' argument", e);
            pluginCall.reject("Invalid permissions argument");
        }
    }

    @PluginMethod
    public void logout(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering logout()");
        LoginManager.getInstance().logOut();
        pluginCall.resolve();
    }

    @PluginMethod
    public void reauthorize(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering reauthorize()");
        if (this.latestCallbackId != null) {
            Log.e(getLogTag(), "reauthorize: overlapped calls not supported");
            pluginCall.reject("Overlapped calls call not supported");
        } else {
            LoginManager.getInstance().reauthorizeDataAccess(getActivity());
            this.latestCallbackId = pluginCall.getCallbackId();
            this.bridge.saveCall(pluginCall);
        }
    }

    @PluginMethod
    public void getCurrentAccessToken(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering getCurrentAccessToken()");
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        JSObject jSObject = new JSObject();
        if (currentAccessToken == null) {
            Log.d(getLogTag(), "getCurrentAccessToken: accessToken is null");
        } else {
            Log.d(getLogTag(), "getCurrentAccessToken: accessToken found");
            jSObject.put("accessToken", (Object) accessTokenToJson(currentAccessToken));
        }
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void getProfile(final PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering getProfile()");
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null) {
            Log.d(getLogTag(), "getProfile: accessToken is null");
            pluginCall.reject("You're not logged in. Call FacebookLogin.login() first to obtain an access token.");
            return;
        }
        if (currentAccessToken.isExpired()) {
            Log.d(getLogTag(), "getProfile: accessToken is expired");
            pluginCall.reject("AccessToken is expired.");
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", pluginCall.getArray(GraphRequest.FIELDS_PARAM).toList()));
            GraphRequest newMeRequest = GraphRequest.newMeRequest(currentAccessToken, new GraphRequest.GraphJSONObjectCallback() { // from class: com.getcapacitor.community.facebooklogin.FacebookLogin.2
                @Override // com.facebook.GraphRequest.GraphJSONObjectCallback
                public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
                    FacebookRequestError error = graphResponse.getError();
                    if (error != null) {
                        pluginCall.reject(error.getErrorMessage());
                        return;
                    }
                    try {
                        pluginCall.resolve(JSObject.fromJSONObject(graphResponse.getGraphObject()));
                    } catch (JSONException e) {
                        pluginCall.reject("Can't create response", e);
                    }
                }
            });
            newMeRequest.setParameters(bundle);
            newMeRequest.executeAsync();
        } catch (JSONException e) {
            pluginCall.reject("Can't handle fields", e);
        }
    }

    @PluginMethod
    public void logEvent(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering logEvent()");
        String string = pluginCall.getString("eventName");
        if (string != null) {
            this.logger.logEvent(string);
        }
    }

    @PluginMethod
    public void setAutoLogAppEventsEnabled(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering setAutoLogAppEventsEnabled()");
        Boolean bool = pluginCall.getBoolean("enabled");
        if (bool != null) {
            FacebookSdk.setAutoLogAppEventsEnabled(bool.booleanValue());
        }
    }

    @PluginMethod
    public void setAdvertiserIDCollectionEnabled(PluginCall pluginCall) {
        Log.d(getLogTag(), "Entering setAdvertiserIDCollectionEnabled()");
        Boolean bool = pluginCall.getBoolean("enabled");
        if (bool != null) {
            FacebookSdk.setAdvertiserIDCollectionEnabled(bool.booleanValue());
        }
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnActivityResult(int i, int i2, Intent intent) {
        Log.d(getLogTag(), "Entering handleOnActivityResult(" + i + ", " + i2 + ")");
        if (this.callbackManager.onActivityResult(i, i2, intent)) {
            Log.d(getLogTag(), "onActivityResult succeeded");
        } else {
            Log.w(getLogTag(), "onActivityResult failed");
        }
    }

    private String dateToJson(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH).format(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSArray collectionToJson(Collection<String> collection) {
        JSArray jSArray = new JSArray();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            jSArray.put(it.next());
        }
        return jSArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSObject accessTokenToJson(AccessToken accessToken) {
        JSObject jSObject = new JSObject();
        jSObject.put("applicationId", accessToken.getApplicationId());
        jSObject.put("declinedPermissions", (Object) collectionToJson(accessToken.getDeclinedPermissions()));
        jSObject.put("expires", dateToJson(accessToken.getExpires()));
        jSObject.put("lastRefresh", dateToJson(accessToken.getLastRefresh()));
        jSObject.put("permissions", (Object) collectionToJson(accessToken.getPermissions()));
        jSObject.put("token", accessToken.getToken());
        jSObject.put("userId", accessToken.getUserId());
        jSObject.put("isExpired", accessToken.isExpired());
        return jSObject;
    }

    private static String hashWithSha256(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256アルゴリズムが見つかりません", e);
        }
    }
}
