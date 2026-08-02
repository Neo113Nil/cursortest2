package P;

import A.C0008h;
import S3.C0410m;
import S3.C0411n;
import android.os.Trace;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPhaseBoard;
import game.betting133.sports1xbet.aqua_network.AquaShapeBundle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r.C2322H;

/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4262k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4265n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4266o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4267p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4268q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4270s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4271t;

    public /* synthetic */ D0(F0 f02, C2322H c2322h, C2322H c2322h2, List list, List list2, C2322H c2322h3, List list3, C2322H c2322h4, Set set) {
        this.f4263l = f02;
        this.f4264m = c2322h;
        this.f4265n = c2322h2;
        this.f4268q = list;
        this.f4269r = list2;
        this.f4266o = c2322h3;
        this.f4270s = list3;
        this.f4267p = c2322h4;
        this.f4271t = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i4.c
    public final Object c(Object obj) {
        boolean z3;
        long j5;
        List list;
        List list2;
        List list3;
        switch (this.f4262k) {
            case 0:
                F0 f02 = (F0) this.f4263l;
                C2322H c2322h = (C2322H) this.f4264m;
                C2322H c2322h2 = (C2322H) this.f4265n;
                List list4 = (List) this.f4268q;
                List list5 = (List) this.f4269r;
                c2322h2 = (C2322H) this.f4266o;
                list4 = (List) this.f4270s;
                c2322h2 = (C2322H) this.f4267p;
                Set set = (Set) this.f4271t;
                long longValue = ((Long) obj).longValue();
                if (F0.t(f02)) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        f02.f4290a.c(longValue);
                        Z.q.l();
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    f02.I();
                    synchronized (f02.f4291b) {
                        try {
                            R.e eVar = f02.f4296h;
                            Object[] objArr = eVar.f5106k;
                            int i = eVar.f5108m;
                            z3 = 0;
                            for (int i5 = 0; i5 < i; i5++) {
                                list4.add((C0327y) objArr[i5]);
                            }
                            f02.f4296h.h();
                        } finally {
                        }
                    }
                    c2322h.b();
                    while (true) {
                        if (list4.isEmpty() && list5.isEmpty()) {
                            Z.f k5 = Z.l.k();
                            Z.f yVar = k5 instanceof Z.b ? new Z.y((Z.b) k5, null, null, true, false) : new Z.z(k5, null, true, z3);
                            try {
                                Z.f j6 = yVar.j();
                                try {
                                    if (!list4.isEmpty()) {
                                        try {
                                            int size = list4.size();
                                            for (int i6 = z3; i6 < size; i6++) {
                                                c2322h2.a((C0327y) list4.get(i6));
                                            }
                                            int size2 = list4.size();
                                            for (int i7 = z3; i7 < size2; i7++) {
                                                ((C0327y) list4.get(i7)).d();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                f02.H(th, null);
                                                E0.f(f02, list4, list5, list4, c2322h2, c2322h2, c2322h, c2322h2);
                                                list4.clear();
                                                return W3.o.f6046a;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (c2322h2.h()) {
                                        try {
                                            c2322h2.j(c2322h2);
                                            Object[] objArr2 = c2322h2.f18934b;
                                            long[] jArr = c2322h2.f18933a;
                                            j5 = 128;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i8 = 0;
                                                while (true) {
                                                    long j7 = jArr[i8];
                                                    Object[] objArr3 = objArr2;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                            if ((j7 & 255) < 128) {
                                                                ((C0327y) objArr3[(i8 << 3) + i10]).f();
                                                            }
                                                            j7 >>= 8;
                                                        }
                                                        if (i9 != 8) {
                                                        }
                                                    }
                                                    if (i8 != length) {
                                                        i8++;
                                                        objArr2 = objArr3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                f02.H(th2, null);
                                                E0.f(f02, list4, list5, list4, c2322h2, c2322h2, c2322h, c2322h2);
                                                Z.f.q(j6);
                                                return W3.o.f6046a;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        j5 = 128;
                                    }
                                    if (c2322h2.h()) {
                                        try {
                                            Object[] objArr4 = c2322h2.f18934b;
                                            long[] jArr2 = c2322h2.f18933a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i11 = 0;
                                                while (true) {
                                                    long j8 = jArr2[i11];
                                                    list2 = list;
                                                    list3 = list5;
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j8 & 255) < j5) {
                                                                try {
                                                                    ((C0327y) objArr4[(i11 << 3) + i13]).g();
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    try {
                                                                        f02.H(th, null);
                                                                        E0.f(f02, list2, list3, list4, c2322h2, c2322h2, c2322h, c2322h2);
                                                                        c2322h2.b();
                                                                        Z.f.q(j6);
                                                                        return W3.o.f6046a;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            i13++;
                                                            j8 >>= 8;
                                                        }
                                                        if (i12 != 8) {
                                                        }
                                                    }
                                                    if (i11 != length2) {
                                                        i11++;
                                                        list = list2;
                                                        list5 = list3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            list2 = list;
                                            list3 = list5;
                                        }
                                    }
                                    yVar.c();
                                    synchronized (f02.f4291b) {
                                        f02.y();
                                    }
                                    Z.l.k().m();
                                    c2322h2.b();
                                    c2322h.b();
                                    f02.f4303p = null;
                                    return W3.o.f6046a;
                                } finally {
                                    Z.f.q(j6);
                                }
                            } finally {
                                yVar.c();
                            }
                        }
                        try {
                            int size3 = list4.size();
                            for (int i14 = 0; i14 < size3; i14++) {
                                C0327y c0327y = (C0327y) list4.get(i14);
                                C0327y G5 = f02.G(c0327y, c2322h);
                                if (G5 != null) {
                                    list4.add(G5);
                                }
                                c2322h2.a(c0327y);
                            }
                            list4.clear();
                            if (c2322h.h() || f02.f4296h.f5108m != 0) {
                                synchronized (f02.f4291b) {
                                    try {
                                        List B5 = f02.B();
                                        int size4 = B5.size();
                                        for (int i15 = 0; i15 < size4; i15++) {
                                            C0327y c0327y2 = (C0327y) B5.get(i15);
                                            if (!c2322h2.c(c0327y2) && c0327y2.v(set)) {
                                                list4.add(c0327y2);
                                            }
                                        }
                                        R.e eVar2 = f02.f4296h;
                                        int i16 = eVar2.f5108m;
                                        int i17 = 0;
                                        for (int i18 = 0; i18 < i16; i18++) {
                                            C0327y c0327y3 = (C0327y) eVar2.f5106k[i18];
                                            if (!c2322h2.c(c0327y3) && !list4.contains(c0327y3)) {
                                                list4.add(c0327y3);
                                                i17++;
                                            } else if (i17 > 0) {
                                                Object[] objArr5 = eVar2.f5106k;
                                                objArr5[i18 - i17] = objArr5[i18];
                                            }
                                        }
                                        int i19 = i16 - i17;
                                        X3.l.B0(eVar2.f5106k, i19, i16);
                                        eVar2.f5108m = i19;
                                    } finally {
                                    }
                                }
                            }
                            if (list4.isEmpty()) {
                                try {
                                    E0.h(list5, f02);
                                    while (!list5.isEmpty()) {
                                        List F5 = f02.F(list5, c2322h);
                                        c2322h2.getClass();
                                        Iterator it = F5.iterator();
                                        while (it.hasNext()) {
                                            c2322h2.i(it.next());
                                        }
                                        E0.h(list5, f02);
                                    }
                                } catch (Throwable th5) {
                                    f02.H(th5, null);
                                    E0.f(f02, list4, list5, list4, c2322h2, c2322h2, c2322h, c2322h2);
                                }
                            }
                            z3 = 0;
                        } catch (Throwable th6) {
                            try {
                                f02.H(th6, null);
                                E0.f(f02, list4, list5, list4, c2322h2, c2322h2, c2322h, c2322h2);
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
                break;
            default:
                C0008h c0008h = (C0008h) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c0008h);
                AquaMatchTicket aquaMatchTicket = (AquaMatchTicket) this.f4263l;
                AquaCompetitionPocket aquaCompetitionPocket = (AquaCompetitionPocket) this.f4264m;
                i4.e eVar3 = (i4.e) this.f4265n;
                AquaMatchCard aquaMatchCard = (AquaMatchCard) this.f4266o;
                L1.a.h(c0008h, null, new X.d(-235186417, new C0410m(aquaCompetitionPocket, eVar3, aquaMatchCard, (AquaClubBadge) this.f4267p, (i4.c) this.f4268q, (AquaClubBadge) this.f4269r, aquaMatchTicket), true), 3);
                L1.a.h(c0008h, null, new X.d(1689507142, new C0411n(0, (AquaShapeBundle) this.f4270s, (AquaShapeBundle) this.f4271t), true), 3);
                L1.a.h(c0008h, null, new X.d(-1339389369, new O3.r(1, aquaMatchCard), true), 3);
                AquaPhaseBoard pha_par_ses = aquaMatchTicket.getPha_par_ses();
                if (pha_par_ses != null) {
                    L1.a.h(c0008h, null, new X.d(2145187173, new O3.r(2, pha_par_ses), true), 3);
                }
                return W3.o.f6046a;
        }
    }

    public /* synthetic */ D0(AquaMatchTicket aquaMatchTicket, AquaCompetitionPocket aquaCompetitionPocket, i4.e eVar, AquaMatchCard aquaMatchCard, AquaClubBadge aquaClubBadge, i4.c cVar, AquaClubBadge aquaClubBadge2, AquaShapeBundle aquaShapeBundle, AquaShapeBundle aquaShapeBundle2) {
        this.f4263l = aquaMatchTicket;
        this.f4264m = aquaCompetitionPocket;
        this.f4265n = eVar;
        this.f4266o = aquaMatchCard;
        this.f4267p = aquaClubBadge;
        this.f4268q = cVar;
        this.f4269r = aquaClubBadge2;
        this.f4270s = aquaShapeBundle;
        this.f4271t = aquaShapeBundle2;
    }
}
