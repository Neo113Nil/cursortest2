package DS;

import Ve.C4474ng;
import Ve.Vb;
import Ve.Vh;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonPriceUpBottomSheetFragment;
import ru.ozon.app.android.partpayment.formpage.view.vh.PickerFieldVH;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation.WarningTooltipViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.adapter.HotelsScrollPriceViewHolder;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.view.ToursRoomsListV2RoomView;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoVH;
import ru.ozon.app.android.ugc.widgets.usersFinalRating.presentation.UsersFinalRatingViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemViewHolder;
import ru.ozon.app.android.web.zoomWebView.WebBottomSheetZoomEnabledFragment;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.atoms.v3.holders.badge.BadgeHolder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6273b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6272a = i11;
        this.f6273b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6272a) {
            case 0:
                HotelsScrollPriceViewHolder._init_$lambda$1((HotelsScrollPriceViewHolder) this.f6273b, view);
                break;
            case 1:
                RateMainButtonViewHolder.buttonListener$lambda$1((RateMainButtonViewHolder) this.f6273b, view);
                break;
            case 2:
                ReviewsPreviewVideoVH._init_$lambda$1((ReviewsPreviewVideoVH) this.f6273b, view);
                break;
            case 3:
                VideoGalleryFullViewHolder._init_$lambda$4((VideoGalleryFullViewHolder) this.f6273b, view);
                break;
            case 4:
                ((WebBottomSheetZoomEnabledFragment) this.f6273b).closeFragment();
                break;
            case 5:
                UniversalObjectGridOneSingleItemViewHolder._init_$lambda$2((UniversalObjectGridOneSingleItemViewHolder) this.f6273b, view);
                break;
            case 6:
                ToursRoomsListV2RoomView.setupLayout$lambda$9((ToursRoomsListV2RoomView) this.f6273b, view);
                break;
            case 7:
                PageIssueStateView.a j11 = ((PageIssueStateView) this.f6273b).j();
                if (j11 != null) {
                    j11.onErrorSummaryClick();
                    break;
                }
                break;
            case 8:
                BadgeHolder.onBind$lambda$3$lambda$1((BadgeHolder) this.f6273b, view);
                break;
            case 9:
                C4474ng this$0 = (C4474ng) this.f6273b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((Vh) this$0.u()).f0(Vb.f30191a);
                break;
            case 10:
                PickerFieldVH._init_$lambda$0((PickerFieldVH) this.f6273b, view);
                break;
            case 11:
                UsersFinalRatingViewHolder._init_$lambda$0((UsersFinalRatingViewHolder) this.f6273b, view);
                break;
            case 12:
                HotelsGalleryFeedV2WidgetViewHolder._init_$lambda$0((HotelsGalleryFeedV2WidgetViewHolder) this.f6273b, view);
                break;
            case 13:
                CancelReasonPriceUpBottomSheetFragment.bindViews$lambda$1$lambda$0((CancelReasonPriceUpBottomSheetFragment) this.f6273b, view);
                break;
            case 14:
                WidgetFrameLayout.clickListener$lambda$1((WidgetFrameLayout) this.f6273b, view);
                break;
            default:
                WarningTooltipViewHolder.warningTooltipView$lambda$2$lambda$1((WarningTooltipViewHolder) this.f6273b, view);
                break;
        }
    }
}
