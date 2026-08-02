package S3;

import P.AbstractC0329z;
import P.C0315s;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightViewModel;
import i4.InterfaceC2015a;

/* renamed from: S3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0421y implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5564k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AquaFixtureInsightViewModel f5568o;

    public /* synthetic */ C0421y(int i, InterfaceC2015a interfaceC2015a, Object obj, AquaFixtureInsightViewModel aquaFixtureInsightViewModel, int i5, int i6) {
        this.f5564k = i6;
        this.f5565l = i;
        this.f5566m = interfaceC2015a;
        this.f5567n = obj;
        this.f5568o = aquaFixtureInsightViewModel;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5564k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(1);
                Object obj3 = this.f5567n;
                AquaFixtureInsightViewModel aquaFixtureInsightViewModel = this.f5568o;
                A.a(this.f5565l, this.f5566m, obj3, aquaFixtureInsightViewModel, (C0315s) obj, B5);
                break;
            default:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(1);
                Object obj4 = this.f5567n;
                AquaFixtureInsightViewModel aquaFixtureInsightViewModel2 = this.f5568o;
                B.a(this.f5565l, this.f5566m, obj4, aquaFixtureInsightViewModel2, (C0315s) obj, B6);
                break;
        }
        return W3.o.f6046a;
    }
}
