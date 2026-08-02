package Tt;

import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27210a;

    public /* synthetic */ a(int i11) {
        this.f27210a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        PromptStatusViewModel viewModelProvider$lambda$0;
        GroupSwipeCoordinator groupSwipeCoordinator$lambda$1;
        switch (this.f27210a) {
            case 0:
                viewModelProvider$lambda$0 = PromptStatusDIComponent$Companion$create$1$1.viewModelProvider$lambda$0();
                return viewModelProvider$lambda$0;
            default:
                groupSwipeCoordinator$lambda$1 = CartSplitV2ControlsWidgetComponent$Companion$create$1$1.groupSwipeCoordinator$lambda$1();
                return groupSwipeCoordinator$lambda$1;
        }
    }
}
