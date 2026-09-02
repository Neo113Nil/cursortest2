package G;

import F.AbstractActivityC0005f;
import F.C0009j;
import F.t;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o.AbstractC0074f;
import o.InterfaceC0073e;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f179a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f180b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f181c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f182d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f183e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f184f;

    /* renamed from: g, reason: collision with root package name */
    public Object f185g;

    /* renamed from: h, reason: collision with root package name */
    public Object f186h;

    public e(Context context, c cVar, K.d dVar) {
        this.f180b = new HashMap();
        this.f181c = new HashMap();
        this.f179a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f182d = cVar;
        this.f183e = dVar;
        H.b bVar = cVar.f152c;
        k kVar = cVar.f168s.f690b;
        this.f184f = new C.a(3, context, bVar);
    }

    public void a(M.a aVar) {
        HashMap hashMap = (HashMap) this.f180b;
        V.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(aVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + ((c) this.f182d) + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            hashMap.put(aVar.getClass(), aVar);
            aVar.a((C.a) this.f184f);
            if (aVar instanceof S.a) {
                S.a aVar2 = (S.a) aVar;
                ((HashMap) this.f181c).put(aVar.getClass(), aVar2);
                if (f()) {
                    d dVar = (d) this.f186h;
                    aVar2.f375b = dVar;
                    dVar.f175c.add(aVar2);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(AbstractActivityC0005f abstractActivityC0005f, androidx.lifecycle.j jVar) {
        this.f186h = new d(abstractActivityC0005f, jVar);
        Intent intent = abstractActivityC0005f.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = g.f197h.f188b;
        } else {
            boolean z2 = ((K.d) this.f183e).f275a;
        }
        c cVar = (c) this.f182d;
        cVar.f168s.getClass();
        C.a aVar = cVar.f170u;
        io.flutter.embedding.engine.renderer.h hVar = cVar.f151b;
        H.b bVar = cVar.f152c;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) aVar.f4c;
        if (kVar.f691c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f691c = abstractActivityC0005f;
        kVar.f694f = hVar;
        kVar.f696h = new t(bVar, 14);
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) aVar.f5d;
        if (jVar2.f677c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f677c = abstractActivityC0005f;
        t tVar = new t(bVar, 13);
        jVar2.f680f = tVar;
        tVar.f114c = jVar2.f689o;
        kVar.f696h.f114c = aVar;
        for (S.a aVar2 : ((HashMap) this.f181c).values()) {
            if (this.f179a) {
                d dVar = (d) this.f186h;
                aVar2.f375b = dVar;
                dVar.f175c.add(aVar2);
            } else {
                d dVar2 = (d) this.f186h;
                aVar2.f375b = dVar2;
                dVar2.f175c.add(aVar2);
            }
        }
        this.f179a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        V.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (S.a aVar : ((HashMap) this.f181c).values()) {
                aVar.f375b.f175c.remove(aVar);
                aVar.f375b = null;
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        c cVar = (c) this.f182d;
        io.flutter.plugin.platform.k kVar = cVar.f168s;
        t tVar = kVar.f696h;
        if (tVar != null) {
            tVar.f114c = null;
        }
        kVar.b();
        kVar.f696h = null;
        kVar.f691c = null;
        kVar.f694f = null;
        io.flutter.plugin.platform.j jVar = cVar.f169t;
        t tVar2 = jVar.f680f;
        if (tVar2 != null) {
            tVar2.f114c = null;
        }
        Surface surface = jVar.f686l;
        if (surface != null) {
            surface.release();
            jVar.f686l = null;
            jVar.f687m = null;
        }
        jVar.f680f = null;
        jVar.f677c = null;
        this.f185g = null;
        this.f186h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0009j) this.f185g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC0073e) this.f181c).b();
            return null;
        }
    }

    public void h(final int i2, final Serializable serializable) {
        ((Executor) this.f180b).execute(new Runnable() { // from class: o.a
            @Override // java.lang.Runnable
            public final void run() {
                ((InterfaceC0073e) G.e.this.f181c).c(i2, serializable);
            }
        });
    }

    public e(AssetManager assetManager, Executor executor, InterfaceC0073e interfaceC0073e, String str, File file) {
        this.f179a = false;
        this.f180b = executor;
        this.f181c = interfaceC0073e;
        this.f184f = str;
        this.f183e = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = AbstractC0074f.f1035h;
                    break;
                case 26:
                    bArr = AbstractC0074f.f1034g;
                    break;
                case 27:
                    bArr = AbstractC0074f.f1033f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0074f.f1032e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0074f.f1031d;
                    break;
            }
        }
        this.f182d = bArr;
    }
}
