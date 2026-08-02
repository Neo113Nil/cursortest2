package K0;

import P.AbstractC0329z;
import P.C0315s;
import a.AbstractC0444a;
import com.google.android.gms.internal.ads.C1639u7;
import h0.C1988b;
import java.util.ArrayList;
import java.util.List;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2737k;

    public /* synthetic */ A(int i) {
        this.f2737k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        EnumC0206k enumC0206k;
        Object a5;
        W3.o oVar = W3.o.f6046a;
        switch (this.f2737k) {
            case 0:
                C0203h c0203h = (C0203h) obj2;
                return X3.n.L(c0203h.f2829l, E.a(c0203h.f2828k, E.f2742a, (Y.b) obj));
            case 1:
                return Integer.valueOf(((V0.l) obj2).f5947a);
            case 2:
                V0.p pVar = (V0.p) obj2;
                return X3.n.L(Float.valueOf(pVar.f5951a), Float.valueOf(pVar.f5952b));
            case 3:
                Y.b bVar = (Y.b) obj;
                V0.q qVar = (V0.q) obj2;
                W0.o oVar2 = new W0.o(qVar.f5954a);
                D d5 = E.f2756q;
                return X3.n.L(E.a(oVar2, d5, bVar), E.a(new W0.o(qVar.f5955b), d5, bVar));
            case 4:
                return Integer.valueOf(((O0.l) obj2).f4033k);
            case 5:
                C0209n c0209n = (C0209n) obj2;
                return X3.n.L(c0209n.f2844a, E.a(c0209n.f2845b, E.i, (Y.b) obj));
            case 6:
                return Float.valueOf(((V0.a) obj2).f5925a);
            case 7:
                Y.b bVar2 = (Y.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(E.a((C0201f) list.get(i), E.f2743b, bVar2));
                }
                return arrayList;
            case 8:
                N n5 = (N) obj2;
                return X3.n.L(Integer.valueOf((int) (n5.f2803a >> 32)), Integer.valueOf((int) (4294967295L & n5.f2803a)));
            case 9:
                Y.b bVar3 = (Y.b) obj;
                i0.I i5 = (i0.I) obj2;
                return X3.n.L(E.a(new i0.p(i5.f17245a), E.f2755p, bVar3), E.a(new C1988b(i5.f17246b), E.f2757r, bVar3), Float.valueOf(i5.f17247c));
            case 10:
                W0.o oVar3 = (W0.o) obj2;
                return oVar3 == null ? false : W0.o.a(oVar3.f6022a, W0.o.f6021c) ? Boolean.FALSE : X3.n.L(Float.valueOf(W0.o.c(oVar3.f6022a)), new W0.p(W0.o.b(oVar3.f6022a)));
            case 11:
                C1988b c1988b = (C1988b) obj2;
                return c1988b == null ? false : C1988b.b(c1988b.f17191a, 9205357640488583168L) ? Boolean.FALSE : X3.n.L(Float.valueOf(Float.intBitsToFloat((int) (c1988b.f17191a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & c1988b.f17191a))));
            case 12:
                Y.b bVar4 = (Y.b) obj;
                List list2 = ((R0.b) obj2).f5122k;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(E.a((R0.a) list2.get(i6), E.f2759t, bVar4));
                }
                return arrayList2;
            case 13:
                return ((R0.a) obj2).f5120a.toLanguageTag();
            case 14:
                V0.i iVar = (V0.i) obj2;
                return X3.n.L(new V0.f(iVar.f5938a), new V0.h(iVar.f5939b), new V0.g());
            case 15:
                Y.b bVar5 = (Y.b) obj;
                C0201f c0201f = (C0201f) obj2;
                Object obj3 = c0201f.f2823a;
                if (obj3 instanceof w) {
                    enumC0206k = EnumC0206k.f2834k;
                } else if (obj3 instanceof G) {
                    enumC0206k = EnumC0206k.f2835l;
                } else if (obj3 instanceof Q) {
                    enumC0206k = EnumC0206k.f2836m;
                } else if (obj3 instanceof P) {
                    enumC0206k = EnumC0206k.f2837n;
                } else if (obj3 instanceof C0209n) {
                    enumC0206k = EnumC0206k.f2838o;
                } else if (obj3 instanceof C0208m) {
                    enumC0206k = EnumC0206k.f2839p;
                } else {
                    if (!(obj3 instanceof I)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0206k = EnumC0206k.f2840q;
                }
                int ordinal = enumC0206k.ordinal();
                Object obj4 = c0201f.f2823a;
                switch (ordinal) {
                    case 0:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle", obj4);
                        a5 = E.a((w) obj4, E.f2747g, bVar5);
                        break;
                    case 1:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle", obj4);
                        a5 = E.a((G) obj4, E.f2748h, bVar5);
                        break;
                    case 2:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation", obj4);
                        a5 = E.a((Q) obj4, E.f2744c, bVar5);
                        break;
                    case 3:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation", obj4);
                        a5 = E.a((P) obj4, E.f2745d, bVar5);
                        break;
                    case 4:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url", obj4);
                        a5 = E.a((C0209n) obj4, E.f2746e, bVar5);
                        break;
                    case 5:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable", obj4);
                        a5 = E.a((C0208m) obj4, E.f, bVar5);
                        break;
                    case 6:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation", obj4);
                        a5 = ((I) obj4).f2781a;
                        break;
                    default:
                        throw new D2.e();
                }
                return X3.n.L(enumC0206k, a5, Integer.valueOf(c0201f.f2824b), Integer.valueOf(c0201f.f2825c), c0201f.f2826d);
            case 16:
                C0208m c0208m = (C0208m) obj2;
                return X3.n.L(c0208m.f2842a, E.a(c0208m.f2843b, E.i, (Y.b) obj));
            case 17:
                return ((Q) obj2).f2809a;
            case 18:
                return ((P) obj2).f2808a;
            case 19:
                Y.b bVar6 = (Y.b) obj;
                w wVar = (w) obj2;
                V0.k kVar = new V0.k(wVar.f2871a);
                V0.m mVar = new V0.m(wVar.f2872b);
                Object a6 = E.a(new W0.o(wVar.f2873c), E.f2756q, bVar6);
                V0.q qVar2 = V0.q.f5953c;
                Object a7 = E.a(wVar.f2874d, E.f2751l, bVar6);
                Object a8 = E.a(wVar.f2875e, F.f2761a, bVar6);
                V0.i iVar2 = V0.i.f5937c;
                return X3.n.L(kVar, mVar, a6, a7, a8, E.a(wVar.f, E.f2760u, bVar6), E.a(new V0.e(wVar.f2876g), F.f2762b, bVar6), new V0.d(wVar.f2877h), E.a(wVar.i, F.f2763c, bVar6));
            case 20:
                Y.b bVar7 = (Y.b) obj;
                G g5 = (G) obj2;
                i0.p pVar2 = new i0.p(g5.f2764a.b());
                D d6 = E.f2755p;
                Object a9 = E.a(pVar2, d6, bVar7);
                W0.o oVar4 = new W0.o(g5.f2765b);
                D d7 = E.f2756q;
                Object a10 = E.a(oVar4, d7, bVar7);
                O0.l lVar = O0.l.f4026l;
                Object a11 = E.a(g5.f2766c, E.f2752m, bVar7);
                Object a12 = E.a(new W0.o(g5.f2770h), d7, bVar7);
                Object a13 = E.a(g5.i, E.f2753n, bVar7);
                Object a14 = E.a(g5.f2771j, E.f2750k, bVar7);
                R0.b bVar8 = R0.b.f5121m;
                Object a15 = E.a(g5.f2772k, E.f2758s, bVar7);
                Object a16 = E.a(new i0.p(g5.f2773l), d6, bVar7);
                Object a17 = E.a(g5.f2774m, E.f2749j, bVar7);
                i0.I i7 = i0.I.f17244d;
                return X3.n.L(a9, a10, a11, g5.f2767d, g5.f2768e, -1, g5.f2769g, a12, a13, a14, a15, a16, a17, E.a(g5.f2775n, E.f2754o, bVar7));
            case C1639u7.zzm /* 21 */:
                Y.b bVar9 = (Y.b) obj;
                M m5 = (M) obj2;
                G g6 = m5.f2797a;
                v3.g gVar = E.f2748h;
                return X3.n.L(E.a(g6, gVar, bVar9), E.a(m5.f2798b, gVar, bVar9), E.a(m5.f2799c, gVar, bVar9), E.a(m5.f2800d, gVar, bVar9));
            case 22:
                Boolean valueOf = Boolean.valueOf(((y) obj2).f2880a);
                v3.g gVar2 = E.f2742a;
                return X3.n.L(valueOf, new C0207l());
            case 23:
                return Integer.valueOf(((V0.e) obj2).f5931a);
            case 24:
                V0.s sVar = (V0.s) obj2;
                V0.r rVar = new V0.r(sVar.f5959a);
                v3.g gVar3 = E.f2742a;
                return X3.n.L(rVar, Boolean.valueOf(sVar.f5960b));
            case 25:
                ((Integer) obj2).getClass();
                AbstractC2036a.a0(AbstractC0329z.B(1), (C0315s) obj);
                return oVar;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC2036a.O(AbstractC0329z.B(1), (C0315s) obj);
                return oVar;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC0444a.F(AbstractC0329z.B(1), (C0315s) obj);
                return oVar;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC0444a.F(AbstractC0329z.B(1), (C0315s) obj);
                return oVar;
            default:
                ((Integer) obj2).getClass();
                AbstractC0444a.P(AbstractC0329z.B(1), (C0315s) obj);
                return oVar;
        }
    }

    public /* synthetic */ A(int i, int i5) {
        this.f2737k = i5;
    }
}
