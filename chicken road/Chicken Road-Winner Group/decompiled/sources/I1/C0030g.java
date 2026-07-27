package I1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import b2.AbstractC0164a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: I1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0027d f605a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterEngine f606b;

    /* renamed from: c, reason: collision with root package name */
    public q f607c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f608d;

    /* renamed from: e, reason: collision with root package name */
    public X1.a f609e;
    public ViewTreeObserverOnPreDrawListenerC0029f f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f610g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f611h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f613j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f614k;

    /* renamed from: l, reason: collision with root package name */
    public final C0028e f615l = new C0028e(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f612i = false;

    public C0030g(AbstractActivityC0027d abstractActivityC0027d) {
        this.f605a = abstractActivityC0027d;
    }

    public final void a(J1.g gVar) {
        String c3 = this.f605a.c();
        if (c3 == null || c3.isEmpty()) {
            c3 = ((N1.d) A0.j.F().f66b).f1002e.f989b;
        }
        K1.a aVar = new K1.a(c3, this.f605a.g());
        String h3 = this.f605a.h();
        if (h3 == null) {
            AbstractActivityC0027d abstractActivityC0027d = this.f605a;
            abstractActivityC0027d.getClass();
            h3 = d(abstractActivityC0027d.getIntent());
            if (h3 == null) {
                h3 = "/";
            }
        }
        gVar.f722b = aVar;
        gVar.f723c = h3;
        gVar.f724d = (List) this.f605a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f605a.k()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f605a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0027d abstractActivityC0027d = this.f605a;
        abstractActivityC0027d.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0027d + " connection to the engine " + abstractActivityC0027d.f598b.f606b + " evicted by another attaching activity");
        C0030g c0030g = abstractActivityC0027d.f598b;
        if (c0030g != null) {
            c0030g.e();
            abstractActivityC0027d.f598b.f();
        }
    }

    public final void c() {
        if (this.f605a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z3;
        Uri data;
        AbstractActivityC0027d abstractActivityC0027d = this.f605a;
        abstractActivityC0027d.getClass();
        try {
            Bundle i3 = abstractActivityC0027d.i();
            z3 = (i3 == null || !i3.containsKey("flutter_deeplinking_enabled")) ? true : i3.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z3 = false;
        }
        if (!z3 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f != null) {
            this.f607c.getViewTreeObserver().removeOnPreDrawListener(this.f);
            this.f = null;
        }
        q qVar = this.f607c;
        if (qVar != null) {
            qVar.a();
            q qVar2 = this.f607c;
            qVar2.f647g.remove(this.f615l);
        }
    }

    public final void f() {
        if (this.f613j) {
            c();
            this.f605a.getClass();
            this.f605a.getClass();
            AbstractActivityC0027d abstractActivityC0027d = this.f605a;
            abstractActivityC0027d.getClass();
            if (abstractActivityC0027d.isChangingConfigurations()) {
                J1.c cVar = this.f606b.f9101d;
                if (cVar.f()) {
                    AbstractC0164a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        cVar.f696a = true;
                        Iterator it = ((HashMap) cVar.f698c).values().iterator();
                        while (it.hasNext()) {
                            ((Q1.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        cVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f606b.f9101d.c();
            }
            io.flutter.plugin.platform.f fVar = this.f608d;
            if (fVar != null) {
                fVar.f9257b.f1789c = null;
                this.f608d = null;
            }
            X1.a aVar = this.f609e;
            if (aVar != null) {
                ((b0.i) aVar.f1634c).f2461b = null;
                aVar.f1633b = null;
                this.f609e = null;
            }
            this.f605a.getClass();
            FlutterEngine flutterEngine = this.f606b;
            if (flutterEngine != null) {
                S1.a aVar2 = flutterEngine.f9103g;
                aVar2.a(1, aVar2.f1385c);
            }
            if (this.f605a.k()) {
                FlutterEngine flutterEngine2 = this.f606b;
                Iterator it2 = flutterEngine2.f9118v.iterator();
                while (it2.hasNext()) {
                    ((J1.b) it2.next()).a();
                }
                J1.c cVar2 = flutterEngine2.f9101d;
                cVar2.e();
                HashMap hashMap = (HashMap) cVar2.f697b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    P1.b bVar = (P1.b) hashMap.get(cls);
                    if (bVar != null) {
                        AbstractC0164a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof Q1.a) {
                                if (cVar2.f()) {
                                    ((Q1.a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) cVar2.f698c).remove(cls);
                            }
                            bVar.onDetachedFromEngine((P1.a) cVar2.f);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.r rVar = flutterEngine2.f9115s;
                    SparseArray sparseArray = rVar.f9311l;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    rVar.f9322w.n(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.q qVar = flutterEngine2.f9116t;
                    SparseArray sparseArray2 = qVar.f9291i;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    qVar.f9299q.n(sparseArray2.keyAt(0));
                }
                flutterEngine2.f9100c.f921a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = flutterEngine2.f9098a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f9120x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                A0.j.F().getClass();
                FlutterEngine.f9097z.remove(Long.valueOf(flutterEngine2.f9119w));
                if (this.f605a.f() != null) {
                    if (b0.i.f2459c == null) {
                        b0.i.f2459c = new b0.i(5);
                    }
                    b0.i iVar = b0.i.f2459c;
                    ((HashMap) iVar.f2461b).remove(this.f605a.f());
                }
                this.f606b = null;
            }
            this.f613j = false;
        }
    }
}
