package k4;

import A0.I0;
import A0.J0;
import A0.q1;
import B.I;
import B1.h;
import E.F0;
import E.Z;
import G1.AbstractC0136g;
import G1.C;
import G1.C0134e;
import G1.P;
import H0.k;
import I.C0150c;
import I.C0151d;
import I.C0152e;
import I.C0153f;
import I.C0156i;
import I.C0158k;
import I.InterfaceC0159l;
import K0.A;
import K0.F;
import K0.J;
import K0.N;
import K0.r;
import M.p0;
import M0.d;
import N4.b;
import O3.g;
import O3.s;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import Q3.i;
import R3.j;
import S3.L;
import S3.V;
import S3.W;
import W0.o;
import X3.v;
import a.AbstractC0444a;
import a0.C0448d;
import a1.B;
import a1.C0453A;
import a3.AbstractC0467k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.Y;
import b0.m;
import b1.AbstractC0507h;
import b1.C0503d;
import b1.C0506g;
import com.google.android.gms.internal.ads.C0802bc;
import e4.AbstractC1936a;
import f4.AbstractC1953a;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueViewModel;
import h0.C1988b;
import h0.C1989c;
import i0.C1997b;
import i0.C2001f;
import i0.InterfaceC2009n;
import i0.M;
import i0.p;
import i4.InterfaceC2015a;
import i4.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import k0.C2021a;
import k0.C2022b;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import m4.InterfaceC2100c;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.z;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import v.AbstractC2527w;
import x0.InterfaceC2637x;
import x0.O;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2036a implements d {

    /* renamed from: k, reason: collision with root package name */
    public static C2201e f17599k;

    /* renamed from: l, reason: collision with root package name */
    public static C2201e f17600l;

    /* renamed from: m, reason: collision with root package name */
    public static C2201e f17601m;

    /* renamed from: n, reason: collision with root package name */
    public static C2201e f17602n;

    /* renamed from: o, reason: collision with root package name */
    public static C2201e f17603o;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class A(InterfaceC2100c interfaceC2100c) {
        l.f("<this>", interfaceC2100c);
        Class a5 = ((kotlin.jvm.internal.d) interfaceC2100c).a();
        if (a5.isPrimitive()) {
            String name = a5.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a5;
    }

    public static final int B(r rVar, long j5, q1 q1Var) {
        float f = q1Var != null ? q1Var.f() : 0.0f;
        int c5 = rVar.c(C1988b.e(j5));
        if (C1988b.e(j5) < rVar.d(c5) - f || C1988b.e(j5) > rVar.b(c5) + f || C1988b.d(j5) < (-f) || C1988b.d(j5) > rVar.f2856d + f) {
            return -1;
        }
        return c5;
    }

    public static Intent C(Context context, ComponentName componentName) {
        String D5 = D(context, componentName);
        if (D5 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), D5);
        return D(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String D(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final long E(Z z3, C1989c c1989c, int i) {
        F0 d5 = z3.d();
        r rVar = d5 != null ? d5.f1029a.f2793b : null;
        InterfaceC2637x c5 = z3.c();
        return (rVar == null || c5 == null) ? N.f2801b : rVar.f(c1989c.g(c5.E(0L)), i, J.f2783b);
    }

    public static final C2201e F() {
        C2201e c2201e = f17602n;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Search", false);
        int i = z.f18603a;
        M m5 = new M(p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(15.5f, 14.0f);
        c2202f.j(-0.79f);
        c2202f.l(-0.28f, -0.27f);
        c2202f.f(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        c2202f.f(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        c2202f.n(3.0f, 5.91f, 3.0f, 9.5f);
        c2202f.n(5.91f, 16.0f, 9.5f, 16.0f);
        c2202f.g(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        c2202f.l(0.27f, 0.28f);
        c2202f.r(0.79f);
        c2202f.l(5.0f, 4.99f);
        c2202f.k(20.49f, 19.0f);
        c2202f.l(-4.99f, -5.0f);
        c2202f.e();
        c2202f.m(9.5f, 14.0f);
        c2202f.f(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        c2202f.n(7.01f, 5.0f, 9.5f, 5.0f);
        c2202f.n(14.0f, 7.01f, 14.0f, 9.5f);
        c2202f.n(11.99f, 14.0f, 9.5f, 14.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f17602n = b3;
        return b3;
    }

    public static final long G(double d5) {
        return M((float) d5, 4294967296L);
    }

    public static final long H(int i) {
        return M(i, 4294967296L);
    }

    public static final boolean I(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean J(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean K(int i) {
        int type;
        return (!J(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final long M(float f, long j5) {
        long floatToRawIntBits = j5 | (Float.floatToRawIntBits(f) & 4294967295L);
        W0.p[] pVarArr = o.f6020b;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void N(int i, C0315s c0315s) {
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(762589347);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!l.a(str, "adMarkerQureka")) {
                if (l.a(str, "adMarkerAdx")) {
                    c0315s.X(1287314298);
                    c0315s.X(1287315258);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new h(13);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    c0315s2 = c0315s;
                    b.M((InterfaceC2015a) M5, null, null, c0315s2, 6, 6);
                    c0315s2.q(false);
                } else {
                    c0315s2 = c0315s;
                    c0315s2.X(1252076202);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new L(i, 1);
                    return;
                }
                return;
            }
            c0315s.X(1287312936);
            s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void O(int i, C0315s c0315s) {
        C0315s c0315s2;
        c0315s.Z(2136937507);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
            c0315s2 = c0315s;
        } else {
            m mVar = m.f7161k;
            b0.p b3 = c.b(mVar, 1.0f);
            C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7149w, c0315s, 48);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, b3);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            AbstractC2701c.b(c0315s, c.c(mVar, 18));
            c0315s2 = c0315s;
            p0.a(c.b(mVar, 1.0f), j.f5218a, V3.a.f5980k, 0.0f, 0.0f, null, i.f5098b, c0315s2, 12583350, 120);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new A(i, 26);
        }
    }

    public static final b0.p S(b0.p pVar, float f) {
        return f == 0.0f ? pVar : androidx.compose.ui.graphics.a.c(pVar, 0.0f, f, null, 524031);
    }

    public static int T(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    public static int U(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long V(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    public static final void W(e eVar, InterfaceC2015a interfaceC2015a, AquaSpotlightLeagueViewModel aquaSpotlightLeagueViewModel, C0315s c0315s, int i) {
        l.f("onPick", eVar);
        l.f("onBrowseCatalog", interfaceC2015a);
        c0315s.Z(567187560);
        if ((((c0315s.h(eVar) ? 4 : 2) | i | (c0315s.h(interfaceC2015a) ? 32 : 16) | 128) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaSpotlightLeagueViewModel = (AquaSpotlightLeagueViewModel) G4.d.N(x.a(AquaSpotlightLeagueViewModel.class), a5, null, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
            }
            c0315s.r();
            InterfaceC0289e0 l5 = AbstractC0329z.l(aquaSpotlightLeagueViewModel.getFr_par_ame(), c0315s);
            c0315s.X(774135997);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = AbstractC0329z.t(null);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            j.d(null, X.e.d(-496559408, new V(interfaceC2015a, l5, eVar, (InterfaceC0289e0) M5), c0315s), c0315s, 48);
        }
        AquaSpotlightLeagueViewModel aquaSpotlightLeagueViewModel2 = aquaSpotlightLeagueViewModel;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new g(eVar, interfaceC2015a, aquaSpotlightLeagueViewModel2, i, 4);
        }
    }

    public static final void X(final AquaCompetitionBundle aquaCompetitionBundle, final int i, final boolean z3, final InterfaceC2015a interfaceC2015a, C0315s c0315s, final int i5) {
        float f;
        long b3;
        c0315s.Z(-851778237);
        if (((i5 | (c0315s.h(aquaCompetitionBundle) ? 4 : 2) | (c0315s.d(i) ? 32 : 16) | (c0315s.g(z3) ? 256 : 128) | (c0315s.h(interfaceC2015a) ? 2048 : 1024)) & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            int selectNewesmeanstSeasonYear = AquaDisplayFormattersKt.selectNewesmeanstSeasonYear(aquaCompetitionBundle.getCamp_par_aigns());
            b0.p b5 = c.b(m.f7161k, 1.0f);
            D.d dVar = j.f5218a;
            b0.p d5 = androidx.compose.foundation.a.d(AbstractC0444a.n(b5, dVar), false, null, interfaceC2015a, 7);
            float f5 = 10;
            long b6 = z3 ? p.b(0.15f, V3.a.f5975d) : V3.a.f5962A;
            float f6 = z3 ? 6 : 2;
            if (z3) {
                f = 2;
                b3 = V3.a.f5975d;
            } else {
                f = 1;
                b3 = p.b(0.35f, V3.a.f5995z);
            }
            p0.a(d5, dVar, b6, f6, f5, AbstractC2527w.a(f, b3), X.e.d(-1182524856, new W(aquaCompetitionBundle, i, z3, selectNewesmeanstSeasonYear), c0315s), c0315s, 12779568, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new e(i, z3, interfaceC2015a, i5) { // from class: S3.S

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f5404l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ boolean f5405m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5406n;

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(1);
                    AquaCompetitionBundle aquaCompetitionBundle2 = AquaCompetitionBundle.this;
                    boolean z5 = this.f5405m;
                    InterfaceC2015a interfaceC2015a2 = this.f5406n;
                    AbstractC2036a.X(aquaCompetitionBundle2, this.f5404l, z5, interfaceC2015a2, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final boolean Y(Throwable th, InterfaceC2015a interfaceC2015a) {
        Collection o02;
        Object invoke;
        l.f("<this>", th);
        Integer num = AbstractC1953a.f17010a;
        C0448d c0448d = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            l.e("getSuppressed(...)", suppressed);
            o02 = X3.l.o0(suppressed);
        } else {
            Method method = AbstractC1936a.f16919b;
            o02 = (method == null || (invoke = method.invoke(th, null)) == null) ? v.f6090k : X3.l.o0((Throwable[]) invoke);
        }
        boolean z3 = false;
        if (!o02.isEmpty()) {
            Iterator it = o02.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof C0448d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) interfaceC2015a.invoke();
            boolean isEmpty = list.isEmpty();
            z3 = !isEmpty;
            if (!isEmpty) {
                c0448d = new C0448d(list);
            }
        } catch (Throwable th2) {
            c0448d = th2;
        }
        if (c0448d != null) {
            AbstractC2425d.j(th, c0448d);
        }
        return z3;
    }

    public static final long Z(long j5, long j6) {
        int c5;
        int e3 = N.e(j5);
        int d5 = N.d(j5);
        if ((N.e(j6) < N.d(j5)) && (N.e(j5) < N.d(j6))) {
            if ((N.e(j6) <= N.e(j5)) && (N.d(j5) <= N.d(j6))) {
                e3 = N.e(j6);
                d5 = e3;
            } else {
                if ((N.e(j5) <= N.e(j6)) && (N.d(j6) <= N.d(j5))) {
                    c5 = N.c(j6);
                } else {
                    int e5 = N.e(j6);
                    if (e3 >= N.d(j6) || e5 > e3) {
                        d5 = N.e(j6);
                    } else {
                        e3 = N.e(j6);
                        c5 = N.c(j6);
                    }
                }
                d5 -= c5;
            }
        } else if (d5 > N.e(j6)) {
            e3 -= N.c(j6);
            c5 = N.c(j6);
            d5 -= c5;
        }
        return F.b(e3, d5);
    }

    public static final void a(InterfaceC0159l interfaceC0159l, b0.d dVar, X.d dVar2, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(476043083);
        if ((i & 6) == 0) {
            i5 = ((i & 8) == 0 ? c0315s.f(interfaceC0159l) : c0315s.h(interfaceC0159l) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(dVar2) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            boolean z3 = true;
            boolean z5 = (i5 & 112) == 32;
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0315s.f(interfaceC0159l))) {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            Object M5 = c0315s.M();
            if (z6 || M5 == C0302l.f4480a) {
                M5 = new C0158k(dVar, interfaceC0159l);
                c0315s.i0(M5);
            }
            a1.l.a((C0158k) M5, null, new C0453A(false, B.f6375k, false), dVar2, c0315s, ((i5 << 3) & 7168) | 384, 2);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new I(interfaceC0159l, dVar, dVar2, i, 1);
        }
    }

    public static final void a0(int i, C0315s c0315s) {
        c0315s.Z(833321506);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.p h3 = androidx.compose.foundation.layout.b.h(c.k(), 22, 0.0f, 2);
            b0.p a5 = androidx.compose.foundation.a.a(c.f6868c, j.a());
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, a5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f6865a;
            p0.a(h3, j.f5218a, V3.a.f5990u, 4, 0.0f, null, i.f5097a, c0315s, 12607926, 104);
            AbstractC2710l.a(androidx.compose.foundation.a.b(AbstractC0444a.n(c.f(androidx.compose.foundation.layout.b.i(aVar.a(b0.c.f7139m), 0.0f, 30, 10, 9), 94), D.e.f920a), p.b(0.12f, V3.a.f5975d), i0.F.f17222a), c0315s, 0);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new A(i, 25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        if (r20 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00bd, code lost:
    
        if (r20 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cd, code lost:
    
        if (((r19 == r6 && !r20) || (r19 == r4 && r20)) == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(InterfaceC0159l interfaceC0159l, boolean z3, V0.j jVar, boolean z5, long j5, SuspendPointerInputElement suspendPointerInputElement, C0315s c0315s, int i) {
        int i5;
        int i6;
        long j6;
        boolean z6;
        long j7;
        InterfaceC0159l interfaceC0159l2 = interfaceC0159l;
        c0315s.Z(-843755800);
        if ((i & 6) == 0) {
            i5 = ((i & 8) == 0 ? c0315s.f(interfaceC0159l2) : c0315s.h(interfaceC0159l2) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.g(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(jVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.g(z5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= c0315s.f(suspendPointerInputElement) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && c0315s.B()) {
            c0315s.S();
            j7 = j5;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                i6 = i5 & (-57345);
                j6 = 9205357640488583168L;
            } else {
                c0315s.S();
                i6 = i5 & (-57345);
                j6 = j5;
            }
            c0315s.r();
            V0.j jVar2 = V0.j.f5941l;
            V0.j jVar3 = V0.j.f5940k;
            if (z3) {
                float f = I.A.f2382a;
                if (jVar == jVar3) {
                }
                if (jVar == jVar2) {
                }
                z6 = false;
            } else {
                float f5 = I.A.f2382a;
            }
            b0.e eVar = z6 ? b0.a.f7135b : b0.a.f7134a;
            int i7 = i6 & 14;
            boolean g5 = ((i6 & 112) == 32) | (i7 == 4 || ((i6 & 8) != 0 && c0315s.h(interfaceC0159l2))) | c0315s.g(z6);
            Object M5 = c0315s.M();
            if (g5 || M5 == C0302l.f4480a) {
                M5 = new C0152e(interfaceC0159l2, z3, z6);
                c0315s.i0(M5);
            }
            b0.p a5 = k.a(suspendPointerInputElement, false, (i4.c) M5);
            long j8 = j6;
            interfaceC0159l2 = interfaceC0159l;
            a(interfaceC0159l2, eVar, X.e.d(280174801, new C0150c((q1) c0315s.j(I0.f297s), j8, z6, a5, interfaceC0159l), c0315s), c0315s, i7 | 384);
            j7 = j8;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0151d(interfaceC0159l2, z3, jVar, z5, j7, suspendPointerInputElement, i);
        }
    }

    public static void b0(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeBundle(bundle);
        m0(parcel, k02);
    }

    public static final void c(b0.p pVar, InterfaceC2015a interfaceC2015a, boolean z3, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(2111672474);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if (((i5 | (c0315s.h(interfaceC2015a) ? 32 : 16) | (c0315s.g(z3) ? 256 : 128)) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC2701c.b(c0315s, b0.a.a(c.g(pVar, I.A.f2382a, I.A.f2383b), new C0156i(interfaceC2015a, z3)));
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0153f(pVar, interfaceC2015a, z3, i);
        }
    }

    public static void c0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeByteArray(bArr);
        m0(parcel, k02);
    }

    public static final int d(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i5 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i5 << 1) | i;
    }

    public static void d0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m0(parcel, k02);
    }

    public static final long e(Z z3, C1989c c1989c, C1989c c1989c2, int i) {
        long E5 = E(z3, c1989c, i);
        if (N.b(E5)) {
            return N.f2801b;
        }
        long E6 = E(z3, c1989c2, i);
        if (N.b(E6)) {
            return N.f2801b;
        }
        int i5 = (int) (E5 >> 32);
        int i6 = (int) (E6 & 4294967295L);
        return F.b(Math.min(i5, i5), Math.max(i6, i6));
    }

    public static void e0(Parcel parcel, int i, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcelable.writeToParcel(parcel, i5);
        m0(parcel, k02);
    }

    public static void f0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeString(str);
        m0(parcel, k02);
    }

    public static void g0(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeStringArray(strArr);
        m0(parcel, k02);
    }

    public static final boolean h(K0.L l5, int i) {
        int e3 = l5.e(i);
        return i == l5.h(e3) || i == l5.d(e3, false) ? l5.i(i) != l5.a(i) : l5.a(i) != l5.a(i - 1);
    }

    public static void h0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeStringList(list);
        m0(parcel, k02);
    }

    public static final boolean i(long j5) {
        return !W0.j.a(j5, 9223372034707292159L);
    }

    public static void i0(Parcel parcel, int i, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int k02 = k0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        m0(parcel, k02);
    }

    public static void j(StringBuilder sb, Object obj, i4.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void j0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int k02 = k0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        m0(parcel, k02);
    }

    public static int k0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object l0(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            U2.j.g("Unexpected exception.", th);
            C0802bc.a(context).b("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static void m0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static final void n(int i, int i5) {
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
    }

    public static void n0(Parcel parcel, int i, int i5) {
        parcel.writeInt(i | (i5 << 16));
    }

    public static void o(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void p(int i, int i5) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
    }

    public static final void s(int i, int i5, int i6) {
        if (i < 0 || i5 > i6) {
            StringBuilder w5 = AbstractC2107A.w("fromIndex: ", i, ", toIndex: ", i5, ", size: ");
            w5.append(i6);
            throw new IndexOutOfBoundsException(w5.toString());
        }
        if (i > i5) {
            throw new IllegalArgumentException(L1.a.k(i, i5, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X3.v] */
    public static void t(C c5, String str, ArrayList arrayList, X.d dVar, int i) {
        int i5 = i & 2;
        ?? r02 = v.f6090k;
        if (i5 != 0) {
            arrayList = r02;
        }
        P p5 = c5.f;
        p5.getClass();
        H1.j jVar = new H1.j((H1.i) p5.b(AbstractC0136g.c(H1.i.class)), str, dVar);
        for (C0134e c0134e : arrayList) {
            jVar.f1974c.put(c0134e.f1889a, c0134e.f1890b);
        }
        c5.f1821h.add(jVar.a());
    }

    public static final void u(int i, int i5) {
        if (i <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i5 + ").");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2001f v(f0.c cVar, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        C2001f c2001f = AbstractC2346c.f19084a;
        C1997b c1997b = AbstractC2346c.f19085b;
        C2022b c2022b = AbstractC2346c.f19086c;
        if (c2001f != null && c1997b != null) {
            Bitmap bitmap = c2001f.f17276a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        c2001f = i0.F.f(ceil, ceil, 1);
        AbstractC2346c.f19084a = c2001f;
        c1997b = i0.F.a(c2001f);
        AbstractC2346c.f19085b = c1997b;
        C2001f c2001f2 = c2001f;
        C1997b c1997b2 = c1997b;
        if (c2022b == null) {
            c2022b = new C2022b();
            AbstractC2346c.f19086c = c2022b;
        }
        C2022b c2022b2 = c2022b;
        W0.m layoutDirection = cVar.f16923k.getLayoutDirection();
        Bitmap bitmap2 = c2001f2.f17276a;
        long d5 = AbstractC0444a.d(bitmap2.getWidth(), bitmap2.getHeight());
        C2021a c2021a = c2022b2.f17539k;
        W0.c cVar2 = c2021a.f17535a;
        W0.m mVar = c2021a.f17536b;
        InterfaceC2009n interfaceC2009n = c2021a.f17537c;
        long j5 = c2021a.f17538d;
        c2021a.f17535a = cVar;
        c2021a.f17536b = layoutDirection;
        c2021a.f17537c = c1997b2;
        c2021a.f17538d = d5;
        c1997b2.k();
        AbstractC0467k.m(c2022b2, p.f17289b, c2022b2.f17540l.A(), 58);
        AbstractC0467k.m(c2022b2, i0.F.d(4278190080L), AbstractC0444a.d(f, f), 120);
        AbstractC0467k.h(c2022b2, i0.F.d(4278190080L), f, G4.d.d(f, f), 120);
        c1997b2.j();
        c2021a.f17535a = cVar2;
        c2021a.f17536b = mVar;
        c2021a.f17537c = interfaceC2009n;
        c2021a.f17538d = j5;
        return c2001f2;
    }

    public static final int w(int i, A.k kVar, Object obj) {
        int b3;
        return (obj == null || kVar.c() == 0 || (i < kVar.c() && obj.equals(kVar.d(i))) || (b3 = kVar.f61d.b(obj)) == -1) ? i : b3;
    }

    public static J0 x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new J0(D0.c.c(view));
        }
        return null;
    }

    public static final C2201e y() {
        C2201e c2201e = f17599k;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Bolt", false);
        int i = z.f18603a;
        M m5 = new M(p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(11.0f, 21.0f);
        c2202f.j(-1.0f);
        c2202f.l(1.0f, -7.0f);
        c2202f.i(7.5f);
        c2202f.g(-0.58f, 0.0f, -0.57f, -0.32f, -0.38f, -0.66f);
        c2202f.g(0.19f, -0.34f, 0.05f, -0.08f, 0.07f, -0.12f);
        c2202f.f(8.48f, 10.94f, 10.42f, 7.54f, 13.0f, 3.0f);
        c2202f.j(1.0f);
        c2202f.l(-1.0f, 7.0f);
        c2202f.j(3.5f);
        c2202f.g(0.49f, 0.0f, 0.56f, 0.33f, 0.47f, 0.51f);
        c2202f.l(-0.07f, 0.15f);
        c2202f.f(12.96f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f17599k = b3;
        return b3;
    }

    public static final Class z(InterfaceC2100c interfaceC2100c) {
        l.f("<this>", interfaceC2100c);
        Class a5 = ((kotlin.jvm.internal.d) interfaceC2100c).a();
        l.d("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", a5);
        return a5;
    }

    public abstract int L(int i);

    public abstract int P(int i);

    public abstract void Q(C0506g c0506g, C0506g c0506g2);

    public abstract void R(C0506g c0506g, Thread thread);

    @Override // M0.d
    public int f(int i) {
        return P(i);
    }

    @Override // M0.d
    public int g(int i) {
        return L(i);
    }

    public abstract boolean k(AbstractC0507h abstractC0507h, C0503d c0503d, C0503d c0503d2);

    public abstract boolean l(AbstractC0507h abstractC0507h, Object obj, Object obj2);

    public abstract boolean m(AbstractC0507h abstractC0507h, C0506g c0506g, C0506g c0506g2);

    @Override // M0.d
    public int q(int i) {
        int L5 = L(i);
        if (L5 == -1 || L(L5) == -1) {
            return -1;
        }
        return L5;
    }

    @Override // M0.d
    public int r(int i) {
        int P5 = P(i);
        if (P5 == -1 || P(P5) == -1) {
            return -1;
        }
        return P5;
    }
}
