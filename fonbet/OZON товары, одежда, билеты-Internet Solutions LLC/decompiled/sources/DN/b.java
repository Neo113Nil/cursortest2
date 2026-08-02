package DN;

import Ve.C4327id;
import Ve.C4756xb;
import Ve.Hk;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorWidgetViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.gallery.view.GalleryView;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;
import ru.ozon.app.android.partpayment.formpage.view.vh.AddressFieldVH;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewHolder;
import ru.ozon.app.android.storefront.widgets.miniappHeader.presentation.MiniappHeaderViewHolder;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.TotalPriceDetailsItemView;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.fintech.features.offline.ui.bank.OfflineBankView;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.image.FinImageView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase.JointPurchaseButtonWithQuantityView;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeGradientButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.cart.AddToCartButtonHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6263b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f6262a = i11;
        this.f6263b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6262a) {
            case 0:
                TotalPriceDetailsItemView.setUpRoot$lambda$12((TotalPriceDetailsItemView) this.f6263b, view);
                break;
            case 1:
                CancelPostingsV2SelectAllViewHolder._init_$lambda$0((CancelPostingsV2SelectAllViewHolder) this.f6263b, view);
                break;
            case 2:
                ((Function1) this.f6263b).invoke(view);
                break;
            case 3:
                JointPurchaseButtonWithQuantityView.initClickListeners$lambda$3((JointPurchaseButtonWithQuantityView) this.f6263b, view);
                break;
            case 4:
                PinPadFragment.C((PinPadFragment) this.f6263b);
                break;
            case 5:
                Hk this$0 = (Hk) this.f6263b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4756xb) this$0.u()).e0(C4327id.f31286a);
                break;
            case 6:
                LargeGradientButtonHolder._init_$lambda$1((LargeGradientButtonHolder) this.f6263b, view);
                break;
            case 7:
                AddToCartButtonHolder.onBind$lambda$2$lambda$1((AddToCartButtonHolder) this.f6263b, view);
                break;
            case 8:
                MiniappHeaderViewHolder._init_$lambda$0((MiniappHeaderViewHolder) this.f6263b, view);
                break;
            case 9:
                AddressFieldVH._init_$lambda$0((AddressFieldVH) this.f6263b, view);
                break;
            case 10:
                OrderCalculatorWidgetViewHolder.setupRegionViews$lambda$2((OrderCalculatorWidgetViewHolder) this.f6263b, view);
                break;
            case 11:
                ReviewGalleryBaseWidgetVH.lambda$16$lambda$12((ReviewGalleryBaseWidgetVH) this.f6263b, view);
                break;
            case 12:
                GalleryView.bindItems$lambda$1$lambda$0((GalleryView) this.f6263b, view);
                break;
            case 13:
                AirplaneSeatView._init_$lambda$4((AirplaneSeatView) this.f6263b, view);
                break;
            case 14:
                DeliveryWidgetV3View.bind$lambda$23$lambda$22((Function0) this.f6263b, view);
                break;
            case 15:
                IconFieldView.setUpListener$lambda$10((IconFieldView) this.f6263b, view);
                break;
            case 16:
                OfflineBankView._init_$lambda$1((OfflineBankView) this.f6263b, view);
                break;
            case 17:
                FinImageView._init_$lambda$1((FinImageView) this.f6263b, view);
                break;
            case 18:
                FinToolbarView.lambda$7$lambda$6((FinToolbarView) this.f6263b, view);
                break;
            case 19:
                SelectView._init_$lambda$0((SelectView) this.f6263b, view);
                break;
            default:
                ((MiniAppWebActivity) this.f6263b).onBackPressed();
                break;
        }
    }
}
