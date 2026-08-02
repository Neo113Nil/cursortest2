package P;

import a.AbstractC0444a;
import a0.C0446b;
import a0.C0451g;
import android.app.Activity;
import d.C1905e;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import i4.InterfaceC2015a;
import java.util.Collection;
import o4.AbstractC2227e;
import r.C2322H;
import r3.AbstractC2349a;

/* renamed from: P.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0328y0 implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4602k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4604m;

    public /* synthetic */ C0328y0(int i, Object obj, Object obj2) {
        this.f4602k = i;
        this.f4603l = obj;
        this.f4604m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r4 = new a0.C0451g(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r3.c();
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        r7 = new a0.C0451g(r5, java.lang.Integer.valueOf(r9));
     */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        C0451g c0451g;
        switch (this.f4602k) {
            case 0:
                C2322H c2322h = (C2322H) this.f4603l;
                Object[] objArr = c2322h.f18934b;
                long[] jArr = c2322h.f18933a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j5 = jArr[i];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j5) < 128) {
                                    ((C0327y) this.f4604m).z(objArr[(i << 3) + i6]);
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
                return W3.o.f6046a;
            case 1:
                AquaClubBadge aquaClubBadge = (AquaClubBadge) this.f4603l;
                if (aquaClubBadge != null) {
                    ((i4.c) this.f4604m).c(Integer.valueOf(aquaClubBadge.getCode_arg()));
                }
                return W3.o.f6046a;
            case 2:
                AquaCompetitionPocket aquaCompetitionPocket = (AquaCompetitionPocket) this.f4603l;
                Integer valueOf = aquaCompetitionPocket != null ? Integer.valueOf(aquaCompetitionPocket.getCode_arg()) : null;
                Integer st_par_amp = aquaCompetitionPocket != null ? aquaCompetitionPocket.getSt_par_amp() : null;
                if (valueOf != null && st_par_amp != null) {
                    ((i4.e) this.f4604m).invoke(valueOf, st_par_amp);
                }
                return W3.o.f6046a;
            case 3:
                boolean m5 = ((G1.E) this.f4603l).m();
                if (m5 || !m5) {
                    Activity activity = (Activity) this.f4604m;
                    String str = AbstractC2349a.f19098g;
                    boolean a5 = kotlin.jvm.internal.l.a(str, "adMarkerQureka");
                    O3.a aVar = O3.a.f4046k;
                    O3.a aVar2 = a5 ? aVar : kotlin.jvm.internal.l.a(str, "adMarkerAdx") ? O3.a.f4047l : O3.a.f4048m;
                    String str2 = AbstractC2349a.f19099h;
                    if (aVar2 == aVar && !AbstractC2227e.H0(str2)) {
                        String obj = AbstractC2227e.Q0(AbstractC2349a.i).toString();
                        String obj2 = AbstractC2227e.Q0(AbstractC2349a.f19099h).toString();
                        if (obj.length() <= 0) {
                            obj = obj2;
                        }
                        if (obj.length() > 0) {
                            O3.e.b(activity, obj);
                        }
                    }
                }
                return W3.o.f6046a;
            case 4:
                C0315s c0315s = ((C0446b) this.f4603l).f6364k;
                boolean z3 = c0315s.f4516C;
                Collection collection = X3.v.f6090k;
                if (!z3) {
                    return collection;
                }
                M0 m02 = c0315s.f4535c;
                L0 e3 = m02.e();
                int i7 = 0;
                while (true) {
                    try {
                        c0451g = null;
                        if (i7 < m02.f4344l) {
                            boolean l5 = e3.l(i7);
                            Object obj3 = this.f4604m;
                            if (l5) {
                                Object n5 = e3.n(i7);
                                if (n5 == obj3) {
                                    break;
                                } else {
                                    H0 h02 = n5 instanceof H0 ? (H0) n5 : null;
                                    if ((h02 != null ? h02.f4319a : null) == obj3) {
                                        break;
                                    }
                                }
                            }
                            int[] iArr = e3.f4332b;
                            int i8 = i7 + 1;
                            int c5 = (i8 < e3.f4333c ? iArr[(i8 * 5) + 4] : e3.f4335e) - O0.c(iArr, i7);
                            int i9 = 0;
                            while (i9 < c5) {
                                Object h3 = e3.h(i7, i9);
                                if (h3 == obj3) {
                                    break;
                                } else {
                                    H0 h03 = h3 instanceof H0 ? (H0) h3 : null;
                                    if ((h03 != null ? h03.f4319a : null) == obj3) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            i7 = i8;
                        }
                    } finally {
                    }
                }
                if (c0451g == null) {
                    return collection;
                }
                int i10 = c0451g.f6368a;
                Integer num = c0451g.f6369b;
                if (c0315s.f4516C) {
                    try {
                        collection = AbstractC0444a.e0(m02.e(), i10, num);
                    } finally {
                    }
                }
                return X3.m.i0(collection, c0315s.F());
            case 5:
                ((C1905e) this.f4603l).f16812c = (InterfaceC2015a) this.f4604m;
                return W3.o.f6046a;
            default:
                ((d.i) this.f4603l).f16818d = (i4.e) this.f4604m;
                return W3.o.f6046a;
        }
    }
}
