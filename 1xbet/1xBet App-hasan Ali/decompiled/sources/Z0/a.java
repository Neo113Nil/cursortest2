package Z0;

import G.v;
import a1.s;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import g1.C1968b;
import java.util.List;
import n1.O;
import n1.k0;
import x0.f0;
import z0.C2761s;

/* loaded from: classes.dex */
public final class a extends AbstractC1674uy {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6257m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        super(1);
        this.f6257m = i;
        this.f6258n = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final k0 c(k0 k0Var, List list) {
        switch (this.f6257m) {
            case 0:
                return ((q) this.f6258n).m(k0Var);
            default:
                s sVar = (s) this.f6258n;
                if (sVar.f6426v) {
                    return k0Var;
                }
                View childAt = sVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, sVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, sVar.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? k0Var : k0Var.f18442a.r(max, max2, max3, max4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final v d(O o5, v vVar) {
        switch (this.f6257m) {
            case 0:
                C2761s c2761s = ((q) this.f6258n).f6293I.f21612O.f21768c;
                if (!c2761s.f21856Y.f7175x) {
                    return vVar;
                }
                long K = G4.l.K(c2761s.J(0L));
                int i = (int) (K >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i5 = (int) (K & 4294967295L);
                if (i5 < 0) {
                    i5 = 0;
                }
                long I5 = f0.h(c2761s).I();
                int i6 = (int) (I5 >> 32);
                int i7 = (int) (I5 & 4294967295L);
                long j5 = c2761s.f20975m;
                long K5 = G4.l.K(c2761s.J((Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L)));
                int i8 = i6 - ((int) (K5 >> 32));
                if (i8 < 0) {
                    i8 = 0;
                }
                int i9 = i7 - ((int) (4294967295L & K5));
                int i10 = i9 >= 0 ? i9 : 0;
                return (i == 0 && i5 == 0 && i8 == 0 && i10 == 0) ? vVar : new v(18, j.l((C1968b) vVar.f1749l, i, i5, i8, i10), j.l((C1968b) vVar.f1750m, i, i5, i8, i10));
            default:
                s sVar = (s) this.f6258n;
                if (sVar.f6426v) {
                    return vVar;
                }
                View childAt = sVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, sVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, sVar.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return vVar;
                }
                C1968b b3 = C1968b.b(max, max2, max3, max4);
                C1968b c1968b = (C1968b) vVar.f1749l;
                int i11 = b3.f17073a;
                int i12 = b3.f17074b;
                int i13 = b3.f17075c;
                int i14 = b3.f17076d;
                return new v(18, k0.a(c1968b, i11, i12, i13, i14), k0.a((C1968b) vVar.f1750m, i11, i12, i13, i14));
        }
    }
}
