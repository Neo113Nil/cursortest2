package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Az {
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
        uy.d(C1763wx.f16190e);
        uy.c(C1763wx.f);
        uy.d(C1763wx.f16189d);
        int i = AbstractC1765wz.f;
        if (!AbstractC0952et.s(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        Er er = Hz.f9504a;
        Vy vy = Vy.f11970b;
        vy.h(Hz.f9506c);
        vy.g(Hz.f9507d);
        vy.f(Hz.f9508e);
        vy.e(Hz.f);
        uy.c(AbstractC1765wz.f16195a);
        uy.c(AbstractC1765wz.f16196b);
        Ty ty = Ty.f11706b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", Ez.f8636a);
        m2.g gVar = new m2.g(17);
        gVar.t(32);
        gVar.x(16);
        C1855yz c1855yz = C1855yz.f16517e;
        gVar.f17997o = c1855yz;
        C1810xz c1810xz = C1810xz.f16369d;
        gVar.f17996n = c1810xz;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", gVar.E());
        m2.g gVar2 = new m2.g(17);
        gVar2.t(32);
        gVar2.x(32);
        C1855yz c1855yz2 = C1855yz.f16514b;
        gVar2.f17997o = c1855yz2;
        gVar2.f17996n = c1810xz;
        hashMap.put("HMAC_SHA256_256BITTAG", gVar2.E());
        m2.g gVar3 = new m2.g(17);
        gVar3.t(32);
        gVar3.x(32);
        gVar3.f17997o = c1855yz;
        gVar3.f17996n = c1810xz;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", gVar3.E());
        m2.g gVar4 = new m2.g(17);
        gVar4.t(64);
        gVar4.x(16);
        gVar4.f17997o = c1855yz2;
        C1810xz c1810xz2 = C1810xz.f;
        gVar4.f17996n = c1810xz2;
        hashMap.put("HMAC_SHA512_128BITTAG", gVar4.E());
        m2.g gVar5 = new m2.g(17);
        gVar5.t(64);
        gVar5.x(16);
        gVar5.f17997o = c1855yz;
        gVar5.f17996n = c1810xz2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", gVar5.E());
        m2.g gVar6 = new m2.g(17);
        gVar6.t(64);
        gVar6.x(32);
        gVar6.f17997o = c1855yz2;
        gVar6.f17996n = c1810xz2;
        hashMap.put("HMAC_SHA512_256BITTAG", gVar6.E());
        m2.g gVar7 = new m2.g(17);
        gVar7.t(64);
        gVar7.x(32);
        gVar7.f17997o = c1855yz;
        gVar7.f17996n = c1810xz2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", gVar7.E());
        hashMap.put("HMAC_SHA512_512BITTAG", Ez.f8637b);
        m2.g gVar8 = new m2.g(17);
        gVar8.t(64);
        gVar8.x(64);
        gVar8.f17997o = c1855yz;
        gVar8.f17996n = c1810xz2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", gVar8.E());
        ty.b(Collections.unmodifiableMap(hashMap));
        Py py = Py.f11138b;
        py.b(AbstractC1765wz.f16199e, C1900zz.class);
        Qy.f11294b.a(AbstractC1765wz.f16198d, C1900zz.class);
        Cy cy = Cy.f8127d;
        cy.b(AbstractC1765wz.f16197c, i);
        if (By.a()) {
            return;
        }
        Ax ax = AbstractC1585sz.f15617a;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        vy.h(Gz.f9292a);
        vy.g(Gz.f9293b);
        vy.f(Gz.f9294c);
        vy.e(Gz.f9295d);
        py.b(AbstractC1585sz.f15617a, C1630tz.class);
        uy.c(AbstractC1585sz.f15618b);
        uy.c(AbstractC1585sz.f15619c);
        HashMap hashMap2 = new HashMap();
        C1630tz c1630tz = Ez.f8638c;
        hashMap2.put("AES_CMAC", c1630tz);
        hashMap2.put("AES256_CMAC", c1630tz);
        Fx fx = new Fx();
        fx.a(32);
        fx.d(16);
        fx.f9143k = C1091hx.f13820B;
        hashMap2.put("AES256_CMAC_RAW", fx.i());
        ty.b(Collections.unmodifiableMap(hashMap2));
        cy.a(AbstractC1585sz.f15620d);
    }
}
