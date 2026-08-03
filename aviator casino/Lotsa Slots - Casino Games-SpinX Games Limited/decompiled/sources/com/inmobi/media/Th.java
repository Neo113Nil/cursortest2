package com.inmobi.media;

/* loaded from: classes5.dex */
public class Th extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4979a;

    public Th(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f4979a = gestureDetectorOnGestureListenerC2675pi;
    }

    public static final void a(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void b(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void c(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final android.graphics.Bitmap getDefaultVideoPoster() {
        android.graphics.Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage cm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cm, "cm");
        java.lang.String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4979a.i;
        if (interfaceC2772t9 == null) {
            return true;
        }
        java.lang.String str2 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, final android.webkit.JsResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4979a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "jsAlert called with: " + message + url);
        }
        if (!this.f4979a.a(result)) {
            return true;
        }
        android.app.Activity fullScreenActivity = this.f4979a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new android.app.AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.inmobi.media.Th$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.inmobi.media.Th.a(result, dialogInterface, i);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView view, java.lang.String url, java.lang.String message, final android.webkit.JsResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4979a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "jsConfirm called with: " + message + url);
        }
        if (!this.f4979a.a(result)) {
            return true;
        }
        if (this.f4979a.getFullScreenActivity() != null) {
            new android.app.AlertDialog.Builder(this.f4979a.getFullScreenActivity()).setMessage(message).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.inmobi.media.Th$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.inmobi.media.Th.b(result, dialogInterface, i);
                }
            }).setNegativeButton(android.R.string.cancel, new android.content.DialogInterface.OnClickListener() { // from class: com.inmobi.media.Th$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.inmobi.media.Th.c(result, dialogInterface, i);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView view, java.lang.String url, java.lang.String message, java.lang.String defaultValue, android.webkit.JsPromptResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4979a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "jsPrompt called with: " + message + url);
        }
        if (!this.f4979a.a(result)) {
            return true;
        }
        if (this.f4979a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4979a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(str, "webview progress changed - " + i);
        }
        super.onProgressChanged(webView, i);
    }

    public static final void a(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str, android.content.DialogInterface dialogInterface, int i) {
        callback.invoke(str, true, false);
    }

    public static final void b(android.webkit.GeolocationPermissions.Callback callback, java.lang.String str, android.content.DialogInterface dialogInterface, int i) {
        callback.invoke(str, false, false);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final java.lang.String origin, final android.webkit.GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f4979a.u.get() != null) {
            new android.app.AlertDialog.Builder((android.content.Context) this.f4979a.u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.inmobi.media.Th$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.inmobi.media.Th.a(callback, origin, dialogInterface, i);
                }
            }).setNegativeButton(android.R.string.cancel, new android.content.DialogInterface.OnClickListener() { // from class: com.inmobi.media.Th$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.inmobi.media.Th.b(callback, origin, dialogInterface, i);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }
}
