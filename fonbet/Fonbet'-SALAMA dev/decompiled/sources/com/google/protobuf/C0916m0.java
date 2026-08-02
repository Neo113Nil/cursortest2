package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0916m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0916m0 f12232c = new C0916m0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12234b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final X f12233a = new X(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.protobuf.g0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.protobuf.g0] */
    public final InterfaceC0925r0 a(Class cls) {
        C0902f0 A7;
        C0902f0 c0902f0;
        Class cls2;
        K.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f12234b;
        InterfaceC0925r0 interfaceC0925r0 = (InterfaceC0925r0) concurrentHashMap.get(cls);
        if (interfaceC0925r0 != null) {
            return interfaceC0925r0;
        }
        X x4 = this.f12233a;
        x4.getClass();
        Class cls3 = AbstractC0927s0.f12269a;
        if (!C.class.isAssignableFrom(cls) && (cls2 = AbstractC0927s0.f12269a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C0920o0 a2 = ((W) x4.f12168a).a(cls);
        if ((a2.f12252d & 2) == 2) {
            boolean isAssignableFrom = C.class.isAssignableFrom(cls);
            AbstractC0891a abstractC0891a = a2.f12249a;
            if (isAssignableFrom) {
                c0902f0 = new C0904g0(AbstractC0927s0.f12271c, AbstractC0931v.f12281a, abstractC0891a);
            } else {
                C0 c0 = AbstractC0927s0.f12270b;
                C0930u c0930u = AbstractC0931v.f12282b;
                if (c0930u == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0902f0 = new C0904g0(c0, c0930u, abstractC0891a);
            }
            A7 = c0902f0;
        } else if (C.class.isAssignableFrom(cls)) {
            A7 = t.e.e(a2.d()) != 1 ? C0902f0.A(a2, AbstractC0908i0.f12206b, U.f12165b, AbstractC0927s0.f12271c, AbstractC0931v.f12281a, AbstractC0896c0.f12180b) : C0902f0.A(a2, AbstractC0908i0.f12206b, U.f12165b, AbstractC0927s0.f12271c, null, AbstractC0896c0.f12180b);
        } else if (t.e.e(a2.d()) != 1) {
            C0906h0 c0906h0 = AbstractC0908i0.f12205a;
            S s7 = U.f12164a;
            C0 c02 = AbstractC0927s0.f12270b;
            C0930u c0930u2 = AbstractC0931v.f12282b;
            if (c0930u2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            A7 = C0902f0.A(a2, c0906h0, s7, c02, c0930u2, AbstractC0896c0.f12179a);
        } else {
            A7 = C0902f0.A(a2, AbstractC0908i0.f12205a, U.f12164a, AbstractC0927s0.f12270b, null, AbstractC0896c0.f12179a);
        }
        InterfaceC0925r0 interfaceC0925r02 = (InterfaceC0925r0) concurrentHashMap.putIfAbsent(cls, A7);
        return interfaceC0925r02 != null ? interfaceC0925r02 : A7;
    }
}
