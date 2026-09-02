package F;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0005f f80a;

    /* renamed from: b, reason: collision with root package name */
    public G.c f81b;

    /* renamed from: c, reason: collision with root package name */
    public x f82c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f83d;

    /* renamed from: e, reason: collision with root package name */
    public T.a f84e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0007h f85f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f89j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f90k;

    /* renamed from: l, reason: collision with root package name */
    public final C0006g f91l = new C0006g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f88i = false;

    public C0009j(AbstractActivityC0005f abstractActivityC0005f) {
        this.f80a = abstractActivityC0005f;
    }

    public final void a(G.i iVar) {
        String b2 = this.f80a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((K.d) E.b.d().f18a).f279e.f267b;
        }
        H.a aVar = new H.a(b2, this.f80a.e());
        String f2 = this.f80a.f();
        if (f2 == null) {
            AbstractActivityC0005f abstractActivityC0005f = this.f80a;
            abstractActivityC0005f.getClass();
            f2 = d(abstractActivityC0005f.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        iVar.f207b = aVar;
        iVar.f208c = f2;
        iVar.f209d = (List) this.f80a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f80a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f80a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0005f abstractActivityC0005f = this.f80a;
        abstractActivityC0005f.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0005f + " connection to the engine " + abstractActivityC0005f.f73b.f81b + " evicted by another attaching activity");
        C0009j c0009j = abstractActivityC0005f.f73b;
        if (c0009j != null) {
            c0009j.e();
            abstractActivityC0005f.f73b.f();
        }
    }

    public final void c() {
        if (this.f80a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0005f abstractActivityC0005f = this.f80a;
        abstractActivityC0005f.getClass();
        try {
            Bundle g2 = abstractActivityC0005f.g();
            z2 = (g2 == null || !g2.containsKey("flutter_deeplinking_enabled")) ? true : g2.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f85f != null) {
            this.f82c.getViewTreeObserver().removeOnPreDrawListener(this.f85f);
            this.f85f = null;
        }
        x xVar = this.f82c;
        if (xVar != null) {
            xVar.a();
            x xVar2 = this.f82c;
            xVar2.f128g.remove(this.f91l);
        }
    }

    public final void f() {
        if (this.f89j) {
            c();
            this.f80a.getClass();
            this.f80a.getClass();
            AbstractActivityC0005f abstractActivityC0005f = this.f80a;
            abstractActivityC0005f.getClass();
            if (abstractActivityC0005f.isChangingConfigurations()) {
                G.e eVar = this.f81b.f153d;
                if (eVar.f()) {
                    V.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f179a = true;
                        for (S.a aVar : ((HashMap) eVar.f181c).values()) {
                            aVar.f375b.f175c.remove(aVar);
                            aVar.f375b = null;
                        }
                        eVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f81b.f153d.c();
            }
            io.flutter.plugin.platform.e eVar2 = this.f83d;
            if (eVar2 != null) {
                eVar2.f669b.f5d = null;
                this.f83d = null;
            }
            T.a aVar2 = this.f84e;
            if (aVar2 != null) {
                aVar2.f380c.f114c = null;
                aVar2.f378a = null;
                this.f84e = null;
            }
            this.f80a.getClass();
            G.c cVar = this.f81b;
            if (cVar != null) {
                O.d dVar = cVar.f156g;
                dVar.a(1, dVar.f287c);
            }
            if (this.f80a.i()) {
                G.c cVar2 = this.f81b;
                FlutterJNI flutterJNI = cVar2.f150a;
                Iterator it = cVar2.v.iterator();
                while (it.hasNext()) {
                    ((G.b) it.next()).b();
                }
                G.e eVar3 = cVar2.f153d;
                eVar3.e();
                HashMap hashMap = (HashMap) eVar3.f180b;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    M.a aVar3 = (M.a) hashMap.get(cls);
                    if (aVar3 != null) {
                        V.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar3 instanceof S.a) {
                                if (eVar3.f()) {
                                    S.a aVar4 = (S.a) aVar3;
                                    aVar4.f375b.f175c.remove(aVar4);
                                    aVar4.f375b = null;
                                }
                                ((HashMap) eVar3.f181c).remove(cls);
                            }
                            aVar3.b((C.a) eVar3.f184f);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                io.flutter.plugin.platform.k kVar = cVar2.f168s;
                SparseArray sparseArray = kVar.f700l;
                while (sparseArray.size() > 0) {
                    kVar.v.l(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.j jVar = cVar2.f169t;
                SparseArray sparseArray2 = jVar.f682h;
                while (sparseArray2.size() > 0) {
                    jVar.f689o.d(sparseArray2.keyAt(0));
                }
                cVar2.f152c.f220b.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar2.f172x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                E.b.d().getClass();
                G.c.f149z.remove(Long.valueOf(cVar2.f171w));
                if (this.f80a.d() != null) {
                    if (G.k.f214c == null) {
                        G.k.f214c = new G.k(1);
                    }
                    G.k kVar2 = G.k.f214c;
                    kVar2.f215a.remove(this.f80a.d());
                }
                this.f81b = null;
            }
            this.f89j = false;
        }
    }
}
