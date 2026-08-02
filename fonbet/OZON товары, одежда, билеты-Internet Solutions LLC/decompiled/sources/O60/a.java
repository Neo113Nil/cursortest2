package O60;

import F90.f;
import Jb.j;
import O60.d;
import P60.g;
import P60.m;
import P60.o;
import P60.r;
import P60.t;
import android.content.Context;
import com.squareup.moshi.Moshi;

/* loaded from: classes3.dex */
final class a implements N60.a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f19999a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Context> f20000b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<g> f20001c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<o> f20002d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Moshi> f20003e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<Q90.c> f20004f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<P60.d> f20005g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<r> f20006h;

    /* renamed from: O60.a$a, reason: collision with other inner class name */
    private static final class C0398a implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f20007a;

        C0398a(O90.a aVar) {
            this.f20007a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f20007a.F0();
            j.c(F02);
            return F02;
        }
    }

    private static final class b implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f20008a;

        b(P30.b bVar) {
            this.f20008a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f20008a.h();
            j.c(h11);
            return h11;
        }
    }

    a(O90.a aVar, P30.b bVar, Y20.a aVar2) {
        d dVar;
        this.f19999a = aVar2;
        b bVar2 = new b(bVar);
        this.f20000b = bVar2;
        Pc.a<g> b11 = Jb.d.b(new m(bVar2));
        this.f20001c = b11;
        this.f20002d = Jb.d.b(new I50.c(this.f20000b, b11, 1));
        dVar = d.a.f20010a;
        Pc.a<Moshi> a11 = Jb.m.a(dVar);
        this.f20003e = a11;
        C0398a c0398a = new C0398a(aVar);
        this.f20004f = c0398a;
        this.f20005g = Jb.d.b(new f(a11, c0398a, this.f20001c, 1));
        this.f20006h = Jb.d.b(new t(this.f20001c, 0));
    }

    @Override // N60.a
    public final r Y0() {
        return this.f20006h.get();
    }

    @Override // N60.a
    public final o b1() {
        return this.f20002d.get();
    }

    @Override // N60.a
    public final P60.d k1() {
        return this.f20005g.get();
    }
}
