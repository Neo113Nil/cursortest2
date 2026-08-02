package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135iy extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final Ix f14022a;

    public C1135iy(Ix ix) {
        this.f14022a = ix;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f14022a != Ix.f9651t;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1135iy) && ((C1135iy) obj).f14022a == this.f14022a;
    }

    public final int hashCode() {
        return Objects.hash(C1135iy.class, this.f14022a);
    }

    public final String toString() {
        return L1.a.n("XChaCha20Poly1305 Parameters (variant: ", this.f14022a.f9653l, ")");
    }
}
