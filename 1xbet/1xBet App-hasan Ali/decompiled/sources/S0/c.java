package S0;

import O0.o;
import O0.q;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f5253k;

    public /* synthetic */ c(d dVar) {
        this.f5253k = dVar;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = this.f5253k;
        q b3 = ((O0.f) dVar.f5258o).b((o) obj, (O0.l) obj2, ((O0.j) obj3).f4024a, ((O0.k) obj4).f4025a);
        if (b3 instanceof q) {
            Object obj5 = b3.f4042k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
            return (Typeface) obj5;
        }
        v3.e eVar = new v3.e(b3, dVar.f5263t);
        dVar.f5263t = eVar;
        Object obj6 = eVar.f20434n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj6);
        return (Typeface) obj6;
    }
}
