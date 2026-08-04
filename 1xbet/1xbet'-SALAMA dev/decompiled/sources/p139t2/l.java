package p139t2;

import E3.AbstractC0161t;
import E3.AbstractC0167z;
import E3.J;
import E3.L;
import E3.T;
import com.google.android.gms.common.api.f;
import java.util.Comparator;
import p018c2.e0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16363A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f16364B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16365C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f16366D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16368f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16370y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f16371z;

    public l(int i7, e0 e0Var, int i8, i iVar, int i9, String str) {
        int iD;
        super(i7, e0Var, i8);
        int i10 = 0;
        this.f16368f = p.e(i9, false);
        int i11 = this.f16375d.f307d & (~iVar.f16434L);
        this.f16369x = (i11 & 1) != 0;
        this.f16370y = (i11 & 2) != 0;
        L l7 = iVar.f16432J;
        L lI = l7.isEmpty() ? AbstractC0167z.I("") : l7;
        int i12 = 0;
        while (true) {
            if (i12 >= lI.size()) {
                i12 = f.API_PRIORITY_OTHER;
                iD = 0;
                break;
            } else {
                iD = p.d(this.f16375d, (String) lI.get(i12), iVar.f16435M);
                if (iD > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f16371z = i12;
        this.f16363A = iD;
        int iB = p.b(this.f16375d.f308e, iVar.f16433K);
        this.f16364B = iB;
        this.f16366D = (this.f16375d.f308e & 1088) != 0;
        int iD2 = p.d(this.f16375d, str, p.g(str) == null);
        this.f16365C = iD2;
        boolean z4 = iD > 0 || (l7.isEmpty() && iB > 0) || this.f16369x || (this.f16370y && iD2 > 0);
        if (p.e(i9, iVar.f16358b0) && z4) {
            i10 = 1;
        }
        this.f16367e = i10;
    }

    @Override // p139t2.n
    public final int a() {
        return this.f16367e;
    }

    @Override // p139t2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        AbstractC0161t abstractC0161tC = AbstractC0161t.f2068a.c(this.f16368f, lVar.f16368f);
        Integer numValueOf = Integer.valueOf(this.f16371z);
        Integer numValueOf2 = Integer.valueOf(lVar.f16371z);
        Comparator comparator = J.f1999a;
        comparator.getClass();
        T t7 = T.f2026a;
        AbstractC0161t abstractC0161tB = abstractC0161tC.b(numValueOf, numValueOf2, t7);
        int i7 = this.f16363A;
        AbstractC0161t abstractC0161tA = abstractC0161tB.a(i7, lVar.f16363A);
        int i8 = this.f16364B;
        AbstractC0161t abstractC0161tC2 = abstractC0161tA.a(i8, lVar.f16364B).c(this.f16369x, lVar.f16369x);
        Boolean boolValueOf = Boolean.valueOf(this.f16370y);
        Boolean boolValueOf2 = Boolean.valueOf(lVar.f16370y);
        if (i7 != 0) {
            comparator = t7;
        }
        AbstractC0161t abstractC0161tA2 = abstractC0161tC2.b(boolValueOf, boolValueOf2, comparator).a(this.f16365C, lVar.f16365C);
        if (i8 == 0) {
            abstractC0161tA2 = abstractC0161tA2.d(this.f16366D, lVar.f16366D);
        }
        return abstractC0161tA2.e();
    }
}
