package O7;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class d<T> {

    static final class a extends d<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final a f20015a = new a();

        private Object readResolve() {
            return f20015a;
        }

        @Override // O7.d
        protected final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // O7.d
        protected final int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes9.dex */
    static final class b extends d<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final b f20016a = new b();

        private Object readResolve() {
            return f20016a;
        }

        @Override // O7.d
        protected final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // O7.d
        protected final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected d() {
    }

    public static d<Object> d() {
        return a.f20015a;
    }

    public static d<Object> g() {
        return b.f20016a;
    }

    protected abstract boolean a(T t2, T t11);

    protected abstract int b(T t2);

    public final boolean e(T t2, T t11) {
        if (t2 == t11) {
            return true;
        }
        if (t2 == null || t11 == null) {
            return false;
        }
        return a(t2, t11);
    }

    public final int f(T t2) {
        if (t2 == null) {
            return 0;
        }
        return b(t2);
    }
}
