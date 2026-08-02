package T3;

import G1.AbstractC0136g;
import G1.E;
import S3.C0416t;
import W3.o;
import i4.InterfaceC2015a;
import o4.AbstractC2234l;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5777k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5778l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5780n;

    public /* synthetic */ f(Object obj, int i, int i5, int i6) {
        this.f5777k = i6;
        this.f5778l = obj;
        this.f5779m = i;
        this.f5780n = i5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        o oVar = o.f6046a;
        Object obj = this.f5778l;
        int i = this.f5780n;
        int i5 = this.f5779m;
        switch (this.f5777k) {
            case 0:
                E.l((E) obj, AbstractC2425d.m(i5, i), null, 6);
                break;
            case 1:
                E.l((E) obj, AbstractC2425d.m(i5, i), null, 6);
                break;
            case 2:
                String m5 = AbstractC2425d.m(i5, i);
                C0416t c0416t = new C0416t(6);
                E e3 = (E) obj;
                e3.getClass();
                E.l(e3, m5, AbstractC0136g.e(c0416t), 4);
                break;
            case 3:
                W3.h[] hVarArr = {new W3.h("playerKey", Integer.valueOf(i5)), new W3.h("yearKey", Integer.valueOf(i))};
                String str = "appR/navigator/player_profile/{playerKey}/{yearKey}";
                for (int i6 = 0; i6 < 2; i6++) {
                    W3.h hVar = hVarArr[i6];
                    str = AbstractC2234l.v0(str, "{" + hVar.f6036k + "}", String.valueOf(((Number) hVar.f6037l).intValue()));
                }
                E.l((E) obj, str, null, 6);
                break;
            default:
                ((i4.e) obj).invoke(Integer.valueOf(i5), Integer.valueOf(i));
                break;
        }
        return oVar;
    }
}
