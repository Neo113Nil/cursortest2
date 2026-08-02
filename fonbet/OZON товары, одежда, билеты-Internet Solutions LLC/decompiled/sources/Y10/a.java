package Y10;

import android.view.View;
import f20.C6406a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes3.dex */
public final class a extends k<C6406a> {

    /* renamed from: Y10.a$a, reason: collision with other inner class name */
    static final class C0631a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7851b f34533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0631a(InterfaceC7851b interfaceC7851b) {
            super(0);
            this.f34533b = interfaceC7851b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f34533b.f(true);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull View view, @NotNull InterfaceC7851b controller) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controller, "controller");
        View view2 = this.itemView;
        Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.composer.ui.view.issue.PageIssueStateView");
        ((PageIssueStateView) view2).l(new C0631a(controller));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public final void bind(C6406a c6406a, d info) {
        C6406a item = c6406a;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View view = this.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.composer.ui.view.issue.PageIssueStateView");
        ((PageIssueStateView) view).q(item.a());
    }
}
