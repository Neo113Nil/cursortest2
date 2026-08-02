package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Qx extends AbstractC1628tx {

    /* renamed from: l, reason: collision with root package name */
    public final Sx f11290l;

    /* renamed from: m, reason: collision with root package name */
    public final Dp f11291m;

    /* renamed from: n, reason: collision with root package name */
    public final C1419pB f11292n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f11293o;

    public Qx(Sx sx, Dp dp, C1419pB c1419pB, Integer num) {
        this.f11290l = sx;
        this.f11291m = dp;
        this.f11292n = c1419pB;
        this.f11293o = num;
    }

    public static Qx o0(Dx dx, Dp dp, Integer num) {
        C1419pB b3;
        Dx dx2 = Dx.f8426r;
        String str = dx.f8430l;
        if (dx != dx2 && num == null) {
            throw new GeneralSecurityException(L1.a.n("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (dx == dx2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C1419pB c1419pB = (C1419pB) dp.f8377l;
        if (c1419pB.f14973a.length != 32) {
            throw new GeneralSecurityException(AbstractC2107A.q("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", c1419pB.f14973a.length));
        }
        Sx sx = new Sx(dx);
        if (dx == dx2) {
            b3 = Wy.f12132a;
        } else if (dx == Dx.f8425q) {
            b3 = Wy.a(num.intValue());
        } else {
            if (dx != Dx.f8424p) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b3 = Wy.b(num.intValue());
        }
        return new Qx(sx, dp, b3, num);
    }
}
