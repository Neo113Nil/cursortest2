package B1;

import A.C0008h;
import A0.C0016c0;
import A0.C0025f0;
import A0.C0028g0;
import K0.C0204i;
import O3.j;
import P.InterfaceC0289e0;
import P.K;
import Q2.A0;
import Q2.C0367k;
import Q2.C0375o;
import Q2.C0379q;
import Q2.C0397z0;
import Q2.G;
import Q2.K0;
import Q2.L0;
import Q2.U0;
import Q2.Z0;
import Q2.r;
import S3.C0411n;
import S3.C0416t;
import S3.C0417u;
import S3.C0418v;
import S3.L;
import S3.U;
import S3.Y;
import W3.o;
import X3.m;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.BinderC1372o9;
import com.google.android.gms.internal.ads.C0574Db;
import com.google.android.gms.internal.ads.F7;
import d.C1903c;
import game.betting133.sports1xbet.aqua_network.AquaClubSheet;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueUiState;
import i4.InterfaceC2015a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import m3.v;
import o4.AbstractC2227e;
import r.C2321G;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f732k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f735n;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f732k = i;
        this.f733l = obj;
        this.f734m = obj2;
        this.f735n = obj3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        J2.f fVar;
        switch (this.f732k) {
            case 0:
                final w wVar = new w();
                final g gVar = (g) this.f734m;
                final i4.c cVar = (i4.c) this.f735n;
                InterfaceC0489s interfaceC0489s = new InterfaceC0489s() { // from class: B1.d
                    @Override // androidx.lifecycle.InterfaceC0489s
                    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
                        int i = f.f748a[enumC0486o.ordinal()];
                        w wVar2 = wVar;
                        if (i == 1) {
                            wVar2.f17624k = cVar.c(g.this);
                        } else {
                            if (i != 2) {
                                return;
                            }
                            C1903c c1903c = (C1903c) wVar2.f17624k;
                            if (c1903c != null) {
                                c1903c.a();
                            }
                            wVar2.f17624k = null;
                        }
                    }
                };
                InterfaceC0491u interfaceC0491u = (InterfaceC0491u) this.f733l;
                interfaceC0491u.g().a(interfaceC0489s);
                return new e(interfaceC0491u, interfaceC0489s, wVar, 0);
            case 1:
                l.f("$this$DisposableEffect", (K) obj);
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f735n;
                final O0.e eVar = new O0.e(1, interfaceC0289e0);
                O3.l lVar = new O3.l(0, interfaceC0289e0);
                final j jVar = (j) this.f733l;
                jVar.getClass();
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) this.f734m;
                l.f("onUserTap", interfaceC2015a);
                jVar.f4074c++;
                C0574Db c0574Db = jVar.f4073b;
                jVar.f4073b = null;
                if (c0574Db != null) {
                    c0574Db.g();
                }
                String obj2 = AbstractC2227e.Q0(AbstractC2349a.f19101k).toString();
                if (obj2.length() == 0) {
                    lVar.invoke();
                } else {
                    final int i = jVar.f4074c;
                    O3.i iVar = new O3.i(i, jVar, lVar, interfaceC2015a);
                    Context context = jVar.f4072a;
                    v.f("context cannot be null", context);
                    C0375o c0375o = C0379q.f.f5049b;
                    BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
                    c0375o.getClass();
                    G g5 = (G) new C0367k(c0375o, context, obj2, binderC0610Ia).d(context, false);
                    try {
                        g5.L1(new B8(4, false, -1, false, 1, null, false, 0, 0, false, 1 - 1));
                    } catch (RemoteException e3) {
                        U2.j.j("Failed to specify native ad options", e3);
                    }
                    try {
                        g5.j2(new U0(iVar));
                    } catch (RemoteException e5) {
                        U2.j.j("Failed to set AdListener.", e5);
                    }
                    try {
                        g5.Y2(new BinderC1372o9(1, new Z2.c() { // from class: O3.h
                            @Override // Z2.c
                            public final void d(C0574Db c0574Db2) {
                                j jVar2 = jVar;
                                if (i != jVar2.f4074c) {
                                    c0574Db2.g();
                                    return;
                                }
                                C0574Db c0574Db3 = jVar2.f4073b;
                                if (c0574Db3 != null) {
                                    c0574Db3.g();
                                }
                                jVar2.f4073b = c0574Db2;
                                eVar.c(c0574Db2);
                            }
                        }));
                    } catch (RemoteException e6) {
                        U2.j.j("Failed to add google native ad listener", e6);
                    }
                    try {
                        fVar = new J2.f(context, g5.b());
                    } catch (RemoteException e7) {
                        U2.j.g("Failed to build AdLoader.", e7);
                        fVar = new J2.f(context, new K0(new L0()));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("disable_native_ad_validator", "true");
                    C0397z0 c0397z0 = new C0397z0();
                    HashSet hashSet = c0397z0.f5067d;
                    hashSet.add("B3EEABB8EE11C2BE770B684D95219ECB");
                    c0397z0.f5065b.putBundle(AdMobAdapter.class.getName(), bundle);
                    if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                        hashSet.remove("B3EEABB8EE11C2BE770B684D95219ECB");
                    }
                    A0 a02 = new A0(c0397z0);
                    Context context2 = fVar.f2709a;
                    F7.a(context2);
                    if (((Boolean) AbstractC0968f8.f13456c.s()).booleanValue()) {
                        if (((Boolean) r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                            U2.c.f5860b.execute(new D3.h(6, fVar, a02, false));
                        }
                    }
                    try {
                        fVar.f2710b.Z0(Z0.a(context2, a02));
                    } catch (RemoteException e8) {
                        U2.j.g("Failed to load ad.", e8);
                    }
                }
                return new C0025f0(6, jVar, interfaceC0289e0);
            case 2:
                C0008h c0008h = (C0008h) obj;
                l.f("$this$LazyColumn", c0008h);
                L1.a.h(c0008h, null, new X.d(1556203448, new C0411n(1, (String) this.f734m, (String) this.f735n), true), 3);
                List m02 = m.m0(((LinkedHashMap) this.f733l).entrySet());
                c0008h.a(m02.size(), new C0028g0(22, new C0204i(29), m02), new C0417u(1, m02), new X.d(-632812321, new C0418v(1, m02), true));
                return o.f6046a;
            case 3:
                C0008h c0008h2 = (C0008h) obj;
                l.f("$this$LazyColumn", c0008h2);
                List<AquaCompetitionBundle> leagu_par_eRows = ((AquaSpotlightLeagueUiState) ((InterfaceC0289e0) this.f733l).getValue()).getLeagu_par_eRows();
                c0008h2.a(leagu_par_eRows.size(), new C0028g0(24, new L(2), leagu_par_eRows), new C0417u(5, leagu_par_eRows), new X.d(-1091073711, new U(leagu_par_eRows, (i4.e) this.f734m, (InterfaceC0289e0) this.f735n), true));
                return o.f6046a;
            case 4:
                C0008h c0008h3 = (C0008h) obj;
                l.f("$this$LazyColumn", c0008h3);
                L1.a.h(c0008h3, null, new X.d(-554363363, new O3.r(3, (AquaClubSheet) this.f734m), true), 3);
                AquaRosterDigest aquaRosterDigest = (AquaRosterDigest) this.f733l;
                L1.a.h(c0008h3, null, new X.d(201252358, new O3.r(4, aquaRosterDigest), true), 3);
                List<AquaPlayerSheet> roster_par_Members = aquaRosterDigest.getRoster_par_Members();
                c0008h3.a(roster_par_Members.size(), new C0028g0(25, new C0416t(3), roster_par_Members), new C0417u(6, roster_par_Members), new X.d(-632812321, new Y(roster_par_Members, (i4.e) this.f735n, 0), true));
                return o.f6046a;
            case 5:
                l.f("$this$DisposableEffect", (K) obj);
                String str = (String) this.f733l;
                boolean H02 = AbstractC2227e.H0(str);
                InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) this.f734m;
                if (!H02 && !str.equals((String) interfaceC0289e02.getValue())) {
                    interfaceC0289e02.setValue(str);
                    ((i4.c) this.f735n).c(str);
                }
                return new C0016c0(5, interfaceC0289e02);
            default:
                Y.d dVar = (Y.d) this.f733l;
                C2321G c2321g = dVar.f6108l;
                Object obj3 = this.f734m;
                if (c2321g.b(obj3)) {
                    throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
                }
                dVar.f6107k.remove(obj3);
                C2321G c2321g2 = dVar.f6108l;
                Y.i iVar2 = (Y.i) this.f735n;
                c2321g2.m(obj3, iVar2);
                return new e(dVar, obj3, iVar2, 2);
        }
    }

    public /* synthetic */ b(String str, i4.c cVar, InterfaceC0289e0 interfaceC0289e0) {
        this.f732k = 5;
        this.f733l = str;
        this.f735n = cVar;
        this.f734m = interfaceC0289e0;
    }
}
