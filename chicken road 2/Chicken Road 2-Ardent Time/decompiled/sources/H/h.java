package H;

/* loaded from: classes.dex */
public final class h extends androidx.datastore.preferences.protobuf.AbstractC0086w {
    private static final H.h DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.InterfaceC0087x strings_ = androidx.datastore.preferences.protobuf.U.f2262d;

    static {
        H.h hVar = new H.h();
        DEFAULT_INSTANCE = hVar;
        androidx.datastore.preferences.protobuf.AbstractC0086w.l(H.h.class, hVar);
    }

    public static void n(H.h hVar, java.util.Set set) {
        androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.AbstractC0066b) interfaceC0087x).f2285a) {
            androidx.datastore.preferences.protobuf.U u2 = (androidx.datastore.preferences.protobuf.U) interfaceC0087x;
            int i2 = u2.f2264c;
            hVar.strings_ = u2.c(i2 == 0 ? 10 : i2 * 2);
        }
        java.util.RandomAccess randomAccess = hVar.strings_;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
        set.getClass();
        if (randomAccess instanceof java.util.ArrayList) {
            ((java.util.ArrayList) randomAccess).ensureCapacity(set.size() + ((androidx.datastore.preferences.protobuf.U) randomAccess).f2264c);
        }
        androidx.datastore.preferences.protobuf.U u3 = (androidx.datastore.preferences.protobuf.U) randomAccess;
        int i3 = u3.f2264c;
        for (java.lang.Object obj : set) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (u3.f2264c - i3) + " is null.";
                for (int i4 = u3.f2264c - 1; i4 >= i3; i4--) {
                    u3.remove(i4);
                }
                throw new java.lang.NullPointerException(str);
            }
            u3.add(obj);
        }
    }

    public static H.h o() {
        return DEFAULT_INSTANCE;
    }

    public static H.g q() {
        return (H.g) ((androidx.datastore.preferences.protobuf.AbstractC0084u) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0086w
    public final java.lang.Object e(int i2) {
        switch (H.j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case 3:
                return new H.h();
            case 4:
                return new H.g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s2 = PARSER;
                if (s2 == null) {
                    synchronized (H.h.class) {
                        try {
                            s2 = PARSER;
                            if (s2 == null) {
                                s2 = new androidx.datastore.preferences.protobuf.C0085v();
                                PARSER = s2;
                            }
                        } finally {
                        }
                    }
                }
                return s2;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final androidx.datastore.preferences.protobuf.InterfaceC0087x p() {
        return this.strings_;
    }
}
