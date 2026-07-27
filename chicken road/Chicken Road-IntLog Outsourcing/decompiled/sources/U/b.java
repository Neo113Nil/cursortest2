package U;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0252w;
import h2.C0482c;
import io.appmetrica.analytics.impl.C0793l9;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import w2.AbstractActivityC1515c;
import w2.C1517e;
import x2.AbstractC1541d;
import x2.C1545h;
import y2.C1557b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3035a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3036b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3037c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3038d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3039e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f3040f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3041g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3042h;

    public b(Context context, FlutterEngine flutterEngine, B2.e eVar) {
        this.f3036b = new HashMap();
        this.f3040f = new HashMap();
        this.f3035a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3037c = flutterEngine;
        this.f3038d = eVar;
        C1557b c1557b = flutterEngine.f10084c;
        C1545h c1545h = flutterEngine.f10100s.f10235a;
        this.f3039e = new D2.a(context, flutterEngine, c1557b);
    }

    public void a(D2.b bVar) {
        O2.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = (HashMap) this.f3036b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f3037c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((D2.a) this.f3039e);
            if (bVar instanceof E2.a) {
                E2.a aVar = (E2.a) bVar;
                ((HashMap) this.f3040f).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((M0.e) this.f3042h);
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

    public void b(AbstractActivityC1515c abstractActivityC1515c, C0252w c0252w) {
        this.f3042h = new M0.e(abstractActivityC1515c, c0252w);
        Intent intent = abstractActivityC1515c.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = AbstractC1541d.f12281h.f12272b;
        } else {
            boolean z = ((B2.e) this.f3038d).f251a;
        }
        FlutterEngine flutterEngine = (FlutterEngine) this.f3037c;
        flutterEngine.f10100s.getClass();
        B0.e eVar = flutterEngine.f10102u;
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) eVar.f146b;
        if (mVar.f10236b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        mVar.f10236b = abstractActivityC1515c;
        mVar.f10239e = flutterEngine.f10083b;
        C1557b c1557b = flutterEngine.f10084c;
        mVar.f10241g = new B1.g(c1557b, 12);
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) eVar.f147c;
        if (lVar.f10222b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        lVar.f10222b = abstractActivityC1515c;
        C0482c c0482c = new C0482c(c1557b, 13);
        lVar.f10225e = c0482c;
        c0482c.f5783b = lVar.f10234n;
        mVar.f10241g.f215b = eVar;
        for (E2.a aVar : ((HashMap) this.f3040f).values()) {
            if (this.f3035a) {
                aVar.onReattachedToActivityForConfigChanges((M0.e) this.f3042h);
            } else {
                aVar.onAttachedToActivity((M0.e) this.f3042h);
            }
        }
        this.f3035a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        O2.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f3040f).values().iterator();
            while (it.hasNext()) {
                ((E2.a) it.next()).onDetachedFromActivity();
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
        FlutterEngine flutterEngine = (FlutterEngine) this.f3037c;
        io.flutter.plugin.platform.m mVar = flutterEngine.f10100s;
        B1.g gVar = mVar.f10241g;
        if (gVar != null) {
            gVar.f215b = null;
        }
        mVar.f();
        mVar.f10241g = null;
        mVar.f10236b = null;
        mVar.f10239e = null;
        io.flutter.plugin.platform.l lVar = flutterEngine.f10101t;
        C0482c c0482c = lVar.f10225e;
        if (c0482c != null) {
            c0482c.f5783b = null;
        }
        Surface surface = lVar.f10231k;
        if (surface != null) {
            surface.release();
            lVar.f10231k = null;
            lVar.f10232l = null;
        }
        lVar.f10225e = null;
        lVar.f10222b = null;
        this.f3041g = null;
        this.f3042h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C1517e) this.f3041g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                ((f) this.f3037c).i();
            }
            return null;
        }
    }

    public void h(int i2, Serializable serializable) {
        ((Executor) this.f3036b).execute(new a(i2, 0, this, serializable));
    }

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f3035a = false;
        this.f3036b = executor;
        this.f3037c = fVar;
        this.f3041g = str;
        this.f3040f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case C0793l9.f8684F /* 25 */:
                    bArr = g.f3061h;
                    break;
                case 26:
                    bArr = g.f3060g;
                    break;
                case C0793l9.f8686H /* 27 */:
                    bArr = g.f3059f;
                    break;
                case 28:
                case C0793l9.f8687I /* 29 */:
                case 30:
                    bArr = g.f3058e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f3057d;
                    break;
            }
        }
        this.f3038d = bArr;
    }
}
