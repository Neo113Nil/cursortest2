package AW;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsVO;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewHolder;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteButtonMoleculeView;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemVO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemViewHolder;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewHolder.DeliveryDateSlotViewHolder;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem.DeliveryDateSelectorV2VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.ugc.GalleryV5UgcVH;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.presentation.viewHolder.AuthViewHolder;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentVO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.view.TravelOrderNavContentView;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.MoreView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f669c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f667a = i11;
        this.f668b = obj;
        this.f669c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f667a) {
            case 0:
                MoreView.bind$lambda$1((Function1) this.f668b, (ReviewTilesVO.Content.More) this.f669c, view);
                break;
            case 1:
                ControlsViewHolder.bind$lambda$2$lambda$0((ControlsViewHolder) this.f668b, (ControlsVO) this.f669c, view);
                break;
            case 2:
                BotItemViewHolder.setItemQuantity$lambda$4((BotItemVO) this.f668b, (BotItemViewHolder) this.f669c, view);
                break;
            case 3:
                DeliveryDateSlotViewHolder.bind$lambda$2$lambda$1((DeliveryDateSelectorV2VO.DeliveryDateVO) this.f668b, (DeliveryDateSlotViewHolder) this.f669c, view);
                break;
            case 4:
                GalleryV5UgcVH.bind$lambda$2((GalleryV5VO.Item.Ugc) this.f668b, (GalleryV5UgcVH) this.f669c, view);
                break;
            case 5:
                TravelOrderNavContentView.bind$lambda$11((TravelOrderNavContentVO) this.f669c, (Function1) this.f668b, view);
                break;
            case 6:
                AuthViewHolder.prepareHintButtons$lambda$11$lambda$10$lambda$9$lambda$8((AuthViewHolder) this.f668b, (AuthDTO.HintButton) this.f669c, view);
                break;
            default:
                FreshFavoriteButtonMoleculeView.bindOrGoneFavorite$lambda$0((FreshFavoriteButtonMoleculeView) this.f668b, (Function0) this.f669c, view);
                break;
        }
    }

    public /* synthetic */ a(TravelOrderNavContentVO travelOrderNavContentVO, Function1 function1) {
        this.f667a = 5;
        this.f669c = travelOrderNavContentVO;
        this.f668b = function1;
    }
}
