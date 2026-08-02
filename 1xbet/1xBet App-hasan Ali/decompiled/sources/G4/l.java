package G4;

import A.C0003c;
import A.C0004d;
import A.C0005e;
import A.E;
import A.q;
import A0.AbstractC0015c;
import A0.I0;
import B.C0083l;
import M.AbstractC0251w;
import M.C0249u;
import M.e0;
import M.p0;
import M.u0;
import M.v0;
import P.AbstractC0317t;
import P.AbstractC0329z;
import P.C;
import P.C0299j0;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.C0328y0;
import P.H;
import P.InterfaceC0284c;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.L0;
import P.P0;
import P.U;
import P.V0;
import P.Z;
import P.d1;
import P.e1;
import Q2.r;
import R3.o;
import R3.t;
import S3.L;
import a.AbstractC0444a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0491u;
import c.InterfaceC0520G;
import com.google.android.gms.internal.ads.C1221ku;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.Ot;
import com.google.android.gms.internal.ads.Pt;
import com.google.android.gms.internal.ads.Qt;
import d.C1902b;
import e.C1919b;
import e2.C1930k;
import h0.C1989c;
import i0.M;
import i0.p;
import i0.u;
import i4.InterfaceC2015a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k3.InterfaceC2035c;
import k4.AbstractC2036a;
import m4.InterfaceC2104g;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.z;
import o4.AbstractC2227e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.InterfaceC2280u;
import r0.AbstractC2346c;
import v.AbstractC2527w;
import v.w0;
import x.C2592m;
import x.P;
import x0.InterfaceC2637x;
import x0.O;
import x0.f0;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2681E;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z.InterfaceC2704f;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static C2201e f2009a;

    /* renamed from: b, reason: collision with root package name */
    public static C2201e f2010b;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f2011c;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f2012d;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f2013e;

    public l() {
        new ConcurrentHashMap();
    }

    public static final int A(int i, int i5, int i6) {
        if (i6 > 0) {
            if (i < i5) {
                int i7 = i5 % i6;
                if (i7 < 0) {
                    i7 += i6;
                }
                int i8 = i % i6;
                if (i8 < 0) {
                    i8 += i6;
                }
                int i9 = (i7 - i8) % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                return i5 - i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i5) {
                int i10 = -i6;
                int i11 = i % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i5 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i5;
            }
        }
        return i5;
    }

    public static final C2201e B() {
        C2201e c2201e = f2012d;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Public", false);
        int i = z.f18603a;
        M m5 = new M(p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 2.0f);
        c2202f.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c2202f.o(4.48f, 10.0f, 10.0f, 10.0f);
        c2202f.o(10.0f, -4.48f, 10.0f, -10.0f);
        c2202f.n(17.52f, 2.0f, 12.0f, 2.0f);
        c2202f.e();
        c2202f.m(11.0f, 19.93f);
        c2202f.g(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        c2202f.g(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        c2202f.k(9.0f, 15.0f);
        c2202f.r(1.0f);
        c2202f.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c2202f.r(1.93f);
        c2202f.e();
        c2202f.m(17.9f, 17.39f);
        c2202f.g(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        c2202f.j(-1.0f);
        c2202f.r(-3.0f);
        c2202f.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c2202f.k(8.0f, 12.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c2202f.k(11.0f, 7.0f);
        c2202f.j(2.0f);
        c2202f.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c2202f.r(-0.41f);
        c2202f.g(2.93f, 1.19f, 5.0f, 4.06f, 5.0f, 7.41f);
        c2202f.g(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f2012d = b3;
        return b3;
    }

    public static final Bundle C(String str, Bundle bundle) {
        kotlin.jvm.internal.l.f("key", str);
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(L1.a.n("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final C2201e D() {
        C2201e c2201e = f2013e;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Stadium", false);
        int i = z.f18603a;
        M m5 = new M(p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(7.0f, 5.0f);
        c2202f.k(3.0f, 7.0f);
        c2202f.q(3.0f);
        c2202f.k(7.0f, 5.0f);
        c2202f.e();
        c2202f.m(18.0f, 3.0f);
        c2202f.r(4.0f);
        c2202f.l(4.0f, -2.0f);
        c2202f.k(18.0f, 3.0f);
        c2202f.e();
        c2202f.m(11.0f, 2.0f);
        c2202f.r(4.0f);
        c2202f.l(4.0f, -2.0f);
        c2202f.k(11.0f, 2.0f);
        c2202f.e();
        c2202f.m(5.0f, 10.04f);
        c2202f.f(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f);
        c2202f.o(5.62f, -0.47f, 7.0f, -0.96f);
        c2202f.f(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f);
        c2202f.n(5.0f, 9.86f, 5.0f, 10.04f);
        c2202f.e();
        c2202f.m(15.0f, 17.0f);
        c2202f.i(9.0f);
        c2202f.l(0.0f, 4.88f);
        c2202f.f(4.94f, 21.49f, 2.0f, 20.34f, 2.0f, 19.0f);
        c2202f.r(-9.0f);
        c2202f.g(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f);
        c2202f.o(10.0f, 1.34f, 10.0f, 3.0f);
        c2202f.r(9.0f);
        c2202f.g(0.0f, 1.34f, -2.94f, 2.48f, -7.0f, 2.87f);
        c2202f.k(15.0f, 17.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f2013e = b3;
        return b3;
    }

    public static int E(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC2107A.q("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static a4.h F(a4.f fVar, a4.g gVar) {
        kotlin.jvm.internal.l.f("key", gVar);
        return kotlin.jvm.internal.l.a(fVar.getKey(), gVar) ? a4.i.f6649k : fVar;
    }

    public static float G(EdgeEffect edgeEffect, float f, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s1.b.c(edgeEffect, f, f5);
        }
        edgeEffect.onPull(f, f5);
        return f;
    }

    public static a4.h H(a4.f fVar, a4.h hVar) {
        kotlin.jvm.internal.l.f("context", hVar);
        return hVar == a4.i.f6649k ? fVar : (a4.h) hVar.A(new L(6), fVar);
    }

    public static final void I(P0 p02, InterfaceC0284c interfaceC0284c, int i) {
        while (true) {
            int i5 = p02.f4385v;
            if (i > i5 && i < p02.f4384u) {
                return;
            }
            if (i5 == 0 && i == 0) {
                return;
            }
            p02.L();
            if (p02.x(p02.f4385v)) {
                interfaceC0284c.o();
            }
            p02.j();
        }
    }

    public static final void J(Object[] objArr, int i, int i5) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        while (i < i5) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long K(long j5) {
        return (Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j5 >> 32))) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L(final String str, final InterfaceC2015a interfaceC2015a, String str2, final int i, C0315s c0315s, final int i5, final int i6) {
        int i7;
        String str3;
        int i8;
        String str4;
        String str5;
        final String str6;
        C0326x0 s2;
        kotlin.jvm.internal.l.f("onBackPress", interfaceC2015a);
        c0315s.Z(-298530561);
        if ((i5 & 6) == 0) {
            i7 = (c0315s.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        int i9 = i6 & 4;
        if (i9 != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            str3 = str2;
            i7 |= c0315s.f(str3) ? 256 : 128;
            if ((i5 & 3072) != 0) {
                i8 = i;
                i7 |= c0315s.d(i8) ? 2048 : 1024;
            } else {
                i8 = i;
            }
            if ((i7 & 1171) == 1170 || !c0315s.B()) {
                str4 = null;
                str5 = i9 == 0 ? null : str3;
                b0.m mVar = b0.m.f7161k;
                float f = 4;
                b0.p g5 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.b(mVar, 1.0f), f, 6);
                if (str5 != null && !AbstractC2227e.H0(str5)) {
                    str4 = str5;
                }
                p0.a(androidx.compose.foundation.layout.c.b(mVar, 1.0f), R3.j.f5218a, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3540p, f, 12, AbstractC2527w.a(1, p.b(0.55f, V3.a.f5995z)), X.e.d(26173594, new o(g5, interfaceC2015a, i8, str, str4), c0315s), c0315s, 14377014, 8);
                str6 = str5;
            } else {
                c0315s.S();
                str6 = str3;
            }
            s2 = c0315s.s();
            if (s2 == null) {
                s2.f4578d = new i4.e() { // from class: R3.m
                    @Override // i4.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int B5 = AbstractC0329z.B(i5 | 1);
                        String str7 = str;
                        int i10 = i;
                        G4.l.L(str7, interfaceC2015a, str6, i10, (C0315s) obj, B5, i6);
                        return W3.o.f6046a;
                    }
                };
                return;
            }
            return;
        }
        str3 = str2;
        if ((i5 & 3072) != 0) {
        }
        if ((i7 & 1171) == 1170) {
        }
        str4 = null;
        if (i9 == 0) {
        }
        b0.m mVar2 = b0.m.f7161k;
        float f5 = 4;
        b0.p g52 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.b(mVar2, 1.0f), f5, 6);
        if (str5 != null) {
            str4 = str5;
        }
        p0.a(androidx.compose.foundation.layout.c.b(mVar2, 1.0f), R3.j.f5218a, ((C0249u) c0315s.j(AbstractC0251w.f3578a)).f3540p, f5, 12, AbstractC2527w.a(1, p.b(0.55f, V3.a.f5995z)), X.e.d(26173594, new o(g52, interfaceC2015a, i8, str, str4), c0315s), c0315s, 14377014, 8);
        str6 = str5;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final String M(int i, C0315s c0315s) {
        return ((Resources) c0315s.j(AndroidCompositionLocals_androidKt.f6944c)).getString(i);
    }

    public static final void N(Object obj) {
        if (obj instanceof W3.j) {
            throw ((W3.j) obj).f6038k;
        }
    }

    public static final String O(int i) {
        int i5 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = M4.b.f3620a;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i5 < 8 && cArr2[i5] == '0') {
            i5++;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(L1.a.l(i5, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i5 <= 8) {
            return new String(cArr2, i5, 8 - i5);
        }
        throw new IllegalArgumentException(L1.a.l(i5, "startIndex: ", " > endIndex: 8"));
    }

    public static final C1989c P(InterfaceC2637x interfaceC2637x) {
        C1989c f = f0.f(interfaceC2637x);
        long g5 = interfaceC2637x.g((Float.floatToRawIntBits(f.f17193a) << 32) | (Float.floatToRawIntBits(f.f17194b) & 4294967295L));
        long g6 = interfaceC2637x.g((Float.floatToRawIntBits(f.f17195c) << 32) | (Float.floatToRawIntBits(f.f17196d) & 4294967295L));
        return new C1989c(Float.intBitsToFloat((int) (g5 >> 32)), Float.intBitsToFloat((int) (g5 & 4294967295L)), Float.intBitsToFloat((int) (g6 >> 32)), Float.intBitsToFloat((int) (g6 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle Q(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e3) {
                U2.j.e("JSON parsing error", e3);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i5 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i5 != 0) {
                    List i6 = Hq.e(new C1221ku('/')).i(optString2);
                    if (i6.size() > 2 || i6.isEmpty()) {
                        obj = null;
                    } else {
                        if (i6.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) i6.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) i6.get(0), 0);
                            str2 = (String) i6.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i7 = i5 - 1;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static void R(Context context) {
        if (((Boolean) r.f5053d.f5056c.a(F7.P5)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            Ot g5 = Ot.g(context);
            Pt g6 = Pt.g(context);
            Qt d5 = Qt.d(context);
            g5.h();
            synchronized (Ot.class) {
                g5.d(true);
            }
            g6.h();
            d5.n();
        } catch (IOException e3) {
            P2.o.f4767B.f4774g.i("clearStorageOnIdlessMode", e3);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e5) {
            P2.o.f4767B.f4774g.i("clearStorageOnIdlessMode_scar", e5);
        }
    }

    public static final long a(int i, int i5) {
        return (i5 & 4294967295L) | (i << 32);
    }

    public static final void b(b0.p pVar, E e3, C2681E c2681e, C2592m c2592m, boolean z3, b0.f fVar, InterfaceC2704f interfaceC2704f, i4.c cVar, C0315s c0315s, int i, int i5) {
        int i6;
        int i7;
        Object qVar;
        E e5;
        int i8;
        int i9;
        boolean z5;
        InterfaceC2104g interfaceC2104g;
        E e6;
        c0315s.Z(620764179);
        if ((i & 6) == 0) {
            i6 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0315s.f(e3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= c0315s.f(c2681e) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0315s.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0315s.g(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= c0315s.f(c2592m) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= c0315s.g(z3) ? 1048576 : 524288;
        }
        int i10 = i6 | 12582912;
        if ((i & 100663296) == 0) {
            i10 |= c0315s.f(fVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i10 |= c0315s.f(interfaceC2704f) ? 536870912 : 268435456;
        }
        int i11 = i5 | 54;
        if ((i5 & 384) == 0) {
            i11 |= c0315s.h(cVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i10 & 306783379) == 306783378 && (i12 & 147) == 146 && c0315s.B()) {
            c0315s.S();
            e6 = e3;
        } else {
            int i13 = (i10 >> 3) & 14;
            int i14 = ((i12 >> 3) & 112) | i13;
            InterfaceC0289e0 w5 = AbstractC0329z.w(cVar, c0315s);
            boolean z6 = (((i14 & 14) ^ 6) > 4 && c0315s.f(e3)) || (i14 & 6) == 4;
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (z6 || M5 == obj) {
                C0003c c0003c = new C0003c();
                i7 = i12;
                c0003c.f43a = new C0299j0(Integer.MAX_VALUE);
                c0003c.f44b = new C0299j0(Integer.MAX_VALUE);
                Z z7 = Z.f4432n;
                int i15 = 0;
                A.m mVar = new A.m(i15, w5);
                v3.e eVar = V0.f4408a;
                M5 = new A.l(0, 0, d1.class, new H(new A.n(new H(mVar, z7), e3, c0003c, i15), z7), "value", "getValue()Ljava/lang/Object;");
                c0315s.i0(M5);
            } else {
                i7 = i12;
            }
            InterfaceC2104g interfaceC2104g2 = (InterfaceC2104g) M5;
            int i16 = ((i10 >> 9) & 112) | i13;
            boolean z8 = ((((i16 & 112) ^ 48) > 32 && c0315s.g(true)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) > 4 && c0315s.f(e3)) || (i16 & 6) == 4);
            Object M6 = c0315s.M();
            if (z8 || M6 == obj) {
                M6 = new C0004d(e3);
                c0315s.i0(M6);
            }
            C0004d c0004d = (C0004d) M6;
            Object M7 = c0315s.M();
            if (M7 == obj) {
                Object c5 = new C(AbstractC0329z.m(c0315s));
                c0315s.i0(c5);
                M7 = c5;
            }
            InterfaceC2280u interfaceC2280u = ((C) M7).f4253k;
            u uVar = (u) c0315s.j(I0.f286g);
            boolean z9 = !((Boolean) c0315s.j(I0.f300v)).booleanValue();
            int i17 = i10 & 7168;
            int i18 = i10 >> 6;
            int i19 = i7 << 21;
            int i20 = i10;
            int i21 = (i10 & 65520) | (i18 & 458752) | (i18 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i10 & 1879048192);
            boolean f = (((i21 & 234881024) ^ 100663296) > 67108864 && c0315s.f(null)) | ((((i21 & 896) ^ 384) > 256 && c0315s.f(c2681e)) || (i21 & 384) == 256) | ((((i21 & 112) ^ 48) > 32 && c0315s.f(e3)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) > 2048 && c0315s.g(false)) || (i21 & 3072) == 2048) | ((((57344 & i21) ^ 24576) > 16384 && c0315s.g(true)) || (i21 & 24576) == 16384) | ((((i21 & 3670016) ^ 1572864) > 1048576 && c0315s.f(fVar)) || (i21 & 1572864) == 1048576) | (((i21 & 29360128) ^ 12582912) > 8388608 && c0315s.f(null)) | ((((i21 & 1879048192) ^ 805306368) > 536870912 && c0315s.f(interfaceC2704f)) || (i21 & 805306368) == 536870912) | c0315s.f(uVar) | c0315s.g(z9);
            Object M8 = c0315s.M();
            if (f || M8 == obj) {
                e5 = e3;
                i8 = i17;
                i9 = 32;
                z5 = true;
                qVar = new q(e5, c2681e, interfaceC2104g2, interfaceC2704f, z9, interfaceC2280u, uVar, fVar);
                interfaceC2104g = interfaceC2104g2;
                c0315s.i0(qVar);
            } else {
                qVar = M8;
                i8 = i17;
                interfaceC2104g = interfaceC2104g2;
                i9 = 32;
                z5 = true;
                e5 = e3;
            }
            i4.e eVar2 = (i4.e) qVar;
            P p5 = P.f20695k;
            b0.p a5 = androidx.compose.foundation.lazy.layout.c.a(pVar.c(e5.f17k).c(e5.f18l), interfaceC2104g, c0004d, p5, z3);
            int i22 = ((i20 >> 18) & 112) | i13;
            boolean z10 = ((((i22 & 112) ^ 48) <= i9 || !c0315s.d(0)) ? false : z5) | (((((i22 & 14) ^ 6) <= 4 || !c0315s.f(e5)) && (i22 & 6) != 4) ? false : z5);
            Object M9 = c0315s.M();
            if (z10 || M9 == obj) {
                M9 = new C0005e(e5);
                c0315s.i0(M9);
            }
            C0005e c0005e = (C0005e) M9;
            W0.m mVar2 = (W0.m) c0315s.j(I0.f292n);
            int i23 = 512 | i8 | (i20 & 3670016);
            if (z3) {
                c0315s.X(-1890632411);
                boolean f5 = c0315s.f(c0005e);
                C1930k c1930k = e5.f20n;
                boolean f6 = f5 | c0315s.f(c1930k);
                if ((((i23 & 7168) ^ 3072) <= 2048 || !c0315s.g(false)) && (i23 & 3072) != 2048) {
                    z5 = false;
                }
                boolean f7 = f6 | z5 | c0315s.f(mVar2) | c0315s.f(p5);
                Object M10 = c0315s.M();
                if (f7 || M10 == obj) {
                    M10 = new C0083l(c0005e, c1930k, mVar2, p5);
                    c0315s.i0(M10);
                }
                a5 = a5.c((C0083l) M10);
                c0315s.q(false);
            } else {
                c0315s.X(-1890658823);
                c0315s.q(false);
            }
            e6 = e5;
            AbstractC2346c.b(interfaceC2104g, w0.e(a5.c(e5.f19m.i), e5, p5, z3, c2592m, e5.f, c0315s), e6.f21o, eVar2, c0315s, 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new A.o(pVar, e6, c2681e, c2592m, z3, fVar, interfaceC2704f, cVar, i, i5);
        }
    }

    public static final void c(Boolean bool, AbstractC0015c abstractC0015c, InterfaceC0491u interfaceC0491u, i4.c cVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(696924721);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(bool) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        int i6 = i5 | (c0315s.h(abstractC0015c) ? 32 : 16) | 128 | (c0315s.h(cVar) ? 2048 : 1024);
        if (c0315s.P(i6 & 1, (i6 & 1171) != 1170)) {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                interfaceC0491u = (InterfaceC0491u) c0315s.j(B1.i.f751a);
            } else {
                c0315s.S();
            }
            int i7 = i6 & (-897);
            c0315s.r();
            boolean f = c0315s.f(bool) | c0315s.f(abstractC0015c) | c0315s.f(interfaceC0491u);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new B1.g(interfaceC0491u.g());
                c0315s.i0(M5);
            }
            d(interfaceC0491u, (B1.g) M5, cVar, c0315s, (i7 >> 3) & 896);
        } else {
            c0315s.S();
        }
        InterfaceC0491u interfaceC0491u2 = interfaceC0491u;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.a(bool, abstractC0015c, interfaceC0491u2, cVar, i, 0);
        }
    }

    public static final void d(InterfaceC0491u interfaceC0491u, B1.g gVar, i4.c cVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(228371534);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(interfaceC0491u) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(cVar) ? 256 : 128;
        }
        if (c0315s.P(i5 & 1, (i5 & 147) != 146)) {
            boolean h3 = c0315s.h(gVar) | ((i5 & 896) == 256) | c0315s.h(interfaceC0491u);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new B1.b(interfaceC0491u, gVar, cVar, 0);
                c0315s.i0(M5);
            }
            AbstractC0329z.d(interfaceC0491u, gVar, (i4.c) M5, c0315s);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.c(interfaceC0491u, gVar, cVar, i, 0);
        }
    }

    public static final void e(final boolean z3, i4.e eVar, C0315s c0315s, int i) {
        c0315s.Z(-642000585);
        int i5 = (c0315s.g(z3) ? 4 : 2) | i | (c0315s.h(eVar) ? 32 : 16);
        if (c0315s.P(i5 & 1, (i5 & 19) != 18)) {
            Object a5 = J1.a.a(c0315s);
            if (a5 == null) {
                c0315s.X(1512740606);
                a5 = d.j.a(c0315s);
            } else {
                c0315s.X(1512737723);
            }
            c0315s.q(false);
            if (a5 == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean f = c0315s.f(a5);
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (f || M5 == obj) {
                I1.c cVar = a5 instanceof I1.c ? (I1.c) a5 : null;
                m2.g c5 = cVar != null ? cVar.c() : null;
                InterfaceC0520G interfaceC0520G = a5 instanceof InterfaceC0520G ? (InterfaceC0520G) a5 : null;
                M5 = new C1919b(c5, interfaceC0520G != null ? interfaceC0520G.a() : null);
                c0315s.i0(M5);
            }
            Object obj2 = (C1919b) M5;
            Object M6 = c0315s.M();
            if (M6 == obj) {
                M6 = AbstractC0329z.m(c0315s);
                c0315s.i0(M6);
            }
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) M6;
            long j5 = c0315s.f4531T;
            boolean f5 = c0315s.f(obj2) | c0315s.e(j5);
            Object M7 = c0315s.M();
            if (f5 || M7 == obj) {
                M7 = new d.i(interfaceC2280u, new d.k(a5, j5));
                c0315s.i0(M7);
            }
            final d.i iVar = (d.i) M7;
            c0315s.X(-348514256);
            boolean h3 = c0315s.h(iVar) | c0315s.h(eVar);
            Object M8 = c0315s.M();
            if (h3 || M8 == obj) {
                M8 = new C0328y0(6, iVar, eVar);
                c0315s.i0(M8);
            }
            AbstractC0329z.g((InterfaceC2015a) M8, c0315s);
            Boolean valueOf = Boolean.valueOf(z3);
            int i6 = i5 & 14;
            boolean h4 = c0315s.h(iVar) | (i6 == 4);
            Object M9 = c0315s.M();
            if (h4 || M9 == obj) {
                M9 = new i4.c() { // from class: d.l
                    @Override // i4.c
                    public final Object c(Object obj3) {
                        boolean z5 = z3;
                        i iVar2 = i.this;
                        iVar2.q(z5);
                        return new C1903c((B1.g) obj3, iVar2, 1);
                    }
                };
                c0315s.i0(M9);
            }
            c(valueOf, iVar, null, (i4.c) M9, c0315s, i6);
            boolean h5 = c0315s.h(obj2) | c0315s.h(iVar);
            Object M10 = c0315s.M();
            if (h5 || M10 == obj) {
                M10 = new O3.f(9, obj2, iVar);
                c0315s.i0(M10);
            }
            AbstractC0329z.d(obj2, iVar, (i4.c) M10, c0315s);
            c0315s.q(false);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C1902b(z3, eVar, i, 1);
        }
    }

    public static final C1989c f(long j5, long j6) {
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        return new C1989c(Float.intBitsToFloat(i), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i5));
    }

    public static final boolean g(Object[] objArr, int i, int i5, List list) {
        if (i5 == list.size()) {
            for (int i6 = 0; i6 < i5; i6++) {
                if (kotlin.jvm.internal.l.a(objArr[i + i6], list.get(i6))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String h(Object[] objArr, int i, int i5, X3.g gVar) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i6];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public static final boolean i(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.l.f("a", bArr);
        kotlin.jvm.internal.l.f("b", bArr2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void j(String str, J2.i iVar, b0.p pVar, C0315s c0315s, int i) {
        c0315s.Z(96329758);
        int i5 = (c0315s.f(str) ? 4 : 2) | i | (c0315s.h(iVar) ? 32 : 16);
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            L0 l02 = c0315s.f4520G;
            int i6 = l02.f4336g;
            Object f = AbstractC0317t.f(i6 < l02.f4337h ? l02.p(l02.f4332b, i6) : null, str, iVar);
            if (f == null) {
                f = new U(str, iVar);
            }
            c0315s.T(-1761403855, 0, f, null);
            c0315s.X(-1761400772);
            boolean h3 = ((i5 & 14) == 4) | c0315s.h(iVar);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new O3.f(0, str, iVar);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            androidx.compose.ui.viewinterop.a.b((i4.c) M5, pVar, null, c0315s, 48, 4);
            c0315s.q(false);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new O3.g(str, iVar, pVar, i, 0);
        }
    }

    public static final void k(String str, b0.p pVar, C0315s c0315s, int i) {
        int i5;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-241473851);
        if (((i | (c0315s2.f(pVar) ? 32 : 16)) & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
            i5 = 1;
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p c5 = pVar.c(androidx.compose.foundation.layout.c.f6868c);
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, c5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s2, c2751h, e3);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s2, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            b0.f fVar = b0.c.f7149w;
            C2700b c2700b = AbstractC2706h.f21534a;
            C2703e c2703e = new C2703e(8);
            b0.p f = androidx.compose.foundation.layout.b.f(mVar, 24);
            C2717s a5 = AbstractC2716r.a(c2703e, fVar, c0315s2, 54);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c7 = b0.a.c(c0315s2, f);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a5);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c7);
            D.d dVar = D.e.f920a;
            long j5 = V3.a.f;
            b0.p f5 = androidx.compose.foundation.layout.c.f(mVar, 48);
            long j6 = V3.a.f5975d;
            p0.a(f5, dVar, j5, 0.0f, 0.0f, AbstractC2527w.a(1, p.b(0.4f, j6)), t.f5248c, c0315s, 14156166, 56);
            R3.j.g("No records", null, j5, j6, null, c0315s, 3462, 18);
            i5 = 1;
            u0.b(str, null, V3.a.f5987r, 0L, null, 0L, new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s.j(M.w0.f3580a)).f3572j, c0315s, 390, 0, 65018);
            c0315s2 = c0315s;
            c0315s2.q(true);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new R3.n(str, pVar, i, i5);
        }
    }

    public static final void n(b0.p pVar, C0315s c0315s, int i) {
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-2145665817);
        if (((i | (c0315s2.f(pVar) ? 4 : 2)) & 3) == 2 && c0315s2.B()) {
            c0315s2.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p c5 = pVar.c(androidx.compose.foundation.layout.c.f6868c);
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, c5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s2, c2751h, e3);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s2, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            b0.f fVar = b0.c.f7149w;
            C2700b c2700b = AbstractC2706h.f21534a;
            C2717s a5 = AbstractC2716r.a(new C2703e(14), fVar, c0315s2, 54);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c7 = b0.a.c(c0315s2, mVar);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a5);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c7);
            b0.p f = androidx.compose.foundation.layout.c.f(mVar, 46);
            long j5 = V3.a.f5975d;
            long j6 = V3.a.f;
            e0.a(4, 0, 3510, j5, j6, c0315s2, f);
            C2201e c2201e = f2011c;
            if (c2201e == null) {
                C2200d c2200d = new C2200d("Filled.HourglassTop", false);
                int i5 = z.f18603a;
                M m5 = new M(p.f17289b);
                C2202f c2202f = new C2202f(0);
                c2202f.m(6.0f, 2.0f);
                c2202f.l(0.01f, 6.0f);
                c2202f.k(10.0f, 12.0f);
                c2202f.l(-3.99f, 4.01f);
                c2202f.k(6.0f, 22.0f);
                c2202f.j(12.0f);
                c2202f.r(-6.0f);
                c2202f.l(-4.0f, -4.0f);
                c2202f.l(4.0f, -3.99f);
                c2202f.q(2.0f);
                c2202f.i(6.0f);
                c2202f.e();
                c2202f.m(16.0f, 16.5f);
                c2202f.q(20.0f);
                c2202f.i(8.0f);
                c2202f.r(-3.5f);
                c2202f.l(4.0f, -4.0f);
                c2202f.k(16.0f, 16.5f);
                c2202f.e();
                C2200d.a(c2200d, c2202f.f18548a, m5);
                c2201e = c2200d.b();
                f2011c = c2201e;
            }
            R3.j.g("Loading...", null, j6, j5, c2201e, c0315s, 3462, 2);
            u0.b("Fetching live data", null, V3.a.f5987r, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s.j(M.w0.f3580a)).f3573k, c0315s, 390, 0, 65530);
            c0315s2 = c0315s;
            c0315s2.q(true);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new R3.k(pVar, i, 2);
        }
    }

    public static final void o(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    public static final W3.j p(Throwable th) {
        kotlin.jvm.internal.l.f("exception", th);
        return new W3.j(th);
    }

    public static final void u(L4.o oVar, L4.z zVar) {
        try {
            IOException iOException = null;
            for (L4.z zVar2 : oVar.d(zVar)) {
                try {
                    if (oVar.e(zVar2).f3101c) {
                        u(oVar, zVar2);
                    }
                    oVar.a(zVar2);
                } catch (IOException e3) {
                    if (iOException == null) {
                        iOException = e3;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void v(b0.p pVar, C0315s c0315s, int i) {
        int i5;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(1807393221);
        if ((i & 3) == 2 && c0315s2.B()) {
            c0315s2.S();
            i5 = 1;
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.f fVar = b0.c.f7149w;
            C2700b c2700b = AbstractC2706h.f21534a;
            C2717s a5 = AbstractC2716r.a(new C2703e(16), fVar, c0315s2, 54);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, pVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, C2752i.f21833e, a5);
            AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h);
            }
            AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
            e0.b(0.0f, 0, 432, V3.a.f5975d, V3.a.f, c0315s2, AbstractC0444a.n(androidx.compose.foundation.layout.c.b(mVar, 0.6f), D.e.a(4)));
            i5 = 1;
            u0.b("Preparing your experience...", null, V3.a.f5987r, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(M.w0.f3580a)).f3573k, c0315s, 390, 0, 65530);
            c0315s2 = c0315s;
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new R3.k(pVar, i, i5);
        }
    }

    public static final void w(String str, b0.p pVar, C0315s c0315s, int i) {
        int i5;
        String str2 = str;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(-1215683949);
        int i6 = i | (c0315s2.f(str2) ? 4 : 2) | (c0315s2.f(pVar) ? 32 : 16);
        if ((i6 & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
            i5 = 0;
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p c5 = pVar.c(androidx.compose.foundation.layout.c.f6868c);
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c6 = b0.a.c(c0315s2, c5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s2, c2751h, e3);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s2, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s2, c2751h4, c6);
            b0.f fVar = b0.c.f7149w;
            C2700b c2700b = AbstractC2706h.f21534a;
            C2703e c2703e = new C2703e(10);
            b0.p f = androidx.compose.foundation.layout.b.f(mVar, 24);
            C2717s a5 = AbstractC2716r.a(c2703e, fVar, c0315s2, 54);
            int p6 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l6 = c0315s2.l();
            b0.p c7 = b0.a.c(c0315s2, f);
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, c2751h, a5);
            AbstractC0329z.y(c0315s2, c2751h2, l6);
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                AbstractC2107A.y(p6, c0315s2, p6, c2751h3);
            }
            AbstractC0329z.y(c0315s2, c2751h4, c7);
            C2201e c2201e = AbstractC2036a.f17600l;
            if (c2201e == null) {
                C2200d c2200d = new C2200d("Filled.ErrorOutline", false);
                int i7 = z.f18603a;
                M m5 = new M(p.f17289b);
                C2202f c2202f = new C2202f(0);
                c2202f.m(11.0f, 15.0f);
                c2202f.j(2.0f);
                c2202f.r(2.0f);
                c2202f.j(-2.0f);
                c2202f.e();
                c2202f.m(11.0f, 7.0f);
                c2202f.j(2.0f);
                c2202f.r(6.0f);
                c2202f.j(-2.0f);
                c2202f.e();
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
                c2201e = c2200d.b();
                AbstractC2036a.f17600l = c2201e;
            }
            R3.j.g("Error", null, V3.a.f5966E, V3.a.f5967F, c2201e, c0315s2, 3462, 2);
            e1 e1Var = M.w0.f3580a;
            u0.b("Something went wrong", null, ((C0249u) c0315s2.j(AbstractC0251w.f3578a)).f3541q, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((v0) c0315s2.j(e1Var)).f3571h, c0315s, 196614, 0, 65498);
            str2 = str;
            u0.b(str2, null, V3.a.f5987r, 0L, null, 0L, new V0.k(3), 0L, 0, false, 0, 0, ((v0) c0315s.j(e1Var)).f3573k, c0315s, (i6 & 14) | 384, 0, 65018);
            c0315s2 = c0315s;
            i5 = 0;
            R3.j.f(null, c0315s2, 0, 1);
            c0315s2.q(true);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new R3.n(str2, pVar, i, i5);
        }
    }

    public static k1.i x(k1.i[] iVarArr, int i) {
        int i5 = (i & 1) == 0 ? 400 : 700;
        boolean z3 = (i & 2) != 0;
        k1.i iVar = null;
        int i6 = Integer.MAX_VALUE;
        for (k1.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f17574c - i5) * 2) + (iVar2.f17575d == z3 ? 0 : 1);
            if (iVar == null || i6 > abs) {
                iVar = iVar2;
                i6 = abs;
            }
        }
        return iVar;
    }

    public static a4.f y(a4.f fVar, a4.g gVar) {
        kotlin.jvm.internal.l.f("key", gVar);
        if (kotlin.jvm.internal.l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s1.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public InterfaceC2035c l(Context context, Looper looper, C0.c cVar, Object obj, k3.g gVar, k3.h hVar) {
        return m(context, looper, cVar, obj, (l3.m) gVar, (l3.m) hVar);
    }

    public InterfaceC2035c m(Context context, Looper looper, C0.c cVar, Object obj, l3.m mVar, l3.m mVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface q(Context context, f1.e eVar, Resources resources, int i);

    public abstract Typeface r(Context context, k1.i[] iVarArr, int i);

    public Typeface s(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface t(Context context, Resources resources, int i, String str, int i5) {
        File z3 = N4.b.z(context);
        if (z3 == null) {
            return null;
        }
        try {
            if (N4.b.o(z3, resources, i)) {
                return Typeface.createFromFile(z3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            z3.delete();
        }
    }
}
