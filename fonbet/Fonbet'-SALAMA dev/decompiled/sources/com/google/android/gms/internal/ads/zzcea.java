package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import e1.k;

/* loaded from: classes.dex */
public final class zzcea extends WebChromeClient {
    private final zzceb zza;

    public zzcea(zzceb zzcebVar) {
        this.zza = zzcebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzceb)) {
            return webView.getContext();
        }
        zzceb zzcebVar = (zzceb) webView;
        Activity zzi = zzcebVar.zzi();
        return zzi != null ? zzi : zzcebVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzceb)) {
            int i7 = J.f3546b;
            j.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        H2.j zzL = ((zzceb) webView).zzL();
        if (zzL != null) {
            zzL.zzb();
        } else {
            int i8 = J.f3546b;
            j.g("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String g3 = k.g(k.l("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (g3.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i7 = zzcdz.zza[consoleMessage.messageLevel().ordinal()];
        if (i7 == 1) {
            int i8 = J.f3546b;
            j.d(g3);
        } else if (i7 == 2) {
            int i9 = J.f3546b;
            j.g(g3);
        } else if (i7 == 3 || i7 == 4) {
            int i10 = J.f3546b;
            j.f(g3);
        } else if (i7 != 5) {
            int i11 = J.f3546b;
            j.f(g3);
        } else {
            int i12 = J.f3546b;
            j.b(g3);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z7, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j3, long j7, WebStorage.QuotaUpdater quotaUpdater) {
        long j8 = 5242880 - j7;
        if (j8 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j3 > j8 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j8) + j, 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j, j8)) {
                j += j3;
            }
            j3 = j;
        }
        quotaUpdater.updateQuota(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z4;
        zzbbp zzbbpVar;
        C0254t c0254t;
        if (callback == null) {
            return;
        }
        zzceb zzcebVar = this.zza;
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        if (!P.b(zzcebVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            zzceb zzcebVar2 = this.zza;
            P p7 = oVar.f1957c;
            if (!P.b(zzcebVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z4 = false;
                zzbbpVar = zzbby.zzne;
                c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    callback.invoke(str, z4, true);
                } else {
                    callback.invoke(str, false, true);
                }
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zznf)).booleanValue()) {
                    return;
                }
                int i7 = J.f3546b;
                j.b("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                return;
            }
        }
        z4 = true;
        zzbbpVar = zzbby.zzne;
        c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zznf)).booleanValue()) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        H2.j zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzg();
        } else {
            int i7 = J.f3546b;
            j.g("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        H2.j zzL = this.zza.zzL();
        if (zzL == null) {
            int i8 = J.f3546b;
            j.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = zzL.f3259a;
        FrameLayout frameLayout = new FrameLayout(activity);
        zzL.f3265x = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        zzL.f3265x.addView(view, -1, -1);
        activity.setContentView(zzL.f3265x);
        zzL.f3253H = true;
        zzL.f3266y = customViewCallback;
        zzL.f3264f = true;
        zzL.Z(i7);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z4) {
        zzceb zzcebVar;
        E2.b zzd;
        try {
            zzcebVar = this.zza;
        } catch (WindowManager.BadTokenException e7) {
            int i7 = J.f3546b;
            j.h("Fail to display Dialog.", e7);
        }
        if (zzcebVar != null && zzcebVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.b()) {
            zzd.a("window." + str + "('" + str3 + "')");
            return false;
        }
        P p5 = o.f1952C.f1957c;
        AlertDialog.Builder j = P.j(context);
        j.setTitle(str2);
        if (z4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            j.setView(linearLayout).setPositiveButton(R.string.ok, new zzcdy(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcdx(jsPromptResult)).setOnCancelListener(new zzcdw(jsPromptResult)).create().show();
        } else {
            j.setMessage(str3).setPositiveButton(R.string.ok, new zzcdv(jsResult)).setNegativeButton(R.string.cancel, new zzcdu(jsResult)).setOnCancelListener(new zzcdt(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
