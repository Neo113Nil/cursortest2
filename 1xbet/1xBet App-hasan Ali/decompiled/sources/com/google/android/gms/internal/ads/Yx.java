package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class Yx {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f12379a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f12380b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f12381c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f12382d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f12379a = new Zy(Xx.class, new Aq(16, (byte) 0));
        f12380b = new Xy(b3, new Aq(17, (byte) 0));
        f12381c = new Gy(Wx.class, new Aq(18, (byte) 0));
        f12382d = new Ey(b3, new Aq(19, (byte) 0));
    }

    public static Ix a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Ix.f9647p;
        }
        if (ordinal == 3) {
            return Ix.f9648q;
        }
        throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
    }

    public static UA b(Ix ix) {
        if (Ix.f9647p.equals(ix)) {
            return UA.f11743m;
        }
        if (Ix.f9648q.equals(ix)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ix.f9653l));
    }
}
