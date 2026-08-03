package H;

/* loaded from: classes.dex */
public final class f extends androidx.datastore.preferences.protobuf.AbstractC0086w {
    private static final H.f DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.I preferences_ = androidx.datastore.preferences.protobuf.I.f2234b;

    static {
        H.f fVar = new H.f();
        DEFAULT_INSTANCE = fVar;
        androidx.datastore.preferences.protobuf.AbstractC0086w.l(H.f.class, fVar);
    }

    public static androidx.datastore.preferences.protobuf.I n(H.f fVar) {
        androidx.datastore.preferences.protobuf.I i2 = fVar.preferences_;
        if (!i2.f2235a) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static H.d p() {
        return (H.d) ((androidx.datastore.preferences.protobuf.AbstractC0084u) DEFAULT_INSTANCE.e(5));
    }

    public static H.f q(java.io.FileInputStream fileInputStream) {
        H.f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.C0073i c0073i = new androidx.datastore.preferences.protobuf.C0073i(fileInputStream);
        androidx.datastore.preferences.protobuf.C0079o a2 = androidx.datastore.preferences.protobuf.C0079o.a();
        androidx.datastore.preferences.protobuf.AbstractC0086w k2 = fVar.k();
        try {
            androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
            t.getClass();
            androidx.datastore.preferences.protobuf.W a3 = t.a(k2.getClass());
            androidx.datastore.preferences.protobuf.C0075k c0075k = c0073i.f2323b;
            if (c0075k == null) {
                c0075k = new androidx.datastore.preferences.protobuf.C0075k(c0073i);
            }
            a3.b(k2, c0075k, a2);
            a3.h(k2);
            if (androidx.datastore.preferences.protobuf.AbstractC0086w.h(k2, true)) {
                return (H.f) k2;
            }
            throw new androidx.datastore.preferences.protobuf.A(new androidx.datastore.preferences.protobuf.c0().getMessage());
        } catch (androidx.datastore.preferences.protobuf.A e2) {
            if (e2.f2213a) {
                throw new androidx.datastore.preferences.protobuf.A(e2.getMessage(), e2);
            }
            throw e2;
        } catch (androidx.datastore.preferences.protobuf.c0 e3) {
            throw new androidx.datastore.preferences.protobuf.A(e3.getMessage());
        } catch (java.io.IOException e4) {
            if (e4.getCause() instanceof androidx.datastore.preferences.protobuf.A) {
                throw ((androidx.datastore.preferences.protobuf.A) e4.getCause());
            }
            throw new androidx.datastore.preferences.protobuf.A(e4.getMessage(), e4);
        } catch (java.lang.RuntimeException e5) {
            if (e5.getCause() instanceof androidx.datastore.preferences.protobuf.A) {
                throw ((androidx.datastore.preferences.protobuf.A) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0086w
    public final java.lang.Object e(int i2) {
        switch (H.j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", H.e.f608a});
            case 3:
                return new H.f();
            case 4:
                return new H.d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s2 = PARSER;
                if (s2 == null) {
                    synchronized (H.f.class) {
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

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }
}
