package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285mC {

    /* renamed from: c, reason: collision with root package name */
    public static final C1285mC f14484c = new C1285mC();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14486b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Mt f14485a = new Mt(1);

    public final InterfaceC1554sC a(Class cls) {
        InterfaceC1554sC B5;
        Charset charset = VB.f11871a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f14486b;
        InterfaceC1554sC interfaceC1554sC = (InterfaceC1554sC) concurrentHashMap.get(cls);
        if (interfaceC1554sC != null) {
            return interfaceC1554sC;
        }
        Mt mt = this.f14485a;
        mt.getClass();
        C1543s1 c1543s1 = AbstractC1599tC.f15642a;
        MB.class.isAssignableFrom(cls);
        C1375oC h3 = ((Qs) mt.f10741l).h(cls);
        if ((h3.f14785d & 2) == 2) {
            C1543s1 c1543s12 = AbstractC1599tC.f15642a;
            Fz fz = HB.f9337a;
            B5 = new C1107iC(c1543s12, h3.f14782a);
        } else {
            int i = AbstractC1150jC.f14088a;
            int i5 = AbstractC0749aC.f12645a;
            C1543s1 c1543s13 = AbstractC1599tC.f15642a;
            Fz fz2 = h3.a() + (-1) != 1 ? HB.f9337a : null;
            int i6 = AbstractC0883dC.f13102a;
            B5 = C1062hC.B(h3, c1543s13, fz2);
        }
        InterfaceC1554sC interfaceC1554sC2 = (InterfaceC1554sC) concurrentHashMap.putIfAbsent(cls, B5);
        return interfaceC1554sC2 == null ? B5 : interfaceC1554sC2;
    }
}
