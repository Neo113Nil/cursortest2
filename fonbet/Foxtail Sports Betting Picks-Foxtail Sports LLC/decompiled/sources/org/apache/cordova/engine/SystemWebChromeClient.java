package org.apache.cordova.engine;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.cordova.CordovaDialogsHelper;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;

/* loaded from: classes2.dex */
public class SystemWebChromeClient extends WebChromeClient {
    private static final int FILECHOOSER_RESULTCODE = 5173;
    private static final String LOG_TAG = "SystemWebChromeClient";
    private long MAX_QUOTA = 104857600;
    private Context appContext;
    private CordovaDialogsHelper dialogsHelper;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private View mVideoProgressView;
    protected final SystemWebViewEngine parentEngine;

    public SystemWebChromeClient(SystemWebViewEngine systemWebViewEngine) {
        this.parentEngine = systemWebViewEngine;
        this.appContext = systemWebViewEngine.webView.getContext();
        this.dialogsHelper = new CordovaDialogsHelper(this.appContext);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        this.dialogsHelper.showAlert(str2, new CordovaDialogsHelper.Result() { // from class: org.apache.cordova.engine.SystemWebChromeClient.1
            @Override // org.apache.cordova.CordovaDialogsHelper.Result
            public void gotResult(boolean z, String str3) {
                JsResult jsResult2 = jsResult;
                if (z) {
                    jsResult2.confirm();
                } else {
                    jsResult2.cancel();
                }
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        this.dialogsHelper.showConfirm(str2, new CordovaDialogsHelper.Result() { // from class: org.apache.cordova.engine.SystemWebChromeClient.2
            @Override // org.apache.cordova.CordovaDialogsHelper.Result
            public void gotResult(boolean z, String str3) {
                JsResult jsResult2 = jsResult;
                if (z) {
                    jsResult2.confirm();
                } else {
                    jsResult2.cancel();
                }
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        String promptOnJsPrompt = this.parentEngine.bridge.promptOnJsPrompt(str, str2, str3);
        if (promptOnJsPrompt != null) {
            jsPromptResult.confirm(promptOnJsPrompt);
            return true;
        }
        this.dialogsHelper.showPrompt(str2, str3, new CordovaDialogsHelper.Result() { // from class: org.apache.cordova.engine.SystemWebChromeClient.3
            @Override // org.apache.cordova.CordovaDialogsHelper.Result
            public void gotResult(boolean z, String str4) {
                JsPromptResult jsPromptResult2 = jsPromptResult;
                if (z) {
                    jsPromptResult2.confirm(str4);
                } else {
                    jsPromptResult2.cancel();
                }
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        LOG.d(LOG_TAG, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3));
        quotaUpdater.updateQuota(this.MAX_QUOTA);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
        CordovaPlugin plugin = this.parentEngine.pluginManager.getPlugin("Geolocation");
        if (plugin == null || plugin.hasPermisssion()) {
            return;
        }
        plugin.requestPermissions(0);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.parentEngine.getCordovaWebView().showCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.parentEngine.getCordovaWebView().hideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        if (this.mVideoProgressView == null) {
            LinearLayout linearLayout = new LinearLayout(this.parentEngine.getView().getContext());
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            ProgressBar progressBar = new ProgressBar(this.parentEngine.getView().getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            progressBar.setLayoutParams(layoutParams2);
            linearLayout.addView(progressBar);
            this.mVideoProgressView = linearLayout;
        }
        return this.mVideoProgressView;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)|4|(1:6)|7|(2:9|(1:33)(9:13|14|16|17|18|(1:20)|21|22|23))|34|18|(0)|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        org.apache.cordova.LOG.w(org.apache.cordova.engine.SystemWebChromeClient.LOG_TAG, "No activity found to handle file chooser intent.", r10);
        r11.onReceiveValue(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intent;
        final Uri uri;
        Intent createIntent = fileChooserParams.createIntent();
        boolean z = false;
        if (fileChooserParams.getMode() == 1) {
            z = true;
        }
        createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes.length > 1) {
            createIntent.setType("*/*");
            createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
        }
        if (fileChooserParams.isCaptureEnabled()) {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            Context context = this.parentEngine.getView().getContext();
            if (context.getPackageManager().hasSystemFeature("android.hardware.camera.any") && intent.resolveActivity(context.getPackageManager()) != null) {
                try {
                    File createTempFile = createTempFile(context);
                    LOG.d(LOG_TAG, "Temporary photo capture file: " + createTempFile);
                    uri = createUriForFile(context, createTempFile);
                } catch (IOException e) {
                    e = e;
                    uri = null;
                }
                try {
                    LOG.d(LOG_TAG, "Temporary photo capture URI: " + uri);
                    intent.putExtra("output", uri);
                } catch (IOException e2) {
                    e = e2;
                    LOG.e(LOG_TAG, "Unable to create temporary file for photo capture", e);
                    intent = null;
                    Intent createChooser = Intent.createChooser(createIntent, null);
                    if (intent != null) {
                    }
                    LOG.i(LOG_TAG, "Starting intent for file chooser");
                    this.parentEngine.cordova.startActivityForResult(new CordovaPlugin() { // from class: org.apache.cordova.engine.SystemWebChromeClient.4
                        @Override // org.apache.cordova.CordovaPlugin
                        public void onActivityResult(int i, int i2, Intent intent2) {
                            Uri[] uriArr;
                            if (i2 == -1) {
                                ArrayList arrayList = new ArrayList();
                                if (intent2 != null && intent2.getData() != null) {
                                    LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (single): " + intent2.getData());
                                    arrayList.add(intent2.getData());
                                } else if (uri != null) {
                                    LOG.v(SystemWebChromeClient.LOG_TAG, "Adding camera capture: " + uri);
                                    arrayList.add(uri);
                                } else if (intent2 != null && intent2.getClipData() != null) {
                                    ClipData clipData = intent2.getClipData();
                                    int itemCount = clipData.getItemCount();
                                    for (int i3 = 0; i3 < itemCount; i3++) {
                                        Uri uri2 = clipData.getItemAt(i3).getUri();
                                        LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (multiple): " + uri2);
                                        if (uri2 != null) {
                                            arrayList.add(uri2);
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    LOG.d(SystemWebChromeClient.LOG_TAG, "Receive file chooser URL: " + arrayList.toString());
                                    uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                                    valueCallback.onReceiveValue(uriArr);
                                }
                            }
                            uriArr = null;
                            valueCallback.onReceiveValue(uriArr);
                        }
                    }, createChooser, FILECHOOSER_RESULTCODE);
                    return true;
                }
                Intent createChooser2 = Intent.createChooser(createIntent, null);
                if (intent != null) {
                    createChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                }
                LOG.i(LOG_TAG, "Starting intent for file chooser");
                this.parentEngine.cordova.startActivityForResult(new CordovaPlugin() { // from class: org.apache.cordova.engine.SystemWebChromeClient.4
                    @Override // org.apache.cordova.CordovaPlugin
                    public void onActivityResult(int i, int i2, Intent intent2) {
                        Uri[] uriArr;
                        if (i2 == -1) {
                            ArrayList arrayList = new ArrayList();
                            if (intent2 != null && intent2.getData() != null) {
                                LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (single): " + intent2.getData());
                                arrayList.add(intent2.getData());
                            } else if (uri != null) {
                                LOG.v(SystemWebChromeClient.LOG_TAG, "Adding camera capture: " + uri);
                                arrayList.add(uri);
                            } else if (intent2 != null && intent2.getClipData() != null) {
                                ClipData clipData = intent2.getClipData();
                                int itemCount = clipData.getItemCount();
                                for (int i3 = 0; i3 < itemCount; i3++) {
                                    Uri uri2 = clipData.getItemAt(i3).getUri();
                                    LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (multiple): " + uri2);
                                    if (uri2 != null) {
                                        arrayList.add(uri2);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                LOG.d(SystemWebChromeClient.LOG_TAG, "Receive file chooser URL: " + arrayList.toString());
                                uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                                valueCallback.onReceiveValue(uriArr);
                            }
                        }
                        uriArr = null;
                        valueCallback.onReceiveValue(uriArr);
                    }
                }, createChooser2, FILECHOOSER_RESULTCODE);
                return true;
            }
            LOG.w(LOG_TAG, "Device does not support photo capture");
        }
        intent = null;
        uri = null;
        Intent createChooser22 = Intent.createChooser(createIntent, null);
        if (intent != null) {
        }
        LOG.i(LOG_TAG, "Starting intent for file chooser");
        this.parentEngine.cordova.startActivityForResult(new CordovaPlugin() { // from class: org.apache.cordova.engine.SystemWebChromeClient.4
            @Override // org.apache.cordova.CordovaPlugin
            public void onActivityResult(int i, int i2, Intent intent2) {
                Uri[] uriArr;
                if (i2 == -1) {
                    ArrayList arrayList = new ArrayList();
                    if (intent2 != null && intent2.getData() != null) {
                        LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (single): " + intent2.getData());
                        arrayList.add(intent2.getData());
                    } else if (uri != null) {
                        LOG.v(SystemWebChromeClient.LOG_TAG, "Adding camera capture: " + uri);
                        arrayList.add(uri);
                    } else if (intent2 != null && intent2.getClipData() != null) {
                        ClipData clipData = intent2.getClipData();
                        int itemCount = clipData.getItemCount();
                        for (int i3 = 0; i3 < itemCount; i3++) {
                            Uri uri2 = clipData.getItemAt(i3).getUri();
                            LOG.v(SystemWebChromeClient.LOG_TAG, "Adding file (multiple): " + uri2);
                            if (uri2 != null) {
                                arrayList.add(uri2);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        LOG.d(SystemWebChromeClient.LOG_TAG, "Receive file chooser URL: " + arrayList.toString());
                        uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                        valueCallback.onReceiveValue(uriArr);
                    }
                }
                uriArr = null;
                valueCallback.onReceiveValue(uriArr);
            }
        }, createChooser22, FILECHOOSER_RESULTCODE);
        return true;
    }

    private File createTempFile(Context context) throws IOException {
        return File.createTempFile("temp", ".jpg", context.getCacheDir());
    }

    private Uri createUriForFile(Context context, File file) throws IOException {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".cdv.core.file.provider", file);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        LOG.d(LOG_TAG, "onPermissionRequest: " + Arrays.toString(permissionRequest.getResources()));
        permissionRequest.grant(permissionRequest.getResources());
    }

    public void destroyLastDialog() {
        this.dialogsHelper.destroyLastDialog();
    }
}
