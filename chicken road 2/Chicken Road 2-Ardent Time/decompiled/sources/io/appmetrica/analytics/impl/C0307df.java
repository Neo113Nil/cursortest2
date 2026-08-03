package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307df implements io.appmetrica.analytics.impl.Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0643qf f5726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List<io.appmetrica.analytics.impl.C0281cf> f5727b;

    public C0307df(io.appmetrica.analytics.impl.C0643qf c0643qf, java.util.List<io.appmetrica.analytics.impl.C0281cf> list) {
        this.f5726a = c0643qf;
        this.f5727b = list;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final java.util.List<io.appmetrica.analytics.impl.C0281cf> a() {
        return this.f5727b;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final java.lang.Object b() {
        return this.f5726a;
    }

    public final io.appmetrica.analytics.impl.C0643qf c() {
        return this.f5726a;
    }

    public final java.lang.String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f5726a + ", candidates=" + this.f5727b + '}';
    }
}
