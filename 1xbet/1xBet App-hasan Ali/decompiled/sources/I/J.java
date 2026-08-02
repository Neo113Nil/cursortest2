package I;

import java.util.ArrayList;
import x0.Y;
import x0.Z;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2409l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2410m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i, ArrayList arrayList) {
        super(1);
        this.f2409l = i;
        this.f2410m = arrayList;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f2409l) {
            case 0:
                Y y5 = (Y) obj;
                ArrayList arrayList = this.f2410m;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Y.g(y5, (Z) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                Y y6 = (Y) obj;
                ArrayList arrayList2 = this.f2410m;
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Y.j(y6, (Z) arrayList2.get(i5), 0, 0);
                }
                break;
            case 2:
                Y y7 = (Y) obj;
                ArrayList arrayList3 = this.f2410m;
                int N5 = X3.n.N(arrayList3);
                if (N5 >= 0) {
                    int i6 = 0;
                    while (true) {
                        Y.j(y7, (Z) arrayList3.get(i6), 0, 0);
                        if (i6 != N5) {
                            i6++;
                        }
                    }
                }
                break;
            case 3:
                Y y8 = (Y) obj;
                ArrayList arrayList4 = this.f2410m;
                int size3 = arrayList4.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    Y.g(y8, (Z) arrayList4.get(i7), 0, 0);
                }
                break;
            default:
                Y y9 = (Y) obj;
                ArrayList arrayList5 = this.f2410m;
                int size4 = arrayList5.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    Y.k(y9, (Z) arrayList5.get(i8), 0, 0);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
