package K0;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C1639u7;
import game.betting133.sports1xbet.R;
import h0.C1988b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k4.AbstractC2036a;
import n.AbstractC2107A;

/* renamed from: K0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0204i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2832k;

    public /* synthetic */ C0204i(int i) {
        this.f2832k = i;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        int i = 0;
        G g5 = null;
        r12 = null;
        i0.I i5 = null;
        r12 = null;
        V0.s sVar = null;
        r12 = null;
        M m5 = null;
        r12 = null;
        C0208m c0208m = null;
        r12 = null;
        C0209n c0209n = null;
        r12 = null;
        P p5 = null;
        r12 = null;
        Q q5 = null;
        r12 = null;
        G g6 = null;
        r12 = null;
        w wVar = null;
        r12 = null;
        M m6 = null;
        g5 = null;
        switch (this.f2832k) {
            case 0:
                return Boolean.valueOf(!(((InterfaceC0198c) obj) instanceof w));
            case 1:
                t tVar = (t) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(tVar.f2863b);
                sb.append(", ");
                return AbstractC2107A.t(sb, tVar.f2864c, ')');
            case 2:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list = (List) obj;
                Object obj2 = list.get(0);
                v3.g gVar = E.f2748h;
                Boolean bool = Boolean.FALSE;
                boolean a5 = kotlin.jvm.internal.l.a(obj2, bool);
                i4.c cVar = (i4.c) gVar.f20440m;
                G g7 = (a5 || obj2 == null) ? null : (G) cVar.c(obj2);
                Object obj3 = list.get(1);
                G g8 = (kotlin.jvm.internal.l.a(obj3, bool) || obj3 == null) ? null : (G) cVar.c(obj3);
                Object obj4 = list.get(2);
                G g9 = (kotlin.jvm.internal.l.a(obj4, bool) || obj4 == null) ? null : (G) cVar.c(obj4);
                Object obj5 = list.get(3);
                if (!kotlin.jvm.internal.l.a(obj5, bool) && obj5 != null) {
                    g5 = (G) cVar.c(obj5);
                }
                return new M(g7, g8, g9, g5);
            case 3:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((i4.c) E.f2742a.f20440m).c(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                kotlin.jvm.internal.l.c(str);
                return new C0203h(list3, str);
            case 4:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new V0.l(((Integer) obj).intValue());
            case 5:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>", obj);
                List list4 = (List) obj;
                return new V0.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 6:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                W0.p[] pVarArr = W0.o.f6020b;
                D d5 = E.f2756q;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj8, bool2);
                i4.c cVar2 = d5.f2741l;
                W0.o oVar = obj8 != null ? (W0.o) cVar2.c(obj8) : null;
                kotlin.jvm.internal.l.c(oVar);
                Object obj9 = list5.get(1);
                kotlin.jvm.internal.l.a(obj9, bool2);
                W0.o oVar2 = obj9 != null ? (W0.o) cVar2.c(obj9) : null;
                kotlin.jvm.internal.l.c(oVar2);
                return new V0.q(oVar.f6022a, oVar2.f6022a);
            case 7:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new O0.l(((Integer) obj).intValue());
            case 8:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj);
                return new V0.a(((Float) obj).floatValue());
            case 9:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                kotlin.jvm.internal.l.c(num);
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                kotlin.jvm.internal.l.c(num2);
                return new N(F.b(intValue, num2.intValue()));
            case 10:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i6 = i0.p.f17294h;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj12, bool3);
                i0.p pVar = obj12 != null ? kotlin.jvm.internal.l.a(obj12, Boolean.FALSE) ? new i0.p(i0.p.f17293g) : new i0.p(i0.F.c(((Integer) obj12).intValue())) : null;
                kotlin.jvm.internal.l.c(pVar);
                Object obj13 = list7.get(1);
                D d6 = E.f2757r;
                kotlin.jvm.internal.l.a(obj13, bool3);
                C1988b c1988b = obj13 != null ? (C1988b) d6.f2741l.c(obj13) : null;
                kotlin.jvm.internal.l.c(c1988b);
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                kotlin.jvm.internal.l.c(f);
                return new i0.I(f.floatValue(), pVar.f17295a, c1988b.f17191a);
            case 11:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new W0.o(W0.o.f6021c);
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f5 = obj15 != null ? (Float) obj15 : null;
                kotlin.jvm.internal.l.c(f5);
                float floatValue = f5.floatValue();
                Object obj16 = list8.get(1);
                W0.p pVar2 = obj16 != null ? (W0.p) obj16 : null;
                kotlin.jvm.internal.l.c(pVar2);
                return new W0.o(AbstractC2036a.M(floatValue, pVar2.f6023a));
            case 12:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                kotlin.jvm.internal.l.c(str2);
                Object obj18 = list9.get(1);
                v3.g gVar2 = E.i;
                if (!kotlin.jvm.internal.l.a(obj18, Boolean.FALSE) && obj18 != null) {
                    m6 = (M) ((i4.c) gVar2.f20440m).c(obj18);
                }
                return new C0209n(str2, m6);
            case 13:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new C1988b(9205357640488583168L);
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f6 = obj19 != null ? (Float) obj19 : null;
                kotlin.jvm.internal.l.c(f6);
                float floatValue2 = f6.floatValue();
                Object obj20 = list10.get(1);
                kotlin.jvm.internal.l.c(obj20 != null ? (Float) obj20 : null);
                return new C1988b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r12.floatValue()) & 4294967295L));
            case 14:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i < size) {
                    Object obj21 = list11.get(i);
                    R0.a aVar = (kotlin.jvm.internal.l.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (R0.a) ((i4.c) E.f2759t.f20440m).c(obj21);
                    kotlin.jvm.internal.l.c(aVar);
                    arrayList.add(aVar);
                    i++;
                }
                return new R0.b(arrayList);
            case 15:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    C0201f c0201f = (kotlin.jvm.internal.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (C0201f) ((i4.c) E.f2743b.f20440m).c(obj22);
                    kotlin.jvm.internal.l.c(c0201f);
                    arrayList2.add(c0201f);
                    i++;
                }
                return arrayList2;
            case 16:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj);
                return new R0.a(R0.d.f5124a.l((String) obj));
            case 17:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                V0.f fVar = obj23 != null ? (V0.f) obj23 : null;
                kotlin.jvm.internal.l.c(fVar);
                Object obj24 = list13.get(1);
                V0.h hVar = obj24 != null ? (V0.h) obj24 : null;
                kotlin.jvm.internal.l.c(hVar);
                Object obj25 = list13.get(2);
                kotlin.jvm.internal.l.c(obj25 != null ? (V0.g) obj25 : null);
                return new V0.i(hVar.f5936a, fVar.f5935a);
            case 18:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                EnumC0206k enumC0206k = obj26 != null ? (EnumC0206k) obj26 : null;
                kotlin.jvm.internal.l.c(enumC0206k);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                kotlin.jvm.internal.l.c(num3);
                int intValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                kotlin.jvm.internal.l.c(num4);
                int intValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str3 = obj29 != null ? (String) obj29 : null;
                kotlin.jvm.internal.l.c(str3);
                switch (enumC0206k.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        v3.g gVar3 = E.f2747g;
                        if (!kotlin.jvm.internal.l.a(obj30, Boolean.FALSE) && obj30 != null) {
                            wVar = (w) ((i4.c) gVar3.f20440m).c(obj30);
                        }
                        kotlin.jvm.internal.l.c(wVar);
                        return new C0201f(wVar, intValue2, intValue3, str3);
                    case 1:
                        Object obj31 = list14.get(1);
                        v3.g gVar4 = E.f2748h;
                        if (!kotlin.jvm.internal.l.a(obj31, Boolean.FALSE) && obj31 != null) {
                            g6 = (G) ((i4.c) gVar4.f20440m).c(obj31);
                        }
                        kotlin.jvm.internal.l.c(g6);
                        return new C0201f(g6, intValue2, intValue3, str3);
                    case 2:
                        Object obj32 = list14.get(1);
                        v3.g gVar5 = E.f2744c;
                        if (!kotlin.jvm.internal.l.a(obj32, Boolean.FALSE) && obj32 != null) {
                            q5 = (Q) ((i4.c) gVar5.f20440m).c(obj32);
                        }
                        kotlin.jvm.internal.l.c(q5);
                        return new C0201f(q5, intValue2, intValue3, str3);
                    case 3:
                        Object obj33 = list14.get(1);
                        v3.g gVar6 = E.f2745d;
                        if (!kotlin.jvm.internal.l.a(obj33, Boolean.FALSE) && obj33 != null) {
                            p5 = (P) ((i4.c) gVar6.f20440m).c(obj33);
                        }
                        kotlin.jvm.internal.l.c(p5);
                        return new C0201f(p5, intValue2, intValue3, str3);
                    case 4:
                        Object obj34 = list14.get(1);
                        v3.g gVar7 = E.f2746e;
                        if (!kotlin.jvm.internal.l.a(obj34, Boolean.FALSE) && obj34 != null) {
                            c0209n = (C0209n) ((i4.c) gVar7.f20440m).c(obj34);
                        }
                        kotlin.jvm.internal.l.c(c0209n);
                        return new C0201f(c0209n, intValue2, intValue3, str3);
                    case 5:
                        Object obj35 = list14.get(1);
                        v3.g gVar8 = E.f;
                        if (!kotlin.jvm.internal.l.a(obj35, Boolean.FALSE) && obj35 != null) {
                            c0208m = (C0208m) ((i4.c) gVar8.f20440m).c(obj35);
                        }
                        kotlin.jvm.internal.l.c(c0208m);
                        return new C0201f(c0208m, intValue2, intValue3, str3);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str4 = obj36 != null ? (String) obj36 : null;
                        kotlin.jvm.internal.l.c(str4);
                        return new C0201f(new I(str4), intValue2, intValue3, str3);
                    default:
                        throw new D2.e();
                }
            case 19:
                String str5 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.l.c(str5);
                return new Q(str5);
            case 20:
                String str6 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.l.c(str6);
                return new P(str6);
            case C1639u7.zzm /* 21 */:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str7 = obj37 != null ? (String) obj37 : null;
                kotlin.jvm.internal.l.c(str7);
                Object obj38 = list15.get(1);
                v3.g gVar9 = E.i;
                if (!kotlin.jvm.internal.l.a(obj38, Boolean.FALSE) && obj38 != null) {
                    m5 = (M) ((i4.c) gVar9.f20440m).c(obj38);
                }
                return new C0208m(str7, m5);
            case 22:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                V0.k kVar = obj39 != null ? (V0.k) obj39 : null;
                kotlin.jvm.internal.l.c(kVar);
                Object obj40 = list16.get(1);
                V0.m mVar = obj40 != null ? (V0.m) obj40 : null;
                kotlin.jvm.internal.l.c(mVar);
                Object obj41 = list16.get(2);
                W0.p[] pVarArr2 = W0.o.f6020b;
                D d7 = E.f2756q;
                Boolean bool4 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj41, bool4);
                W0.o oVar3 = obj41 != null ? (W0.o) d7.f2741l.c(obj41) : null;
                kotlin.jvm.internal.l.c(oVar3);
                Object obj42 = list16.get(3);
                V0.q qVar = V0.q.f5953c;
                V0.q qVar2 = (kotlin.jvm.internal.l.a(obj42, bool4) || obj42 == null) ? null : (V0.q) ((i4.c) E.f2751l.f20440m).c(obj42);
                Object obj43 = list16.get(4);
                y yVar = (kotlin.jvm.internal.l.a(obj43, bool4) || obj43 == null) ? null : (y) ((i4.c) F.f2761a.f20440m).c(obj43);
                Object obj44 = list16.get(5);
                V0.i iVar = V0.i.f5937c;
                V0.i iVar2 = (kotlin.jvm.internal.l.a(obj44, bool4) || obj44 == null) ? null : (V0.i) ((i4.c) E.f2760u.f20440m).c(obj44);
                Object obj45 = list16.get(6);
                V0.e eVar = (kotlin.jvm.internal.l.a(obj45, bool4) || obj45 == null) ? null : (V0.e) ((i4.c) F.f2762b.f20440m).c(obj45);
                kotlin.jvm.internal.l.c(eVar);
                Object obj46 = list16.get(7);
                V0.d dVar = obj46 != null ? (V0.d) obj46 : null;
                kotlin.jvm.internal.l.c(dVar);
                Object obj47 = list16.get(8);
                v3.g gVar10 = F.f2763c;
                if (!kotlin.jvm.internal.l.a(obj47, bool4) && obj47 != null) {
                    sVar = (V0.s) ((i4.c) gVar10.f20440m).c(obj47);
                }
                return new w(kVar.f5943a, mVar.f5948a, oVar3.f6022a, qVar2, yVar, iVar2, eVar.f5931a, dVar.f5929a, sVar);
            case 23:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i7 = i0.p.f17294h;
                Boolean bool5 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj48, bool5);
                i0.p pVar3 = obj48 != null ? obj48.equals(bool5) ? new i0.p(i0.p.f17293g) : new i0.p(i0.F.c(((Integer) obj48).intValue())) : null;
                kotlin.jvm.internal.l.c(pVar3);
                Object obj49 = list17.get(1);
                W0.p[] pVarArr3 = W0.o.f6020b;
                D d8 = E.f2756q;
                kotlin.jvm.internal.l.a(obj49, bool5);
                i4.c cVar3 = d8.f2741l;
                W0.o oVar4 = obj49 != null ? (W0.o) cVar3.c(obj49) : null;
                kotlin.jvm.internal.l.c(oVar4);
                Object obj50 = list17.get(2);
                O0.l lVar = O0.l.f4026l;
                O0.l lVar2 = (kotlin.jvm.internal.l.a(obj50, bool5) || obj50 == null) ? null : (O0.l) ((i4.c) E.f2752m.f20440m).c(obj50);
                Object obj51 = list17.get(3);
                O0.j jVar = obj51 != null ? (O0.j) obj51 : null;
                Object obj52 = list17.get(4);
                O0.k kVar2 = obj52 != null ? (O0.k) obj52 : null;
                Object obj53 = list17.get(6);
                String str8 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                kotlin.jvm.internal.l.a(obj54, bool5);
                W0.o oVar5 = obj54 != null ? (W0.o) cVar3.c(obj54) : null;
                kotlin.jvm.internal.l.c(oVar5);
                Object obj55 = list17.get(8);
                V0.a aVar2 = (kotlin.jvm.internal.l.a(obj55, bool5) || obj55 == null) ? null : (V0.a) ((i4.c) E.f2753n.f20440m).c(obj55);
                Object obj56 = list17.get(9);
                V0.p pVar4 = (kotlin.jvm.internal.l.a(obj56, bool5) || obj56 == null) ? null : (V0.p) ((i4.c) E.f2750k.f20440m).c(obj56);
                Object obj57 = list17.get(10);
                R0.b bVar = R0.b.f5121m;
                R0.b bVar2 = (kotlin.jvm.internal.l.a(obj57, bool5) || obj57 == null) ? null : (R0.b) ((i4.c) E.f2758s.f20440m).c(obj57);
                Object obj58 = list17.get(11);
                kotlin.jvm.internal.l.a(obj58, bool5);
                i0.p pVar5 = obj58 != null ? obj58.equals(bool5) ? new i0.p(i0.p.f17293g) : new i0.p(i0.F.c(((Integer) obj58).intValue())) : null;
                kotlin.jvm.internal.l.c(pVar5);
                Object obj59 = list17.get(12);
                V0.l lVar3 = (kotlin.jvm.internal.l.a(obj59, bool5) || obj59 == null) ? null : (V0.l) ((i4.c) E.f2749j.f20440m).c(obj59);
                Object obj60 = list17.get(13);
                i0.I i8 = i0.I.f17244d;
                v3.g gVar11 = E.f2754o;
                if (!kotlin.jvm.internal.l.a(obj60, bool5) && obj60 != null) {
                    i5 = (i0.I) ((i4.c) gVar11.f20440m).c(obj60);
                }
                return new G(pVar3.f17295a, oVar4.f6022a, lVar2, jVar, kVar2, (O0.o) null, str8, oVar5.f6022a, aVar2, pVar4, bVar2, pVar5.f17295a, lVar3, i5, 49184);
            case 24:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                kotlin.jvm.internal.l.c(bool6);
                boolean booleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                kotlin.jvm.internal.l.c(obj62 != null ? (C0207l) obj62 : null);
                return new y(booleanValue);
            case 25:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new V0.e(((Integer) obj).intValue());
            case 26:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                V0.r rVar = obj63 != null ? (V0.r) obj63 : null;
                kotlin.jvm.internal.l.c(rVar);
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                kotlin.jvm.internal.l.c(bool7);
                return new V0.s(rVar.f5956a, bool7.booleanValue());
            case 27:
                Context context = (Context) obj;
                kotlin.jvm.internal.l.f("context", context);
                return new FrameLayout(context);
            case 28:
                Context context2 = (Context) obj;
                kotlin.jvm.internal.l.f("ctx", context2);
                ImageView imageView = new ImageView(context2);
                imageView.setImageResource(R.mipmap.ic_launcher);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setContentDescription(context2.getString(R.string.app_name));
                return imageView;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("it", entry);
                return entry.getKey();
        }
    }
}
