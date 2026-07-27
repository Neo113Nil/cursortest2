package io.flutter.embedding.engine.renderer;

import I1.C0028e;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9165a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f9167c;

    /* renamed from: h, reason: collision with root package name */
    public final C0028e f9171h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f9166b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f9168d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f9169e = new Handler();
    public final HashSet f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9170g = new ArrayList();

    public j(FlutterJNI flutterJNI) {
        C0028e c0028e = new C0028e(3, this);
        this.f9171h = c0028e;
        this.f9165a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0028e);
    }

    public final void a(k kVar) {
        this.f9165a.addIsDisplayingFlutterUiListener(kVar);
        if (this.f9168d) {
            kVar.b();
        }
    }

    public final void b(p pVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((p) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(pVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f9166b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f9165a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || (i4 <= 29 && "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER))) {
            g e3 = e();
            return new n(e3.f9134a, this.f9169e, this.f9165a, e3);
        }
        long andIncrement = this.f9166b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z3 = i3 == 2;
        this.f9165a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z3);
        if (z3) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f9170g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final g e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f9166b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        g gVar = new g(this, andIncrement, surfaceTexture);
        this.f9165a.registerTexture(gVar.f9134a, gVar.f9135b);
        b(gVar);
        return gVar;
    }

    public final void f(int i3) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void g(k kVar) {
        this.f9165a.removeIsDisplayingFlutterUiListener(kVar);
    }

    public final void h(p pVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == pVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        Iterator it = this.f9170g.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void j() {
        if (this.f9167c != null) {
            this.f9165a.onSurfaceDestroyed();
            if (this.f9168d) {
                this.f9171h.a();
            }
            this.f9168d = false;
            this.f9167c = null;
        }
    }
}
