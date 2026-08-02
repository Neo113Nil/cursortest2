package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.px, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1449px {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15063a = 0;

    static {
        Logger.getLogger(AbstractC1449px.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC0911dx.class);
        hashSet.add(InterfaceC0956ex.class);
        hashSet.add(InterfaceC1494qx.class);
        hashSet.add(InterfaceC1046gx.class);
        hashSet.add(InterfaceC1001fx.class);
        hashSet.add(InterfaceC1269lx.class);
        hashSet.add(Iz.class);
        hashSet.add(InterfaceC1359nx.class);
        hashSet.add(InterfaceC1404ox.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object a(C1867zA c1867zA, Class cls) {
        String A3 = c1867zA.A();
        AbstractC1823yB z3 = c1867zA.z();
        Iy c5 = Cy.f8127d.c(A3);
        boolean equals = c5.f9655b.equals(cls);
        Class cls2 = c5.f9655b;
        if (equals) {
            return Uy.f11845b.b(Vy.f11970b.a(C1136iz.a(c5.f9654a, z3, c5.f9656c, UA.f11745o, null)), cls2);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(Iy.class) + ", which only supports: " + cls2.toString());
    }
}
