package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class t {

    public static class a<T> implements s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public transient Object a = new Object();
        public final s<T> b;
        public volatile transient boolean c;
        public transient T d;

        public a(s<T> sVar) {
            this.b = sVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.a = new Object();
        }

        @Override // com.google.common.base.s
        public final T get() {
            if (!this.c) {
                synchronized (this.a) {
                    try {
                        if (!this.c) {
                            T t = this.b.get();
                            this.d = t;
                            this.c = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.d;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.c) {
                obj = "<supplier that returned " + this.d + ">";
            } else {
                obj = this.b;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b<T> implements s<T> {
        public static final u d = new u();
        public final Object a = new Object();
        public volatile s<T> b;
        public T c;

        public b(s<T> sVar) {
            this.b = sVar;
        }

        @Override // com.google.common.base.s
        public final T get() {
            s<T> sVar = this.b;
            u uVar = d;
            if (sVar != uVar) {
                synchronized (this.a) {
                    try {
                        if (this.b != uVar) {
                            T t = this.b.get();
                            this.c = t;
                            this.b = uVar;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.c;
        }

        public final String toString() {
            Object obj = this.b;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == d) {
                obj = "<supplier that returned " + this.c + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class c<T> implements s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final T a;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return i.a(this.a, ((c) obj).a);
            }
            return false;
        }

        @Override // com.google.common.base.s
        public final T get() {
            return this.a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.a + ")";
        }
    }

    public static <T> s<T> a(s<T> sVar) {
        return !(sVar instanceof b) ? sVar instanceof a ? sVar : sVar instanceof Serializable ? new a(sVar) : new b(sVar) : sVar;
    }
}
