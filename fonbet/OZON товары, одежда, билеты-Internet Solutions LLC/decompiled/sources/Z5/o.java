package Z5;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final p6.h<a<A>, B> f35539a = new n(500);

    /* loaded from: classes8.dex */
    static final class a<A> {

        /* renamed from: b, reason: collision with root package name */
        private static final ArrayDeque f35540b;

        /* renamed from: a, reason: collision with root package name */
        private A f35541a;

        static {
            int i11 = p6.l.f80283d;
            f35540b = new ArrayDeque(0);
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f35540b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f35541a = obj;
            return aVar;
        }

        public final void b() {
            ArrayDeque arrayDeque = f35540b;
            synchronized (arrayDeque) {
                arrayDeque.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.f35541a.equals(aVar.f35541a);
        }

        public final int hashCode() {
            return this.f35541a.hashCode();
        }
    }

    public final Object a(Object obj) {
        a<A> a11 = a.a(obj);
        B b11 = this.f35539a.b(a11);
        a11.b();
        return b11;
    }

    public final void b(Object obj, Object obj2) {
        this.f35539a.f(a.a(obj), obj2);
    }
}
