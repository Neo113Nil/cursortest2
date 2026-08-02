package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Sx extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final Dx f11603a;

    public Sx(Dx dx) {
        this.f11603a = dx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f11603a != Dx.f8426r;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Sx) && ((Sx) obj).f11603a == this.f11603a;
    }

    public final int hashCode() {
        return Objects.hash(Sx.class, this.f11603a);
    }

    public final String toString() {
        return L1.a.n("ChaCha20Poly1305 Parameters (variant: ", this.f11603a.f8430l, ")");
    }
}
