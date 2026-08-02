package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableFutureC0823bx extends Gw implements RunnableFuture {

    /* renamed from: r, reason: collision with root package name */
    public volatile Ow f12927r;

    public RunnableFutureC0823bx(Callable callable) {
        this.f12927r = new C0778ax(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        Ow ow = this.f12927r;
        return ow != null ? L1.a.n("task=[", ow.toString(), "]") : super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void e() {
        Ow ow;
        if (m() && (ow = this.f12927r) != null) {
            ow.g();
        }
        this.f12927r = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Ow ow = this.f12927r;
        if (ow != null) {
            ow.run();
        }
        this.f12927r = null;
    }
}
