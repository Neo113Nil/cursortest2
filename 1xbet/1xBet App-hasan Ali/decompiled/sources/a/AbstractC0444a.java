package a;

import A.k;
import A0.C0019d0;
import A0.C0022e0;
import A0.C0060u;
import B.r;
import B1.h;
import C.i;
import D.d;
import D2.e;
import E.C0106k;
import E.InterfaceC0104i0;
import G1.C0140k;
import H1.C0146a;
import I.C0153f;
import I.InterfaceC0159l;
import I.N;
import I.O;
import I.P;
import I.Q;
import K0.A;
import K0.C0196a;
import L4.C0226i;
import L4.C0229l;
import M.p0;
import N4.b;
import O3.s;
import P.AbstractC0317t;
import P.AbstractC0321v;
import P.AbstractC0329z;
import P.C0280a;
import P.C0302l;
import P.C0305m0;
import P.C0308o;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.L0;
import P.P0;
import P.Z;
import Q2.C0379q;
import R3.j;
import S3.C0399b;
import S3.C0405h;
import S3.C0419w;
import S3.E;
import S3.c0;
import T2.G;
import T2.L;
import X3.v;
import a.AbstractC0444a;
import a0.C0452h;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.S;
import androidx.lifecycle.Y;
import b0.g;
import b0.m;
import b0.o;
import b0.p;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC1715vu;
import com.google.android.gms.internal.ads.C1221ku;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.InterfaceC1760wu;
import com.google.android.gms.internal.ads.Lq;
import h0.C1988b;
import h0.C1989c;
import i0.J;
import i0.M;
import i4.InterfaceC2015a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import l4.C2059a;
import l4.C2060b;
import l4.C2062d;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2205i;
import o0.C2207k;
import o0.C2209m;
import o0.C2213q;
import o0.z;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import org.json.JSONException;
import org.json.JSONObject;
import r.C2316B;
import r.C2321G;
import r.C2343v;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t.C2391c;
import t.C2392d;
import t.C2395g;
import t.C2399k;
import t.C2400l;
import t.u;
import t3.AbstractC2425d;
import u.A0;
import u.B0;
import u.o0;
import u.t0;
import u.y0;
import v.AbstractC2527w;
import v.AbstractC2528x;
import x0.InterfaceC2637x;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.AbstractC2749f;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;
import z0.InterfaceC2755l;
import z0.e0;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0444a {

    /* renamed from: a, reason: collision with root package name */
    public static C2201e f6357a;

    /* renamed from: b, reason: collision with root package name */
    public static C2201e f6358b;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f6359c;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f6360d;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f6361e;

    public static Parcelable A(Parcel parcel, int i, Parcelable.Creator creator) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Z4);
        return parcelable;
    }

    public static String B(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Z4);
        return readString;
    }

    public static String[] C(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + Z4);
        return createStringArray;
    }

    public static ArrayList D(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + Z4);
        return createStringArrayList;
    }

    public static Object[] E(Parcel parcel, int i, Parcelable.Creator creator) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Z4);
        return createTypedArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(int i, C0315s c0315s) {
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(-504421443);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (str.length() == 0) {
                C0326x0 s5 = c0315s.s();
                if (s5 != null) {
                    s5.f4578d = new A(i, 27);
                    return;
                }
                return;
            }
            if (!str.equals("adMarkerQureka")) {
                if (str.equals("adMarkerAdx")) {
                    c0315s.X(1825385235);
                    c0315s.X(1825386195);
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
                    c0315s2.X(1825386837);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new A(i, 28);
                    return;
                }
                return;
            }
            c0315s.X(1825383873);
            s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static void G(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new e(AbstractC2107A.q("Overread allowed size end=", i), parcel);
        }
    }

    public static final boolean H(char c5, char c6, boolean z3) {
        if (c5 == c6) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void I(final C2201e c2201e, final String str, final String str2, final String str3, final long j5, final p pVar, final InterfaceC2015a interfaceC2015a, C0315s c0315s, final int i) {
        c0315s.Z(996349652);
        if (((i | (c0315s.f(c2201e) ? 4 : 2) | (c0315s.f(pVar) ? 131072 : 65536) | (c0315s.h(interfaceC2015a) ? 1048576 : 524288)) & 599187) == 599186 && c0315s.B()) {
            c0315s.S();
        } else {
            p c5 = c.c(pVar, 110);
            d dVar = j.f5218a;
            p0.a(androidx.compose.foundation.a.d(n(c5, dVar), false, null, interfaceC2015a, 7), dVar, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5995z)), X.e.d(-1609578215, new E(j5, str3, c2201e, str, str2), c0315s), c0315s, 14377392, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e(str, str2, str3, j5, pVar, interfaceC2015a, i) { // from class: S3.D

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f5359l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f5360m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ String f5361n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f5362o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ b0.p f5363p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2015a f5364q;

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(28081);
                    C2201e c2201e2 = C2201e.this;
                    String str4 = this.f5359l;
                    String str5 = this.f5360m;
                    String str6 = this.f5361n;
                    b0.p pVar2 = this.f5363p;
                    InterfaceC2015a interfaceC2015a2 = this.f5364q;
                    AbstractC0444a.I(c2201e2, str4, str5, str6, this.f5362o, pVar2, interfaceC2015a2, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(final Context context, C0315s c0315s, int i) {
        C2768z c2768z;
        C2751h c2751h;
        C2751h c2751h2;
        boolean z3;
        c0315s.Z(-1827236840);
        if (((i | (c0315s.h(context) ? 4 : 2)) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            C2700b c2700b = AbstractC2706h.f21534a;
            float f = 8;
            C2703e c2703e = new C2703e(f);
            m mVar = m.f7161k;
            C2717s a5 = AbstractC2716r.a(c2703e, b0.c.f7148v, c0315s, 6);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            p c5 = b0.a.c(c0315s, mVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z2 = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z2);
            } else {
                c0315s.l0();
            }
            C2751h c2751h3 = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h3, a5);
            C2751h c2751h4 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h4, l5);
            C2751h c2751h5 = C2752i.f;
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h5);
            }
            C2751h c2751h6 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h6, c5);
            p b3 = c.b(mVar, 1.0f);
            C2703e c2703e2 = new C2703e(f);
            g gVar = b0.c.f7146t;
            C2686J a6 = AbstractC2685I.a(c2703e2, gVar, c0315s, 6);
            int p6 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l6 = c0315s.l();
            p c6 = b0.a.c(c0315s, b3);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z2);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h3, a6);
            AbstractC0329z.y(c0315s, c2751h4, l6);
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s, p6, c2751h5);
            }
            AbstractC0329z.y(c0315s, c2751h6, c6);
            C2201e c2201e = AbstractC2346c.f19089g;
            if (c2201e != null) {
                c2751h = c2751h4;
                c2751h2 = c2751h5;
                c2768z = c2768z2;
            } else {
                C2200d c2200d = new C2200d("Filled.Share", false);
                int i5 = z.f18603a;
                c2768z = c2768z2;
                M m5 = new M(i0.p.f17289b);
                C2202f c2202f = new C2202f(0);
                c2202f.m(18.0f, 16.08f);
                c2202f.g(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                c2202f.k(8.91f, 12.7f);
                c2202f.g(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                c2751h = c2751h4;
                c2751h2 = c2751h5;
                c2202f.o(-0.04f, -0.47f, -0.09f, -0.7f);
                c2202f.l(7.05f, -4.11f);
                c2202f.g(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                c2202f.g(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                c2202f.o(-1.34f, -3.0f, -3.0f, -3.0f);
                c2202f.o(-3.0f, 1.34f, -3.0f, 3.0f);
                c2202f.g(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                c2202f.k(8.04f, 9.81f);
                c2202f.f(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                c2202f.g(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                c2202f.o(1.34f, 3.0f, 3.0f, 3.0f);
                c2202f.g(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                c2202f.l(7.12f, 4.16f);
                c2202f.g(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                c2202f.g(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                c2202f.g(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                c2202f.o(-1.31f, -2.92f, -2.92f, -2.92f);
                c2202f.e();
                C2200d.a(c2200d, c2202f.f18548a, m5);
                c2201e = c2200d.b();
                AbstractC2346c.f19089g = c2201e;
            }
            C2201e c2201e2 = c2201e;
            long j5 = V3.a.f5975d;
            p C5 = AbstractC2107A.C(mVar, 1.0f);
            c0315s.X(-1123073495);
            boolean h3 = c0315s.h(context);
            Object M5 = c0315s.M();
            C2768z c2768z3 = c2768z;
            Z z5 = C0302l.f4480a;
            if (h3 || M5 == z5) {
                z3 = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                M5 = new InterfaceC2015a() { // from class: S3.C
                    @Override // i4.InterfaceC2015a
                    public final Object invoke() {
                        switch (objArr) {
                            case 0:
                                Context context2 = context;
                                kotlin.jvm.internal.l.f("screenScope", context2);
                                String packageName = context2.getPackageName();
                                kotlin.jvm.internal.l.c(packageName);
                                if (!AbstractC2227e.H0(packageName)) {
                                    String concat = "https://play.google.com/store/apps/details?id=".concat(packageName);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", "Check out this football companion: " + concat);
                                    Intent createChooser = Intent.createChooser(intent, "Share App");
                                    kotlin.jvm.internal.l.e("createChooser(...)", createChooser);
                                    context2.startActivity(createChooser);
                                }
                                break;
                            case 1:
                                Context context3 = context;
                                kotlin.jvm.internal.l.f("screenScope", context3);
                                String packageName2 = context3.getPackageName();
                                kotlin.jvm.internal.l.c(packageName2);
                                if (!AbstractC2227e.H0(packageName2)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW");
                                    intent2.setData(Uri.parse("market://details?id=".concat(packageName2)));
                                    if (intent2.resolveActivity(context3.getPackageManager()) == null) {
                                        intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(packageName2)));
                                    }
                                    context3.startActivity(intent2);
                                }
                                break;
                            default:
                                Context context4 = context;
                                kotlin.jvm.internal.l.f("screenScope", context4);
                                if (AbstractC2234l.x0("https://sites.google.com/view/hasan-ali-whcah/home", "http", false)) {
                                    String obj = AbstractC2227e.Q0("https://sites.google.com/view/hasan-ali-whcah/home").toString();
                                    if (obj.length() >= 4) {
                                        P.W w5 = new P.W(6);
                                        Intent intent3 = (Intent) w5.f4412l;
                                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                        intent3.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                                        G.v a7 = w5.a();
                                        Intent intent4 = (Intent) a7.f1749l;
                                        intent4.setPackage("com.android.chrome");
                                        intent4.setData(Uri.parse(obj));
                                        context4.startActivity(intent4, (Bundle) a7.f1750m);
                                    }
                                }
                                break;
                        }
                        return W3.o.f6046a;
                    }
                };
                c0315s.i0(M5);
            } else {
                z3 = false;
            }
            c0315s.q(z3);
            C2751h c2751h7 = c2751h;
            C2751h c2751h8 = c2751h2;
            I(c2201e2, "Invite", "Share with friends", "SOCIAL", j5, C5, (InterfaceC2015a) M5, c0315s, 28080);
            c0315s.q(true);
            p b5 = c.b(mVar, 1.0f);
            C2686J a7 = AbstractC2685I.a(new C2703e(f), gVar, c0315s, 6);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            p c7 = b0.a.c(c0315s, b5);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z3);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h3, a7);
            AbstractC0329z.y(c0315s, c2751h7, l7);
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p7))) {
                AbstractC2107A.y(p7, c0315s, p7, c2751h8);
            }
            AbstractC0329z.y(c0315s, c2751h6, c7);
            C2201e c2201e3 = AbstractC2349a.f19096d;
            if (c2201e3 == null) {
                C2200d c2200d2 = new C2200d("Filled.Favorite", false);
                int i6 = z.f18603a;
                M m6 = new M(i0.p.f17289b);
                C2202f c2202f2 = new C2202f(0);
                c2202f2.m(12.0f, 21.35f);
                c2202f2.l(-1.45f, -1.32f);
                c2202f2.f(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
                c2202f2.f(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
                c2202f2.g(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
                c2202f2.f(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
                c2202f2.f(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
                c2202f2.g(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
                c2202f2.k(12.0f, 21.35f);
                c2202f2.e();
                C2200d.a(c2200d2, c2202f2.f18548a, m6);
                c2201e3 = c2200d2.b();
                AbstractC2349a.f19096d = c2201e3;
            }
            long j6 = V3.a.f5985p;
            p C6 = AbstractC2107A.C(mVar, 1.0f);
            c0315s.X(-1123055827);
            boolean h4 = c0315s.h(context);
            Object M6 = c0315s.M();
            if (h4 || M6 == z5) {
                final int i7 = 1;
                M6 = new InterfaceC2015a() { // from class: S3.C
                    @Override // i4.InterfaceC2015a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                Context context2 = context;
                                kotlin.jvm.internal.l.f("screenScope", context2);
                                String packageName = context2.getPackageName();
                                kotlin.jvm.internal.l.c(packageName);
                                if (!AbstractC2227e.H0(packageName)) {
                                    String concat = "https://play.google.com/store/apps/details?id=".concat(packageName);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", "Check out this football companion: " + concat);
                                    Intent createChooser = Intent.createChooser(intent, "Share App");
                                    kotlin.jvm.internal.l.e("createChooser(...)", createChooser);
                                    context2.startActivity(createChooser);
                                }
                                break;
                            case 1:
                                Context context3 = context;
                                kotlin.jvm.internal.l.f("screenScope", context3);
                                String packageName2 = context3.getPackageName();
                                kotlin.jvm.internal.l.c(packageName2);
                                if (!AbstractC2227e.H0(packageName2)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW");
                                    intent2.setData(Uri.parse("market://details?id=".concat(packageName2)));
                                    if (intent2.resolveActivity(context3.getPackageManager()) == null) {
                                        intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(packageName2)));
                                    }
                                    context3.startActivity(intent2);
                                }
                                break;
                            default:
                                Context context4 = context;
                                kotlin.jvm.internal.l.f("screenScope", context4);
                                if (AbstractC2234l.x0("https://sites.google.com/view/hasan-ali-whcah/home", "http", false)) {
                                    String obj = AbstractC2227e.Q0("https://sites.google.com/view/hasan-ali-whcah/home").toString();
                                    if (obj.length() >= 4) {
                                        P.W w5 = new P.W(6);
                                        Intent intent3 = (Intent) w5.f4412l;
                                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                        intent3.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                                        G.v a72 = w5.a();
                                        Intent intent4 = (Intent) a72.f1749l;
                                        intent4.setPackage("com.android.chrome");
                                        intent4.setData(Uri.parse(obj));
                                        context4.startActivity(intent4, (Bundle) a72.f1750m);
                                    }
                                }
                                break;
                        }
                        return W3.o.f6046a;
                    }
                };
                c0315s.i0(M6);
            }
            c0315s.q(false);
            I(c2201e3, "Rate Us", "5-star review", "❤", j6, C6, (InterfaceC2015a) M6, c0315s, 28080);
            C2201e c2201e4 = AbstractC2036a.f17601m;
            if (c2201e4 == null) {
                C2200d c2200d3 = new C2200d("Filled.Info", false);
                int i8 = z.f18603a;
                M m7 = new M(i0.p.f17289b);
                C2202f c2202f3 = new C2202f(0);
                c2202f3.m(12.0f, 2.0f);
                c2202f3.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                c2202f3.o(4.48f, 10.0f, 10.0f, 10.0f);
                c2202f3.o(10.0f, -4.48f, 10.0f, -10.0f);
                c2202f3.n(17.52f, 2.0f, 12.0f, 2.0f);
                c2202f3.e();
                c2202f3.m(13.0f, 17.0f);
                c2202f3.j(-2.0f);
                c2202f3.r(-6.0f);
                c2202f3.j(2.0f);
                c2202f3.r(6.0f);
                c2202f3.e();
                c2202f3.m(13.0f, 9.0f);
                c2202f3.j(-2.0f);
                c2202f3.k(11.0f, 7.0f);
                c2202f3.j(2.0f);
                c2202f3.r(2.0f);
                c2202f3.e();
                C2200d.a(c2200d3, c2202f3.f18548a, m7);
                c2201e4 = c2200d3.b();
                AbstractC2036a.f17601m = c2201e4;
            }
            long j7 = V3.a.f5978h;
            p C7 = AbstractC2107A.C(mVar, 1.0f);
            c0315s.X(-1123042773);
            boolean h5 = c0315s.h(context);
            Object M7 = c0315s.M();
            if (h5 || M7 == z5) {
                final int i9 = 2;
                M7 = new InterfaceC2015a() { // from class: S3.C
                    @Override // i4.InterfaceC2015a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                Context context2 = context;
                                kotlin.jvm.internal.l.f("screenScope", context2);
                                String packageName = context2.getPackageName();
                                kotlin.jvm.internal.l.c(packageName);
                                if (!AbstractC2227e.H0(packageName)) {
                                    String concat = "https://play.google.com/store/apps/details?id=".concat(packageName);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", "Check out this football companion: " + concat);
                                    Intent createChooser = Intent.createChooser(intent, "Share App");
                                    kotlin.jvm.internal.l.e("createChooser(...)", createChooser);
                                    context2.startActivity(createChooser);
                                }
                                break;
                            case 1:
                                Context context3 = context;
                                kotlin.jvm.internal.l.f("screenScope", context3);
                                String packageName2 = context3.getPackageName();
                                kotlin.jvm.internal.l.c(packageName2);
                                if (!AbstractC2227e.H0(packageName2)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW");
                                    intent2.setData(Uri.parse("market://details?id=".concat(packageName2)));
                                    if (intent2.resolveActivity(context3.getPackageManager()) == null) {
                                        intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(packageName2)));
                                    }
                                    context3.startActivity(intent2);
                                }
                                break;
                            default:
                                Context context4 = context;
                                kotlin.jvm.internal.l.f("screenScope", context4);
                                if (AbstractC2234l.x0("https://sites.google.com/view/hasan-ali-whcah/home", "http", false)) {
                                    String obj = AbstractC2227e.Q0("https://sites.google.com/view/hasan-ali-whcah/home").toString();
                                    if (obj.length() >= 4) {
                                        P.W w5 = new P.W(6);
                                        Intent intent3 = (Intent) w5.f4412l;
                                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                        intent3.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                                        G.v a72 = w5.a();
                                        Intent intent4 = (Intent) a72.f1749l;
                                        intent4.setPackage("com.android.chrome");
                                        intent4.setData(Uri.parse(obj));
                                        context4.startActivity(intent4, (Bundle) a72.f1750m);
                                    }
                                }
                                break;
                        }
                        return W3.o.f6046a;
                    }
                };
                c0315s.i0(M7);
            }
            c0315s.q(false);
            I(c2201e4, "Privacy", "Data policy", "LEGAL", j7, C7, (InterfaceC2015a) M7, c0315s, 28080);
            c0315s.q(true);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0196a(i, 7, context);
        }
    }

    public static final Integer K(L0 l02, AbstractC0321v abstractC0321v, int i, int i5) {
        Integer K;
        while (true) {
            if (i >= i5) {
                return null;
            }
            int[] iArr = l02.f4332b;
            int i6 = iArr[(i * 5) + 3] + i;
            if (l02.j(i) && l02.i(i) == 206 && l.a(l02.p(iArr, i), AbstractC0317t.f4561e)) {
                Object h3 = l02.h(i, 0);
                C0308o c0308o = h3 instanceof C0308o ? (C0308o) h3 : null;
                if (c0308o != null && c0308o.f4493k.equals(abstractC0321v)) {
                    return Integer.valueOf(i);
                }
            }
            if (l02.d(i) && (K = K(l02, abstractC0321v, i + 1, i6)) != null) {
                return Integer.valueOf(K.intValue());
            }
            i = i6;
        }
    }

    public static final long L(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final C2201e M() {
        C2201e c2201e = f6358b;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.EmojiEvents", false);
        int i = z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(19.0f, 5.0f);
        c2202f.j(-2.0f);
        c2202f.q(3.0f);
        c2202f.i(7.0f);
        c2202f.r(2.0f);
        c2202f.i(5.0f);
        c2202f.f(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        c2202f.r(1.0f);
        c2202f.g(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        c2202f.g(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        c2202f.q(19.0f);
        c2202f.i(7.0f);
        c2202f.r(2.0f);
        c2202f.j(10.0f);
        c2202f.r(-2.0f);
        c2202f.j(-4.0f);
        c2202f.r(-3.1f);
        c2202f.g(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        c2202f.f(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        c2202f.q(7.0f);
        c2202f.f(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        c2202f.e();
        c2202f.m(5.0f, 8.0f);
        c2202f.q(7.0f);
        c2202f.j(2.0f);
        c2202f.r(3.82f);
        c2202f.f(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        c2202f.e();
        c2202f.m(19.0f, 8.0f);
        c2202f.g(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        c2202f.q(7.0f);
        c2202f.j(2.0f);
        c2202f.q(8.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f6358b = b3;
        return b3;
    }

    public static final C2201e N() {
        C2201e c2201e = f6360d;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Schedule", false);
        int i = z.f18603a;
        long j5 = i0.p.f17289b;
        M m5 = new M(j5);
        C2202f c2202f = new C2202f(0);
        c2202f.m(11.99f, 2.0f);
        c2202f.f(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c2202f.o(4.47f, 10.0f, 9.99f, 10.0f);
        c2202f.f(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        c2202f.n(17.52f, 2.0f, 11.99f, 2.0f);
        c2202f.e();
        c2202f.m(12.0f, 20.0f);
        c2202f.g(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        c2202f.o(3.58f, -8.0f, 8.0f, -8.0f);
        c2202f.o(8.0f, 3.58f, 8.0f, 8.0f);
        c2202f.o(-3.58f, 8.0f, -8.0f, 8.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        M m6 = new M(j5);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2209m(12.5f, 7.0f));
        arrayList.add(new C2207k(11.0f));
        arrayList.add(new o0.s(6.0f));
        arrayList.add(new C2213q(5.25f, 3.15f));
        arrayList.add(new C2213q(0.75f, -1.23f));
        arrayList.add(new C2213q(-4.5f, -2.67f));
        arrayList.add(C2205i.f18558b);
        C2200d.a(c2200d, arrayList, m6);
        C2201e b3 = c2200d.b();
        f6360d = b3;
        return b3;
    }

    public static final C2201e O() {
        C2201e c2201e = f6361e;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Timeline", false);
        int i = z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(23.0f, 8.0f);
        c2202f.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c2202f.g(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        c2202f.l(-3.56f, 3.55f);
        c2202f.f(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        c2202f.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c2202f.o(-2.0f, -0.9f, -2.0f, -2.0f);
        c2202f.g(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        c2202f.l(-2.55f, -2.55f);
        c2202f.f(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        c2202f.o(-0.36f, -0.02f, -0.52f, -0.07f);
        c2202f.l(-4.55f, 4.56f);
        c2202f.f(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        c2202f.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c2202f.o(-2.0f, -0.9f, -2.0f, -2.0f);
        c2202f.o(0.9f, -2.0f, 2.0f, -2.0f);
        c2202f.g(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        c2202f.l(4.56f, -4.55f);
        c2202f.f(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        c2202f.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        c2202f.o(2.0f, 0.9f, 2.0f, 2.0f);
        c2202f.g(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        c2202f.l(2.55f, 2.55f);
        c2202f.f(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        c2202f.o(0.36f, 0.02f, 0.52f, 0.07f);
        c2202f.l(3.55f, -3.56f);
        c2202f.f(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        c2202f.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        c2202f.n(23.0f, 6.9f, 23.0f, 8.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f6361e = b3;
        return b3;
    }

    public static final void P(int i, C0315s c0315s) {
        C0315s c0315s2;
        c0315s.Z(-117244486);
        if (i == 0 && c0315s.B()) {
            c0315s.S();
            c0315s2 = c0315s;
        } else {
            c0315s2 = c0315s;
            p0.a(c.b(m.f7161k, 1.0f), j.f5218a, V3.a.f5990u, 6, 14, AbstractC2527w.a(1, i0.p.b(0.5f, V3.a.f5995z)), c0.f5469g, c0315s2, 14377398, 8);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new A(i, 29);
        }
    }

    public static final void Q(InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        l.f("onStart", interfaceC2015a);
        c0315s.Z(838353943);
        if ((((c0315s.h(interfaceC2015a) ? 4 : 2) | i) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            j.d(null, X.e.d(948483759, new C0419w(1, interfaceC2015a, (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b)), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0196a(i, 6, interfaceC2015a);
        }
    }

    public static final boolean R(O o5, boolean z3) {
        InterfaceC2637x c5;
        E.Z z5 = o5.f2426d;
        if (z5 == null || (c5 = z5.c()) == null) {
            return false;
        }
        C1989c P5 = G4.l.P(c5);
        long i = o5.i(z3);
        float d5 = C1988b.d(i);
        if (P5.f17193a > d5 || d5 > P5.f17195c) {
            return false;
        }
        float e3 = C1988b.e(i);
        return P5.f17194b <= e3 && e3 <= P5.f17196d;
    }

    public static boolean S(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    public static final long T(float f, long j5) {
        return (Float.isNaN(f) || f >= 1.0f) ? j5 : i0.p.b(i0.p.d(j5) * f, j5);
    }

    public static final void U(int i, long j5, C0315s c0315s, p pVar, String str, String str2, C2201e c2201e) {
        c0315s.Z(-171027680);
        int i5 = (c0315s.f(c2201e) ? 4 : 2) | i | (c0315s.f(pVar) ? 16384 : 8192);
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(pVar, j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, i0.p.b(0.35f, V3.a.f5995z)), X.e.d(502551739, new C0405h(j5, str, str2, c2201e, 2), c0315s), c0315s, ((i5 >> 12) & 14) | 14377392, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0399b(c2201e, str, str2, j5, pVar, i);
        }
    }

    public static boolean V(Parcel parcel, int i) {
        i0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder W(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + Z4);
        return readStrongBinder;
    }

    public static int X(Parcel parcel, int i) {
        i0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long Y(Parcel parcel, int i) {
        i0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int Z(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void a(t0 t0Var, p pVar, i4.c cVar, b0.h hVar, i4.c cVar2, X.d dVar, C0315s c0315s, int i) {
        int i5;
        i4.c cVar3;
        C2400l c2400l;
        Z.p pVar2;
        C0315s c0315s2;
        C2400l c2400l2;
        int i6;
        i4.c cVar4 = cVar;
        c0315s.Z(-114689412);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(t0Var) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(cVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.f(hVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= c0315s.h(cVar2) ? 16384 : 8192;
        }
        X.d dVar2 = dVar;
        if ((196608 & i) == 0) {
            i5 |= c0315s.h(dVar2) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && c0315s.B()) {
            c0315s.S();
            cVar3 = cVar4;
            c0315s2 = c0315s;
        } else {
            p pVar3 = m.f7161k;
            int i7 = i5 & 14;
            boolean z3 = i7 == 4;
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (z3 || M5 == obj) {
                M5 = new C2400l(t0Var, hVar);
                c0315s.i0(M5);
            }
            C2400l c2400l3 = (C2400l) M5;
            boolean z5 = i7 == 4;
            Object M6 = c0315s.M();
            if (z5 || M6 == obj) {
                Object[] objArr = {t0Var.f19937a.e()};
                Z.p pVar4 = new Z.p();
                pVar4.addAll(X3.l.J0(objArr));
                c0315s.i0(pVar4);
                M6 = pVar4;
            }
            Z.p pVar5 = (Z.p) M6;
            boolean z6 = i7 == 4;
            Object M7 = c0315s.M();
            if (z6 || M7 == obj) {
                long[] jArr = r.O.f18957a;
                M7 = new C2321G();
                c0315s.i0(M7);
            }
            C2321G c2321g = (C2321G) M7;
            boolean contains = pVar5.contains(t0Var.f19937a.e());
            J2.a aVar = t0Var.f19937a;
            if (!contains) {
                pVar5.clear();
                pVar5.add(aVar.e());
            }
            Object e3 = aVar.e();
            C0305m0 c0305m0 = t0Var.f19940d;
            if (l.a(e3, c0305m0.getValue())) {
                if (pVar5.size() != 1 || !l.a(pVar5.get(0), aVar.e())) {
                    pVar5.clear();
                    pVar5.add(aVar.e());
                }
                if (c2321g.f18932e != 1 || c2321g.c(aVar.e())) {
                    c2321g.a();
                }
                c2400l3.f19386b = hVar;
            }
            if (!l.a(aVar.e(), c0305m0.getValue()) && !pVar5.contains(c0305m0.getValue())) {
                ListIterator listIterator = pVar5.listIterator();
                int i8 = 0;
                while (true) {
                    Y3.a aVar2 = (Y3.a) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!aVar2.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    Object c5 = cVar2.c(aVar2.next());
                    int i9 = i8;
                    if (l.a(c5, cVar2.c(c0305m0.getValue()))) {
                        i6 = i9;
                        break;
                    } else {
                        i8 = i9 + 1;
                        listIterator = listIterator2;
                    }
                }
                if (i6 == -1) {
                    pVar5.add(c0305m0.getValue());
                } else {
                    pVar5.set(i6, c0305m0.getValue());
                }
            }
            if (c2321g.c(c0305m0.getValue()) && c2321g.c(aVar.e())) {
                c0315s.X(915535767);
                c0315s.q(false);
                cVar3 = cVar4;
                c2400l = c2400l3;
            } else {
                c0315s.X(912931457);
                c2321g.a();
                int size = pVar5.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = pVar5.get(i10);
                    c2321g.m(obj2, X.e.d(885640742, new C2391c(t0Var, obj2, cVar4, c2400l3, pVar5, dVar2), c0315s));
                    i10++;
                    cVar4 = cVar4;
                    dVar2 = dVar;
                }
                cVar3 = cVar4;
                c2400l = c2400l3;
                c0315s.q(false);
            }
            boolean f = c0315s.f(t0Var.f()) | c0315s.f(c2400l);
            Object M8 = c0315s.M();
            if (f || M8 == obj) {
                M8 = (u) cVar3.c(c2400l);
                c0315s.i0(M8);
            }
            u uVar = (u) M8;
            c2400l.getClass();
            boolean f5 = c0315s.f(c2400l);
            Object M9 = c0315s.M();
            if (f5 || M9 == obj) {
                M9 = AbstractC0329z.t(Boolean.FALSE);
                c0315s.i0(M9);
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M9;
            InterfaceC0289e0 w5 = AbstractC0329z.w(uVar.f19414d, c0315s);
            t0 t0Var2 = c2400l.f19385a;
            if (l.a(t0Var2.f19937a.e(), t0Var2.f19940d.getValue())) {
                interfaceC0289e0.setValue(Boolean.FALSE);
            } else if (w5.getValue() != null) {
                interfaceC0289e0.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC0289e0.getValue()).booleanValue()) {
                c0315s.X(249037309);
                A0 a02 = B0.f19651h;
                C2400l c2400l4 = c2400l;
                t0 t0Var3 = c2400l4.f19385a;
                pVar2 = pVar5;
                c2400l2 = c2400l4;
                c0315s2 = c0315s;
                o0 a5 = y0.a(t0Var3, a02, null, c0315s2, 0, 2);
                boolean f6 = c0315s2.f(a5);
                Object M10 = c0315s2.M();
                if (f6 || M10 == obj) {
                    M10 = o(pVar3).c(new C2399k(c2400l2, a5, w5));
                    c0315s2.i0(M10);
                }
                pVar3 = (p) M10;
                c0315s2.q(false);
            } else {
                pVar2 = pVar5;
                c0315s2 = c0315s;
                c2400l2 = c2400l;
                c0315s2.X(249353726);
                c0315s2.q(false);
            }
            p c6 = pVar.c(pVar3);
            Object M11 = c0315s2.M();
            if (M11 == obj) {
                M11 = new C2395g(c2400l2);
                c0315s2.i0(M11);
            }
            C2395g c2395g = (C2395g) M11;
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            p c7 = b0.a.c(c0315s2, c6);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, C2752i.f21833e, c2395g);
            AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s2.f4530S || !l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h);
            }
            AbstractC0329z.y(c0315s2, C2752i.f21831c, c7);
            c0315s2.X(-1491001814);
            int size2 = pVar2.size();
            int i11 = 0;
            while (i11 < size2) {
                Z.p pVar6 = pVar2;
                Object obj3 = pVar6.get(i11);
                c0315s2.T(1908315325, 0, cVar2.c(obj3), null);
                i4.e eVar = (i4.e) c2321g.g(obj3);
                if (eVar == null) {
                    c0315s2.X(-971711888);
                } else {
                    c0315s2.X(1908317105);
                    eVar.invoke(c0315s2, 0);
                }
                c0315s2.q(false);
                c0315s2.q(false);
                i11++;
                pVar2 = pVar6;
            }
            c0315s2.q(false);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C2392d(t0Var, pVar, cVar3, hVar, cVar2, dVar, i);
        }
    }

    public static final Object a0(InterfaceC2755l interfaceC2755l, C1989c c1989c, AbstractC0542c abstractC0542c) {
        C.a aVar;
        Object A3;
        boolean z3 = ((o) interfaceC2755l).f7162k.f7175x;
        W3.o oVar = W3.o.f6046a;
        if (z3) {
            e0 u5 = AbstractC2749f.u(interfaceC2755l);
            if (((o) interfaceC2755l).f7162k.f7175x) {
                C.a aVar2 = (C.a) AbstractC2749f.j(interfaceC2755l, i.f797A);
                if (aVar2 == null) {
                    aVar2 = new C.j(interfaceC2755l);
                }
                aVar = aVar2;
            } else {
                aVar = null;
            }
            if (aVar != null && (A3 = aVar.A(u5, new C0060u(2, c1989c, u5), abstractC0542c)) == EnumC0510a.f7289k) {
                return A3;
            }
        }
        return oVar;
    }

    public static final long b(int i, int i5) {
        return (i5 & 4294967295L) | (i << 32);
    }

    public static void b0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Z(parcel, i));
    }

    public static final void c(C0140k c0140k, Y.d dVar, X.d dVar2, C0315s c0315s, int i) {
        c0315s.Z(-1579360880);
        if ((((c0315s.h(c0140k) ? 4 : 2) | i | (c0315s.h(dVar) ? 32 : 16)) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC0329z.b(new C0322v0[]{E1.a.f1396a.a(c0140k), B1.i.f751a.a(c0140k), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(c0140k)}, X.e.d(-52928304, new C0022e0(6, dVar, dVar2), c0315s), c0315s, 56);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0019d0(c0140k, dVar, dVar2, i, 3);
        }
    }

    public static C2060b c0(C2062d c2062d, int i) {
        l.f("<this>", c2062d);
        boolean z3 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z3) {
            if (c2062d.f17853m <= 0) {
                i = -i;
            }
            return new C2060b(c2062d.f17851k, c2062d.f17852l, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final long d(float f, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long d0(long j5) {
        return (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32);
    }

    public static final void e(boolean z3, V0.j jVar, O o5, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-1344558920);
        if ((i & 6) == 0) {
            i5 = (c0315s.g(z3) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(o5) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            int i6 = i5 & 14;
            boolean f = (i6 == 4) | c0315s.f(o5);
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (f || M5 == obj) {
                M5 = new N(o5, z3);
                c0315s.i0(M5);
            }
            InterfaceC0104i0 interfaceC0104i0 = (InterfaceC0104i0) M5;
            boolean h3 = c0315s.h(o5) | (i6 == 4);
            Object M6 = c0315s.M();
            if (h3 || M6 == obj) {
                M6 = new P(o5, z3);
                c0315s.i0(M6);
            }
            InterfaceC0159l interfaceC0159l = (InterfaceC0159l) M6;
            boolean f5 = K0.N.f(o5.j().f4680b);
            boolean h4 = c0315s.h(interfaceC0104i0);
            Object M7 = c0315s.M();
            if (h4 || M7 == obj) {
                M7 = new Q(interfaceC0104i0, null);
                c0315s.i0(M7);
            }
            AbstractC2036a.b(interfaceC0159l, z3, jVar, f5, 0L, new SuspendPointerInputElement(interfaceC0104i0, null, new t0.z((i4.e) M7), 6), c0315s, (i5 << 3) & 1008);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0153f(z3, jVar, o5, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [J2.a, a0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList e0(L0 l02, int i, Integer num) {
        ?? c0452h = new C0452h(l02);
        int q5 = l02.q(i);
        C0280a a5 = l02.a(i);
        while (i >= 0) {
            c0452h.g(l02.f4331a.h(i), num);
            if (q5 >= 0) {
                C0280a c0280a = a5;
                a5 = l02.a(q5);
                i = q5;
                q5 = l02.q(q5);
                num = c0280a;
            } else {
                i = q5;
                num = a5;
            }
        }
        return (ArrayList) c0452h.f2693a;
    }

    public static void f(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static C2062d f0(int i, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new C2062d(i, i5 - 1, 1);
        }
        C2062d c2062d = C2062d.f17858n;
        return C2062d.f17858n;
    }

    public static final void g(Y.d dVar, X.d dVar2, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(1211832233);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(dVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(dVar2) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.Y(1729797275);
            Y a5 = E1.a.a(c0315s);
            if (a5 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            S N5 = G4.d.N(x.a(C0146a.class), a5, null, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            c0315s.q(false);
            C0146a c0146a = (C0146a) N5;
            c0146a.f2210c = new WeakReference(dVar);
            dVar.b(c0146a.f2209b, dVar2, c0315s, ((i5 << 6) & 896) | (i5 & 112));
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0106k(i, 1, dVar, dVar2);
        }
    }

    public static int g0(Parcel parcel) {
        int readInt = parcel.readInt();
        int Z4 = Z(parcel, readInt);
        char c5 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c5 != 20293) {
            throw new e("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = Z4 + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new e(L1.a.k(dataPosition, i, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static final void h(k kVar, Object obj, int i, Object obj2, C0315s c0315s, int i5) {
        int i6;
        c0315s.Z(1439843069);
        if ((i5 & 6) == 0) {
            i6 = (c0315s.f(kVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c0315s.f(obj) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c0315s.d(i) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c0315s.f(obj2) ? 2048 : 1024;
        }
        if ((i6 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            ((Y.c) obj).b(obj2, X.e.d(980966366, new A.j(i, kVar, obj2), c0315s), c0315s, 48);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new r(kVar, obj, i, obj2, i5);
        }
    }

    public static WindowManager.LayoutParams h0() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) Q2.r.f5053d.f5056c.a(F7.F7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [J2.a, a0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [P.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List i(P0 p02, Integer num, int i, Integer num2) {
        int i5;
        C2316B c2316b;
        if (p02.f4386w || p02.p() == 0) {
            return v.f6090k;
        }
        ?? c0452h = new C0452h(p02);
        if (num2 != null) {
            i5 = num2.intValue();
        } else {
            i5 = p02.f4385v;
            if (i5 < 0) {
                i5 = p02.D(p02.f4367b, i);
            }
        }
        if (num == 0) {
            int M5 = p02.i - p02.M(p02.f4367b, p02.r(i));
            C2343v c2343v = p02.f4382s;
            num = Integer.valueOf(M5 + ((c2343v == null || (c2316b = (C2316B) c2343v.b(i)) == null) ? 0 : c2316b.f18905b));
        }
        while (i >= 0) {
            c0452h.g(p02.N(i), num);
            num = p02.b(i);
            if (i5 >= 0) {
                int i6 = i5;
                i5 = p02.D(p02.f4367b, i5);
                i = i6;
            } else {
                i = i5;
            }
        }
        return (ArrayList) c0452h.f2693a;
    }

    public static void i0(Parcel parcel, int i, int i5) {
        int Z4 = Z(parcel, i);
        if (Z4 == i5) {
            return;
        }
        throw new e(AbstractC2107A.u(AbstractC2107A.w("Expected size ", i5, " got ", Z4, " (0x"), Integer.toHexString(Z4), ")"), parcel);
    }

    public static void j(long j5, C0226i c0226i, int i, ArrayList arrayList, int i5, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        ArrayList arrayList3;
        long j6;
        int i9;
        int i10 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i5 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i5; i11 < i6; i11++) {
            if (((C0229l) arrayList4.get(i11)).c() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0229l c0229l = (C0229l) arrayList.get(i5);
        C0229l c0229l2 = (C0229l) arrayList4.get(i6 - 1);
        if (i10 == c0229l.c()) {
            int intValue = ((Number) arrayList5.get(i5)).intValue();
            int i12 = i5 + 1;
            C0229l c0229l3 = (C0229l) arrayList4.get(i12);
            i7 = i12;
            i8 = intValue;
            c0229l = c0229l3;
        } else {
            i7 = i5;
            i8 = -1;
        }
        if (c0229l.h(i10) == c0229l2.h(i10)) {
            int min = Math.min(c0229l.c(), c0229l2.c());
            int i13 = 0;
            for (int i14 = i10; i14 < min && c0229l.h(i14) == c0229l2.h(i14); i14++) {
                i13++;
            }
            long j7 = 4;
            long j8 = (c0226i.f3091l / j7) + j5 + 2 + i13 + 1;
            c0226i.S(-i13);
            c0226i.S(i8);
            int i15 = i10 + i13;
            while (i10 < i15) {
                c0226i.S(c0229l.h(i10) & 255);
                i10++;
            }
            if (i7 + 1 == i6) {
                if (i15 != ((C0229l) arrayList4.get(i7)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0226i.S(((Number) arrayList5.get(i7)).intValue());
                return;
            } else {
                C0226i c0226i2 = new C0226i();
                c0226i.S(((int) ((c0226i2.f3091l / j7) + j8)) * (-1));
                j(j8, c0226i2, i15, arrayList4, i7, i6, arrayList5);
                c0226i.O(c0226i2);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i7 + 1; i17 < i6; i17++) {
            if (((C0229l) arrayList4.get(i17 - 1)).h(i10) != ((C0229l) arrayList4.get(i17)).h(i10)) {
                i16++;
            }
        }
        long j9 = 4;
        long j10 = (c0226i.f3091l / j9) + j5 + 2 + (i16 * 2);
        c0226i.S(i16);
        c0226i.S(i8);
        for (int i18 = i7; i18 < i6; i18++) {
            int h3 = ((C0229l) arrayList4.get(i18)).h(i10);
            if (i18 == i7 || h3 != ((C0229l) arrayList4.get(i18 - 1)).h(i10)) {
                c0226i.S(h3 & 255);
            }
        }
        C0226i c0226i3 = new C0226i();
        int i19 = i7;
        while (i19 < i6) {
            byte h4 = ((C0229l) arrayList4.get(i19)).h(i10);
            int i20 = i19 + 1;
            int i21 = i20;
            while (true) {
                if (i21 >= i6) {
                    i21 = i6;
                    break;
                } else if (h4 != ((C0229l) arrayList4.get(i21)).h(i10)) {
                    break;
                } else {
                    i21++;
                }
            }
            if (i20 == i21 && i10 + 1 == ((C0229l) arrayList4.get(i19)).c()) {
                c0226i.S(((Number) arrayList5.get(i19)).intValue());
                arrayList3 = arrayList5;
                j6 = j10;
                i9 = i21;
            } else {
                c0226i.S(((int) ((c0226i3.f3091l / j9) + j10)) * (-1));
                arrayList3 = arrayList5;
                j6 = j10;
                i9 = i21;
                j(j6, c0226i3, i10 + 1, arrayList, i19, i9, arrayList3);
                arrayList4 = arrayList;
            }
            j10 = j6;
            i19 = i9;
            arrayList5 = arrayList3;
        }
        c0226i.O(c0226i3);
    }

    public static JSONObject j0(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e3) {
            e = e3;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                C0379q c0379q = C0379q.f;
                jSONObject3.put("x", c0379q.f5048a.d(context, i));
                jSONObject3.put("y", c0379q.f5048a.d(context, point2.y));
                jSONObject3.put("start_x", c0379q.f5048a.d(context, point.x));
                jSONObject3.put("start_y", c0379q.f5048a.d(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e5) {
                U2.j.g("Error occurred while putting signals into JSON object.", e5);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e6) {
            e = e6;
            jSONObject2 = jSONObject;
            U2.j.g("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static void k(int i) {
        if (2 > i || i >= 37) {
            StringBuilder v4 = AbstractC2107A.v(i, "radix ", " was not in valid range ");
            v4.append(new C2062d(2, 36, 1));
            throw new IllegalArgumentException(v4.toString());
        }
    }

    public static JSONObject k0(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        int[] iArr;
        JSONObject jSONObject;
        String str2 = "ad_view";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            C0379q c0379q = C0379q.f;
                            U2.e eVar = c0379q.f5048a;
                            U2.e eVar2 = c0379q.f5048a;
                            jSONObject4.put("width", eVar.d(context, measuredWidth));
                            jSONObject4.put("height", eVar2.d(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", eVar2.d(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", eVar2.d(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", str2);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = q0(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", eVar2.d(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", eVar2.d(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", str2);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                A7 a7 = F7.A7;
                                Q2.r rVar = Q2.r.f5053d;
                                D7 d7 = rVar.f5056c;
                                D7 d72 = rVar.f5056c;
                                if (((Boolean) d7.a(a7)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) d72.a(F7.B7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", r0(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", r0(layoutParams.height) - 1);
                                }
                                if (((Boolean) d72.a(F7.C7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str2;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    U2.j.i("Unable to get asset views information");
                                    it = it2;
                                    str2 = str;
                                    iArr2 = iArr;
                                    i = 2;
                                }
                            } else {
                                str = str2;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str2;
                        iArr = iArr2;
                    }
                    it = it2;
                    str2 = str;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static void l(int i, int i5, int i6) {
        if (i < 0 || i5 > i6) {
            StringBuilder w5 = AbstractC2107A.w("fromIndex: ", i, ", toIndex: ", i5, ", size: ");
            w5.append(i6);
            throw new IndexOutOfBoundsException(w5.toString());
        }
        if (i > i5) {
            throw new IllegalArgumentException(L1.a.k(i, i5, "fromIndex: ", " > toIndex: "));
        }
    }

    public static JSONObject l0(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                L l5 = P2.o.f4767B.f4771c;
                jSONObject.put("can_show_on_lock_screen", L.D(view));
                boolean z3 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z3 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z3);
                return jSONObject;
            } catch (JSONException unused) {
                U2.j.i("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static int m(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new d1.l(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static JSONObject m0(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z7)).booleanValue()) {
                    L l5 = P2.o.f4767B.f4771c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                L l6 = P2.o.f4767B.f4771c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    r2 = false;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static final p n(p pVar, J j5) {
        return androidx.compose.ui.graphics.a.c(pVar, 0.0f, 0.0f, j5, 518143);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(9:4|5|(5:8|9|10|11|6)|57|58|59|60|(1:62)(1:65)|63)|14|(7:49|50|17|18|19|20|(8:22|(6:26|27|(2:29|(1:31)(1:40))(1:41)|32|33|(2:35|36))|42|27|(0)(0)|32|33|(0))(8:43|(6:45|27|(0)(0)|32|33|(0))|42|27|(0)(0)|32|33|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        U2.j.g("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c A[Catch: JSONException -> 0x0145, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0145, blocks: (B:19:0x0114, B:31:0x0141, B:40:0x0147, B:41:0x014c), top: B:18:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject n0(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i5;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i6 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i6;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i]);
                        parent2 = parent2.getParent();
                        i6 = i;
                    } catch (Exception unused) {
                        U2.j.i("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i6;
                JSONObject jSONObject3 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C0379q c0379q = C0379q.f;
                U2.e eVar = c0379q.f5048a;
                U2.e eVar2 = c0379q.f5048a;
                jSONObject3.put("width", eVar.d(context, measuredWidth));
                jSONObject3.put("height", eVar2.d(context, view.getMeasuredHeight()));
                jSONObject3.put("x", eVar2.d(context, iArr[0]));
                jSONObject3.put("y", eVar2.d(context, iArr[i]));
                jSONObject3.put("maximum_visible_width", eVar2.d(context, iArr2[0]));
                jSONObject3.put("maximum_visible_height", eVar2.d(context, iArr2[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = q0(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", eVar2.d(context, iArr[0]));
                    jSONObject4.put("y", eVar2.d(context, iArr[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i6;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                } catch (IllegalAccessException e3) {
                    e = e3;
                    U2.j.g("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e5) {
                    e = e5;
                    U2.j.g("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e6) {
                    e = e6;
                    U2.j.g("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i5 = i;
                        if (i5 != 0) {
                            jSONObject2.put("native_template_type", i);
                        } else if (i5 != i) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.B7)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject2.put("view_width_layout_type", r0(layoutParams.width) - 1);
                                jSONObject2.put("view_height_layout_type", r0(layoutParams.height) - 1);
                            } catch (Exception unused4) {
                                G.m("Unable to get native ad view layout types");
                            }
                        }
                    }
                    i5 = -1;
                    if (i5 != 0) {
                    }
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.B7)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i5 = 0;
                        if (i5 != 0) {
                        }
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.B7)).booleanValue()) {
                        }
                    }
                    i5 = -1;
                    if (i5 != 0) {
                    }
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.B7)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static final p o(p pVar) {
        return androidx.compose.ui.graphics.a.c(pVar, 0.0f, 0.0f, null, 520191);
    }

    public static boolean o0(Context context, Lq lq) {
        AbstractC1715vu abstractC1715vu;
        if (!lq.f10476N) {
            return false;
        }
        A7 a7 = F7.D7;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        D7 d7 = rVar.f5056c;
        if (booleanValue) {
            return ((Boolean) d7.a(F7.G7)).booleanValue();
        }
        String str = (String) d7.a(F7.E7);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        Hq e3 = Hq.e(new C1221ku(';'));
        Iterator c5 = ((InterfaceC1760wu) e3.f9491l).c(e3, str);
        do {
            abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return false;
            }
        } while (!((String) abstractC1715vu.next()).equals(packageName));
        return true;
    }

    public static final void p(Closeable closeable, Throwable th) {
        try {
            closeable.close();
        } catch (Throwable th2) {
            AbstractC2425d.j(th, th2);
        }
    }

    public static boolean p0(int i) {
        A7 a7 = F7.f8897s3;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            return ((Boolean) rVar.f5056c.a(F7.f8903t3)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static float q(float f, float f5) {
        return f > f5 ? f5 : f;
    }

    public static JSONObject q0(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        C0379q c0379q = C0379q.f;
        jSONObject.put("width", c0379q.f5048a.d(context, i));
        int i5 = rect.bottom - rect.top;
        U2.e eVar = c0379q.f5048a;
        jSONObject.put("height", eVar.d(context, i5));
        jSONObject.put("x", eVar.d(context, rect.left));
        jSONObject.put("y", eVar.d(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static double r(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + '.');
    }

    public static int r0(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static float s(float f, float f5, float f6) {
        if (f5 <= f6) {
            return f < f5 ? f5 : f > f6 ? f6 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + '.');
    }

    public static int t(int i, int i5, int i6) {
        if (i5 <= i6) {
            return i < i5 ? i5 : i > i6 ? i6 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + '.');
    }

    public static long u(long j5, long j6, long j7) {
        if (j6 <= j7) {
            return j5 < j6 ? j6 : j5 > j7 ? j7 : j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + '.');
    }

    public static Comparable v(Float f, C2059a c2059a) {
        float f5 = c2059a.f17849a;
        float f6 = c2059a.f17850b;
        if (f5 <= f6) {
            return (!C2059a.a(f, Float.valueOf(f5)) || C2059a.a(Float.valueOf(f5), f)) ? (!C2059a.a(Float.valueOf(f6), f) || C2059a.a(f, Float.valueOf(f6))) ? f : Float.valueOf(f6) : Float.valueOf(f5);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c2059a + '.');
    }

    public static final boolean w(C1989c c1989c, float f, float f5) {
        return f <= c1989c.f17195c && c1989c.f17193a <= f && f5 <= c1989c.f17196d && c1989c.f17194b <= f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (v.AbstractC2528x.c(r9, r1, kotlin.jvm.internal.l.a(r7, r2) ? r0.getWidth() : H2.e.d(r7.f1536a, r8), kotlin.jvm.internal.l.a(r7, r2) ? r0.getHeight() : H2.e.d(r7.f1537b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap x(Drawable drawable, Bitmap.Config config, F2.h hVar, F2.g gVar, boolean z3) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || AbstractC2425d.z(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z3) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    F2.h hVar2 = F2.h.f1535c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config config2 = H2.e.f2284a;
        boolean z5 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z5 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z5 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        int i = intrinsicHeight > 0 ? intrinsicHeight : 512;
        F2.h hVar3 = F2.h.f1535c;
        double c5 = AbstractC2528x.c(intrinsicWidth, i, l.a(hVar, hVar3) ? intrinsicWidth : H2.e.d(hVar.f1536a, gVar), l.a(hVar, hVar3) ? i : H2.e.d(hVar.f1537b, gVar), gVar);
        int T4 = AbstractC2036a.T(intrinsicWidth * c5);
        int T5 = AbstractC2036a.T(c5 * i);
        if (config == null || AbstractC2425d.z(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(T4, T5, config);
        Rect bounds = mutate.getBounds();
        int i5 = bounds.left;
        int i6 = bounds.top;
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        mutate.setBounds(0, 0, T4, T5);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i5, i6, i7, i8);
        return createBitmap;
    }

    public static Bundle y(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Z4);
        return readBundle;
    }

    public static byte[] z(Parcel parcel, int i) {
        int Z4 = Z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Z4 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Z4);
        return createByteArray;
    }
}
