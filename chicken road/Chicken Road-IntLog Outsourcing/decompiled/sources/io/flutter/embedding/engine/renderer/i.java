package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f10146a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f10147b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10148c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10149d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f10150e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10151f;

    /* renamed from: g, reason: collision with root package name */
    public final a f10152g;

    public i(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f10148c = false;
        this.f10149d = new Handler();
        this.f10150e = new HashSet();
        this.f10151f = new ArrayList();
        a aVar = new a(0, this);
        this.f10152g = aVar;
        this.f10146a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final void a(j jVar) {
        this.f10146a.addIsDisplayingFlutterUiListener(jVar);
        if (this.f10148c) {
            jVar.b();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f10150e.iterator();
        while (it.hasNext()) {
            n nVar = (n) ((WeakReference) it.next()).get();
            if (nVar != null) {
                nVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(j jVar) {
        this.f10146a.removeIsDisplayingFlutterUiListener(jVar);
    }

    public final void d() {
        Iterator it = this.f10151f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f10147b != null) {
            this.f10146a.onSurfaceDestroyed();
            if (this.f10148c) {
                this.f10152g.a();
            }
            this.f10148c = false;
            this.f10147b = null;
        }
    }
}
