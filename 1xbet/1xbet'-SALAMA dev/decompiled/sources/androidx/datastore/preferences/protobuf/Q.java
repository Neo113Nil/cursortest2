package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f9136c = new Q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9138b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f9137a = new D();

    public final U a(Class cls) {
        C0669n c0669n;
        U uX;
        M m7;
        Class cls2;
        AbstractC0677w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9138b;
        U u4 = (U) concurrentHashMap.get(cls);
        if (u4 != null) {
            return u4;
        }
        D d7 = this.f9137a;
        d7.getClass();
        Class cls3 = V.f9146a;
        if (!AbstractC0675u.class.isAssignableFrom(cls) && (cls2 = V.f9146a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        T tA = ((C) d7.f9107a).a(cls);
        if ((tA.f9145d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0675u.class.isAssignableFrom(cls);
            AbstractC0675u abstractC0675u = tA.f9142a;
            if (zIsAssignableFrom) {
                m7 = new M(V.f9148c, AbstractC0670o.f9225a, abstractC0675u);
            } else {
                c0 c0Var = V.f9147b;
                C0669n c0669n2 = AbstractC0670o.f9226b;
                if (c0669n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                m7 = new M(c0Var, c0669n2, abstractC0675u);
            }
            uX = m7;
        } else if (AbstractC0675u.class.isAssignableFrom(cls)) {
            N n2 = O.f9135b;
            A a2 = B.f9104b;
            c0 c0Var2 = V.f9148c;
            C0669n c0669n3 = p136t.e.e(tA.d()) != 1 ? AbstractC0670o.f9225a : null;
            H h6 = I.f9115b;
            int[] iArr = L.f9117n;
            if (!(tA instanceof T)) {
                tA.getClass();
                throw new ClassCastException();
            }
            uX = L.x(tA, n2, a2, c0Var2, c0669n3, h6);
        } else {
            N n7 = O.f9134a;
            A a4 = B.f9103a;
            c0 c0Var3 = V.f9147b;
            if (p136t.e.e(tA.d()) != 1) {
                c0669n = AbstractC0670o.f9226b;
                if (c0669n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0669n = null;
            }
            H h7 = I.f9114a;
            int[] iArr2 = L.f9117n;
            if (!(tA instanceof T)) {
                tA.getClass();
                throw new ClassCastException();
            }
            uX = L.x(tA, n7, a4, c0Var3, c0669n, h7);
        }
        U u7 = (U) concurrentHashMap.putIfAbsent(cls, uX);
        return u7 != null ? u7 : uX;
    }
}
