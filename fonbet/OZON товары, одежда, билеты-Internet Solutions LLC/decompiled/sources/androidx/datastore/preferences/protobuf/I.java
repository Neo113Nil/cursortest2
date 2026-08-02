package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class I {

    /* renamed from: b, reason: collision with root package name */
    private static final a f42464b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c f42465a;

    final class a implements P {
        @Override // androidx.datastore.preferences.protobuf.P
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        public final O messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42466a;

        static {
            int[] iArr = new int[b0.values().length];
            f42466a = iArr;
            try {
                iArr[b0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements P {

        /* renamed from: a, reason: collision with root package name */
        private P[] f42467a;

        c(P... pArr) {
            this.f42467a = pArr;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        public final boolean isSupported(Class<?> cls) {
            for (P p11 : this.f42467a) {
                if (p11.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        public final O messageInfoFor(Class<?> cls) {
            for (P p11 : this.f42467a) {
                if (p11.isSupported(cls)) {
                    return p11.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public I() {
        C5375v a11 = C5375v.a();
        int i11 = c0.f42503d;
        Object obj = f42464b;
        try {
            obj = (P) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        c cVar = new c(a11, obj);
        byte[] bArr = C5378y.f42629b;
        this.f42465a = cVar;
    }

    public final <T> f0<T> a(Class<T> cls) {
        g0.k(cls);
        O messageInfoFor = this.f42465a.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            int i11 = c0.f42503d;
            return AbstractC5376w.class.isAssignableFrom(cls) ? V.f(g0.n(), r.b(), messageInfoFor.getDefaultInstance()) : V.f(g0.m(), r.a(), messageInfoFor.getDefaultInstance());
        }
        int i12 = c0.f42503d;
        if (AbstractC5376w.class.isAssignableFrom(cls)) {
            X b11 = Y.b();
            F b12 = G.b();
            o0 n11 = g0.n();
            C5371q b13 = b.f42466a[messageInfoFor.getSyntax().ordinal()] != 1 ? r.b() : null;
            M b14 = N.b();
            int i13 = U.f42479r;
            if (messageInfoFor instanceof e0) {
                return U.u((e0) messageInfoFor, b11, b12, n11, b13, b14);
            }
            throw null;
        }
        W a11 = Y.a();
        E a12 = G.a();
        m0<?, ?> m11 = g0.m();
        AbstractC5370p<?> a13 = b.f42466a[messageInfoFor.getSyntax().ordinal()] != 1 ? r.a() : null;
        L a14 = N.a();
        int i14 = U.f42479r;
        if (messageInfoFor instanceof e0) {
            return U.u((e0) messageInfoFor, a11, a12, m11, a13, a14);
        }
        throw null;
    }
}
