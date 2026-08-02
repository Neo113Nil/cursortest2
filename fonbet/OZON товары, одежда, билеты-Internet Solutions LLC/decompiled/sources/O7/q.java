package O7;

import T7.E;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class q {

    static class a<T> implements p<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private transient Object f20039a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final p<T> f20040b;

        /* renamed from: c, reason: collision with root package name */
        volatile transient boolean f20041c;

        /* renamed from: d, reason: collision with root package name */
        transient T f20042d;

        a(p<T> pVar) {
            this.f20040b = pVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f20039a = new Object();
        }

        @Override // O7.p
        public final T get() {
            if (!this.f20041c) {
                synchronized (this.f20039a) {
                    try {
                        if (!this.f20041c) {
                            T t2 = this.f20040b.get();
                            this.f20042d = t2;
                            this.f20041c = true;
                            return t2;
                        }
                    } finally {
                    }
                }
            }
            return this.f20042d;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (this.f20041c) {
                obj = E.c(this.f20042d, ">", new StringBuilder("<supplier that returned "));
            } else {
                obj = this.f20040b;
            }
            return E.c(obj, ")", sb2);
        }
    }

    static class b<T> implements p<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final r f20043d = new r();

        /* renamed from: a, reason: collision with root package name */
        private final Object f20044a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private volatile p<T> f20045b;

        /* renamed from: c, reason: collision with root package name */
        private T f20046c;

        b(p<T> pVar) {
            this.f20045b = pVar;
        }

        @Override // O7.p
        public final T get() {
            p<T> pVar = this.f20045b;
            r rVar = f20043d;
            if (pVar != rVar) {
                synchronized (this.f20044a) {
                    try {
                        if (this.f20045b != rVar) {
                            T t2 = this.f20045b.get();
                            this.f20046c = t2;
                            this.f20045b = rVar;
                            return t2;
                        }
                    } finally {
                    }
                }
            }
            return this.f20046c;
        }

        public final String toString() {
            Object obj = this.f20045b;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (obj == f20043d) {
                obj = E.c(this.f20046c, ">", new StringBuilder("<supplier that returned "));
            }
            return E.c(obj, ")", sb2);
        }
    }

    private static class c<T> implements p<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final T f20047a;

        c(T t2) {
            this.f20047a = t2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return h.b(this.f20047a, ((c) obj).f20047a);
            }
            return false;
        }

        @Override // O7.p
        public final T get() {
            return this.f20047a;
        }

        public final int hashCode() {
            return h.d(this.f20047a);
        }

        public final String toString() {
            return E.c(this.f20047a, ")", new StringBuilder("Suppliers.ofInstance("));
        }
    }

    public static <T> p<T> a(p<T> pVar) {
        return ((pVar instanceof b) || (pVar instanceof a)) ? pVar : pVar instanceof Serializable ? new a(pVar) : new b(pVar);
    }

    public static <T> p<T> b(T t2) {
        return new c(t2);
    }
}
