package R10;

import P10.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager;
import v10.C10183a;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f24243a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l10.g f24244b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c.a f24245c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f24246d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ComposerGridLayoutManager f24247e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C8042d f24248f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final D f24249g;

    /* renamed from: h, reason: collision with root package name */
    private final ComposerListBehavior f24250h;

    /* renamed from: i, reason: collision with root package name */
    private final SwipeRefreshLayout f24251i;

    public g(@NotNull View rootView, @NotNull l10.g config, @NotNull c.a stickyHeaderAsyncDifferFactory, @NotNull androidx.recyclerview.widget.g composerRecyclerView, @NotNull ComposerGridLayoutManager composerLayoutManager, @NotNull C8042d composerAdapter, @NotNull D viewLifecycleScope, ComposerListBehavior composerListBehavior, SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(stickyHeaderAsyncDifferFactory, "stickyHeaderAsyncDifferFactory");
        Intrinsics.checkNotNullParameter(composerRecyclerView, "composerRecyclerView");
        Intrinsics.checkNotNullParameter(composerLayoutManager, "composerLayoutManager");
        Intrinsics.checkNotNullParameter(composerAdapter, "composerAdapter");
        Intrinsics.checkNotNullParameter(viewLifecycleScope, "viewLifecycleScope");
        this.f24243a = rootView;
        this.f24244b = config;
        this.f24245c = stickyHeaderAsyncDifferFactory;
        this.f24246d = composerRecyclerView;
        this.f24247e = composerLayoutManager;
        this.f24248f = composerAdapter;
        this.f24249g = viewLifecycleScope;
        this.f24250h = composerListBehavior;
        this.f24251i = swipeRefreshLayout;
    }

    public final f a() {
        ViewGroup l11 = C10183a.l(this.f24243a);
        if (l11 != null) {
            l10.g gVar = this.f24244b;
            l11.setVisibility(gVar.j() ? 0 : 8);
            ViewGroup viewGroup = gVar.j() ? l11 : null;
            if (viewGroup != null) {
                if (!gVar.n()) {
                    return new e(viewGroup, this.f24246d, this.f24248f, this.f24251i);
                }
                return new d(viewGroup, this.f24245c, this.f24246d, this.f24247e, this.f24248f, this.f24250h, this.f24249g, this.f24251i, gVar.q(), gVar.o());
            }
        }
        return null;
    }
}
