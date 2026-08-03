package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.T f2259c = new androidx.datastore.preferences.protobuf.T();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2261b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.F f2260a = new androidx.datastore.preferences.protobuf.F();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.O] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.O] */
    public final androidx.datastore.preferences.protobuf.W a(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.C0080p c0080p;
        androidx.datastore.preferences.protobuf.N x2;
        androidx.datastore.preferences.protobuf.N n2;
        java.lang.Class cls2;
        androidx.datastore.preferences.protobuf.AbstractC0088y.a(cls, "messageType");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f2261b;
        androidx.datastore.preferences.protobuf.W w2 = (androidx.datastore.preferences.protobuf.W) concurrentHashMap.get(cls);
        if (w2 != null) {
            return w2;
        }
        androidx.datastore.preferences.protobuf.F f2 = this.f2260a;
        f2.getClass();
        java.lang.Class cls3 = androidx.datastore.preferences.protobuf.X.f2269a;
        if (!androidx.datastore.preferences.protobuf.AbstractC0086w.class.isAssignableFrom(cls) && (cls2 = androidx.datastore.preferences.protobuf.X.f2269a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        androidx.datastore.preferences.protobuf.V b2 = ((androidx.datastore.preferences.protobuf.E) f2.f2229a).b(cls);
        if ((b2.f2268d & 2) == 2) {
            boolean isAssignableFrom = androidx.datastore.preferences.protobuf.AbstractC0086w.class.isAssignableFrom(cls);
            androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = b2.f2265a;
            if (isAssignableFrom) {
                n2 = new androidx.datastore.preferences.protobuf.O(androidx.datastore.preferences.protobuf.X.f2271c, androidx.datastore.preferences.protobuf.AbstractC0081q.f2346a, abstractC0086w);
            } else {
                androidx.datastore.preferences.protobuf.e0 e0Var = androidx.datastore.preferences.protobuf.X.f2270b;
                androidx.datastore.preferences.protobuf.C0080p c0080p2 = androidx.datastore.preferences.protobuf.AbstractC0081q.f2347b;
                if (c0080p2 == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n2 = new androidx.datastore.preferences.protobuf.O(e0Var, c0080p2, abstractC0086w);
            }
            x2 = n2;
        } else if (androidx.datastore.preferences.protobuf.AbstractC0086w.class.isAssignableFrom(cls)) {
            androidx.datastore.preferences.protobuf.P p2 = androidx.datastore.preferences.protobuf.Q.f2258b;
            androidx.datastore.preferences.protobuf.C c2 = androidx.datastore.preferences.protobuf.D.f2226b;
            androidx.datastore.preferences.protobuf.e0 e0Var2 = androidx.datastore.preferences.protobuf.X.f2271c;
            androidx.datastore.preferences.protobuf.C0080p c0080p3 = H.j.b(b2.d()) != 1 ? androidx.datastore.preferences.protobuf.AbstractC0081q.f2346a : null;
            androidx.datastore.preferences.protobuf.J j2 = androidx.datastore.preferences.protobuf.K.f2237b;
            int[] iArr = androidx.datastore.preferences.protobuf.N.f2239n;
            if (!(b2 instanceof androidx.datastore.preferences.protobuf.V)) {
                b2.getClass();
                throw new java.lang.ClassCastException();
            }
            x2 = androidx.datastore.preferences.protobuf.N.x(b2, p2, c2, e0Var2, c0080p3, j2);
        } else {
            androidx.datastore.preferences.protobuf.P p3 = androidx.datastore.preferences.protobuf.Q.f2257a;
            androidx.datastore.preferences.protobuf.C c3 = androidx.datastore.preferences.protobuf.D.f2225a;
            androidx.datastore.preferences.protobuf.e0 e0Var3 = androidx.datastore.preferences.protobuf.X.f2270b;
            if (H.j.b(b2.d()) != 1) {
                c0080p = androidx.datastore.preferences.protobuf.AbstractC0081q.f2347b;
                if (c0080p == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0080p = null;
            }
            androidx.datastore.preferences.protobuf.J j3 = androidx.datastore.preferences.protobuf.K.f2236a;
            int[] iArr2 = androidx.datastore.preferences.protobuf.N.f2239n;
            if (!(b2 instanceof androidx.datastore.preferences.protobuf.V)) {
                b2.getClass();
                throw new java.lang.ClassCastException();
            }
            x2 = androidx.datastore.preferences.protobuf.N.x(b2, p3, c3, e0Var3, c0080p, j3);
        }
        androidx.datastore.preferences.protobuf.W w3 = (androidx.datastore.preferences.protobuf.W) concurrentHashMap.putIfAbsent(cls, x2);
        return w3 != null ? w3 : x2;
    }
}
