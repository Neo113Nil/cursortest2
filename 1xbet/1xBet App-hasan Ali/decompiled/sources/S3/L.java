package S3;

import P.AbstractC0329z;
import P.C0315s;
import a4.C0471b;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import java.util.Map;
import k4.AbstractC2036a;
import p4.j0;
import r.C2321G;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5394k;

    public /* synthetic */ L(int i) {
        this.f5394k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0471b c0471b;
        switch (this.f5394k) {
            case 0:
                ((Integer) obj2).getClass();
                Q.c(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2036a.N(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 2:
                ((Integer) obj).intValue();
                AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj2;
                kotlin.jvm.internal.l.f("row_arg", aquaCompetitionBundle);
                AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
                return Integer.valueOf(compe_par_tition != null ? compe_par_tition.getCode_arg() : 0);
            case 3:
                Y.d dVar = (Y.d) obj2;
                C2321G c2321g = dVar.f6108l;
                Object[] objArr = c2321g.f18929b;
                Object[] objArr2 = c2321g.f18930c;
                long[] jArr = c2321g.f18928a;
                int length = jArr.length - 2;
                Map map = dVar.f6107k;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j5 = jArr[i];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j5) < 128) {
                                    int i7 = (i << 3) + i6;
                                    Object obj3 = objArr[i7];
                                    Map d5 = ((Y.f) objArr2[i7]).d();
                                    if (d5.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d5);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 4:
                return obj2;
            case 5:
                String str = (String) obj;
                a4.f fVar = (a4.f) obj2;
                kotlin.jvm.internal.l.f("acc", str);
                kotlin.jvm.internal.l.f("element", fVar);
                if (str.length() == 0) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            case 6:
                a4.h hVar = (a4.h) obj;
                a4.f fVar2 = (a4.f) obj2;
                kotlin.jvm.internal.l.f("acc", hVar);
                kotlin.jvm.internal.l.f("element", fVar2);
                a4.h r5 = hVar.r(fVar2.getKey());
                a4.i iVar = a4.i.f6649k;
                if (r5 == iVar) {
                    return fVar2;
                }
                a4.d dVar2 = a4.d.f6648k;
                a4.e eVar = (a4.e) r5.l(dVar2);
                if (eVar == null) {
                    c0471b = new C0471b(fVar2, r5);
                } else {
                    a4.h r6 = r5.r(dVar2);
                    if (r6 == iVar) {
                        return new C0471b(eVar, fVar2);
                    }
                    c0471b = new C0471b(eVar, new C0471b(fVar2, r6));
                }
                return c0471b;
            case 7:
                return ((a4.h) obj).m((a4.f) obj2);
            case 8:
                return ((a4.h) obj).m((a4.f) obj2);
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                a4.f fVar3 = (a4.f) obj2;
                if (!(fVar3 instanceof j0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar3 : Integer.valueOf(intValue + 1);
            case 12:
                j0 j0Var = (j0) obj;
                a4.f fVar4 = (a4.f) obj2;
                if (j0Var != null) {
                    return j0Var;
                }
                if (fVar4 instanceof j0) {
                    return (j0) fVar4;
                }
                return null;
            default:
                return (u4.u) obj;
        }
    }

    public /* synthetic */ L(int i, int i5) {
        this.f5394k = i5;
    }
}
