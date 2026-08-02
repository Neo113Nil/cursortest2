package H10;

import A00.a;
import h10.AbstractC6779a;
import i10.C6997c;
import i10.k;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class d extends AbstractC6779a<l, c> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E10.c f10506c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M10.a f10507d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f10508e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final X10.f f10509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull E10.c prefetchManager, @NotNull M10.a composerScrollOffsetController, @NotNull f viewedPond, @NotNull X10.f widgetViewAsyncCreator) {
        super(new c(false, null));
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(composerScrollOffsetController, "composerScrollOffsetController");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Intrinsics.checkNotNullParameter(widgetViewAsyncCreator, "widgetViewAsyncCreator");
        this.f10506c = prefetchManager;
        this.f10507d = composerScrollOffsetController;
        this.f10508e = viewedPond;
        this.f10509f = widgetViewAsyncCreator;
    }

    @Override // h10.AbstractC6779a
    public final c d(A00.a event, C6997c<l> state, c cVar) {
        T00.a f7;
        T00.e h11;
        List<l> a11;
        l lVar;
        c additionalState = cVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(additionalState, "additionalState");
        if (event instanceof a.u) {
            this.f10507d.d();
            return additionalState;
        }
        if ((event instanceof a.y) || (event instanceof a.z) || (event instanceof a.x) || (event instanceof a.J) || (event instanceof a.C2371l) || (event instanceof a.r)) {
            return c.a(additionalState);
        }
        if (!(event instanceof a.o)) {
            return additionalState;
        }
        this.f10509f.disable();
        boolean z11 = ((a.o) event).g() instanceof a.u;
        if (z11) {
            this.f10508e.a();
            k.a<l> e11 = state.e();
            if (e11 != null && (a11 = e11.a()) != null && (lVar = (l) C7714v.Z(a11)) != null) {
                lVar.q(UUID.randomUUID().toString());
            }
        }
        i10.e d11 = state.o().d();
        String e12 = (d11 == null || (f7 = d11.f()) == null || (h11 = f7.h()) == null) ? null : h11.e();
        E10.a b11 = additionalState.b();
        if (e12 != null && z11) {
            b11 = this.f10506c.getPrefetchDepth(e12);
        }
        return new c(z11, b11);
    }
}
