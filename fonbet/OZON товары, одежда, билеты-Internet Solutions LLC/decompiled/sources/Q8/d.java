package Q8;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
final class d<T> implements f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f23029a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f23030b;

    final class a implements c<String> {
        @Override // Q8.d.c
        public final String a(M8.g gVar) {
            return gVar.e();
        }
    }

    final class b implements c<Integer> {
        @Override // Q8.d.c
        public final Integer a(M8.g gVar) {
            return Integer.valueOf(gVar.a());
        }
    }

    interface c<T> {
        T a(M8.g gVar);
    }

    private d(c<T> cVar) {
        this.f23030b = cVar;
    }

    static d<Integer> b() {
        return new d<>(new b());
    }

    static d<String> c() {
        return new d<>(new a());
    }

    @Override // Q8.f
    public final void a(M8.g gVar) {
        this.f23029a.put(this.f23030b.a(gVar), gVar);
    }

    final c<T> d() {
        return this.f23030b;
    }

    final M8.g e(T t2) {
        if (t2 != null) {
            return (M8.g) this.f23029a.get(t2);
        }
        return null;
    }
}
