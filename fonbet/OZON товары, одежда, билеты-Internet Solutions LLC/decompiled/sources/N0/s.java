package N0;

import Bl0.C2652m;
import J0.Y;
import S0.A1;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC5228a;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import d2.InterfaceC6040Q;
import java.util.UUID;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
final class s extends AbstractC5228a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    private Function0<Unit> f18325a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f18326b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WindowManager f18327c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final WindowManager.LayoutParams f18328d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Y f18329e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Z1.s f18330f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f18331g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3991w0 f18332h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final A1 f18333i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Rect f18334j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Rect f18335k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function2<C7459e, Z1.o, Boolean> f18336l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f18337m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18338n;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f18340c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f18340c | 1);
            s.this.Content(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18341a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18341a = iArr;
        }
    }

    public s(Function0 function0, @NotNull View view, @NotNull Z1.d dVar, @NotNull Y y11, @NotNull UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        this.f18325a = function0;
        this.f18326b = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f18327c = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f18328d = layoutParams;
        this.f18329e = y11;
        this.f18330f = Z1.s.Ltr;
        f7 = n1.f(null, D1.f25195a);
        this.f18331g = f7;
        f11 = n1.f(null, D1.f25195a);
        this.f18332h = f11;
        this.f18333i = n1.e(new t(this));
        this.f18334j = new Rect();
        this.f18335k = new Rect();
        this.f18336l = u.f18343b;
        setId(android.R.id.content);
        C0.b(this, C0.a(view));
        D0.b(this, D0.a(view));
        M4.f.b(this, M4.f.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.v1((float) 8));
        setOutlineProvider(new r());
        f12 = n1.f(N0.a.f18292a, D1.f25195a);
        this.f18337m = f12;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void Content(InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-864350873);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ((Function2) this.f18337m.getValue()).invoke(u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(i11));
        }
    }

    public final void a() {
        C0.b(this, null);
        this.f18326b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f18327c.removeViewImmediate(this);
    }

    public final boolean b() {
        return ((Boolean) this.f18333i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Z1.o c() {
        return (Z1.o) this.f18331g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Z1.q d() {
        return (Z1.q) this.f18332h.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.f18325a;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        setParentCompositionContext(abstractC3984t);
        this.f18337m.setValue(c4912a);
        this.f18338n = true;
    }

    public final void f(Z1.o oVar) {
        this.f18331g.setValue(oVar);
    }

    public final void g(@NotNull Z1.s sVar) {
        this.f18330f = sVar;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow */
    protected final boolean getF40614b() {
        return this.f18338n;
    }

    public final void h(Z1.q qVar) {
        this.f18332h.setValue(qVar);
    }

    public final void i(@NotNull InterfaceC6040Q interfaceC6040Q) {
        this.f18329e = (Y) interfaceC6040Q;
    }

    public final void j() {
        this.f18327c.addView(this, this.f18328d);
    }

    public final void k(Function0 function0, @NotNull Z1.s sVar) {
        this.f18325a = function0;
        int i11 = b.f18341a[sVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new Sc.o();
        }
        super.setLayoutDirection(i12);
    }

    public final void l() {
        Z1.q d11;
        Z1.o c11 = c();
        if (c11 == null || (d11 = d()) == null) {
            return;
        }
        long e11 = d11.e();
        View view = this.f18326b;
        Rect rect = this.f18334j;
        view.getWindowVisibleDisplayFrame(rect);
        Z1.o oVar = new Z1.o(rect.left, rect.top, rect.right, rect.bottom);
        long mo6calculatePositionllwVHH4 = this.f18329e.mo6calculatePositionllwVHH4(c11, Z1.r.a(oVar.i(), oVar.d()), this.f18330f, e11);
        WindowManager.LayoutParams layoutParams = this.f18328d;
        layoutParams.x = (int) (mo6calculatePositionllwVHH4 >> 32);
        layoutParams.y = (int) (mo6calculatePositionllwVHH4 & 4294967295L);
        this.f18327c.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f18326b;
        Rect rect = this.f18335k;
        view.getWindowVisibleDisplayFrame(rect);
        if (Intrinsics.d(rect, this.f18334j)) {
            return;
        }
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (((java.lang.Boolean) ((N0.u) r5.f18336l).invoke((r6.getRawX() == 0.0f || r6.getRawY() == 0.0f) ? null : k1.C7459e.a(P9.a.a(r6.getRawX(), r6.getRawY())), r0)).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            Z1.o c11 = c();
            if (c11 != null) {
            }
            Function0<Unit> function0 = this.f18325a;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i11) {
    }
}
