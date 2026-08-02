package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class J<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f42468a;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0 f42469a;

        /* renamed from: b, reason: collision with root package name */
        public final r0 f42470b;

        /* renamed from: c, reason: collision with root package name */
        public final V2.i f42471c;

        public a(r0 r0Var, r0 r0Var2, V2.i iVar) {
            this.f42469a = r0Var;
            this.f42470b = r0Var2;
            this.f42471c = iVar;
        }
    }

    private J(r0 r0Var, r0 r0Var2, V2.i iVar) {
        this.f42468a = new a<>(r0Var, r0Var2, iVar);
    }

    static <K, V> int b(a<K, V> aVar, K k11, V v11) {
        return C5372s.b(aVar.f42469a, 1, k11) + C5372s.b(aVar.f42470b, 2, v11);
    }

    public static J d(r0 r0Var, r0 r0Var2, V2.i iVar) {
        return new J(r0Var, r0Var2, iVar);
    }

    static <K, V> void e(AbstractC5365k abstractC5365k, a<K, V> aVar, K k11, V v11) throws IOException {
        C5372s.r(abstractC5365k, aVar.f42469a, 1, k11);
        C5372s.r(abstractC5365k, aVar.f42470b, 2, v11);
    }

    public final int a(int i11, K k11, V v11) {
        int h11 = AbstractC5365k.h(i11);
        int b11 = b(this.f42468a, k11, v11);
        return AbstractC5365k.i(b11) + b11 + h11;
    }

    final a<K, V> c() {
        return this.f42468a;
    }
}
