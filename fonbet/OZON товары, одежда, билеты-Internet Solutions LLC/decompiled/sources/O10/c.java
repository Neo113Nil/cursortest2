package O10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f19859a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f19860b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f19861c;

    /* renamed from: d, reason: collision with root package name */
    private final SwipeRefreshLayout f19862d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19863e;

    /* renamed from: f, reason: collision with root package name */
    private int f19864f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private WeakReference<View> f19865g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull ViewGroup stickyPlaceholder, @NotNull Q10.a stickyContainer, @NotNull g composerRecyclerView, SwipeRefreshLayout swipeRefreshLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(stickyPlaceholder, "stickyPlaceholder");
        Intrinsics.checkNotNullParameter(stickyContainer, "stickyContainer");
        Intrinsics.checkNotNullParameter(composerRecyclerView, "composerRecyclerView");
        this.f19859a = stickyPlaceholder;
        this.f19860b = (ViewGroup) stickyContainer;
        this.f19861c = composerRecyclerView;
        this.f19862d = swipeRefreshLayout;
        this.f19863e = z11;
        this.f19864f = -1;
        this.f19865g = new WeakReference<>(null);
    }

    private final View a(float f7, boolean z11) {
        float f11 = f() + f7;
        g gVar = this.f19861c;
        IntRange o11 = h.o(0, gVar.getChildCount());
        int f71842a = o11.getF71842a();
        int f71843b = o11.getF71843b();
        View view = null;
        if (f71842a <= f71843b) {
            float f12 = Float.MAX_VALUE;
            float f13 = Float.MIN_VALUE;
            while (true) {
                View childAt = gVar.getChildAt(f71842a);
                Intrinsics.f(childAt);
                float a11 = f.a(childAt);
                float b11 = f.b(childAt, this.f19863e);
                if (b11 <= f11 && f11 <= a11) {
                    if (z11 && b11 < f12) {
                        view = childAt;
                        f12 = b11;
                    } else if (!z11 && a11 >= f13) {
                        view = childAt;
                        f13 = a11;
                    }
                }
                if (f71842a == f71843b) {
                    break;
                }
                f71842a++;
            }
        }
        return view;
    }

    public final int b() {
        View a11 = a(0.0f, false);
        if (a11 != null) {
            return this.f19861c.getChildAdapterPosition(a11);
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q10.a, android.view.ViewGroup] */
    public final int c() {
        View a11 = a(this.f19860b.d(), false);
        if (a11 != null) {
            return this.f19861c.getChildAdapterPosition(a11);
        }
        return -1;
    }

    @NotNull
    public final WeakReference<View> d() {
        return this.f19865g;
    }

    public final int e() {
        return this.f19864f;
    }

    public final float f() {
        float y11 = this.f19859a.getY();
        SwipeRefreshLayout swipeRefreshLayout = this.f19862d;
        return y11 - (swipeRefreshLayout != null ? swipeRefreshLayout.getY() : 0.0f);
    }

    public final float g() {
        return f() - (this.f19865g.get() != null ? r1.getTop() : 0);
    }

    public final void h() {
        this.f19865g = new WeakReference<>(null);
        this.f19864f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [Q10.a, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z11) {
        float d11;
        View a11;
        ?? r02 = this.f19860b;
        Q10.d dVar = r02 instanceof Q10.d ? (Q10.d) r02 : null;
        if (dVar != null) {
            Float valueOf = z11 ? Float.valueOf(dVar.i()) : null;
            if (valueOf != null) {
                d11 = valueOf.floatValue();
                a11 = a(d11, z11);
                if (a11 == this.f19865g.get()) {
                    this.f19865g = new WeakReference<>(a11);
                    this.f19864f = a11 != null ? this.f19861c.getChildAdapterPosition(a11) : -1;
                    return;
                }
                return;
            }
        }
        d11 = r02.d();
        a11 = a(d11, z11);
        if (a11 == this.f19865g.get()) {
        }
    }
}
