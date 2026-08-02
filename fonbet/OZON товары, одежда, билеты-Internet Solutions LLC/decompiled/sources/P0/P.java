package P0;

import P0.K0;
import S0.AbstractC3984t;
import a1.C4912a;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.C5334o0;
import d2.EnumC6042T;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class P extends androidx.activity.s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f20747a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C0 f20748b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f20749c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final O f20750d;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends AbstractC7737t implements Function1<androidx.activity.C, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.activity.C c11) {
            P p11 = P.this;
            if (p11.f20748b.b()) {
                p11.f20747a.invoke();
            }
            return Unit.f71690a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20752a;

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
            f20752a = iArr;
        }
    }

    public P(@NotNull Function0<Unit> function0, @NotNull C0 c02, @NotNull View view, @NotNull Z1.s sVar, @NotNull Z1.d dVar, @NotNull UUID uuid, @NotNull C7980b<Float, C8008p> c7980b, @NotNull xe.M m11, boolean z11) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.f20747a = function0;
        this.f20748b = c02;
        this.f20749c = view;
        float f7 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C5334o0.a(window, false);
        O o11 = new O(getContext(), window, this.f20748b.b(), this.f20747a, c7980b, m11);
        o11.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        o11.setClipChildren(false);
        o11.setElevation(dVar.v1(f7));
        o11.setOutlineProvider(new a());
        this.f20750d = o11;
        setContentView(o11);
        androidx.lifecycle.C0.b(o11, androidx.lifecycle.C0.a(view));
        androidx.lifecycle.D0.b(o11, androidx.lifecycle.D0.a(view));
        M4.f.b(o11, M4.f.a(view));
        f(this.f20747a, this.f20748b, sVar);
        androidx.core.view.Q0 q02 = new androidx.core.view.Q0(window.getDecorView(), window);
        boolean z12 = !z11;
        q02.e(z12);
        q02.d(z12);
        androidx.activity.L.a(getOnBackPressedDispatcher(), this, new b(), 2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d() {
        this.f20750d.disposeComposition();
    }

    public final void e(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        this.f20750d.a(abstractC3984t, c4912a);
    }

    public final void f(@NotNull Function0<Unit> function0, @NotNull C0 c02, @NotNull Z1.s sVar) {
        this.f20747a = function0;
        this.f20748b = c02;
        EnumC6042T a11 = c02.a();
        ViewGroup.LayoutParams layoutParams = this.f20749c.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i11 = 0;
        boolean z11 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i12 = K0.a.f20668a[a11.ordinal()];
        if (i12 == 1) {
            z11 = false;
        } else if (i12 == 2) {
            z11 = true;
        } else if (i12 != 3) {
            throw new Sc.o();
        }
        Window window = getWindow();
        Intrinsics.f(window);
        window.setFlags(z11 ? 8192 : -8193, 8192);
        int i13 = c.f20752a[sVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new Sc.o();
            }
            i11 = 1;
        }
        this.f20750d.setLayoutDirection(i11);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f20747a.invoke();
        }
        return onTouchEvent;
    }
}
