package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.my, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1315my {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f14553a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f14554b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f14555c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f14556d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f14553a = new Zy(Jx.class, new C1225ky(0));
        f14554b = new Xy(b3, new C1225ky(1));
        f14555c = new Gy(Gx.class, new C1225ky(2));
        f14556d = new Ey(b3, new C1225ky(3));
    }

    public static Ix a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Ix.f9644m;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Ix.f9646o;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return Ix.f9645n;
    }

    public static UA b(Ix ix) {
        if (Ix.f9644m.equals(ix)) {
            return UA.f11743m;
        }
        if (Ix.f9645n.equals(ix)) {
            return UA.f11746p;
        }
        if (Ix.f9646o.equals(ix)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ix)));
    }
}
