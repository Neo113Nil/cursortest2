package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Uy {

    /* renamed from: b, reason: collision with root package name */
    public static final Uy f11845b = new Uy();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11846a = new AtomicReference(new C1003fz(new C1667ur(6)));

    public final Class a() {
        HashMap hashMap = ((C1003fz) this.f11846a.get()).f13535b;
        if (hashMap.containsKey(InterfaceC0911dx.class)) {
            return ((InterfaceC1093hz) hashMap.get(InterfaceC0911dx.class)).a();
        }
        throw new GeneralSecurityException(L1.a.n("No input primitive class for ", InterfaceC0911dx.class.toString(), " available"));
    }

    public final Object b(AbstractC1400ot abstractC1400ot, Class cls) {
        C1003fz c1003fz = (C1003fz) this.f11846a.get();
        c1003fz.getClass();
        C0913dz c0913dz = new C0913dz(abstractC1400ot.getClass(), cls);
        HashMap hashMap = c1003fz.f13534a;
        if (hashMap.containsKey(c0913dz)) {
            return ((C0824bz) hashMap.get(c0913dz)).f12930c.b(abstractC1400ot);
        }
        throw new GeneralSecurityException(L1.a.n("No PrimitiveConstructor for ", c0913dz.toString(), " available"));
    }

    public final synchronized void c(C0824bz c0824bz) {
        C1667ur c1667ur = new C1667ur((C1003fz) this.f11846a.get());
        c1667ur.d(c0824bz);
        this.f11846a.set(new C1003fz(c1667ur));
    }

    public final synchronized void d(InterfaceC1093hz interfaceC1093hz) {
        C1667ur c1667ur = new C1667ur((C1003fz) this.f11846a.get());
        Class d5 = interfaceC1093hz.d();
        HashMap hashMap = (HashMap) c1667ur.f15915m;
        if (hashMap.containsKey(d5)) {
            InterfaceC1093hz interfaceC1093hz2 = (InterfaceC1093hz) hashMap.get(d5);
            if (!interfaceC1093hz2.equals(interfaceC1093hz) || !interfaceC1093hz.equals(interfaceC1093hz2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(d5.toString()));
            }
        } else {
            hashMap.put(d5, interfaceC1093hz);
        }
        this.f11846a.set(new C1003fz(c1667ur));
    }
}
