package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.ey, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957ey extends AbstractC1628tx {

    /* renamed from: l, reason: collision with root package name */
    public final C1002fy f13384l;

    /* renamed from: m, reason: collision with root package name */
    public final Dp f13385m;

    /* renamed from: n, reason: collision with root package name */
    public final C1419pB f13386n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f13387o;

    public C0957ey(C1002fy c1002fy, Dp dp, C1419pB c1419pB, Integer num) {
        this.f13384l = c1002fy;
        this.f13385m = dp;
        this.f13386n = c1419pB;
        this.f13387o = num;
    }

    public static C0957ey o0(C1002fy c1002fy, Dp dp, Integer num) {
        C1419pB b3;
        Dx dx = c1002fy.f13532a;
        Dx dx2 = Dx.f8428t;
        String str = dx.f8430l;
        if (dx != dx2 && num == null) {
            throw new GeneralSecurityException(L1.a.n("For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (dx == dx2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C1419pB c1419pB = (C1419pB) dp.f8377l;
        if (c1419pB.f14973a.length != 32) {
            throw new GeneralSecurityException(AbstractC2107A.q("XAesGcmKey key must be constructed with key of length 32 bytes, not ", c1419pB.f14973a.length));
        }
        if (dx == dx2) {
            b3 = Wy.f12132a;
        } else {
            if (dx != Dx.f8427s) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b3 = Wy.b(num.intValue());
        }
        return new C0957ey(c1002fy, dp, b3, num);
    }
}
