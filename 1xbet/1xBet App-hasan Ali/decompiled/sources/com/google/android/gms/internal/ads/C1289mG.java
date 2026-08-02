package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289mG extends AbstractC1111iG {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f14491e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f14492c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14493d;

    public C1289mG(AbstractC0715Xa abstractC0715Xa, Object obj, Object obj2) {
        super(abstractC0715Xa);
        this.f14492c = obj;
        this.f14493d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int a(Object obj) {
        Object obj2;
        if (f14491e.equals(obj) && (obj2 = this.f14493d) != null) {
            obj = obj2;
        }
        return this.f13928b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C1785xa d(int i, C1785xa c1785xa, boolean z3) {
        this.f13928b.d(i, c1785xa, z3);
        if (Objects.equals(c1785xa.f16289b, this.f14493d) && z3) {
            c1785xa.f16289b = f14491e;
        }
        return c1785xa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C0603Ha e(int i, C0603Ha c0603Ha, long j5) {
        this.f13928b.e(i, c0603Ha, j5);
        if (Objects.equals(c0603Ha.f9397a, this.f14492c)) {
            c0603Ha.f9397a = C0603Ha.f9395m;
        }
        return c0603Ha;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public final Object f(int i) {
        Object f = this.f13928b.f(i);
        return Objects.equals(f, this.f14493d) ? f14491e : f;
    }
}
