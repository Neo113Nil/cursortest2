package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Zx extends AbstractC1628tx {

    /* renamed from: l, reason: collision with root package name */
    public final C0779ay f12545l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f12546m;

    public Zx(C0779ay c0779ay, C1419pB c1419pB, Integer num) {
        this.f12545l = c0779ay;
        this.f12546m = num;
    }

    public static Zx o0(C0779ay c0779ay, Integer num) {
        C1419pB b3;
        Cx cx = c0779ay.f12736a;
        if (cx == Cx.f8123v) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b3 = Wy.f12132a;
        } else {
            if (cx != Cx.f8122u) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(cx)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b3 = Wy.b(num.intValue());
        }
        return new Zx(c0779ay, b3, num);
    }
}
