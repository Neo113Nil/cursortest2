package J1;

import I1.AbstractActivityC0027d;
import I1.C0030g;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.m;
import b2.AbstractC0164a;
import io.appmetrica.analytics.impl.C0644l9;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f696a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f697b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f698c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f699d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f700e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f701g;

    /* renamed from: h, reason: collision with root package name */
    public Object f702h;

    public c(Context context, FlutterEngine flutterEngine, N1.d dVar) {
        this.f697b = new HashMap();
        this.f698c = new HashMap();
        this.f696a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f699d = flutterEngine;
        this.f700e = dVar;
        this.f = new P1.a(context, flutterEngine.f9100c, flutterEngine.f9115s.f9301a);
    }

    public void a(P1.b bVar) {
        AbstractC0164a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = (HashMap) this.f697b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f699d) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((P1.a) this.f);
            if (bVar instanceof Q1.a) {
                Q1.a aVar = (Q1.a) bVar;
                ((HashMap) this.f698c).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((A0.h) this.f702h);
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

    public void b(AbstractActivityC0027d abstractActivityC0027d, m mVar) {
        A0.h hVar = new A0.h();
        hVar.f55c = new HashSet();
        hVar.f56d = new HashSet();
        hVar.f57e = new HashSet();
        hVar.f = new HashSet();
        new HashSet();
        hVar.f58g = new HashSet();
        hVar.f54b = abstractActivityC0027d;
        new HiddenLifecycleReference(mVar);
        this.f702h = hVar;
        Intent intent = abstractActivityC0027d.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false;
        if (booleanExtra) {
            String str = e.f712h.f704b;
        } else {
            booleanExtra = ((N1.d) this.f700e).f998a;
        }
        FlutterEngine flutterEngine = (FlutterEngine) this.f699d;
        flutterEngine.f9115s.f9321v = booleanExtra;
        V1.b bVar = flutterEngine.f9117u;
        r rVar = (r) bVar.f1614b;
        if (rVar.f9303c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        rVar.f9303c = abstractActivityC0027d;
        rVar.f = flutterEngine.f9099b;
        K1.b bVar2 = flutterEngine.f9100c;
        rVar.f9307h = new a1.e(bVar2, 22);
        q qVar = (q) bVar.f1615c;
        if (qVar.f9286c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        qVar.f9286c = abstractActivityC0027d;
        a1.e eVar = new a1.e(bVar2, 21);
        qVar.f9289g = eVar;
        eVar.f1789c = qVar.f9299q;
        rVar.f9307h.f1789c = bVar;
        for (Q1.a aVar : ((HashMap) this.f698c).values()) {
            if (this.f696a) {
                aVar.onReattachedToActivityForConfigChanges((A0.h) this.f702h);
            } else {
                aVar.onAttachedToActivity((A0.h) this.f702h);
            }
        }
        this.f696a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC0164a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f698c).values().iterator();
            while (it.hasNext()) {
                ((Q1.a) it.next()).onDetachedFromActivity();
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
        FlutterEngine flutterEngine = (FlutterEngine) this.f699d;
        r rVar = flutterEngine.f9115s;
        a1.e eVar = rVar.f9307h;
        if (eVar != null) {
            eVar.f1789c = null;
        }
        rVar.d();
        rVar.f9307h = null;
        rVar.f9303c = null;
        rVar.f = null;
        q qVar = flutterEngine.f9116t;
        a1.e eVar2 = qVar.f9289g;
        if (eVar2 != null) {
            eVar2.f1789c = null;
        }
        Surface surface = qVar.f9296n;
        if (surface != null) {
            surface.release();
            qVar.f9296n = null;
            qVar.f9297o = null;
        }
        qVar.f9289g = null;
        qVar.f9286c = null;
        this.f701g = null;
        this.f702h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0030g) this.f701g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((S.d) this.f698c).b();
            return null;
        }
    }

    public void h(int i3, Serializable serializable) {
        ((Executor) this.f697b).execute(new S.a(this, i3, serializable));
    }

    public c(AssetManager assetManager, Executor executor, S.d dVar, String str, File file) {
        this.f696a = false;
        this.f697b = executor;
        this.f698c = dVar;
        this.f = str;
        this.f700e = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case C0644l9.f7762F /* 25 */:
                    bArr = S.e.f1272h;
                    break;
                case C0644l9.f7763G /* 26 */:
                    bArr = S.e.f1271g;
                    break;
                case C0644l9.f7764H /* 27 */:
                    bArr = S.e.f;
                    break;
                case 28:
                case C0644l9.f7765I /* 29 */:
                case 30:
                    bArr = S.e.f1270e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = S.e.f1269d;
                    break;
            }
        }
        this.f699d = bArr;
    }
}
