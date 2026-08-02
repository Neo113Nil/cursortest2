package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1900zz extends Bz {

    /* renamed from: a, reason: collision with root package name */
    public final int f16798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16799b;

    /* renamed from: c, reason: collision with root package name */
    public final C1855yz f16800c;

    /* renamed from: d, reason: collision with root package name */
    public final C1810xz f16801d;

    public C1900zz(int i, int i5, C1855yz c1855yz, C1810xz c1810xz) {
        this.f16798a = i;
        this.f16799b = i5;
        this.f16800c = c1855yz;
        this.f16801d = c1810xz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f16800c != C1855yz.f16517e;
    }

    public final int b() {
        C1855yz c1855yz = C1855yz.f16517e;
        int i = this.f16799b;
        C1855yz c1855yz2 = this.f16800c;
        if (c1855yz2 == c1855yz) {
            return i;
        }
        if (c1855yz2 == C1855yz.f16514b || c1855yz2 == C1855yz.f16515c || c1855yz2 == C1855yz.f16516d) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1900zz)) {
            return false;
        }
        C1900zz c1900zz = (C1900zz) obj;
        return c1900zz.f16798a == this.f16798a && c1900zz.b() == b() && c1900zz.f16800c == this.f16800c && c1900zz.f16801d == this.f16801d;
    }

    public final int hashCode() {
        return Objects.hash(C1900zz.class, Integer.valueOf(this.f16798a), Integer.valueOf(this.f16799b), this.f16800c, this.f16801d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16800c);
        String valueOf2 = String.valueOf(this.f16801d);
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(this.f16799b);
        sb.append("-byte tags, and ");
        return L1.a.o(sb, this.f16798a, "-byte key)");
    }
}
