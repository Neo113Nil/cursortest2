package S6;

import S6.n;
import Z6.z;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
final class k extends v {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<Executor> f25921a;

    /* renamed from: b, reason: collision with root package name */
    private U6.c f25922b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a f25923c;

    /* renamed from: d, reason: collision with root package name */
    private z f25924d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<String> f25925e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<Z6.r> f25926f;

    /* renamed from: g, reason: collision with root package name */
    private X6.g f25927g;

    /* renamed from: h, reason: collision with root package name */
    private X6.d f25928h;

    /* renamed from: i, reason: collision with root package name */
    private Y6.n f25929i;

    /* renamed from: j, reason: collision with root package name */
    private Y6.p f25930j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<u> f25931k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f25932a;

        public final k a() {
            Context context = this.f25932a;
            if (context != null) {
                return new k(context);
            }
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }

        public final a b(Context context) {
            context.getClass();
            this.f25932a = context;
            return this;
        }
    }

    k(Context context) {
        n nVar;
        nVar = n.a.f25935a;
        this.f25921a = U6.a.a(nVar);
        U6.c a11 = U6.c.a(context);
        this.f25922b = a11;
        this.f25923c = U6.a.a(new T6.l(this.f25922b, new T6.j(a11, b7.b.a(), b7.c.a())));
        this.f25924d = new z(this.f25922b, Z6.f.a(), Z6.h.a());
        this.f25925e = U6.a.a(new Z6.g(this.f25922b));
        this.f25926f = U6.a.a(new Z6.s(b7.b.a(), b7.c.a(), Z6.i.a(), this.f25924d, this.f25925e));
        X6.g gVar = new X6.g(this.f25922b, this.f25926f, new X6.f(), b7.c.a());
        this.f25927g = gVar;
        Pc.a<Executor> aVar = this.f25921a;
        Pc.a aVar2 = this.f25923c;
        Pc.a<Z6.r> aVar3 = this.f25926f;
        this.f25928h = new X6.d(aVar, aVar2, gVar, aVar3, aVar3);
        U6.c cVar = this.f25922b;
        b7.b a12 = b7.b.a();
        b7.c a13 = b7.c.a();
        Pc.a<Z6.r> aVar4 = this.f25926f;
        this.f25929i = new Y6.n(cVar, aVar2, aVar3, gVar, aVar, aVar3, a12, a13, aVar4);
        this.f25930j = new Y6.p(this.f25921a, aVar4, this.f25927g, aVar4);
        this.f25931k = U6.a.a(new w(b7.b.a(), b7.c.a(), this.f25928h, this.f25929i, this.f25930j));
    }

    @Override // S6.v
    final Z6.d c() {
        return this.f25926f.get();
    }

    final u d() {
        return this.f25931k.get();
    }
}
