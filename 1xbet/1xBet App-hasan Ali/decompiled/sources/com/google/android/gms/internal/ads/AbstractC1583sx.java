package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1583sx {
    static {
        int i = VA.zza;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        Uy uy = Uy.f11845b;
        uy.d(C1763wx.f16187b);
        uy.c(C1763wx.f16188c);
        Az.a();
        int i = Bx.f7921e;
        if (!AbstractC0952et.s(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        Zy zy = AbstractC1180jy.f14192a;
        Vy vy = Vy.f11970b;
        vy.h(AbstractC1180jy.f14192a);
        vy.g(AbstractC1180jy.f14193b);
        vy.f(AbstractC1180jy.f14194c);
        vy.e(AbstractC1180jy.f14195d);
        uy.c(Bx.f7917a);
        Ty ty = Ty.f11706b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC0912dy.f13210e);
        C1324n6 c1324n6 = new C1324n6(6);
        c1324n6.c(16);
        c1324n6.h(32);
        c1324n6.o(16);
        c1324n6.m(16);
        Cx cx = Cx.f8116o;
        c1324n6.f14582o = cx;
        Dx dx = Dx.f8423o;
        c1324n6.f14583p = dx;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", c1324n6.r());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC0912dy.f);
        C1324n6 c1324n62 = new C1324n6(6);
        c1324n62.c(32);
        c1324n62.h(32);
        c1324n62.o(32);
        c1324n62.m(16);
        c1324n62.f14582o = cx;
        c1324n62.f14583p = dx;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", c1324n62.r());
        ty.b(Collections.unmodifiableMap(hashMap));
        Qy qy = Qy.f11294b;
        qy.a(Bx.f7919c, Ex.class);
        Py py = Py.f11138b;
        py.b(Bx.f7920d, Ex.class);
        Cy cy = Cy.f8127d;
        cy.b(Bx.f7918b, i);
        int i5 = Lx.f10563e;
        if (!AbstractC0952et.s(i5)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        vy.h(AbstractC1405oy.f14877a);
        vy.g(AbstractC1405oy.f14878b);
        vy.f(AbstractC1405oy.f14879c);
        vy.e(AbstractC1405oy.f14880d);
        uy.c(Lx.f10559a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC0912dy.f13206a);
        m2.g gVar = new m2.g(16);
        gVar.mo20a();
        gVar.t(16);
        gVar.w();
        C1091hx c1091hx = C1091hx.f13826r;
        gVar.f17997o = c1091hx;
        hashMap2.put("AES128_GCM_RAW", gVar.D());
        hashMap2.put("AES256_GCM", AbstractC0912dy.f13207b);
        m2.g gVar2 = new m2.g(16);
        gVar2.mo20a();
        gVar2.t(32);
        gVar2.w();
        gVar2.f17997o = c1091hx;
        hashMap2.put("AES256_GCM_RAW", gVar2.D());
        ty.b(Collections.unmodifiableMap(hashMap2));
        qy.a(Lx.f10561c, Mx.class);
        py.b(Lx.f10562d, Mx.class);
        cy.b(Lx.f10560b, i5);
        if (By.a()) {
            return;
        }
        C0824bz c0824bz = Hx.f9501a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        vy.h(AbstractC1315my.f14553a);
        vy.g(AbstractC1315my.f14554b);
        vy.f(AbstractC1315my.f14555c);
        vy.e(AbstractC1315my.f14556d);
        uy.c(Hx.f9501a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC0912dy.f13208c);
        C1071hd c1071hd = new C1071hd(16);
        c1071hd.p(16);
        c1071hd.t(16);
        c1071hd.w();
        Ix ix = Ix.f9646o;
        c1071hd.f13764o = ix;
        hashMap3.put("AES128_EAX_RAW", c1071hd.C());
        hashMap3.put("AES256_EAX", AbstractC0912dy.f13209d);
        C1071hd c1071hd2 = new C1071hd(16);
        c1071hd2.p(16);
        c1071hd2.t(32);
        c1071hd2.w();
        c1071hd2.f13764o = ix;
        hashMap3.put("AES256_EAX_RAW", c1071hd2.C());
        ty.b(Collections.unmodifiableMap(hashMap3));
        py.b(Hx.f9503c, Jx.class);
        cy.a(Hx.f9502b);
        C0824bz c0824bz2 = Ox.f11013a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        vy.h(AbstractC1450py.f15064a);
        vy.g(AbstractC1450py.f15065b);
        vy.f(AbstractC1450py.f15066c);
        vy.e(AbstractC1450py.f15067d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            uy.c(Ox.f11013a);
            HashMap hashMap4 = new HashMap();
            Cx cx2 = Cx.f8121t;
            Cx cx3 = Cx.f8119r;
            hashMap4.put("AES128_GCM_SIV", new Px(16, cx3));
            hashMap4.put("AES128_GCM_SIV_RAW", new Px(16, cx2));
            hashMap4.put("AES256_GCM_SIV", new Px(32, cx3));
            hashMap4.put("AES256_GCM_SIV_RAW", new Px(32, cx2));
            ty.b(Collections.unmodifiableMap(hashMap4));
            qy.a(Ox.f11015c, Px.class);
            py.b(Ox.f11014b, Px.class);
            cy.a(Ox.f11016d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        C0824bz c0824bz3 = Rx.f11471a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        Zy zy2 = AbstractC1539ry.f15395a;
        Vy vy2 = Vy.f11970b;
        vy2.h(AbstractC1539ry.f15395a);
        vy2.g(AbstractC1539ry.f15396b);
        vy2.f(AbstractC1539ry.f15397c);
        vy2.e(AbstractC1539ry.f15398d);
        Uy uy2 = Uy.f11845b;
        uy2.c(Rx.f11471a);
        Py py2 = Py.f11138b;
        py2.b(Rx.f11472b, Sx.class);
        Ty ty2 = Ty.f11706b;
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new Sx(Dx.f8424p));
        hashMap5.put("CHACHA20_POLY1305_RAW", new Sx(Dx.f8426r));
        ty2.b(Collections.unmodifiableMap(hashMap5));
        Cy cy2 = Cy.f8127d;
        cy2.a(Rx.f11473c);
        C0824bz c0824bz4 = Tx.f11703a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        vy2.h(Yx.f12379a);
        vy2.g(Yx.f12380b);
        vy2.f(Yx.f12381c);
        vy2.e(Yx.f12382d);
        uy2.c(Tx.f11703a);
        py2.b(Tx.f11705c, Xx.class);
        cy2.a(Tx.f11704b);
        Iy iy = Vx.f11967a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        vy2.h(AbstractC0868cy.f13066a);
        vy2.g(AbstractC0868cy.f13067b);
        vy2.f(AbstractC0868cy.f13068c);
        vy2.e(AbstractC0868cy.f13069d);
        py2.b(Vx.f11968b, C0779ay.class);
        uy2.c(Vx.f11969c);
        cy2.a(Vx.f11967a);
        C0824bz c0824bz5 = AbstractC1092hy.f13837a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        vy2.h(AbstractC1899zy.f16794a);
        vy2.g(AbstractC1899zy.f16795b);
        vy2.f(AbstractC1899zy.f16796c);
        vy2.e(AbstractC1899zy.f16797d);
        uy2.c(AbstractC1092hy.f13837a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C1135iy(Ix.f9649r));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C1135iy(Ix.f9651t));
        ty2.b(Collections.unmodifiableMap(hashMap6));
        py2.b(AbstractC1092hy.f13840d, C1135iy.class);
        Qy.f11294b.a(AbstractC1092hy.f13839c, C1135iy.class);
        cy2.a(AbstractC1092hy.f13838b);
        vy2.h(AbstractC1854yy.f16510a);
        vy2.g(AbstractC1854yy.f16511b);
        vy2.f(AbstractC1854yy.f16512c);
        vy2.e(AbstractC1854yy.f16513d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC0912dy.f13211g);
        ty2.b(Collections.unmodifiableMap(hashMap7));
        uy2.c(AbstractC1803xs.f16345d);
        py2.b(AbstractC1803xs.f16344c, C1002fy.class);
    }
}
