package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930eF {

    /* renamed from: d, reason: collision with root package name */
    public static final C0930eF f13241d = new J2.s().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13242a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13243b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13244c;

    public /* synthetic */ C0930eF(J2.s sVar) {
        this.f13242a = sVar.f2729a;
        this.f13243b = sVar.f2730b;
        this.f13244c = sVar.f2731c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0930eF.class != obj.getClass()) {
            return false;
        }
        C0930eF c0930eF = (C0930eF) obj;
        return this.f13242a == c0930eF.f13242a && this.f13243b == c0930eF.f13243b && this.f13244c == c0930eF.f13244c;
    }

    public final int hashCode() {
        int i = (this.f13242a ? 1 : 0) << 2;
        boolean z3 = this.f13243b;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + i + (this.f13244c ? 1 : 0);
    }
}
