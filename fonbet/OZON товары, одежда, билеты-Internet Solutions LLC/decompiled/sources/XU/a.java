package XU;

import android.view.View;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation.DeliverySwitchButtonsLayout;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier.ContactCourierBottomSheetDialog;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier.CourierInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedViewHolder;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34202c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f34200a = i11;
        this.f34201b = obj;
        this.f34202c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34200a) {
            case 0:
                ReviewGalleryFeedViewHolder.bind$lambda$2$lambda$1((ReviewGalleryFeedVO) this.f34201b, (ReviewGalleryFeedViewHolder) this.f34202c, view);
                break;
            case 1:
                ScreenStateViewWidget.showState$lambda$4$lambda$3((ScreenStateViewWidget) this.f34201b, (ScreenState.AntibotAlert) this.f34202c, view);
                break;
            case 2:
                DeliverySwitchButtonsLayout.createItems$lambda$5$lambda$3((Function2) this.f34201b, (DeliveryQuantityVO.Selector.SelectorElement) this.f34202c, view);
                break;
            default:
                ContactCourierBottomSheetDialog.onViewCreated$lambda$2$lambda$0((CourierInfo) this.f34201b, (ContactCourierBottomSheetDialog) this.f34202c, view);
                break;
        }
    }
}
