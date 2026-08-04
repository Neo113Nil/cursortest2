package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0872m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0872m0 f12232c = new C0872m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12234b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f12233a = new X(0);

    public final InterfaceC0881r0 a(Class cls) {
        InterfaceC0881r0 interfaceC0881r0A;
        C0860g0 c0860g0;
        Class cls2;
        K.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f12234b;
        InterfaceC0881r0 interfaceC0881r0 = (InterfaceC0881r0) concurrentHashMap.get(cls);
        if (interfaceC0881r0 != null) {
            return interfaceC0881r0;
        }
        X x4 = this.f12233a;
        x4.getClass();
        Class cls3 = AbstractC0883s0.f12269a;
        if (!C.class.isAssignableFrom(cls) && (cls2 = AbstractC0883s0.f12269a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C0876o0 c0876o0A = ((W) x4.f12168a).a(cls);
        if ((c0876o0A.f12252d & 2) == 2) {
            boolean zIsAssignableFrom = C.class.isAssignableFrom(cls);
            AbstractC0847a abstractC0847a = c0876o0A.f12249a;
            if (zIsAssignableFrom) {
                c0860g0 = new C0860g0(AbstractC0883s0.f12271c, AbstractC0887v.f12281a, abstractC0847a);
            } else {
                C0 c0 = AbstractC0883s0.f12270b;
                C0886u c0886u = AbstractC0887v.f12282b;
                if (c0886u == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0860g0 = new C0860g0(c0, c0886u, abstractC0847a);
            }
            interfaceC0881r0A = c0860g0;
        } else if (C.class.isAssignableFrom(cls)) {
            interfaceC0881r0A = p136t.e.e(c0876o0A.d()) != 1 ? C0858f0.A(c0876o0A, AbstractC0864i0.f12206b, U.f12165b, AbstractC0883s0.f12271c, AbstractC0887v.f12281a, AbstractC0852c0.f12180b) : C0858f0.A(c0876o0A, AbstractC0864i0.f12206b, U.f12165b, AbstractC0883s0.f12271c, null, AbstractC0852c0.f12180b);
        } else if (p136t.e.e(c0876o0A.d()) != 1) {
            C0862h0 c0862h0 = AbstractC0864i0.f12205a;
            S s7 = U.f12164a;
            C0 c1 = AbstractC0883s0.f12270b;
            C0886u c0886u2 = AbstractC0887v.f12282b;
            if (c0886u2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC0881r0A = C0858f0.A(c0876o0A, c0862h0, s7, c1, c0886u2, AbstractC0852c0.f12179a);
        } else {
            interfaceC0881r0A = C0858f0.A(c0876o0A, AbstractC0864i0.f12205a, U.f12164a, AbstractC0883s0.f12270b, null, AbstractC0852c0.f12179a);
        }
        InterfaceC0881r0 interfaceC0881r1 = (InterfaceC0881r0) concurrentHashMap.putIfAbsent(cls, interfaceC0881r0A);
        return interfaceC0881r1 != null ? interfaceC0881r1 : interfaceC0881r0A;
    }
}
