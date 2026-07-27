package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f2190c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2192b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f2191a = new F();

    public final W a(Class cls) {
        W w3;
        Class cls2;
        AbstractC0149y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2192b;
        W w4 = (W) concurrentHashMap.get(cls);
        if (w4 != null) {
            return w4;
        }
        F f = this.f2191a;
        f.getClass();
        Class cls3 = X.f2200a;
        if (!AbstractC0147w.class.isAssignableFrom(cls) && (cls2 = X.f2200a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V a3 = ((E) f.f2161a).a(cls);
        if ((a3.f2199d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0147w.class.isAssignableFrom(cls);
            AbstractC0147w abstractC0147w = a3.f2196a;
            if (isAssignableFrom) {
                w3 = new O(X.f2202c, AbstractC0142q.f2272a, abstractC0147w);
            } else {
                e0 e0Var = X.f2201b;
                C0141p c0141p = AbstractC0142q.f2273b;
                if (c0141p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w3 = new O(e0Var, c0141p, abstractC0147w);
            }
        } else if (AbstractC0147w.class.isAssignableFrom(cls)) {
            C0141p c0141p2 = null;
            P p3 = Q.f2189b;
            C c3 = D.f2158b;
            e0 e0Var2 = X.f2202c;
            if (M.j.b(a3.a()) != 1) {
                c0141p2 = AbstractC0142q.f2272a;
            }
            C0141p c0141p3 = c0141p2;
            J j3 = K.f2169b;
            int[] iArr = N.f2171n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            w3 = N.w(a3, p3, c3, e0Var2, c0141p3, j3);
        } else {
            C0141p c0141p4 = null;
            P p4 = Q.f2188a;
            C c4 = D.f2157a;
            e0 e0Var3 = X.f2201b;
            if (M.j.b(a3.a()) != 1 && (c0141p4 = AbstractC0142q.f2273b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0141p c0141p5 = c0141p4;
            J j4 = K.f2168a;
            int[] iArr2 = N.f2171n;
            if (!(a3 instanceof V)) {
                a3.getClass();
                throw new ClassCastException();
            }
            w3 = N.w(a3, p4, c4, e0Var3, c0141p5, j4);
        }
        W w5 = (W) concurrentHashMap.putIfAbsent(cls, w3);
        return w5 != null ? w5 : w3;
    }
}
