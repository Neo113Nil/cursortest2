package Mc;

import Dc.C2851b;
import Dc.o;
import Dc.p;
import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final x f17816a = C3493a.e(new h());

    /* renamed from: b, reason: collision with root package name */
    static final x f17817b = C3493a.b(new b());

    /* renamed from: c, reason: collision with root package name */
    static final x f17818c = C3493a.c(new c());

    /* renamed from: d, reason: collision with root package name */
    static final p f17819d = p.g();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17820e = 0;

    /* renamed from: Mc.a$a, reason: collision with other inner class name */
    static final class C0343a {

        /* renamed from: a, reason: collision with root package name */
        static final C2851b f17821a = new C2851b();
    }

    static final class b implements Callable<x> {
        @Override // java.util.concurrent.Callable
        public final x call() throws Exception {
            return C0343a.f17821a;
        }
    }

    static final class c implements Callable<x> {
        @Override // java.util.concurrent.Callable
        public final x call() throws Exception {
            return d.f17822a;
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final Dc.f f17822a = new Dc.f();
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final Dc.g f17823a = new Dc.g();
    }

    static final class f implements Callable<x> {
        @Override // java.util.concurrent.Callable
        public final x call() throws Exception {
            return e.f17823a;
        }
    }

    static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final o f17824a = new o();
    }

    static final class h implements Callable<x> {
        @Override // java.util.concurrent.Callable
        public final x call() throws Exception {
            return g.f17824a;
        }
    }

    static {
        C3493a.d(new f());
    }

    public static x a() {
        return f17817b;
    }

    public static x b() {
        return f17818c;
    }

    public static x c() {
        return f17816a;
    }

    public static p d() {
        return f17819d;
    }
}
