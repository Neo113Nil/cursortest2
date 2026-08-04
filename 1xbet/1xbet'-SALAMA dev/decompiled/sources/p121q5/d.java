package p121q5;

import android.os.Build;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.l;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15887b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f15886a = i7;
        this.f15887b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        switch (this.f15886a) {
            case 0:
                f fVar = (f) this.f15887b;
                fVar.f15890a.getClass();
                fVar.f15896g = false;
                break;
            case 1:
                break;
            default:
                m mVar = (m) this.f15887b;
                mVar.f15940x = false;
                Iterator it = mVar.f15939f.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        switch (this.f15886a) {
            case 0:
                f fVar = (f) this.f15887b;
                c cVar = fVar.f15890a;
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.reportFullyDrawn();
                } else {
                    cVar.getClass();
                }
                fVar.f15896g = true;
                fVar.f15897h = true;
                break;
            case 1:
                i iVar = (i) this.f15887b;
                iVar.setAlpha(1.0f);
                k kVar = iVar.f15909c;
                if (kVar != null) {
                    kVar.f14112a.removeIsDisplayingFlutterUiListener(this);
                }
                break;
            default:
                m mVar = (m) this.f15887b;
                mVar.f15940x = true;
                Iterator it = mVar.f15939f.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).b();
                }
                break;
        }
    }

    private final void c() {
    }
}
