package B1;

import A0.AbstractC0015c;
import G4.l;
import P.AbstractC0329z;
import P.C0315s;
import S3.Z;
import W3.o;
import androidx.lifecycle.InterfaceC0491u;
import b0.p;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSquadRosterViewModel;
import i4.InterfaceC2015a;
import o0.C2201e;
import x0.InterfaceC2624j;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f726k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f729n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f730o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f731p;

    public /* synthetic */ a(int i, InterfaceC2015a interfaceC2015a, i4.e eVar, Object obj, AquaSquadRosterViewModel aquaSquadRosterViewModel, int i5) {
        this.f726k = 2;
        this.f727l = i;
        this.f728m = interfaceC2015a;
        this.f729n = eVar;
        this.f730o = obj;
        this.f731p = aquaSquadRosterViewModel;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f726k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(this.f727l | 1);
                Boolean bool = (Boolean) this.f728m;
                InterfaceC0491u interfaceC0491u = (InterfaceC0491u) this.f730o;
                i4.c cVar = (i4.c) this.f731p;
                l.c(bool, (AbstractC0015c) this.f729n, interfaceC0491u, cVar, (C0315s) obj, B5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(this.f727l | 1);
                InterfaceC2624j interfaceC2624j = (InterfaceC2624j) this.f730o;
                C2201e c2201e = (C2201e) this.f731p;
                R3.l.a((String) this.f728m, (p) this.f729n, interfaceC2624j, c2201e, (C0315s) obj, B6);
                break;
            default:
                ((Integer) obj2).getClass();
                int B7 = AbstractC0329z.B(1);
                Object obj3 = this.f730o;
                AquaSquadRosterViewModel aquaSquadRosterViewModel = (AquaSquadRosterViewModel) this.f731p;
                Z.b(this.f727l, (InterfaceC2015a) this.f728m, (i4.e) this.f729n, obj3, aquaSquadRosterViewModel, (C0315s) obj, B7);
                break;
        }
        return o.f6046a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i, int i5) {
        this.f726k = i5;
        this.f728m = obj;
        this.f729n = obj2;
        this.f730o = obj3;
        this.f731p = obj4;
        this.f727l = i;
    }
}
