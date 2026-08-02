package androidx.compose.ui.platform;

import B1.m0;
import D1.AbstractC2813m;
import D1.C2793c;
import D1.C2802g0;
import D1.C2809k;
import D1.H;
import D1.InterfaceC2807j;
import P1.AbstractC3809p;
import P1.C3814v;
import S0.C3991w0;
import Sc.C;
import Sc.C4005g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.U;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.core.view.C5305a;
import androidx.core.view.C5306a0;
import androidx.core.view.C5330m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import c1.C5710a;
import c1.C5721l;
import c1.InterfaceC5704H;
import c2.C5728b;
import f1.C6397a;
import f1.C6398b;
import fd.InterfaceC6511n;
import g1.ViewOnAttachStateChangeListenerC6609a;
import h1.C6768a;
import h1.C6777j;
import h1.InterfaceC6770c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k1.C7459e;
import k1.C7460f;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.Intrinsics;
import l1.C7803V;
import l1.C7837o0;
import l1.C7847x;
import l1.InterfaceC7802U;
import l1.InterfaceC7823h0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import t1.C9725c;
import u1.C9920a;
import v1.C10176a;
import v1.C10177b;
import v1.C10178c;
import v1.C10179d;
import x1.C10625A;
import x1.C10634i;
import x1.t;
import z1.C10972b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u0004:\u0002\n\u000bJ\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "LD1/x0;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements D1.x0, DefaultLifecycleObserver {

    /* renamed from: V0, reason: collision with root package name */
    private static Class<?> f40494V0;

    /* renamed from: W0, reason: collision with root package name */
    private static Method f40495W0;

    /* renamed from: X0, reason: collision with root package name */
    public static final /* synthetic */ int f40496X0 = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f40497A;

    /* renamed from: A0, reason: collision with root package name */
    @NotNull
    private final N0 f40498A0;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final C5255j f40499B;

    /* renamed from: B0, reason: collision with root package name */
    @NotNull
    private final C5247g0 f40500B0;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final D1.z0 f40501C;

    /* renamed from: C0, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40502C0;

    /* renamed from: D, reason: collision with root package name */
    private boolean f40503D;

    /* renamed from: D0, reason: collision with root package name */
    private int f40504D0;

    /* renamed from: E, reason: collision with root package name */
    private C5288u0 f40505E;

    /* renamed from: E0, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40506E0;

    /* renamed from: F, reason: collision with root package name */
    private U0 f40507F;

    /* renamed from: F0, reason: collision with root package name */
    @NotNull
    private final C9725c f40508F0;

    /* renamed from: G, reason: collision with root package name */
    private Z1.b f40509G;

    /* renamed from: G0, reason: collision with root package name */
    @NotNull
    private final u1.c f40510G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f40511H;

    /* renamed from: H0, reason: collision with root package name */
    @NotNull
    private final C1.g f40512H0;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final D1.Z f40513I;

    /* renamed from: I0, reason: collision with root package name */
    @NotNull
    private final C5268n0 f40514I0;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final C5282s0 f40515J;

    /* renamed from: J0, reason: collision with root package name */
    private MotionEvent f40516J0;

    /* renamed from: K, reason: collision with root package name */
    private long f40517K;

    /* renamed from: K0, reason: collision with root package name */
    private long f40518K0;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final int[] f40519L;

    /* renamed from: L0, reason: collision with root package name */
    @NotNull
    private final h2<D1.w0> f40520L0;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final float[] f40521M;

    /* renamed from: M0, reason: collision with root package name */
    @NotNull
    private final U0.b<Function0<Unit>> f40522M0;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final float[] f40523N;

    /* renamed from: N0, reason: collision with root package name */
    @NotNull
    private final u f40524N0;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final float[] f40525O;

    /* renamed from: O0, reason: collision with root package name */
    @NotNull
    private final RunnableC5273p f40526O0;

    /* renamed from: P, reason: collision with root package name */
    private long f40527P;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f40528P0;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f40529Q;

    /* renamed from: Q0, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40530Q0;

    /* renamed from: R, reason: collision with root package name */
    private long f40531R;

    /* renamed from: R0, reason: collision with root package name */
    @NotNull
    private final InterfaceC5294w0 f40532R0;

    /* renamed from: S, reason: collision with root package name */
    private boolean f40533S;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f40534S0;

    /* renamed from: T0, reason: collision with root package name */
    private final H1.o f40535T0;

    /* renamed from: U0, reason: collision with root package name */
    @NotNull
    private final q f40536U0;

    /* renamed from: a, reason: collision with root package name */
    private long f40537a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final D1.J f40539c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40540d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final FocusOwnerImpl f40541e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private CoroutineContext f40542f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6770c f40543g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final j2 f40544h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f40545i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f40546j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C7803V f40547k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final D1.H f40548l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final I1.t f40549m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C5299y f40550n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private ViewOnAttachStateChangeListenerC6609a f40551o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C5252i f40552p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC7823h0 f40553q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final f1.g f40554r;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40555r0;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ArrayList f40556s;

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private final S0.A1 f40557s0;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f40558t;

    /* renamed from: t0, reason: collision with root package name */
    private Function1<? super b, Unit> f40559t0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f40560u;

    /* renamed from: u0, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserverOnGlobalLayoutListenerC5264m f40561u0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f40562v;

    /* renamed from: v0, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserverOnScrollChangedListenerC5267n f40563v0;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final C10634i f40564w;

    /* renamed from: w0, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserverOnTouchModeChangeListenerC5270o f40565w0;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final x1.B f40566x;

    /* renamed from: x0, reason: collision with root package name */
    @NotNull
    private final Q1.N f40567x0;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private Function1<? super Configuration, Unit> f40568y;

    /* renamed from: y0, reason: collision with root package name */
    @NotNull
    private final Q1.M f40569y0;

    /* renamed from: z, reason: collision with root package name */
    private final C6397a f40570z;

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private final AtomicReference f40571z0;

    public static final class a {
        public static final boolean a() {
            int i11 = AndroidComposeView.f40496X0;
            try {
                if (AndroidComposeView.f40494V0 == null) {
                    AndroidComposeView.f40494V0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f40494V0;
                    AndroidComposeView.f40495W0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f40495W0;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.J f40572a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final M4.e f40573b;

        public b(@NotNull androidx.lifecycle.J j11, @NotNull M4.e eVar) {
            this.f40572a = j11;
            this.f40573b = eVar;
        }

        @NotNull
        public final androidx.lifecycle.J a() {
            return this.f40572a;
        }

        @NotNull
        public final M4.e b() {
            return this.f40573b;
        }
    }

    static final class c extends AbstractC7737t implements Function1<C9920a, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C9920a c9920a) {
            int b11 = c9920a.b();
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            boolean z11 = true;
            if (b11 == 1) {
                z11 = androidComposeView.isInTouchMode();
            } else if (b11 != 2) {
                z11 = false;
            } else if (androidComposeView.isInTouchMode()) {
                z11 = androidComposeView.requestFocusFromTouch();
            }
            return Boolean.valueOf(z11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class d extends C5305a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D1.H f40576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f40577c;

        static final class a extends AbstractC7737t implements Function1<D1.H, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f40578b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(D1.H h11) {
                return Boolean.valueOf(h11.c0().o(8));
            }
        }

        d(D1.H h11, AndroidComposeView androidComposeView) {
            this.f40576b = h11;
            this.f40577c = androidComposeView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            if (r1.intValue() == r6.getF40549m().a().l()) goto L13;
         */
        @Override // androidx.core.view.C5305a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onInitializeAccessibilityNodeInfo(@NotNull View view, @NotNull y2.q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            if (androidComposeView.f40550n.R()) {
                qVar.y0(false);
            }
            D1.H h11 = this.f40576b;
            D1.H b11 = I1.s.b(h11, a.f40578b);
            Integer valueOf = b11 != null ? Integer.valueOf(b11.i0()) : null;
            if (valueOf != null) {
            }
            valueOf = -1;
            int intValue = valueOf.intValue();
            AndroidComposeView androidComposeView2 = this.f40577c;
            qVar.g0(intValue, androidComposeView2);
            int i02 = h11.i0();
            int c11 = androidComposeView.f40550n.K().c(i02);
            if (c11 != -1) {
                C5728b g10 = N1.g(androidComposeView.d0(), c11);
                if (g10 != null) {
                    qVar.w0(g10);
                } else {
                    qVar.v0(c11, androidComposeView2);
                }
                AndroidComposeView.f(androidComposeView, i02, qVar.z0(), androidComposeView.f40550n.I());
            }
            int c12 = androidComposeView.f40550n.J().c(i02);
            if (c12 != -1) {
                C5728b g11 = N1.g(androidComposeView.d0(), c12);
                if (g11 != null) {
                    qVar.u0(g11);
                } else {
                    qVar.t0(c12, androidComposeView2);
                }
                AndroidComposeView.f(androidComposeView, i02, qVar.z0(), androidComposeView.f40550n.H());
            }
        }
    }

    static final class e extends AbstractC7737t implements Function1<Configuration, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f40579b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7735q implements Function0<androidx.compose.ui.platform.coreshims.c> {
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.coreshims.c invoke() {
            View view = (View) this.receiver;
            int i11 = U.f40742b;
            androidx.compose.ui.platform.coreshims.d.c(view);
            return androidx.compose.ui.platform.coreshims.d.b(view);
        }
    }

    /* loaded from: classes8.dex */
    static final class g extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyEvent f40581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(KeyEvent keyEvent) {
            super(0);
            this.f40581c = keyEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f40581c));
        }
    }

    /* synthetic */ class h extends C7735q implements InterfaceC6511n<C6777j, C7464j, Function1<? super InterfaceC8412e, ? extends Unit>, Boolean> {
        @NotNull
        public final Boolean b(@NotNull C6777j c6777j, long j11, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            int i11 = AndroidComposeView.f40496X0;
            Resources resources = androidComposeView.getContext().getResources();
            return Boolean.valueOf(L.f40715a.a(androidComposeView, c6777j, new C6768a(Z1.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j11, function1)));
        }

        @Override // fd.InterfaceC6511n
        public final /* bridge */ /* synthetic */ Boolean invoke(C6777j c6777j, C7464j c7464j, Function1<? super InterfaceC8412e, ? extends Unit> function1) {
            return b(c6777j, c7464j.i(), function1);
        }
    }

    /* synthetic */ class i extends C7735q implements Function1<Function0<? extends Unit>, Unit> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            ((AndroidComposeView) this.receiver).J0(function0);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class j extends C7735q implements Function2<j1.c, C7460f, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(j1.c cVar, C7460f c7460f) {
            return Boolean.valueOf(AndroidComposeView.M((AndroidComposeView) this.receiver, cVar, c7460f));
        }
    }

    /* synthetic */ class k extends C7735q implements Function1<j1.c, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(j1.c cVar) {
            return Boolean.valueOf(AndroidComposeView.L((AndroidComposeView) this.receiver, cVar.d()));
        }
    }

    /* synthetic */ class l extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            int i11 = AndroidComposeView.f40496X0;
            if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
                androidComposeView.clearFocus();
            }
            return Unit.f71690a;
        }
    }

    /* synthetic */ class m extends C7735q implements Function0<C7460f> {
        @Override // kotlin.jvm.functions.Function0
        public final C7460f invoke() {
            return ((AndroidComposeView) this.receiver).C0();
        }
    }

    /* synthetic */ class n extends C7740w {
        @Override // kotlin.reflect.n
        public final Object get() {
            return ((AndroidComposeView) this.receiver).getLayoutDirection();
        }

        @Override // kotlin.reflect.j
        public final void set(Object obj) {
            AndroidComposeView.Q((AndroidComposeView) this.receiver, (Z1.s) obj);
        }
    }

    /* loaded from: classes8.dex */
    static final class o extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f40582b = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    static final class p extends AbstractC7737t implements Function1<C10177b, Boolean> {
        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C10177b c10177b) {
            j1.c a11;
            KeyEvent b11 = c10177b.b();
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.getClass();
            long a12 = C10179d.a(b11);
            int i11 = C10176a.f101642n;
            if (C10176a.n(a12, C10176a.C2215a.l())) {
                a11 = j1.c.a(C10179d.f(b11) ? 2 : 1);
            } else if (C10176a.n(a12, C10176a.C2215a.e())) {
                a11 = j1.c.a(4);
            } else if (C10176a.n(a12, C10176a.C2215a.d())) {
                a11 = j1.c.a(3);
            } else {
                a11 = C10176a.n(a12, C10176a.C2215a.f()) ? true : C10176a.n(a12, C10176a.C2215a.k()) ? j1.c.a(5) : C10176a.n(a12, C10176a.C2215a.c()) ? true : C10176a.n(a12, C10176a.C2215a.j()) ? j1.c.a(6) : C10176a.n(a12, C10176a.C2215a.b()) ? true : C10176a.n(a12, C10176a.C2215a.g()) ? true : C10176a.n(a12, C10176a.C2215a.i()) ? j1.c.a(7) : C10176a.n(a12, C10176a.C2215a.a()) ? true : C10176a.n(a12, C10176a.C2215a.h()) ? j1.c.a(8) : null;
            }
            if (a11 == null || !C10178c.a(C10179d.b(b11), 2)) {
                return Boolean.FALSE;
            }
            C7460f C02 = androidComposeView.C0();
            Boolean l11 = ((FocusOwnerImpl) androidComposeView.q()).l(a11.d(), C02, new androidx.compose.ui.platform.r(a11));
            if (l11 != null ? l11.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!C5330m0.c(a11.d())) {
                return Boolean.FALSE;
            }
            Integer c11 = j1.h.c(a11.d());
            if (c11 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int intValue = c11.intValue();
            Rect b12 = C02 != null ? l1.x0.b(C02) : null;
            if (b12 == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View view = androidComposeView;
            loop0: while (true) {
                if (view == null) {
                    view = null;
                    break;
                }
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = androidComposeView.getRootView();
                Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                if (view != null) {
                    int i12 = U.f40742b;
                    if (!view.equals(androidComposeView)) {
                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                            if (parent == androidComposeView) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
            }
            if (Intrinsics.d(view, androidComposeView)) {
                view = null;
            }
            if (view != null && j1.h.b(view, Integer.valueOf(intValue), b12)) {
                return Boolean.TRUE;
            }
            if (!((FocusOwnerImpl) androidComposeView.q()).e(a11.d(), false, false)) {
                return Boolean.TRUE;
            }
            Boolean l12 = ((FocusOwnerImpl) androidComposeView.q()).l(a11.d(), null, new C5276q(a11));
            return Boolean.valueOf(l12 != null ? l12.booleanValue() : true);
        }
    }

    public static final class q implements x1.u {
        q() {
            x1.t.f104904a.getClass();
            t.a.a();
        }

        @Override // x1.u
        public final void a(x1.t tVar) {
            if (tVar == null) {
                x1.t.f104904a.getClass();
                tVar = t.a.a();
            }
            S.f40735a.a(AndroidComposeView.this, tVar);
        }
    }

    /* loaded from: classes8.dex */
    static final class r extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5728b f40586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C5728b c5728b) {
            super(0);
            this.f40586c = c5728b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            C5288u0 d02 = androidComposeView.d0();
            C5728b c5728b = this.f40586c;
            d02.removeViewInLayout(c5728b);
            HashMap<D1.H, C5728b> b11 = androidComposeView.d0().b();
            kotlin.jvm.internal.U.d(b11).remove(androidComposeView.d0().a().remove(c5728b));
            c5728b.setImportantForAccessibility(0);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class s extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40587b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i11) {
            super(1);
            this.f40587b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean i11 = j1.y.i(focusTargetNode, this.f40587b);
            return Boolean.valueOf(i11 != null ? i11.booleanValue() : false);
        }
    }

    static final class t extends AbstractC7737t implements Function0<Unit> {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.f40516J0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.f40518K0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.f40524N0);
            }
            return Unit.f71690a;
        }
    }

    public static final class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f40516J0;
            if (motionEvent != null) {
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z11) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i11 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i11 = 2;
                }
                androidComposeView.R0(motionEvent, i11, androidComposeView.f40518K0, false);
            }
        }
    }

    static final class v extends AbstractC7737t implements Function1<C10972b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f40590b = new v(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(C10972b c10972b) {
            return Boolean.FALSE;
        }
    }

    static final class w extends AbstractC7737t implements Function1<Function0<? extends Unit>, Unit> {
        w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> function02 = function0;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function02.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new androidx.activity.r(function02, 1));
                }
            }
            return Unit.f71690a;
        }
    }

    static final class x extends AbstractC7737t implements Function0<b> {
        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b invoke() {
            return AndroidComposeView.J(AndroidComposeView.this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.platform.m] */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.platform.n] */
    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.compose.ui.platform.o] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        super(context);
        C3991w0 f7;
        C3991w0 f11;
        this.f40537a = 9205357640488583168L;
        this.f40538b = true;
        this.f40539c = new D1.J();
        this.f40540d = S0.n1.f(Z1.a.a(context), S0.n1.k());
        I1.f fVar = new I1.f();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(new i(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new j(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new k(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new l(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new m(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new n(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.f40541e = focusOwnerImpl;
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.f40542f = coroutineContext;
        this.f40543g = dragAndDropModifierOnDragListener;
        this.f40544h = new j2();
        e.a aVar = androidx.compose.ui.e.f40358c0;
        androidx.compose.ui.e a11 = androidx.compose.ui.input.key.a.a(aVar, new p());
        this.f40545i = a11;
        androidx.compose.ui.e a12 = androidx.compose.ui.input.rotary.a.a(aVar, v.f40590b);
        this.f40546j = a12;
        this.f40547k = new C7803V();
        D1.H h11 = new D1.H(3);
        h11.h(B1.q0.f2144b);
        h11.j(g());
        h11.d(emptySemanticsElement.l0(a12).l0(a11).l0(focusOwnerImpl.m()).l0(dragAndDropModifierOnDragListener.d()));
        this.f40548l = h11;
        this.f40549m = new I1.t(h11, fVar);
        C5299y c5299y = new C5299y(this);
        this.f40550n = c5299y;
        ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a = new ViewOnAttachStateChangeListenerC6609a(this, new f(0, this, U.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.f40551o = viewOnAttachStateChangeListenerC6609a;
        this.f40552p = new C5252i(context);
        this.f40553q = C7847x.a(this);
        f1.g gVar = new f1.g();
        this.f40554r = gVar;
        this.f40556s = new ArrayList();
        this.f40564w = new C10634i();
        this.f40566x = new x1.B(h11);
        this.f40568y = e.f40579b;
        this.f40570z = new C6397a(this, gVar);
        this.f40499B = new C5255j(context);
        this.f40501C = new D1.z0(new w());
        this.f40513I = new D1.Z(h11);
        this.f40515J = new C5282s0(ViewConfiguration.get(context));
        this.f40517K = Z1.n.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f40519L = new int[]{0, 0};
        float[] b11 = C7837o0.b();
        this.f40521M = b11;
        this.f40523N = C7837o0.b();
        this.f40525O = C7837o0.b();
        this.f40527P = -1L;
        this.f40531R = 9187343241974906880L;
        this.f40533S = true;
        f7 = S0.n1.f(null, S0.D1.f25195a);
        this.f40555r0 = f7;
        this.f40557s0 = S0.n1.e(new x());
        this.f40561u0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.e(AndroidComposeView.this);
            }
        };
        this.f40563v0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.d(AndroidComposeView.this);
            }
        };
        this.f40565w0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                AndroidComposeView.a(AndroidComposeView.this, z11);
            }
        };
        Q1.N n11 = new Q1.N(this, this);
        this.f40567x0 = n11;
        ((U.a) U.d()).getClass();
        Q1.M m11 = new Q1.M(n11);
        this.f40569y0 = m11;
        this.f40571z0 = new AtomicReference(null);
        this.f40498A0 = new N0(m11);
        this.f40500B0 = new C5247g0();
        this.f40502C0 = S0.n1.f(C3814v.a(context), S0.n1.k());
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = Build.VERSION.SDK_INT;
        this.f40504D0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        Z1.s sVar = layoutDirection != 0 ? layoutDirection != 1 ? null : Z1.s.Rtl : Z1.s.Ltr;
        f11 = S0.n1.f(sVar == null ? Z1.s.Ltr : sVar, S0.D1.f25195a);
        this.f40506E0 = f11;
        this.f40508F0 = new C9725c(this);
        this.f40510G0 = new u1.c(isInTouchMode() ? 1 : 2, new c());
        this.f40512H0 = new C1.g(this);
        this.f40514I0 = new C5268n0(this);
        this.f40520L0 = new h2<>();
        this.f40522M0 = new U0.b<>(new Function0[16]);
        this.f40524N0 = new u();
        this.f40526O0 = new RunnableC5273p(this, 0);
        this.f40530Q0 = new t();
        this.f40532R0 = i11 < 29 ? new C5297x0(b11) : new C5303z0();
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC6609a);
        setWillNotDraw(false);
        setFocusable(true);
        T.f40737a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.Y.C(this, c5299y);
        setOnDragListener(dragAndDropModifierOnDragListener);
        h11.o(this);
        if (i11 >= 29) {
            K.f40668a.a(this);
        }
        this.f40535T0 = i11 >= 31 ? new H1.o() : null;
        this.f40536U0 = new q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7460f C0() {
        if (isFocused()) {
            return this.f40541e.getFocusRect();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return j1.h.a(findFocus);
        }
        return null;
    }

    private final void H0() {
        if (this.f40529Q) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f40527P) {
            this.f40527P = currentAnimationTimeMillis;
            InterfaceC5294w0 interfaceC5294w0 = this.f40532R0;
            float[] fArr = this.f40523N;
            interfaceC5294w0.a(this, fArr);
            C5248g1.a(fArr, this.f40525O);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f40519L;
            view.getLocationOnScreen(iArr);
            float f7 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f40531R = P9.a.a(f7 - iArr[0], f11 - iArr[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b J(AndroidComposeView androidComposeView) {
        return (b) androidComposeView.f40555r0.getValue();
    }

    public static final boolean L(AndroidComposeView androidComposeView, int i11) {
        androidComposeView.getClass();
        if (j1.c.b(i11, 7) || j1.c.b(i11, 8)) {
            return false;
        }
        Integer c11 = j1.h.c(i11);
        if (c11 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int intValue = c11.intValue();
        C7460f C02 = androidComposeView.C0();
        Rect b11 = C02 != null ? l1.x0.b(C02) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = b11 == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), intValue) : focusFinder.findNextFocusFromRect(androidComposeView, b11, intValue);
        if (findNextFocus != null) {
            return j1.h.b(findNextFocus, Integer.valueOf(intValue), b11);
        }
        return false;
    }

    public static final boolean M(AndroidComposeView androidComposeView, j1.c cVar, C7460f c7460f) {
        Integer c11;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((cVar == null || (c11 = j1.h.c(cVar.d())) == null) ? 130 : c11.intValue(), c7460f != null ? l1.x0.b(c7460f) : null);
    }

    private final void O0(D1.H h11) {
        D1.H g02;
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (h11 != null) {
            while (h11 != null && h11.Y() == H.f.InMeasureBlock && (this.f40511H || ((g02 = h11.g0()) != null && !g02.H()))) {
                h11 = h11.g0();
            }
            if (h11 == this.f40548l) {
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

    public static final void Q(AndroidComposeView androidComposeView, Z1.s sVar) {
        androidComposeView.f40506E0.setValue(sVar);
    }

    private final int Q0(MotionEvent motionEvent) {
        Object obj;
        if (this.f40534S0) {
            this.f40534S0 = false;
            int metaState = motionEvent.getMetaState();
            this.f40544h.getClass();
            j2.b(metaState);
        }
        C10634i c10634i = this.f40564w;
        x1.z a11 = c10634i.a(motionEvent, this);
        x1.B b11 = this.f40566x;
        if (a11 == null) {
            b11.c();
            return 0;
        }
        ArrayList arrayList = (ArrayList) a11.b();
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                obj = arrayList.get(size);
                if (((C10625A) obj).b()) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        obj = null;
        C10625A c10625a = (C10625A) obj;
        if (c10625a != null) {
            this.f40537a = c10625a.f();
        }
        int b12 = b11.b(a11, this, t0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (b12 & 1) != 0) {
            return b12;
        }
        c10634i.b(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return b12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(MotionEvent motionEvent, int i11, long j11, boolean z11) {
        int actionMasked = motionEvent.getActionMasked();
        int i12 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (i11 != 9 && i11 != 10) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i12 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        int i15 = 0;
        while (i15 < pointerCount) {
            int i16 = ((i12 < 0 || i15 < i12) ? 0 : 1) + i15;
            motionEvent.getPointerProperties(i16, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i16, pointerCoords);
            long w02 = w0(P9.a.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C7459e.g(w02);
            pointerCoords.y = C7459e.h(w02);
            i15++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j11 : motionEvent.getDownTime(), j11, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z11 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        x1.z a11 = this.f40564w.a(obtain, this);
        Intrinsics.f(a11);
        this.f40566x.b(a11, this, true);
        obtain.recycle();
    }

    private final void V0() {
        int[] iArr = this.f40519L;
        getLocationOnScreen(iArr);
        long j11 = this.f40517K;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        boolean z11 = false;
        int i13 = iArr[0];
        if (i11 != i13 || i12 != iArr[1]) {
            this.f40517K = Z1.n.a(i13, iArr[1]);
            if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
                this.f40548l.N().I().B1();
                z11 = true;
            }
        }
        this.f40513I.b(z11);
    }

    private static void Y(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).B0();
            } else if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt);
            }
        }
    }

    private static long Z(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            C.Companion companion = Sc.C.INSTANCE;
            return (0 << 32) | size;
        }
        if (mode == 0) {
            C.Companion companion2 = Sc.C.INSTANCE;
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j11 = size;
        C.Companion companion3 = Sc.C.INSTANCE;
        return (j11 << 32) | j11;
    }

    public static void a(AndroidComposeView androidComposeView, boolean z11) {
        androidComposeView.f40510G0.b(z11 ? 1 : 2);
    }

    private static View b0(int i11, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.d(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i11))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View b02 = b0(i11, viewGroup.getChildAt(i12));
            if (b02 != null) {
                return b02;
            }
        }
        return null;
    }

    public static void c(AndroidComposeView androidComposeView) {
        androidComposeView.f40528P0 = false;
        MotionEvent motionEvent = androidComposeView.f40516J0;
        Intrinsics.f(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.Q0(motionEvent);
    }

    public static void d(AndroidComposeView androidComposeView) {
        androidComposeView.V0();
    }

    public static void e(AndroidComposeView androidComposeView) {
        androidComposeView.V0();
    }

    public static final void f(AndroidComposeView androidComposeView, int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int c11;
        C5299y c5299y = androidComposeView.f40550n;
        if (Intrinsics.d(str, c5299y.I())) {
            int c12 = c5299y.K().c(i11);
            if (c12 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c12);
                return;
            }
            return;
        }
        if (!Intrinsics.d(str, c5299y.H()) || (c11 = c5299y.J().c(i11)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, c11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:5:0x004a, B:7:0x0053, B:25:0x00d6, B:27:0x00de, B:28:0x00e1, B:30:0x00e5, B:32:0x00eb, B:34:0x00ef, B:35:0x00f5, B:38:0x00fd, B:41:0x0105, B:42:0x0109, B:44:0x010f, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:51:0x0125, B:52:0x0129, B:57:0x013c, B:59:0x0140, B:60:0x0147, B:66:0x0157, B:67:0x015a, B:73:0x015d), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0080 A[Catch: all -> 0x00ac, TryCatch #1 {all -> 0x00ac, blocks: (B:87:0x0066, B:89:0x0070, B:94:0x0080, B:97:0x00b0, B:13:0x00b3, B:21:0x00c6, B:23:0x00cc, B:98:0x0088, B:104:0x0094, B:107:0x009c), top: B:86:0x0066 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int p0(MotionEvent motionEvent) {
        boolean z11;
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z12;
        MotionEvent motionEvent4;
        AndroidComposeView androidComposeView2 = this;
        float[] fArr = androidComposeView2.f40523N;
        androidComposeView2.removeCallbacks(androidComposeView2.f40524N0);
        try {
            androidComposeView2.f40527P = AnimationUtils.currentAnimationTimeMillis();
            androidComposeView2.f40532R0.a(androidComposeView2, fArr);
            C5248g1.a(fArr, androidComposeView2.f40525O);
            long c11 = C7837o0.c(P9.a.a(motionEvent.getX(), motionEvent.getY()), fArr);
            androidComposeView2.f40531R = P9.a.a(motionEvent.getRawX() - C7459e.g(c11), motionEvent.getRawY() - C7459e.h(c11));
            boolean z13 = true;
            androidComposeView2.f40529Q = true;
            androidComposeView2.x0(false);
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent5 = androidComposeView2.f40516J0;
                boolean z14 = motionEvent5 != null && motionEvent5.getToolType(0) == 3;
                x1.B b11 = androidComposeView2.f40566x;
                if (motionEvent5 != null) {
                    try {
                        if (motionEvent5.getSource() == motionEvent.getSource() && motionEvent5.getToolType(0) == motionEvent.getToolType(0)) {
                            z11 = false;
                            if (z11) {
                                if (motionEvent5.getButtonState() != 0 || (actionMasked = motionEvent5.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent5;
                                    b11.c();
                                } else if (motionEvent5.getActionMasked() != 10 && z14) {
                                    androidComposeView2.R0(motionEvent5, 10, motionEvent5.getEventTime(), true);
                                    motionEvent2 = motionEvent5;
                                }
                                boolean z15 = motionEvent.getToolType(0) != 3;
                                if (z14 && z15 && actionMasked2 != 3 && actionMasked2 != 9 && t0(motionEvent)) {
                                    androidComposeView = this;
                                    androidComposeView.R0(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    androidComposeView = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = androidComposeView2.f40516J0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent6 = androidComposeView2.f40516J0;
                                    pointerId = motionEvent6 == null ? motionEvent6.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    C10634i c10634i = androidComposeView2.f40564w;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent7 = androidComposeView2.f40516J0;
                                            float x11 = motionEvent7 == null ? motionEvent7.getX() : Float.NaN;
                                            MotionEvent motionEvent8 = androidComposeView2.f40516J0;
                                            z12 = x11 == motionEvent.getX() || (motionEvent8 != null ? motionEvent8.getY() : Float.NaN) != motionEvent.getY();
                                            motionEvent4 = androidComposeView2.f40516J0;
                                            if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                                                z13 = false;
                                            }
                                            if (!z12 || z13) {
                                                if (pointerId >= 0) {
                                                    c10634i.b(pointerId);
                                                }
                                                b11.a();
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        c10634i.b(pointerId);
                                    }
                                }
                                androidComposeView2.f40516J0 = MotionEvent.obtainNoHistory(motionEvent);
                                return Q0(motionEvent);
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    } catch (Throwable th2) {
                        androidComposeView2 = this;
                        throw th2;
                    }
                }
                motionEvent2 = motionEvent5;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z14) {
                }
                androidComposeView = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = androidComposeView2.f40516J0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent62 = androidComposeView2.f40516J0;
                    if (motionEvent62 == null) {
                    }
                    action = motionEvent.getAction();
                    C10634i c10634i2 = androidComposeView2.f40564w;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent72 = androidComposeView2.f40516J0;
                        if (motionEvent72 == null) {
                        }
                        MotionEvent motionEvent82 = androidComposeView2.f40516J0;
                        if (motionEvent82 != null) {
                        }
                        if (x11 == motionEvent.getX()) {
                        }
                        motionEvent4 = androidComposeView2.f40516J0;
                        if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                        }
                        if (!z12) {
                        }
                        if (pointerId >= 0) {
                        }
                        b11.a();
                    }
                }
                androidComposeView2.f40516J0 = MotionEvent.obtainNoHistory(motionEvent);
                return Q0(motionEvent);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            androidComposeView2.f40529Q = false;
        }
    }

    private static void q0(D1.H h11) {
        h11.t0();
        U0.b<D1.H> o02 = h11.o0();
        int m11 = o02.m();
        if (m11 > 0) {
            D1.H[] l11 = o02.l();
            int i11 = 0;
            do {
                q0(l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    private final void r0(D1.H h11) {
        int i11 = 0;
        this.f40513I.y(h11, false);
        U0.b<D1.H> o02 = h11.o0();
        int m11 = o02.m();
        if (m11 > 0) {
            D1.H[] l11 = o02.l();
            do {
                r0(l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean s0(MotionEvent motionEvent) {
        boolean z11;
        float x11 = motionEvent.getX();
        if (!Float.isInfinite(x11) && !Float.isNaN(x11)) {
            float y11 = motionEvent.getY();
            if (!Float.isInfinite(y11) && !Float.isNaN(y11)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z11 = false;
                        if (!z11) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i11 = 1; i11 < pointerCount; i11++) {
                                float x12 = motionEvent.getX(i11);
                                if (!Float.isInfinite(x12) && !Float.isNaN(x12)) {
                                    float y12 = motionEvent.getY(i11);
                                    if (!Float.isInfinite(y12) && !Float.isNaN(y12) && (Build.VERSION.SDK_INT < 29 || C5260k1.f40905a.a(motionEvent, i11))) {
                                        z11 = false;
                                        if (!z11) {
                                            break;
                                        }
                                    }
                                }
                                z11 = true;
                                if (!z11) {
                                }
                            }
                        }
                        return z11;
                    }
                }
            }
        }
        z11 = true;
        if (!z11) {
        }
        return z11;
    }

    private final boolean t0(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        return 0.0f <= x11 && x11 <= ((float) getWidth()) && 0.0f <= y11 && y11 <= ((float) getHeight());
    }

    private final boolean u0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f40516J0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: A, reason: from getter */
    public final j2 getF40544h() {
        return this.f40544h;
    }

    public final void A0(@NotNull D1.H h11) {
        this.f40513I.p(h11);
        this.f40497A = true;
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: B, reason: from getter */
    public final C9725c getF40508F0() {
        return this.f40508F0;
    }

    public final void B0() {
        if (this.f40497A) {
            this.f40501C.b();
            this.f40497A = false;
        }
        C5288u0 c5288u0 = this.f40505E;
        if (c5288u0 != null) {
            Y(c5288u0);
        }
        while (true) {
            U0.b<Function0<Unit>> bVar = this.f40522M0;
            if (!bVar.p()) {
                return;
            }
            int m11 = bVar.m();
            for (int i11 = 0; i11 < m11; i11++) {
                Function0<Unit> function0 = bVar.l()[i11];
                bVar.x(i11, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            bVar.v(0, m11);
        }
    }

    public final void D0(@NotNull D1.H h11) {
        this.f40550n.U(h11);
        this.f40551o.j(h11);
    }

    public final void E0(@NotNull D1.H h11, boolean z11, boolean z12, boolean z13) {
        D1.Z z14 = this.f40513I;
        if (z11) {
            if (z14.v(h11, z12) && z13) {
                O0(h11);
                return;
            }
            return;
        }
        if (z14.y(h11, z12) && z13) {
            O0(h11);
        }
    }

    public final void F0(@NotNull D1.H h11, boolean z11, boolean z12) {
        D1.Z z13 = this.f40513I;
        if (z11) {
            if (z13.u(h11, z12)) {
                O0(null);
            }
        } else if (z13.x(h11, z12)) {
            O0(null);
        }
    }

    public final void G0() {
        this.f40550n.V();
        this.f40551o.k();
    }

    public final void I0(@NotNull D1.w0 w0Var) {
        if (this.f40507F != null) {
            int i11 = d2.f40846u;
        }
        this.f40520L0.b(w0Var);
    }

    public final void J0(@NotNull Function0<Unit> function0) {
        U0.b<Function0<Unit>> bVar = this.f40522M0;
        if (bVar.i(function0)) {
            return;
        }
        bVar.b(function0);
    }

    public final void K0(@NotNull C2793c.b bVar) {
        this.f40513I.q(bVar);
        O0(null);
    }

    public final void L0(@NotNull C5728b c5728b) {
        J0(new r(c5728b));
    }

    public final void M0() {
        this.f40497A = true;
    }

    public final void N0(@NotNull D1.H h11) {
        this.f40513I.w(h11);
        O0(null);
    }

    public final long P0(long j11) {
        H0();
        float g10 = C7459e.g(j11) - C7459e.g(this.f40531R);
        float h11 = C7459e.h(j11) - C7459e.h(this.f40531R);
        return C7837o0.c(P9.a.a(g10, h11), this.f40525O);
    }

    public final void S0(@NotNull Function1<? super Configuration, Unit> function1) {
        this.f40568y = function1;
    }

    public final void T(@NotNull C5728b c5728b, @NotNull D1.H h11) {
        d0().a().put(c5728b, h11);
        d0().addView(c5728b);
        d0().b().put(h11, c5728b);
        c5728b.setImportantForAccessibility(1);
        androidx.core.view.Y.C(c5728b, new d(h11, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void T0(@NotNull CoroutineContext coroutineContext) {
        this.f40542f = coroutineContext;
        InterfaceC2807j h11 = this.f40548l.c0().h();
        if (h11 instanceof x1.N) {
            ((x1.N) h11).v0();
        }
        if (!h11.getNode().isAttached()) {
            A1.a.b("visitSubtree called on an unattached node");
            throw null;
        }
        e.c child$ui_release = h11.getNode().getChild$ui_release();
        D1.H f7 = C2809k.f(h11);
        C2802g0 c2802g0 = new C2802g0();
        while (f7 != null) {
            if (child$ui_release == null) {
                child$ui_release = f7.c0().h();
            }
            if ((child$ui_release.getAggregateChildKindSet$ui_release() & 16) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                        AbstractC2813m abstractC2813m = child$ui_release;
                        ?? r52 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof D1.C0) {
                                D1.C0 c02 = (D1.C0) abstractC2813m;
                                if (c02 instanceof x1.N) {
                                    ((x1.N) c02).v0();
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r52 = r52;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 16) != 0) {
                                        i11++;
                                        r52 = r52;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r52.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r52.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r52 = r52;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r52);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            c2802g0.c(f7.o0());
            f7 = c2802g0.a() ? (D1.H) c2802g0.b() : null;
            child$ui_release = null;
        }
    }

    public final Object U(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object y11 = this.f40550n.y((kotlin.coroutines.jvm.internal.c) dVar);
        return y11 == Wc.a.COROUTINE_SUSPENDED ? y11 : Unit.f71690a;
    }

    public final void U0(@NotNull Function1<? super b, Unit> function1) {
        b n02 = n0();
        if (n02 != null) {
            ((w2) function1).invoke(n02);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f40559t0 = function1;
    }

    public final Object V(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = this.f40551o.b((kotlin.coroutines.jvm.internal.c) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    public final long W(long j11) {
        H0();
        return C7837o0.c(j11, this.f40525O);
    }

    public final long X(long j11) {
        H0();
        return C7837o0.c(j11, this.f40523N);
    }

    @NotNull
    public final D1.w0 a0(@NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0, o1.d dVar) {
        boolean z11;
        if (dVar != null) {
            return new X0(dVar, null, this, function2, function0);
        }
        D1.w0 a11 = this.f40520L0.a();
        if (a11 != null) {
            a11.b(function2, function0);
            return a11;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            InterfaceC7823h0 interfaceC7823h0 = this.f40553q;
            return new X0(interfaceC7823h0.a(), interfaceC7823h0, this, function2, function0);
        }
        if (isHardwareAccelerated() && this.f40533S) {
            try {
                return new H1(this, function2, function0);
            } catch (Throwable unused) {
                this.f40533S = false;
            }
        }
        if (this.f40507F == null) {
            if (!d2.f40844s) {
                d2.c.a(new View(getContext()));
            }
            z11 = d2.f40845t;
            U0 u02 = z11 ? new U0(getContext()) : new e2(getContext());
            this.f40507F = u02;
            addView(u02, -1);
        }
        U0 u03 = this.f40507F;
        Intrinsics.f(u03);
        return new d2(this, u03, function2, function0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(@NotNull SparseArray<AutofillValue> sparseArray) {
        C6397a c6397a = this.f40570z;
        if (c6397a != null) {
            C6398b.a(c6397a, sparseArray);
        }
    }

    @Override // D1.x0
    @NotNull
    public final c2 b() {
        return this.f40515J;
    }

    public final void c0(@NotNull D1.H h11, boolean z11) {
        this.f40513I.g(h11, z11);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return this.f40550n.z(this.f40537a, i11, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i11) {
        return this.f40550n.z(this.f40537a, i11, true);
    }

    @NotNull
    public final C5288u0 d0() {
        if (this.f40505E == null) {
            C5288u0 c5288u0 = new C5288u0(getContext());
            this.f40505E = c5288u0;
            addView(c5288u0, -1);
            requestLayout();
        }
        C5288u0 c5288u02 = this.f40505E;
        Intrinsics.f(c5288u02);
        return c5288u02;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        AtomicReference atomicReference;
        boolean z11;
        boolean z12;
        if (!isAttachedToWindow()) {
            q0(this.f40548l);
        }
        x0(true);
        synchronized (C5721l.D()) {
            atomicReference = C5721l.f56259j;
            androidx.collection.M<InterfaceC5704H> D11 = ((C5710a) atomicReference.get()).D();
            if (D11 != null) {
                z11 = D11.c();
            }
        }
        if (z11) {
            C5721l.b();
        }
        this.f40560u = true;
        C7803V c7803v = this.f40547k;
        Canvas v11 = c7803v.a().v();
        c7803v.a().w(canvas);
        this.f40548l.u(c7803v.a(), null);
        c7803v.a().w(v11);
        if (!this.f40556s.isEmpty()) {
            int size = this.f40556s.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((D1.w0) this.f40556s.get(i11)).l();
            }
        }
        z12 = d2.f40845t;
        if (z12) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f40556s.clear();
        this.f40560u = false;
        ArrayList arrayList = this.f40558t;
        if (arrayList != null) {
            this.f40556s.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(@NotNull MotionEvent motionEvent) {
        if (this.f40528P0) {
            RunnableC5273p runnableC5273p = this.f40526O0;
            removeCallbacks(runnableC5273p);
            if (motionEvent.getActionMasked() == 8) {
                this.f40528P0 = false;
            } else {
                runnableC5273p.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (s0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (p0(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f7 = -motionEvent.getAxisValue(26);
        getContext();
        float b11 = C5306a0.b(viewConfiguration) * f7;
        getContext();
        return this.f40541e.k(new C10972b(b11, C5306a0.a(viewConfiguration) * f7, motionEvent.getDeviceId(), motionEvent.getEventTime()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (u0(r6) == false) goto L33;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(@NotNull MotionEvent motionEvent) {
        boolean z11 = this.f40528P0;
        RunnableC5273p runnableC5273p = this.f40526O0;
        if (z11) {
            removeCallbacks(runnableC5273p);
            runnableC5273p.run();
        }
        if (!s0(motionEvent) && isAttachedToWindow()) {
            this.f40550n.C(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && t0(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f40516J0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f40516J0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f40528P0 = true;
                        postDelayed(runnableC5273p, 8L);
                        return false;
                    }
                }
                if ((p0(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean j11;
        boolean isFocused = isFocused();
        FocusOwnerImpl focusOwnerImpl = this.f40541e;
        if (!isFocused) {
            return focusOwnerImpl.j(keyEvent, new g(keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f40544h.getClass();
        j2.b(metaState);
        j11 = focusOwnerImpl.j(keyEvent, j1.k.f68723b);
        return j11 || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(@NotNull KeyEvent keyEvent) {
        return (isFocused() && this.f40541e.i(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(@NotNull ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            I.f40663a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        if (this.f40528P0) {
            RunnableC5273p runnableC5273p = this.f40526O0;
            removeCallbacks(runnableC5273p);
            MotionEvent motionEvent2 = this.f40516J0;
            Intrinsics.f(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f40528P0 = false;
            } else {
                runnableC5273p.run();
            }
        }
        if (!s0(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u0(motionEvent))) {
            int p02 = p0(motionEvent);
            if ((p02 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((p02 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: e0, reason: from getter */
    public final C5255j getF40499B() {
        return this.f40499B;
    }

    @NotNull
    /* renamed from: f0, reason: from getter */
    public final ViewOnAttachStateChangeListenerC6609a getF40551o() {
        return this.f40551o;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return b0(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i11) {
        if (view != null) {
            C7460f a11 = j1.h.a(view);
            j1.c d11 = j1.h.d(i11);
            if (Intrinsics.d(this.f40541e.l(d11 != null ? d11.d() : 6, a11, o.f40582b), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i11);
    }

    @Override // D1.x0
    @NotNull
    public final Z1.d g() {
        return (Z1.d) this.f40540d.getValue();
    }

    @NotNull
    /* renamed from: g0, reason: from getter */
    public final CoroutineContext getF40542f() {
        return this.f40542f;
    }

    @Override // android.view.View
    public final void getFocusedRect(@NotNull Rect rect) {
        Unit unit;
        C7460f C02 = C0();
        if (C02 != null) {
            rect.left = Math.round(C02.n());
            rect.top = Math.round(C02.q());
            rect.right = Math.round(C02.o());
            rect.bottom = Math.round(C02.h());
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, D1.x0
    @NotNull
    public final Z1.s getLayoutDirection() {
        return (Z1.s) this.f40506E0.getValue();
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: getRoot, reason: from getter */
    public final D1.H getF40548l() {
        return this.f40548l;
    }

    @Override // D1.x0
    /* renamed from: h, reason: from getter */
    public final C5252i getF40552p() {
        return this.f40552p;
    }

    @NotNull
    /* renamed from: h0, reason: from getter */
    public final InterfaceC6770c getF40543g() {
        return this.f40543g;
    }

    @Override // D1.x0
    /* renamed from: i, reason: from getter */
    public final C6397a getF40570z() {
        return this.f40570z;
    }

    @NotNull
    /* renamed from: i0, reason: from getter */
    public final C1.g getF40512H0() {
        return this.f40512H0;
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: j, reason: from getter */
    public final u1.c getF40510G0() {
        return this.f40510G0;
    }

    public final boolean j0() {
        H1.o oVar;
        if (Build.VERSION.SDK_INT < 31 || (oVar = this.f40535T0) == null) {
            return false;
        }
        return oVar.a();
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: k, reason: from getter */
    public final D1.z0 getF40501C() {
        return this.f40501C;
    }

    @NotNull
    /* renamed from: k0, reason: from getter */
    public final I1.t getF40549m() {
        return this.f40549m;
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: l, reason: from getter */
    public final C5268n0 getF40514I0() {
        return this.f40514I0;
    }

    @NotNull
    /* renamed from: l0, reason: from getter */
    public final D1.J getF40539c() {
        return this.f40539c;
    }

    /* renamed from: m0, reason: from getter */
    public final boolean getF40503D() {
        return this.f40503D;
    }

    @Override // D1.x0
    @NotNull
    public final P1 n() {
        return this.f40498A0;
    }

    public final b n0() {
        return (b) this.f40557s0.getValue();
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: o, reason: from getter */
    public final f1.g getF40554r() {
        return this.f40554r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        androidx.lifecycle.J a11;
        AbstractC5434v lifecycle;
        androidx.lifecycle.J a12;
        super.onAttachedToWindow();
        this.f40544h.c(hasWindowFocus());
        D1.H h11 = this.f40548l;
        r0(h11);
        q0(h11);
        this.f40501C.h();
        C6397a c6397a = this.f40570z;
        if (c6397a != null) {
            f1.e.f62432a.a(c6397a);
        }
        androidx.lifecycle.J a13 = androidx.lifecycle.C0.a(this);
        M4.e a14 = M4.f.a(this);
        b n02 = n0();
        if (n02 == null || (a13 != null && a14 != null && (a13 != n02.a() || a14 != n02.a()))) {
            if (a13 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a14 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (n02 != null && (a11 = n02.a()) != null && (lifecycle = a11.getLifecycle()) != null) {
                lifecycle.e(this);
            }
            a13.getLifecycle().a(this);
            b bVar = new b(a13, a14);
            this.f40555r0.setValue(bVar);
            Function1<? super b, Unit> function1 = this.f40559t0;
            if (function1 != null) {
                ((w2) function1).invoke(bVar);
            }
            this.f40559t0 = null;
        }
        this.f40510G0.b(isInTouchMode() ? 1 : 2);
        b n03 = n0();
        AbstractC5434v lifecycle2 = (n03 == null || (a12 = n03.a()) == null) ? null : a12.getLifecycle();
        if (lifecycle2 == null) {
            A1.a.c("No lifecycle owner exists");
            throw null;
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f40551o);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f40561u0);
        getViewTreeObserver().addOnScrollChangedListener(this.f40563v0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f40565w0);
        if (Build.VERSION.SDK_INT >= 31) {
            Q.f40729a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C5262l0 c5262l0 = (C5262l0) e1.h.a(this.f40571z0);
        return c5262l0 == null ? this.f40567x0.q() : c5262l0.e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f40540d.setValue(Z1.a.a(getContext()));
        int i11 = Build.VERSION.SDK_INT;
        if ((i11 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f40504D0) {
            this.f40504D0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
            this.f40502C0.setValue(C3814v.a(getContext()));
        }
        this.f40568y.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(@NotNull EditorInfo editorInfo) {
        C5262l0 c5262l0 = (C5262l0) e1.h.a(this.f40571z0);
        return c5262l0 == null ? this.f40567x0.o(editorInfo) : c5262l0.d(editorInfo);
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(@NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        this.f40551o.h(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        androidx.lifecycle.J a11;
        super.onDetachedFromWindow();
        this.f40501C.i();
        b n02 = n0();
        AbstractC5434v lifecycle = (n02 == null || (a11 = n02.a()) == null) ? null : a11.getLifecycle();
        if (lifecycle == null) {
            A1.a.c("No lifecycle owner exists");
            throw null;
        }
        lifecycle.e(this.f40551o);
        lifecycle.e(this);
        C6397a c6397a = this.f40570z;
        if (c6397a != null) {
            f1.e.f62432a.b(c6397a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f40561u0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f40563v0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f40565w0);
        if (Build.VERSION.SDK_INT >= 31) {
            Q.f40729a.a(this);
        }
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (z11 || hasFocus()) {
            return;
        }
        this.f40541e.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f40513I.m(this.f40530Q0);
        this.f40509G = null;
        V0();
        if (this.f40505E != null) {
            d0().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        boolean isAttachedToWindow = isAttachedToWindow();
        D1.H h11 = this.f40548l;
        if (!isAttachedToWindow) {
            r0(h11);
        }
        long Z11 = Z(i11);
        C.Companion companion = Sc.C.INSTANCE;
        int i13 = (int) (Z11 >>> 32);
        int i14 = (int) (Z11 & 4294967295L);
        long Z12 = Z(i12);
        int i15 = (int) (Z12 & 4294967295L);
        int min = Math.min((int) (Z12 >>> 32), 262142);
        int min2 = i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i15, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        long a11 = Z1.c.a(Math.min(c11, i13), i14 != Integer.MAX_VALUE ? Math.min(c11, i14) : Integer.MAX_VALUE, min, min2);
        Z1.b bVar = this.f40509G;
        if (bVar == null) {
            this.f40509G = Z1.b.a(a11);
            this.f40511H = false;
        } else if (!Z1.b.e(bVar.p(), a11)) {
            this.f40511H = true;
        }
        D1.Z z11 = this.f40513I;
        z11.z(a11);
        z11.o();
        setMeasuredDimension(h11.l0(), h11.I());
        if (this.f40505E != null) {
            d0().measure(View.MeasureSpec.makeMeasureSpec(h11.l0(), 1073741824), View.MeasureSpec.makeMeasureSpec(h11.I(), 1073741824));
        }
        Unit unit = Unit.f71690a;
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i11) {
        C6397a c6397a;
        if (viewStructure == null || (c6397a = this.f40570z) == null) {
            return;
        }
        C6398b.b(c6397a, viewStructure);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull androidx.lifecycle.J j11) {
        this.f40503D = a.a();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        if (this.f40538b) {
            Z1.s sVar = i11 != 0 ? i11 != 1 ? null : Z1.s.Rtl : Z1.s.Ltr;
            if (sVar == null) {
                sVar = Z1.s.Ltr;
            }
            this.f40506E0.setValue(sVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(@NotNull Rect rect, @NotNull Point point, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        H1.o oVar;
        if (Build.VERSION.SDK_INT < 31 || (oVar = this.f40535T0) == null) {
            return;
        }
        oVar.b(this, this.f40549m, this.f40542f, consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(@NotNull LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a = this.f40551o;
        viewOnAttachStateChangeListenerC6609a.getClass();
        ViewOnAttachStateChangeListenerC6609a.n(viewOnAttachStateChangeListenerC6609a, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        boolean a11;
        this.f40544h.c(z11);
        this.f40534S0 = true;
        super.onWindowFocusChanged(z11);
        if (!z11 || this.f40503D == (a11 = a.a())) {
            return;
        }
        this.f40503D = a11;
        q0(this.f40548l);
    }

    @Override // D1.x0
    public final void p() {
        this.f40562v = true;
    }

    @Override // D1.x0
    @NotNull
    public final j1.l q() {
        return this.f40541e;
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: r, reason: from getter */
    public final q getF40536U0() {
        return this.f40536U0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (isFocused()) {
            return true;
        }
        FocusOwnerImpl focusOwnerImpl = this.f40541e;
        if (focusOwnerImpl.o().b()) {
            return super.requestFocus(i11, rect);
        }
        j1.c d11 = j1.h.d(i11);
        int d12 = d11 != null ? d11.d() : 7;
        Boolean l11 = focusOwnerImpl.l(d12, rect != null ? l1.x0.d(rect) : null, new s(d12));
        if (l11 != null) {
            return l11.booleanValue();
        }
        return false;
    }

    @Override // D1.x0
    public final void s(boolean z11) {
        this.f40503D = z11;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // D1.x0
    @NotNull
    public final m0.a t() {
        return B1.n0.b(this);
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: u, reason: from getter */
    public final InterfaceC7823h0 getF40553q() {
        return this.f40553q;
    }

    @Override // D1.x0
    @NotNull
    public final AbstractC3809p.a v() {
        return (AbstractC3809p.a) this.f40502C0.getValue();
    }

    public final void v0(@NotNull float[] fArr) {
        H0();
        C7837o0.h(fArr, this.f40523N);
        U.b(fArr, C7459e.g(this.f40531R), C7459e.h(this.f40531R), this.f40521M);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // D1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wc.a w(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5281s c5281s;
        int i11;
        if (cVar instanceof C5281s) {
            c5281s = (C5281s) cVar;
            int i12 = c5281s.f41013f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5281s.f41013f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5281s.f41011d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5281s.f41013f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomicReference atomicReference = this.f40571z0;
                    C5284t c5284t = new C5284t(this);
                    c5281s.f41013f = 1;
                    if (e1.h.b(atomicReference, c5284t, function2, c5281s) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        c5281s = new C5281s(this, cVar);
        Object obj2 = c5281s.f41011d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5281s.f41013f;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    public final long w0(long j11) {
        H0();
        long c11 = C7837o0.c(j11, this.f40523N);
        return P9.a.a(C7459e.g(this.f40531R) + C7459e.g(c11), C7459e.h(this.f40531R) + C7459e.h(c11));
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: x, reason: from getter */
    public final Q1.M getF40569y0() {
        return this.f40569y0;
    }

    public final void x0(boolean z11) {
        D1.Z z12 = this.f40513I;
        if (z12.i() || z12.j()) {
            if (z12.m(z11 ? this.f40530Q0 : null)) {
                requestLayout();
            }
            z12.b(false);
            if (this.f40562v) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f40562v = false;
            }
            Unit unit = Unit.f71690a;
        }
    }

    @Override // D1.x0
    @NotNull
    /* renamed from: y, reason: from getter */
    public final C5247g0 getF40500B0() {
        return this.f40500B0;
    }

    public final void y0(@NotNull D1.H h11, long j11) {
        D1.Z z11 = this.f40513I;
        z11.n(h11, j11);
        if (!z11.i()) {
            z11.b(false);
            if (this.f40562v) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f40562v = false;
            }
        }
        Unit unit = Unit.f71690a;
    }

    @Override // D1.x0
    public final C5255j z() {
        return this.f40499B;
    }

    public final void z0(@NotNull D1.w0 w0Var, boolean z11) {
        ArrayList arrayList = this.f40556s;
        if (!z11) {
            if (this.f40560u) {
                return;
            }
            arrayList.remove(w0Var);
            ArrayList arrayList2 = this.f40558t;
            if (arrayList2 != null) {
                arrayList2.remove(w0Var);
                return;
            }
            return;
        }
        if (!this.f40560u) {
            arrayList.add(w0Var);
            return;
        }
        ArrayList arrayList3 = this.f40558t;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f40558t = arrayList3;
        }
        arrayList3.add(w0Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        Intrinsics.f(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, int i12) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i11;
        generateDefaultLayoutParams.height = i12;
        Unit unit = Unit.f71690a;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
