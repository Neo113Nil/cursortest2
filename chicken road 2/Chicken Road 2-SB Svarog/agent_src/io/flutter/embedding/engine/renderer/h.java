package io.flutter.embedding.engine.renderer;

import F.C0006g;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f593a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f595c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f596d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f597e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f598f;

    /* renamed from: g, reason: collision with root package name */
    public final C0006g f599g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f595c = false;
        this.f596d = new Handler();
        this.f597e = new HashSet();
        this.f598f = new ArrayList();
        C0006g c0006g = new C0006g(3, this);
        this.f599g = c0006g;
        this.f593a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0006g);
    }

    public final void a(i iVar) {
        this.f593a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f595c) {
            iVar.b();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f597e.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f593a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        ArrayList arrayList = this.f598f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void e() {
        if (this.f594b != null) {
            this.f593a.onSurfaceDestroyed();
            if (this.f595c) {
                this.f599g.a();
            }
            this.f595c = false;
            this.f594b = null;
        }
    }
}
