package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f14106a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f14108c;

    /* renamed from: h, reason: collision with root package name */
    public final a f14113h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f14107b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f14109d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14110e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f14111f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14112g = new ArrayList();

    public k(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f14113h = aVar;
        this.f14106a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        ProcessLifecycleOwner.f9594z.f9600f.a(new b(this));
    }

    public final void a(o oVar) {
        HashSet hashSet = this.f14111f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f14107b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f14106a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i7) {
        if (Build.VERSION.SDK_INT < 29) {
            i d7 = d();
            return new n(d7.f14084a, this.f14110e, this.f14106a, d7);
        }
        long andIncrement = this.f14107b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z4 = i7 == 2;
        this.f14106a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z4);
        if (z4) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f14112g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f14107b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f14106a.registerTexture(iVar.f14084a, iVar.f14085b);
        a(iVar);
        return iVar;
    }

    public final void e(int i7) {
        Iterator it = this.f14111f.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    public final void f(o oVar) {
        HashSet hashSet = this.f14111f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f14108c != null) {
            this.f14106a.onSurfaceDestroyed();
            if (this.f14109d) {
                this.f14113h.a();
            }
            this.f14109d = false;
            this.f14108c = null;
        }
    }
}
