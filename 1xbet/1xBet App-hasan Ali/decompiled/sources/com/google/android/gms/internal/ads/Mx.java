package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Mx extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final int f10753a;

    /* renamed from: b, reason: collision with root package name */
    public final C1091hx f10754b;

    public Mx(int i, C1091hx c1091hx) {
        this.f10753a = i;
        this.f10754b = c1091hx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f10754b != C1091hx.f13826r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mx)) {
            return false;
        }
        Mx mx = (Mx) obj;
        return mx.f10753a == this.f10753a && mx.f10754b == this.f10754b;
    }

    public final int hashCode() {
        return Objects.hash(Mx.class, Integer.valueOf(this.f10753a), 12, 16, this.f10754b);
    }

    public final String toString() {
        return L1.a.o(AbstractC0467k.w("AesGcm Parameters (variant: ", String.valueOf(this.f10754b), ", 12-byte IV, 16-byte tag, and "), this.f10753a, "-byte key)");
    }
}
