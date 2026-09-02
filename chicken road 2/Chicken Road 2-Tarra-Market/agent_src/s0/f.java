package s0;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r.C0825a;
import u0.C0839a;
import z0.C0865a;
import z0.InterfaceC0866b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public d f6514a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterEngine f6515b;

    /* renamed from: c, reason: collision with root package name */
    public o f6516c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f6517d;

    /* renamed from: e, reason: collision with root package name */
    public H0.b f6518e;

    /* renamed from: f, reason: collision with root package name */
    public e f6519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6520g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6521h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6523j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f6524k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f6525l = new io.flutter.embedding.engine.renderer.a(1, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f6522i = false;

    public f(d dVar) {
        this.f6514a = dVar;
    }

    public final void a(t0.f fVar) {
        String c2 = this.f6514a.c();
        if (c2 == null || c2.isEmpty()) {
            c2 = ((x0.d) C0.b.i().f54b).f6791e.f6779b;
        }
        C0839a c0839a = new C0839a(c2, this.f6514a.f());
        String g2 = this.f6514a.g();
        if (g2 == null) {
            d dVar = this.f6514a;
            dVar.getClass();
            g2 = d(dVar.getIntent());
            if (g2 == null) {
                g2 = "/";
            }
        }
        fVar.f6684b = c0839a;
        fVar.f6685c = g2;
        fVar.f6686d = (List) this.f6514a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f6514a.j()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f6514a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        d dVar = this.f6514a;
        dVar.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + dVar + " connection to the engine " + dVar.f6509b.f6515b + " evicted by another attaching activity");
        f fVar = dVar.f6509b;
        if (fVar != null) {
            fVar.e();
            dVar.f6509b.f();
        }
    }

    public final void c() {
        if (this.f6514a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        d dVar = this.f6514a;
        dVar.getClass();
        try {
            Bundle h2 = dVar.h();
            z2 = (h2 == null || !h2.containsKey("flutter_deeplinking_enabled")) ? true : h2.getBoolean("flutter_deeplinking_enabled");
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
        if (this.f6519f != null) {
            this.f6516c.getViewTreeObserver().removeOnPreDrawListener(this.f6519f);
            this.f6519f = null;
        }
        o oVar = this.f6516c;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.f6516c;
            oVar2.f6557g.remove(this.f6525l);
        }
    }

    public final void f() {
        if (this.f6523j) {
            c();
            this.f6514a.getClass();
            this.f6514a.getClass();
            d dVar = this.f6514a;
            dVar.getClass();
            if (dVar.isChangingConfigurations()) {
                C0825a c0825a = this.f6515b.f5722d;
                if (c0825a.f()) {
                    J0.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c0825a.f6445a = true;
                        Iterator it = ((HashMap) c0825a.f6450f).values().iterator();
                        while (it.hasNext()) {
                            ((A0.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        c0825a.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f6515b.f5722d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f6517d;
            if (eVar != null) {
                eVar.f5859b.f524c = null;
                this.f6517d = null;
            }
            H0.b bVar = this.f6518e;
            if (bVar != null) {
                ((C0.a) bVar.f182d).f51b = null;
                bVar.f181c = null;
                this.f6518e = null;
            }
            this.f6514a.getClass();
            FlutterEngine flutterEngine = this.f6515b;
            if (flutterEngine != null) {
                C0.h hVar = flutterEngine.f5725g;
                hVar.a(1, hVar.f63c);
            }
            if (this.f6514a.j()) {
                FlutterEngine flutterEngine2 = this.f6515b;
                Iterator it2 = flutterEngine2.f5740v.iterator();
                while (it2.hasNext()) {
                    ((t0.b) it2.next()).b();
                }
                C0825a c0825a2 = flutterEngine2.f5722d;
                c0825a2.e();
                HashMap hashMap = (HashMap) c0825a2.f6446b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC0866b interfaceC0866b = (InterfaceC0866b) hashMap.get(cls);
                    if (interfaceC0866b != null) {
                        J0.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0866b instanceof A0.a) {
                                if (c0825a2.f()) {
                                    ((A0.a) interfaceC0866b).onDetachedFromActivity();
                                }
                                ((HashMap) c0825a2.f6450f).remove(cls);
                            }
                            interfaceC0866b.onDetachedFromEngine((C0865a) c0825a2.f6449e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.j jVar = flutterEngine2.f5737s;
                    SparseArray sparseArray = jVar.f5888k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    jVar.f5898u.n(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.i iVar = flutterEngine2.f5738t;
                    SparseArray sparseArray2 = iVar.f5870g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    iVar.f5877n.n(sparseArray2.keyAt(0));
                }
                flutterEngine2.f5721c.f6697a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = flutterEngine2.f5719a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f5742x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0.b.i().getClass();
                FlutterEngine.f5718z.remove(Long.valueOf(flutterEngine2.f5741w));
                if (this.f6514a.e() != null) {
                    if (t0.h.f6691c == null) {
                        t0.h.f6691c = new t0.h(2);
                    }
                    t0.h hVar2 = t0.h.f6691c;
                    hVar2.f6692a.remove(this.f6514a.e());
                }
                this.f6515b = null;
            }
            this.f6523j = false;
        }
    }
}
