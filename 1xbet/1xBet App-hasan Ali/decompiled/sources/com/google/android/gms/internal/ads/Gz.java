package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class Gz {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f9292a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f9293b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f9294c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f9295d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f9292a = new Zy(C1630tz.class, new Fz(0));
        f9293b = new Xy(b3, new Fz(1));
        f9294c = new Gy(C1496qz.class, new Fz(2));
        f9295d = new Ey(b3, new Fz(3));
    }

    public static C1091hx a(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return C1091hx.f13833y;
        }
        if (ordinal == 2) {
            return C1091hx.f13819A;
        }
        if (ordinal == 3) {
            return C1091hx.f13820B;
        }
        if (ordinal == 4) {
            return C1091hx.f13834z;
        }
        throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
    }

    public static UA b(C1091hx c1091hx) {
        if (C1091hx.f13833y.equals(c1091hx)) {
            return UA.f11743m;
        }
        if (C1091hx.f13834z.equals(c1091hx)) {
            return UA.f11746p;
        }
        if (C1091hx.f13820B.equals(c1091hx)) {
            return UA.f11745o;
        }
        if (C1091hx.f13819A.equals(c1091hx)) {
            return UA.f11744n;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1091hx)));
    }
}
