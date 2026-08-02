package A0;

import android.os.Build;
import android.view.View;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class A1 implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f150k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f151l;

    public /* synthetic */ A1(int i, Object obj) {
        this.f150k = i;
        this.f151l = obj;
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        switch (this.f150k) {
            case 0:
                ((C0017c1) this.f151l).f478k.i(((Number) obj).floatValue());
                return W3.o.f6046a;
            case 1:
                G.v vVar = (G.v) this.f151l;
                if (Build.VERSION.SDK_INT >= 34) {
                    G.j.f1735a.a(vVar.g(), (View) vVar.f1749l);
                }
                return W3.o.f6046a;
            default:
                ((kotlin.jvm.internal.w) this.f151l).f17624k = obj;
                throw new t4.a(this);
        }
    }
}
