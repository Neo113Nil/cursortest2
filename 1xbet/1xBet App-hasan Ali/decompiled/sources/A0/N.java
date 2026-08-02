package A0;

import K0.C0203h;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import game.betting133.sports1xbet.R;
import h0.C1988b;
import h0.C1989c;
import h0.C1990d;
import i0.C1994A;
import i0.C1995B;
import i0.C2003h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k0.C2023c;
import n.AbstractC2107A;
import n1.AbstractC2176q;
import n1.C2161b;
import o1.C2218e;
import r.AbstractC2331i;
import r.AbstractC2332j;
import r.AbstractC2333k;
import r.AbstractC2334l;
import r.AbstractC2335m;
import r.C2321G;
import r.C2328f;
import r.C2341t;
import r.C2342u;
import r.C2343v;
import r0.AbstractC2346c;
import s.AbstractC2351a;
import z0.C2731G;

/* loaded from: classes.dex */
public final class N extends C2161b {

    /* renamed from: Q, reason: collision with root package name */
    public static final C2342u f331Q;

    /* renamed from: A, reason: collision with root package name */
    public boolean f332A;

    /* renamed from: B, reason: collision with root package name */
    public K f333B;

    /* renamed from: C, reason: collision with root package name */
    public C2343v f334C;

    /* renamed from: D, reason: collision with root package name */
    public final r.w f335D;

    /* renamed from: E, reason: collision with root package name */
    public final C2341t f336E;

    /* renamed from: F, reason: collision with root package name */
    public final C2341t f337F;

    /* renamed from: G, reason: collision with root package name */
    public final String f338G;

    /* renamed from: H, reason: collision with root package name */
    public final String f339H;

    /* renamed from: I, reason: collision with root package name */
    public final v3.e f340I;
    public final C2343v J;
    public C0041k1 K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f341L;

    /* renamed from: M, reason: collision with root package name */
    public final C2341t f342M;

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC0049o f343N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f344O;

    /* renamed from: P, reason: collision with root package name */
    public final M f345P;

    /* renamed from: d, reason: collision with root package name */
    public final F f346d;

    /* renamed from: e, reason: collision with root package name */
    public int f347e = Integer.MIN_VALUE;
    public final M f;

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f348g;

    /* renamed from: h, reason: collision with root package name */
    public long f349h;
    public final G i;

    /* renamed from: j, reason: collision with root package name */
    public final H f350j;

    /* renamed from: k, reason: collision with root package name */
    public List f351k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f352l;

    /* renamed from: m, reason: collision with root package name */
    public final J f353m;

    /* renamed from: n, reason: collision with root package name */
    public int f354n;

    /* renamed from: o, reason: collision with root package name */
    public int f355o;

    /* renamed from: p, reason: collision with root package name */
    public C2218e f356p;

    /* renamed from: q, reason: collision with root package name */
    public C2218e f357q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f358r;

    /* renamed from: s, reason: collision with root package name */
    public final C2343v f359s;

    /* renamed from: t, reason: collision with root package name */
    public final C2343v f360t;

    /* renamed from: u, reason: collision with root package name */
    public final r.S f361u;

    /* renamed from: v, reason: collision with root package name */
    public final r.S f362v;

    /* renamed from: w, reason: collision with root package name */
    public int f363w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f364x;

    /* renamed from: y, reason: collision with root package name */
    public final C2328f f365y;

    /* renamed from: z, reason: collision with root package name */
    public final r4.c f366z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = AbstractC2332j.f19010a;
        C2342u c2342u = new C2342u(32);
        int i5 = c2342u.f19051b;
        if (i5 < 0) {
            AbstractC2351a.d("");
            throw null;
        }
        int i6 = i5 + 32;
        c2342u.b(i6);
        int[] iArr2 = c2342u.f19050a;
        int i7 = c2342u.f19051b;
        if (i5 != i7) {
            X3.l.s0(i6, i5, i7, iArr2, iArr2);
        }
        X3.l.x0(i5, 0, 12, iArr, iArr2);
        c2342u.f19051b += 32;
        f331Q = c2342u;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [A0.G] */
    /* JADX WARN: Type inference failed for: r4v4, types: [A0.H] */
    public N(F f) {
        this.f346d = f;
        int i = 0;
        this.f = new M(this, i);
        Object systemService = f.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f348g = accessibilityManager;
        this.f349h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: A0.G
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                N n5 = N.this;
                n5.f351k = z3 ? n5.f348g.getEnabledAccessibilityServiceList(-1) : X3.v.f6090k;
            }
        };
        this.f350j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: A0.H
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                N n5 = N.this;
                n5.f351k = n5.f348g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f351k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f352l = new Handler(Looper.getMainLooper());
        this.f353m = new J(this);
        this.f354n = Integer.MIN_VALUE;
        this.f355o = Integer.MIN_VALUE;
        this.f359s = new C2343v();
        this.f360t = new C2343v();
        this.f361u = new r.S(0);
        this.f362v = new r.S(0);
        this.f363w = -1;
        this.f365y = new C2328f(0);
        this.f366z = r4.j.a(1, 6, null);
        this.f332A = true;
        C2343v c2343v = AbstractC2334l.f19016a;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c2343v);
        this.f334C = c2343v;
        this.f335D = new r.w();
        this.f336E = new C2341t();
        this.f337F = new C2341t();
        this.f338G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f339H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f340I = new v3.e(9);
        this.J = new C2343v();
        H0.n a5 = f.getSemanticsOwner().a();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c2343v);
        this.K = new C0041k1(a5, c2343v);
        int i5 = AbstractC2331i.f19009a;
        this.f342M = new C2341t();
        f.addOnAttachStateChangeListener(new I(i, this));
        this.f343N = new RunnableC0049o(2, this);
        this.f344O = new ArrayList();
        this.f345P = new M(this, 1);
    }

    public static Rect G(i0.D d5) {
        if (!(d5 instanceof C1995B) && !(d5 instanceof i0.C)) {
            return null;
        }
        C1989c a5 = d5.a();
        return new Rect((int) a5.f17193a, (int) a5.f17194b, (int) a5.f17195c, (int) a5.f17196d);
    }

    public static float[] H(i0.D d5) {
        if (!(d5 instanceof i0.C)) {
            return null;
        }
        i0.C c5 = (i0.C) d5;
        float intBitsToFloat = Float.intBitsToFloat((int) (c5.f17220a.f17201e >> 32));
        C1990d c1990d = c5.f17220a;
        return new float[]{intBitsToFloat, Float.intBitsToFloat((int) (c1990d.f17201e & 4294967295L)), Float.intBitsToFloat((int) (c1990d.f >> 32)), Float.intBitsToFloat((int) (c1990d.f & 4294967295L)), Float.intBitsToFloat((int) (c1990d.f17202g >> 32)), Float.intBitsToFloat((int) (c1990d.f17202g & 4294967295L)), Float.intBitsToFloat((int) (c1990d.f17203h >> 32)), Float.intBitsToFloat((int) (4294967295L & c1990d.f17203h))};
    }

    public static Region I(i0.D d5) {
        if (!(d5 instanceof C1994A)) {
            return null;
        }
        C1994A c1994a = (C1994A) d5;
        C1989c a5 = c1994a.f17218a.a();
        Region region = new Region(new Rect((int) a5.f17193a, (int) a5.f17194b, (int) a5.f17195c, (int) a5.f17196d));
        Region region2 = new Region();
        C2003h c2003h = c1994a.f17218a;
        if (!AbstractC2107A.A(c2003h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(c2003h.f17279a, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize", subSequence);
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String p(H0.n nVar) {
        C0203h c0203h;
        if (nVar != null) {
            H0.v vVar = H0.s.f2157a;
            H0.j jVar = nVar.f2114d;
            C2321G c2321g = jVar.f2103k;
            if (c2321g.c(vVar)) {
                return Y0.a.a((List) jVar.d(vVar), ",", null, 62);
            }
            H0.v vVar2 = H0.s.f2148E;
            if (c2321g.c(vVar2)) {
                Object g5 = c2321g.g(vVar2);
                if (g5 == null) {
                    g5 = null;
                }
                C0203h c0203h2 = (C0203h) g5;
                if (c0203h2 != null) {
                    return c0203h2.f2829l;
                }
            } else {
                Object g6 = c2321g.g(H0.s.f2144A);
                if (g6 == null) {
                    g6 = null;
                }
                List list = (List) g6;
                if (list != null && (c0203h = (C0203h) X3.m.Z(list)) != null) {
                    return c0203h.f2829l;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [i4.a, kotlin.jvm.internal.m] */
    public static final boolean s(H0.h hVar, float f) {
        ?? r22 = hVar.f2075a;
        if (f >= 0.0f || ((Number) r22.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) r22.invoke()).floatValue() < ((Number) hVar.f2076b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [i4.a, kotlin.jvm.internal.m] */
    public static final boolean t(H0.h hVar) {
        ?? r02 = hVar.f2075a;
        if (((Number) r02.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) hVar.f2076b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [i4.a, kotlin.jvm.internal.m] */
    public static final boolean u(H0.h hVar) {
        ?? r02 = hVar.f2075a;
        if (((Number) r02.invoke()).floatValue() < ((Number) hVar.f2076b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(N n5, int i, int i5, Integer num, int i6) {
        if ((i6 & 4) != 0) {
            num = null;
        }
        n5.y(i, i5, num, null);
    }

    public final void A(int i, int i5, String str) {
        AccessibilityEvent j5 = j(v(i), 32);
        j5.setContentChangeTypes(i5);
        if (str != null) {
            j5.getText().add(str);
        }
        x(j5);
    }

    public final void B(int i) {
        K k5 = this.f333B;
        if (k5 != null) {
            H0.n nVar = k5.f308a;
            if (i != nVar.f2116g) {
                return;
            }
            if (SystemClock.uptimeMillis() - k5.f <= 1000) {
                AccessibilityEvent j5 = j(v(nVar.f2116g), 131072);
                j5.setFromIndex(k5.f311d);
                j5.setToIndex(k5.f312e);
                j5.setAction(k5.f309b);
                j5.setMovementGranularity(k5.f310c);
                j5.getText().add(p(nVar));
                x(j5);
            }
        }
        this.f333B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0502, code lost:
    
        if (r1 != null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0507, code lost:
    
        if (r1 == null) goto L241;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(AbstractC2333k abstractC2333k) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i8;
        int i9;
        int i10;
        char c5;
        int i11;
        H0.j jVar;
        int i12;
        int i13;
        int i14;
        int i15;
        H0.j jVar2;
        ArrayList arrayList3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C0038j1 c0038j1;
        int i22;
        H0.v vVar;
        C0038j1 c0038j12;
        int i23;
        boolean z3;
        String str;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        AccessibilityEvent l5;
        Object obj;
        int i31;
        N n5 = this;
        AbstractC2333k abstractC2333k2 = abstractC2333k;
        ArrayList arrayList4 = n5.f344O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC2333k2.f19012b;
        long[] jArr3 = abstractC2333k2.f19011a;
        int i32 = 2;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i33 = 0;
        while (true) {
            long j5 = jArr3[i33];
            char c6 = 7;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i34 = 8;
                int i35 = 8 - ((~(i33 - length)) >>> 31);
                long j6 = j5;
                int i36 = 0;
                while (i36 < i35) {
                    if ((j6 & 255) < 128) {
                        int i37 = iArr3[(i33 << 3) + i36];
                        C0041k1 c0041k1 = (C0041k1) n5.J.b(i37);
                        if (c0041k1 != null) {
                            i8 = i32;
                            H0.o oVar = (H0.o) abstractC2333k2.b(i37);
                            c5 = c6;
                            H0.n nVar = oVar != null ? oVar.f2117a : null;
                            if (nVar == null) {
                                throw AbstractC0467k.u("no value for specified key");
                            }
                            int i38 = 0;
                            H0.j jVar3 = nVar.f2114d;
                            C2321G c2321g = jVar3.f2103k;
                            int i39 = i34;
                            Object[] objArr = c2321g.f18929b;
                            Object[] objArr2 = c2321g.f18930c;
                            long[] jArr4 = c2321g.f18928a;
                            i7 = i36;
                            int length2 = jArr4.length - 2;
                            H0.j jVar4 = c0041k1.f526a;
                            if (length2 >= 0) {
                                int i40 = i35;
                                int i41 = 0;
                                i13 = 0;
                                while (true) {
                                    long j7 = jArr4[i41];
                                    iArr2 = iArr3;
                                    jArr2 = jArr3;
                                    if ((((~j7) << c5) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i42 = 8 - ((~(i41 - length2)) >>> 31);
                                        long j8 = j7;
                                        int i43 = i38;
                                        while (i43 < i42) {
                                            if ((j8 & 255) < 128) {
                                                int i44 = (i41 << 3) + i43;
                                                Object obj2 = objArr[i44];
                                                Object obj3 = objArr2[i44];
                                                H0.v vVar2 = (H0.v) obj2;
                                                int i45 = length2;
                                                H0.v vVar3 = H0.s.f2174t;
                                                if (kotlin.jvm.internal.l.a(vVar2, vVar3)) {
                                                    i16 = i43;
                                                } else {
                                                    i16 = i43;
                                                    if (!kotlin.jvm.internal.l.a(vVar2, H0.s.f2175u)) {
                                                        i17 = length;
                                                        i22 = i38;
                                                        C2321G c2321g2 = jVar4.f2103k;
                                                        if (i22 == 0) {
                                                            Object g5 = c2321g2.g(vVar2);
                                                            if (g5 == null) {
                                                                g5 = null;
                                                            }
                                                            if (kotlin.jvm.internal.l.a(obj3, g5)) {
                                                                i21 = i37;
                                                                jVar2 = jVar4;
                                                                arrayList3 = arrayList5;
                                                                i18 = i33;
                                                                i19 = i39;
                                                                i20 = i40;
                                                                i15 = i45;
                                                            }
                                                        }
                                                        vVar = H0.s.f2160d;
                                                        if (!kotlin.jvm.internal.l.a(vVar2, vVar)) {
                                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj3);
                                                            String str2 = (String) obj3;
                                                            if (c2321g2.c(vVar)) {
                                                                n5.A(i37, i39, str2);
                                                            }
                                                            i21 = i37;
                                                            jVar2 = jVar4;
                                                            arrayList3 = arrayList5;
                                                            i18 = i33;
                                                            i20 = i40;
                                                            i15 = i45;
                                                            i19 = 8;
                                                        } else if (kotlin.jvm.internal.l.a(vVar2, H0.s.f2158b) || kotlin.jvm.internal.l.a(vVar2, H0.s.f2152I)) {
                                                            i21 = i37;
                                                            jVar2 = jVar4;
                                                            arrayList3 = arrayList5;
                                                            i18 = i33;
                                                            i20 = i40;
                                                            i15 = i45;
                                                            i19 = 8;
                                                            z(n5, n5.v(i21), 2048, 64, 8);
                                                            z(n5, n5.v(i21), 2048, 0, 8);
                                                        } else if (kotlin.jvm.internal.l.a(vVar2, H0.s.f2159c)) {
                                                            i19 = 8;
                                                            z(n5, n5.v(i37), 2048, 64, 8);
                                                            z(n5, n5.v(i37), 2048, Integer.valueOf(i38), 8);
                                                            i21 = i37;
                                                            jVar2 = jVar4;
                                                            arrayList3 = arrayList5;
                                                            i18 = i33;
                                                            i20 = i40;
                                                            i15 = i45;
                                                        } else {
                                                            H0.v vVar4 = H0.s.f2151H;
                                                            boolean a5 = kotlin.jvm.internal.l.a(vVar2, vVar4);
                                                            jVar2 = jVar4;
                                                            C2731G c2731g = nVar.f2113c;
                                                            arrayList3 = arrayList5;
                                                            if (a5) {
                                                                Object g6 = c2321g.g(H0.s.f2178x);
                                                                if (g6 == null) {
                                                                    g6 = null;
                                                                }
                                                                H0.g gVar = (H0.g) g6;
                                                                if (((gVar != null && gVar.f2074a == 4) ? 1 : i38) != 0) {
                                                                    Object g7 = c2321g.g(vVar4);
                                                                    if (g7 == null) {
                                                                        g7 = null;
                                                                    }
                                                                    if (kotlin.jvm.internal.l.a(g7, Boolean.TRUE)) {
                                                                        AccessibilityEvent j9 = n5.j(n5.v(i37), 4);
                                                                        H0.n nVar2 = new H0.n(nVar.f2111a, true, c2731g, jVar3);
                                                                        Object g8 = nVar2.k().f2103k.g(H0.s.f2157a);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        List list = (List) g8;
                                                                        String a6 = list != null ? Y0.a.a(list, ",", null, 62) : null;
                                                                        Object g9 = nVar2.k().f2103k.g(H0.s.f2144A);
                                                                        if (g9 == null) {
                                                                            g9 = null;
                                                                        }
                                                                        List list2 = (List) g9;
                                                                        obj = null;
                                                                        String a7 = list2 != null ? Y0.a.a(list2, ",", null, 62) : null;
                                                                        if (a6 != null) {
                                                                            j9.setContentDescription(a6);
                                                                        }
                                                                        if (a7 != null) {
                                                                            j9.getText().add(a7);
                                                                        }
                                                                        n5.x(j9);
                                                                        i31 = 8;
                                                                    } else {
                                                                        obj = null;
                                                                        i31 = 8;
                                                                        z(n5, n5.v(i37), 2048, Integer.valueOf(i38), 8);
                                                                    }
                                                                } else {
                                                                    obj = null;
                                                                    i31 = 8;
                                                                    z(n5, n5.v(i37), 2048, 64, 8);
                                                                    z(n5, n5.v(i37), 2048, Integer.valueOf(i38), 8);
                                                                }
                                                                i21 = i37;
                                                                i19 = i31;
                                                                i18 = i33;
                                                            } else if (kotlin.jvm.internal.l.a(vVar2, H0.s.f2157a)) {
                                                                int v4 = n5.v(i37);
                                                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", obj3);
                                                                n5.y(v4, 2048, 4, (List) obj3);
                                                                i21 = i37;
                                                                i18 = i33;
                                                                i19 = 8;
                                                            } else {
                                                                H0.v vVar5 = H0.s.f2148E;
                                                                String str3 = "";
                                                                if (kotlin.jvm.internal.l.a(vVar2, vVar5)) {
                                                                    if (c2321g.c(H0.i.f2086j)) {
                                                                        Object g10 = c2321g2.g(vVar5);
                                                                        if (g10 == null) {
                                                                            g10 = null;
                                                                        }
                                                                        C0203h c0203h = (C0203h) g10;
                                                                        if (c0203h == null) {
                                                                            c0203h = "";
                                                                        }
                                                                        Object g11 = c2321g.g(vVar5);
                                                                        if (g11 == null) {
                                                                            g11 = null;
                                                                        }
                                                                        CharSequence charSequence = (C0203h) g11;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence J = J(charSequence);
                                                                        int length3 = c0203h.length();
                                                                        int length4 = charSequence.length();
                                                                        int i46 = length3 > length4 ? length4 : length3;
                                                                        int i47 = i38;
                                                                        while (true) {
                                                                            i26 = length4;
                                                                            if (i47 >= i46) {
                                                                                i27 = i46;
                                                                                break;
                                                                            }
                                                                            i27 = i46;
                                                                            if (c0203h.charAt(i47) != charSequence.charAt(i47)) {
                                                                                break;
                                                                            }
                                                                            i47++;
                                                                            length4 = i26;
                                                                            i46 = i27;
                                                                        }
                                                                        int i48 = i38;
                                                                        while (true) {
                                                                            if (i48 >= i27 - i47) {
                                                                                i28 = i48;
                                                                                break;
                                                                            }
                                                                            i28 = i48;
                                                                            if (c0203h.charAt((length3 - 1) - i48) != charSequence.charAt((i26 - 1) - i28)) {
                                                                                break;
                                                                            } else {
                                                                                i48 = i28 + 1;
                                                                            }
                                                                        }
                                                                        int i49 = (length3 - i28) - i47;
                                                                        int i50 = (i26 - i28) - i47;
                                                                        H0.v vVar6 = H0.s.J;
                                                                        boolean c7 = c2321g2.c(vVar6);
                                                                        boolean c8 = c2321g.c(vVar6);
                                                                        boolean c9 = c2321g2.c(H0.s.f2148E);
                                                                        int i51 = (c9 && !c7 && c8) ? 1 : i38;
                                                                        int i52 = (c9 && c7 && !c8) ? 1 : i38;
                                                                        if (i51 == 0 && i52 == 0) {
                                                                            i29 = i52;
                                                                            i30 = i51;
                                                                            l5 = n5.j(n5.v(i37), 16);
                                                                            l5.setFromIndex(i47);
                                                                            l5.setRemovedCount(i49);
                                                                            l5.setAddedCount(i50);
                                                                            l5.setBeforeText(c0203h);
                                                                            l5.getText().add(J);
                                                                            i24 = i37;
                                                                            i25 = 8;
                                                                        } else {
                                                                            i29 = i52;
                                                                            i30 = i51;
                                                                            i24 = i37;
                                                                            i25 = 8;
                                                                            l5 = n5.l(n5.v(i37), Integer.valueOf(i38), Integer.valueOf(i38), Integer.valueOf(i26), J);
                                                                        }
                                                                        l5.setClassName("android.widget.EditText");
                                                                        n5.x(l5);
                                                                        if (i30 != 0 || i29 != 0) {
                                                                            long j10 = ((K0.N) jVar3.d(H0.s.f2149F)).f2803a;
                                                                            l5.setFromIndex((int) (j10 >> 32));
                                                                            l5.setToIndex((int) (j10 & 4294967295L));
                                                                            n5.x(l5);
                                                                        }
                                                                    } else {
                                                                        i24 = i37;
                                                                        i25 = 8;
                                                                        z(n5, n5.v(i24), 2048, Integer.valueOf(i8), 8);
                                                                    }
                                                                    i19 = i25;
                                                                    i18 = i33;
                                                                    i15 = i45;
                                                                    i21 = i24;
                                                                    i20 = i40;
                                                                } else {
                                                                    i15 = i45;
                                                                    H0.v vVar7 = H0.s.f2149F;
                                                                    boolean a8 = kotlin.jvm.internal.l.a(vVar2, vVar7);
                                                                    i18 = i33;
                                                                    int i53 = nVar.f2116g;
                                                                    if (a8) {
                                                                        Object g12 = c2321g.g(vVar5);
                                                                        if (g12 == null) {
                                                                            g12 = null;
                                                                        }
                                                                        C0203h c0203h2 = (C0203h) g12;
                                                                        if (c0203h2 != null && (str = c0203h2.f2829l) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        K0.N n6 = (K0.N) jVar3.d(vVar7);
                                                                        int v5 = n5.v(i37);
                                                                        long j11 = n6.f2803a;
                                                                        i21 = i37;
                                                                        i20 = i40;
                                                                        n5 = this;
                                                                        n5.x(n5.l(v5, Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (j11 & 4294967295L)), Integer.valueOf(str3.length()), J(str3)));
                                                                        n5.B(i53);
                                                                    } else {
                                                                        i21 = i37;
                                                                        i20 = i40;
                                                                        if (kotlin.jvm.internal.l.a(vVar2, vVar3) || kotlin.jvm.internal.l.a(vVar2, H0.s.f2175u)) {
                                                                            n5.r(c2731g);
                                                                            int size = arrayList4.size();
                                                                            int i54 = 0;
                                                                            while (true) {
                                                                                if (i54 >= size) {
                                                                                    c0038j12 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((C0038j1) arrayList4.get(i54)).f518k == i21) {
                                                                                        c0038j12 = (C0038j1) arrayList4.get(i54);
                                                                                        break;
                                                                                    }
                                                                                    i54++;
                                                                                }
                                                                            }
                                                                            kotlin.jvm.internal.l.c(c0038j12);
                                                                            Object g13 = c2321g.g(vVar3);
                                                                            if (g13 == null) {
                                                                                g13 = null;
                                                                            }
                                                                            c0038j12.f522o = (H0.h) g13;
                                                                            Object g14 = c2321g.g(H0.s.f2175u);
                                                                            if (g14 == null) {
                                                                                g14 = null;
                                                                            }
                                                                            c0038j12.f523p = (H0.h) g14;
                                                                            if (c0038j12.f519l.contains(c0038j12)) {
                                                                                n5.f346d.getSnapshotObserver().a(c0038j12, n5.f345P, new C0060u(1, c0038j12, n5));
                                                                            }
                                                                        } else if (kotlin.jvm.internal.l.a(vVar2, H0.s.f2165k)) {
                                                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", obj3);
                                                                            if (((Boolean) obj3).booleanValue()) {
                                                                                i19 = 8;
                                                                                n5.x(n5.j(n5.v(i53), 8));
                                                                            } else {
                                                                                i19 = 8;
                                                                            }
                                                                            z(n5, n5.v(i53), 2048, Integer.valueOf(i38), i19);
                                                                        } else {
                                                                            H0.v vVar8 = H0.i.f2099w;
                                                                            if (kotlin.jvm.internal.l.a(vVar2, vVar8)) {
                                                                                List list3 = (List) jVar3.d(vVar8);
                                                                                Object g15 = c2321g2.g(vVar8);
                                                                                if (g15 == null) {
                                                                                    g15 = null;
                                                                                }
                                                                                List list4 = (List) g15;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(i38).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(i38).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    i23 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? i38 : 1;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i13 = 1;
                                                                                }
                                                                            } else {
                                                                                if (obj3 instanceof H0.a) {
                                                                                    H0.a aVar = (H0.a) obj3;
                                                                                    Object g16 = c2321g2.g(vVar2);
                                                                                    if (g16 == null) {
                                                                                        g16 = null;
                                                                                    }
                                                                                    if (aVar != g16) {
                                                                                        if (g16 instanceof H0.a) {
                                                                                            H0.a aVar2 = (H0.a) g16;
                                                                                            if (kotlin.jvm.internal.l.a(aVar.f2062a, aVar2.f2062a)) {
                                                                                                W3.c cVar = aVar2.f2063b;
                                                                                                W3.c cVar2 = aVar.f2063b;
                                                                                                if (cVar2 == null) {
                                                                                                }
                                                                                                if (cVar2 != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        z3 = false;
                                                                                        if (z3) {
                                                                                            i23 = 0;
                                                                                        }
                                                                                    }
                                                                                    z3 = true;
                                                                                    if (z3) {
                                                                                    }
                                                                                }
                                                                                i23 = 1;
                                                                            }
                                                                            i13 = i23;
                                                                        }
                                                                    }
                                                                    i19 = 8;
                                                                }
                                                            }
                                                            i20 = i40;
                                                            i15 = i45;
                                                        }
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                i17 = length;
                                                int i55 = i38;
                                                while (true) {
                                                    if (i55 >= size2) {
                                                        c0038j1 = null;
                                                        break;
                                                    }
                                                    int i56 = size2;
                                                    if (((C0038j1) arrayList5.get(i55)).f518k == i37) {
                                                        c0038j1 = (C0038j1) arrayList5.get(i55);
                                                        break;
                                                    } else {
                                                        i55++;
                                                        size2 = i56;
                                                    }
                                                }
                                                if (c0038j1 != null) {
                                                    i22 = i38;
                                                } else {
                                                    c0038j1 = new C0038j1(i37, arrayList4);
                                                    i22 = 1;
                                                }
                                                arrayList4.add(c0038j1);
                                                C2321G c2321g22 = jVar4.f2103k;
                                                if (i22 == 0) {
                                                }
                                                vVar = H0.s.f2160d;
                                                if (!kotlin.jvm.internal.l.a(vVar2, vVar)) {
                                                }
                                            } else {
                                                i15 = length2;
                                                jVar2 = jVar4;
                                                arrayList3 = arrayList5;
                                                i16 = i43;
                                                i17 = length;
                                                i18 = i33;
                                                i19 = i39;
                                                i20 = i40;
                                                i21 = i37;
                                            }
                                            j8 >>= i19;
                                            i43 = i16 + 1;
                                            i39 = i19;
                                            i40 = i20;
                                            i37 = i21;
                                            length = i17;
                                            jVar4 = jVar2;
                                            arrayList5 = arrayList3;
                                            i33 = i18;
                                            length2 = i15;
                                            i38 = 0;
                                        }
                                        int i57 = length2;
                                        jVar = jVar4;
                                        arrayList2 = arrayList5;
                                        i9 = length;
                                        i10 = i33;
                                        i11 = i40;
                                        i12 = i37;
                                        if (i42 != i39) {
                                            break;
                                        } else {
                                            length2 = i57;
                                        }
                                    } else {
                                        jVar = jVar4;
                                        arrayList2 = arrayList5;
                                        i9 = length;
                                        i10 = i33;
                                        i11 = i40;
                                        i12 = i37;
                                    }
                                    if (i41 == length2) {
                                        break;
                                    }
                                    i41++;
                                    i40 = i11;
                                    i37 = i12;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    length = i9;
                                    jVar4 = jVar;
                                    arrayList5 = arrayList2;
                                    i33 = i10;
                                    i38 = 0;
                                    i39 = 8;
                                }
                            } else {
                                jVar = jVar4;
                                arrayList2 = arrayList5;
                                iArr2 = iArr3;
                                jArr2 = jArr3;
                                i9 = length;
                                i10 = i33;
                                i12 = i37;
                                i11 = i35;
                                i13 = 0;
                            }
                            if (i13 == 0) {
                                Iterator it = jVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i14 = 0;
                                        break;
                                    } else {
                                        if (!nVar.k().f2103k.c((H0.v) ((Map.Entry) it.next()).getKey())) {
                                            i14 = 1;
                                            break;
                                        }
                                    }
                                }
                                i13 = i14;
                            }
                            if (i13 != 0) {
                                i34 = 8;
                                z(n5, n5.v(i12), 2048, 0, 8);
                            } else {
                                i34 = 8;
                            }
                            j6 >>= i34;
                            i36 = i7 + 1;
                            abstractC2333k2 = abstractC2333k;
                            i35 = i11;
                            c6 = c5;
                            i32 = i8;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            length = i9;
                            arrayList5 = arrayList2;
                            i33 = i10;
                        }
                    }
                    i7 = i36;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i8 = i32;
                    i9 = length;
                    i10 = i33;
                    c5 = c6;
                    i11 = i35;
                    j6 >>= i34;
                    i36 = i7 + 1;
                    abstractC2333k2 = abstractC2333k;
                    i35 = i11;
                    c6 = c5;
                    i32 = i8;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    length = i9;
                    arrayList5 = arrayList2;
                    i33 = i10;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i32;
                int i58 = length;
                int i59 = i33;
                if (i35 != i34) {
                    return;
                }
                i5 = i58;
                i6 = i59;
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i32;
                i5 = length;
                i6 = i33;
            }
            if (i6 == i5) {
                return;
            }
            i33 = i6 + 1;
            abstractC2333k2 = abstractC2333k;
            length = i5;
            i32 = i;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
        }
    }

    public final void D(C2731G c2731g, r.w wVar) {
        H0.j w5;
        if (c2731g.I() && !this.f346d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c2731g)) {
            C2731G c2731g2 = null;
            if (!c2731g.f21612O.d(8)) {
                c2731g = c2731g.u();
                while (true) {
                    if (c2731g == null) {
                        c2731g = null;
                        break;
                    } else if (c2731g.f21612O.d(8)) {
                        break;
                    } else {
                        c2731g = c2731g.u();
                    }
                }
            }
            if (c2731g == null || (w5 = c2731g.w()) == null) {
                return;
            }
            if (!w5.f2105m) {
                C2731G u5 = c2731g.u();
                while (true) {
                    if (u5 != null) {
                        H0.j w6 = u5.w();
                        if (w6 != null && w6.f2105m) {
                            c2731g2 = u5;
                            break;
                        }
                        u5 = u5.u();
                    } else {
                        break;
                    }
                }
                if (c2731g2 != null) {
                    c2731g = c2731g2;
                }
            }
            int i = c2731g.f21625l;
            if (wVar.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v18, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [i4.a, kotlin.jvm.internal.m] */
    public final void E(C2731G c2731g) {
        if (c2731g.I() && !this.f346d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c2731g)) {
            int i = c2731g.f21625l;
            H0.h hVar = (H0.h) this.f359s.b(i);
            H0.h hVar2 = (H0.h) this.f360t.b(i);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent j5 = j(i, 4096);
            if (hVar != null) {
                j5.setScrollX((int) ((Number) hVar.f2075a.invoke()).floatValue());
                j5.setMaxScrollX((int) ((Number) hVar.f2076b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                j5.setScrollY((int) ((Number) hVar2.f2075a.invoke()).floatValue());
                j5.setMaxScrollY((int) ((Number) hVar2.f2076b.invoke()).floatValue());
            }
            x(j5);
        }
    }

    public final boolean F(H0.n nVar, int i, int i5, boolean z3) {
        String p5;
        H0.j jVar = nVar.f2114d;
        H0.v vVar = H0.i.i;
        if (jVar.f2103k.c(vVar) && Z.i(nVar)) {
            i4.f fVar = (i4.f) ((H0.a) nVar.f2114d.d(vVar)).f2063b;
            if (fVar != null) {
                return ((Boolean) fVar.b(Integer.valueOf(i), Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
            }
        } else if ((i != i5 || i5 != this.f363w) && (p5 = p(nVar)) != null) {
            if (i < 0 || i != i5 || i5 > p5.length()) {
                i = -1;
            }
            this.f363w = i;
            boolean z5 = p5.length() > 0;
            int i6 = nVar.f2116g;
            x(l(v(i6), z5 ? Integer.valueOf(this.f363w) : null, z5 ? Integer.valueOf(this.f363w) : null, z5 ? Integer.valueOf(p5.length()) : null, p5));
            B(i6);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014d, code lost:
    
        if (((r7 & ((~r7) << 6)) & r22) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        char c5;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i;
        int i5;
        int i6;
        char c6;
        long j9;
        String str;
        r.w wVar = new r.w();
        r.w wVar2 = this.f335D;
        int[] iArr = wVar2.f19053b;
        long[] jArr3 = wVar2.f19052a;
        int length = jArr3.length - 2;
        C2343v c2343v = this.J;
        char c7 = 7;
        long j10 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            j6 = 128;
            while (true) {
                long j11 = jArr3[i8];
                j7 = 255;
                if ((((~j11) << c7) & j11 & j10) != j10) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j11 & 255) < 128) {
                            c6 = c7;
                            int i11 = iArr[(i8 << 3) + i10];
                            j9 = j10;
                            H0.o oVar = (H0.o) o().b(i11);
                            H0.n nVar = oVar != null ? oVar.f2117a : null;
                            if (nVar != null) {
                                if (nVar.f2114d.f2103k.c(H0.s.f2160d)) {
                                }
                            }
                            wVar.a(i11);
                            C0041k1 c0041k1 = (C0041k1) c2343v.b(i11);
                            if (c0041k1 != null) {
                                Object g5 = c0041k1.f526a.f2103k.g(H0.s.f2160d);
                                str = (String) (g5 == null ? null : g5);
                            } else {
                                str = null;
                            }
                            A(i11, 32, str);
                        } else {
                            c6 = c7;
                            j9 = j10;
                        }
                        j11 >>= 8;
                        i10++;
                        c7 = c6;
                        j10 = j9;
                    }
                    c5 = c7;
                    j5 = j10;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c5 = c7;
                    j5 = j10;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c7 = c5;
                j10 = j5;
            }
        } else {
            c5 = 7;
            j5 = -9187201950435737472L;
            j6 = 128;
            j7 = 255;
        }
        int[] iArr2 = wVar.f19053b;
        long[] jArr4 = wVar.f19052a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j12 = jArr4[i12];
                if ((((~j12) << c5) & j12 & j5) != j5) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j12 & j7) < j6) {
                            int i15 = iArr2[(i12 << 3) + i14];
                            int i16 = (-862048943) * i15;
                            int i17 = i16 ^ (i16 << 16);
                            int i18 = i17 & 127;
                            int i19 = wVar2.f19054c;
                            int i20 = (i17 >>> 7) & i19;
                            i = i7;
                            int i21 = 0;
                            while (true) {
                                long[] jArr5 = wVar2.f19052a;
                                int i22 = i20 >> 3;
                                jArr2 = jArr4;
                                int i23 = (i20 & 7) << 3;
                                j8 = j12;
                                long j13 = (jArr5[i22] >>> i23) | ((jArr5[i22 + 1] << (64 - i23)) & ((-i23) >> 63));
                                int i24 = i19;
                                long j14 = (i18 * 72340172838076673L) ^ j13;
                                long j15 = (j14 - 72340172838076673L) & (~j14) & j5;
                                while (true) {
                                    if (j15 == 0) {
                                        break;
                                    }
                                    i6 = (i20 + (Long.numberOfTrailingZeros(j15) >> 3)) & i24;
                                    int i25 = i24;
                                    if (wVar2.f19053b[i6] == i15) {
                                        break;
                                    }
                                    j15 &= j15 - 1;
                                    i24 = i25;
                                }
                                i21 += 8;
                                i20 = (i20 + i21) & i5;
                                jArr4 = jArr2;
                                i19 = i5;
                                j12 = j8;
                            }
                            int i26 = i6;
                            if (i26 >= 0) {
                                wVar2.f(i26);
                            }
                        } else {
                            jArr2 = jArr4;
                            j8 = j12;
                            i = i7;
                        }
                        j12 = j8 >> i;
                        i14++;
                        i7 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i13 != i7) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i12 == length2) {
                    break;
                }
                i12++;
                jArr4 = jArr;
                i7 = 8;
            }
        }
        c2343v.c();
        AbstractC2333k o5 = o();
        int[] iArr3 = o5.f19012b;
        Object[] objArr = o5.f19013c;
        long[] jArr6 = o5.f19011a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j16 = jArr6[i27];
                if ((((~j16) << c5) & j16 & j5) != j5) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    for (int i29 = 0; i29 < i28; i29++) {
                        if ((j16 & j7) < j6) {
                            int i30 = (i27 << 3) + i29;
                            int i31 = iArr3[i30];
                            H0.o oVar2 = (H0.o) objArr[i30];
                            H0.j jVar = oVar2.f2117a.f2114d;
                            H0.v vVar = H0.s.f2160d;
                            boolean c8 = jVar.f2103k.c(vVar);
                            H0.n nVar2 = oVar2.f2117a;
                            if (c8 && wVar2.a(i31)) {
                                A(i31, 16, (String) nVar2.f2114d.d(vVar));
                            }
                            c2343v.g(i31, new C0041k1(nVar2, o()));
                        }
                        j16 >>= 8;
                    }
                    if (i28 != 8) {
                        break;
                    }
                }
                if (i27 == length3) {
                    break;
                } else {
                    i27++;
                }
            }
        }
        this.K = new C0041k1(this.f346d.getSemanticsOwner().a(), o());
    }

    @Override // n1.C2161b
    public final C2023c a(View view) {
        return this.f353m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, C2218e c2218e, String str, Bundle bundle) {
        H0.n nVar;
        Region I5;
        float[] H5;
        Rect G5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i5;
        RectF rectF;
        H0.o oVar = (H0.o) o().b(i);
        if (oVar == null || (nVar = oVar.f2117a) == null) {
            return;
        }
        String p5 = p(nVar);
        boolean a5 = kotlin.jvm.internal.l.a(str, this.f338G);
        AccessibilityNodeInfo accessibilityNodeInfo2 = c2218e.f18616a;
        if (a5) {
            int d5 = this.f336E.d(i);
            if (d5 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d5);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, this.f339H)) {
            int d6 = this.f337F.d(i);
            if (d6 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d6);
                return;
            }
            return;
        }
        H0.v vVar = H0.i.f2079a;
        H0.j jVar = nVar.f2114d;
        C2321G c2321g = jVar.f2103k;
        z0.e0 e0Var = null;
        if (c2321g.c(vVar) && bundle != null && kotlin.jvm.internal.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i7 > 0 && i6 >= 0) {
                if (i6 < (p5 != null ? p5.length() : Integer.MAX_VALUE)) {
                    K0.L x5 = Z.x(jVar);
                    if (x5 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i6 + i8;
                        if (i9 >= x5.f2792a.f2784a.f2829l.length()) {
                            arrayList.add(e0Var);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i5 = i8;
                        } else {
                            C1989c b3 = x5.b(i9);
                            z0.e0 d7 = nVar.d();
                            long j5 = 0;
                            if (d7 != null) {
                                if (!d7.I0().f7175x) {
                                    d7 = e0Var;
                                }
                                if (d7 != null) {
                                    j5 = d7.J(0L);
                                }
                            }
                            C1989c g5 = b3.g(j5);
                            C1989c g6 = nVar.g();
                            if ((g5.e(g6) ? g5.c(g6) : e0Var) != 0) {
                                F f = this.f346d;
                                long w5 = f.w((Float.floatToRawIntBits(r9.f17193a) << 32) | (Float.floatToRawIntBits(r9.f17194b) & 4294967295L));
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i5 = i8;
                                long w6 = f.w((Float.floatToRawIntBits(r9.f17196d) & 4294967295L) | (Float.floatToRawIntBits(r9.f17195c) << 32));
                                int i10 = (int) (w5 >> 32);
                                int i11 = (int) (w6 >> 32);
                                int i12 = (int) (w5 & 4294967295L);
                                int i13 = (int) (w6 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i5 = i8;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i8 = i5 + 1;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        e0Var = null;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        H0.v vVar2 = H0.s.f2179y;
        if (c2321g.c(vVar2) && bundle != null && kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object g7 = c2321g.g(vVar2);
            String str2 = (String) (g7 == null ? null : g7);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, nVar.f2116g);
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object g8 = c2321g.g(H0.s.f2156O);
            i0.J j6 = (i0.J) (g8 == null ? null : g8);
            if (j6 != null) {
                i0.D k5 = k(j6, nVar);
                if (k5 instanceof C1995B) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k5));
                    return;
                } else if (k5 instanceof i0.C) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(k5));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(k5));
                    return;
                } else {
                    if (!(k5 instanceof C1994A)) {
                        throw new D2.e();
                    }
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(k5));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object g9 = c2321g.g(H0.s.f2156O);
            i0.J j7 = (i0.J) (g9 == null ? null : g9);
            if (j7 == null || (G5 = G(k(j7, nVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G5);
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object g10 = c2321g.g(H0.s.f2156O);
            i0.J j8 = (i0.J) (g10 == null ? null : g10);
            if (j8 == null || (H5 = H(k(j8, nVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H5);
            return;
        }
        if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object g11 = c2321g.g(H0.s.f2156O);
            i0.J j9 = (i0.J) (g11 == null ? null : g11);
            if (j9 == null || (I5 = I(k(j9, nVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I5);
        }
    }

    public final Rect f(H0.o oVar) {
        W0.k kVar = oVar.f2118b;
        float f = kVar.f6011a;
        float f5 = kVar.f6012b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        F f6 = this.f346d;
        long w5 = f6.w(floatToRawIntBits);
        float f7 = kVar.f6013c;
        float f8 = kVar.f6014d;
        long w6 = f6.w((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        int i = (int) (w5 >> 32);
        int i5 = (int) (w6 >> 32);
        int i6 = (int) (w5 & 4294967295L);
        int i7 = (int) (w6 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i5))), (int) Math.floor(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i5))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (p4.AbstractC2282w.f(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0086, B:29:0x0095, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC0542c abstractC0542c) {
        L l5;
        int i;
        C2328f c2328f;
        C2328f c2328f2;
        r.w wVar;
        r4.b bVar;
        r.w wVar2;
        r4.b bVar2;
        int i5;
        long j5;
        Object a5;
        try {
            if (abstractC0542c instanceof L) {
                l5 = (L) abstractC0542c;
                int i6 = l5.f324o;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    l5.f324o = i6 - Integer.MIN_VALUE;
                    Object obj = l5.f322m;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i = l5.f324o;
                    c2328f = this.f365y;
                    if (i != 0) {
                        G4.l.N(obj);
                        wVar = new r.w();
                        r4.c cVar = this.f366z;
                        cVar.getClass();
                        bVar = new r4.b(cVar);
                        l5.f320k = wVar;
                        l5.f321l = bVar;
                        l5.f324o = 1;
                        a5 = bVar.a(l5);
                        if (a5 != enumC0510a) {
                        }
                    } else if (i == 1) {
                        bVar2 = l5.f321l;
                        wVar2 = l5.f320k;
                        G4.l.N(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = l5.f321l;
                        wVar2 = l5.f320k;
                        G4.l.N(obj);
                        char c5 = 2;
                        c2328f2 = c2328f;
                        wVar = wVar2;
                        c2328f = c2328f2;
                        bVar = bVar2;
                        l5.f320k = wVar;
                        l5.f321l = bVar;
                        l5.f324o = 1;
                        a5 = bVar.a(l5);
                        if (a5 != enumC0510a) {
                            return enumC0510a;
                        }
                        r4.b bVar3 = bVar;
                        wVar2 = wVar;
                        obj = a5;
                        bVar2 = bVar3;
                        if (((Boolean) obj).booleanValue()) {
                            c2328f.clear();
                            return W3.o.f6046a;
                        }
                        bVar2.c();
                        if (q()) {
                            int i7 = c2328f.f18996m;
                            for (int i8 = 0; i8 < i7; i8++) {
                                C2731G c2731g = (C2731G) c2328f.f18995l[i8];
                                D(c2731g, wVar2);
                                E(c2731g);
                            }
                            wVar2.f19055d = 0;
                            long[] jArr = wVar2.f19052a;
                            if (jArr != r.O.f18957a) {
                                try {
                                    X3.l.C0(jArr, -9187201950435737472L);
                                    long[] jArr2 = wVar2.f19052a;
                                    i5 = wVar2.f19054c;
                                    int i9 = i5 >> 3;
                                    jArr2[i9] = ((~j5) & jArr2[i9]) | j5;
                                } catch (Throwable th) {
                                    th = th;
                                    c2328f2.clear();
                                    throw th;
                                }
                                j5 = 255 << ((i5 & 7) << 3);
                                c2328f2 = c2328f;
                            } else {
                                c2328f2 = c2328f;
                            }
                            wVar2.f19056e = r.O.a(wVar2.f19054c) - wVar2.f19055d;
                            if (!this.f341L) {
                                this.f341L = true;
                                this.f352l.post(this.f343N);
                            }
                        } else {
                            c2328f2 = c2328f;
                        }
                        c2328f2.clear();
                        this.f359s.c();
                        this.f360t.c();
                        long j6 = this.f349h;
                        l5.f320k = wVar2;
                        l5.f321l = bVar2;
                        c5 = 2;
                        l5.f324o = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            c2328f2 = c2328f;
        }
        l5 = new L(this, abstractC0542c);
        Object obj2 = l5.f322m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = l5.f324o;
        c2328f = this.f365y;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v7, types: [i4.a, kotlin.jvm.internal.m] */
    public final boolean h(int i, long j5, boolean z3) {
        H0.v vVar;
        int i5;
        if (!kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC2333k o5 = o();
        if (C1988b.b(j5, 9205357640488583168L) || (((9223372034707292159L & j5) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z3) {
            vVar = H0.s.f2175u;
        } else {
            if (z3) {
                throw new D2.e();
            }
            vVar = H0.s.f2174t;
        }
        Object[] objArr = o5.f19013c;
        long[] jArr = o5.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i6 = 0;
        boolean z5 = false;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j6) < 128) {
                        H0.o oVar = (H0.o) objArr[(i6 << 3) + i9];
                        W0.k kVar = oVar.f2118b;
                        float f = kVar.f6011a;
                        i5 = i7;
                        float f5 = kVar.f6012b;
                        float f6 = kVar.f6013c;
                        float f7 = kVar.f6014d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                        if ((intBitsToFloat2 < f7) & (intBitsToFloat >= f) & (intBitsToFloat < f6) & (intBitsToFloat2 >= f5)) {
                            Object g5 = oVar.f2117a.f2114d.f2103k.g(vVar);
                            if (g5 == null) {
                                g5 = null;
                            }
                            H0.h hVar = (H0.h) g5;
                            if (hVar != null) {
                                ?? r1 = hVar.f2075a;
                                if (i < 0) {
                                    if (((Number) r1.invoke()).floatValue() <= 0.0f) {
                                    }
                                    z5 = true;
                                } else {
                                    if (((Number) r1.invoke()).floatValue() >= ((Number) hVar.f2076b.invoke()).floatValue()) {
                                    }
                                    z5 = true;
                                }
                            }
                        }
                    } else {
                        i5 = i7;
                    }
                    j6 >>= i5;
                    i9++;
                    i7 = i5;
                }
                if (i8 != i7) {
                    return z5;
                }
            }
            if (i6 == length) {
                return z5;
            }
            i6++;
        }
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.f346d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i5) {
        H0.o oVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        F f = this.f346d;
        obtain.setPackageName(f.getContext().getPackageName());
        obtain.setSource(f, i);
        if (q() && (oVar = (H0.o) o().b(i)) != null) {
            H0.n nVar = oVar.f2117a;
            obtain.setPassword(nVar.f2114d.f2103k.c(H0.s.J));
            Object g5 = nVar.f2114d.f2103k.g(H0.s.f2168n);
            if (g5 == null) {
                g5 = null;
            }
            boolean a5 = kotlin.jvm.internal.l.a(g5, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC2176q.i(obtain, a5);
            }
        }
        return obtain;
    }

    public final i0.D k(i0.J j5, H0.n nVar) {
        z0.e0 d5 = nVar.d();
        return j5.a(AbstractC0444a.d0(d5 != null ? d5.f20975m : 0L), nVar.f2113c.f21608I, this.f346d.getDensity());
    }

    public final AccessibilityEvent l(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent j5 = j(i, 8192);
        if (num != null) {
            j5.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            j5.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            j5.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            j5.getText().add(charSequence);
        }
        return j5;
    }

    public final int m(H0.n nVar) {
        H0.j jVar = nVar.f2114d;
        H0.v vVar = H0.s.f2157a;
        if (!jVar.f2103k.c(H0.s.f2157a)) {
            H0.v vVar2 = H0.s.f2149F;
            H0.j jVar2 = nVar.f2114d;
            if (jVar2.f2103k.c(vVar2)) {
                return (int) (4294967295L & ((K0.N) jVar2.d(vVar2)).f2803a);
            }
        }
        return this.f363w;
    }

    public final int n(H0.n nVar) {
        H0.j jVar = nVar.f2114d;
        H0.v vVar = H0.s.f2157a;
        if (!jVar.f2103k.c(H0.s.f2157a)) {
            H0.v vVar2 = H0.s.f2149F;
            H0.j jVar2 = nVar.f2114d;
            if (jVar2.f2103k.c(vVar2)) {
                return (int) (((K0.N) jVar2.d(vVar2)).f2803a >> 32);
            }
        }
        return this.f363w;
    }

    public final AbstractC2333k o() {
        if (this.f332A) {
            this.f332A = false;
            F f = this.f346d;
            this.f334C = H0.q.b(f.getSemanticsOwner());
            if (q()) {
                C2343v c2343v = this.f334C;
                Resources resources = f.getContext().getResources();
                C2341t c2341t = this.f336E;
                c2341t.a();
                C2341t c2341t2 = this.f337F;
                c2341t2.a();
                H0.o oVar = (H0.o) c2343v.b(-1);
                H0.n nVar = oVar != null ? oVar.f2117a : null;
                kotlin.jvm.internal.l.c(nVar);
                ArrayList b3 = H0.y.b(nVar, new A.B(1, c2343v), new A.B(2, resources), AbstractC2346c.A(nVar));
                int N5 = X3.n.N(b3);
                int i = 1;
                if (1 <= N5) {
                    while (true) {
                        int i5 = ((H0.n) b3.get(i - 1)).f2116g;
                        int i6 = ((H0.n) b3.get(i)).f2116g;
                        c2341t.f(i5, i6);
                        c2341t2.f(i6, i5);
                        if (i == N5) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f334C;
    }

    public final boolean q() {
        return this.f348g.isEnabled() && !this.f351k.isEmpty();
    }

    public final void r(C2731G c2731g) {
        if (this.f365y.add(c2731g)) {
            this.f366z.q(W3.o.f6046a);
        }
    }

    public final int v(int i) {
        if (i == this.f346d.getSemanticsOwner().a().f2116g) {
            return -1;
        }
        return i;
    }

    public final void w(H0.n nVar, C0041k1 c0041k1) {
        int[] iArr = AbstractC2335m.f19017a;
        r.w wVar = new r.w();
        List j5 = H0.n.j(4, nVar);
        int size = j5.size();
        int i = 0;
        while (true) {
            C2731G c2731g = nVar.f2113c;
            if (i >= size) {
                r.w wVar2 = c0041k1.f527b;
                int[] iArr2 = wVar2.f19053b;
                long[] jArr = wVar2.f19052a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j6 = jArr[i5];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j6) < 128 && !wVar.b(iArr2[(i5 << 3) + i7])) {
                                    r(c2731g);
                                    return;
                                }
                                j6 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                List j7 = H0.n.j(4, nVar);
                int size2 = j7.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    H0.n nVar2 = (H0.n) j7.get(i8);
                    C0041k1 c0041k12 = (C0041k1) this.J.b(nVar2.f2116g);
                    if (c0041k12 != null && o().a(nVar2.f2116g)) {
                        w(nVar2, c0041k12);
                    }
                }
                return;
            }
            H0.n nVar3 = (H0.n) j5.get(i);
            if (o().a(nVar3.f2116g)) {
                r.w wVar3 = c0041k1.f527b;
                int i9 = nVar3.f2116g;
                if (!wVar3.b(i9)) {
                    r(c2731g);
                    return;
                }
                wVar.a(i9);
            }
            i++;
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f358r = true;
        }
        try {
            return ((Boolean) this.f.c(accessibilityEvent)).booleanValue();
        } finally {
            this.f358r = false;
        }
    }

    public final boolean y(int i, int i5, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent j5 = j(i, i5);
        if (num != null) {
            j5.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            j5.setContentDescription(Y0.a.a(list, ",", null, 62));
        }
        return x(j5);
    }
}
