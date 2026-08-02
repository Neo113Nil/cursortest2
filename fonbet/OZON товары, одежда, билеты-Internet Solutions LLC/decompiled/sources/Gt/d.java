package Gt;

import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewHolder;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10312b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f10311a = i11;
        this.f10312b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        CartControlsViewModel cartControlsViewController$lambda$0;
        ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder$lambda$1;
        switch (this.f10311a) {
            case 0:
                cartControlsViewController$lambda$0 = CartControlsViewHolder.cartControlsViewController$lambda$0((CartControlsViewHolder) this.f10312b);
                return cartControlsViewController$lambda$0;
            default:
                cartButtonContainerBinder$lambda$1 = ReviewGalleryComponent$Companion$create$1$1.cartButtonContainerBinder$lambda$1((ReviewGalleryComponent$Companion$create$1$1) this.f10312b);
                return cartButtonContainerBinder$lambda$1;
        }
    }
}
