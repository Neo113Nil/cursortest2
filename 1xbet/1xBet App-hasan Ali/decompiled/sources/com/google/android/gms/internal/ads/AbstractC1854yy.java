package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.yy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1854yy {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f16510a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f16511b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f16512c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f16513d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f16510a = new Zy(C1002fy.class, new C1225ky(16));
        f16511b = new Xy(b3, new C1225ky(17));
        f16512c = new Gy(C0957ey.class, new C1225ky(18));
        f16513d = new Ey(b3, new C1225ky(19));
    }

    public static Dx a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Dx.f8427s;
        }
        if (ordinal == 3) {
            return Dx.f8428t;
        }
        throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
    }

    public static UA b(Dx dx) {
        if (dx.equals(Dx.f8427s)) {
            return UA.f11743m;
        }
        if (dx.equals(Dx.f8428t)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dx.f8430l));
    }
}
