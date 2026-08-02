package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.jy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1180jy {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f14192a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f14193b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f14194c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f14195d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f14192a = new Zy(Ex.class, new Aq(26, (byte) 0));
        f14193b = new Xy(b3, new Aq(27, (byte) 0));
        f14194c = new Gy(C1853yx.class, new Aq(28, (byte) 0));
        f14195d = new Ey(b3, new Aq(29, (byte) 0));
    }

    public static Cx a(EnumC1507rA enumC1507rA) {
        int ordinal = enumC1507rA.ordinal();
        if (ordinal == 1) {
            return Cx.f8114m;
        }
        if (ordinal == 2) {
            return Cx.f8117p;
        }
        if (ordinal == 3) {
            return Cx.f8116o;
        }
        if (ordinal == 4) {
            return Cx.f8118q;
        }
        if (ordinal == 5) {
            return Cx.f8115n;
        }
        throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse HashType: ", enumC1507rA.a()));
    }

    public static Dx b(UA ua) {
        int ordinal = ua.ordinal();
        if (ordinal == 1) {
            return Dx.f8421m;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Dx.f8423o;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
            }
        }
        return Dx.f8422n;
    }

    public static C1777xA c(Ex ex) {
        EnumC1507rA enumC1507rA;
        C1732wA y5 = C1777xA.y();
        int i = ex.f8632d;
        y5.e();
        ((C1777xA) y5.f10141l).zzd = i;
        Cx cx = Cx.f8114m;
        Cx cx2 = ex.f;
        if (cx.equals(cx2)) {
            enumC1507rA = EnumC1507rA.f15268m;
        } else if (Cx.f8115n.equals(cx2)) {
            enumC1507rA = EnumC1507rA.f15272q;
        } else if (Cx.f8116o.equals(cx2)) {
            enumC1507rA = EnumC1507rA.f15270o;
        } else if (Cx.f8117p.equals(cx2)) {
            enumC1507rA = EnumC1507rA.f15269n;
        } else {
            if (!Cx.f8118q.equals(cx2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(cx2)));
            }
            enumC1507rA = EnumC1507rA.f15271p;
        }
        y5.e();
        ((C1777xA) y5.f10141l).zzc = enumC1507rA.a();
        return (C1777xA) y5.b();
    }

    public static UA d(Dx dx) {
        if (Dx.f8421m.equals(dx)) {
            return UA.f11743m;
        }
        if (Dx.f8422n.equals(dx)) {
            return UA.f11746p;
        }
        if (Dx.f8423o.equals(dx)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dx)));
    }
}
