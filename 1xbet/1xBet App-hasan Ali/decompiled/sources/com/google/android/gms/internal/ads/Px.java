package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Px extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final int f11136a;

    /* renamed from: b, reason: collision with root package name */
    public final Cx f11137b;

    public Px(int i, Cx cx) {
        this.f11136a = i;
        this.f11137b = cx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f11137b != Cx.f8121t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Px)) {
            return false;
        }
        Px px = (Px) obj;
        return px.f11136a == this.f11136a && px.f11137b == this.f11137b;
    }

    public final int hashCode() {
        return Objects.hash(Px.class, Integer.valueOf(this.f11136a), this.f11137b);
    }

    public final String toString() {
        return L1.a.o(AbstractC0467k.w("AesGcmSiv Parameters (variant: ", String.valueOf(this.f11137b), ", "), this.f11136a, "-byte key)");
    }
}
