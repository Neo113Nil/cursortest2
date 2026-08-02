package F60;

import Sc.r;
import T7.Z;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class f {
    public static final Object a(Function1 function1, FintechWebView fintechWebView, @NotNull String str, @NotNull String str2, String str3, @NotNull j frame) {
        WebView webView;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        String url = (fintechWebView == null || (webView = fintechWebView.getWebView()) == null) ? null : webView.getUrl();
        if (url == null) {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(Boolean.FALSE);
        } else if (function1 == null || !((Boolean) function1.invoke(url)).booleanValue()) {
            r.Companion companion2 = r.INSTANCE;
            c10737n.resumeWith(Boolean.FALSE);
        } else {
            String function = Sh.b.c("window.web_bridge.", str, ".", str2);
            final d callback = new d(function, str3, fintechWebView, c10737n);
            Intrinsics.checkNotNullParameter(function, "function");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (fintechWebView == null) {
                callback.invoke(Boolean.FALSE);
            } else {
                int i11 = 0;
                String str4 = "";
                String str5 = "";
                for (Object obj : h.m(function, new String[]{"."}, 0, 6)) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    String str6 = (String) obj;
                    if (i11 != 0) {
                        str6 = Nk.a.b(".", str6);
                    }
                    str5 = ((Object) str5) + str6;
                    str4 = ((Object) str4) + (i11 == 0 ? str5 : " && " + ((Object) str5));
                    i11 = i12;
                }
                fintechWebView.evaluateJavascript("Boolean(" + ((Object) str4) + ")", new ValueCallback() { // from class: F60.b
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        Function1.this.invoke(Boolean.valueOf(Boolean.parseBoolean((String) obj2)));
                    }
                });
            }
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final Object b(Function1 function1, FintechWebView fintechWebView, @NotNull String str, String str2, @NotNull j frame) {
        WebView webView;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        String url = (fintechWebView == null || (webView = fintechWebView.getWebView()) == null) ? null : webView.getUrl();
        if (url == null) {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(Boolean.FALSE);
        } else if (function1 != null && ((Boolean) function1.invoke(url)).booleanValue()) {
            String concat = "window.web_bridge.navigation.".concat(str);
            if (str2 == null) {
                str2 = "";
            }
            String a11 = Z.a(concat, "(", str2, ")");
            if (fintechWebView != null) {
                fintechWebView.evaluateJavascript(a11, new e(c10737n));
            } else {
                r.Companion companion2 = r.INSTANCE;
                c10737n.resumeWith(Boolean.FALSE);
            }
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
