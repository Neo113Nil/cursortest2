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
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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
        Activity activityZzi = zzcebVar.zzi();
        return activityZzi != null ? activityZzi : zzcebVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzceb)) {
            int i7 = J.f3546b;
            j.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        H2.j jVarZzL = ((zzceb) webView).zzL();
        if (jVarZzL != null) {
            jVarZzL.zzb();
        } else {
            int i8 = J.f3546b;
            j.g("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strG = k.g(k.l("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strG.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i7 = zzcdz.zza[consoleMessage.messageLevel().ordinal()];
        if (i7 == 1) {
            int i8 = J.f3546b;
            j.d(strG);
        } else if (i7 == 2) {
            int i9 = J.f3546b;
            j.g(strG);
        } else if (i7 == 3 || i7 == 4 || i7 != 5) {
            int i10 = J.f3546b;
            j.f(strG);
        } else {
            int i11 = J.f3546b;
            j.b(strG);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z4;
        if (callback != null) {
            zzceb zzcebVar = this.zza;
            o oVar = o.f1952C;
            P p5 = oVar.f1957c;
            if (P.b(zzcebVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z4 = true;
            } else {
                zzceb zzcebVar2 = this.zza;
                P p7 = oVar.f1957c;
                if (P.b(zzcebVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            zzbbp zzbbpVar = zzbby.zzne;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z4, true);
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zznf)).booleanValue()) {
                int i7 = J.f3546b;
                j.b("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        H2.j jVarZzL = this.zza.zzL();
        if (jVarZzL != null) {
            jVarZzL.zzg();
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
        H2.j jVarZzL = this.zza.zzL();
        if (jVarZzL == null) {
            int i8 = J.f3546b;
            j.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = jVarZzL.f3259a;
        FrameLayout frameLayout = new FrameLayout(activity);
        jVarZzL.f3265x = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        jVarZzL.f3265x.addView(view, -1, -1);
        activity.setContentView(jVarZzL.f3265x);
        jVarZzL.f3253H = true;
        jVarZzL.f3266y = customViewCallback;
        jVarZzL.f3264f = true;
        jVarZzL.Z(i7);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z4) {
        E2.b bVarZzd;
        try {
            zzceb zzcebVar = this.zza;
            if (zzcebVar != null && zzcebVar.zzN() != null && this.zza.zzN().zzd() != null && (bVarZzd = this.zza.zzN().zzd()) != null && !bVarZzd.b()) {
                bVarZzd.a("window." + str + "('" + str3 + "')");
                return false;
            }
            P p5 = o.f1952C.f1957c;
            AlertDialog.Builder builderJ = P.j(context);
            builderJ.setTitle(str2);
            if (z4) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderJ.setView(linearLayout).setPositiveButton(R.string.ok, new zzcdy(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcdx(jsPromptResult)).setOnCancelListener(new zzcdw(jsPromptResult)).create().show();
            } else {
                builderJ.setMessage(str3).setPositiveButton(R.string.ok, new zzcdv(jsResult)).setNegativeButton(R.string.cancel, new zzcdu(jsResult)).setOnCancelListener(new zzcdt(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e7) {
            int i7 = J.f3546b;
            j.h("Fail to display Dialog.", e7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
