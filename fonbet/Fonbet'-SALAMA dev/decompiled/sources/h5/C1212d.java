package h5;

import android.util.SparseArray;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.Iterator;
import r5.C1577b;
import r5.InterfaceC1576a;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1212d implements InterfaceC1576a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13601b;

    public /* synthetic */ C1212d(Object obj, int i7) {
        this.f13600a = i7;
        this.f13601b = obj;
    }

    @Override // r5.InterfaceC1576a
    public final void a() {
        int i7 = this.f13600a;
    }

    @Override // r5.InterfaceC1576a
    public final void b() {
        switch (this.f13600a) {
            case 0:
                ((C1213e) this.f13601b).f13603b.Y();
                break;
            default:
                C1577b c1577b = (C1577b) this.f13601b;
                Iterator it = c1577b.f16049t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1576a) it.next()).b();
                }
                while (true) {
                    s sVar = c1577b.f16047r;
                    SparseArray sparseArray = sVar.f14195k;
                    if (sparseArray.size() <= 0) {
                        while (true) {
                            r rVar = c1577b.f16048s;
                            SparseArray sparseArray2 = rVar.f14178i;
                            if (sparseArray2.size() <= 0) {
                                c1577b.f16040k.f1723b = null;
                                break;
                            } else {
                                rVar.f14184p.f(sparseArray2.keyAt(0));
                            }
                        }
                    } else {
                        sVar.f14206v.f(sparseArray.keyAt(0));
                    }
                }
        }
    }

    private final void c() {
    }

    private final void d() {
    }
}
