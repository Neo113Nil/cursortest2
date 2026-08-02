package Gt;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.snackbar.SnackbarVO;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsVO;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsView;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselVO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselViewHolder;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PostingOrderShipmentWidgetViewHolder;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.crosslink.CrossLinkV3ViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10308c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f10306a = i11;
        this.f10308c = obj;
        this.f10307b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10306a) {
            case 0:
                CartControlsView.bind$lambda$10((CartControlsVO) this.f10308c, (Function1) this.f10307b, view);
                break;
            case 1:
                CrossLinkV3ViewHolder._init_$lambda$0((CrossLinkV3ViewHolder) this.f10308c, (Function1) this.f10307b, view);
                break;
            case 2:
                SellerCarouselViewHolder.bind$lambda$4$lambda$3((SellerCarouselVO) this.f10308c, (SellerCarouselViewHolder) this.f10307b, view);
                break;
            case 3:
                ru.ozon.android.messenger.framework.core.d dVar = (ru.ozon.android.messenger.framework.core.d) this.f10308c;
                ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
                SnackbarVO snackbarVO = (SnackbarVO) this.f10307b;
                c11.m(snackbarVO.getTrackingInfo());
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(snackbarVO.getTapAction()));
                break;
            default:
                PostingOrderShipmentWidgetViewHolder.bind$lambda$5$lambda$4$lambda$2((PostingOrderShipmentWidgetViewHolder) this.f10308c, (AtomAction) this.f10307b, view);
                break;
        }
    }
}
