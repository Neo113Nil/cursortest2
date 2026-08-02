package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002fy extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final Dx f13532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13533b;

    public C1002fy(Dx dx, int i) {
        this.f13532a = dx;
        this.f13533b = i;
    }

    public static C1002fy b(Dx dx, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C1002fy(dx, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f13532a != Dx.f8428t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1002fy)) {
            return false;
        }
        C1002fy c1002fy = (C1002fy) obj;
        return c1002fy.f13532a == this.f13532a && c1002fy.f13533b == this.f13533b;
    }

    public final int hashCode() {
        return Objects.hash(C1002fy.class, this.f13532a, Integer.valueOf(this.f13533b));
    }

    public final String toString() {
        return L1.a.o(AbstractC0467k.w("X-AES-GCM Parameters (variant: ", this.f13532a.f8430l, "salt_size_bytes: "), this.f13533b, ")");
    }
}
