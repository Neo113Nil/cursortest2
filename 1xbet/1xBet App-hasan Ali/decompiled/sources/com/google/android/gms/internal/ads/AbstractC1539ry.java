package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1539ry {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f15395a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f15396b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f15397c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f15398d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f15395a = new Zy(Sx.class, new C1225ky(12));
        f15396b = new Xy(b3, new C1225ky(13));
        f15397c = new Gy(Qx.class, new C1225ky(14));
        f15398d = new Ey(b3, new C1225ky(15));
    }

    public static Dx a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Dx.f8424p;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Dx.f8426r;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return Dx.f8425q;
    }

    public static UA b(Dx dx) {
        if (Dx.f8424p.equals(dx)) {
            return UA.f11743m;
        }
        if (Dx.f8425q.equals(dx)) {
            return UA.f11746p;
        }
        if (Dx.f8426r.equals(dx)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dx.f8430l));
    }
}
