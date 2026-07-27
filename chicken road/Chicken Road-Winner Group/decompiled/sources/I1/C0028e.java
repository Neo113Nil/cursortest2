package I1;

import android.os.Build;
import java.util.Iterator;

/* renamed from: I1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028e implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f602b;

    public /* synthetic */ C0028e(int i3, Object obj) {
        this.f601a = i3;
        this.f602b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        switch (this.f601a) {
            case 0:
                C0030g c0030g = (C0030g) this.f602b;
                c0030g.f605a.getClass();
                c0030g.f611h = false;
                break;
            case 1:
                q qVar = (q) this.f602b;
                qVar.f648h = false;
                Iterator it = qVar.f647g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f602b).f9168d = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        switch (this.f601a) {
            case 0:
                C0030g c0030g = (C0030g) this.f602b;
                AbstractActivityC0027d abstractActivityC0027d = c0030g.f605a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0027d.reportFullyDrawn();
                } else {
                    abstractActivityC0027d.getClass();
                }
                c0030g.f611h = true;
                c0030g.f612i = true;
                break;
            case 1:
                q qVar = (q) this.f602b;
                qVar.f648h = true;
                Iterator it = qVar.f647g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).b();
                }
                break;
            case 2:
                I i3 = (I) this.f602b;
                i3.f583a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.j jVar = i3.f584b;
                if (jVar != null) {
                    jVar.g(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f602b).f9168d = true;
                break;
        }
    }

    private final void c() {
    }
}
