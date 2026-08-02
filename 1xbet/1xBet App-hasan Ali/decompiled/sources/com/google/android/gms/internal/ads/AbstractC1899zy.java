package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.zy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1899zy {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f16794a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f16795b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f16796c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f16797d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f16794a = new Zy(C1135iy.class, new C1225ky(20));
        f16795b = new Xy(b3, new C1225ky(21));
        f16796c = new Gy(C1047gy.class, new C1225ky(22));
        f16797d = new Ey(b3, new C1225ky(23));
    }

    public static Ix a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Ix.f9649r;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Ix.f9651t;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return Ix.f9650s;
    }

    public static UA b(Ix ix) {
        if (Ix.f9649r.equals(ix)) {
            return UA.f11743m;
        }
        if (Ix.f9650s.equals(ix)) {
            return UA.f11746p;
        }
        if (Ix.f9651t.equals(ix)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ix.f9653l));
    }
}
