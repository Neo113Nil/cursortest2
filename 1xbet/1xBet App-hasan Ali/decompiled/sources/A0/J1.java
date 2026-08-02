package A0;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0325x;
import a0.AbstractC0449e;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import game.betting133.sports1xbet.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class J1 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K1 f306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X.d f307n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J1(K1 k12, X.d dVar, int i) {
        super(2);
        this.f305l = i;
        this.f306m = k12;
        this.f307n = dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f305l) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0315s.P(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f306m.f315k, this.f307n, c0315s, 0);
                } else {
                    c0315s.S();
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                int intValue2 = ((Number) obj2).intValue();
                boolean z3 = false;
                if (c0315s2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    K1 k12 = this.f306m;
                    Object tag = k12.f315k.getTag(R.id.inspection_slot_table_set);
                    if ((tag instanceof Set) && (!(tag instanceof j4.a) || (tag instanceof j4.e))) {
                        z3 = true;
                    }
                    Set set = z3 ? (Set) tag : null;
                    F f = k12.f315k;
                    if (set == null) {
                        Object parent = f.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof j4.a) && !(tag2 instanceof j4.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C0325x c0325x = c0315s2.f4532U;
                        if (c0325x == null) {
                            c0325x = new C0325x(c0315s2.f4539h);
                            c0315s2.f4532U = c0325x;
                        }
                        set.add(c0325x);
                        c0315s2.f4547q = true;
                        c0315s2.f4516C = true;
                        c0315s2.f4535c.d();
                        c0315s2.f4521H.d();
                        P.P0 p02 = c0315s2.f4522I;
                        P.M0 m02 = p02.f4366a;
                        p02.f4370e = m02.f4352t;
                        p02.f = m02.f4353u;
                    }
                    boolean h3 = c0315s2.h(k12);
                    Object M5 = c0315s2.M();
                    P.Z z5 = C0302l.f4480a;
                    if (h3 || M5 == z5) {
                        M5 = new H1(k12, null);
                        c0315s2.i0(M5);
                    }
                    AbstractC0329z.e(c0315s2, (i4.e) M5, f);
                    boolean h4 = c0315s2.h(k12);
                    Object M6 = c0315s2.M();
                    if (h4 || M6 == z5) {
                        M6 = new I1(k12, null);
                        c0315s2.i0(M6);
                    }
                    AbstractC0329z.e(c0315s2, (i4.e) M6, f);
                    AbstractC0329z.a(AbstractC0449e.f6367a.a(set), X.e.d(-280240369, new J1(k12, this.f307n, 0), c0315s2), c0315s2, 56);
                } else {
                    c0315s2.S();
                }
                break;
        }
        return W3.o.f6046a;
    }
}
