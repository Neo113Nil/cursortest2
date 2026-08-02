package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.oy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1405oy {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f14877a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f14878b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f14879c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f14880d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f14877a = new Zy(Mx.class, new C1225ky(4));
        f14878b = new Xy(b3, new C1225ky(5));
        f14879c = new Gy(Kx.class, new C1225ky(6));
        f14880d = new Ey(b3, new C1225ky(7));
    }

    public static C1091hx a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return C1091hx.f13824p;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C1091hx.f13826r;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return C1091hx.f13825q;
    }

    public static UA b(C1091hx c1091hx) {
        if (C1091hx.f13824p.equals(c1091hx)) {
            return UA.f11743m;
        }
        if (C1091hx.f13825q.equals(c1091hx)) {
            return UA.f11746p;
        }
        if (C1091hx.f13826r.equals(c1091hx)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1091hx)));
    }
}
