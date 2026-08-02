package r3;

import A.B;
import A0.C0009a;
import A0.C0019d0;
import A0.C0028g0;
import A0.C0040k0;
import A0.I0;
import B.r;
import B.w;
import B.x;
import G1.AbstractC0136g;
import G1.C;
import G1.C0131b;
import G1.C0134e;
import G1.C0135f;
import G1.C0140k;
import G1.C0141l;
import G1.C0143n;
import G1.E;
import G1.H;
import G1.O;
import G1.P;
import G1.y;
import H1.i;
import H1.v;
import I.C0160m;
import I.C0161n;
import I.C0162o;
import I.C0164q;
import I.InterfaceC0157j;
import K0.L;
import K0.N;
import L0.j;
import L0.l;
import N0.d;
import O0.e;
import P.AbstractC0320u0;
import P.AbstractC0329z;
import P.C0297i0;
import P.C0299j0;
import P.C0302l;
import P.C0305m0;
import P.C0310p;
import P.C0315s;
import P.C0326x0;
import P.C0328y0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.Z;
import P.d1;
import S3.C0416t;
import W0.m;
import W3.o;
import X3.A;
import Y.k;
import Z.f;
import Z.q;
import a.AbstractC0444a;
import a1.C0454a;
import a1.C0455b;
import a1.u;
import a3.AbstractC0467k;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import b0.h;
import e2.C1930k;
import g4.AbstractC1985a;
import game.betting133.sports1xbet.aqua_network.AquaSportsDefaults;
import i0.M;
import i0.p;
import i4.InterfaceC2015a;
import i4.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import n1.C2170k;
import o0.C2200d;
import o0.C2201e;
import o0.C2205i;
import o0.C2208l;
import o0.C2209m;
import o0.C2211o;
import o0.C2213q;
import o0.s;
import o0.t;
import o0.z;
import o4.AbstractC2223a;
import o4.AbstractC2227e;
import org.json.JSONObject;
import p4.D;
import q2.AbstractC2305h;
import q2.C2300c;
import q2.C2304g;
import q3.AbstractC2309b;
import r.AbstractC2339q;
import r.S;
import r3.AbstractC2349a;
import s.AbstractC2351a;
import t2.C2414b;
import t2.C2421i;
import u.C2452c0;
import u.t0;
import u.v0;
import u.x0;
import u.y0;
import v3.g;
import w2.C2543a;
import w2.C2551i;
import x0.X;
import z0.AbstractC2749f;
import z0.C2751h;
import z0.C2752i;
import z0.C2761s;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2349a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f19093a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f19094b = null;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f19095c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f19096d = null;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f19097e = null;
    public static C2201e f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f19098g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f19099h = "";
    public static String i = "";

    /* renamed from: j, reason: collision with root package name */
    public static String f19100j = "";

    /* renamed from: k, reason: collision with root package name */
    public static String f19101k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f19102l = "";

    /* renamed from: m, reason: collision with root package name */
    public static String f19103m = "";

    public static final float A(Layout layout, int i5, Paint paint) {
        float width;
        float width2;
        j jVar = l.f3029a;
        if (layout.getEllipsisCount(i5) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i5) != -1 || layout.getWidth() >= layout.getLineRight(i5)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i5) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i5) + layout.getLineStart(i5)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i5);
        if ((paragraphAlignment != null ? d.f3721a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i5);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i5);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2170k C(Display display, int i5) {
        RoundedCorner roundedCorner;
        int position;
        int i6;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i6 = 1;
            if (position != 1) {
                i6 = 2;
                if (position != 2) {
                    i6 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(AbstractC2107A.q("Invalid position: ", position));
                    }
                }
            }
        } else {
            i6 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new C2170k(i6, radius, center);
    }

    public static final C2201e D() {
        C2201e c2201e = f;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Shield", false);
        int i5 = z.f18603a;
        M m5 = new M(p.f17289b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2209m(12.0f, 1.0f));
        arrayList.add(new C2208l(3.0f, 5.0f));
        arrayList.add(new s(6.0f));
        arrayList.add(new C2211o(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f));
        arrayList.add(new C2211o(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f));
        arrayList.add(new t(5.0f));
        arrayList.add(new C2213q(-9.0f, -4.0f));
        arrayList.add(C2205i.f18558b);
        C2200d.a(c2200d, arrayList, m5);
        C2201e b3 = c2200d.b();
        f = b3;
        return b3;
    }

    public static final int E(int i5, int i6) {
        return (i5 >> i6) & 31;
    }

    public static final ArrayList F(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            kotlin.jvm.internal.l.f("name", str);
            arrayList.add(new C0134e(str, new C0135f(G1.M.f1871a)));
        }
        return arrayList;
    }

    public static synchronized boolean G(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC2349a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f19093a;
            if (context2 != null && (bool = f19094b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f19094b = null;
            if (AbstractC2309b.e()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f19094b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f19094b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f19094b = Boolean.FALSE;
                }
            }
            f19093a = applicationContext;
            return f19094b.booleanValue();
        }
    }

    public static final boolean I(String str) {
        kotlin.jvm.internal.l.f("method", str);
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String L(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.net.HttpURLConnection", openConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IllegalStateException("Config HTTP " + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            kotlin.jvm.internal.l.e("getInputStream(...)", inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC2223a.f18653a), 8192);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                for (int read = bufferedReader.read(cArr); read >= 0; read = bufferedReader.read(cArr)) {
                    stringWriter.write(cArr, 0, read);
                }
                String stringWriter2 = stringWriter.toString();
                kotlin.jvm.internal.l.e("toString(...)", stringWriter2);
                bufferedReader.close();
                httpURLConnection.disconnect();
                return stringWriter2;
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public static final void N(b0.p pVar, c cVar, C0315s c0315s, int i5) {
        c cVar2;
        y yVar;
        c0315s.Z(-1911976915);
        if (((i5 | 48) & 19) == 18 && c0315s.B()) {
            c0315s.S();
            cVar2 = cVar;
        } else {
            Object obj = C0302l.f4480a;
            c0315s.X(481314581);
            Object M5 = c0315s.M();
            if (M5 == obj) {
                M5 = new C0416t(5);
                c0315s.i0(M5);
            }
            cVar2 = (c) M5;
            c0315s.q(false);
            AbstractC0320u0 abstractC0320u0 = AndroidCompositionLocals_androidKt.f6943b;
            Object obj2 = (Context) c0315s.j(abstractC0320u0);
            Object[] copyOf = Arrays.copyOf(new O[0], 0);
            g gVar = new g(13, H1.p.f2231l, new B(17, obj2));
            boolean h3 = c0315s.h(obj2);
            Object M6 = c0315s.M();
            if (h3 || M6 == obj) {
                M6 = new C0040k0(11, obj2);
                c0315s.i0(M6);
            }
            final E e3 = (E) k.b(copyOf, gVar, (InterfaceC2015a) M6, c0315s, 0, 4);
            Object j5 = c0315s.j(abstractC0320u0);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.Activity", j5);
            final Activity activity = (Activity) j5;
            final int defaultS_par_easonYear = AquaSportsDefaults.INSTANCE.getDefaultS_par_easonYear();
            C0140k c0140k = (C0140k) AbstractC0329z.k(e3.f1826D, null, null, c0315s, 48, 2).getValue();
            String str = (c0140k == null || (yVar = c0140k.f1899l) == null) ? null : yVar.f1970q;
            if (str == null) {
                str = "";
            }
            c0315s.X(481325565);
            Object M7 = c0315s.M();
            if (M7 == obj) {
                M7 = AbstractC0329z.t(null);
                c0315s.i0(M7);
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M7;
            c0315s.q(false);
            c0315s.X(481328600);
            boolean f5 = c0315s.f(str);
            Object M8 = c0315s.M();
            if (f5 || M8 == obj) {
                M8 = new B1.b(str, cVar2, interfaceC0289e0);
                c0315s.i0(M8);
            }
            c0315s.q(false);
            AbstractC0329z.c(str, (c) M8, c0315s);
            c0315s.X(481340455);
            boolean f6 = c0315s.f(activity);
            Object M9 = c0315s.M();
            if (f6 || M9 == obj) {
                M9 = new e(7, activity);
                c0315s.i0(M9);
            }
            final c cVar3 = (c) M9;
            c0315s.q(false);
            c0315s.X(481346670);
            boolean f7 = c0315s.f(activity) | c0315s.f(e3);
            Object M10 = c0315s.M();
            if (f7 || M10 == obj) {
                M10 = new C0328y0(3, e3, activity);
                c0315s.i0(M10);
            }
            final InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M10;
            c0315s.q(false);
            c0315s.X(481361642);
            boolean h4 = c0315s.h(activity) | c0315s.f(cVar3) | c0315s.h(e3) | c0315s.f(interfaceC2015a) | c0315s.f(str) | c0315s.d(defaultS_par_easonYear);
            Object M11 = c0315s.M();
            if (h4 || M11 == obj) {
                final String str2 = str;
                Object obj3 = new c() { // from class: T3.a
                    @Override // i4.c
                    public final Object c(Object obj4) {
                        C c5 = (C) obj4;
                        kotlin.jvm.internal.l.f("$this$NavHost", c5);
                        Activity activity2 = activity;
                        i4.c cVar4 = cVar3;
                        E e5 = e3;
                        AbstractC2036a.t(c5, "appR/navigator/home_portal", null, new X.d(553733571, new k(activity2, cVar4, e5, 2), true), 254);
                        InterfaceC2015a interfaceC2015a2 = interfaceC2015a;
                        AbstractC2036a.t(c5, "appR/navigator/league_spotlight", null, new X.d(337384187, new k(interfaceC2015a2, cVar4, e5, 1), true), 254);
                        AbstractC2036a.t(c5, "appR/navigator/season_selector/{leagueKey}", AbstractC2349a.F("leagueKey"), new X.d(1096514988, new k(interfaceC2015a2, cVar4, e5, 0), true), 252);
                        String str3 = str2;
                        AbstractC2036a.t(c5, "appR/navigator/tournament_catalog", null, new X.d(-870581089, new g(0, e5, interfaceC2015a2, cVar4, str3), true), 254);
                        ArrayList F5 = AbstractC2349a.F("leagueKey", "yearKey");
                        int i6 = defaultS_par_easonYear;
                        AbstractC2036a.t(c5, "appR/navigator/fixture_schedule/{leagueKey}/{yearKey}", F5, new X.d(592338301, new d(i6, e5, interfaceC2015a2, cVar4, str3), true), 252);
                        AbstractC2036a.t(c5, "appR/navigator/match_overview/{matchKey}", AbstractC2349a.F("matchKey"), new X.d(953971383, new g(1, e5, interfaceC2015a2, cVar4, str3), true), 252);
                        AbstractC2036a.t(c5, "appR/navigator/match_statistics/{matchKey}", AbstractC2349a.F("matchKey"), new X.d(275463072, new i(1, interfaceC2015a2, str3), true), 252);
                        AbstractC2036a.t(c5, "appR/navigator/match_timeline/{matchKey}", AbstractC2349a.F("matchKey"), new X.d(1967152415, new i(0, interfaceC2015a2, str3), true), 252);
                        AbstractC2036a.t(c5, "appR/navigator/team_roster/{teamKey}", AbstractC2349a.F("teamKey"), new X.d(-1552376101, new g(2, e5, interfaceC2015a2, cVar4, str3), true), 252);
                        AbstractC2036a.t(c5, "appR/navigator/player_profile/{playerKey}/{yearKey}", AbstractC2349a.F("playerKey", "yearKey"), new X.d(1827934264, new j(i6, interfaceC2015a2, str3), true), 252);
                        return o.f6046a;
                    }
                };
                c0315s.i0(obj3);
                M11 = obj3;
            }
            c0315s.q(false);
            f(e3, pVar, null, null, null, null, null, (c) M11, c0315s, 432);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.o(i5, 7, pVar, cVar2);
        }
    }

    public static final c0.d a(String str) {
        Set singleton = Collections.singleton(str);
        kotlin.jvm.internal.l.e("singleton(...)", singleton);
        return new c0.d(singleton);
    }

    public static long b(float f5) {
        return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final void c(InterfaceC2015a interfaceC2015a, a1.t tVar, X.d dVar, C0315s c0315s, int i5) {
        C0315s c0315s2;
        m mVar;
        c0315s.Z(826668973);
        int i6 = i5 | (c0315s.h(interfaceC2015a) ? 4 : 2) | (c0315s.f(tVar) ? 32 : 16);
        if (c0315s.P(i6 & 1, (i6 & 147) != 146)) {
            View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
            W0.c cVar = (W0.c) c0315s.j(I0.f287h);
            m mVar2 = (m) c0315s.j(I0.f292n);
            C0310p v4 = AbstractC0329z.v(c0315s);
            InterfaceC0289e0 w5 = AbstractC0329z.w(dVar, c0315s);
            Object[] objArr = new Object[0];
            Object M5 = c0315s.M();
            Z z3 = C0302l.f4480a;
            if (M5 == z3) {
                M5 = a1.d.f6388m;
                c0315s.i0(M5);
            }
            UUID uuid = (UUID) k.b(Arrays.copyOf(objArr, 0), k.f6119a, (InterfaceC2015a) M5, c0315s, 3456, 0);
            boolean f5 = c0315s.f(view) | c0315s.f(cVar);
            Object M6 = c0315s.M();
            if (f5 || M6 == z3) {
                mVar = mVar2;
                c0315s2 = c0315s;
                u uVar = new u(interfaceC2015a, tVar, view, mVar, cVar, uuid);
                X.d dVar2 = new X.d(346960332, new C0009a(6, w5), true);
                a1.s sVar = uVar.f6441r;
                sVar.setParentCompositionContext(v4);
                sVar.f6424t.setValue(dVar2);
                sVar.f6428x = true;
                if (sVar.f466n == null && !sVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                sVar.c();
                c0315s2.i0(uVar);
                M6 = uVar;
            } else {
                c0315s2 = c0315s;
                mVar = mVar2;
            }
            u uVar2 = (u) M6;
            o oVar = o.f6046a;
            boolean h3 = c0315s2.h(uVar2);
            Object M7 = c0315s2.M();
            if (h3 || M7 == z3) {
                M7 = new C0454a(uVar2, null);
                c0315s2.i0(M7);
            }
            AbstractC0329z.e(c0315s2, (i4.e) M7, oVar);
            boolean h4 = c0315s2.h(uVar2);
            Object M8 = c0315s2.M();
            if (h4 || M8 == z3) {
                M8 = new C0455b(uVar2, 0);
                c0315s2.i0(M8);
            }
            AbstractC0329z.c(uVar2, (c) M8, c0315s2);
            boolean h5 = c0315s2.h(uVar2) | ((i6 & 14) == 4) | ((i6 & 112) == 32) | c0315s2.d(mVar.ordinal());
            Object M9 = c0315s2.M();
            if (h5 || M9 == z3) {
                E.E e3 = new E.E(uVar2, interfaceC2015a, tVar, mVar, 1);
                c0315s2.i0(e3);
                M9 = e3;
            }
            AbstractC0329z.g((InterfaceC2015a) M9, c0315s2);
        } else {
            c0315s2 = c0315s;
            c0315s2.S();
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0019d0(interfaceC2015a, tVar, dVar, i5, 6);
        }
    }

    public static final void d(Object obj, int i5, x xVar, X.d dVar, C0315s c0315s, int i6) {
        int i7;
        c0315s.Z(-2079116560);
        if ((i6 & 6) == 0) {
            i7 = (c0315s.h(obj) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0315s.d(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0315s.h(xVar) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0315s.h(dVar) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            boolean f5 = c0315s.f(obj) | c0315s.f(xVar);
            Object M5 = c0315s.M();
            Object obj2 = C0302l.f4480a;
            if (f5 || M5 == obj2) {
                M5 = new w(obj, xVar);
                c0315s.i0(M5);
            }
            w wVar = (w) M5;
            C0299j0 c0299j0 = wVar.f720c;
            C0305m0 c0305m0 = wVar.f722e;
            C0305m0 c0305m02 = wVar.f;
            c0299j0.i(i5);
            AbstractC0320u0 abstractC0320u0 = X.f20971a;
            w wVar2 = (w) c0315s.j(abstractC0320u0);
            f d5 = q.d();
            c e3 = d5 != null ? d5.e() : null;
            f g5 = q.g(d5);
            try {
                if (wVar2 != ((w) c0305m02.getValue())) {
                    c0305m02.setValue(wVar2);
                    if (wVar.f721d.h() > 0) {
                        w wVar3 = (w) c0305m0.getValue();
                        if (wVar3 != null) {
                            wVar3.b();
                        }
                        if (wVar2 != null) {
                            wVar2.a();
                        } else {
                            wVar2 = null;
                        }
                        c0305m0.setValue(wVar2);
                    }
                }
                q.k(d5, g5, e3);
                boolean f6 = c0315s.f(wVar);
                Object M6 = c0315s.M();
                if (f6 || M6 == obj2) {
                    M6 = new B(8, wVar);
                    c0315s.i0(M6);
                }
                AbstractC0329z.c(wVar, (c) M6, c0315s);
                AbstractC0329z.a(abstractC0320u0.a(wVar), dVar, c0315s, ((i7 >> 6) & 112) | 8);
            } catch (Throwable th) {
                q.k(d5, g5, e3);
                throw th;
            }
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new r(obj, i5, xVar, dVar, i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:458:0x03ab, code lost:
    
        if (r14.f1817u != r0.f1969p) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x048b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(E e3, G1.B b3, b0.p pVar, h hVar, c cVar, c cVar2, c cVar3, c cVar4, C0315s c0315s, int i5) {
        int i6;
        Object obj;
        i iVar;
        i iVar2;
        Object rVar;
        i iVar3;
        InterfaceC0289e0 interfaceC0289e0;
        C0297i0 c0297i0;
        C0315s c0315s2;
        E e5;
        i iVar4;
        Map map;
        C0140k c0140k;
        int i7;
        int i8;
        c cVar5;
        C0140k c0140k2;
        InterfaceC0289e0 interfaceC0289e02;
        Y.d dVar;
        d1 d1Var;
        int i9;
        Map map2;
        i iVar5;
        InterfaceC0289e0 interfaceC0289e03;
        Activity activity;
        Intent intent;
        int[] intArray;
        Bundle bundle;
        X3.k kVar;
        G1.w h3;
        ArrayList arrayList;
        int length;
        int i10;
        String str;
        y g5;
        G1.B b5;
        boolean z3;
        Bundle bundle2;
        int i11;
        y g6;
        G1.B b6;
        ArrayList<String> stringArrayList;
        int i12 = 0;
        c0315s.Z(-1964664536);
        int i13 = (i5 & 6) == 0 ? (c0315s.h(e3) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i13 |= c0315s.h(b3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i13 |= c0315s.f(pVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i13 |= c0315s.f(hVar) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i13 |= c0315s.h(cVar) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i13 |= c0315s.h(cVar2) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i13 |= c0315s.h(cVar3) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i13 |= c0315s.h(cVar4) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i13 |= c0315s.h(null) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if ((38347923 & i14) == 38347922 && c0315s.B()) {
            c0315s.S();
            c0315s2 = c0315s;
        } else {
            c0315s.U();
            if ((i5 & 1) != 0 && !c0315s.z()) {
                c0315s.S();
            }
            c0315s.r();
            Object obj2 = (InterfaceC0491u) c0315s.j(B1.i.f751a);
            Y a5 = E1.a.a(c0315s);
            if (a5 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.X f5 = a5.f();
            e3.getClass();
            kotlin.jvm.internal.l.f("viewModelStore", f5);
            G1.r rVar2 = e3.f1840p;
            boolean z5 = true;
            G1.q qVar = G1.r.f1932b;
            boolean a6 = kotlin.jvm.internal.l.a(rVar2, (G1.r) new W(f5, qVar, i12).a(kotlin.jvm.internal.x.a(G1.r.class)));
            X3.k kVar2 = e3.f1832g;
            if (!a6) {
                if (!kVar2.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                e3.f1840p = (G1.r) new W(f5, qVar, 0).a(kotlin.jvm.internal.x.a(G1.r.class));
            }
            kotlin.jvm.internal.l.f("graph", b3);
            if (!kVar2.isEmpty() && e3.h() == EnumC0487p.f7058k) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (kotlin.jvm.internal.l.a(e3.f1829c, b3)) {
                i6 = i14;
                obj = obj2;
                S s2 = b3.f1816t;
                int j5 = s2.j();
                for (int i15 = 0; i15 < j5; i15++) {
                    y yVar = (y) s2.k(i15);
                    G1.B b7 = e3.f1829c;
                    kotlin.jvm.internal.l.c(b7);
                    int g7 = b7.f1816t.g(i15);
                    G1.B b8 = e3.f1829c;
                    kotlin.jvm.internal.l.c(b8);
                    S s5 = b8.f1816t;
                    if (s5.f18962k) {
                        AbstractC2339q.a(s5);
                    }
                    int a7 = AbstractC2351a.a(s5.f18965n, g7, s5.f18963l);
                    if (a7 >= 0) {
                        Object[] objArr = s5.f18964m;
                        Object obj3 = objArr[a7];
                        objArr[a7] = yVar;
                    }
                }
                Iterator it = kVar2.iterator();
                while (it.hasNext()) {
                    C0140k c0140k3 = (C0140k) it.next();
                    int i16 = y.f1963s;
                    X3.B b9 = new X3.B(n4.i.N(AbstractC0136g.b(c0140k3.f1899l)));
                    y yVar2 = e3.f1829c;
                    kotlin.jvm.internal.l.c(yVar2);
                    Iterator it2 = b9.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((A) it2).f6071l;
                        if (listIterator.hasPrevious()) {
                            y yVar3 = (y) listIterator.previous();
                            if ((!kotlin.jvm.internal.l.a(yVar3, e3.f1829c) || !kotlin.jvm.internal.l.a(yVar2, b3)) && (yVar2 instanceof G1.B)) {
                                G1.B b10 = (G1.B) yVar2;
                                yVar2 = b10.g(yVar3.f1969p, b10, false, null);
                                kotlin.jvm.internal.l.c(yVar2);
                            }
                        }
                    }
                    kotlin.jvm.internal.l.f("<set-?>", yVar2);
                    c0140k3.f1899l = yVar2;
                }
            } else {
                G1.B b11 = e3.f1829c;
                LinkedHashMap linkedHashMap = e3.f1847w;
                if (b11 != null) {
                    ArrayList arrayList2 = new ArrayList(e3.f1837m.keySet());
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj4 = arrayList2.get(i17);
                        int i18 = i17 + 1;
                        Integer num = (Integer) obj4;
                        kotlin.jvm.internal.l.e("id", num);
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((C0143n) it3.next()).f1919d = z5;
                            it3 = it3;
                            z5 = true;
                        }
                        boolean r5 = e3.r(intValue, null, AbstractC0136g.e(C0131b.f1880o));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((C0143n) it4.next()).f1919d = false;
                            it4 = it4;
                            r5 = r5;
                        }
                        if (r5) {
                            e3.n(intValue, true, false);
                        }
                        z5 = true;
                        i17 = i18;
                    }
                    e3.n(b11.f1969p, z5, false);
                }
                e3.f1829c = b3;
                Bundle bundle3 = e3.f1830d;
                P p5 = e3.f1846v;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    int size2 = stringArrayList.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        String str2 = stringArrayList.get(i19);
                        i19++;
                        String str3 = str2;
                        kotlin.jvm.internal.l.e("name", str3);
                        p5.b(str3);
                        bundle3.getBundle(str3);
                        stringArrayList = stringArrayList;
                    }
                }
                Parcelable[] parcelableArr = e3.f1831e;
                Context context = e3.f1827a;
                if (parcelableArr != null) {
                    int length2 = parcelableArr.length;
                    int i20 = 0;
                    while (i20 < length2) {
                        Parcelable[] parcelableArr2 = parcelableArr;
                        Parcelable parcelable = parcelableArr2[i20];
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                        C0141l c0141l = (C0141l) parcelable;
                        int i21 = c0141l.f1911l;
                        int i22 = length2;
                        y d5 = e3.d(i21, null);
                        if (d5 == null) {
                            int i23 = y.f1963s;
                            StringBuilder w5 = AbstractC0467k.w("Restoring the Navigation back stack failed: destination ", AbstractC0136g.a(context, i21), " cannot be found from the current destination ");
                            C0140k c0140k4 = (C0140k) kVar2.h();
                            w5.append(c0140k4 != null ? c0140k4.f1899l : null);
                            throw new IllegalStateException(w5.toString());
                        }
                        C0140k a8 = c0141l.a(context, d5, e3.h(), e3.f1840p);
                        O b12 = p5.b(d5.f1964k);
                        Object obj5 = linkedHashMap.get(b12);
                        if (obj5 == null) {
                            obj5 = new C0143n(e3, b12);
                            linkedHashMap.put(b12, obj5);
                        }
                        kVar2.addLast(a8);
                        ((C0143n) obj5).a(a8);
                        G1.B b13 = a8.f1899l.f1965l;
                        if (b13 != null) {
                            e3.j(a8, e3.f(b13.f1969p));
                        }
                        i20++;
                        parcelableArr = parcelableArr2;
                        length2 = i22;
                    }
                    e3.u();
                    e3.f1831e = null;
                }
                Collection values = X3.z.T(p5.f1877a).values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : values) {
                    if (!((O) obj6).f1875b) {
                        arrayList3.add(obj6);
                    }
                }
                int size3 = arrayList3.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj7 = arrayList3.get(i24);
                    i24++;
                    O o5 = (O) obj7;
                    Object obj8 = linkedHashMap.get(o5);
                    if (obj8 == null) {
                        obj8 = new C0143n(e3, o5);
                        linkedHashMap.put(o5, obj8);
                    }
                    o5.getClass();
                    o5.f1874a = (C0143n) obj8;
                    o5.f1875b = true;
                }
                if (e3.f1829c == null || !kVar2.isEmpty()) {
                    i6 = i14;
                    obj = obj2;
                    e3.b();
                } else {
                    if (e3.f || (activity = e3.f1828b) == null || (intent = activity.getIntent()) == null) {
                        i6 = i14;
                        obj = obj2;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e6) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e6);
                            }
                            ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundle4 = new Bundle();
                            ArrayList arrayList4 = parcelableArrayList;
                            bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle != null) {
                                bundle4.putAll(bundle);
                            }
                            if (intArray != null || intArray.length == 0) {
                                G1.B i25 = e3.i(kVar2);
                                kVar = kVar2;
                                h3 = i25.h(new v3.e(intent), true, i25);
                                if (h3 != null) {
                                    y yVar4 = h3.f1956k;
                                    yVar4.getClass();
                                    X3.k kVar3 = new X3.k();
                                    y yVar5 = yVar4;
                                    while (true) {
                                        G1.B b14 = yVar5.f1965l;
                                        i6 = i14;
                                        if (b14 != null) {
                                            obj = obj2;
                                        } else {
                                            obj = obj2;
                                        }
                                        kVar3.addFirst(yVar5);
                                        if (!kotlin.jvm.internal.l.a(b14, null) && b14 != null) {
                                            yVar5 = b14;
                                            i14 = i6;
                                            obj2 = obj;
                                        }
                                    }
                                    List m02 = X3.m.m0(kVar3);
                                    ArrayList arrayList5 = new ArrayList(X3.o.S(m02, 10));
                                    Iterator it5 = m02.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(Integer.valueOf(((y) it5.next()).f1969p));
                                    }
                                    kotlin.jvm.internal.l.f("<this>", arrayList5);
                                    intArray = new int[arrayList5.size()];
                                    Iterator it6 = arrayList5.iterator();
                                    int i26 = 0;
                                    while (it6.hasNext()) {
                                        intArray[i26] = ((Number) it6.next()).intValue();
                                        i26++;
                                    }
                                    Bundle c5 = yVar4.c(h3.f1957l);
                                    if (c5 != null) {
                                        bundle4.putAll(c5);
                                    }
                                    arrayList = null;
                                    if (intArray != null && intArray.length != 0) {
                                        G1.B b15 = e3.f1829c;
                                        length = intArray.length;
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i27 = intArray[i10];
                                            if (i10 == 0) {
                                                G1.B b16 = e3.f1829c;
                                                kotlin.jvm.internal.l.c(b16);
                                                g6 = b16.f1969p == i27 ? e3.f1829c : null;
                                                i11 = length;
                                            } else {
                                                kotlin.jvm.internal.l.c(b15);
                                                i11 = length;
                                                g6 = b15.g(i27, b15, false, null);
                                            }
                                            if (g6 == null) {
                                                int i28 = y.f1963s;
                                                str = AbstractC0136g.a(context, i27);
                                                break;
                                            }
                                            if (i10 != intArray.length - 1 && (g6 instanceof G1.B)) {
                                                while (true) {
                                                    b6 = (G1.B) g6;
                                                    kotlin.jvm.internal.l.c(b6);
                                                    if (!(b6.g(b6.f1817u, b6, false, null) instanceof G1.B)) {
                                                        break;
                                                    } else {
                                                        g6 = b6.g(b6.f1817u, b6, false, null);
                                                    }
                                                }
                                                b15 = b6;
                                            }
                                            i10++;
                                            length = i11;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            bundle4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = intArray.length;
                                            Bundle[] bundleArr = new Bundle[length3];
                                            for (int i29 = 0; i29 < length3; i29++) {
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putAll(bundle4);
                                                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i29)) != null) {
                                                    bundle5.putAll(bundle2);
                                                }
                                                bundleArr[i29] = bundle5;
                                            }
                                            int flags = intent.getFlags();
                                            int i30 = 268435456 & flags;
                                            if (i30 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                ArrayList arrayList6 = new ArrayList();
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList6.size();
                                                    try {
                                                        for (Intent C5 = AbstractC2036a.C(context, component); C5 != null; C5 = AbstractC2036a.C(context, C5.getComponent())) {
                                                            arrayList6.add(size4, C5);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e7) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e7);
                                                    }
                                                }
                                                arrayList6.add(intent);
                                                if (arrayList6.isEmpty()) {
                                                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList6.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i30 != 0) {
                                                if (kVar.isEmpty()) {
                                                    z3 = true;
                                                } else {
                                                    G1.B b17 = e3.f1829c;
                                                    kotlin.jvm.internal.l.c(b17);
                                                    z3 = true;
                                                    e3.n(b17.f1969p, true, false);
                                                }
                                                int i31 = 0;
                                                while (i31 < intArray.length) {
                                                    int i32 = intArray[i31];
                                                    int i33 = i31 + 1;
                                                    Bundle bundle6 = bundleArr[i31];
                                                    y d6 = e3.d(i32, null);
                                                    if (d6 == null) {
                                                        int i34 = y.f1963s;
                                                        StringBuilder w6 = AbstractC0467k.w("Deep Linking failed: destination ", AbstractC0136g.a(context, i32), " cannot be found from the current destination ");
                                                        C0140k c0140k5 = (C0140k) kVar.h();
                                                        w6.append(c0140k5 != null ? c0140k5.f1899l : null);
                                                        throw new IllegalStateException(w6.toString());
                                                    }
                                                    e3.k(d6, bundle6, AbstractC0136g.e(new C0028g0(12, d6, e3)));
                                                    i31 = i33;
                                                    z3 = true;
                                                }
                                                e3.f = z3;
                                            } else {
                                                G1.B b18 = e3.f1829c;
                                                int length4 = intArray.length;
                                                for (int i35 = 0; i35 < length4; i35++) {
                                                    int i36 = intArray[i35];
                                                    Bundle bundle7 = bundleArr[i35];
                                                    if (i35 == 0) {
                                                        g5 = e3.f1829c;
                                                    } else {
                                                        kotlin.jvm.internal.l.c(b18);
                                                        g5 = b18.g(i36, b18, false, null);
                                                    }
                                                    if (g5 == null) {
                                                        int i37 = y.f1963s;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + AbstractC0136g.a(context, i36) + " cannot be found in graph " + b18);
                                                    }
                                                    if (i35 == intArray.length - 1) {
                                                        G1.B b19 = e3.f1829c;
                                                        kotlin.jvm.internal.l.c(b19);
                                                        e3.k(g5, bundle7, new H(false, false, b19.f1969p, true, false, 0, 0));
                                                    } else if (g5 instanceof G1.B) {
                                                        while (true) {
                                                            b5 = (G1.B) g5;
                                                            kotlin.jvm.internal.l.c(b5);
                                                            if (!(b5.g(b5.f1817u, b5, false, null) instanceof G1.B)) {
                                                                break;
                                                            } else {
                                                                g5 = b5.g(b5.f1817u, b5, false, null);
                                                            }
                                                        }
                                                        b18 = b5;
                                                    }
                                                }
                                                e3.f = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                kVar = kVar2;
                            }
                            i6 = i14;
                            obj = obj2;
                            arrayList = arrayList4;
                            if (intArray != null) {
                                G1.B b152 = e3.f1829c;
                                length = intArray.length;
                                i10 = 0;
                                while (true) {
                                    if (i10 < length) {
                                    }
                                    i10++;
                                    length = i11;
                                }
                                if (str == null) {
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle bundle42 = new Bundle();
                        ArrayList arrayList42 = parcelableArrayList;
                        if (extras == null) {
                        }
                        if (bundle != null) {
                        }
                        if (intArray != null) {
                        }
                        G1.B i252 = e3.i(kVar2);
                        kVar = kVar2;
                        h3 = i252.h(new v3.e(intent), true, i252);
                        if (h3 != null) {
                        }
                        i6 = i14;
                        obj = obj2;
                        arrayList = arrayList42;
                        if (intArray != null) {
                        }
                    }
                    y yVar6 = e3.f1829c;
                    kotlin.jvm.internal.l.c(yVar6);
                    iVar = null;
                    e3.k(yVar6, null, null);
                    O b20 = e3.f1846v.b("composable");
                    iVar2 = !(b20 instanceof i) ? (i) b20 : iVar;
                    if (iVar2 != null) {
                        C0326x0 s6 = c0315s.s();
                        if (s6 != null) {
                            s6.f4578d = new H1.A(e3, b3, pVar, hVar, cVar, cVar2, cVar3, cVar4, i5, 1);
                            return;
                        }
                        return;
                    }
                    InterfaceC0289e0 l5 = AbstractC0329z.l(iVar2.b().f1920e, c0315s);
                    Object M5 = c0315s.M();
                    Object obj9 = C0302l.f4480a;
                    if (M5 == obj9) {
                        M5 = new C0297i0(0.0f);
                        c0315s.i0(M5);
                    }
                    C0297i0 c0297i02 = (C0297i0) M5;
                    Object M6 = c0315s.M();
                    if (M6 == obj9) {
                        M6 = AbstractC0329z.t(Boolean.FALSE);
                        c0315s.i0(M6);
                    }
                    InterfaceC0289e0 interfaceC0289e04 = (InterfaceC0289e0) M6;
                    boolean z6 = ((List) l5.getValue()).size() > 1;
                    boolean f6 = c0315s.f(l5) | c0315s.f(iVar2);
                    Object M7 = c0315s.M();
                    if (f6 || M7 == obj9) {
                        iVar3 = iVar2;
                        rVar = new H1.r(iVar3, l5, c0297i02, interfaceC0289e04, null);
                        interfaceC0289e0 = l5;
                        c0297i0 = c0297i02;
                        c0315s.i0(rVar);
                    } else {
                        rVar = M7;
                        interfaceC0289e0 = l5;
                        c0297i0 = c0297i02;
                        iVar3 = iVar2;
                    }
                    G4.l.e(z6, (i4.e) rVar, c0315s, 0);
                    Object obj10 = obj;
                    boolean h4 = c0315s.h(e3) | c0315s.h(obj10);
                    Object M8 = c0315s.M();
                    if (h4 || M8 == obj9) {
                        M8 = new C0028g0(13, e3, obj10);
                        c0315s.i0(M8);
                    }
                    AbstractC0329z.c(obj10, (c) M8, c0315s);
                    Y.d c6 = k.c(c0315s);
                    InterfaceC0289e0 l6 = AbstractC0329z.l(e3.f1834j, c0315s);
                    Object M9 = c0315s.M();
                    if (M9 == obj9) {
                        M9 = AbstractC0329z.o(new A.m(3, l6));
                        c0315s.i0(M9);
                    }
                    d1 d1Var2 = (d1) M9;
                    C0140k c0140k6 = (C0140k) X3.m.f0((List) d1Var2.getValue());
                    Object M10 = c0315s.M();
                    if (M10 == obj9) {
                        M10 = new LinkedHashMap();
                        c0315s.i0(M10);
                    }
                    Map map3 = (Map) M10;
                    c0315s.X(653365120);
                    if (c0140k6 != null) {
                        boolean f7 = c0315s.f(iVar3) | ((((i6 & 3670016) ^ 1572864) > 1048576 && c0315s.f(cVar3)) || (i6 & 1572864) == 1048576) | ((i6 & 57344) == 16384);
                        Object M11 = c0315s.M();
                        if (f7 || M11 == obj9) {
                            map = map3;
                            c0140k = c0140k6;
                            i7 = 8388608;
                            i8 = 67108864;
                            Object b21 = new H1.B(iVar3, cVar3, cVar, interfaceC0289e04, 0);
                            c0315s.i0(b21);
                            M11 = b21;
                        } else {
                            map = map3;
                            c0140k = c0140k6;
                            i7 = 8388608;
                            i8 = 67108864;
                        }
                        c cVar6 = (c) M11;
                        boolean f8 = c0315s.f(iVar3) | ((((i6 & 29360128) ^ 12582912) > i7 && c0315s.f(cVar4)) || (i6 & 12582912) == i7) | ((i6 & 458752) == 131072);
                        Object M12 = c0315s.M();
                        if (f8 || M12 == obj9) {
                            cVar5 = cVar6;
                            Object b22 = new H1.B(iVar3, cVar4, cVar2, interfaceC0289e04, 1);
                            c0315s.i0(b22);
                            M12 = b22;
                        } else {
                            cVar5 = cVar6;
                        }
                        c cVar7 = (c) M12;
                        boolean z7 = (i6 & 234881024) == i8;
                        Object M13 = c0315s.M();
                        if (z7 || M13 == obj9) {
                            M13 = new H1.x(1, 3);
                            c0315s.i0(M13);
                        }
                        c cVar8 = (c) M13;
                        Boolean bool = Boolean.TRUE;
                        boolean f9 = c0315s.f(iVar3);
                        Object M14 = c0315s.M();
                        if (f9 || M14 == obj9) {
                            M14 = new C0028g0(14, d1Var2, iVar3);
                            c0315s.i0(M14);
                        }
                        AbstractC0329z.c(bool, (c) M14, c0315s);
                        Object M15 = c0315s.M();
                        if (M15 == obj9) {
                            c0140k2 = c0140k;
                            M15 = new C2452c0(c0140k2);
                            c0315s.i0(M15);
                        } else {
                            c0140k2 = c0140k;
                        }
                        C2452c0 c2452c0 = (C2452c0) M15;
                        Object obj11 = y0.f19969a;
                        boolean f10 = c0315s.f(c2452c0);
                        Object M16 = c0315s.M();
                        if (f10 || M16 == obj9) {
                            interfaceC0289e02 = interfaceC0289e04;
                            M16 = new t0(c2452c0, null, "entry");
                            c0315s.i0(M16);
                        } else {
                            interfaceC0289e02 = interfaceC0289e04;
                        }
                        t0 t0Var = (t0) M16;
                        if (c2452c0 != null) {
                            c0315s.X(1030413636);
                            Object value = c2452c0.f19771c.getValue();
                            Object value2 = c2452c0.f19770b.getValue();
                            boolean f11 = c0315s.f(c2452c0);
                            dVar = c6;
                            Object M17 = c0315s.M();
                            if (f11 || M17 == obj9) {
                                d1Var = d1Var2;
                                M17 = new v0(c2452c0, null);
                                c0315s.i0(M17);
                            } else {
                                d1Var = d1Var2;
                            }
                            AbstractC0329z.f(value, value2, (i4.e) M17, c0315s);
                            i9 = 0;
                            c0315s.q(false);
                        } else {
                            dVar = c6;
                            d1Var = d1Var2;
                            i9 = 0;
                            c0315s.X(1030875195);
                            t0Var.a(c2452c0.f19770b.getValue(), c0315s, 0);
                            c0315s.q(false);
                        }
                        boolean f12 = c0315s.f(t0Var);
                        Object M18 = c0315s.M();
                        if (f12 || M18 == obj9) {
                            M18 = new x0(t0Var, i9);
                            c0315s.i0(M18);
                        }
                        AbstractC0329z.c(t0Var, (c) M18, c0315s);
                        if (g(interfaceC0289e02)) {
                            c0315s.X(-1218260648);
                            Float valueOf = Float.valueOf(c0297i0.h());
                            boolean f13 = c0315s.f(interfaceC0289e0) | c0315s.h(c2452c0);
                            Object M19 = c0315s.M();
                            if (f13 || M19 == obj9) {
                                M19 = new H1.t(c2452c0, interfaceC0289e0, c0297i0, null);
                                c0315s.i0(M19);
                            }
                            AbstractC0329z.e(c0315s, (i4.e) M19, valueOf);
                            c0315s.q(false);
                            iVar4 = null;
                        } else {
                            c0315s.X(-1218005611);
                            boolean h5 = c0315s.h(c2452c0) | c0315s.h(c0140k2) | c0315s.f(t0Var);
                            Object M20 = c0315s.M();
                            if (h5 || M20 == obj9) {
                                iVar4 = null;
                                M20 = new v(c2452c0, c0140k2, t0Var, null);
                                c0315s.i0(M20);
                            } else {
                                iVar4 = null;
                            }
                            AbstractC0329z.e(c0315s, (i4.e) M20, c0140k2);
                            c0315s.q(false);
                        }
                        Map map4 = map;
                        boolean h6 = c0315s.h(map4) | c0315s.f(iVar3) | c0315s.f(cVar5) | c0315s.f(cVar7) | c0315s.f(cVar8);
                        Object M21 = c0315s.M();
                        if (h6 || M21 == obj9) {
                            i iVar6 = iVar3;
                            M21 = new H1.w(map4, iVar6, cVar5, cVar7, cVar8, d1Var, interfaceC0289e02);
                            map2 = map4;
                            iVar5 = iVar6;
                            interfaceC0289e03 = interfaceC0289e02;
                            c0315s.i0(M21);
                        } else {
                            iVar5 = iVar3;
                            map2 = map4;
                            interfaceC0289e03 = interfaceC0289e02;
                        }
                        AbstractC0444a.a(t0Var, pVar, (c) M21, hVar, H1.x.f2263m, X.e.d(820763100, new H1.y(c2452c0, c0140k2, dVar, interfaceC0289e03, d1Var), c0315s), c0315s, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                        c0315s2 = c0315s;
                        Object e8 = t0Var.f19937a.e();
                        Object value3 = t0Var.f19940d.getValue();
                        boolean f14 = c0315s2.f(t0Var) | c0315s2.h(e3) | c0315s2.f(iVar5) | c0315s2.h(map2);
                        Object M22 = c0315s2.M();
                        if (f14 || M22 == obj9) {
                            Object zVar = new H1.z(t0Var, e3, map2, d1Var, iVar5, null);
                            e5 = e3;
                            c0315s2.i0(zVar);
                            M22 = zVar;
                        } else {
                            e5 = e3;
                        }
                        AbstractC0329z.f(e8, value3, (i4.e) M22, c0315s2);
                    } else {
                        c0315s2 = c0315s;
                        e5 = e3;
                        iVar4 = iVar;
                    }
                    c0315s2.q(false);
                    O b23 = e5.f1846v.b("dialog");
                    H1.o oVar = b23 instanceof H1.o ? (H1.o) b23 : iVar4;
                    if (oVar == 0) {
                        C0326x0 s7 = c0315s2.s();
                        if (s7 != null) {
                            s7.f4578d = new H1.A(e5, b3, pVar, hVar, cVar, cVar2, cVar3, cVar4, i5, 2);
                            return;
                        }
                        return;
                    }
                    N4.b.a(oVar, c0315s2, 0);
                }
            }
            iVar = null;
            O b202 = e3.f1846v.b("composable");
            if (!(b202 instanceof i)) {
            }
            if (iVar2 != null) {
            }
        }
        C0326x0 s8 = c0315s2.s();
        if (s8 != null) {
            s8.f4578d = new H1.A(e3, b3, pVar, hVar, cVar, cVar2, cVar3, cVar4, i5, 0);
        }
    }

    public static final void f(E e3, b0.p pVar, h hVar, H1.x xVar, H1.x xVar2, H1.x xVar3, H1.x xVar4, c cVar, C0315s c0315s, int i5) {
        int i6;
        h hVar2;
        H1.x xVar5;
        int i7;
        H1.x xVar6;
        H1.x xVar7;
        char c5;
        H1.x xVar8;
        h hVar3;
        H1.x xVar9;
        c0315s.Z(1840250294);
        if ((i5 & 6) == 0) {
            i6 = (c0315s.h(e3) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c0315s.f("appR/navigator/home_portal") ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c0315s.f(pVar) ? 256 : 128;
        }
        int i8 = 1797120 | i6;
        if ((12582912 & i5) == 0) {
            i8 = 5991424 | i6;
        }
        if ((100663296 & i5) == 0) {
            i8 |= 33554432;
        }
        int i9 = 805306368 | i8;
        char c6 = c0315s.h(cVar) ? (char) 4 : (char) 2;
        if ((306783379 & i9) == 306783378 && (c6 & 3) == 2 && c0315s.B()) {
            c0315s.S();
            hVar3 = hVar;
            xVar6 = xVar;
            xVar9 = xVar2;
            xVar8 = xVar3;
            xVar7 = xVar4;
        } else {
            c0315s.U();
            if ((i5 & 1) == 0 || c0315s.z()) {
                hVar2 = b0.c.f7137k;
                H1.x xVar10 = H1.x.f2264n;
                xVar5 = H1.x.f2265o;
                i7 = i9 & (-264241153);
                xVar6 = xVar10;
                xVar7 = xVar5;
                c5 = c6;
                xVar8 = xVar6;
            } else {
                c0315s.S();
                i7 = i9 & (-264241153);
                hVar2 = hVar;
                xVar6 = xVar;
                xVar5 = xVar2;
                xVar7 = xVar4;
                c5 = c6;
                xVar8 = xVar3;
            }
            c0315s.r();
            boolean z3 = ((i7 & 112) == 32) | ((i7 & 57344) == 16384) | ((c5 & 14) == 4);
            Object M5 = c0315s.M();
            if (z3 || M5 == C0302l.f4480a) {
                C c7 = new C(e3.f1846v);
                cVar.c(c7);
                M5 = c7.c();
                c0315s.i0(M5);
            }
            G1.B b3 = (G1.B) M5;
            int i10 = i7 & 8078;
            int i11 = i7 >> 3;
            int i12 = i10 | (i11 & 57344) | (458752 & i11) | (i11 & 234881024);
            hVar3 = hVar2;
            xVar9 = xVar5;
            e(e3, b3, pVar, hVar3, xVar6, xVar9, xVar8, xVar7, c0315s, i12);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new H1.A(e3, pVar, hVar3, xVar6, xVar9, xVar8, xVar7, cVar, i5);
        }
    }

    public static final boolean g(InterfaceC0289e0 interfaceC0289e0) {
        return ((Boolean) interfaceC0289e0.getValue()).booleanValue();
    }

    public static final void h(b0.p pVar, i4.e eVar, C0315s c0315s, int i5) {
        int i6;
        c0315s.Z(1090521195);
        if ((i5 & 6) == 0) {
            i6 = (c0315s.f(pVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c0315s.h(eVar) ? 32 : 16;
        }
        if (c0315s.P(i6 & 1, (i6 & 19) != 18)) {
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = a1.e.f6392b;
                c0315s.i0(M5);
            }
            x0.O o5 = (x0.O) M5;
            long j5 = c0315s.f4531T;
            int i7 = (int) ((j5 >>> 32) ^ j5);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, pVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            int i8 = (((((i6 << 3) & 112) | (((i6 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, o5);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(i7))) {
                AbstractC2107A.y(i7, c0315s, i7, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            eVar.invoke(c0315s, Integer.valueOf((i8 >> 6) & 14));
            c0315s.q(true);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new a1.f(pVar, eVar, i5, 0);
        }
    }

    public static final C0162o i(D3.l lVar, InterfaceC0157j interfaceC0157j) {
        boolean z3 = lVar.b() == 1;
        C0160m c0160m = (C0160m) lVar.f963n;
        return new C0162o(m(c0160m, z3, true, interfaceC0157j), m(c0160m, z3, false, interfaceC0157j), z3);
    }

    public static final boolean j(e0.f fVar, long j5) {
        if (!fVar.f7162k.f7175x) {
            return false;
        }
        C2761s c2761s = AbstractC2749f.v(fVar).f21612O.f21768c;
        if (!c2761s.f21856Y.f7175x) {
            return false;
        }
        long J = c2761s.J(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (J >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (J & 4294967295L));
        long j6 = fVar.f16898A;
        float f5 = ((int) (j6 >> 32)) + intBitsToFloat;
        float f6 = ((int) (j6 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f5) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f6;
    }

    public static final ExtractedText k(P0.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f4679a.f2829l;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = wVar.f4680b;
        extractedText.selectionStart = N.e(j5);
        extractedText.selectionEnd = N.d(j5);
        extractedText.flags = !AbstractC2227e.A0(wVar.f4679a.f2829l, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final C0161n l(D3.l lVar, C0160m c0160m, C0161n c0161n) {
        boolean z3 = lVar.f961l;
        int i5 = c0160m.f2499c;
        int i6 = c0160m.f2498b;
        int i7 = z3 ? i6 : i5;
        W3.f fVar = W3.f.f6034k;
        W3.e D5 = G4.d.D(fVar, new I.r(c0160m, i7));
        W3.e D6 = G4.d.D(fVar, new C0164q(c0160m, i7, z3 ? i5 : i6, lVar, D5));
        if (1 != c0161n.f2504c) {
            return (C0161n) D6.getValue();
        }
        int i8 = c0160m.f2500d;
        if (i7 == i8) {
            return c0161n;
        }
        L l5 = (L) c0160m.f2501e;
        if (((Number) D5.getValue()).intValue() != l5.e(i8)) {
            return (C0161n) D6.getValue();
        }
        int i9 = c0161n.f2503b;
        long k5 = l5.k(i9);
        if (i8 != -1) {
            if (i7 != i8) {
                if (!(z3 ^ (i6 >= i5 && i6 > i5))) {
                }
            }
            return c0160m.b(i7);
        }
        int i10 = N.f2802c;
        return (i9 == ((int) (k5 >> 32)) || i9 == ((int) (4294967295L & k5))) ? (C0161n) D6.getValue() : c0160m.b(i7);
    }

    public static final C0161n m(C0160m c0160m, boolean z3, boolean z5, InterfaceC0157j interfaceC0157j) {
        long j5;
        long a5 = interfaceC0157j.a(c0160m, z5 ? c0160m.f2498b : c0160m.f2499c);
        if (z3 ^ z5) {
            int i5 = N.f2802c;
            j5 = a5 >> 32;
        } else {
            int i6 = N.f2802c;
            j5 = 4294967295L & a5;
        }
        return c0160m.b((int) j5);
    }

    public static final C0161n r(C0161n c0161n, C0160m c0160m, int i5) {
        return new C0161n(((L) c0160m.f2501e).a(i5), i5, c0161n.f2504c);
    }

    public static final C2421i s(Context context) {
        final v3.e eVar = new v3.e(context, 23);
        final int i5 = 0;
        W3.m E5 = G4.d.E(new InterfaceC2015a() { // from class: t2.d
            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                int i6;
                C2551i c2551i;
                int i7 = 0;
                switch (i5) {
                    case 0:
                        Context context2 = (Context) eVar.f20432l;
                        Bitmap.Config config = H2.e.f2284a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.l.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        C2.h hVar = new C2.h(0, (byte) 0);
                        if (d5 > 0.0d) {
                            Bitmap.Config config2 = H2.e.f2284a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.l.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i6 = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i6 = 256;
                            }
                            double d6 = d5 * i6;
                            double d7 = 1024;
                            i7 = (int) (d6 * d7 * d7);
                        }
                        return new C2.d(i7 > 0 ? new v3.g(i7, hVar) : new C1930k(4, hVar), hVar);
                    default:
                        v3.e eVar2 = eVar;
                        H2.k kVar = H2.k.f2301k;
                        Context context3 = (Context) eVar2.f20432l;
                        synchronized (kVar) {
                            try {
                                c2551i = H2.k.f2302l;
                                if (c2551i == null) {
                                    C2543a c2543a = new C2543a();
                                    c2543a.f20491b = L4.o.f3106a;
                                    c2543a.f20492c = 0.02d;
                                    c2543a.f20493d = 10485760L;
                                    c2543a.f20494e = 262144000L;
                                    w4.e eVar3 = D.f18743a;
                                    c2543a.f = w4.d.f20559m;
                                    Bitmap.Config config3 = H2.e.f2284a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File o02 = AbstractC1985a.o0(cacheDir);
                                    String str = L4.z.f3126l;
                                    c2543a.f20490a = j3.i.t(o02);
                                    c2551i = c2543a.a();
                                    H2.k.f2302l = c2551i;
                                }
                            } finally {
                            }
                        }
                        return c2551i;
                }
            }
        });
        final int i6 = 1;
        W3.m E6 = G4.d.E(new InterfaceC2015a() { // from class: t2.d
            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                int i62;
                C2551i c2551i;
                int i7 = 0;
                switch (i6) {
                    case 0:
                        Context context2 = (Context) eVar.f20432l;
                        Bitmap.Config config = H2.e.f2284a;
                        double d5 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.l.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d5 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        C2.h hVar = new C2.h(0, (byte) 0);
                        if (d5 > 0.0d) {
                            Bitmap.Config config2 = H2.e.f2284a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.l.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i62 = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i62 = 256;
                            }
                            double d6 = d5 * i62;
                            double d7 = 1024;
                            i7 = (int) (d6 * d7 * d7);
                        }
                        return new C2.d(i7 > 0 ? new v3.g(i7, hVar) : new C1930k(4, hVar), hVar);
                    default:
                        v3.e eVar2 = eVar;
                        H2.k kVar = H2.k.f2301k;
                        Context context3 = (Context) eVar2.f20432l;
                        synchronized (kVar) {
                            try {
                                c2551i = H2.k.f2302l;
                                if (c2551i == null) {
                                    C2543a c2543a = new C2543a();
                                    c2543a.f20491b = L4.o.f3106a;
                                    c2543a.f20492c = 0.02d;
                                    c2543a.f20493d = 10485760L;
                                    c2543a.f20494e = 262144000L;
                                    w4.e eVar3 = D.f18743a;
                                    c2543a.f = w4.d.f20559m;
                                    Bitmap.Config config3 = H2.e.f2284a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File o02 = AbstractC1985a.o0(cacheDir);
                                    String str = L4.z.f3126l;
                                    c2543a.f20490a = j3.i.t(o02);
                                    c2551i = c2543a.a();
                                    H2.k.f2302l = c2551i;
                                }
                            } finally {
                            }
                        }
                        return c2551i;
                }
            }
        });
        W3.m E7 = G4.d.E(new B1.h(18));
        X3.v vVar = X3.v.f6090k;
        return new C2421i((Context) eVar.f20432l, (E2.c) eVar.f20433m, E5, E6, E7, new C2414b(vVar, vVar, vVar, vVar, vVar), (H2.i) eVar.f20434n);
    }

    public static long t(int i5, int i6, int i7, int i8) {
        int i9 = 262142;
        int min = Math.min(i7, 262142);
        int min2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int i10 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i10 >= 8191) {
            if (i10 < 32767) {
                i9 = 65534;
            } else if (i10 < 65535) {
                i9 = 32766;
            } else {
                if (i10 >= 262143) {
                    W0.b.l(i10);
                    throw new D2.e();
                }
                i9 = 8190;
            }
        }
        return W0.b.a(Math.min(i9, i5), i6 != Integer.MAX_VALUE ? Math.min(i9, i6) : Integer.MAX_VALUE, min, min2);
    }

    public static long u(int i5, int i6, int i7, int i8) {
        int i9 = 262142;
        int min = Math.min(i5, 262142);
        int min2 = i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i6, 262142);
        int i10 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i10 >= 8191) {
            if (i10 < 32767) {
                i9 = 65534;
            } else if (i10 < 65535) {
                i9 = 32766;
            } else {
                if (i10 >= 262143) {
                    W0.b.l(i10);
                    throw new D2.e();
                }
                i9 = 8190;
            }
        }
        return W0.b.a(min, min2, Math.min(i9, i7), i8 != Integer.MAX_VALUE ? Math.min(i9, i8) : Integer.MAX_VALUE);
    }

    public static void v(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject optJSONObject;
        String optString;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("partnerConfig");
        String str6 = "";
        if (optJSONObject5 == null || (str = optJSONObject5.optString("landingUrl", "")) == null) {
            str = "";
        }
        f19099h = str;
        if (optJSONObject5 == null || (str2 = optJSONObject5.optString("returnUrl", "")) == null) {
            str2 = "";
        }
        i = str2;
        f19098g = jSONObject.optString("adMarker", "");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("placements");
        if (optJSONObject6 == null || (optJSONObject4 = optJSONObject6.optJSONObject("appLaunch")) == null || (str3 = optJSONObject4.optString("adUnitId", "")) == null) {
            str3 = "";
        }
        f19102l = str3;
        if (optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("feedNative")) == null || (str4 = optJSONObject3.optString("adUnitId", "")) == null) {
            str4 = "";
        }
        f19101k = str4;
        if (optJSONObject6 == null || (optJSONObject2 = optJSONObject6.optJSONObject("feedBanner")) == null || (str5 = optJSONObject2.optString("adUnitId", "")) == null) {
            str5 = "";
        }
        f19103m = str5;
        if (optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("interstitial")) != null && (optString = optJSONObject.optString("adUnitId", "")) != null) {
            str6 = optString;
        }
        f19100j = str6;
    }

    public static final String[] y(c0.k kVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType", kVar);
        return (String[]) ((c0.d) kVar).f7385b.toArray(new String[0]);
    }

    public static final float z(Layout layout, int i5, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i5);
        j jVar = l.f3029a;
        if (layout.getEllipsisCount(i5) <= 0 || layout.getParagraphDirection(i5) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i5) + layout.getLineStart(i5)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i5);
        if ((paragraphAlignment == null ? -1 : d.f3721a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public abstract String[] B(Class cls);

    public abstract boolean H(Class cls);

    public abstract void J(C2304g c2304g, C2304g c2304g2);

    public abstract void K(C2304g c2304g, Thread thread);

    public abstract void O();

    public abstract void P();

    public boolean n() {
        return false;
    }

    public abstract boolean o(AbstractC2305h abstractC2305h, C2300c c2300c, C2300c c2300c2);

    public abstract boolean p(AbstractC2305h abstractC2305h, Object obj, Object obj2);

    public abstract boolean q(AbstractC2305h abstractC2305h, C2304g c2304g, C2304g c2304g2);

    public abstract Method w(Class cls, Field field);

    public abstract Constructor x(Class cls);

    public void M() {
    }
}
