package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0909vf f7544a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0547hf> f7545b;

    public Cif(C0909vf c0909vf, List<C0547hf> list) {
        this.f7544a = c0909vf;
        this.f7545b = list;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C0547hf> a() {
        return this.f7545b;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f7544a;
    }

    public final C0909vf c() {
        return this.f7544a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f7544a + ", candidates=" + this.f7545b + '}';
    }
}
