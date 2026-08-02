package O3;

import P.AbstractC0329z;
import P.C0315s;
import P.C0322v0;
import S3.Q;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSeasonChoiceViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4090k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4091l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4092m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4093n;

    public /* synthetic */ p(int i, int i5, Object obj, Object obj2) {
        this.f4090k = i5;
        this.f4092m = obj;
        this.f4093n = obj2;
        this.f4091l = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        Integer num = (Integer) obj2;
        switch (this.f4090k) {
            case 0:
                num.intValue();
                ((s) this.f4092m).c((q) this.f4093n, c0315s, AbstractC0329z.B(this.f4091l | 1));
                break;
            case 1:
                num.intValue();
                AbstractC0329z.a((C0322v0) this.f4092m, (i4.e) this.f4093n, c0315s, AbstractC0329z.B(this.f4091l | 1));
                break;
            case 2:
                num.intValue();
                AbstractC0329z.b((C0322v0[]) this.f4092m, (i4.e) this.f4093n, c0315s, AbstractC0329z.B(this.f4091l | 1));
                break;
            case 3:
                num.getClass();
                int B5 = AbstractC0329z.B(1);
                Q.b(this.f4091l, (i4.e) this.f4092m, (AquaSeasonChoiceViewModel) this.f4093n, c0315s, B5);
                break;
            default:
                num.intValue();
                ((X.d) this.f4092m).d(this.f4093n, c0315s, AbstractC0329z.B(this.f4091l) | 1);
                break;
        }
        return W3.o.f6046a;
    }

    public /* synthetic */ p(int i, i4.e eVar, AquaSeasonChoiceViewModel aquaSeasonChoiceViewModel, int i5) {
        this.f4090k = 3;
        this.f4091l = i;
        this.f4092m = eVar;
        this.f4093n = aquaSeasonChoiceViewModel;
    }
}
