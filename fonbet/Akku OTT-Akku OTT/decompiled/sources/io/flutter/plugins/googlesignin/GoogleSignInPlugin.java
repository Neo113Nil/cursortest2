package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.C0809c;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.InterfaceC0807a;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p000authapi.zbad;
import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.auth.h;
import io.flutter.plugins.firebase.auth.n;
import io.flutter.plugins.firebase.auth.o;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class GoogleSignInPlugin implements FlutterPlugin, ActivityAware {
    private static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    private ActivityPluginBinding activityPluginBinding;
    private Delegate delegate;

    @Nullable
    private BinaryMessenger messenger;

    @VisibleForTesting
    public interface AuthorizationClientFactory {
        @NonNull
        InterfaceC0807a create(@NonNull Context context);
    }

    @VisibleForTesting
    public interface CredentialManagerFactory {
        @NonNull
        CredentialManager create(@NonNull Context context);
    }

    public static class Delegate implements PluginRegistry.ActivityResultListener, GoogleSignInApi {

        @VisibleForTesting
        static final int REQUEST_CODE_AUTHORIZE = 53294;

        @Nullable
        private Activity activity;

        @NonNull
        private final AuthorizationClientFactory authorizationClientFactory;

        @NonNull
        private final Context context;

        @NonNull
        final GoogleIdCredentialConverter credentialConverter;

        @NonNull
        private final CredentialManagerFactory credentialManagerFactory;
        private Function1<? super Result<? extends AuthorizeResult>, Unit> pendingAuthorizationCallback;

        public Delegate(@NonNull Context context, @NonNull CredentialManagerFactory credentialManagerFactory, @NonNull AuthorizationClientFactory authorizationClientFactory, @NonNull GoogleIdCredentialConverter googleIdCredentialConverter) {
            this.context = context;
            this.credentialManagerFactory = credentialManagerFactory;
            this.authorizationClientFactory = authorizationClientFactory;
            this.credentialConverter = googleIdCredentialConverter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$authorize$2(boolean z, Function1 function1, C0809c c0809c) {
            if (c0809c.f == null) {
                ResultUtilsKt.completeWithAuthorizationResult(function1, new PlatformAuthorizationResult(c0809c.b, c0809c.a, c0809c.d));
                return;
            }
            if (!z) {
                ResultUtilsKt.completeWithAuthorizeFailure(function1, new AuthorizeFailure(AuthorizeFailureType.UNAUTHORIZED, null, null));
                return;
            }
            Activity activity = getActivity();
            if (activity == null) {
                ResultUtilsKt.completeWithAuthorizeFailure(function1, new AuthorizeFailure(AuthorizeFailureType.NO_ACTIVITY, "No activity available", null));
                return;
            }
            PendingIntent pendingIntent = c0809c.f;
            Objects.requireNonNull(pendingIntent);
            try {
                this.pendingAuthorizationCallback = function1;
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), REQUEST_CODE_AUTHORIZE, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e) {
                this.pendingAuthorizationCallback = null;
                ResultUtilsKt.completeWithAuthorizeFailure(function1, new AuthorizeFailure(AuthorizeFailureType.PENDING_INTENT_EXCEPTION, e.getMessage(), null));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$authorize$3(Function1 function1, Exception exc) {
            ResultUtilsKt.completeWithAuthorizeFailure(function1, new AuthorizeFailure(AuthorizeFailureType.AUTHORIZE_FAILURE, exc.getMessage(), null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$clearAuthorizationToken$1(Function1 function1, Exception exc) {
            ResultUtilsKt.completeWithUnitError(function1, new FlutterError("clearAuthorizationToken failed", exc.getMessage(), null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$revokeAccess$5(Function1 function1, Exception exc) {
            ResultUtilsKt.completeWithUnitError(function1, new FlutterError("revokeAccess failed", exc.getMessage(), null));
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        public void authorize(@NonNull PlatformAuthorizationRequest platformAuthorizationRequest, final boolean z, @NonNull final Function1<? super Result<? extends AuthorizeResult>, Unit> function1) {
            boolean z2;
            String str;
            String str2;
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = platformAuthorizationRequest.getScopes().iterator();
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        arrayList.add(new Scope(1, it.next()));
                    }
                }
                C0875q.b(!arrayList.isEmpty(), "requestedScopes cannot be null or empty");
                if (platformAuthorizationRequest.getHostedDomain() != null) {
                    String hostedDomain = platformAuthorizationRequest.getHostedDomain();
                    C0875q.d(hostedDomain);
                    str = hostedDomain;
                } else {
                    str = null;
                }
                if (platformAuthorizationRequest.getServerClientIdForForcedRefreshToken() != null) {
                    str2 = platformAuthorizationRequest.getServerClientIdForForcedRefreshToken();
                    C0875q.g(str2);
                } else {
                    z2 = false;
                    str2 = null;
                }
                this.authorizationClientFactory.create(this.context).authorize(new AuthorizationRequest(arrayList, str2, z2, false, platformAuthorizationRequest.getAccountEmail() != null ? new Account(platformAuthorizationRequest.getAccountEmail(), GoogleSignInPlugin.GOOGLE_ACCOUNT_TYPE) : null, str, null, z2, null, false)).addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.plugins.googlesignin.g
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        GoogleSignInPlugin.Delegate.this.lambda$authorize$2(z, function1, (C0809c) obj);
                    }
                }).addOnFailureListener(new com.google.firebase.crashlytics.a(function1));
            } catch (RuntimeException e) {
                ResultUtilsKt.completeWithAuthorizeFailure(function1, new AuthorizeFailure(AuthorizeFailureType.API_EXCEPTION, e.getMessage(), "Cause: " + e.getCause() + ", Stacktrace: " + Log.getStackTraceString(e)));
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        public void clearAuthorizationToken(@NonNull String str, @NonNull Function1<? super Result<Unit>, Unit> function1) {
            InterfaceC0807a create = this.authorizationClientFactory.create(this.context);
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            create.clearToken(new ClearTokenRequest(str, null)).addOnSuccessListener(new androidx.activity.result.b(function1)).addOnFailureListener(new n(function1));
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        public void clearCredentialState(@NonNull final Function1<? super Result<Unit>, Unit> function1) {
            this.credentialManagerFactory.create(this.context).clearCredentialStateAsync(new ClearCredentialStateRequest(), null, Executors.newSingleThreadExecutor(), new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.2
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(@NonNull ClearCredentialException clearCredentialException) {
                    ResultUtilsKt.completeWithUnitError(function1, new FlutterError("Clear Failed", clearCredentialException.getMessage(), null));
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(Void r1) {
                    ResultUtilsKt.completeWithUnitSuccess(function1);
                }
            });
        }

        @Nullable
        public Activity getActivity() {
            return this.activity;
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        public void getCredential(@NonNull GetCredentialRequestParams getCredentialRequestParams, @NonNull final Function1<? super Result<? extends GetCredentialResult>, Unit> function1) {
            try {
                String serverClientId = getCredentialRequestParams.getServerClientId();
                if (serverClientId != null && !serverClientId.isEmpty()) {
                    Activity activity = getActivity();
                    if (activity == null) {
                        ResultUtilsKt.completeWithGetCredentialFailure(function1, new GetCredentialFailure(GetCredentialFailureType.NO_ACTIVITY, "No activity available", null));
                        return;
                    }
                    String nonce = getCredentialRequestParams.getNonce();
                    String hostedDomainFilter = getCredentialRequestParams.getHostedDomain();
                    GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder();
                    if (getCredentialRequestParams.getUseButtonFlow()) {
                        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
                        if (hostedDomainFilter != null) {
                            Intrinsics.checkNotNullParameter(hostedDomainFilter, "hostedDomainFilter");
                        } else {
                            hostedDomainFilter = null;
                        }
                        builder.addCredentialOption(new com.google.android.libraries.identity.googleid.b(serverClientId, hostedDomainFilter, nonce != null ? nonce : null));
                    } else {
                        GetCredentialRequestGoogleIdOptionParams googleIdOptionParams = getCredentialRequestParams.getGoogleIdOptionParams();
                        boolean filterToAuthorized = googleIdOptionParams.getFilterToAuthorized();
                        boolean autoSelectEnabled = googleIdOptionParams.getAutoSelectEnabled();
                        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
                        if (serverClientId.length() <= 0) {
                            throw new IllegalArgumentException("serverClientId should not be empty");
                        }
                        builder.addCredentialOption(new com.google.android.libraries.identity.googleid.a(serverClientId, nonce != null ? nonce : null, filterToAuthorized, autoSelectEnabled));
                    }
                    this.credentialManagerFactory.create(this.context).getCredentialAsync(activity, builder.build(), (CancellationSignal) null, Executors.newSingleThreadExecutor(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.1
                        @Override // androidx.credentials.CredentialManagerCallback
                        public void onError(@NonNull GetCredentialException getCredentialException) {
                            ResultUtilsKt.completeWithGetCredentialFailure(function1, new GetCredentialFailure(getCredentialException instanceof GetCredentialCancellationException ? GetCredentialFailureType.CANCELED : getCredentialException instanceof GetCredentialInterruptedException ? GetCredentialFailureType.INTERRUPTED : getCredentialException instanceof GetCredentialProviderConfigurationException ? GetCredentialFailureType.PROVIDER_CONFIGURATION_ISSUE : getCredentialException instanceof GetCredentialUnsupportedException ? GetCredentialFailureType.UNSUPPORTED : getCredentialException instanceof NoCredentialException ? GetCredentialFailureType.NO_CREDENTIAL : GetCredentialFailureType.UNKNOWN, getCredentialException.getMessage(), null));
                        }

                        @Override // androidx.credentials.CredentialManagerCallback
                        public void onResult(GetCredentialResponse getCredentialResponse) {
                            Credential credential = getCredentialResponse.getCredential();
                            if ((credential instanceof CustomCredential) && credential.getType().equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                                com.google.android.libraries.identity.googleid.d createFrom = Delegate.this.credentialConverter.createFrom(credential);
                                Uri uri = createFrom.f;
                                ResultUtilsKt.completeWithGetGetCredentialResult(function1, new GetCredentialSuccess(new PlatformGoogleIdTokenCredential(createFrom.c, createFrom.d, createFrom.e, createFrom.a, createFrom.b, uri != null ? uri.toString() : null)));
                            } else {
                                ResultUtilsKt.completeWithGetCredentialFailure(function1, new GetCredentialFailure(GetCredentialFailureType.UNEXPECTED_CREDENTIAL_TYPE, "Unexpected credential type: " + credential, null));
                            }
                        }
                    });
                    return;
                }
                ResultUtilsKt.completeWithGetCredentialFailure(function1, new GetCredentialFailure(GetCredentialFailureType.MISSING_SERVER_CLIENT_ID, "CredentialManager requires a serverClientId.", null));
            } catch (RuntimeException e) {
                ResultUtilsKt.completeWithGetCredentialFailure(function1, new GetCredentialFailure(GetCredentialFailureType.UNKNOWN, e.getMessage(), "Cause: " + e.getCause() + ", Stacktrace: " + Log.getStackTraceString(e)));
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        @Nullable
        public String getGoogleServicesJsonServerClientId() {
            int identifier = this.context.getResources().getIdentifier("default_web_client_id", "string", this.context.getPackageName());
            if (identifier != 0) {
                return this.context.getString(identifier);
            }
            return null;
        }

        @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
        public boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
            if (i != REQUEST_CODE_AUTHORIZE) {
                return false;
            }
            if (this.pendingAuthorizationCallback == null) {
                Log.e("google_sign_in", "Unexpected authorization result callback");
                return false;
            }
            try {
                C0809c authorizationResultFromIntent = this.authorizationClientFactory.create(this.context).getAuthorizationResultFromIntent(intent);
                ResultUtilsKt.completeWithAuthorizationResult(this.pendingAuthorizationCallback, new PlatformAuthorizationResult(authorizationResultFromIntent.b, authorizationResultFromIntent.a, authorizationResultFromIntent.d));
                return true;
            } catch (com.google.android.gms.common.api.b e) {
                ResultUtilsKt.completeWithAuthorizeFailure(this.pendingAuthorizationCallback, new AuthorizeFailure(AuthorizeFailureType.API_EXCEPTION, e.getMessage(), null));
                this.pendingAuthorizationCallback = null;
                return false;
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInApi
        public void revokeAccess(@NonNull PlatformRevokeAccessRequest platformRevokeAccessRequest, @NonNull Function1<? super Result<Unit>, Unit> function1) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = platformRevokeAccessRequest.getScopes().iterator();
            while (it.hasNext()) {
                arrayList.add(new Scope(1, it.next()));
            }
            this.authorizationClientFactory.create(this.context).revokeAccess(new RevokeAccessRequest(arrayList, new Account(platformRevokeAccessRequest.getAccountEmail(), GoogleSignInPlugin.GOOGLE_ACCOUNT_TYPE), null)).addOnSuccessListener(new h(function1)).addOnFailureListener(new o(function1));
        }

        public void setActivity(@Nullable Activity activity) {
            this.activity = activity;
        }
    }

    @VisibleForTesting
    public interface GoogleIdCredentialConverter {
        @NonNull
        com.google.android.libraries.identity.googleid.d createFrom(@NonNull Credential credential);
    }

    private void attachToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.delegate);
        this.delegate.setActivity(activityPluginBinding.getActivity());
    }

    private void dispose() {
        this.delegate = null;
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger != null) {
            GoogleSignInApi.INSTANCE.setUp(binaryMessenger, null);
            this.messenger = null;
        }
    }

    private void disposeActivity() {
        this.activityPluginBinding.removeActivityResultListener(this.delegate);
        this.delegate.setActivity(null);
        this.activityPluginBinding = null;
    }

    private void initInstance(@NonNull BinaryMessenger binaryMessenger, @NonNull Context context) {
        initWithDelegate(binaryMessenger, new Delegate(context, new androidx.collection.e(), new androidx.collection.f(), new androidx.collection.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0807a lambda$initInstance$1(Context context) {
        C0875q.g(context);
        return new zbad(context, new q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.libraries.identity.googleid.d lambda$initInstance$2(Credential credential) {
        Uri uri;
        Object parcelable;
        Bundle data = credential.getData();
        com.google.android.libraries.identity.googleid.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
                uri = (Uri) parcelable;
            } else {
                uri = (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            Uri uri2 = uri;
            String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            return new com.google.android.libraries.identity.googleid.d(string, string2, string3, string4, string5, uri2, string6);
        } catch (Exception e) {
            throw new com.google.android.libraries.identity.googleid.e(e);
        }
    }

    @VisibleForTesting
    public void initWithDelegate(@NonNull BinaryMessenger binaryMessenger, @NonNull Delegate delegate) {
        this.messenger = binaryMessenger;
        this.delegate = delegate;
        GoogleSignInApi.INSTANCE.setUp(binaryMessenger, delegate);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        dispose();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }
}
