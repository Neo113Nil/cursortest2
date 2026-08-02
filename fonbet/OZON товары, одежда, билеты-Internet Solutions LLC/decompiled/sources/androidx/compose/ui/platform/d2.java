package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k1.C7458d;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7803V;
import l1.C7811b0;
import l1.C7837o0;
import l1.C7844u;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d2 extends View implements D1.w0 {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Function2<View, Matrix, Unit> f40840o = b.f40861b;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final a f40841p = new a();

    /* renamed from: q, reason: collision with root package name */
    private static Method f40842q;

    /* renamed from: r, reason: collision with root package name */
    private static Field f40843r;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f40844s;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f40845t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f40846u = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40847a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0 f40848b;

    /* renamed from: c, reason: collision with root package name */
    private Function2<? super InterfaceC7802U, ? super o1.d, Unit> f40849c;

    /* renamed from: d, reason: collision with root package name */
    private Function0<Unit> f40850d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C5266m1 f40851e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40852f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f40853g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40854h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40855i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C7803V f40856j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C5254i1<View> f40857k;

    /* renamed from: l, reason: collision with root package name */
    private long f40858l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f40859m;

    /* renamed from: n, reason: collision with root package name */
    private int f40860n;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline b11 = ((d2) view).f40851e.b();
            Intrinsics.f(b11);
            outline.set(b11);
        }
    }

    static final class b extends AbstractC7737t implements Function2<View, Matrix, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f40861b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return Unit.f71690a;
        }
    }

    public static final class c {
        @SuppressLint({"BanUncheckedReflection"})
        public static void a(@NotNull View view) {
            try {
                if (!d2.f40844s) {
                    d2.f40844s = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        d2.f40842q = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        d2.f40843r = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        d2.f40842q = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        d2.f40843r = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = d2.f40842q;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = d2.f40843r;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = d2.f40843r;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = d2.f40842q;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                d2.f40845t = true;
            }
        }
    }

    public d2(@NotNull AndroidComposeView androidComposeView, @NotNull U0 u02, @NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        super(androidComposeView.getContext());
        long j11;
        this.f40847a = androidComposeView;
        this.f40848b = u02;
        this.f40849c = function2;
        this.f40850d = function0;
        this.f40851e = new C5266m1();
        this.f40856j = new C7803V();
        this.f40857k = new C5254i1<>(f40840o);
        int i11 = l1.N0.f72233c;
        j11 = l1.N0.f72232b;
        this.f40858l = j11;
        this.f40859m = true;
        setWillNotDraw(false);
        u02.addView(this);
        View.generateViewId();
    }

    private final l1.s0 v() {
        if (!getClipToOutline()) {
            return null;
        }
        C5266m1 c5266m1 = this.f40851e;
        if (c5266m1.e()) {
            return null;
        }
        return c5266m1.d();
    }

    private final void x() {
        Rect rect;
        if (this.f40852f) {
            Rect rect2 = this.f40853g;
            if (rect2 == null) {
                this.f40853g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f40853g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void y(boolean z11) {
        if (z11 != this.f40854h) {
            this.f40854h = z11;
            this.f40847a.z0(this, z11);
        }
    }

    @Override // D1.w0
    public final void a() {
        y(false);
        AndroidComposeView androidComposeView = this.f40847a;
        androidComposeView.M0();
        this.f40849c = null;
        this.f40850d = null;
        androidComposeView.I0(this);
        this.f40848b.removeViewInLayout(this);
    }

    @Override // D1.w0
    public final void b(@NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        long j11;
        this.f40848b.addView(this);
        this.f40852f = false;
        this.f40855i = false;
        int i11 = l1.N0.f72233c;
        j11 = l1.N0.f72232b;
        this.f40858l = j11;
        this.f40849c = function2;
        this.f40850d = function0;
    }

    @Override // D1.w0
    public final void c(@NotNull C7458d c7458d, boolean z11) {
        C5254i1<View> c5254i1 = this.f40857k;
        if (!z11) {
            C7837o0.d(c5254i1.b(this), c7458d);
            return;
        }
        float[] a11 = c5254i1.a(this);
        if (a11 != null) {
            C7837o0.d(a11, c7458d);
        } else {
            c7458d.g();
        }
    }

    @Override // D1.w0
    public final void d(@NotNull float[] fArr) {
        C7837o0.h(fArr, this.f40857k.b(this));
    }

    @Override // android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        boolean z11;
        C7803V c7803v = this.f40856j;
        Canvas v11 = c7803v.a().v();
        c7803v.a().w(canvas);
        C7844u a11 = c7803v.a();
        if (v() == null && canvas.isHardwareAccelerated()) {
            z11 = false;
        } else {
            a11.save();
            this.f40851e.a(a11);
            z11 = true;
        }
        Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2 = this.f40849c;
        if (function2 != null) {
            function2.invoke(a11, null);
        }
        if (z11) {
            a11.p();
        }
        c7803v.a().w(v11);
        y(false);
    }

    @Override // D1.w0
    public final long e(long j11, boolean z11) {
        C5254i1<View> c5254i1 = this.f40857k;
        if (!z11) {
            return C7837o0.c(j11, c5254i1.b(this));
        }
        float[] a11 = c5254i1.a(this);
        if (a11 != null) {
            return C7837o0.c(j11, a11);
        }
        return 9187343241974906880L;
    }

    @Override // D1.w0
    public final void f(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (i11 == getWidth() && i12 == getHeight()) {
            return;
        }
        setPivotX(l1.N0.d(this.f40858l) * i11);
        setPivotY(l1.N0.e(this.f40858l) * i12);
        setOutlineProvider(this.f40851e.b() != null ? f40841p : null);
        layout(getLeft(), getTop(), getLeft() + i11, getTop() + i12);
        x();
        this.f40857k.c();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // D1.w0
    public final boolean g(long j11) {
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        if (this.f40852f) {
            return 0.0f <= g10 && g10 < ((float) getWidth()) && 0.0f <= h11 && h11 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f40851e.f(j11);
        }
        return true;
    }

    @Override // D1.w0
    public final void h(@NotNull l1.E0 e02) {
        Function0<Unit> function0;
        int y11 = e02.y() | this.f40860n;
        if ((y11 & 4096) != 0) {
            long P11 = e02.P();
            this.f40858l = P11;
            setPivotX(l1.N0.d(P11) * getWidth());
            setPivotY(l1.N0.e(this.f40858l) * getHeight());
        }
        if ((y11 & 1) != 0) {
            setScaleX(e02.K());
        }
        if ((y11 & 2) != 0) {
            setScaleY(e02.L());
        }
        if ((y11 & 4) != 0) {
            setAlpha(e02.getAlpha());
        }
        if ((y11 & 8) != 0) {
            setTranslationX(e02.S());
        }
        if ((y11 & 16) != 0) {
            setTranslationY(e02.T());
        }
        if ((y11 & 32) != 0) {
            setElevation(e02.M());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            setRotation(e02.I());
        }
        if ((y11 & 256) != 0) {
            setRotationX(e02.E());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            setRotationY(e02.G());
        }
        if ((y11 & 2048) != 0) {
            setCameraDistance(e02.s() * getResources().getDisplayMetrics().densityDpi);
        }
        boolean z11 = true;
        boolean z12 = v() != null;
        boolean z13 = e02.t() && e02.N() != l1.y0.a();
        if ((y11 & 24576) != 0) {
            this.f40852f = e02.t() && e02.N() == l1.y0.a();
            x();
            setClipToOutline(z13);
        }
        boolean g10 = this.f40851e.g(e02.A(), e02.getAlpha(), z13, e02.M(), e02.i());
        C5266m1 c5266m1 = this.f40851e;
        if (c5266m1.c()) {
            setOutlineProvider(c5266m1.b() != null ? f40841p : null);
        }
        boolean z14 = v() != null;
        if (z12 != z14 || (z14 && g10)) {
            invalidate();
        }
        if (!this.f40855i && getElevation() > 0.0f && (function0 = this.f40850d) != null) {
            function0.invoke();
        }
        if ((y11 & 7963) != 0) {
            this.f40857k.c();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = y11 & 64;
            f2 f2Var = f2.f40875a;
            if (i12 != 0) {
                f2Var.a(this, C7811b0.i(e02.m()));
            }
            if ((y11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                f2Var.b(this, C7811b0.i(e02.O()));
            }
        }
        if (i11 >= 31 && (131072 & y11) != 0) {
            g2.f40878a.a(this, e02.D());
        }
        if ((y11 & 32768) != 0) {
            int u11 = e02.u();
            if (u11 == 1) {
                setLayerType(2, null);
            } else if (u11 == 2) {
                setLayerType(0, null);
                z11 = false;
            } else {
                setLayerType(0, null);
            }
            this.f40859m = z11;
        }
        this.f40860n = e02.y();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f40859m;
    }

    @Override // D1.w0
    public final void i(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        boolean z11 = getElevation() > 0.0f;
        this.f40855i = z11;
        if (z11) {
            interfaceC7802U.q();
        }
        this.f40848b.a(interfaceC7802U, this, getDrawingTime());
        if (this.f40855i) {
            interfaceC7802U.i();
        }
    }

    @Override // android.view.View, D1.w0
    public final void invalidate() {
        if (this.f40854h) {
            return;
        }
        y(true);
        super.invalidate();
        this.f40847a.invalidate();
    }

    @Override // D1.w0
    public final void j(@NotNull float[] fArr) {
        float[] a11 = this.f40857k.a(this);
        if (a11 != null) {
            C7837o0.h(fArr, a11);
        }
    }

    @Override // D1.w0
    public final void k(long j11) {
        int i11 = (int) (j11 >> 32);
        int left = getLeft();
        C5254i1<View> c5254i1 = this.f40857k;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            c5254i1.c();
        }
        int i12 = (int) (j11 & 4294967295L);
        if (i12 != getTop()) {
            offsetTopAndBottom(i12 - getTop());
            c5254i1.c();
        }
    }

    @Override // D1.w0
    public final void l() {
        if (!this.f40854h || f40845t) {
            return;
        }
        c.a(this);
        y(false);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    public final boolean w() {
        return this.f40854h;
    }
}
