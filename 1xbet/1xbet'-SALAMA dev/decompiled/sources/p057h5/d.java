package p057h5;

import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.Iterator;
import p128r5.a;
import p128r5.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13607b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f13606a = i7;
        this.f13607b = obj;
    }

    @Override // p128r5.a
    public final void a() {
        int i7 = this.f13606a;
    }

    @Override // p128r5.a
    public final void b() {
        switch (this.f13606a) {
            case 0:
                ((e) this.f13607b).f13609b.Y();
                break;
            default:
                b bVar = (b) this.f13607b;
                Iterator it = bVar.f16055t.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b();
                }
                while (true) {
                    s sVar = bVar.f16053r;
                    SparseArray sparseArray = sVar.f14201k;
                    if (sparseArray.size() <= 0) {
                        while (true) {
                            r rVar = bVar.f16054s;
                            SparseArray sparseArray2 = rVar.f14184i;
                            if (sparseArray2.size() <= 0) {
                                bVar.f16046k.f1723b = null;
                            } else {
                                rVar.f14190p.f(sparseArray2.keyAt(0));
                            }
                        }
                    } else {
                        sVar.f14212v.f(sparseArray.keyAt(0));
                    }
                    break;
                }
                break;
        }
    }

    private final void c() {
    }

    private final void d() {
    }
}
