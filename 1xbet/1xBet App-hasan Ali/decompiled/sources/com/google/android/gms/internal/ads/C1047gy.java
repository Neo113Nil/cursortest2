package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.gy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047gy extends AbstractC1628tx {

    /* renamed from: l, reason: collision with root package name */
    public final C1135iy f13682l;

    /* renamed from: m, reason: collision with root package name */
    public final Dp f13683m;

    /* renamed from: n, reason: collision with root package name */
    public final C1419pB f13684n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f13685o;

    public C1047gy(C1135iy c1135iy, Dp dp, C1419pB c1419pB, Integer num) {
        this.f13682l = c1135iy;
        this.f13683m = dp;
        this.f13684n = c1419pB;
        this.f13685o = num;
    }

    public static C1047gy o0(Ix ix, Dp dp, Integer num) {
        C1419pB b3;
        Ix ix2 = Ix.f9651t;
        String str = ix.f9653l;
        if (ix != ix2 && num == null) {
            throw new GeneralSecurityException(L1.a.n("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ix == ix2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C1419pB c1419pB = (C1419pB) dp.f8377l;
        if (c1419pB.f14973a.length != 32) {
            throw new GeneralSecurityException(AbstractC2107A.q("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", c1419pB.f14973a.length));
        }
        C1135iy c1135iy = new C1135iy(ix);
        if (ix == ix2) {
            b3 = Wy.f12132a;
        } else if (ix == Ix.f9650s) {
            b3 = Wy.a(num.intValue());
        } else {
            if (ix != Ix.f9649r) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b3 = Wy.b(num.intValue());
        }
        return new C1047gy(c1135iy, dp, b3, num);
    }
}
