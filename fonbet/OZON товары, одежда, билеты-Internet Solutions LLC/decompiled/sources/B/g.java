package B;

import C.InterfaceC2689i;
import I.k;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.m;
import java.util.concurrent.Executor;
import u.C9887a;
import v.C10112l;
import v.C10132s;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private final C10132s f1313c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f1314d;

    /* renamed from: g, reason: collision with root package name */
    b.a<Void> f1317g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1311a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1312b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f1315e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private C9887a.C2193a f1316f = new C9887a.C2193a();

    public g(@NonNull C10132s c10132s, @NonNull Executor executor) {
        this.f1313c = c10132s;
        this.f1314d = executor;
    }

    public static void a(g gVar, b.a aVar) {
        gVar.f1312b = true;
        InterfaceC2689i.a aVar2 = new InterfaceC2689i.a("Camera2CameraControl was updated with new options.");
        b.a<Void> aVar3 = gVar.f1317g;
        if (aVar3 != null) {
            aVar3.e(aVar2);
            gVar.f1317g = null;
        }
        gVar.f1317g = aVar;
        if (gVar.f1311a) {
            C10132s c10132s = gVar.f1313c;
            c10132s.getClass();
            k.i(androidx.concurrent.futures.b.a(new C10112l(c10132s))).a(new e(gVar), gVar.f1314d);
            gVar.f1312b = false;
        }
    }

    public static void b(g gVar, boolean z11) {
        if (gVar.f1311a == z11) {
            return;
        }
        gVar.f1311a = z11;
        if (z11) {
            if (gVar.f1312b) {
                C10132s c10132s = gVar.f1313c;
                c10132s.getClass();
                k.i(androidx.concurrent.futures.b.a(new C10112l(c10132s))).a(new e(gVar), gVar.f1314d);
                gVar.f1312b = false;
                return;
            }
            return;
        }
        InterfaceC2689i.a aVar = new InterfaceC2689i.a("The camera control has became inactive.");
        b.a<Void> aVar2 = gVar.f1317g;
        if (aVar2 != null) {
            aVar2.e(aVar);
            gVar.f1317g = null;
        }
    }

    public static void c(g gVar, b.a aVar) {
        gVar.f1312b = true;
        InterfaceC2689i.a aVar2 = new InterfaceC2689i.a("Camera2CameraControl was updated with new options.");
        b.a<Void> aVar3 = gVar.f1317g;
        if (aVar3 != null) {
            aVar3.e(aVar2);
            gVar.f1317g = null;
        }
        gVar.f1317g = aVar;
        if (gVar.f1311a) {
            C10132s c10132s = gVar.f1313c;
            c10132s.getClass();
            k.i(androidx.concurrent.futures.b.a(new C10112l(c10132s))).a(new e(gVar), gVar.f1314d);
            gVar.f1312b = false;
        }
    }

    @NonNull
    public final m<Void> d(@NonNull j jVar) {
        synchronized (this.f1315e) {
            this.f1316f.d(jVar, T.b.OPTIONAL);
        }
        return k.i(androidx.concurrent.futures.b.a(new b.c() { // from class: B.a
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                g gVar = g.this;
                gVar.getClass();
                gVar.f1314d.execute(new f(0, gVar, aVar));
                return "addCaptureRequestOptions";
            }
        }));
    }

    public final void e(@NonNull C9887a.C2193a c2193a) {
        synchronized (this.f1315e) {
            c2193a.d(this.f1316f.a(), T.b.ALWAYS_OVERRIDE);
        }
    }

    @NonNull
    public final m<Void> f() {
        synchronized (this.f1315e) {
            this.f1316f = new C9887a.C2193a();
        }
        return k.i(androidx.concurrent.futures.b.a(new b.c() { // from class: B.c
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                g gVar = g.this;
                gVar.getClass();
                gVar.f1314d.execute(new d(0, gVar, aVar));
                return "clearCaptureRequestOptions";
            }
        }));
    }

    @NonNull
    public final C9887a g() {
        C9887a c11;
        synchronized (this.f1315e) {
            c11 = this.f1316f.c();
        }
        return c11;
    }

    public final void h(final boolean z11) {
        this.f1314d.execute(new Runnable() { // from class: B.b
            @Override // java.lang.Runnable
            public final void run() {
                g.b(g.this, z11);
            }
        });
    }
}
