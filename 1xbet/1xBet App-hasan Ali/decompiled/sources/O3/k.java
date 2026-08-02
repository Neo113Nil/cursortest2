package O3;

import P.AbstractC0329z;
import P.C0315s;
import S3.AbstractC0406i;
import game.betting133.sports1xbet.aqua_viewmodels.AquaAthleteProfileViewModel;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4075k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4076l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4077m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f4078n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4079o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4080p;

    public /* synthetic */ k(int i, int i5, InterfaceC2015a interfaceC2015a, Object obj, AquaAthleteProfileViewModel aquaAthleteProfileViewModel, int i6) {
        this.f4076l = i;
        this.f4077m = i5;
        this.f4078n = interfaceC2015a;
        this.f4079o = obj;
        this.f4080p = aquaAthleteProfileViewModel;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4075k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(this.f4076l | 1);
                b0.m mVar = (b0.m) this.f4080p;
                N4.b.M(this.f4078n, this.f4079o, mVar, (C0315s) obj, B5, this.f4077m);
                break;
            default:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(1);
                Object obj3 = this.f4079o;
                AquaAthleteProfileViewModel aquaAthleteProfileViewModel = (AquaAthleteProfileViewModel) this.f4080p;
                AbstractC0406i.a(this.f4076l, this.f4077m, this.f4078n, obj3, aquaAthleteProfileViewModel, (C0315s) obj, B6);
                break;
        }
        return W3.o.f6046a;
    }

    public /* synthetic */ k(InterfaceC2015a interfaceC2015a, Object obj, b0.m mVar, int i, int i5) {
        this.f4078n = interfaceC2015a;
        this.f4079o = obj;
        this.f4080p = mVar;
        this.f4076l = i;
        this.f4077m = i5;
    }
}
