package A0;

import A0.A0;
import A0.F;
import G.C0128e;
import K0.C0203h;
import P.AbstractC0329z;
import P.C0305m0;
import a3.AbstractC0467k;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.InterfaceC0477f;
import androidx.lifecycle.InterfaceC0491u;
import b0.o;
import b4.EnumC0510a;
import c0.C0533b;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.WE;
import d0.ViewOnAttachStateChangeListenerC1909d;
import e2.C1930k;
import g0.AbstractC1961f;
import g0.C1959d;
import g0.C1963h;
import g0.C1965j;
import g0.InterfaceC1964i;
import game.betting133.sports1xbet.R;
import h0.C1989c;
import i0.C1997b;
import i0.C2000e;
import i4.InterfaceC2015a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k4.AbstractC2036a;
import n.C2138i;
import p0.InterfaceC2241a;
import p4.AbstractC2282w;
import q0.C2296a;
import r.AbstractC2334l;
import r.C2316B;
import r.C2321G;
import r.C2338p;
import r.C2343v;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t0.C2407d;
import t0.C2410g;
import t0.InterfaceC2409f;
import t3.AbstractC2425d;
import v0.C2531a;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.C2733I;
import z0.C2735K;
import z0.C2760q;
import z0.EnumC2729E;
import z0.EnumC2762t;

/* loaded from: classes.dex */
public final class F extends ViewGroup implements z0.n0, z0.u0, InterfaceC2409f, InterfaceC0477f, z0.l0 {

    /* renamed from: R0, reason: collision with root package name */
    public static Class f186R0;

    /* renamed from: S0, reason: collision with root package name */
    public static Method f187S0;

    /* renamed from: T0, reason: collision with root package name */
    public static Method f188T0;

    /* renamed from: U0, reason: collision with root package name */
    public static final C2316B f189U0 = new C2316B();

    /* renamed from: V0, reason: collision with root package name */
    public static RunnableC0051p f190V0;

    /* renamed from: A, reason: collision with root package name */
    public final F f191A;

    /* renamed from: A0, reason: collision with root package name */
    public final y0.c f192A0;

    /* renamed from: B, reason: collision with root package name */
    public final H0.p f193B;
    public final C0048n0 B0;

    /* renamed from: C, reason: collision with root package name */
    public final N f194C;

    /* renamed from: C0, reason: collision with root package name */
    public MotionEvent f195C0;

    /* renamed from: D, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1909d f196D;

    /* renamed from: D0, reason: collision with root package name */
    public long f197D0;

    /* renamed from: E, reason: collision with root package name */
    public final C0030h f198E;
    public final G.v E0;

    /* renamed from: F, reason: collision with root package name */
    public final C2000e f199F;

    /* renamed from: F0, reason: collision with root package name */
    public final C2316B f200F0;

    /* renamed from: G, reason: collision with root package name */
    public final c0.h f201G;

    /* renamed from: G0, reason: collision with root package name */
    public float f202G0;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f203H;

    /* renamed from: H0, reason: collision with root package name */
    public float f204H0;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f205I;

    /* renamed from: I0, reason: collision with root package name */
    public final C f206I0;
    public boolean J;

    /* renamed from: J0, reason: collision with root package name */
    public final RunnableC0049o f207J0;
    public boolean K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f208K0;

    /* renamed from: L, reason: collision with root package name */
    public final C2410g f209L;

    /* renamed from: L0, reason: collision with root package name */
    public final B f210L0;

    /* renamed from: M, reason: collision with root package name */
    public final A.v f211M;

    /* renamed from: M0, reason: collision with root package name */
    public final B0 f212M0;

    /* renamed from: N, reason: collision with root package name */
    public i4.c f213N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f214N0;

    /* renamed from: O, reason: collision with root package name */
    public final m2.g f215O;

    /* renamed from: O0, reason: collision with root package name */
    public final C1930k f216O0;

    /* renamed from: P, reason: collision with root package name */
    public final C0533b f217P;

    /* renamed from: P0, reason: collision with root package name */
    public View f218P0;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f219Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final C0070z f220Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C0036j f221R;

    /* renamed from: S, reason: collision with root package name */
    public final C0033i f222S;

    /* renamed from: T, reason: collision with root package name */
    public final z0.p0 f223T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f224U;

    /* renamed from: V, reason: collision with root package name */
    public C0067x0 f225V;

    /* renamed from: W, reason: collision with root package name */
    public W0.a f226W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f227a0;

    /* renamed from: b0, reason: collision with root package name */
    public final z0.W f228b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f229c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int[] f230d0;

    /* renamed from: e0, reason: collision with root package name */
    public final float[] f231e0;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f232f0;

    /* renamed from: g0, reason: collision with root package name */
    public final float[] f233g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f234h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f235i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f236j0;

    /* renamed from: k, reason: collision with root package name */
    public long f237k;

    /* renamed from: k0, reason: collision with root package name */
    public final C0305m0 f238k0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f239l;

    /* renamed from: l0, reason: collision with root package name */
    public final P.H f240l0;

    /* renamed from: m, reason: collision with root package name */
    public final C2733I f241m;

    /* renamed from: m0, reason: collision with root package name */
    public i4.c f242m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0305m0 f243n;

    /* renamed from: n0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0042l f244n0;

    /* renamed from: o, reason: collision with root package name */
    public final View f245o;

    /* renamed from: o0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0045m f246o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f247p;

    /* renamed from: p0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0047n f248p0;

    /* renamed from: q, reason: collision with root package name */
    public final C1965j f249q;

    /* renamed from: q0, reason: collision with root package name */
    public final P0.z f250q0;

    /* renamed from: r, reason: collision with root package name */
    public a4.h f251r;

    /* renamed from: r0, reason: collision with root package name */
    public final P0.x f252r0;

    /* renamed from: s, reason: collision with root package name */
    public final e0.a f253s;

    /* renamed from: s0, reason: collision with root package name */
    public final AtomicReference f254s0;

    /* renamed from: t, reason: collision with root package name */
    public final C0014b1 f255t;

    /* renamed from: t0, reason: collision with root package name */
    public final L0 f256t0;

    /* renamed from: u, reason: collision with root package name */
    public final i0.o f257u;

    /* renamed from: u0, reason: collision with root package name */
    public final Y0 f258u0;

    /* renamed from: v, reason: collision with root package name */
    public final C0063v0 f259v;

    /* renamed from: v0, reason: collision with root package name */
    public final C0305m0 f260v0;

    /* renamed from: w, reason: collision with root package name */
    public final x0.r f261w;

    /* renamed from: w0, reason: collision with root package name */
    public int f262w0;

    /* renamed from: x, reason: collision with root package name */
    public final C2731G f263x;

    /* renamed from: x0, reason: collision with root package name */
    public final C0305m0 f264x0;

    /* renamed from: y, reason: collision with root package name */
    public final C2343v f265y;

    /* renamed from: y0, reason: collision with root package name */
    public final K0 f266y0;

    /* renamed from: z, reason: collision with root package name */
    public final I0.a f267z;

    /* renamed from: z0, reason: collision with root package name */
    public final q0.c f268z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v32, types: [A0.l] */
    /* JADX WARN: Type inference failed for: r1v33, types: [A0.m] */
    /* JADX WARN: Type inference failed for: r1v34, types: [A0.n] */
    public F(Context context, a4.h hVar) {
        super(context);
        C0533b c0533b;
        final F f = this;
        int i = 0;
        f.f237k = 9205357640488583168L;
        int i5 = 1;
        f.f239l = true;
        f.f241m = new C2733I();
        W0.e a5 = AbstractC2346c.a(context);
        P.Z z3 = P.Z.f4432n;
        f.f243n = new C0305m0(a5, z3);
        int i6 = Build.VERSION.SDK_INT;
        boolean z5 = i6 >= 35;
        f.f247p = z5;
        H0.d dVar = new H0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        z0.Z z6 = new z0.Z() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return F.this.hashCode();
            }

            @Override // z0.Z
            public final o i() {
                return new A0();
            }

            @Override // z0.Z
            public final void k(o oVar) {
                ((A0) oVar).getClass();
            }
        };
        f.f249q = new C1965j(f, f);
        f.f251r = hVar;
        f.f253s = new e0.a();
        f.f255t = new C0014b1();
        b0.p a6 = androidx.compose.ui.input.key.a.a(new C0068y(f, i));
        b0.p a7 = androidx.compose.ui.input.rotary.a.a();
        f.f257u = new i0.o();
        f.f259v = new C0063v0(ViewConfiguration.get(context));
        x0.r rVar = new x0.r();
        f.f261w = rVar;
        C2731G c2731g = new C2731G(3);
        c2731g.d0(x0.c0.f20987b);
        c2731g.a0(f.getDensity());
        c2731g.f0(f.getViewConfiguration());
        c2731g.e0(AbstractC0467k.d((z0.Z) androidx.compose.ui.layout.b.b(rVar), emptySemanticsElement).c(a7).c(a6).c(((C1965j) f.getFocusOwner()).f17033e).c(f.m3getDragAndDropManager().f16891c).c(z6));
        f.f263x = c2731g;
        C2343v c2343v = AbstractC2334l.f19016a;
        f.f265y = new C2343v();
        f.getLayoutNodes();
        f.f267z = new I0.a();
        f.f191A = f;
        f.f193B = new H0.p(f.getRoot(), dVar, f.getLayoutNodes());
        N n5 = new N(f);
        f.f194C = n5;
        f.f196D = new ViewOnAttachStateChangeListenerC1909d(f, new C0058t(0, f, Z.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        C0030h c0030h = new C0030h();
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        f.f198E = c0030h;
        f.f199F = new C2000e(f);
        f.f201G = new c0.h();
        f.f203H = new ArrayList();
        f.f209L = new C2410g();
        C2731G root = f.getRoot();
        A.v vVar = new A.v();
        vVar.f133b = root;
        vVar.f134c = new C2407d(root.f21612O.f21768c);
        vVar.f135d = new C2138i(8);
        vVar.f136e = new C2760q();
        f.f211M = vVar;
        f.f213N = C0056s.f567m;
        f.f215O = g() ? new m2.g(f, f.getAutofillTree()) : null;
        if (g()) {
            AutofillManager e3 = T2.N.e(context.getSystemService(T2.N.i()));
            if (e3 == null) {
                throw AbstractC0467k.u("Autofill service could not be located.");
            }
            f = this;
            c0533b = new C0533b(new C1930k(22, e3), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            c0533b = null;
        }
        f.f217P = c0533b;
        f.f221R = new C0036j(context);
        f.getClipboardManager();
        f.f222S = new C0033i();
        f.f223T = new z0.p0(new C0068y(f, i5));
        f.f228b0 = new z0.W(f.getRoot());
        long j5 = Integer.MAX_VALUE;
        f.f229c0 = (j5 & 4294967295L) | (j5 << 32);
        f.f230d0 = new int[]{0, 0};
        float[] a8 = i0.z.a();
        f.f231e0 = a8;
        f.f232f0 = i0.z.a();
        f.f233g0 = i0.z.a();
        f.f234h0 = -1L;
        f.f236j0 = 9187343241974906880L;
        f.f238k0 = AbstractC0329z.t(null);
        f.f240l0 = AbstractC0329z.o(new B(f, i5));
        f.f244n0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: A0.l
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                F.this.N();
            }
        };
        f.f246o0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: A0.m
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                F.this.N();
            }
        };
        f.f248p0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: A0.n
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z7) {
                q0.c cVar = F.this.f268z0;
                int i7 = z7 ? 1 : 2;
                cVar.getClass();
                cVar.f18855a.setValue(new C2296a(i7));
            }
        };
        P0.z zVar = new P0.z(f.getView(), f);
        f.f250q0 = zVar;
        f.f252r0 = new P0.x(zVar);
        f.f254s0 = new AtomicReference(null);
        f.f256t0 = new L0(f.getTextInputService());
        f.f258u0 = new Y0();
        f.f260v0 = new C0305m0(G4.d.m(context), z3);
        f.f262w0 = i6 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        W0.m mVar = W0.m.f6016k;
        W0.m mVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : W0.m.f6017l : mVar;
        f.f264x0 = AbstractC0329z.t(mVar2 != null ? mVar2 : mVar);
        f.f266y0 = new K0(f, 1);
        f.f268z0 = new q0.c(f.isInTouchMode() ? 1 : 2);
        f.f192A0 = new y0.c(f);
        f.B0 = new C0048n0(f);
        f.E0 = new G.v(2);
        f.f200F0 = new C2316B();
        int i7 = 0;
        f.f206I0 = new C(i7, f);
        f.f207J0 = new RunnableC0049o(i7, f);
        f.f210L0 = new B(f, i7);
        f.f212M0 = i6 < 29 ? new v3.g(a8) : new C0();
        f.addOnAttachStateChangeListener(f.f196D);
        f.setWillNotDraw(false);
        f.setFocusable(true);
        if (i6 >= 26) {
            Y.f423a.a(f, 1, false);
        }
        f.setFocusableInTouchMode(true);
        f.setClipChildren(false);
        n1.C.d(f, n5);
        f.setOnDragListener(f.m3getDragAndDropManager());
        f.getRoot().b(f);
        if (i6 >= 29) {
            Q.f374a.a(f);
        }
        if (z5) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            f.f245o = view;
            f.addView(view, -1);
        }
        f.f216O0 = i6 >= 31 ? new C1930k(8) : null;
        f.f220Q0 = new C0070z(f);
    }

    public static final void a(F f, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d5;
        N n5 = f.f194C;
        if (kotlin.jvm.internal.l.a(str, n5.f338G)) {
            int d6 = n5.f336E.d(i);
            if (d6 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d6);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.l.a(str, n5.f339H) || (d5 = n5.f337F.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d5);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0053q get_viewTreeOwners() {
        return (C0053q) this.f238k0.getValue();
    }

    public static void j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof F) {
                ((F) childAt).A();
            } else if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt);
            }
        }
    }

    public static long m(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j5 = size;
        return (j5 << 32) | j5;
    }

    public static View n(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View n5 = n(viewGroup.getChildAt(i5), i);
                    if (n5 != null) {
                        return n5;
                    }
                }
            }
        }
        return null;
    }

    public static void q(C2731G c2731g) {
        c2731g.D();
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            q((C2731G) objArr[i5]);
        }
    }

    public static boolean s(MotionEvent motionEvent) {
        boolean z3 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z3) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z3 = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C0020d1.f488a.a(motionEvent, i));
                if (z3) {
                    break;
                }
            }
        }
        return z3;
    }

    private void setDensity(W0.c cVar) {
        this.f243n.setValue(cVar);
    }

    private void setFontFamilyResolver(O0.d dVar) {
        this.f260v0.setValue(dVar);
    }

    private void setLayoutDirection(W0.m mVar) {
        this.f264x0.setValue(mVar);
    }

    private final void set_viewTreeOwners(C0053q c0053q) {
        this.f238k0.setValue(c0053q);
    }

    public final void A() {
        C0533b c0533b;
        if (this.f219Q) {
            Z.s sVar = getSnapshotObserver().f21843a;
            synchronized (sVar.f6235g) {
                try {
                    R.e eVar = sVar.f;
                    int i = eVar.f5108m;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i; i6++) {
                        Z.r rVar = (Z.r) eVar.f5106k[i6];
                        rVar.e();
                        if (!rVar.f.j()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr = eVar.f5106k;
                            objArr[i6 - i5] = objArr[i6];
                        }
                    }
                    int i7 = i - i5;
                    X3.l.B0(eVar.f5106k, i7, i);
                    eVar.f5108m = i7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f219Q = false;
        }
        C0067x0 c0067x0 = this.f225V;
        if (c0067x0 != null) {
            j(c0067x0);
        }
        if (g() && (c0533b = this.f217P) != null) {
            r.w wVar = c0533b.f7383g;
            if (wVar.f19055d == 0 && c0533b.f7384h) {
                ((AutofillManager) c0533b.f7378a.f16910l).commit();
                c0533b.f7384h = false;
            }
            if (wVar.f19055d != 0) {
                c0533b.f7384h = true;
            }
        }
        while (this.f200F0.h() && this.f200F0.e(0) != null) {
            int i8 = this.f200F0.f18905b;
            for (int i9 = 0; i9 < i8; i9++) {
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) this.f200F0.e(i9);
                C2316B c2316b = this.f200F0;
                if (i9 < 0 || i9 >= c2316b.f18905b) {
                    c2316b.m(i9);
                    throw null;
                }
                Object[] objArr2 = c2316b.f18904a;
                Object obj = objArr2[i9];
                objArr2[i9] = null;
                if (interfaceC2015a != null) {
                    interfaceC2015a.invoke();
                }
            }
            this.f200F0.k(0, i8);
        }
    }

    public final void B(C2731G c2731g) {
        N n5 = this.f194C;
        n5.f332A = true;
        if (n5.q()) {
            n5.r(c2731g);
        }
        ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = this.f196D;
        viewOnAttachStateChangeListenerC1909d.f16838q = true;
        if (viewOnAttachStateChangeListenerC1909d.g()) {
            viewOnAttachStateChangeListenerC1909d.f16839r.q(W3.o.f6046a);
        }
    }

    public final void C(C2731G c2731g, boolean z3, boolean z5, boolean z6) {
        C2731G u5;
        C2731G u6;
        z0.W w5 = this.f228b0;
        if (!z3) {
            if (w5.p(c2731g, z5) && z6) {
                I(c2731g);
                return;
            }
            return;
        }
        w5.getClass();
        if (c2731g.f21630q == null) {
            AbstractC2540a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        C2735K c2735k = c2731g.f21613P;
        int ordinal = c2735k.f21653d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new D2.e();
                }
                if (!c2735k.f21654e || z5) {
                    c2735k.f21654e = true;
                    c2735k.f21663p.f21735D = true;
                    if (c2731g.f21623Z) {
                        return;
                    }
                    boolean a5 = kotlin.jvm.internal.l.a(c2731g.K(), Boolean.TRUE);
                    v3.e eVar = w5.f21724b;
                    if ((a5 || z0.W.h(c2731g)) && ((u5 = c2731g.u()) == null || !u5.f21613P.f21654e)) {
                        eVar.n(c2731g, EnumC2762t.f21858k);
                    } else if ((c2731g.J() || z0.W.i(c2731g)) && ((u6 = c2731g.u()) == null || !u6.q())) {
                        eVar.n(c2731g, EnumC2762t.f21860m);
                    }
                    if (w5.f21726d || !z6) {
                        return;
                    }
                    I(c2731g);
                    return;
                }
                return;
            }
        }
        w5.f21729h.c(new z0.V(c2731g, true, z5));
    }

    public final void D(C2731G c2731g, boolean z3, boolean z5) {
        EnumC2762t enumC2762t = EnumC2762t.f21861n;
        z0.W w5 = this.f228b0;
        if (!z3) {
            w5.getClass();
            int ordinal = c2731g.f21613P.f21653d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new D2.e();
            }
            C2731G u5 = c2731g.u();
            boolean z6 = u5 == null || u5.J();
            C2735K c2735k = c2731g.f21613P;
            if (!z5) {
                if (c2731g.q()) {
                    return;
                }
                if (c2731g.p() && c2731g.J() == z6 && c2731g.J() == c2735k.f21663p.f21734C) {
                    return;
                }
            }
            z0.Y y5 = c2735k.f21663p;
            y5.f21736E = true;
            y5.f21737F = true;
            if (!c2731g.f21623Z && y5.f21734C && z6) {
                if ((u5 == null || !u5.p()) && (u5 == null || !u5.q())) {
                    w5.f21724b.n(c2731g, enumC2762t);
                }
                if (w5.f21726d) {
                    return;
                }
                I(null);
                return;
            }
            return;
        }
        w5.getClass();
        int ordinal2 = c2731g.f21613P.f21653d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new D2.e();
                }
            }
        }
        C2735K c2735k2 = c2731g.f21613P;
        if ((c2735k2.f21654e || c2735k2.f) && !z5) {
            return;
        }
        c2735k2.f = true;
        c2735k2.f21655g = true;
        z0.Y y6 = c2735k2.f21663p;
        y6.f21736E = true;
        y6.f21737F = true;
        if (c2731g.f21623Z) {
            return;
        }
        C2731G u6 = c2731g.u();
        boolean a5 = kotlin.jvm.internal.l.a(c2731g.K(), Boolean.TRUE);
        v3.e eVar = w5.f21724b;
        if (a5 && ((u6 == null || !u6.f21613P.f21654e) && (u6 == null || !u6.f21613P.f))) {
            eVar.n(c2731g, EnumC2762t.f21859l);
        } else if (c2731g.J() && ((u6 == null || !u6.p()) && (u6 == null || !u6.q()))) {
            eVar.n(c2731g, enumC2762t);
        }
        if (w5.f21726d) {
            return;
        }
        I(null);
    }

    public final void E() {
        N n5 = this.f194C;
        n5.f332A = true;
        if (n5.q() && !n5.f341L) {
            n5.f341L = true;
            n5.f352l.post(n5.f343N);
        }
        ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = this.f196D;
        viewOnAttachStateChangeListenerC1909d.f16838q = true;
        if (!viewOnAttachStateChangeListenerC1909d.g() || viewOnAttachStateChangeListenerC1909d.f16845x) {
            return;
        }
        viewOnAttachStateChangeListenerC1909d.f16845x = true;
        viewOnAttachStateChangeListenerC1909d.f16840s.post(viewOnAttachStateChangeListenerC1909d.f16846y);
    }

    public final void F() {
        if (this.f235i0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f234h0) {
            this.f234h0 = currentAnimationTimeMillis;
            B0 b02 = this.f212M0;
            float[] fArr = this.f232f0;
            b02.c(this, fArr);
            Z.y(fArr, this.f233g0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f230d0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f5 = iArr[1];
            view.getLocationInWindow(iArr);
            float f6 = iArr[0];
            float f7 = f5 - iArr[1];
            this.f236j0 = (Float.floatToRawIntBits(f - f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        }
    }

    public final void G(MotionEvent motionEvent) {
        this.f234h0 = AnimationUtils.currentAnimationTimeMillis();
        B0 b02 = this.f212M0;
        float[] fArr = this.f232f0;
        b02.c(this, fArr);
        Z.y(fArr, this.f233g0);
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long b3 = i0.z.b((Float.floatToRawIntBits(x5) << 32) | (Float.floatToRawIntBits(y5) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b3 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b3 & 4294967295L));
        this.f236j0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean H() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void I(C2731G c2731g) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c2731g != null) {
            while (c2731g != null && c2731g.r() == EnumC2729E.f21592k) {
                if (!this.f227a0) {
                    C2731G u5 = c2731g.u();
                    if (u5 == null) {
                        break;
                    }
                    long j5 = u5.f21612O.f21768c.f20976n;
                    if (W0.a.f(j5) && W0.a.e(j5)) {
                        break;
                    }
                }
                c2731g = c2731g.u();
            }
            if (c2731g == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long J(long j5) {
        F();
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (this.f236j0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (this.f236j0 & 4294967295L));
        return i0.z.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f233g0);
    }

    public final int K(MotionEvent motionEvent) {
        Object obj;
        if (this.f214N0) {
            this.f214N0 = false;
            int metaState = motionEvent.getMetaState();
            this.f255t.getClass();
            u1.f583a.setValue(new t0.y(metaState));
        }
        C2410g c2410g = this.f209L;
        G.v a5 = c2410g.a(motionEvent, this);
        A.v vVar = this.f211M;
        if (a5 == null) {
            if (!vVar.f132a) {
                C2338p c2338p = (C2338p) ((C2138i) vVar.f135d).f18249l;
                int i = c2338p.f19032n;
                Object[] objArr = c2338p.f19031m;
                for (int i5 = 0; i5 < i; i5++) {
                    objArr[i5] = null;
                }
                c2338p.f19032n = 0;
                c2338p.f19029k = false;
                ((C2407d) vVar.f134c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) a5.f1749l;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i6 = size - 1;
                obj = arrayList.get(size);
                if (((t0.u) obj).f19520e) {
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        obj = null;
        t0.u uVar = (t0.u) obj;
        if (uVar != null) {
            this.f237k = uVar.f19519d;
        }
        int h3 = vVar.h(a5, this, t(motionEvent));
        a5.f1750m = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (h3 & 1) != 0) {
            return h3;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c2410g.f19474c.delete(pointerId);
        c2410g.f19473b.delete(pointerId);
        return h3;
    }

    public final void L(MotionEvent motionEvent, int i, long j5, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int i5 = 1;
        int i6 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i6 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i6 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i6 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i7 = 0; i7 < pointerCount; i7++) {
            pointerPropertiesArr[i7] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < pointerCount; i8++) {
            pointerCoordsArr[i8] = new MotionEvent.PointerCoords();
        }
        int i9 = 0;
        while (i9 < pointerCount) {
            int i10 = ((i6 < 0 || i9 < i6) ? 0 : i5) + i9;
            motionEvent.getPointerProperties(i10, pointerPropertiesArr[i9]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i9];
            motionEvent.getPointerCoords(i10, pointerCoords);
            long w5 = w((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(pointerCoords.x) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (w5 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (w5 & 4294967295L));
            i9++;
            i6 = i6;
            i5 = 1;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j5 : motionEvent.getDownTime(), j5, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        G.v a5 = this.f209L.a(obtain, this);
        kotlin.jvm.internal.l.c(a5);
        this.f211M.h(a5, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(C0128e c0128e, AbstractC0542c abstractC0542c) {
        E e3;
        int i;
        if (abstractC0542c instanceof E) {
            e3 = (E) abstractC0542c;
            int i5 = e3.f177m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                e3.f177m = i5 - Integer.MIN_VALUE;
                Object obj = e3.f175k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = e3.f177m;
                if (i != 0) {
                    G4.l.N(obj);
                    AtomicReference atomicReference = this.f254s0;
                    C0068y c0068y = new C0068y(this, 2);
                    e3.f177m = 1;
                    if (AbstractC2282w.e(new b0.t(c0068y, atomicReference, c0128e, null), e3) == enumC0510a) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                throw new D2.e();
            }
        }
        e3 = new E(this, abstractC0542c);
        Object obj2 = e3.f175k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = e3.f177m;
        if (i != 0) {
        }
        throw new D2.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z3;
        View view;
        long j5;
        long K;
        float[] fArr;
        I0.b bVar;
        boolean z5;
        long j6;
        int[] iArr = this.f230d0;
        getLocationOnScreen(iArr);
        long j7 = this.f229c0;
        int i = (int) (j7 >> 32);
        int i5 = (int) (j7 & 4294967295L);
        int i6 = iArr[0];
        if (i != i6 || i5 != iArr[1] || this.f234h0 < 0) {
            this.f229c0 = (i6 << 32) | (iArr[1] & 4294967295L);
            if (i != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
                getRoot().f21613P.f21663p.k0();
                z3 = true;
                F();
                view = this.f218P0;
                if (view == null) {
                    view = getRootView();
                    this.f218P0 = view;
                }
                I0.a rectManager = getRectManager();
                j5 = this.f229c0;
                K = G4.l.K(this.f236j0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.f232f0;
                if ((AbstractC2036a.d(fArr) & 2) != 0) {
                    fArr = null;
                }
                bVar = rectManager.f2553b;
                if (W0.j.a(K, bVar.f2562c)) {
                    bVar.f2562c = K;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!W0.j.a(j5, bVar.f2563d)) {
                    bVar.f2563d = j5;
                    z5 = true;
                }
                if (fArr != null) {
                    z5 = true;
                }
                j6 = (4294967295L & height) | (width << 32);
                if (j6 != bVar.f2564e) {
                    bVar.f2564e = j6;
                    z5 = true;
                }
                rectManager.f2556e = !z5 || rectManager.f2556e;
                this.f228b0.a(z3);
                getRectManager().b();
            }
        }
        z3 = false;
        F();
        view = this.f218P0;
        if (view == null) {
        }
        I0.a rectManager2 = getRectManager();
        j5 = this.f229c0;
        K = G4.l.K(this.f236j0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.f232f0;
        if ((AbstractC2036a.d(fArr) & 2) != 0) {
        }
        bVar = rectManager2.f2553b;
        if (W0.j.a(K, bVar.f2562c)) {
        }
        if (!W0.j.a(j5, bVar.f2563d)) {
        }
        if (fArr != null) {
        }
        j6 = (4294967295L & height2) | (width2 << 32);
        if (j6 != bVar.f2564e) {
        }
        rectManager2.f2556e = !z5 || rectManager2.f2556e;
        this.f228b0.a(z3);
        getRectManager().b();
    }

    public final void O(float f) {
        if (this.f247p) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f202G0) || f > this.f202G0) {
                    this.f202G0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f204H0) || f < this.f204H0) {
                    this.f204H0 = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        H0.j w5;
        i4.c cVar;
        CharSequence textValue2;
        if (g()) {
            C0533b c0533b = this.f217P;
            if (c0533b != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue f = T2.N.f(sparseArray.get(keyAt));
                    isText2 = f.isText();
                    if (isText2) {
                        C2731G c2731g = (C2731G) c0533b.f7379b.f2121c.b(keyAt);
                        if (c2731g != null && (w5 = c2731g.w()) != null) {
                            Object g5 = w5.f2103k.g(H0.i.f2084g);
                            if (g5 == null) {
                                g5 = null;
                            }
                            H0.a aVar = (H0.a) g5;
                            if (aVar != null && (cVar = (i4.c) aVar.f2063b) != null) {
                                textValue2 = f.getTextValue();
                            }
                        }
                    } else {
                        isDate2 = f.isDate();
                        if (isDate2) {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        } else {
                            isList2 = f.isList();
                            if (isList2) {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            } else {
                                isToggle2 = f.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            }
                        }
                    }
                }
            }
            m2.g gVar = this.f215O;
            if (gVar != null) {
                c0.h hVar = (c0.h) gVar.f17995m;
                if (hVar.f7387a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    int keyAt2 = sparseArray.keyAt(i5);
                    AutofillValue f5 = T2.N.f(sparseArray.get(keyAt2));
                    isText = f5.isText();
                    if (isText) {
                        textValue = f5.getTextValue();
                        textValue.toString();
                        if (hVar.f7387a.get(Integer.valueOf(keyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        isDate = f5.isDate();
                        if (isDate) {
                            throw new W3.g("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = f5.isList();
                        if (isList) {
                            throw new W3.g("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = f5.isToggle();
                        if (isToggle) {
                            throw new W3.g("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void b(InterfaceC0491u interfaceC0491u) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(Z.w());
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f194C.h(i, this.f237k, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f194C.h(i, this.f237k, true);
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void d(InterfaceC0491u interfaceC0491u) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            q(getRoot());
        }
        x(true);
        Z.l.k().m();
        this.J = true;
        i0.o oVar = this.f257u;
        C1997b c1997b = oVar.f17288a;
        Canvas canvas2 = c1997b.f17266a;
        c1997b.f17266a = canvas;
        getRoot().i(c1997b, null);
        oVar.f17288a.f17266a = canvas2;
        ArrayList arrayList = this.f203H;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((W0) ((z0.m0) arrayList.get(i))).f();
            }
        }
        int i5 = s1.f575k;
        arrayList.clear();
        this.J = false;
        ArrayList arrayList2 = this.f205I;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f247p) {
            AbstractC0071z0.a(this, this.f202G0);
            View view = this.f245o;
            if (view == null) {
                kotlin.jvm.internal.l.k("frameRateCategoryView");
                throw null;
            }
            AbstractC0071z0.a(view, this.f204H0);
            if (!Float.isNaN(this.f204H0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f202G0 = Float.NaN;
            this.f204H0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        z0.c0 c0Var;
        C2531a c2531a;
        int size;
        z0.c0 c0Var2;
        b0.o oVar;
        z0.c0 c0Var3;
        if (this.f208K0) {
            RunnableC0049o runnableC0049o = this.f207J0;
            removeCallbacks(runnableC0049o);
            if (motionEvent.getActionMasked() == 8) {
                this.f208K0 = false;
            } else {
                runnableC0049o.run();
            }
        }
        if (s(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x5 = motionEvent.getX();
                float y5 = motionEvent.getY();
                Float.floatToRawIntBits(x5);
                Float.floatToRawIntBits(y5);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                C1965j c1965j = (C1965j) getFocusOwner();
                if (c1965j.f17032d.f17027e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    g0.s g5 = AbstractC1961f.g(c1965j.f17031c);
                    if (g5 != null) {
                        if (!g5.f7162k.f7175x) {
                            AbstractC2540a.b("visitAncestors called on an unattached node");
                        }
                        b0.o oVar2 = g5.f7162k;
                        C2731G v4 = AbstractC2749f.v(g5);
                        while (v4 != null) {
                            if ((v4.f21612O.f.f7165n & 2097152) != 0) {
                                while (oVar2 != null) {
                                    if ((oVar2.f7164m & 2097152) != 0) {
                                        b0.o oVar3 = oVar2;
                                        R.e eVar = null;
                                        while (oVar3 != null) {
                                            if ((oVar3.f7164m & 2097152) != 0 && (oVar3 instanceof AbstractC2756m)) {
                                                int i = 0;
                                                for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                                    if ((oVar4.f7164m & 2097152) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            oVar3 = oVar4;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new R.e(new b0.o[16]);
                                                            }
                                                            if (oVar3 != null) {
                                                                eVar.c(oVar3);
                                                                oVar3 = null;
                                                            }
                                                            eVar.c(oVar4);
                                                        }
                                                    }
                                                }
                                                if (i == 1) {
                                                }
                                            }
                                            oVar3 = AbstractC2749f.f(eVar);
                                        }
                                    }
                                    oVar2 = oVar2.f7166o;
                                }
                            }
                            v4 = v4.u();
                            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (p(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = n1.D.f18363a;
            D0.c.e(viewConfiguration);
        } else {
            n1.D.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i5 >= 26) {
            D0.c.d(viewConfiguration);
        } else {
            n1.D.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        C1965j c1965j2 = (C1965j) getFocusOwner();
        if (c1965j2.f17032d.f17027e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        g0.s g6 = AbstractC1961f.g(c1965j2.f17031c);
        if (g6 != null) {
            if (!g6.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar5 = g6.f7162k;
            C2731G v5 = AbstractC2749f.v(g6);
            loop0: while (true) {
                if (v5 == null) {
                    oVar = null;
                    break;
                }
                if ((v5.f21612O.f.f7165n & 16384) != 0) {
                    while (oVar5 != null) {
                        if ((oVar5.f7164m & 16384) != 0) {
                            oVar = oVar5;
                            R.e eVar2 = null;
                            while (oVar != null) {
                                if (oVar instanceof C2531a) {
                                    break loop0;
                                }
                                if ((oVar.f7164m & 16384) != 0 && (oVar instanceof AbstractC2756m)) {
                                    int i6 = 0;
                                    for (b0.o oVar6 = ((AbstractC2756m) oVar).f21839z; oVar6 != null; oVar6 = oVar6.f7167p) {
                                        if ((oVar6.f7164m & 16384) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                oVar = oVar6;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar != null) {
                                                    eVar2.c(oVar);
                                                    oVar = null;
                                                }
                                                eVar2.c(oVar6);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                oVar = AbstractC2749f.f(eVar2);
                            }
                        }
                        oVar5 = oVar5.f7166o;
                    }
                }
                v5 = v5.u();
                oVar5 = (v5 == null || (c0Var3 = v5.f21612O) == null) ? null : c0Var3.f21770e;
            }
            c2531a = (C2531a) oVar;
        } else {
            c2531a = null;
        }
        if (c2531a != null) {
            C2531a c2531a2 = c2531a;
            if (!c2531a2.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar7 = c2531a2.f7162k.f7166o;
            C2731G v6 = AbstractC2749f.v(c2531a);
            ArrayList arrayList = null;
            while (v6 != null) {
                if ((v6.f21612O.f.f7165n & 16384) != 0) {
                    while (oVar7 != null) {
                        if ((oVar7.f7164m & 16384) != 0) {
                            b0.o oVar8 = oVar7;
                            R.e eVar3 = null;
                            while (oVar8 != null) {
                                if (oVar8 instanceof C2531a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(oVar8);
                                } else if ((oVar8.f7164m & 16384) != 0 && (oVar8 instanceof AbstractC2756m)) {
                                    int i7 = 0;
                                    for (b0.o oVar9 = ((AbstractC2756m) oVar8).f21839z; oVar9 != null; oVar9 = oVar9.f7167p) {
                                        if ((oVar9.f7164m & 16384) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                oVar8 = oVar9;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar8 != null) {
                                                    eVar3.c(oVar8);
                                                    oVar8 = null;
                                                }
                                                eVar3.c(oVar9);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                oVar8 = AbstractC2749f.f(eVar3);
                            }
                        }
                        oVar7 = oVar7.f7166o;
                    }
                }
                v6 = v6.u();
                oVar7 = (v6 == null || (c0Var2 = v6.f21612O) == null) ? null : c0Var2.f21770e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i8 = size - 1;
                    ((C2531a) arrayList.get(size)).getClass();
                    if (i8 < 0) {
                        break;
                    }
                    size = i8;
                }
            }
            b0.o oVar10 = c2531a2.f7162k;
            R.e eVar4 = null;
            while (oVar10 != null) {
                if (oVar10 instanceof C2531a) {
                } else if ((oVar10.f7164m & 16384) != 0 && (oVar10 instanceof AbstractC2756m)) {
                    int i9 = 0;
                    for (b0.o oVar11 = ((AbstractC2756m) oVar10).f21839z; oVar11 != null; oVar11 = oVar11.f7167p) {
                        if ((oVar11.f7164m & 16384) != 0) {
                            i9++;
                            if (i9 == 1) {
                                oVar10 = oVar11;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new R.e(new b0.o[16]);
                                }
                                if (oVar10 != null) {
                                    eVar4.c(oVar10);
                                    oVar10 = null;
                                }
                                eVar4.c(oVar11);
                            }
                        }
                    }
                    if (i9 == 1) {
                    }
                }
                oVar10 = AbstractC2749f.f(eVar4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                b0.o oVar12 = c2531a2.f7162k;
                R.e eVar5 = null;
                while (oVar12 != null) {
                    if (oVar12 instanceof C2531a) {
                    } else if ((oVar12.f7164m & 16384) != 0 && (oVar12 instanceof AbstractC2756m)) {
                        int i10 = 0;
                        for (b0.o oVar13 = ((AbstractC2756m) oVar12).f21839z; oVar13 != null; oVar13 = oVar13.f7167p) {
                            if ((oVar13.f7164m & 16384) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    oVar12 = oVar13;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new R.e(new b0.o[16]);
                                    }
                                    if (oVar12 != null) {
                                        eVar5.c(oVar12);
                                        oVar12 = null;
                                    }
                                    eVar5.c(oVar13);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    oVar12 = AbstractC2749f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        C0056s c0056s = ((C2531a) arrayList.get(i11)).f20335y;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        if (u(r24) == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z3;
        int i;
        boolean z5 = this.f208K0;
        RunnableC0049o runnableC0049o = this.f207J0;
        if (z5) {
            removeCallbacks(runnableC0049o);
            runnableC0049o.run();
        }
        if (!s(motionEvent) && isAttachedToWindow()) {
            N n5 = this.f194C;
            AccessibilityManager accessibilityManager = n5.f348g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                F f = n5.f346d;
                if (action == 7 || action == 9) {
                    float x5 = motionEvent.getX();
                    float y5 = motionEvent.getY();
                    f.x(true);
                    C2760q c2760q = new C2760q();
                    long floatToRawIntBits = (Float.floatToRawIntBits(x5) << 32) | (Float.floatToRawIntBits(y5) & 4294967295L);
                    z0.c0 c0Var = f.getRoot().f21612O;
                    z0.e0 e0Var = c0Var.f21769d;
                    i0.G g5 = z0.e0.f21790T;
                    c0Var.f21769d.N0(z0.e0.f21794X, e0Var.F0(floatToRawIntBits), c2760q, 1, true);
                    for (int N5 = X3.n.N(c2760q); -1 < N5; N5--) {
                        Object e3 = c2760q.f21850k.e(N5);
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", e3);
                        C2731G v4 = AbstractC2749f.v((b0.o) e3);
                        if (f.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(v4) != null) {
                            break;
                        }
                        if (v4.f21612O.d(8)) {
                            int v5 = n5.v(v4.f21625l);
                            H0.n a5 = H0.q.a(v4, false);
                            if (H0.q.f(a5)) {
                                if (!a5.k().f2103k.c(H0.s.f2180z)) {
                                    i = v5;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    f.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i5 = n5.f347e;
                    if (i5 != i) {
                        n5.f347e = i;
                        N.z(n5, i, 128, null, 12);
                        N.z(n5, i5, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i6 = n5.f347e;
                    if (i6 == Integer.MIN_VALUE) {
                        f.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i6 != Integer.MIN_VALUE) {
                        n5.f347e = Integer.MIN_VALUE;
                        N.z(n5, Integer.MIN_VALUE, 128, null, 12);
                        N.z(n5, i6, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7) {
                z3 = 1;
            } else if (actionMasked != 10 || !t(motionEvent)) {
                z3 = 1;
                if ((p(motionEvent) & z3) != 0) {
                    return z3;
                }
            } else if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                MotionEvent motionEvent2 = this.f195C0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f195C0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f208K0 = true;
                postDelayed(runnableC0049o, 8L);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C1965j) getFocusOwner()).d(keyEvent, new C0060u(0, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f255t.getClass();
        u1.f583a.setValue(new t0.y(metaState));
        return ((C1965j) getFocusOwner()).d(keyEvent, C1963h.f17028l) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        z0.c0 c0Var;
        if (isFocused()) {
            C1965j c1965j = (C1965j) getFocusOwner();
            if (c1965j.f17032d.f17027e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                g0.s g5 = AbstractC1961f.g(c1965j.f17031c);
                if (g5 != null) {
                    if (!g5.f7162k.f7175x) {
                        AbstractC2540a.b("visitAncestors called on an unattached node");
                    }
                    b0.o oVar = g5.f7162k;
                    C2731G v4 = AbstractC2749f.v(g5);
                    while (v4 != null) {
                        if ((v4.f21612O.f.f7165n & 131072) != 0) {
                            while (oVar != null) {
                                if ((oVar.f7164m & 131072) != 0) {
                                    b0.o oVar2 = oVar;
                                    R.e eVar = null;
                                    while (oVar2 != null) {
                                        if ((oVar2.f7164m & 131072) != 0 && (oVar2 instanceof AbstractC2756m)) {
                                            int i = 0;
                                            for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                                if ((oVar3.f7164m & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        oVar2 = oVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new R.e(new b0.o[16]);
                                                        }
                                                        if (oVar2 != null) {
                                                            eVar.c(oVar2);
                                                            oVar2 = null;
                                                        }
                                                        eVar.c(oVar3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        oVar2 = AbstractC2749f.f(eVar);
                                    }
                                }
                                oVar = oVar.f7166o;
                            }
                        }
                        v4 = v4.u();
                        oVar = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            O.f369a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f208K0) {
            RunnableC0049o runnableC0049o = this.f207J0;
            removeCallbacks(runnableC0049o);
            MotionEvent motionEvent2 = this.f195C0;
            kotlin.jvm.internal.l.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f208K0 = false;
            } else {
                runnableC0049o.run();
            }
        }
        if (!s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u(motionEvent))) {
            int p5 = p(motionEvent);
            if ((p5 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((p5 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void f(InterfaceC0491u interfaceC0491u) {
        AbstractC0467k.c(interfaceC0491u);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return n(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C1989c d5;
        if (view == null || this.f228b0.f21725c) {
            return super.focusSearch(view, i);
        }
        Object obj = R0.f.get();
        kotlin.jvm.internal.l.c(obj);
        View b3 = ((R0) obj).b(i, view, this);
        if (view == this) {
            g0.s g5 = AbstractC1961f.g(((C1965j) getFocusOwner()).f17031c);
            d5 = g5 != null ? AbstractC1961f.j(g5) : null;
            if (d5 == null) {
                d5 = AbstractC1961f.d(view, this);
            }
        } else {
            d5 = AbstractC1961f.d(view, this);
        }
        C1959d D5 = AbstractC1961f.D(i);
        int i5 = D5 != null ? D5.f17021a : 6;
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        if (((C1965j) getFocusOwner()).e(i5, d5, new C0064w(wVar, 0)) != null) {
            Object obj2 = wVar.f17624k;
            if (obj2 != null) {
                if (b3 != null) {
                    if (i5 == 1 || i5 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (AbstractC1961f.o(AbstractC1961f.j((g0.s) obj2), AbstractC1961f.d(b3, this), d5, i5)) {
                    }
                }
                return this;
            }
            if (b3 == null) {
            }
            return b3;
        }
        return view;
    }

    public final C0067x0 getAndroidViewsHandler$ui_release() {
        if (this.f225V == null) {
            C0067x0 c0067x0 = new C0067x0(getContext());
            this.f225V = c0067x0;
            addView(c0067x0, -1);
            requestLayout();
        }
        C0067x0 c0067x02 = this.f225V;
        kotlin.jvm.internal.l.c(c0067x02);
        return c0067x02;
    }

    public c0.e getAutofill() {
        return this.f215O;
    }

    public c0.g getAutofillManager() {
        return this.f217P;
    }

    public c0.h getAutofillTree() {
        return this.f201G;
    }

    public final i4.c getConfigurationChangeObserver() {
        return this.f213N;
    }

    public final ViewOnAttachStateChangeListenerC1909d getContentCaptureManager$ui_release() {
        return this.f196D;
    }

    public a4.h getCoroutineContext() {
        return this.f251r;
    }

    public W0.c getDensity() {
        return (W0.c) this.f243n.getValue();
    }

    public C1989c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            g0.s g5 = AbstractC1961f.g(((C1965j) getFocusOwner()).f17031c);
            if (g5 != null) {
                return AbstractC1961f.j(g5);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return AbstractC1961f.d(findFocus, this);
        }
        return null;
    }

    public InterfaceC1964i getFocusOwner() {
        return this.f249q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C1989c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f17193a);
            rect.top = Math.round(embeddedViewFocusRect.f17194b);
            rect.right = Math.round(embeddedViewFocusRect.f17195c);
            rect.bottom = Math.round(embeddedViewFocusRect.f17196d);
            return;
        }
        if (kotlin.jvm.internal.l.a(((C1965j) getFocusOwner()).e(6, null, C0056s.f568n), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public O0.d getFontFamilyResolver() {
        return (O0.d) this.f260v0.getValue();
    }

    public O0.c getFontLoader() {
        return this.f258u0;
    }

    public i0.u getGraphicsContext() {
        return this.f199F;
    }

    public InterfaceC2241a getHapticFeedBack() {
        return this.f266y0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f228b0.f21724b.E();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public q0.b getInputModeManager() {
        return this.f268z0;
    }

    public final x0.r getInsetsListener() {
        return this.f261w;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f234h0;
    }

    @Override // android.view.View, android.view.ViewParent
    public W0.m getLayoutDirection() {
        return (W0.m) this.f264x0.getValue();
    }

    public long getMeasureIteration() {
        z0.W w5 = this.f228b0;
        if (!w5.f21725c) {
            AbstractC2540a.a("measureIteration should be only used during the measure/layout pass");
        }
        return w5.f21728g;
    }

    public y0.c getModifierLocalManager() {
        return this.f192A0;
    }

    public x0.Y getPlacementScope() {
        int i = x0.b0.f20984b;
        return new x0.L(1, this);
    }

    public t0.p getPointerIconService() {
        return this.f220Q0;
    }

    public I0.a getRectManager() {
        return this.f267z;
    }

    public C2731G getRoot() {
        return this.f263x;
    }

    public z0.u0 getRootForTest() {
        return this.f191A;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C1930k c1930k;
        if (Build.VERSION.SDK_INT < 31 || (c1930k = this.f216O0) == null) {
            return false;
        }
        return ((Boolean) ((C0305m0) c1930k.f16910l).getValue()).booleanValue();
    }

    public H0.p getSemanticsOwner() {
        return this.f193B;
    }

    public C2733I getSharedDrawScope() {
        return this.f241m;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C0069y0.f597a.a(this) : this.f224U;
    }

    public z0.p0 getSnapshotObserver() {
        return this.f223T;
    }

    public InterfaceC0044l1 getSoftwareKeyboardController() {
        return this.f256t0;
    }

    public P0.x getTextInputService() {
        return this.f252r0;
    }

    public m1 getTextToolbar() {
        return this.B0;
    }

    public final z0.t0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public q1 getViewConfiguration() {
        return this.f259v;
    }

    public final C0053q getViewTreeOwners() {
        return (C0053q) this.f240l0.getValue();
    }

    public t1 getWindowInfo() {
        return this.f255t;
    }

    public final C0533b get_autofillManager$ui_release() {
        return this.f217P;
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void i(InterfaceC0491u interfaceC0491u) {
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void k(InterfaceC0491u interfaceC0491u) {
        kotlin.jvm.internal.l.f("owner", interfaceC0491u);
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void l(InterfaceC0491u interfaceC0491u) {
    }

    public final void o(C2731G c2731g, boolean z3) {
        this.f228b0.f(c2731g, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.L g5;
        InterfaceC0491u interfaceC0491u;
        m2.g gVar;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(Z.w());
        }
        this.f261w.onViewAttachedToWindow(this);
        if (i > 28) {
            if (f190V0 == null) {
                RunnableC0051p runnableC0051p = new RunnableC0051p();
                f190V0 = runnableC0051p;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f186R0 == null) {
                        f186R0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f188T0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f186R0;
                        f188T0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f188T0;
                    if (method != null) {
                        method.invoke(null, runnableC0051p);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C2316B c2316b = f189U0;
            synchronized (c2316b) {
                c2316b.a(this);
            }
        }
        this.f255t.f473a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f255t.getClass();
        this.f255t.getClass();
        r(getRoot());
        q(getRoot());
        getSnapshotObserver().f21843a.e();
        if (g() && (gVar = this.f215O) != null) {
            c0.f fVar = c0.f.f7386a;
            fVar.getClass();
            ((AutofillManager) gVar.f17996n).registerCallback(fVar);
        }
        InterfaceC0491u f = androidx.lifecycle.L.f(this);
        U1.e x5 = N4.b.x(this);
        C0053q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f != null && x5 != null && (f != (interfaceC0491u = viewTreeOwners.f549a) || x5 != interfaceC0491u))) {
            if (f == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (x5 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (g5 = viewTreeOwners.f549a.g()) != null) {
                g5.k(this);
            }
            f.g().a(this);
            C0053q c0053q = new C0053q(f, x5);
            set_viewTreeOwners(c0053q);
            i4.c cVar = this.f242m0;
            if (cVar != null) {
                cVar.c(c0053q);
            }
            this.f242m0 = null;
        }
        q0.c cVar2 = this.f268z0;
        int i5 = isInTouchMode() ? 1 : 2;
        cVar2.getClass();
        cVar2.f18855a.setValue(new C2296a(i5));
        C0053q viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.L g6 = viewTreeOwners2 != null ? viewTreeOwners2.f549a.g() : null;
        if (g6 == null) {
            throw AbstractC0467k.u("No lifecycle owner exists");
        }
        g6.a(this);
        g6.a(this.f196D);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f244n0);
        getViewTreeObserver().addOnScrollChangedListener(this.f246o0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f248p0);
        if (Build.VERSION.SDK_INT >= 31) {
            U.f394a.b(this);
        }
        C0533b c0533b = this.f217P;
        if (c0533b != null) {
            ((C1965j) getFocusOwner()).f17034g.a(c0533b);
            getSemanticsOwner().f2122d.a(c0533b);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        b0.s sVar = (b0.s) this.f254s0.get();
        C0046m0 c0046m0 = (C0046m0) (sVar != null ? sVar.f7177b : null);
        if (c0046m0 == null) {
            return this.f250q0.f4692d;
        }
        b0.s sVar2 = (b0.s) c0046m0.f536n.get();
        Z0 z02 = (Z0) (sVar2 != null ? sVar2.f7177b : null);
        return z02 != null && (z02.f431e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AbstractC2346c.a(getContext()));
        this.f255t.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.f262w0) {
            this.f262w0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(G4.d.m(getContext()));
        }
        this.f213N.c(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i5;
        int i6;
        int i7 = 6;
        b0.s sVar = (b0.s) this.f254s0.get();
        C0046m0 c0046m0 = (C0046m0) (sVar != null ? sVar.f7177b : null);
        if (c0046m0 == null) {
            P0.z zVar = this.f250q0;
            if (zVar.f4692d) {
                P0.k kVar = zVar.f4695h;
                P0.w wVar = zVar.f4694g;
                int i8 = kVar.f4662e;
                boolean z3 = kVar.f4658a;
                if (i8 != 1) {
                    if (i8 == 0) {
                        i = 1;
                    } else if (i8 == 2) {
                        i = 2;
                    } else if (i8 == 6) {
                        i = 5;
                    } else if (i8 == 5) {
                        i = 7;
                    } else if (i8 == 3) {
                        i = 3;
                    } else if (i8 == 4) {
                        i = 4;
                    } else {
                        if (i8 != 7) {
                            throw new IllegalStateException("invalid ImeAction");
                        }
                        i = 6;
                    }
                    editorInfo.imeOptions = i;
                    i5 = kVar.f4661d;
                    if (i5 == 1) {
                    }
                    if (!z3) {
                    }
                    i6 = editorInfo.inputType;
                    if ((i6 & 1) == 1) {
                    }
                    long j5 = wVar.f4680b;
                    int i9 = K0.N.f2802c;
                    editorInfo.initialSelStart = (int) (j5 >> 32);
                    editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
                    AbstractC2346c.B(editorInfo, wVar.f4679a.f2829l);
                    editorInfo.imeOptions |= 33554432;
                    if (v1.k.d()) {
                    }
                    P0.s sVar2 = new P0.s(zVar.f4694g, new C1930k(13, zVar), zVar.f4695h.f4660c);
                    zVar.i.add(new WeakReference(sVar2));
                    return sVar2;
                }
                if (!z3) {
                    i = 0;
                    editorInfo.imeOptions = i;
                    i5 = kVar.f4661d;
                    if (i5 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i5 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i;
                    } else if (i5 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i5 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i5 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i5 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i5 == 7) {
                        editorInfo.inputType = 129;
                    } else if (i5 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i5 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        editorInfo.inputType = 8194;
                    }
                    if (!z3) {
                        int i10 = editorInfo.inputType;
                        if ((i10 & 1) == 1) {
                            editorInfo.inputType = i10 | 131072;
                            if (i8 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i6 = editorInfo.inputType;
                    if ((i6 & 1) == 1) {
                        int i11 = kVar.f4659b;
                        if (i11 == 1) {
                            editorInfo.inputType = i6 | 4096;
                        } else if (i11 == 2) {
                            editorInfo.inputType = i6 | 8192;
                        } else if (i11 == 3) {
                            editorInfo.inputType = i6 | 16384;
                        }
                        if (kVar.f4660c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j52 = wVar.f4680b;
                    int i92 = K0.N.f2802c;
                    editorInfo.initialSelStart = (int) (j52 >> 32);
                    editorInfo.initialSelEnd = (int) (j52 & 4294967295L);
                    AbstractC2346c.B(editorInfo, wVar.f4679a.f2829l);
                    editorInfo.imeOptions |= 33554432;
                    if (v1.k.d()) {
                        v1.k.a().i(editorInfo);
                    }
                    P0.s sVar22 = new P0.s(zVar.f4694g, new C1930k(13, zVar), zVar.f4695h.f4660c);
                    zVar.i.add(new WeakReference(sVar22));
                    return sVar22;
                }
                i = 6;
                editorInfo.imeOptions = i;
                i5 = kVar.f4661d;
                if (i5 == 1) {
                }
                if (!z3) {
                }
                i6 = editorInfo.inputType;
                if ((i6 & 1) == 1) {
                }
                long j522 = wVar.f4680b;
                int i922 = K0.N.f2802c;
                editorInfo.initialSelStart = (int) (j522 >> 32);
                editorInfo.initialSelEnd = (int) (j522 & 4294967295L);
                AbstractC2346c.B(editorInfo, wVar.f4679a.f2829l);
                editorInfo.imeOptions |= 33554432;
                if (v1.k.d()) {
                }
                P0.s sVar222 = new P0.s(zVar.f4694g, new C1930k(13, zVar), zVar.f4695h.f4660c);
                zVar.i.add(new WeakReference(sVar222));
                return sVar222;
            }
        } else {
            b0.s sVar3 = (b0.s) c0046m0.f536n.get();
            Z0 z02 = (Z0) (sVar3 != null ? sVar3.f7177b : null);
            if (z02 != null) {
                synchronized (z02.f429c) {
                    if (z02.f431e) {
                        return null;
                    }
                    G.D a5 = z02.f427a.a(editorInfo);
                    A.B b3 = new A.B(i7, z02);
                    int i12 = Build.VERSION.SDK_INT;
                    InputConnection oVar = i12 >= 34 ? new P0.o(a5, b3) : i12 >= 25 ? new P0.n(a5, b3) : i12 >= 24 ? new P0.m(a5, b3) : new P0.l(a5, b3);
                    z02.f430d.c(new z0.B0(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        H0.n nVar;
        AutofillId autofillId;
        String a5;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = this.f196D;
        viewOnAttachStateChangeListenerC1909d.getClass();
        for (long j5 : jArr) {
            H0.o oVar = (H0.o) viewOnAttachStateChangeListenerC1909d.e().b((int) j5);
            if (oVar != null && (nVar = oVar.f2117a) != null) {
                WE.D();
                autofillId = viewOnAttachStateChangeListenerC1909d.f16832k.getAutofillId();
                ViewTranslationRequest.Builder p5 = WE.p(autofillId, nVar.f2116g);
                Object g5 = nVar.f2114d.f2103k.g(H0.s.f2144A);
                if (g5 == null) {
                    g5 = null;
                }
                List list = (List) g5;
                if (list != null && (a5 = Y0.a.a(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new C0203h(a5));
                    p5.setValue("android:text", forText);
                    build = p5.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m2.g gVar;
        super.onDetachedFromWindow();
        this.f261w.onViewDetachedFromWindow(this);
        if (this.f247p) {
            View view = this.f245o;
            if (view == null) {
                kotlin.jvm.internal.l.k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C2316B c2316b = f189U0;
            synchronized (c2316b) {
                c2316b.i(this);
            }
        }
        Z.s sVar = getSnapshotObserver().f21843a;
        P0 p02 = sVar.f6236h;
        if (p02 != null) {
            p02.a();
        }
        sVar.a();
        this.f255t.getClass();
        C0053q viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.L g5 = viewTreeOwners != null ? viewTreeOwners.f549a.g() : null;
        if (g5 == null) {
            throw AbstractC0467k.u("No lifecycle owner exists");
        }
        g5.k(this.f196D);
        g5.k(this);
        if (g() && (gVar = this.f215O) != null) {
            c0.f fVar = c0.f.f7386a;
            fVar.getClass();
            ((AutofillManager) gVar.f17996n).unregisterCallback(fVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f244n0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f246o0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f248p0);
        if (i >= 31) {
            U.f394a.a(this);
        }
        C0533b c0533b = this.f217P;
        if (c0533b != null) {
            getSemanticsOwner().f2122d.i(c0533b);
            ((C1965j) getFocusOwner()).f17034g.i(c0533b);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        if (z3 || hasFocus()) {
            return;
        }
        AbstractC1961f.e(((C1965j) getFocusOwner()).f17031c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        this.f234h0 = 0L;
        this.f228b0.j(this.f210L0);
        this.f226W = null;
        N();
        if (this.f225V != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i6 - i, i7 - i5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        z0.W w5 = this.f228b0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                r(getRoot());
            }
            long m5 = m(i);
            long m6 = m(i5);
            long t5 = AbstractC2349a.t((int) (m5 >>> 32), (int) (m5 & 4294967295L), (int) (m6 >>> 32), (int) (4294967295L & m6));
            W0.a aVar = this.f226W;
            if (aVar == null) {
                this.f226W = new W0.a(t5);
                this.f227a0 = false;
            } else if (!W0.a.b(aVar.f6000a, t5)) {
                this.f227a0 = true;
            }
            w5.q(t5);
            w5.l();
            setMeasuredDimension(getRoot().f21613P.f21663p.f20973k, getRoot().f21613P.f21663p.f20974l);
            if (this.f225V != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f21613P.f21663p.f20973k, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f21613P.f21663p.f20974l, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!g() || viewStructure == null) {
            return;
        }
        C0533b c0533b = this.f217P;
        if (c0533b != null) {
            C2731G c2731g = c0533b.f7379b.f2119a;
            AutofillId autofillId = c0533b.f;
            String str = c0533b.f7382e;
            I0.a aVar = c0533b.f7381d;
            AbstractC2425d.D(viewStructure, c2731g, autofillId, str, aVar);
            Object[] objArr = r.L.f18953a;
            C2316B c2316b = new C2316B(2);
            c2316b.a(c2731g);
            c2316b.a(viewStructure);
            while (c2316b.h()) {
                Object j5 = c2316b.j(c2316b.f18905b - 1);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.ViewStructure", j5);
                ViewStructure viewStructure2 = (ViewStructure) j5;
                Object j6 = c2316b.j(c2316b.f18905b - 1);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo", j6);
                R.b bVar = (R.b) ((C2731G) j6).n();
                int i5 = bVar.f5100k.f5108m;
                for (int i6 = 0; i6 < i5; i6++) {
                    C2731G c2731g2 = (C2731G) bVar.get(i6);
                    if (!c2731g2.f21623Z && c2731g2.I() && c2731g2.J()) {
                        H0.j w5 = c2731g2.w();
                        if (w5 != null) {
                            H0.v vVar = H0.i.f2084g;
                            C2321G c2321g = w5.f2103k;
                            if (c2321g.b(vVar) || c2321g.b(H0.s.f2171q) || c2321g.b(H0.s.f2172r)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                AbstractC2425d.D(newChild, c2731g2, c0533b.f, str, aVar);
                                c2316b.a(c2731g2);
                                c2316b.a(newChild);
                            }
                        }
                        c2316b.a(c2731g2);
                        c2316b.a(viewStructure2);
                    }
                }
            }
        }
        m2.g gVar = this.f215O;
        if (gVar != null) {
            c0.h hVar = (c0.h) gVar.f17995m;
            if (hVar.f7387a.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap = hVar.f7387a;
            int addChildCount = viewStructure.addChildCount(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) gVar.f17997o, intValue);
                newChild2.setId(intValue, ((F) gVar.f17994l).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f239l) {
            W0.m mVar = W0.m.f6016k;
            W0.m mVar2 = i != 0 ? i != 1 ? null : W0.m.f6017l : mVar;
            if (mVar2 != null) {
                mVar = mVar2;
            }
            setLayoutDirection(mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [i4.c[], java.io.Serializable] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C1930k c1930k;
        int i = 1;
        if (Build.VERSION.SDK_INT < 31 || (c1930k = this.f216O0) == null) {
            return;
        }
        H0.p semanticsOwner = getSemanticsOwner();
        a4.h coroutineContext = getCoroutineContext();
        R.e eVar = new R.e(new G0.k[16]);
        AbstractC2425d.N(semanticsOwner.a(), 0, new G0.j(1, 8, R.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        X3.l.I0(eVar.f5106k, new H0.w(i, new i4.c[]{G0.d.f1790n, G0.d.f1791o}), 0, eVar.f5108m);
        int i5 = eVar.f5108m;
        G0.k kVar = (G0.k) (i5 == 0 ? null : eVar.f5106k[i5 - 1]);
        if (kVar == null) {
            return;
        }
        u4.c a5 = AbstractC2282w.a(coroutineContext);
        H0.n nVar = kVar.f1808a;
        W0.k kVar2 = kVar.f1810c;
        G0.f fVar = new G0.f(nVar, kVar2, a5, c1930k, this);
        z0.e0 e0Var = kVar.f1811d;
        long j5 = (kVar2.f6011a << 32) | (kVar2.f6012b & 4294967295L);
        ScrollCaptureTarget o5 = AbstractC0039k.o(this, i0.F.r(N4.b.N(x0.f0.h(e0Var).s(e0Var, true))), new Point((int) (j5 >> 32), (int) (j5 & 4294967295L)), fVar);
        o5.setScrollBounds(i0.F.r(kVar2));
        consumer.accept(o5);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = this.f196D;
        viewOnAttachStateChangeListenerC1909d.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            N4.b.r(viewOnAttachStateChangeListenerC1909d, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC1909d.f16832k.post(new Q3.g(2, viewOnAttachStateChangeListenerC1909d, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean w5;
        this.f255t.f473a.setValue(Boolean.valueOf(z3));
        this.f214N0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (w5 = Z.w())) {
            return;
        }
        setShowLayoutBounds(w5);
        q(getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c5, B:27:0x00cd, B:28:0x00d0, B:30:0x00d4, B:32:0x00da, B:34:0x00de, B:35:0x00e4, B:38:0x00ec, B:41:0x00f4, B:42:0x0100, B:44:0x0106, B:46:0x010c, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:52:0x0120, B:57:0x0133, B:59:0x0137, B:60:0x013e, B:66:0x014f, B:67:0x0159, B:69:0x0161, B:70:0x0164, B:76:0x016b), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004e A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:91:0x0034, B:93:0x003e, B:98:0x004e, B:101:0x007e, B:103:0x0082, B:105:0x0091, B:107:0x0097, B:13:0x00a2, B:21:0x00b5, B:23:0x00bb, B:108:0x0056, B:114:0x0062, B:117:0x006a), top: B:90:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(MotionEvent motionEvent) {
        boolean z3;
        int actionMasked;
        MotionEvent motionEvent2;
        F f;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z5;
        C2407d c2407d;
        removeCallbacks(this.f206I0);
        try {
            G(motionEvent);
            this.f235i0 = true;
            x(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.f195C0;
                boolean z6 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                A.v vVar = this.f211M;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z3 = false;
                            if (z3) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!vVar.f132a) {
                                        C2338p c2338p = (C2338p) ((C2138i) vVar.f135d).f18249l;
                                        int i = c2338p.f19032n;
                                        Object[] objArr = c2338p.f19031m;
                                        for (int i5 = 0; i5 < i; i5++) {
                                            objArr[i5] = null;
                                        }
                                        c2338p.f19032n = 0;
                                        c2338p.f19029k = false;
                                        ((C2407d) vVar.f134c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z6) {
                                    L(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z7 = motionEvent.getToolType(0) != 3;
                                if (z6 && z7 && actionMasked2 != 3 && actionMasked2 != 9 && t(motionEvent)) {
                                    f = this;
                                    f.L(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    f = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = f.f195C0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = f.f195C0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    C2410g c2410g = f.f209L;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = f.f195C0;
                                            float x5 = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = f.f195C0;
                                            z5 = x5 == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = f.f195C0;
                                            boolean z8 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z5 || z8) {
                                                if (pointerId >= 0) {
                                                    c2410g.f19474c.delete(pointerId);
                                                    c2410g.f19473b.delete(pointerId);
                                                }
                                                c2407d = (C2407d) vVar.f134c;
                                                if (c2407d.f19468d) {
                                                    c2407d.f19470g.f19483a.h();
                                                } else {
                                                    c2407d.f19468d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        c2410g.f19474c.delete(pointerId);
                                        c2410g.f19473b.delete(pointerId);
                                    }
                                }
                                f.f195C0 = MotionEvent.obtainNoHistory(motionEvent);
                                int K = K(motionEvent);
                                Trace.endSection();
                                f.f235i0 = false;
                                return K;
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z6) {
                }
                f = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = f.f195C0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = f.f195C0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    C2410g c2410g2 = f.f209L;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = f.f195C0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = f.f195C0;
                        if (motionEvent72 != null) {
                        }
                        if (x5 == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = f.f195C0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z5) {
                        }
                        if (pointerId >= 0) {
                        }
                        c2407d = (C2407d) vVar.f134c;
                        if (c2407d.f19468d) {
                        }
                    }
                }
                f.f195C0 = MotionEvent.obtainNoHistory(motionEvent);
                int K5 = K(motionEvent);
                Trace.endSection();
                f.f235i0 = false;
                return K5;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f235i0 = false;
            throw th3;
        }
    }

    public final void r(C2731G c2731g) {
        this.f228b0.p(c2731g, false);
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            r((C2731G) objArr[i5]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((C1965j) getFocusOwner()).f17031c.A0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (ordinal != 3) {
            throw new D2.e();
        }
        C1959d D5 = AbstractC1961f.D(i);
        int i5 = D5 != null ? D5.f17021a : 7;
        return kotlin.jvm.internal.l.a(((C1965j) getFocusOwner()).e(i5, rect != null ? i0.F.w(rect) : null, new A(i5, 0)), Boolean.TRUE);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j5) {
        this.f194C.f349h = j5;
    }

    public final void setConfigurationChangeObserver(i4.c cVar) {
        this.f213N = cVar;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d) {
        this.f196D = viewOnAttachStateChangeListenerC1909d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(a4.h hVar) {
        this.f251r = hVar;
        b0.o oVar = getRoot().f21612O.f;
        if (oVar instanceof t0.H) {
            ((t0.H) oVar).A0();
        }
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar2 = oVar.f7162k;
        b0.o oVar3 = oVar2.f7167p;
        if (oVar3 == null) {
            AbstractC2749f.b(eVar, oVar2);
        } else {
            eVar.c(oVar3);
        }
        while (true) {
            int i = eVar.f5108m;
            if (i == 0) {
                return;
            }
            b0.o oVar4 = (b0.o) eVar.l(i - 1);
            if ((oVar4.f7165n & 16) != 0) {
                for (b0.o oVar5 = oVar4; oVar5 != null; oVar5 = oVar5.f7167p) {
                    if ((oVar5.f7164m & 16) != 0) {
                        AbstractC2756m abstractC2756m = oVar5;
                        ?? r5 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof z0.s0) {
                                z0.s0 s0Var = (z0.s0) abstractC2756m;
                                if (s0Var instanceof t0.H) {
                                    ((t0.H) s0Var).A0();
                                }
                            } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar6 = abstractC2756m.f21839z;
                                int i5 = 0;
                                abstractC2756m = abstractC2756m;
                                r5 = r5;
                                while (oVar6 != null) {
                                    if ((oVar6.f7164m & 16) != 0) {
                                        i5++;
                                        r5 = r5;
                                        if (i5 == 1) {
                                            abstractC2756m = oVar6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r5.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r5.c(oVar6);
                                        }
                                    }
                                    oVar6 = oVar6.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r5 = r5;
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2756m = AbstractC2749f.f(r5);
                        }
                    }
                }
            }
            AbstractC2749f.b(eVar, oVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j5) {
        this.f234h0 = j5;
    }

    public final void setOnViewTreeOwnersAvailable(i4.c cVar) {
        C0053q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.c(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f242m0 = cVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.f224U = z3;
    }

    public void setUncaughtExceptionHandler(z0.t0 t0Var) {
        this.f228b0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return 0.0f <= x5 && x5 <= ((float) getWidth()) && 0.0f <= y5 && y5 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f195C0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void v(float[] fArr) {
        F();
        i0.z.e(fArr, this.f232f0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f236j0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f236j0 & 4294967295L));
        float[] fArr2 = this.f231e0;
        i0.z.d(fArr2);
        i0.z.f(fArr2, intBitsToFloat, intBitsToFloat2);
        Z.B(fArr, fArr2);
    }

    public final long w(long j5) {
        F();
        long b3 = i0.z.b(j5, this.f232f0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f236j0 >> 32)) + Float.intBitsToFloat((int) (b3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f236j0 & 4294967295L)) + Float.intBitsToFloat((int) (b3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void x(boolean z3) {
        B b3;
        z0.W w5 = this.f228b0;
        if (w5.f21724b.E() || ((R.e) w5.f21727e.f20439l).f5108m != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    b3 = this.f210L0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                b3 = null;
            }
            if (w5.j(b3)) {
                requestLayout();
            }
            w5.a(false);
            if (this.K) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.K = false;
            }
            Trace.endSection();
        }
    }

    public final void y(C2731G c2731g, long j5) {
        z0.W w5 = this.f228b0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            w5.k(c2731g, j5);
            if (!w5.f21724b.E()) {
                w5.a(false);
                if (this.K) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.K = false;
                }
            }
            getRectManager().b();
        } finally {
            Trace.endSection();
        }
    }

    public final void z(z0.m0 m0Var, boolean z3) {
        ArrayList arrayList = this.f203H;
        if (!z3) {
            if (this.J) {
                return;
            }
            arrayList.remove(m0Var);
            ArrayList arrayList2 = this.f205I;
            if (arrayList2 != null) {
                arrayList2.remove(m0Var);
                return;
            }
            return;
        }
        if (!this.J) {
            arrayList.add(m0Var);
            return;
        }
        ArrayList arrayList3 = this.f205I;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f205I = arrayList3;
        }
        arrayList3.add(m0Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        kotlin.jvm.internal.l.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public C0030h getAccessibilityManager() {
        return this.f198E;
    }

    public C0033i getClipboard() {
        return this.f222S;
    }

    public C0036j getClipboardManager() {
        return this.f221R;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public e0.a m3getDragAndDropManager() {
        return this.f253s;
    }

    public C2343v getLayoutNodes() {
        return this.f265y;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public F m5getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i5) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i5;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @W3.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @W3.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(z0.t0 t0Var) {
    }
}
