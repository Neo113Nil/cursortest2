package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class P {

    public static final class a<T> extends AbstractC0953a<T> {
        public static final a d = new a(new Object[0]);
        public final T[] c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object[] objArr) {
            super(objArr.length, 0);
            this.c = objArr;
        }

        @Override // com.google.common.collect.AbstractC0953a
        public final T a(int i) {
            return this.c[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements Iterator<Object> {
        public static final b a;
        public static final /* synthetic */ b[] b;

        static {
            b bVar = new b("INSTANCE", 0);
            a = bVar;
            b = new b[]{bVar};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) b.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.k.i(false, "no calls to next() since the last call to remove()");
        }
    }

    public static final class c<T> extends y0<T> {
        public final T a;
        public boolean b;

        public c(T t) {
            this.a = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b) {
                throw new NoSuchElementException();
            }
            this.b = true;
            return this.a;
        }
    }

    public static void a(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean b(v0 v0Var, Object obj) {
        Iterator<? extends F> it = v0Var.a;
        if (obj == null) {
            while (it.hasNext()) {
                if (v0Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(v0Var.next())) {
                return true;
            }
        }
        return false;
    }
}
