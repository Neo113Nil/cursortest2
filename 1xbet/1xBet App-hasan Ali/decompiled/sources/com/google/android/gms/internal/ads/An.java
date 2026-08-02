package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class An implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final C0594Ff f7713a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7714b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f7715c;

    /* renamed from: d, reason: collision with root package name */
    public final Wq f7716d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f7717e;
    public final InterfaceC1311mu f;

    /* renamed from: g, reason: collision with root package name */
    public final C1392ol f7718g;

    public An(C0594Ff c0594Ff, Context context, Executor executor, Wk wk, Wq wq, InterfaceC1311mu interfaceC1311mu, C1392ol c1392ol) {
        this.f7714b = context;
        this.f7713a = c0594Ff;
        this.f7717e = executor;
        this.f7715c = wk;
        this.f7716d = wq;
        this.f = interfaceC1311mu;
        this.f7718g = c1392ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        Pq pq = lq.f10523s;
        return (pq == null || pq.f11126a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        return AbstractC1400ot.j0(Mw.f10750l, new C1030gh(this, sq, lq, 3), this.f7717e);
    }
}
