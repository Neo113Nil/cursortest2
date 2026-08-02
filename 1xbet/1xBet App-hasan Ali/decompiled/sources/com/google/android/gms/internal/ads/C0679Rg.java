package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679Rg extends AbstractC0579Dg {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1059h9 f11442j;

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC1362o f11443k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f11444l;

    public C0679Rg(G7 g7, InterfaceC1059h9 interfaceC1059h9, RunnableC1362o runnableC1362o, Executor executor) {
        super(g7);
        this.f11442j = interfaceC1059h9;
        this.f11443k = runnableC1362o;
        this.f11444l = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0762ah
    public final void a() {
        this.f11444l.execute(new Kw(20, this, new K4(21, new AtomicReference(this.f11443k))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final int b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final View d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final InterfaceC0391w0 e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final Mq f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final Mq g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final void i(FrameLayout frameLayout, Q2.a1 a1Var) {
    }
}
