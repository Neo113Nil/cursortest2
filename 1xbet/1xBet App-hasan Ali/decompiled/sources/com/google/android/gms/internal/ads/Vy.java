package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Vy {

    /* renamed from: b, reason: collision with root package name */
    public static final Vy f11970b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11971a = new AtomicReference(new C1406oz(new C1071hd(17)));

    static {
        try {
            Vy vy = new Vy();
            vy.f(new Gy(Ky.class, new C1225ky(24)));
            f11970b = vy;
        } catch (Exception e3) {
            throw new D2.e(e3);
        }
    }

    public final AbstractC1400ot a(C1136iz c1136iz) {
        C1406oz c1406oz = (C1406oz) this.f11971a.get();
        c1406oz.getClass();
        C1316mz c1316mz = new C1316mz(C1136iz.class, c1136iz.f14024b);
        HashMap hashMap = c1406oz.f14882b;
        if (hashMap.containsKey(c1316mz)) {
            return ((Ey) hashMap.get(c1316mz)).f8635b.d(c1136iz);
        }
        throw new GeneralSecurityException(L1.a.n("No Key Parser for requested key type ", c1316mz.toString(), " available"));
    }

    public final AbstractC1314mx b(C1181jz c1181jz) {
        C1406oz c1406oz = (C1406oz) this.f11971a.get();
        c1406oz.getClass();
        C1316mz c1316mz = new C1316mz(C1181jz.class, c1181jz.f14196a);
        HashMap hashMap = c1406oz.f14884d;
        if (hashMap.containsKey(c1316mz)) {
            return ((Xy) hashMap.get(c1316mz)).f12262b.e(c1181jz);
        }
        throw new GeneralSecurityException(L1.a.n("No Parameters Parser for requested key type ", c1316mz.toString(), " available"));
    }

    public final InterfaceC1271lz c(AbstractC1400ot abstractC1400ot) {
        C1406oz c1406oz = (C1406oz) this.f11971a.get();
        c1406oz.getClass();
        C1361nz c1361nz = new C1361nz(abstractC1400ot.getClass(), C1136iz.class);
        HashMap hashMap = c1406oz.f14881a;
        if (hashMap.containsKey(c1361nz)) {
            return ((Gy) hashMap.get(c1361nz)).f9291b.b(abstractC1400ot);
        }
        throw new GeneralSecurityException(L1.a.n("No Key serializer for ", c1361nz.toString(), " available"));
    }

    public final InterfaceC1271lz d(AbstractC1314mx abstractC1314mx) {
        C1406oz c1406oz = (C1406oz) this.f11971a.get();
        c1406oz.getClass();
        C1361nz c1361nz = new C1361nz(abstractC1314mx.getClass(), C1181jz.class);
        HashMap hashMap = c1406oz.f14883c;
        if (hashMap.containsKey(c1361nz)) {
            return ((Zy) hashMap.get(c1361nz)).f12548b.f(abstractC1314mx);
        }
        throw new GeneralSecurityException(L1.a.n("No Key Format serializer for ", c1361nz.toString(), " available"));
    }

    public final synchronized void e(Ey ey) {
        C1071hd c1071hd = new C1071hd((C1406oz) this.f11971a.get());
        c1071hd.q(ey);
        this.f11971a.set(new C1406oz(c1071hd));
    }

    public final synchronized void f(Gy gy) {
        C1071hd c1071hd = new C1071hd((C1406oz) this.f11971a.get());
        c1071hd.v(gy);
        this.f11971a.set(new C1406oz(c1071hd));
    }

    public final synchronized void g(Xy xy) {
        C1071hd c1071hd = new C1071hd((C1406oz) this.f11971a.get());
        c1071hd.x(xy);
        this.f11971a.set(new C1406oz(c1071hd));
    }

    public final synchronized void h(Zy zy) {
        C1071hd c1071hd = new C1071hd((C1406oz) this.f11971a.get());
        c1071hd.A(zy);
        this.f11971a.set(new C1406oz(c1071hd));
    }
}
