package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1589t2 implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15629k;

    public /* synthetic */ C1589t2(int i) {
        this.f15629k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15629k) {
            case 0:
                return Integer.compare(((C1634u2) obj).f15788a.f15956b, ((C1634u2) obj2).f15788a.f15956b);
            case 1:
                return Long.compare(((C1544s2) obj).f15420b, ((C1544s2) obj2).f15420b);
            case 2:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 3:
                X5 x5 = (X5) obj;
                X5 x52 = (X5) obj2;
                int i = x5.f12152c - x52.f12152c;
                return i != 0 ? i : Long.compare(x5.f12150a, x52.f12150a);
            case 4:
                V5 v5 = (V5) obj;
                V5 v52 = (V5) obj2;
                float f = v5.f11862b;
                float f5 = v52.f11862b;
                if (f < f5) {
                    return -1;
                }
                if (f <= f5) {
                    float f6 = v5.f11861a;
                    float f7 = v52.f11861a;
                    if (f6 < f7) {
                        return -1;
                    }
                    if (f6 <= f7) {
                        float f8 = (v5.f11864d - f) * (v5.f11863c - f6);
                        float f9 = (v52.f11864d - f5) * (v52.f11863c - f7);
                        if (f8 > f9) {
                            return -1;
                        }
                        if (f8 >= f9) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 5:
                return ((C1407p) obj2).i - ((C1407p) obj).i;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                return Integer.compare(((ZG) ((List) obj).get(0)).f12480p, ((ZG) ((List) obj2).get(0)).f12480p);
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                return Wu.f(new C1589t2(11).compare((C1067hH) Collections.max(list, new C1589t2(11)), (C1067hH) Collections.max(list2, new C1589t2(11)))).b(list.size(), list2.size()).c((C1067hH) Collections.max(list, new C1589t2(12)), (C1067hH) Collections.max(list2, new C1589t2(12)), new C1589t2(12)).a();
            case 9:
                return ((YG) Collections.max((List) obj)).compareTo((YG) Collections.max((List) obj2));
            case 10:
                return ((C0932eH) ((List) obj).get(0)).compareTo((C0932eH) ((List) obj2).get(0));
            case 11:
                C1067hH c1067hH = (C1067hH) obj;
                C1067hH c1067hH2 = (C1067hH) obj2;
                Zu d5 = Zu.f12539a.d(c1067hH.f13749r, c1067hH2.f13749r);
                Integer valueOf = Integer.valueOf(c1067hH.f13754w);
                Integer valueOf2 = Integer.valueOf(c1067hH2.f13754w);
                C1671uv c1671uv = C1671uv.f15932m;
                Zu c5 = d5.c(valueOf, valueOf2, c1671uv).b(c1067hH.f13755x, c1067hH2.f13755x).b(c1067hH.f13756y, c1067hH2.f13756y).d(c1067hH.f13757z, c1067hH2.f13757z).b(c1067hH.f13741A, c1067hH2.f13741A).d(c1067hH.f13750s, c1067hH2.f13750s).d(c1067hH.f13746o, c1067hH2.f13746o).d(c1067hH.f13748q, c1067hH2.f13748q).c(Integer.valueOf(c1067hH.f13753v), Integer.valueOf(c1067hH2.f13753v), c1671uv);
                boolean z3 = c1067hH2.f13743C;
                boolean z5 = c1067hH.f13743C;
                Zu d6 = c5.d(z5, z3);
                boolean z6 = c1067hH2.f13744D;
                boolean z7 = c1067hH.f13744D;
                Zu d7 = d6.d(z7, z6);
                if (z5 && z7) {
                    d7 = d7.b(c1067hH.f13745E, c1067hH2.f13745E);
                }
                return d7.a();
            case 12:
                C1067hH c1067hH3 = (C1067hH) obj;
                C1067hH c1067hH4 = (C1067hH) obj2;
                boolean z8 = c1067hH3.f13746o;
                Comparator comparator = C1112iH.f13929j;
                if (!z8 || !c1067hH3.f13749r) {
                    comparator = new Ev();
                }
                c1067hH3.f13747p.getClass();
                return Wu.f(comparator.compare(Integer.valueOf(c1067hH3.f13752u), Integer.valueOf(c1067hH4.f13752u))).c(Integer.valueOf(c1067hH3.f13751t), Integer.valueOf(c1067hH4.f13751t), comparator).a();
            case 13:
                return ((C1694vH) obj).f16005a - ((C1694vH) obj2).f16005a;
            default:
                return Float.compare(((C1694vH) obj).f16007c, ((C1694vH) obj2).f16007c);
        }
    }
}
