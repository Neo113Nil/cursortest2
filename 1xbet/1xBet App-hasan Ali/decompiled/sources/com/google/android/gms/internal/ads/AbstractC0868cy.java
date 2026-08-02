package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0868cy {

    /* renamed from: a, reason: collision with root package name */
    public static final Zy f13066a;

    /* renamed from: b, reason: collision with root package name */
    public static final Xy f13067b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gy f13068c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ey f13069d;

    static {
        C1419pB b3 = AbstractC1451pz.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f13066a = new Zy(C0779ay.class, new Aq(20, (byte) 0));
        f13067b = new Xy(b3, new Aq(21, (byte) 0));
        f13068c = new Gy(Zx.class, new Aq(22, (byte) 0));
        f13069d = new Ey(b3, new Aq(23, (byte) 0));
    }

    public static C0779ay a(TA ta, UA ua) {
        C1091hx c1091hx;
        AA w5 = BA.w();
        w5.j(ta.w().B());
        w5.k(ta.w().A());
        w5.i(UA.f11745o);
        AbstractC1314mx i = AbstractC0952et.i(((BA) w5.b()).d());
        boolean z3 = i instanceof Mx;
        Object obj = C1091hx.f13832x;
        C1091hx c1091hx2 = C1091hx.f13831w;
        C1091hx c1091hx3 = C1091hx.f13830v;
        C1091hx c1091hx4 = C1091hx.f13828t;
        C1091hx c1091hx5 = C1091hx.f13829u;
        C1091hx c1091hx6 = C1091hx.f13827s;
        if (z3) {
            c1091hx = c1091hx6;
        } else if (i instanceof Sx) {
            c1091hx = c1091hx5;
        } else if (i instanceof C1135iy) {
            c1091hx = c1091hx4;
        } else if (i instanceof Ex) {
            c1091hx = c1091hx3;
        } else if (i instanceof Jx) {
            c1091hx = c1091hx2;
        } else {
            if (!(i instanceof Px)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(i.toString()));
            }
            c1091hx = obj;
        }
        int ordinal = ua.ordinal();
        Cx cx = Cx.f8123v;
        if (ordinal == 1) {
            cx = Cx.f8122u;
        } else if (ordinal != 3) {
            throw new GeneralSecurityException(AbstractC2107A.q("Unable to parse OutputPrefixType: ", ua.a()));
        }
        String A3 = ta.A();
        AbstractC1673ux abstractC1673ux = (AbstractC1673ux) i;
        if (A3 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (abstractC1673ux == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC1673ux.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c1091hx.equals(c1091hx6) && (abstractC1673ux instanceof Mx)) || ((c1091hx.equals(c1091hx5) && (abstractC1673ux instanceof Sx)) || ((c1091hx.equals(c1091hx4) && (abstractC1673ux instanceof C1135iy)) || ((c1091hx.equals(c1091hx3) && (abstractC1673ux instanceof Ex)) || ((c1091hx.equals(c1091hx2) && (abstractC1673ux instanceof Jx)) || (c1091hx.equals(obj) && (abstractC1673ux instanceof Px))))))) {
            return new C0779ay(cx, A3, c1091hx, abstractC1673ux);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + c1091hx.f13836l + " when new keys are picked according to " + String.valueOf(abstractC1673ux) + ".");
    }

    public static TA b(C0779ay c0779ay) {
        byte[] d5 = ((C1181jz) Vy.f11970b.d(c0779ay.f12739d)).f14197b.d();
        try {
            GB gb = GB.f9177a;
            C1285mC c1285mC = C1285mC.f14484c;
            BA y5 = BA.y(d5, GB.f9178b);
            SA x5 = TA.x();
            String str = c0779ay.f12737b;
            x5.e();
            TA.C((TA) x5.f10141l, str);
            x5.e();
            TA.B((TA) x5.f10141l, y5);
            return (TA) x5.b();
        } catch (XB e3) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e3);
        }
    }

    public static UA c(Cx cx) {
        if (Cx.f8122u.equals(cx)) {
            return UA.f11743m;
        }
        if (Cx.f8123v.equals(cx)) {
            return UA.f11745o;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(cx)));
    }
}
