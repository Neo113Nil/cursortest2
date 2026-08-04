package F1;

import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import P1.C;
import P1.C0370a;
import P1.C0372c;
import P1.C0373d;
import java.util.ArrayList;
import java.util.Collections;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2538d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V0 f2539e = new V0(new B1.f(14));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final V0 f2540f = new V0(new B1.f(15));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2543c;

    public final void a(ArrayList arrayList, int i7) {
        switch (i7) {
            case 0:
                arrayList.add(new C0370a());
                break;
            case 1:
                arrayList.add(new C0372c());
                break;
            case 2:
                arrayList.add(new C0373d((this.f2542b ? 2 : 0) | (this.f2541a ? 1 : 0)));
                break;
            case 3:
                arrayList.add(new G1.a(((this.f2542b ? 2 : 0) | (this.f2541a ? 1 : 0)) == true ? 1 : 0));
                break;
            case 4:
                k kVarQ = f2539e.Q(0);
                if (kVarQ == null) {
                    arrayList.add(new I1.c());
                } else {
                    arrayList.add(kVarQ);
                }
                break;
            case 5:
                arrayList.add(new J1.b());
                break;
            case 6:
                arrayList.add(new L1.d(0));
                break;
            case 7:
                arrayList.add(new M1.d((this.f2542b ? 2 : 0) | this.f2543c | (this.f2541a ? 1 : 0)));
                break;
            case 8:
                arrayList.add(new N1.j(0, null, Collections.emptyList(), null));
                arrayList.add(new N1.m());
                break;
            case 9:
                arrayList.add(new O1.e());
                break;
            case 10:
                arrayList.add(new P1.y());
                break;
            case 11:
                p151v2.s sVar = new p151v2.s(0L);
                C0165x c0165x = AbstractC0167z.f2083b;
                arrayList.add(new C(1, sVar, new B.v(0, L.f2000e, 5)));
                break;
            case 12:
                Q1.d dVar = new Q1.d();
                dVar.f5780c = 0;
                dVar.f5781d = -1L;
                dVar.f5783f = -1;
                dVar.f5784g = -1L;
                arrayList.add(dVar);
                break;
            case 14:
                arrayList.add(new K1.a());
                break;
            case 15:
                k kVarQ2 = f2540f.Q(new Object[0]);
                if (kVarQ2 != null) {
                    arrayList.add(kVarQ2);
                }
                break;
            case 16:
                arrayList.add(new H1.b());
                break;
        }
    }
}
