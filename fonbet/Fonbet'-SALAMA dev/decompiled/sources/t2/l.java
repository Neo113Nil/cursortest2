package t2;

import E3.AbstractC0161t;
import E3.AbstractC0167z;
import E3.J;
import E3.L;
import E3.T;
import c2.e0;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final int f16357A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16358B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16359C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16360D;

    /* renamed from: e, reason: collision with root package name */
    public final int f16361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16362f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16363x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16364y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16365z;

    public l(int i7, e0 e0Var, int i8, i iVar, int i9, String str) {
        super(i7, e0Var, i8);
        int i10;
        int i11 = 0;
        this.f16362f = p.e(i9, false);
        int i12 = this.f16369d.f307d & (~iVar.f16428L);
        this.f16363x = (i12 & 1) != 0;
        this.f16364y = (i12 & 2) != 0;
        L l7 = iVar.f16426J;
        L I7 = l7.isEmpty() ? AbstractC0167z.I("") : l7;
        int i13 = 0;
        while (true) {
            if (i13 >= I7.size()) {
                i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                i10 = 0;
                break;
            } else {
                i10 = p.d(this.f16369d, (String) I7.get(i13), iVar.f16429M);
                if (i10 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f16365z = i13;
        this.f16357A = i10;
        int b7 = p.b(this.f16369d.f308e, iVar.f16427K);
        this.f16358B = b7;
        this.f16360D = (this.f16369d.f308e & 1088) != 0;
        int d7 = p.d(this.f16369d, str, p.g(str) == null);
        this.f16359C = d7;
        boolean z4 = i10 > 0 || (l7.isEmpty() && b7 > 0) || this.f16363x || (this.f16364y && d7 > 0);
        if (p.e(i9, iVar.f16352b0) && z4) {
            i11 = 1;
        }
        this.f16361e = i11;
    }

    @Override // t2.n
    public final int a() {
        return this.f16361e;
    }

    @Override // t2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        AbstractC0161t c3 = AbstractC0161t.f2068a.c(this.f16362f, lVar.f16362f);
        Integer valueOf = Integer.valueOf(this.f16365z);
        Integer valueOf2 = Integer.valueOf(lVar.f16365z);
        Comparator comparator = J.f1999a;
        comparator.getClass();
        T t7 = T.f2026a;
        AbstractC0161t b7 = c3.b(valueOf, valueOf2, t7);
        int i7 = this.f16357A;
        AbstractC0161t a2 = b7.a(i7, lVar.f16357A);
        int i8 = this.f16358B;
        AbstractC0161t c4 = a2.a(i8, lVar.f16358B).c(this.f16363x, lVar.f16363x);
        Boolean valueOf3 = Boolean.valueOf(this.f16364y);
        Boolean valueOf4 = Boolean.valueOf(lVar.f16364y);
        if (i7 != 0) {
            comparator = t7;
        }
        AbstractC0161t a4 = c4.b(valueOf3, valueOf4, comparator).a(this.f16359C, lVar.f16359C);
        if (i8 == 0) {
            a4 = a4.d(this.f16360D, lVar.f16360D);
        }
        return a4.e();
    }
}
