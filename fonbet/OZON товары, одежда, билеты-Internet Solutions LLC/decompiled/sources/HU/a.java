package HU;

import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10757a;

    public /* synthetic */ a(int i11) {
        this.f10757a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        UgcCachedActionsSharedViewModel _get_ugcCachedActionsSharedViewModel_$lambda$1;
        TotalVisibilityViewModel cartTotalVisibilityViewModelProvider$lambda$2;
        switch (this.f10757a) {
            case 0:
                _get_ugcCachedActionsSharedViewModel_$lambda$1 = CommentsListComponent$Companion$create$1$1._get_ugcCachedActionsSharedViewModel_$lambda$1();
                return _get_ugcCachedActionsSharedViewModel_$lambda$1;
            default:
                cartTotalVisibilityViewModelProvider$lambda$2 = StickyTotalComponent$Companion$create$1$1.cartTotalVisibilityViewModelProvider$lambda$2();
                return cartTotalVisibilityViewModelProvider$lambda$2;
        }
    }
}
