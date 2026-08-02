package I80;

import Jb.d;
import Jb.f;
import K80.i;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: I80.a$a, reason: collision with other inner class name */
    private static final class C0232a implements I80.b {
        @Override // I80.b
        public final H80.a a(P30.b bVar, K80.a aVar) {
            bVar.getClass();
            aVar.getClass();
            return new b(aVar);
        }
    }

    private static final class b implements H80.a {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<K80.b> f12001a;

        b(K80.a aVar) {
            this.f12001a = d.b(new i(f.a(aVar), 0));
        }

        @Override // H80.a
        public final K80.b u0() {
            return this.f12001a.get();
        }
    }

    public static I80.b a() {
        return new C0232a();
    }
}
