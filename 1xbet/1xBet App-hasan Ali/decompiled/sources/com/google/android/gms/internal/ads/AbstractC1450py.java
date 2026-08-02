package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1450py {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f15064a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f15065b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f15066c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f15067d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f15064a = new Zy(Px.class, new C1225ky(8));
        f15065b = new Xy(b3, new C1225ky(9));
        f15066c = new Gy(Nx.class, new C1225ky(10));
        f15067d = new Ey(b3, new C1225ky(11));
    }

    public static Cx a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Cx.f8119r;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Cx.f8121t;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return Cx.f8120s;
    }

    public static UA b(Cx cx) {
        if (Cx.f8119r.equals(cx)) {
            return UA.f11743m;
        }
        if (Cx.f8120s.equals(cx)) {
            return UA.f11746p;
        }
        if (Cx.f8121t.equals(cx)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(cx)));
    }
}
