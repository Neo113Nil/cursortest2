package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: c, reason: collision with root package name */
    public static final A1 f2595c = new A1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2597b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0222r1 f2596a = new C0222r1();

    public final D1 a(Class cls) {
        D1 u3;
        Charset charset = AbstractC0205l1.f2772a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f2597b;
        D1 d12 = (D1) concurrentHashMap.get(cls);
        if (d12 != null) {
            return d12;
        }
        C0222r1 c0222r1 = this.f2596a;
        c0222r1.getClass();
        C0184e1 c0184e1 = E1.f2619a;
        AbstractC0190g1.class.isAssignableFrom(cls);
        C1 a3 = ((C0222r1) c0222r1.f2807a).a(cls);
        if ((a3.f2612d & 2) == 2) {
            C0184e1 c0184e12 = E1.f2619a;
            C0184e1 c0184e13 = AbstractC0175b1.f2725a;
            u3 = new C0240x1(c0184e12, a3.f2609a);
        } else {
            int i3 = AbstractC0243y1.f2855a;
            int i4 = AbstractC0220q1.f2799a;
            C0184e1 c0184e14 = E1.f2619a;
            C0184e1 c0184e15 = a3.a() + (-1) != 1 ? AbstractC0175b1.f2725a : null;
            int i5 = AbstractC0228t1.f2826a;
            u3 = C0237w1.u(a3, c0184e14, c0184e15);
        }
        D1 d13 = (D1) concurrentHashMap.putIfAbsent(cls, u3);
        return d13 == null ? u3 : d13;
    }
}
