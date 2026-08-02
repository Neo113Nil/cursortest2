package Dc0;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Dc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2852a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Context> f6463b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<WindowManager> f6464c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Fc0.e, Unit> f6465d;

    /* renamed from: e, reason: collision with root package name */
    private C2853b f6466e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Fc0.e f6467f;

    /* renamed from: g, reason: collision with root package name */
    private int f6468g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f6469h;

    /* renamed from: Dc0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0135a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6470a;

        static {
            int[] iArr = new int[Fc0.e.values().length];
            try {
                iArr[Fc0.e.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fc0.e.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Fc0.e.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6470a = iArr;
        }
    }

    /* renamed from: Dc0.a$b */
    static final class b extends AbstractC7737t implements Function0<Fc0.e> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fc0.e invoke() {
            int rotation;
            Display display;
            int i11 = Build.VERSION.SDK_INT;
            C2852a c2852a = C2852a.this;
            if (i11 >= 30) {
                display = ((Context) c2852a.f6463b.invoke()).getDisplay();
                rotation = display.getRotation();
            } else {
                rotation = ((WindowManager) c2852a.f6464c.invoke()).getDefaultDisplay().getRotation();
            }
            Rect j11 = c2852a.j();
            return (rotation == 0 || rotation == 2 ? j11.width() <= j11.height() : j11.height() <= j11.width()) ? Fc0.e.PORTRAIT : Fc0.e.LANDSCAPE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2852a(boolean z11, @NotNull Function0<? extends Context> getContext, @NotNull Function0<? extends WindowManager> getWindowManager, @NotNull Function1<? super Fc0.e, Unit> onOrientationChanged) {
        Intrinsics.checkNotNullParameter(getContext, "getContext");
        Intrinsics.checkNotNullParameter(getWindowManager, "getWindowManager");
        Intrinsics.checkNotNullParameter(onOrientationChanged, "onOrientationChanged");
        this.f6462a = z11;
        this.f6463b = getContext;
        this.f6464c = getWindowManager;
        this.f6465d = onOrientationChanged;
        this.f6467f = Fc0.e.UNKNOWN;
        this.f6468g = -1;
        this.f6469h = Sc.k.b(new b());
    }

    public static final int g(C2852a c2852a, int i11) {
        return ((Fc0.e) c2852a.f6469h.getValue()) == Fc0.e.LANDSCAPE ? (i11 + 90) % 360 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect j() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        int i11 = Build.VERSION.SDK_INT;
        Function0<WindowManager> function0 = this.f6464c;
        if (i11 < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) ((A) function0).invoke()).getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        currentWindowMetrics = ((WindowManager) ((A) function0).invoke()).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.f(bounds);
        return bounds;
    }

    @NotNull
    public final Fc0.e k() {
        return this.f6467f;
    }

    public final void l() {
        this.f6466e = null;
    }

    public final void m() {
        C2853b c2853b = this.f6466e;
        if (c2853b != null) {
            c2853b.disable();
        }
    }

    public final void n() {
        Fc0.e eVar;
        C2853b c2853b = this.f6466e;
        if (c2853b != null) {
            c2853b.enable();
        }
        if (this.f6467f == Fc0.e.UNKNOWN) {
            if (this.f6462a) {
                Rect j11 = j();
                eVar = j11.width() > j11.height() ? Fc0.e.LANDSCAPE : Fc0.e.PORTRAIT;
            } else {
                eVar = Fc0.e.PORTRAIT;
            }
            this.f6467f = eVar;
            ((y) this.f6465d).invoke(eVar);
        }
    }

    public final void o() {
        this.f6466e = new C2853b(this, (Context) ((z) this.f6463b).invoke());
    }
}
