package q5;

import android.os.Build;
import java.util.Iterator;

/* renamed from: q5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1560d implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15881b;

    public /* synthetic */ C1560d(Object obj, int i7) {
        this.f15880a = i7;
        this.f15881b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        switch (this.f15880a) {
            case 0:
                C1562f c1562f = (C1562f) this.f15881b;
                c1562f.f15884a.getClass();
                c1562f.f15890g = false;
                break;
            case 1:
                break;
            default:
                m mVar = (m) this.f15881b;
                mVar.f15934x = false;
                Iterator it = mVar.f15933f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.l) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        switch (this.f15880a) {
            case 0:
                C1562f c1562f = (C1562f) this.f15881b;
                AbstractActivityC1559c abstractActivityC1559c = c1562f.f15884a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC1559c.reportFullyDrawn();
                } else {
                    abstractActivityC1559c.getClass();
                }
                c1562f.f15890g = true;
                c1562f.f15891h = true;
                break;
            case 1:
                C1565i c1565i = (C1565i) this.f15881b;
                c1565i.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.k kVar = c1565i.f15903c;
                if (kVar != null) {
                    kVar.f14106a.removeIsDisplayingFlutterUiListener(this);
                    break;
                }
                break;
            default:
                m mVar = (m) this.f15881b;
                mVar.f15934x = true;
                Iterator it = mVar.f15933f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.l) it.next()).b();
                }
                break;
        }
    }

    private final void c() {
    }
}
