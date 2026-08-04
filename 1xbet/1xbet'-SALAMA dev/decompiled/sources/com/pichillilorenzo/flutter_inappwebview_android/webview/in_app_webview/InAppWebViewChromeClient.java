package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import A5.u;
import B.v;
import G.h;
import G.l;
import Q3.o;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p058i.C0907d;
import p058i.C0909f;
import p058i.DialogInterfaceC0910g;
import p136t.e;
import p155w1.L;
import p164x5.b;

/* JADX INFO: loaded from: classes2.dex */
public class InAppWebViewChromeClient extends WebChromeClient implements u, ActivityResultListener {
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES = "*/*";
    final Map<DialogInterface, JsResult> dialogs = new HashMap();
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri imageOutputFileUri;
    private InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebView inAppWebView;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    private Uri videoOutputFileUri;

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, InAppWebView inAppWebView, InAppBrowserDelegate inAppBrowserDelegate) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.inAppWebView = inAppWebView;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().add(this);
        }
        b bVar = inAppWebViewFlutterPlugin.activityPluginBinding;
        if (bVar != null) {
            ((HashSet) ((o) bVar).f5824c).add(this);
        }
    }

    private Boolean acceptsAny(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return Boolean.TRUE;
        }
        for (String str : strArr) {
            if (str.equals("*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(RRWebVideoEvent.EVENT_TAG));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (str.matches("\\.\\w+")) {
                strArr2[i7] = getMimeTypeFromExtension(str.replace(".", ""));
            } else {
                strArr2[i7] = str;
            }
        }
        return strArr2;
    }

    private Activity getActivity() {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            return inAppBrowserDelegate.getActivity();
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            return inAppWebViewFlutterPlugin.activity;
        }
        return null;
    }

    private File getCapturedFile(String str) {
        String str2;
        String str3;
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            String str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            String str5 = Environment.DIRECTORY_MOVIES;
            str2 = RRWebVideoEvent.EVENT_TAG;
            str3 = ".mp4";
        } else {
            str2 = "";
            str3 = "";
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir(null));
    }

    private Uri getCapturedMediaFile() {
        Uri uri = this.imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return this.imageOutputFileUri;
        }
        Uri uri2 = this.videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return this.videoOutputFileUri;
    }

    private Intent getFileChooserIntent(String str) {
        String mimeTypeFromExtension = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File capturedFile;
        Activity activity;
        try {
            capturedFile = getCapturedFile(str);
        } catch (IOException e7) {
            Log.e(LOG_TAG, "Error occurred while creating the File", e7);
            capturedFile = null;
        }
        if (capturedFile == null || (activity = getActivity()) == null) {
            return null;
        }
        try {
            return l.getUriForFile(activity.getApplicationContext(), activity.getApplicationContext().getPackageName() + ".flutter_inappwebview_android.fileprovider", capturedFile);
        } catch (Exception e8) {
            Log.e(LOG_TAG, "", e8);
            return null;
        }
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        this.imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i7) {
        if (intent != null && intent.getData() != null) {
            if (i7 == -1) {
                return WebChromeClient.FileChooserParams.parseResult(i7, intent);
            }
            return null;
        }
        if (intent == null || intent.getClipData() == null) {
            Uri capturedMediaFile = getCapturedMediaFile();
            if (capturedMediaFile != null) {
                return new Uri[]{capturedMediaFile};
            }
            return null;
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i8 = 0; i8 < itemCount; i8++) {
            uriArr[i8] = intent.getClipData().getItemAt(i8).getUri();
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        this.videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z4 = true;
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0].length() != 0)) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    private boolean isFileNotEmpty(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, "r");
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            assetFileDescriptorOpenAssetFileDescriptor.close();
            return length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public void createAlertDialog(String str, final JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        v vVar = new v(activity, R.style.Theme_AppCompat_Dialog_Alert);
        C0907d c0907d = (C0907d) vVar.f966c;
        c0907d.f13667f = str;
        if (str3 == null || str3.isEmpty()) {
            c0907d.f13668g = c0907d.f13662a.getText(android.R.string.ok);
            c0907d.f13669h = onClickListener;
        } else {
            c0907d.f13668g = str3;
            c0907d.f13669h = onClickListener;
        }
        c0907d.f13671k = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        this.dialogs.put(dialogInterfaceC0910gE, jsResult);
        dialogInterfaceC0910gE.show();
    }

    public void createBeforeUnloadDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        v vVar = new v(activity, R.style.Theme_AppCompat_Dialog_Alert);
        C0907d c0907d = (C0907d) vVar.f966c;
        c0907d.f13667f = str;
        if (str3 == null || str3.isEmpty()) {
            c0907d.f13668g = c0907d.f13662a.getText(android.R.string.ok);
            c0907d.f13669h = onClickListener;
        } else {
            c0907d.f13668g = str3;
            c0907d.f13669h = onClickListener;
        }
        if (str4 == null || str4.isEmpty()) {
            c0907d.f13670i = c0907d.f13662a.getText(android.R.string.cancel);
            c0907d.j = onClickListener2;
        } else {
            c0907d.f13670i = str4;
            c0907d.j = onClickListener2;
        }
        c0907d.f13671k = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.15
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        this.dialogs.put(dialogInterfaceC0910gE, jsResult);
        dialogInterfaceC0910gE.show();
    }

    public void createConfirmDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        v vVar = new v(activity, R.style.Theme_AppCompat_Dialog_Alert);
        C0907d c0907d = (C0907d) vVar.f966c;
        c0907d.f13667f = str;
        if (str3 == null || str3.isEmpty()) {
            c0907d.f13668g = c0907d.f13662a.getText(android.R.string.ok);
            c0907d.f13669h = onClickListener;
        } else {
            c0907d.f13668g = str3;
            c0907d.f13669h = onClickListener;
        }
        if (str4 == null || str4.isEmpty()) {
            c0907d.f13670i = c0907d.f13662a.getText(android.R.string.cancel);
            c0907d.j = onClickListener2;
        } else {
            c0907d.f13670i = str4;
            c0907d.j = onClickListener2;
        }
        c0907d.f13671k = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.7
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        this.dialogs.put(dialogInterfaceC0910gE, jsResult);
        dialogInterfaceC0910gE.show();
    }

    public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                String string = editText.getText().toString();
                JsPromptResult jsPromptResult2 = jsPromptResult;
                String str8 = str5;
                if (str8 != null) {
                    string = str8;
                }
                jsPromptResult2.confirm(string);
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        v vVar = new v(activity, R.style.Theme_AppCompat_Dialog_Alert);
        C0907d c0907d = (C0907d) vVar.f966c;
        c0907d.f13667f = str;
        if (str7 == null || str7.isEmpty()) {
            c0907d.f13668g = c0907d.f13662a.getText(android.R.string.ok);
            c0907d.f13669h = onClickListener;
        } else {
            c0907d.f13668g = str7;
            c0907d.f13669h = onClickListener;
        }
        if (str6 == null || str6.isEmpty()) {
            c0907d.f13670i = c0907d.f13662a.getText(android.R.string.cancel);
            c0907d.j = onClickListener2;
        } else {
            c0907d.f13670i = str6;
            c0907d.j = onClickListener2;
        }
        c0907d.f13671k = new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.11
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        C0909f c0909f = dialogInterfaceC0910gE.f13710f;
        c0909f.f13689g = frameLayout;
        c0909f.f13690h = false;
        this.dialogs.put(dialogInterfaceC0910gE, jsPromptResult);
        dialogInterfaceC0910gE.show();
    }

    public void dispose() {
        b bVar;
        for (Map.Entry<DialogInterface, JsResult> entry : this.dialogs.entrySet()) {
            entry.getValue().cancel();
            entry.getKey().dismiss();
        }
        this.dialogs.clear();
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (bVar = inAppWebViewFlutterPlugin.activityPluginBinding) != null) {
            ((HashSet) ((o) bVar).f5824c).remove(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.filePathCallbackLegacy = null;
        this.filePathCallback = null;
        this.videoOutputFileUri = null;
        this.imageOutputFileUri = null;
        this.inAppWebView = null;
        this.plugin = null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        byte[] bArr;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (bArr = inAppWebView.customSettings.defaultVideoPoster) == null) {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public ViewGroup getRootView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(android.R.id.content);
    }

    public boolean needsCameraPermission() {
        Activity activity = getActivity();
        if (activity == null) {
            return true;
        }
        try {
            return Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") && h.checkSelfPermission(activity, "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // A5.u
    public boolean onActivityResult(int i7, int i8, Intent intent) {
        Uri data;
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return true;
        }
        if (i7 == 1) {
            Uri[] selectedFiles = i8 == -1 ? getSelectedFiles(intent, i8) : null;
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i7 == 3) {
            if (i8 == -1) {
                data = intent != null ? intent.getData() : getCapturedMediaFile();
            } else {
                data = null;
            }
            ValueCallback<Uri> valueCallback2 = this.filePathCallbackLegacy;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(data);
            }
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.imageOutputFileUri = null;
        this.videoOutputFileUri = null;
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null && (webViewChannelDelegate = inAppWebView.channelDelegate) != null) {
            webViewChannelDelegate.onCloseWindow();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null && (webViewChannelDelegate = inAppWebView.channelDelegate) != null) {
            webViewChannelDelegate.onConsoleMessage(consoleMessage.message(), consoleMessage.messageLevel().ordinal());
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z4, boolean z7, Message message) {
        final int i7;
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebViewManager inAppWebViewManager;
        String string;
        InAppWebViewManager inAppWebViewManager2;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (inAppWebViewManager2 = inAppWebViewFlutterPlugin.inAppWebViewManager) == null) {
            i7 = 0;
        } else {
            i7 = inAppWebViewManager2.windowAutoincrementId + 1;
            inAppWebViewManager2.windowAutoincrementId = i7;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            Message messageObtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(messageObtainMessage);
            Bundle data = messageObtainMessage.getData();
            if (data != null && (string = data.getString("url")) != null && !string.isEmpty()) {
                extra = string;
            }
        }
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", null, null), true, z7, false, i7, z4);
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
        if (inAppWebViewFlutterPlugin2 != null && (inAppWebViewManager = inAppWebViewFlutterPlugin2.inAppWebViewManager) != null) {
            inAppWebViewManager.windowWebViewMessages.put(Integer.valueOf(i7), message);
        }
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onCreateWindow(createWindowAction, new WebViewChannelDelegate.CreateWindowCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.16
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder sbD = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(sbD, str2, InAppWebViewChromeClient.LOG_TAG);
                defaultBehaviour((Boolean) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Boolean bool) {
                InAppWebViewManager inAppWebViewManager3;
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = InAppWebViewChromeClient.this.plugin;
                if (inAppWebViewFlutterPlugin3 == null || (inAppWebViewManager3 = inAppWebViewFlutterPlugin3.inAppWebViewManager) == null) {
                    return;
                }
                inAppWebViewManager3.windowWebViewMessages.remove(Integer.valueOf(i7));
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Boolean bool) {
                return !bool.booleanValue();
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return;
        }
        webViewChannelDelegate.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        WebViewChannelDelegate webViewChannelDelegate;
        WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.17
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str2, String str3, Object obj) {
                StringBuilder sbD = e.d(str2, ", ");
                if (str3 == null) {
                    str3 = "";
                }
                L.m(sbD, str3, InAppWebViewChromeClient.LOG_TAG);
                defaultBehaviour((GeolocationPermissionShowPromptResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(str, false, false);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(geolocationPermissionShowPromptResponse.getOrigin(), geolocationPermissionShowPromptResponse.isAllow(), geolocationPermissionShowPromptResponse.isRetain());
                return false;
            }
        };
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
        } else {
            webViewChannelDelegate.onGeolocationPermissionsShowPrompt(str, geolocationPermissionsShowPromptCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        ViewGroup rootView;
        Activity activity = getActivity();
        if (activity == null || (rootView = getRootView()) == null) {
            return;
        }
        View view = this.mCustomView;
        if (view != null) {
            ((FrameLayout) rootView).removeView(view);
        }
        this.mCustomView = null;
        rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
        activity.setRequestedOrientation(this.mOriginalOrientation);
        WebChromeClient.CustomViewCallback customViewCallback = this.mCustomViewCallback;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.mCustomViewCallback = null;
        activity.getWindow().clearFlags(512);
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onExitFullscreen();
            }
            this.inAppWebView.setInFullscreen(false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsAlert(str, str2, null, new WebViewChannelDelegate.JsAlertCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str3, String str4, Object obj) {
                StringBuilder sbD = e.d(str3, ", ");
                if (str4 == null) {
                    str4 = "";
                }
                L.m(sbD, str4, InAppWebViewChromeClient.LOG_TAG);
                jsResult.cancel();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(JsAlertResponse jsAlertResponse) {
                String message;
                String confirmButtonTitle;
                if (jsAlertResponse != null) {
                    message = jsAlertResponse.getMessage();
                    confirmButtonTitle = jsAlertResponse.getConfirmButtonTitle();
                } else {
                    message = null;
                    confirmButtonTitle = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(str2, jsResult, message, confirmButtonTitle);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(JsAlertResponse jsAlertResponse) {
                if (!jsAlertResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsAlertResponse.getAction();
                if ((action != null ? action.intValue() : 1) != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsBeforeUnload(str, str2, new WebViewChannelDelegate.JsBeforeUnloadCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.12
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str3, String str4, Object obj) {
                StringBuilder sbD = e.d(str3, ", ");
                if (str4 == null) {
                    str4 = "";
                }
                L.m(sbD, str4, InAppWebViewChromeClient.LOG_TAG);
                jsResult.cancel();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                String str3;
                String str4;
                String cancelButtonTitle;
                if (jsBeforeUnloadResponse != null) {
                    String message = jsBeforeUnloadResponse.getMessage();
                    String confirmButtonTitle = jsBeforeUnloadResponse.getConfirmButtonTitle();
                    cancelButtonTitle = jsBeforeUnloadResponse.getCancelButtonTitle();
                    str3 = message;
                    str4 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str4 = null;
                    cancelButtonTitle = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(str2, jsResult, str3, str4, cancelButtonTitle);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                if (!jsBeforeUnloadResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsBeforeUnloadResponse.getAction();
                if ((action != null ? action.intValue() : 1) != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsConfirm(str, str2, null, new WebViewChannelDelegate.JsConfirmCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.4
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str3, String str4, Object obj) {
                StringBuilder sbD = e.d(str3, ", ");
                if (str4 == null) {
                    str4 = "";
                }
                L.m(sbD, str4, InAppWebViewChromeClient.LOG_TAG);
                jsResult.cancel();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(JsConfirmResponse jsConfirmResponse) {
                String str3;
                String str4;
                String cancelButtonTitle;
                if (jsConfirmResponse != null) {
                    String message = jsConfirmResponse.getMessage();
                    String confirmButtonTitle = jsConfirmResponse.getConfirmButtonTitle();
                    cancelButtonTitle = jsConfirmResponse.getCancelButtonTitle();
                    str3 = message;
                    str4 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str4 = null;
                    cancelButtonTitle = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(str2, jsResult, str3, str4, cancelButtonTitle);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(JsConfirmResponse jsConfirmResponse) {
                if (!jsConfirmResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsConfirmResponse.getAction();
                if ((action != null ? action.intValue() : 1) != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(final WebView webView, String str, final String str2, final String str3, final JsPromptResult jsPromptResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsPrompt(str, str2, str3, null, new WebViewChannelDelegate.JsPromptCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.8
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str4, String str5, Object obj) {
                StringBuilder sbD = e.d(str4, ", ");
                if (str5 == null) {
                    str5 = "";
                }
                L.m(sbD, str5, InAppWebViewChromeClient.LOG_TAG);
                jsPromptResult.cancel();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(JsPromptResponse jsPromptResponse) {
                String str4;
                String str5;
                String str6;
                String cancelButtonTitle;
                String str7;
                if (jsPromptResponse != null) {
                    String message = jsPromptResponse.getMessage();
                    String defaultValue = jsPromptResponse.getDefaultValue();
                    String value = jsPromptResponse.getValue();
                    String confirmButtonTitle = jsPromptResponse.getConfirmButtonTitle();
                    cancelButtonTitle = jsPromptResponse.getCancelButtonTitle();
                    str4 = message;
                    str5 = defaultValue;
                    str6 = value;
                    str7 = confirmButtonTitle;
                } else {
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    cancelButtonTitle = null;
                    str7 = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(webView, str2, str3, jsPromptResult, str4, str5, str6, cancelButtonTitle, str7);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(JsPromptResponse jsPromptResponse) {
                if (!jsPromptResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsPromptResponse.getAction();
                if ((action != null ? action.intValue() : 1) != 0) {
                    jsPromptResult.cancel();
                    return false;
                }
                jsPromptResult.confirm(jsPromptResponse.getValue());
                return false;
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        WebViewChannelDelegate webViewChannelDelegate;
        WebViewChannelDelegate.PermissionRequestCallback permissionRequestCallback = new WebViewChannelDelegate.PermissionRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.18
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder sbD = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(sbD, str2, InAppWebViewChromeClient.LOG_TAG);
                defaultBehaviour((PermissionResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(PermissionResponse permissionResponse) {
                permissionRequest.deny();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(PermissionResponse permissionResponse) {
                Integer action = permissionResponse.getAction();
                if (action == null) {
                    return true;
                }
                if (action.intValue() != 1) {
                    permissionRequest.deny();
                    return false;
                }
                permissionRequest.grant((String[]) permissionResponse.getResources().toArray(new String[permissionResponse.getResources().size()]));
                return false;
            }
        };
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            permissionRequestCallback.defaultBehaviour(null);
        } else {
            webViewChannelDelegate.onPermissionRequest(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()), null, permissionRequestCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return;
        }
        webViewChannelDelegate.onPermissionRequestCanceled(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()));
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i7) {
        super.onProgressChanged(webView, i7);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeProgress(i7);
        }
        InAppWebView inAppWebView = (InAppWebView) webView;
        InAppWebViewClientCompat inAppWebViewClientCompat = inAppWebView.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.loadCustomJavaScriptOnPageStarted(webView);
        } else {
            InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
            if (inAppWebViewClient != null) {
                inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
            }
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onProgressChanged(i7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e7) {
            Log.e(LOG_TAG, "", e7);
        }
        bitmap.recycle();
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedIcon(byteArrayOutputStream.toByteArray());
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeTitle(str);
        }
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onTitleChanged(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z4) {
        super.onReceivedTouchIconUrl(webView, str, z4);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedTouchIconUrl(str, z4);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView == null || (webViewChannelDelegate = inAppWebView.channelDelegate) == null) {
            return;
        }
        webViewChannelDelegate.onRequestFocus();
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup rootView;
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        Activity activity = getActivity();
        if (activity == null || (rootView = getRootView()) == null) {
            return;
        }
        this.mCustomView = view;
        this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
        this.mOriginalOrientation = activity.getRequestedOrientation();
        this.mCustomViewCallback = customViewCallback;
        View view2 = this.mCustomView;
        if (view2 != null) {
            view2.setBackgroundColor(-16777216);
        }
        rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT);
        activity.getWindow().setFlags(512, 512);
        ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
        InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onEnterFullscreen();
            }
            this.inAppWebView.setInFullscreen(true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return startPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPickerIntent(valueCallback, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public void startPickerIntent(ValueCallback<Uri> valueCallback, String str, String str2) {
        Intent intentCreateChooser;
        this.filePathCallbackLegacy = valueCallback;
        boolean zBooleanValue = acceptsImages(str).booleanValue();
        boolean zBooleanValue2 = acceptsVideo(str).booleanValue();
        if (str2 == null || needsCameraPermission()) {
            intentCreateChooser = null;
        } else if (zBooleanValue) {
            intentCreateChooser = getPhotoIntent();
        } else if (zBooleanValue2) {
            intentCreateChooser = getVideoIntent();
        } else {
            intentCreateChooser = null;
        }
        if (intentCreateChooser == null) {
            intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), "");
            ArrayList arrayList = new ArrayList();
            if (!needsCameraPermission()) {
                if (zBooleanValue) {
                    arrayList.add(getPhotoIntent());
                }
                if (zBooleanValue2) {
                    arrayList.add(getVideoIntent());
                }
            }
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        }
        Activity activity = getActivity();
        if (activity == null || intentCreateChooser.resolveActivity(activity.getPackageManager()) == null) {
            Log.d(LOG_TAG, "there is no Activity to handle this Intent");
        } else {
            activity.startActivityForResult(intentCreateChooser, 3);
        }
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPickerIntent(valueCallback, "", null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPickerIntent(valueCallback, str, str2);
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), RRWebVideoEvent.EVENT_TAG).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z4) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z4);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public boolean startPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z4, boolean z7) {
        Intent videoIntent;
        this.filePathCallback = valueCallback;
        boolean zBooleanValue = acceptsImages(strArr).booleanValue();
        boolean zBooleanValue2 = acceptsVideo(strArr).booleanValue();
        if (!z7 || needsCameraPermission()) {
            videoIntent = null;
        } else if (zBooleanValue) {
            videoIntent = getPhotoIntent();
        } else if (zBooleanValue2) {
            videoIntent = getVideoIntent();
        } else {
            videoIntent = null;
        }
        if (videoIntent == null) {
            ArrayList arrayList = new ArrayList();
            if (!needsCameraPermission()) {
                if (zBooleanValue) {
                    arrayList.add(getPhotoIntent());
                }
                if (zBooleanValue2) {
                    arrayList.add(getVideoIntent());
                }
            }
            Intent fileChooserIntent = getFileChooserIntent(strArr, z4);
            Intent intent = new Intent("android.intent.action.CHOOSER");
            intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            videoIntent = intent;
        }
        Activity activity = getActivity();
        if (activity != null && videoIntent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(videoIntent, 1);
        } else {
            Log.d(LOG_TAG, "there is no Activity to handle this Intent");
        }
        return true;
    }
}
