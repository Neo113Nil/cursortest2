package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f9136c = new Q();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9138b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final D f9137a = new D();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.M] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.M] */
    public final U a(Class cls) {
        C0690n c0690n;
        L x4;
        L l7;
        Class cls2;
        AbstractC0698w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9138b;
        U u4 = (U) concurrentHashMap.get(cls);
        if (u4 != null) {
            return u4;
        }
        D d7 = this.f9137a;
        d7.getClass();
        Class cls3 = V.f9146a;
        if (!AbstractC0696u.class.isAssignableFrom(cls) && (cls2 = V.f9146a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        T a2 = ((C) d7.f9107a).a(cls);
        if ((a2.f9145d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0696u.class.isAssignableFrom(cls);
            AbstractC0696u abstractC0696u = a2.f9142a;
            if (isAssignableFrom) {
                l7 = new M(V.f9148c, AbstractC0691o.f9225a, abstractC0696u);
            } else {
                c0 c0Var = V.f9147b;
                C0690n c0690n2 = AbstractC0691o.f9226b;
                if (c0690n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                l7 = new M(c0Var, c0690n2, abstractC0696u);
            }
            x4 = l7;
        } else if (AbstractC0696u.class.isAssignableFrom(cls)) {
            N n2 = O.f9135b;
            A a4 = B.f9104b;
            c0 c0Var2 = V.f9148c;
            C0690n c0690n3 = t.e.e(a2.d()) != 1 ? AbstractC0691o.f9225a : null;
            H h6 = I.f9115b;
            int[] iArr = L.f9117n;
            if (!(a2 instanceof T)) {
                a2.getClass();
                throw new ClassCastException();
            }
            x4 = L.x(a2, n2, a4, c0Var2, c0690n3, h6);
        } else {
            N n7 = O.f9134a;
            A a7 = B.f9103a;
            c0 c0Var3 = V.f9147b;
            if (t.e.e(a2.d()) != 1) {
                c0690n = AbstractC0691o.f9226b;
                if (c0690n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0690n = null;
            }
            H h7 = I.f9114a;
            int[] iArr2 = L.f9117n;
            if (!(a2 instanceof T)) {
                a2.getClass();
                throw new ClassCastException();
            }
            x4 = L.x(a2, n7, a7, c0Var3, c0690n, h7);
        }
        U u7 = (U) concurrentHashMap.putIfAbsent(cls, x4);
        return u7 != null ? u7 : x4;
    }
}
