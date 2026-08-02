package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Jx extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final int f10084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10085b;

    /* renamed from: c, reason: collision with root package name */
    public final Ix f10086c;

    public Jx(int i, int i5, Ix ix) {
        this.f10084a = i;
        this.f10085b = i5;
        this.f10086c = ix;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f10086c != Ix.f9646o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Jx)) {
            return false;
        }
        Jx jx = (Jx) obj;
        return jx.f10084a == this.f10084a && jx.f10085b == this.f10085b && jx.f10086c == this.f10086c;
    }

    public final int hashCode() {
        return Objects.hash(Jx.class, Integer.valueOf(this.f10084a), Integer.valueOf(this.f10085b), 16, this.f10086c);
    }

    public final String toString() {
        StringBuilder w5 = AbstractC0467k.w("AesEax Parameters (variant: ", String.valueOf(this.f10086c), ", ");
        w5.append(this.f10085b);
        w5.append("-byte IV, 16-byte tag, and ");
        return L1.a.o(w5, this.f10084a, "-byte key)");
    }
}
