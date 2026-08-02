package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670Qe extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C0733Ze f11206a;

    public C0670Qe(C0733Ze c0733Ze) {
        this.f11206a = c0733Ze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC0677Re)) {
            return webView.getContext();
        }
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) webView;
        Activity e3 = interfaceC0677Re.e();
        return e3 != null ? e3 : interfaceC0677Re.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z3) {
        P2.a aVar;
        C0733Ze c0733Ze = this.f11206a;
        if (c0733Ze != null) {
            try {
                C1028gf c1028gf = c0733Ze.f12501k.f12894x;
                if (c1028gf != null && (aVar = c1028gf.f13604G) != null && aVar != null && !aVar.b()) {
                    aVar.a("window." + str + "('" + str3 + "')");
                    return false;
                }
            } catch (WindowManager.BadTokenException e3) {
                U2.j.j("Fail to display Dialog.", e3);
                return true;
            }
        }
        T2.L l5 = P2.o.f4767B.f4771c;
        AlertDialog.Builder j5 = T2.L.j(context);
        j5.setTitle(str2);
        if (!z3) {
            j5.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0656Oe(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0656Oe(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0649Ne(0, jsResult)).create().show();
            return true;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str3);
        EditText editText = new EditText(context);
        editText.setText(str4);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        j5.setView(linearLayout).setPositiveButton(R.string.ok, new Zm(2, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0550Ab(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0649Ne(1, jsPromptResult)).create().show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC0677Re)) {
            U2.j.i("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        S2.d V4 = ((InterfaceC0677Re) webView).V();
        if (V4 == null) {
            U2.j.i("Tried to close an AdWebView not associated with an overlay.");
        } else {
            V4.a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        String o5 = L1.a.o(sb, lineNumber, ")");
        if (o5.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC0663Pe.f11084a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            U2.j.f(o5);
        } else if (i == 2) {
            U2.j.i(o5);
        } else if (i == 3 || i == 4) {
            U2.j.h(o5);
        } else if (i != 5) {
            U2.j.h(o5);
        } else {
            U2.j.d(o5);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z5, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        C1028gf c1028gf = this.f11206a.f12501k.f12894x;
        if (c1028gf != null) {
            webView2.setWebViewClient(c1028gf);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j5, long j6, long j7, WebStorage.QuotaUpdater quotaUpdater) {
        long j8 = 5242880 - j7;
        if (j8 <= 0) {
            quotaUpdater.updateQuota(j5);
            return;
        }
        if (j5 == 0) {
            if (j6 > j8 || j6 > 1048576) {
                j6 = 0;
            }
        } else if (j6 == 0) {
            j6 = Math.min(Math.min(131072L, j8) + j5, 1048576L);
        } else {
            if (j6 <= Math.min(1048576 - j5, j8)) {
                j5 += j6;
            }
            j6 = j5;
        }
        quotaUpdater.updateQuota(j6);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            T2.L l5 = P2.o.f4767B.f4771c;
            C0733Ze c0733Ze = this.f11206a;
            callback.invoke(str, T2.L.b(c0733Ze.getContext(), "android.permission.ACCESS_FINE_LOCATION") || T2.L.b(c0733Ze.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        S2.d V4 = this.f11206a.f12501k.V();
        if (V4 == null) {
            U2.j.i("Could not get ad overlay when hiding custom view.");
        } else {
            V4.f();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        S2.d V4 = this.f11206a.f12501k.V();
        if (V4 == null) {
            U2.j.i("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = V4.f5298l;
        FrameLayout frameLayout = new FrameLayout(activity);
        V4.f5304r = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        V4.f5304r.addView(view, -1, -1);
        activity.setContentView(V4.f5304r);
        V4.f5291B = true;
        V4.f5305s = customViewCallback;
        V4.f5303q = true;
        V4.u3(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
