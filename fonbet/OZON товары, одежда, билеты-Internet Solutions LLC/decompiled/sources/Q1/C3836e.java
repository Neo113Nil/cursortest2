package Q1;

import Sc.InterfaceC3999a;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7783A;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: Q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3836e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f22870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3850t f22871b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22873d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22874e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22875f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22876g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22877h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22878i;

    /* renamed from: j, reason: collision with root package name */
    private K f22879j;

    /* renamed from: k, reason: collision with root package name */
    private K1.K f22880k;

    /* renamed from: l, reason: collision with root package name */
    private D f22881l;

    /* renamed from: n, reason: collision with root package name */
    private C7460f f22883n;

    /* renamed from: o, reason: collision with root package name */
    private C7460f f22884o;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f22872c = new Object();

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f22882m = C3837f.f22889b;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f22885p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final float[] f22886q = C7837o0.b();

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Matrix f22887r = new Matrix();

    /* renamed from: Q1.e$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<C7837o0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22888b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(C7837o0 c7837o0) {
            c7837o0.j();
            return Unit.f71690a;
        }
    }

    public C3836e(@NotNull AndroidComposeView androidComposeView, @NotNull C3850t c3850t) {
        this.f22870a = androidComposeView;
        this.f22871b = c3850t;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    private final void c() {
        C3850t c3850t = this.f22871b;
        if (c3850t.c()) {
            ?? r12 = this.f22882m;
            float[] fArr = this.f22886q;
            r12.invoke(C7837o0.a(fArr));
            this.f22870a.v0(fArr);
            Matrix matrix = this.f22887r;
            C7783A.a(matrix, fArr);
            K k11 = this.f22879j;
            Intrinsics.f(k11);
            D d11 = this.f22881l;
            Intrinsics.f(d11);
            K1.K k12 = this.f22880k;
            Intrinsics.f(k12);
            C7460f c7460f = this.f22883n;
            Intrinsics.f(c7460f);
            C7460f c7460f2 = this.f22884o;
            Intrinsics.f(c7460f2);
            c3850t.f(C3835d.a(this.f22885p, k11, d11, k12, matrix, c7460f, c7460f2, this.f22875f, this.f22876g, this.f22877h, this.f22878i));
            this.f22874e = false;
        }
    }

    public final void a() {
        synchronized (this.f22872c) {
            this.f22879j = null;
            this.f22881l = null;
            this.f22880k = null;
            this.f22882m = a.f22888b;
            this.f22883n = null;
            this.f22884o = null;
            Unit unit = Unit.f71690a;
        }
    }

    public final void b(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        synchronized (this.f22872c) {
            try {
                this.f22875f = z13;
                this.f22876g = z14;
                this.f22877h = z15;
                this.f22878i = z16;
                if (z11) {
                    this.f22874e = true;
                    if (this.f22879j != null) {
                        c();
                    }
                }
                this.f22873d = z12;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@NotNull K k11, @NotNull D d11, @NotNull K1.K k12, @NotNull Function1<? super C7837o0, Unit> function1, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        synchronized (this.f22872c) {
            try {
                this.f22879j = k11;
                this.f22881l = d11;
                this.f22880k = k12;
                this.f22882m = (AbstractC7737t) function1;
                this.f22883n = c7460f;
                this.f22884o = c7460f2;
                if (!this.f22874e) {
                    if (this.f22873d) {
                    }
                    Unit unit = Unit.f71690a;
                }
                c();
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
