package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C1058vf f8455a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0696hf> f8456b;

    public Cif(C1058vf c1058vf, List<C0696hf> list) {
        this.f8455a = c1058vf;
        this.f8456b = list;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C0696hf> a() {
        return this.f8456b;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f8455a;
    }

    public final C1058vf c() {
        return this.f8455a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f8455a + ", candidates=" + this.f8456b + '}';
    }
}
