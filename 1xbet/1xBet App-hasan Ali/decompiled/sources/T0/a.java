package T0;

import K0.G;
import N0.b;
import O0.j;
import O0.k;
import O0.l;
import O0.o;
import O0.q;
import S0.c;
import S0.d;
import android.graphics.Typeface;
import android.text.Spannable;
import i4.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5602k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5604m;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5602k = i;
        this.f5603l = obj;
        this.f5604m = obj2;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f5602k) {
            case 0:
                G g5 = (G) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                o oVar = g5.f;
                l lVar = g5.f2766c;
                if (lVar == null) {
                    lVar = l.f4027m;
                }
                j jVar = g5.f2767d;
                int i = jVar != null ? jVar.f4024a : 0;
                k kVar = g5.f2768e;
                int i5 = kVar != null ? kVar.f4025a : 65535;
                d dVar = ((c) this.f5604m).f5253k;
                q b3 = ((O0.f) dVar.f5258o).b(oVar, lVar, i, i5);
                if (b3 instanceof q) {
                    Object obj4 = b3.f4042k;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj4);
                    typeface = (Typeface) obj4;
                } else {
                    e eVar = new e(b3, dVar.f5263t);
                    dVar.f5263t = eVar;
                    Object obj5 = eVar.f20434n;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
                    typeface = (Typeface) obj5;
                }
                ((Spannable) this.f5603l).setSpan(new b(1, typeface), intValue, intValue2, 33);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x4.c.f21100h;
                ((x4.b) this.f5604m).getClass();
                x4.c cVar = (x4.c) this.f5603l;
                atomicReferenceFieldUpdater.set(cVar, null);
                cVar.d(null);
                break;
        }
        return W3.o.f6046a;
    }
}
