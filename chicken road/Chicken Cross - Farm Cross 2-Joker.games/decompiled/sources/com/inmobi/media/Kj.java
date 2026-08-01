package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Kj extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final Y9 f6676a;
    public final Oj b;

    public Kj(Y9 y9, Oj oj) {
        this.f6676a = y9;
        this.b = oj;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        C3685ej c3685ej;
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.f6676a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + ServerSentEventKt.SPACE + webViewRenderProcess);
        }
        Oj oj = this.b;
        if (oj != null) {
            Map a2 = oj.a();
            a2.put("creativeId", oj.f6766a.g);
            int i = oj.e + 1;
            oj.e = i;
            a2.put("count", Integer.valueOf(i));
            String a3 = oj.a("RenderProcessResponsive");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        Y9 y92 = this.f6676a;
        if (y92 == null || (c3685ej = ((Z9) y92).f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        C3685ej c3685ej;
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.f6676a;
        if (y9 != null) {
            ((Z9) y9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + ServerSentEventKt.SPACE + webViewRenderProcess);
        }
        Oj oj = this.b;
        if (oj != null) {
            Map a2 = oj.a();
            a2.put("creativeId", oj.f6766a.g);
            int i = oj.d + 1;
            oj.d = i;
            a2.put("count", Integer.valueOf(i));
            String a3 = oj.a("RenderProcessUnResponsive");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        Y9 y92 = this.f6676a;
        if (y92 == null || (c3685ej = ((Z9) y92).f6988a) == null) {
            return;
        }
        c3685ej.a();
    }
}
