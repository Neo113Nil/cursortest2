package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.app.AlertDialog;
import android.webkit.WebView;
import d2.AbstractC1914b;
import e2.AbstractC1933n;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: com.google.android.gms.internal.ads.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813bn extends TimerTask {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12907k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Timer f12908l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12909m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12910n;

    public C0813bn(C0375o c0375o, Mt mt, Timer timer) {
        this.f12910n = mt;
        this.f12908l = timer;
        this.f12909m = c0375o;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer = this.f12908l;
        Object obj = this.f12910n;
        Object obj2 = this.f12909m;
        switch (this.f12907k) {
            case 0:
                ((AlertDialog) obj2).dismiss();
                timer.cancel();
                S2.d dVar = (S2.d) obj;
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            default:
                C0375o c0375o = (C0375o) obj2;
                c0375o.getClass();
                int i = AbstractC1914b.f16884a;
                if (!AbstractC1933n.f16915d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebViewProviderBoundaryInterface) AbstractC1914b.b((WebView) c0375o.f5043m).f16910l).removeWebMessageListener("omidJsSessionService");
                C0733Ze c0733Ze = (C0733Ze) ((Mt) obj).f10741l;
                T2.H h3 = T2.L.f5672l;
                ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC0805bf);
                h3.post(new RunnableC0726Ye(viewTreeObserverOnGlobalLayoutListenerC0805bf, 0));
                timer.cancel();
                return;
        }
    }

    public C0813bn(AlertDialog alertDialog, Timer timer, S2.d dVar) {
        this.f12909m = alertDialog;
        this.f12908l = timer;
        this.f12910n = dVar;
    }
}
