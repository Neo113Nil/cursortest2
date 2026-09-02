package F;

import android.os.Build;
import java.util.Iterator;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f77b;

    public /* synthetic */ C0006g(int i2, Object obj) {
        this.f76a = i2;
        this.f77b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f76a) {
            case 0:
                C0009j c0009j = (C0009j) this.f77b;
                c0009j.f80a.getClass();
                c0009j.f87h = false;
                break;
            case 1:
                x xVar = (x) this.f77b;
                xVar.f129h = false;
                Iterator it = xVar.f128g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f77b).f595c = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f76a) {
            case 0:
                C0009j c0009j = (C0009j) this.f77b;
                AbstractActivityC0005f abstractActivityC0005f = c0009j.f80a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0005f.reportFullyDrawn();
                } else {
                    abstractActivityC0005f.getClass();
                }
                c0009j.f87h = true;
                c0009j.f88i = true;
                break;
            case 1:
                x xVar = (x) this.f77b;
                xVar.f129h = true;
                Iterator it = xVar.f128g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                S s2 = (S) this.f77b;
                s2.f58a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = s2.f59b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f77b).f595c = true;
                break;
        }
    }

    private final void c() {
    }
}
