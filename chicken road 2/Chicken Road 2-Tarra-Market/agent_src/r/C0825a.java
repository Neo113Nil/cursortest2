package r;

import Q.C0005c;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import i0.RunnableC0069b;
import io.appmetrica.analytics.impl.C0370l9;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import u0.C0840b;
import z0.C0865a;
import z0.InterfaceC0866b;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6445a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6447c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6448d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6449e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f6450f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6451g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6452h;

    public C0825a(Context context, FlutterEngine flutterEngine, x0.d dVar) {
        this.f6446b = new HashMap();
        this.f6450f = new HashMap();
        this.f6445a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f6447c = flutterEngine;
        this.f6448d = dVar;
        C0840b c0840b = flutterEngine.f5721c;
        t0.h hVar = flutterEngine.f5737s.f5878a;
        this.f6449e = new C0865a(context, c0840b);
    }

    public void a(InterfaceC0866b interfaceC0866b) {
        J0.a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0866b.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0866b.getClass();
            HashMap hashMap = (HashMap) this.f6446b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0866b + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f6447c) + ").");
                Trace.endSection();
                return;
            }
            interfaceC0866b.toString();
            hashMap.put(interfaceC0866b.getClass(), interfaceC0866b);
            interfaceC0866b.onAttachedToEngine((C0865a) this.f6449e);
            if (interfaceC0866b instanceof A0.a) {
                A0.a aVar = (A0.a) interfaceC0866b;
                ((HashMap) this.f6450f).put(interfaceC0866b.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((C0005c) this.f6452h);
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

    public void b(s0.d dVar, androidx.lifecycle.l lVar) {
        this.f6452h = new C0005c(dVar, lVar);
        Intent intent = dVar.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = t0.d.f6674h.f6665b;
        } else {
            boolean z2 = ((x0.d) this.f6448d).f6787a;
        }
        FlutterEngine flutterEngine = (FlutterEngine) this.f6447c;
        flutterEngine.f5737s.getClass();
        Y.e eVar = flutterEngine.f5739u;
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) eVar.f523b;
        if (jVar.f5879b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar.f5879b = dVar;
        jVar.f5882e = flutterEngine.f5720b;
        C0840b c0840b = flutterEngine.f5721c;
        jVar.f5884g = new C0.a(c0840b, 10);
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) eVar.f524c;
        if (iVar.f5865b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        iVar.f5865b = dVar;
        C0.a aVar = new C0.a(c0840b, 9);
        iVar.f5868e = aVar;
        aVar.f51b = iVar.f5877n;
        jVar.f5884g.f51b = eVar;
        for (A0.a aVar2 : ((HashMap) this.f6450f).values()) {
            if (this.f6445a) {
                aVar2.onReattachedToActivityForConfigChanges((C0005c) this.f6452h);
            } else {
                aVar2.onAttachedToActivity((C0005c) this.f6452h);
            }
        }
        this.f6445a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        J0.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f6450f).values().iterator();
            while (it.hasNext()) {
                ((A0.a) it.next()).onDetachedFromActivity();
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
        FlutterEngine flutterEngine = (FlutterEngine) this.f6447c;
        io.flutter.plugin.platform.j jVar = flutterEngine.f5737s;
        C0.a aVar = jVar.f5884g;
        if (aVar != null) {
            aVar.f51b = null;
        }
        jVar.e();
        jVar.f5884g = null;
        jVar.f5879b = null;
        jVar.f5882e = null;
        io.flutter.plugin.platform.i iVar = flutterEngine.f5738t;
        C0.a aVar2 = iVar.f5868e;
        if (aVar2 != null) {
            aVar2.f51b = null;
        }
        Surface surface = iVar.f5874k;
        if (surface != null) {
            surface.release();
            iVar.f5874k = null;
            iVar.f5875l = null;
        }
        iVar.f5868e = null;
        iVar.f5865b = null;
        this.f6451g = null;
        this.f6452h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((s0.f) this.f6451g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((d) this.f6447c).e();
            }
            return null;
        }
    }

    public void h(int i2, Serializable serializable) {
        ((Executor) this.f6446b).execute(new RunnableC0069b(this, i2, serializable, 1));
    }

    public C0825a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f6445a = false;
        this.f6446b = executor;
        this.f6447c = dVar;
        this.f6451g = str;
        this.f6450f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case C0370l9.F /* 25 */:
                    bArr = e.f6469h;
                    break;
                case C0370l9.G /* 26 */:
                    bArr = e.f6468g;
                    break;
                case C0370l9.f4320H /* 27 */:
                    bArr = e.f6467f;
                    break;
                case 28:
                case C0370l9.f4321I /* 29 */:
                case 30:
                    bArr = e.f6466e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f6465d;
                    break;
            }
        }
        this.f6448d = bArr;
    }
}
