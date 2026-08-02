package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f11748c = new Z();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11750b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final L f11749a = new L();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.U] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.U] */
    public final c0 a(Class cls) {
        T C3;
        T t7;
        Class cls2;
        A.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f11750b;
        c0 c0Var = (c0) concurrentHashMap.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        L l7 = this.f11749a;
        l7.getClass();
        Class cls3 = d0.f11764a;
        if (!AbstractC0886w.class.isAssignableFrom(cls) && (cls2 = d0.f11764a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        b0 a2 = ((K) l7.f11722a).a(cls);
        if ((a2.f11758d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0886w.class.isAssignableFrom(cls);
            AbstractC0865a abstractC0865a = a2.f11755a;
            if (isAssignableFrom) {
                t7 = new U(d0.f11767d, AbstractC0881q.f11816a, abstractC0865a);
            } else {
                g0 g0Var = d0.f11765b;
                C0880p c0880p = AbstractC0881q.f11817b;
                if (c0880p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t7 = new U(g0Var, c0880p, abstractC0865a);
            }
            C3 = t7;
        } else if (AbstractC0886w.class.isAssignableFrom(cls)) {
            C3 = a2.d() == 1 ? T.C(a2, W.f11747b, I.f11719b, d0.f11767d, AbstractC0881q.f11816a, O.f11726b) : T.C(a2, W.f11747b, I.f11719b, d0.f11767d, null, O.f11726b);
        } else if (a2.d() == 1) {
            V v6 = W.f11746a;
            G g3 = I.f11718a;
            g0 g0Var2 = d0.f11765b;
            C0880p c0880p2 = AbstractC0881q.f11817b;
            if (c0880p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C3 = T.C(a2, v6, g3, g0Var2, c0880p2, O.f11725a);
        } else {
            C3 = T.C(a2, W.f11746a, I.f11718a, d0.f11766c, null, O.f11725a);
        }
        c0 c0Var2 = (c0) concurrentHashMap.putIfAbsent(cls, C3);
        return c0Var2 != null ? c0Var2 : C3;
    }
}
