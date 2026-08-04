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

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f14112a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f14114c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f14119h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f14113b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14115d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f14116e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f14117f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14118g = new ArrayList();

    public k(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f14119h = aVar;
        this.f14112a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        ProcessLifecycleOwner.f9594z.f9600f.a(new b(this));
    }

    public final void a(o oVar) {
        HashSet hashSet = this.f14117f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f14113b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f14112a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i7) {
        if (Build.VERSION.SDK_INT < 29) {
            i iVarD = d();
            return new n(iVarD.f14090a, this.f14116e, this.f14112a, iVarD);
        }
        long andIncrement = this.f14113b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z4 = i7 == 2;
        this.f14112a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z4);
        if (z4) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f14118g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f14113b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f14112a.registerTexture(iVar.f14090a, iVar.f14091b);
        a(iVar);
        return iVar;
    }

    public final void e(int i7) {
        Iterator it = this.f14117f.iterator();
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
        HashSet<WeakReference> hashSet = this.f14117f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f14114c != null) {
            this.f14112a.onSurfaceDestroyed();
            if (this.f14115d) {
                this.f14119h.a();
            }
            this.f14115d = false;
            this.f14114c = null;
        }
    }
}
