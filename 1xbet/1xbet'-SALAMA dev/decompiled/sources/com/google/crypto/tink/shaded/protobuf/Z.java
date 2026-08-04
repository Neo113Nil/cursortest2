package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f11748c = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11750b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f11749a = new L();

    public final c0 a(Class cls) {
        c0 c0VarC;
        U u4;
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
        if (!AbstractC0842w.class.isAssignableFrom(cls) && (cls2 = d0.f11764a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        b0 b0VarA = ((K) l7.f11722a).a(cls);
        if ((b0VarA.f11758d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0842w.class.isAssignableFrom(cls);
            AbstractC0821a abstractC0821a = b0VarA.f11755a;
            if (zIsAssignableFrom) {
                u4 = new U(d0.f11767d, AbstractC0837q.f11816a, abstractC0821a);
            } else {
                g0 g0Var = d0.f11765b;
                C0836p c0836p = AbstractC0837q.f11817b;
                if (c0836p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u4 = new U(g0Var, c0836p, abstractC0821a);
            }
            c0VarC = u4;
        } else if (AbstractC0842w.class.isAssignableFrom(cls)) {
            c0VarC = b0VarA.d() == 1 ? T.C(b0VarA, W.f11747b, I.f11719b, d0.f11767d, AbstractC0837q.f11816a, O.f11726b) : T.C(b0VarA, W.f11747b, I.f11719b, d0.f11767d, null, O.f11726b);
        } else if (b0VarA.d() == 1) {
            V v6 = W.f11746a;
            G g3 = I.f11718a;
            g0 g0Var2 = d0.f11765b;
            C0836p c0836p2 = AbstractC0837q.f11817b;
            if (c0836p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c0VarC = T.C(b0VarA, v6, g3, g0Var2, c0836p2, O.f11725a);
        } else {
            c0VarC = T.C(b0VarA, W.f11746a, I.f11718a, d0.f11766c, null, O.f11725a);
        }
        c0 c0Var2 = (c0) concurrentHashMap.putIfAbsent(cls, c0VarC);
        return c0Var2 != null ? c0Var2 : c0VarC;
    }
}
