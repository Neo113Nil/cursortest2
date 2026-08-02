package t3;

import A.C0007g;
import A0.C0009a;
import A0.C0022e0;
import A0.C0028g0;
import A0.C0040k0;
import A0.V;
import A0.Z;
import A0.o1;
import A0.q1;
import B.G;
import B.H;
import B.J;
import B.K;
import E.C0094d0;
import E.InterfaceC0104i0;
import H0.i;
import H0.n;
import H0.q;
import I.C0163p;
import I.C0165s;
import I.C0166t;
import I.C0169w;
import I.O;
import K0.C0203h;
import L4.C0219b;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.e1;
import W0.o;
import W0.p;
import X3.m;
import a2.AbstractC0456a;
import a3.AbstractC0467k;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.window.BackEvent;
import b4.EnumC0510a;
import c0.C0534c;
import c0.k;
import c4.AbstractC0540a;
import com.google.android.gms.internal.ads.C1036gn;
import e2.C1930k;
import e4.AbstractC1936a;
import f4.AbstractC1953a;
import g2.C1981e;
import game.betting133.sports1xbet.R;
import h0.C1988b;
import i0.C2003h;
import i0.F;
import i0.M;
import i4.InterfaceC2015a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import n1.C;
import n1.C2159B;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2205i;
import o0.C2206j;
import o0.C2207k;
import o0.C2208l;
import o0.C2209m;
import o0.C2210n;
import o0.C2211o;
import o0.C2212p;
import o0.C2213q;
import o0.r;
import o0.t;
import o0.u;
import o0.z;
import o4.AbstractC2234l;
import p2.RunnableC2246d;
import r.C2316B;
import r.C2321G;
import r.C2322H;
import r0.C2344a;
import r3.AbstractC2349a;
import t0.C2406c;
import t0.E;
import t0.j;
import t0.s;
import u0.C2479a;
import w0.AbstractC2540a;
import x.AbstractC2557C;
import x0.f0;
import y4.v;
import z0.C2731G;
import z0.e0;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2425d {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f19581a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f19582b = null;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f19583c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f19584d = null;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f19585e = null;
    public static C2201e f = null;

    /* renamed from: g, reason: collision with root package name */
    public static long f19586g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static Method f19587h = null;
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f19588j;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean A(j jVar) {
        ?? r5 = jVar.f19485a;
        int size = r5.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((s) r5.get(i5)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static K B(String str) {
        int i5;
        String str2;
        l.f("statusLine", str);
        boolean x02 = AbstractC2234l.x0(str, "HTTP/1.", false);
        v vVar = v.f21427l;
        if (x02) {
            i5 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                vVar = v.f21428m;
            }
        } else {
            if (!AbstractC2234l.x0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i5 = 4;
        }
        int i6 = i5 + 3;
        if (str.length() < i6) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i5, i6);
            l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i6) {
                str2 = "";
            } else {
                if (str.charAt(i6) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i5 + 4);
                l.e("this as java.lang.String).substring(startIndex)", str2);
            }
            return new K(vVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final void C(float[] fArr, float[] fArr2, int i5, float[] fArr3) {
        if (i5 == 0) {
            AbstractC2540a.a("At least one point must be provided");
        }
        int i6 = 2 >= i5 ? i5 - 1 : 2;
        int i7 = i6 + 1;
        float[][] fArr4 = new float[i7][];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr4[i8] = new float[i5];
        }
        for (int i9 = 0; i9 < i5; i9++) {
            fArr4[0][i9] = 1.0f;
            for (int i10 = 1; i10 < i7; i10++) {
                fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr[i9];
            }
        }
        float[][] fArr5 = new float[i7][];
        for (int i11 = 0; i11 < i7; i11++) {
            fArr5[i11] = new float[i5];
        }
        float[][] fArr6 = new float[i7][];
        for (int i12 = 0; i12 < i7; i12++) {
            fArr6[i12] = new float[i7];
        }
        int i13 = 0;
        while (i13 < i7) {
            float[] fArr7 = fArr5[i13];
            float[] fArr8 = fArr4[i13];
            l.f("<this>", fArr8);
            l.f("destination", fArr7);
            System.arraycopy(fArr8, 0, fArr7, 0, i5);
            for (int i14 = 0; i14 < i13; i14++) {
                float[] fArr9 = fArr5[i14];
                float q5 = q(fArr7, fArr9);
                for (int i15 = 0; i15 < i5; i15++) {
                    fArr7[i15] = fArr7[i15] - (fArr9[i15] * q5);
                }
            }
            float sqrt = (float) Math.sqrt(q(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f5 = 1.0f / sqrt;
            for (int i16 = 0; i16 < i5; i16++) {
                fArr7[i16] = fArr7[i16] * f5;
            }
            float[] fArr10 = fArr6[i13];
            int i17 = 0;
            while (i17 < i7) {
                fArr10[i17] = i17 < i13 ? 0.0f : q(fArr7, fArr4[i17]);
                i17++;
            }
            i13++;
        }
        for (int i18 = i6; -1 < i18; i18--) {
            float q6 = q(fArr5[i18], fArr2);
            float[] fArr11 = fArr6[i18];
            int i19 = i18 + 1;
            if (i19 <= i6) {
                int i20 = i6;
                while (true) {
                    q6 -= fArr11[i20] * fArr3[i20];
                    if (i20 != i19) {
                        i20--;
                    }
                }
            }
            fArr3[i18] = q6 / fArr11[i18];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void D(ViewStructure viewStructure, C2731G c2731g, AutofillId autofillId, String str, I0.a aVar) {
        int i5;
        long j5;
        long j6;
        char c5;
        long j7;
        J0.a aVar2;
        H0.g gVar;
        C0203h c0203h;
        C0534c c0534c;
        boolean z3;
        k kVar;
        Boolean bool;
        boolean z5;
        Integer num;
        List list;
        String[] y5;
        AutofillValue forText;
        String E5;
        String[] y6;
        String[] y7;
        C2321G c2321g;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        C2321G c2321g2;
        J0.a aVar3;
        H0.g gVar2;
        C0203h c0203h2;
        int i6;
        H0.v vVar = H0.s.f2157a;
        H0.v vVar2 = i.f2079a;
        H0.j w5 = c2731g.w();
        int i7 = 8;
        boolean z6 = true;
        Integer num2 = 1;
        if (w5 == null || (c2321g2 = w5.f2103k) == null) {
            i5 = 2;
            j5 = 128;
            j6 = 255;
            c5 = 7;
            j7 = -9187201950435737472L;
            aVar2 = null;
            gVar = null;
            c0203h = null;
            c0534c = null;
            z3 = false;
            kVar = null;
            bool = null;
            z5 = false;
            num = null;
        } else {
            j5 = 128;
            Object[] objArr5 = c2321g2.f18929b;
            Object[] objArr6 = c2321g2.f18930c;
            long[] jArr3 = c2321g2.f18928a;
            j6 = 255;
            int length = jArr3.length - 2;
            i5 = 2;
            if (length >= 0) {
                int i8 = 0;
                c0534c = null;
                z3 = false;
                aVar3 = null;
                kVar = null;
                bool = null;
                gVar2 = null;
                z5 = false;
                num = null;
                c0203h2 = null;
                c5 = 7;
                while (true) {
                    long j8 = jArr3[i8];
                    j7 = -9187201950435737472L;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j8 & 255) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr5[i11];
                                Object obj2 = objArr6[i11];
                                H0.v vVar3 = (H0.v) obj;
                                i6 = i7;
                                if (l.a(vVar3, H0.s.f2172r)) {
                                    l.d("null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType", obj2);
                                    c0534c = (C0534c) obj2;
                                } else if (l.a(vVar3, H0.s.f2157a)) {
                                    l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", obj2);
                                    CharSequence charSequence = (String) m.Z((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (l.a(vVar3, H0.s.f2171q)) {
                                    l.d("null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType", obj2);
                                    kVar = (k) obj2;
                                } else if (l.a(vVar3, H0.s.f2148E)) {
                                    l.d("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString", obj2);
                                    c0203h2 = (C0203h) obj2;
                                } else if (l.a(vVar3, H0.s.f2165k)) {
                                    l.d("null cannot be cast to non-null type kotlin.Boolean", obj2);
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (l.a(vVar3, H0.s.f2155N)) {
                                    l.d("null cannot be cast to non-null type kotlin.Int", obj2);
                                    num = (Integer) obj2;
                                } else if (l.a(vVar3, H0.s.J)) {
                                    z5 = true;
                                } else if (l.a(vVar3, H0.s.f2178x)) {
                                    l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.Role", obj2);
                                    gVar2 = (H0.g) obj2;
                                } else if (l.a(vVar3, H0.s.f2151H)) {
                                    l.d("null cannot be cast to non-null type kotlin.Boolean", obj2);
                                    bool = (Boolean) obj2;
                                } else if (l.a(vVar3, H0.s.f2152I)) {
                                    l.d("null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState", obj2);
                                    aVar3 = (J0.a) obj2;
                                } else if (l.a(vVar3, i.f2080b)) {
                                    viewStructure.setClickable(true);
                                } else if (l.a(vVar3, i.f2081c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (l.a(vVar3, i.f2098v)) {
                                    viewStructure.setFocusable(true);
                                } else if (l.a(vVar3, i.f2086j)) {
                                    z3 = true;
                                }
                            } else {
                                i6 = i7;
                            }
                            j8 >>= i6;
                            i10++;
                            i7 = i6;
                            z6 = true;
                        }
                        if (i9 != i7) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    i7 = 8;
                    z6 = true;
                }
            } else {
                c5 = 7;
                j7 = -9187201950435737472L;
                c0534c = null;
                z3 = false;
                aVar3 = null;
                kVar = null;
                bool = null;
                gVar2 = null;
                z5 = false;
                num = null;
                c0203h2 = null;
            }
            aVar2 = aVar3;
            gVar = gVar2;
            c0203h = c0203h2;
        }
        H0.j w6 = c2731g.w();
        if (w6 != null && w6.f2105m && !w6.f2106n) {
            w6 = w6.c();
            C2316B c2316b = new C2316B(((R.b) c2731g.n()).f5100k.f5108m);
            c2316b.b(c2731g.n());
            while (c2316b.h()) {
                C2731G c2731g2 = (C2731G) c2316b.j(c2316b.f18905b - 1);
                H0.j w7 = c2731g2.w();
                if (w7 != null && !w7.f2105m) {
                    w6.e(w7);
                    if (!w7.f2106n) {
                        c2316b.b(c2731g2.n());
                    }
                }
            }
        }
        if (w6 != null && (c2321g = w6.f2103k) != null) {
            Object[] objArr7 = c2321g.f18929b;
            Object[] objArr8 = c2321g.f18930c;
            long[] jArr4 = c2321g.f18928a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i12 = 0;
                list = null;
                while (true) {
                    long j9 = jArr4[i12];
                    if ((((~j9) << c5) & j9 & j7) != j7) {
                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j9 & j6) < j5) {
                                int i15 = (i12 << 3) + i14;
                                Object obj3 = objArr7[i15];
                                jArr2 = jArr4;
                                Object obj4 = objArr8[i15];
                                objArr3 = objArr7;
                                H0.v vVar4 = (H0.v) obj3;
                                objArr4 = objArr8;
                                if (l.a(vVar4, H0.s.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (l.a(vVar4, H0.s.f2144A)) {
                                    l.d("null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>", obj4);
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr3 = objArr7;
                                objArr4 = objArr8;
                            }
                            j9 >>= 8;
                            i14++;
                            objArr7 = objArr3;
                            objArr8 = objArr4;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr7;
                        objArr2 = objArr8;
                        if (i13 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr7;
                        objArr2 = objArr8;
                    }
                    if (i12 == length2) {
                        break;
                    }
                    i12++;
                    objArr7 = objArr;
                    objArr8 = objArr2;
                    jArr4 = jArr;
                }
                Integer valueOf = Integer.valueOf(c2731g.f21625l);
                if (c2731g.u() == null) {
                    valueOf = null;
                }
                int intValue = valueOf == null ? valueOf.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                if (c0534c == null && !z3) {
                    num2 = aVar2 == null ? Integer.valueOf(i5) : null;
                }
                if (num2 != null) {
                    viewStructure.setAutofillType(num2.intValue());
                }
                if (kVar != null && (y7 = AbstractC2349a.y(kVar)) != null) {
                    viewStructure.setAutofillHints(y7);
                }
                aVar.f2552a.j(c2731g.f21625l, new C0007g(1, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar2 == null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(aVar2 == J0.a.f2689k);
                } else if (bool != null && (gVar == null || gVar.f2074a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                k.f7391a.getClass();
                y5 = AbstractC2349a.y(c0.j.f7390b);
                l.f("<this>", y5);
                if (y5.length != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                boolean z7 = z5 || (kVar != null && (y6 = AbstractC2349a.y(kVar)) != null && X3.l.p0(y6, y5[0]));
                if (z7) {
                    viewStructure.setDataIsSensitive(true);
                }
                viewStructure.setVisibility(c2731g.f21612O.f21769d.Q0() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str2 = "";
                    for (int i16 = 0; i16 < size; i16++) {
                        C0203h c0203h3 = (C0203h) list.get(i16);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        str2 = L1.a.p(sb, c0203h3.f2829l, '\n');
                    }
                    viewStructure.setText(str2);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((R.b) c2731g.n()).isEmpty() && gVar != null && (E5 = Z.E(gVar.f2074a)) != null) {
                    viewStructure.setClassName(E5);
                }
                if (z3) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (c0203h != null) {
                        forText = AutofillValue.forText(c0203h.f2829l);
                        viewStructure.setAutofillValue(forText);
                    }
                    if (z7) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        list = null;
        Integer valueOf2 = Integer.valueOf(c2731g.f21625l);
        if (c2731g.u() == null) {
        }
        if (valueOf2 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (c0534c == null) {
            if (aVar2 == null) {
            }
        }
        if (num2 != null) {
        }
        if (kVar != null) {
            viewStructure.setAutofillHints(y7);
        }
        aVar.f2552a.j(c2731g.f21625l, new C0007g(1, viewStructure));
        if (bool != null) {
        }
        if (aVar2 == null) {
        }
        k.f7391a.getClass();
        y5 = AbstractC2349a.y(c0.j.f7390b);
        l.f("<this>", y5);
        if (y5.length != 0) {
        }
    }

    public static final boolean E(C2321G c2321g, Object obj, Object obj2) {
        Object g5 = c2321g.g(obj);
        if (g5 == null) {
            return false;
        }
        if (!(g5 instanceof C2322H)) {
            if (!g5.equals(obj2)) {
                return false;
            }
            c2321g.k(obj);
            return true;
        }
        C2322H c2322h = (C2322H) g5;
        boolean k5 = c2322h.k(obj2);
        if (k5 && c2322h.g()) {
            c2321g.k(obj);
        }
        return k5;
    }

    public static final void F(C2321G c2321g, Object obj) {
        boolean z3;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj2 = c2321g.f18929b[i8];
                        Object obj3 = c2321g.f18930c[i8];
                        if (obj3 instanceof C2322H) {
                            l.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>", obj3);
                            C2322H c2322h = (C2322H) obj3;
                            c2322h.k(obj);
                            z3 = c2322h.g();
                        } else {
                            z3 = obj3 == obj;
                        }
                        if (z3) {
                            c2321g.l(i8);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public static final float G(long j5, float f5, W0.c cVar) {
        float c5;
        long b3 = o.b(j5);
        if (p.a(b3, 4294967296L)) {
            if (cVar.n() <= 1.05d) {
                return cVar.V(j5);
            }
            c5 = o.c(j5) / o.c(cVar.b0(f5));
        } else {
            if (!p.a(b3, 8589934592L)) {
                return Float.NaN;
            }
            c5 = o.c(j5);
        }
        return c5 * f5;
    }

    public static final void H(Spannable spannable, long j5, int i5, int i6) {
        if (j5 != 16) {
            spannable.setSpan(new ForegroundColorSpan(F.u(j5)), i5, i6, 33);
        }
    }

    public static final void I(Spannable spannable, long j5, W0.c cVar, int i5, int i6) {
        long b3 = o.b(j5);
        if (p.a(b3, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC2036a.U(cVar.V(j5)), false), i5, i6, 33);
        } else if (p.a(b3, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j5)), i5, i6, 33);
        }
    }

    public static final void J(Spannable spannable, R0.b bVar, int i5, int i6) {
        LocaleSpan localeSpan;
        if (bVar != null) {
            int i7 = Build.VERSION.SDK_INT;
            List list = bVar.f5122k;
            if (i7 >= 24) {
                ArrayList arrayList = new ArrayList(X3.o.S(bVar, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((R0.a) it.next()).f5120a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = V.e(V.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? R0.d.f5124a.b().c() : bVar.c()).f5120a);
            }
            spannable.setSpan(localeSpan, i5, i6, 33);
        }
    }

    public static final void K(List list, C2003h c2003h) {
        u uVar;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path.FillType fillType = c2003h.f17279a.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        int i5 = 0;
        boolean z3 = fillType == fillType2;
        Path path = c2003h.f17279a;
        path.rewind();
        if (!z3) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        u uVar2 = list.isEmpty() ? C2205i.f18558b : (u) list.get(0);
        int size = list.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i5 < size) {
            u uVar3 = (u) list.get(i5);
            if (uVar3 instanceof C2205i) {
                path.close();
                f12 = f11;
                f15 = f12;
                uVar = uVar3;
                f13 = f14;
                f16 = f13;
            } else if (uVar3 instanceof C2209m) {
                C2209m c2209m = (C2209m) uVar3;
                f11 = c2209m.f18567b;
                f14 = c2209m.f18568c;
                path.moveTo(f11, f14);
                f15 = f11;
                uVar = uVar3;
                f16 = f14;
            } else {
                if (uVar3 instanceof C2213q) {
                    C2213q c2213q = (C2213q) uVar3;
                    float f17 = c2213q.f18579b;
                    float f18 = c2213q.f18580c;
                    path.rLineTo(f17, f18);
                    f15 += c2213q.f18579b;
                    f16 += f18;
                } else if (uVar3 instanceof C2208l) {
                    C2208l c2208l = (C2208l) uVar3;
                    float f19 = c2208l.f18565b;
                    float f20 = c2208l.f18566c;
                    path.lineTo(f19, f20);
                    f15 = c2208l.f18565b;
                    uVar = uVar3;
                    f16 = f20;
                } else if (uVar3 instanceof C2212p) {
                    C2212p c2212p = (C2212p) uVar3;
                    path.rLineTo(c2212p.f18578b, f10);
                    f15 += c2212p.f18578b;
                } else if (uVar3 instanceof C2207k) {
                    C2207k c2207k = (C2207k) uVar3;
                    path.lineTo(c2207k.f18564b, f16);
                    f15 = c2207k.f18564b;
                } else if (uVar3 instanceof o0.s) {
                    o0.s sVar = (o0.s) uVar3;
                    path.rLineTo(f10, sVar.f18585b);
                    f16 += sVar.f18585b;
                } else if (uVar3 instanceof t) {
                    t tVar = (t) uVar3;
                    path.lineTo(f15, tVar.f18586b);
                    f16 = tVar.f18586b;
                } else {
                    if (uVar3 instanceof C2211o) {
                        C2211o c2211o = (C2211o) uVar3;
                        uVar = uVar3;
                        path.rCubicTo(c2211o.f18573b, c2211o.f18574c, c2211o.f18575d, c2211o.f18576e, c2211o.f, c2211o.f18577g);
                        f12 = c2211o.f18575d + f15;
                        f13 = c2211o.f18576e + f16;
                        f15 += c2211o.f;
                        f9 = c2211o.f18577g;
                    } else {
                        uVar = uVar3;
                        if (uVar instanceof C2206j) {
                            C2206j c2206j = (C2206j) uVar;
                            path.cubicTo(c2206j.f18559b, c2206j.f18560c, c2206j.f18561d, c2206j.f18562e, c2206j.f, c2206j.f18563g);
                            f12 = c2206j.f18561d;
                            f13 = c2206j.f18562e;
                            f5 = c2206j.f;
                            f6 = c2206j.f18563g;
                        } else if (uVar instanceof r) {
                            if (uVar2.f18587a) {
                                f8 = f16 - f13;
                                f7 = f15 - f12;
                            } else {
                                f7 = 0.0f;
                                f8 = 0.0f;
                            }
                            r rVar = (r) uVar;
                            path.rCubicTo(f7, f8, rVar.f18581b, rVar.f18582c, rVar.f18583d, rVar.f18584e);
                            f12 = rVar.f18581b + f15;
                            f13 = rVar.f18582c + f16;
                            f15 += rVar.f18583d;
                            f9 = rVar.f18584e;
                        } else {
                            if (!(uVar instanceof C2210n)) {
                                throw new D2.e();
                            }
                            if (uVar2.f18587a) {
                                float f21 = 2;
                                f15 = (f15 * f21) - f12;
                                f16 = (f21 * f16) - f13;
                            }
                            C2210n c2210n = (C2210n) uVar;
                            path.cubicTo(f15, f16, c2210n.f18569b, c2210n.f18570c, c2210n.f18571d, c2210n.f18572e);
                            f12 = c2210n.f18569b;
                            f13 = c2210n.f18570c;
                            f5 = c2210n.f18571d;
                            f6 = c2210n.f18572e;
                        }
                        f16 = f6;
                        f15 = f5;
                    }
                    f16 += f9;
                }
                uVar = uVar3;
            }
            i5++;
            uVar2 = uVar;
            f10 = 0.0f;
        }
    }

    public static String L(int i5) {
        return i5 == 0 ? "Unspecified" : i5 == 1 ? "Text" : i5 == 2 ? "Ascii" : i5 == 3 ? "Number" : i5 == 4 ? "Phone" : i5 == 5 ? "Uri" : i5 == 6 ? "Email" : i5 == 7 ? "Password" : i5 == 8 ? "NumberPassword" : i5 == 9 ? "Decimal" : "Invalid";
    }

    public static final String M(float f5) {
        if (Float.isNaN(f5)) {
            return "NaN";
        }
        if (Float.isInfinite(f5)) {
            return f5 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f6 = f5 * pow;
        int i5 = (int) f6;
        if (f6 - i5 >= 0.5f) {
            i5++;
        }
        float f7 = i5 / pow;
        return max > 0 ? String.valueOf(f7) : String.valueOf((int) f7);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [i4.a, kotlin.jvm.internal.m] */
    public static final void N(n nVar, int i5, G0.j jVar) {
        n nVar2;
        R.e eVar = new R.e(new n[16]);
        List i6 = nVar.i(false, false);
        while (true) {
            eVar.e(eVar.f5108m, i6);
            while (true) {
                int i7 = eVar.f5108m;
                if (i7 == 0) {
                    return;
                }
                nVar2 = (n) eVar.l(i7 - 1);
                if (!q.e(nVar2)) {
                    H0.v vVar = H0.s.i;
                    H0.j jVar2 = nVar2.f2114d;
                    C2321G c2321g = jVar2.f2103k;
                    if (c2321g.c(vVar)) {
                        continue;
                    } else {
                        e0 d5 = nVar2.d();
                        if (d5 == null) {
                            throw AbstractC0467k.u("Expected semantics node to have a coordinator.");
                        }
                        W0.k N5 = N4.b.N(f0.f(d5));
                        if (N5.f6011a < N5.f6013c && N5.f6012b < N5.f6014d) {
                            Object g5 = jVar2.f2103k.g(i.f2083e);
                            if (g5 == null) {
                                g5 = null;
                            }
                            i4.e eVar2 = (i4.e) g5;
                            Object g6 = c2321g.g(H0.s.f2175u);
                            H0.h hVar = (H0.h) (g6 != null ? g6 : null);
                            if (eVar2 != null && hVar != null && ((Number) hVar.f2076b.invoke()).floatValue() > 0.0f) {
                                int i8 = i5 + 1;
                                jVar.c(new G0.k(nVar2, i8, N5, d5));
                                N(nVar2, i8, jVar);
                            }
                        }
                    }
                }
            }
            i6 = nVar2.i(false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader O() {
        ClassLoader classLoader;
        SecurityException e3;
        Thread thread;
        ThreadGroup threadGroup;
        C0219b c0219b;
        synchronized (AbstractC2425d.class) {
            if (f19581a == null) {
                Thread thread2 = f19582b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i6];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i5 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i5];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i5++;
                                    }
                                    if (thread == null) {
                                        try {
                                            c0219b = new C0219b(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e5) {
                                            e3 = e5;
                                        }
                                        try {
                                            c0219b.setContextClassLoader(null);
                                            c0219b.start();
                                            thread = c0219b;
                                        } catch (SecurityException e6) {
                                            e3 = e6;
                                            thread = c0219b;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e3.getMessage());
                                            thread2 = thread;
                                            f19582b = thread2;
                                        }
                                    }
                                } catch (SecurityException e7) {
                                    e3 = e7;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    f19582b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f19582b.getContextClassLoader();
                    } catch (SecurityException e8) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e8.getMessage());
                    }
                }
                f19581a = classLoader2;
            }
            classLoader = f19581a;
        }
        return classLoader;
    }

    public static W0.d a() {
        return new W0.d(1.0f, 1.0f);
    }

    public static final long b(int i5) {
        long j5 = (i5 << 32) | (0 & 4294967295L);
        int i6 = C2344a.f19081p;
        return j5;
    }

    public static final void c(X.d dVar, C0315s c0315s, int i5) {
        C0315s c0315s2;
        int i6 = 1;
        int i7 = 3;
        int i8 = 2;
        c0315s.Z(674185128);
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
            c0315s2 = c0315s;
        } else {
            e1 e1Var = Y.h.f6114a;
            Y.f fVar = (Y.f) c0315s.j(e1Var);
            Object[] objArr = {fVar};
            v3.g gVar = new v3.g(13, H.f627l, new G(fVar, i6));
            boolean h3 = c0315s.h(fVar);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new C0040k0(i8, fVar);
                c0315s.i0(M5);
            }
            c0315s2 = c0315s;
            J j5 = (J) Y.k.b(objArr, gVar, (InterfaceC2015a) M5, c0315s2, 0, 4);
            AbstractC0329z.a(e1Var.a(j5), X.e.d(1863926504, new C0022e0(i7, j5, dVar), c0315s2), c0315s2, 56);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i5, i8, dVar);
        }
    }

    public static final I1.b d(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new I1.b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(E e3, AbstractC0540a abstractC0540a) {
        C0165s c0165s;
        int i5;
        int size;
        int i6;
        if (abstractC0540a instanceof C0165s) {
            c0165s = (C0165s) abstractC0540a;
            int i7 = c0165s.f2523m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0165s.f2523m = i7 - Integer.MIN_VALUE;
                Object obj = c0165s.f2522l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i5 = c0165s.f2523m;
                if (i5 != 0) {
                    G4.l.N(obj);
                    t0.k kVar = t0.k.f19490l;
                    c0165s.f2521k = e3;
                    c0165s.f2523m = 1;
                    obj = e3.b(kVar, c0165s);
                    if (obj == enumC0510a) {
                    }
                    j jVar = (j) obj;
                    ?? r22 = jVar.f19485a;
                    size = r22.size();
                    i6 = 0;
                    while (i6 < size) {
                    }
                    return jVar;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e3 = c0165s.f2521k;
                G4.l.N(obj);
                j jVar2 = (j) obj;
                ?? r222 = jVar2.f19485a;
                size = r222.size();
                i6 = 0;
                while (i6 < size) {
                    if (t0.q.a((s) r222.get(i6))) {
                        i6++;
                    } else {
                        t0.k kVar2 = t0.k.f19490l;
                        c0165s.f2521k = e3;
                        c0165s.f2523m = 1;
                        obj = e3.b(kVar2, c0165s);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                        j jVar22 = (j) obj;
                        ?? r2222 = jVar22.f19485a;
                        size = r2222.size();
                        i6 = 0;
                        while (i6 < size) {
                        }
                    }
                }
                return jVar22;
            }
        }
        c0165s = new C0165s(abstractC0540a);
        Object obj2 = c0165s.f2522l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = c0165s.f2523m;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(E e3, C1930k c1930k, K k5, j jVar, AbstractC0540a abstractC0540a) {
        C0166t c0166t;
        int i5;
        O o5;
        boolean z3;
        E.Z z5;
        E e5 = e3;
        C1930k c1930k2 = c1930k;
        int i6 = 0;
        int i7 = 1;
        if (abstractC0540a instanceof C0166t) {
            c0166t = (C0166t) abstractC0540a;
            int i8 = c0166t.f2527n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0166t.f2527n = i8 - Integer.MIN_VALUE;
                C0166t c0166t2 = c0166t;
                Object obj = c0166t2.f2526m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i5 = c0166t2.f2527n;
                if (i5 == 0) {
                    if (i5 == 1) {
                        C1930k c1930k3 = c0166t2.f2525l;
                        E e6 = c0166t2.f2524k;
                        G4.l.N(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ?? r1 = e6.f19444p.f19452D.f19485a;
                            int size = r1.size();
                            while (i6 < size) {
                                s sVar = (s) r1.get(i6);
                                if (t0.q.b(sVar)) {
                                    sVar.a();
                                }
                                i6++;
                            }
                        }
                        c1930k3.getClass();
                        return W3.o.f6046a;
                    }
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1930k c1930k4 = c0166t2.f2525l;
                    E e7 = c0166t2.f2524k;
                    G4.l.N(obj);
                    c1930k2 = c1930k4;
                    e5 = e7;
                    if (((Boolean) obj).booleanValue()) {
                        ?? r02 = e5.f19444p.f19452D.f19485a;
                        int size2 = r02.size();
                        while (i6 < size2) {
                            s sVar2 = (s) r02.get(i6);
                            if (t0.q.b(sVar2)) {
                                sVar2.a();
                            }
                            i6++;
                        }
                    }
                    c1930k2.getClass();
                    return W3.o.f6046a;
                }
                G4.l.N(obj);
                s sVar3 = (s) k5.f639d;
                s sVar4 = (s) jVar.f19485a.get(0);
                if (sVar3 != null) {
                    long j5 = sVar4.f19501b - sVar3.f19501b;
                    q1 q1Var = (q1) k5.f638c;
                    if (j5 < q1Var.b()) {
                        float f5 = AbstractC2557C.f20606a;
                        if (C1988b.c(C1988b.g(sVar3.f19502c, sVar4.f19502c)) < (sVar3.i == 2 ? q1Var.d() * AbstractC2557C.f20606a : q1Var.d())) {
                            k5.f637b++;
                            k5.f639d = sVar4;
                            s sVar5 = (s) jVar.f19485a.get(0);
                            int i9 = k5.f637b;
                            o1 o1Var = i9 == 1 ? i9 != 2 ? C0163p.f : C0163p.f2511e : C0163p.f2510d;
                            long j6 = sVar5.f19502c;
                            o5 = (O) c1930k2.f16910l;
                            if (o5.h() || o5.j().f4679a.f2829l.length() == 0 || (z5 = o5.f2426d) == null || z5.d() == null) {
                                z3 = false;
                            } else {
                                g0.o oVar = o5.i;
                                if (oVar != null) {
                                    oVar.a(new g0.l(i7, 3));
                                }
                                o5.f2432l = j6;
                                o5.f2437q = -1;
                                o5.f(true);
                                c1930k2.r(o5.j(), o5.f2432l, true, o1Var);
                                z3 = true;
                            }
                            if (z3) {
                                C0028g0 c0028g0 = new C0028g0(15, c1930k2, o1Var);
                                c0166t2.f2524k = e5;
                                c0166t2.f2525l = c1930k2;
                                c0166t2.f2527n = 2;
                                obj = AbstractC2557C.c(e5, sVar5.f19500a, c0028g0, c0166t2);
                                if (obj == enumC0510a) {
                                    return enumC0510a;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                                c1930k2.getClass();
                            }
                            return W3.o.f6046a;
                        }
                    }
                }
                k5.f637b = 1;
                k5.f639d = sVar4;
                s sVar52 = (s) jVar.f19485a.get(0);
                int i92 = k5.f637b;
                o1 o1Var2 = i92 == 1 ? i92 != 2 ? C0163p.f : C0163p.f2511e : C0163p.f2510d;
                long j62 = sVar52.f19502c;
                o5 = (O) c1930k2.f16910l;
                if (o5.h()) {
                }
                z3 = false;
                if (z3) {
                }
                return W3.o.f6046a;
            }
        }
        c0166t = new C0166t(abstractC0540a);
        C0166t c0166t22 = c0166t;
        Object obj2 = c0166t22.f2526m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = c0166t22.f2527n;
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r14 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ad, B:15:0x00b5, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d2, B:28:0x00d6, B:32:0x0041, B:34:0x0064, B:36:0x0068, B:38:0x0074, B:39:0x0080, B:43:0x0093, B:47:0x007c, B:49:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(E e3, InterfaceC0104i0 interfaceC0104i0, j jVar, AbstractC0540a abstractC0540a) {
        C0169w c0169w;
        int i5;
        s sVar;
        s sVar2;
        int i6 = 1;
        try {
            if (abstractC0540a instanceof C0169w) {
                c0169w = (C0169w) abstractC0540a;
                int i7 = c0169w.f2541o;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0169w.f2541o = i7 - Integer.MIN_VALUE;
                    Object obj = c0169w.f2540n;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i5 = c0169w.f2541o;
                    if (i5 != 0) {
                        G4.l.N(obj);
                        sVar = (s) m.Y(jVar.f19485a);
                        long j5 = sVar.f19500a;
                        c0169w.f2537k = e3;
                        c0169w.f2538l = interfaceC0104i0;
                        c0169w.f2539m = sVar;
                        c0169w.f2541o = 1;
                        obj = AbstractC2557C.b(e3, j5, c0169w);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0104i0 = c0169w.f2538l;
                            e3 = c0169w.f2537k;
                            G4.l.N(obj);
                            if (((Boolean) obj).booleanValue()) {
                                ?? r11 = e3.f19444p.f19452D.f19485a;
                                int size = r11.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    s sVar3 = (s) r11.get(i8);
                                    if (t0.q.b(sVar3)) {
                                        sVar3.a();
                                    }
                                }
                                interfaceC0104i0.a();
                            } else {
                                interfaceC0104i0.onCancel();
                            }
                            return W3.o.f6046a;
                        }
                        s sVar4 = c0169w.f2539m;
                        interfaceC0104i0 = c0169w.f2538l;
                        E e5 = c0169w.f2537k;
                        G4.l.N(obj);
                        sVar = sVar4;
                        e3 = e5;
                    }
                    sVar2 = (s) obj;
                    if (sVar2 != null) {
                        long j6 = sVar2.f19502c;
                        q1 f5 = e3.f();
                        int i9 = sVar.i;
                        float f6 = AbstractC2557C.f20606a;
                        if (C1988b.c(C1988b.g(sVar.f19502c, j6)) < (i9 == 2 ? f5.d() * AbstractC2557C.f20606a : f5.d())) {
                            interfaceC0104i0.c(j6);
                            long j7 = sVar2.f19500a;
                            C0094d0 c0094d0 = new C0094d0(interfaceC0104i0, i6);
                            c0169w.f2537k = e3;
                            c0169w.f2538l = interfaceC0104i0;
                            c0169w.f2539m = null;
                            c0169w.f2541o = 2;
                            obj = AbstractC2557C.c(e3, j7, c0094d0, c0169w);
                        }
                    }
                    return W3.o.f6046a;
                }
            }
            if (i5 != 0) {
            }
            sVar2 = (s) obj;
            if (sVar2 != null) {
            }
            return W3.o.f6046a;
        } catch (CancellationException e6) {
            interfaceC0104i0.onCancel();
            throw e6;
        }
        c0169w = new C0169w(abstractC0540a);
        Object obj2 = c0169w.f2540n;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = c0169w.f2541o;
    }

    public static final void h(C2321G c2321g, Object obj, Object obj2) {
        int f5 = c2321g.f(obj);
        boolean z3 = f5 < 0;
        Object obj3 = z3 ? null : c2321g.f18930c[f5];
        if (obj3 != null) {
            if (obj3 instanceof C2322H) {
                ((C2322H) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C2322H c2322h = new C2322H();
                c2322h.a(obj3);
                c2322h.a(obj2);
                obj2 = c2322h;
            }
            obj2 = obj3;
        }
        if (!z3) {
            c2321g.f18930c[f5] = obj2;
            return;
        }
        int i5 = ~f5;
        c2321g.f18929b[i5] = obj;
        c2321g.f18930c[i5] = obj2;
    }

    public static final void i(u0.c cVar, s sVar) {
        boolean a5 = t0.q.a(sVar);
        long j5 = 0;
        C1036gn c1036gn = cVar.f19980b;
        C1036gn c1036gn2 = cVar.f19979a;
        if (a5) {
            X3.l.B0(r2, 0, ((C2479a[]) c1036gn2.f13651d).length);
            c1036gn2.f13649b = 0;
            X3.l.B0(r2, 0, ((C2479a[]) c1036gn.f13651d).length);
            c1036gn.f13649b = 0;
            cVar.f19981c = 0L;
        }
        boolean c5 = t0.q.c(sVar);
        long j6 = sVar.f19501b;
        if (!c5) {
            List list = sVar.f19508k;
            if (list == null) {
                list = X3.v.f6090k;
            }
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                C2406c c2406c = (C2406c) list.get(i5);
                long j7 = c2406c.f19462a;
                long h3 = C1988b.h(c2406c.f19464c, j5);
                c1036gn2.a(Float.intBitsToFloat((int) (h3 >> 32)), j7);
                c1036gn.a(Float.intBitsToFloat((int) (h3 & 4294967295L)), j7);
                i5++;
                j5 = 0;
            }
            long h4 = C1988b.h(sVar.f19509l, 0L);
            c1036gn2.a(Float.intBitsToFloat((int) (h4 >> 32)), j6);
            c1036gn.a(Float.intBitsToFloat((int) (h4 & 4294967295L)), j6);
        }
        if (t0.q.c(sVar) && j6 - cVar.f19981c > 40) {
            X3.l.B0(r1, 0, ((C2479a[]) c1036gn2.f13651d).length);
            c1036gn2.f13649b = 0;
            X3.l.B0(r1, 0, ((C2479a[]) c1036gn.f13651d).length);
            c1036gn.f13649b = 0;
            cVar.f19981c = 0L;
        }
        cVar.f19981c = j6;
    }

    public static void j(Throwable th, Throwable th2) {
        l.f("<this>", th);
        l.f("exception", th2);
        if (th != th2) {
            Integer num = AbstractC1953a.f17010a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1936a.f16918a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void k(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final Bundle l(W3.h... hVarArr) {
        Bundle bundle = new Bundle(hVarArr.length);
        for (W3.h hVar : hVarArr) {
            String str = (String) hVar.f6036k;
            Object obj = hVar.f6037l;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                l.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static String m(int i5, int i6) {
        W3.h[] hVarArr = {new W3.h("leagueKey", Integer.valueOf(i5)), new W3.h("yearKey", Integer.valueOf(i6))};
        String str = "appR/navigator/fixture_schedule/{leagueKey}/{yearKey}";
        for (int i7 = 0; i7 < 2; i7++) {
            W3.h hVar = hVarArr[i7];
            str = AbstractC2234l.v0(str, "{" + hVar.f6036k + "}", String.valueOf(((Number) hVar.f6037l).intValue()));
        }
        return str;
    }

    public static C2321G o() {
        long[] jArr = r.O.f18957a;
        return new C2321G();
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = C.f18360a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C2159B.f18356d;
        C2159B c2159b = (C2159B) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c2159b == null) {
            c2159b = new C2159B();
            c2159b.f18357a = null;
            c2159b.f18358b = null;
            c2159b.f18359c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2159b);
        }
        WeakReference weakReference2 = c2159b.f18359c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c2159b.f18359c = new WeakReference(keyEvent);
        if (c2159b.f18358b == null) {
            c2159b.f18358b = new SparseArray();
        }
        SparseArray sparseArray = c2159b.f18358b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final float q(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            f5 += fArr[i5] * fArr2[i5];
        }
        return f5;
    }

    public static final int s(Bitmap bitmap) {
        int i5;
        Bitmap.Config config;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == Bitmap.Config.ALPHA_8) {
                i5 = 1;
            } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                i5 = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config2 == config) {
                        i5 = 8;
                    }
                }
                i5 = 4;
            }
            return height * i5;
        }
    }

    public static final int t(O0.l lVar, int i5) {
        boolean z3 = l.g(lVar.f4033k, O0.l.f4026l.f4033k) >= 0;
        boolean z5 = i5 == 1;
        if (z5 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return z5 ? 2 : 0;
    }

    public static final C2201e u() {
        C2201e c2201e = f19583c;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Check", false);
        int i5 = z.f18603a;
        M m5 = new M(i0.p.f17289b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2209m(9.0f, 16.17f));
        arrayList.add(new C2208l(4.83f, 12.0f));
        arrayList.add(new C2213q(-1.42f, 1.41f));
        arrayList.add(new C2208l(9.0f, 19.0f));
        arrayList.add(new C2208l(21.0f, 7.0f));
        arrayList.add(new C2213q(-1.41f, -1.41f));
        arrayList.add(C2205i.f18558b);
        C2200d.a(c2200d, arrayList, m5);
        C2201e b3 = c2200d.b();
        f19583c = b3;
        return b3;
    }

    public static final C2201e v() {
        C2201e c2201e = f19584d;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Flag", false);
        int i5 = z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(14.4f, 6.0f);
        c2202f.k(14.0f, 4.0f);
        c2202f.i(5.0f);
        c2202f.r(17.0f);
        c2202f.j(2.0f);
        c2202f.r(-7.0f);
        c2202f.j(5.6f);
        c2202f.l(0.4f, 2.0f);
        c2202f.j(7.0f);
        c2202f.q(6.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f19584d = b3;
        return b3;
    }

    public static final C2201e w() {
        C2201e c2201e = f19585e;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Person", false);
        int i5 = z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 12.0f);
        c2202f.g(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        c2202f.o(-1.79f, -4.0f, -4.0f, -4.0f);
        c2202f.o(-4.0f, 1.79f, -4.0f, 4.0f);
        c2202f.o(1.79f, 4.0f, 4.0f, 4.0f);
        c2202f.e();
        c2202f.m(12.0f, 14.0f);
        c2202f.g(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        c2202f.r(2.0f);
        c2202f.j(16.0f);
        c2202f.r(-2.0f);
        c2202f.g(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f19585e = b3;
        return b3;
    }

    public static final long x(C1930k c1930k) {
        DragEvent dragEvent = (DragEvent) c1930k.f16910l;
        float x5 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (Float.floatToRawIntBits(x5) << 32) | (Float.floatToRawIntBits(y5) & 4294967295L);
    }

    public static boolean y() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0456a.a();
        }
        try {
            if (f19587h == null) {
                f19586g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f19587h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f19587h.invoke(null, Long.valueOf(f19586g))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean z(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public abstract List n(String str, List list);

    public void r(f2.n nVar) {
        List singletonList = Collections.singletonList(nVar);
        g2.l lVar = (g2.l) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        C1981e c1981e = new C1981e(lVar, singletonList);
        if (c1981e.f17112r) {
            f2.m.d().h(C1981e.f17107s, L1.a.n("Already enqueued work ids (", TextUtils.join(", ", c1981e.f17110p), ")"), new Throwable[0]);
        } else {
            lVar.f17131n.t(new RunnableC2246d(c1981e));
        }
    }
}
