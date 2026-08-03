package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086w extends androidx.datastore.preferences.protobuf.AbstractC0065a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.AbstractC0086w> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected androidx.datastore.preferences.protobuf.d0 unknownFields;

    public AbstractC0086w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = androidx.datastore.preferences.protobuf.d0.f2292f;
    }

    public static androidx.datastore.preferences.protobuf.AbstractC0086w f(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = defaultInstanceMap.get(cls);
        if (abstractC0086w == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0086w = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0086w == null) {
            abstractC0086w = (androidx.datastore.preferences.protobuf.AbstractC0086w) ((androidx.datastore.preferences.protobuf.AbstractC0086w) androidx.datastore.preferences.protobuf.j0.d(cls)).e(6);
            if (abstractC0086w == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0086w);
        }
        return abstractC0086w;
    }

    public static java.lang.Object g(java.lang.reflect.Method method, androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a, java.lang.Object... objArr) {
        try {
            return method.invoke(abstractC0065a, objArr);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.lang.Throwable cause = e3.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, boolean z2) {
        byte byteValue = ((java.lang.Byte) abstractC0086w.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        t.getClass();
        boolean a2 = t.a(abstractC0086w.getClass()).a(abstractC0086w);
        if (z2) {
            abstractC0086w.e(2);
        }
        return a2;
    }

    public static void l(java.lang.Class cls, androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        abstractC0086w.j();
        defaultInstanceMap.put(cls, abstractC0086w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0065a
    public final int a(androidx.datastore.preferences.protobuf.W w2) {
        int f2;
        int f3;
        if (i()) {
            if (w2 == null) {
                androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
                t.getClass();
                f3 = t.a(getClass()).f(this);
            } else {
                f3 = w2.f(this);
            }
            if (f3 >= 0) {
                return f3;
            }
            throw new java.lang.IllegalStateException(B1.a.f(f3, "serialized size must be non-negative, was "));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            androidx.datastore.preferences.protobuf.T t2 = androidx.datastore.preferences.protobuf.T.f2259c;
            t2.getClass();
            f2 = t2.a(getClass()).f(this);
        } else {
            f2 = w2.f(this);
        }
        m(f2);
        return f2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0065a
    public final void b(androidx.datastore.preferences.protobuf.C0077m c0077m) {
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        t.getClass();
        androidx.datastore.preferences.protobuf.W a2 = t.a(getClass());
        androidx.datastore.preferences.protobuf.F f2 = c0077m.f2337a;
        if (f2 == null) {
            f2 = new androidx.datastore.preferences.protobuf.F(c0077m);
        }
        a2.d(this, f2);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract java.lang.Object e(int i2);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        t.getClass();
        return t.a(getClass()).i(this, (androidx.datastore.preferences.protobuf.AbstractC0086w) obj);
    }

    public final int hashCode() {
        if (i()) {
            androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
            t.getClass();
            return t.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            androidx.datastore.preferences.protobuf.T t2 = androidx.datastore.preferences.protobuf.T.f2259c;
            t2.getClass();
            this.memoizedHashCode = t2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final androidx.datastore.preferences.protobuf.AbstractC0086w k() {
        return (androidx.datastore.preferences.protobuf.AbstractC0086w) e(4);
    }

    public final void m(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalStateException(B1.a.f(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final java.lang.String toString() {
        java.lang.String obj = super.toString();
        char[] cArr = androidx.datastore.preferences.protobuf.M.f2238a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(obj);
        androidx.datastore.preferences.protobuf.M.c(this, sb, 0);
        return sb.toString();
    }
}
