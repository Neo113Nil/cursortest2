package CC;

import Fb0.c;
import Fb0.d;
import Kb0.K;
import Ve.C4192dm;
import Ve.D1;
import Ve.Rl;
import android.view.View;
import androidx.fragment.app.r;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.android.messenger.blocks.messagetext.b;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter.ParcelPhotoAddItemViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.TipReviewItemInputV2ViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.singleReviewBottom.SingleReviewBottomSheetFragment;
import ru.ozon.app.android.returns.list.deeplink.ReturnListNormalizeBackStackConfigurator;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2WidgetViewHolder;
import ru.ozon.app.android.sellerproducts.header.HeaderViewHolder;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view.SupportBenefitsBannerView;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelCardView;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders.ObjectScrollAdultItemViewHolder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4521b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4520a = i11;
        this.f4521b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f4521b;
        switch (this.f4520a) {
            case 0:
                ((SingleReviewBottomSheetFragment) obj).dismiss();
                return;
            case 1:
                VideoMoleculeViewHolder.lambda$17$lambda$16((VideoMoleculeViewHolder) obj, view);
                return;
            case 2:
                ObjectScrollAdultItemViewHolder.onClickListener$lambda$1((ObjectScrollAdultItemViewHolder) obj, view);
                return;
            case 3:
                HotelCardView._init_$lambda$33((HotelCardView) obj, view);
                return;
            case 4:
                ParcelPhotoAddItemViewHolder.lambda$8$lambda$0((ParcelPhotoAddItemViewHolder) obj, view);
                return;
            case 5:
                C4192dm this$0 = (C4192dm) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((D1) this$0.u()).e0(Rl.f29867a);
                return;
            case 6:
                MediaPickerItemVH.lambda$6$lambda$5((MediaPickerItemVH) obj, view);
                return;
            case 7:
                ((SellerCarouselAdapter.SellerViewHolder) obj).onProductClick(1);
                return;
            case 8:
                SearchResultsSortV2WidgetViewHolder._init_$lambda$1((SearchResultsSortV2WidgetViewHolder) obj, view);
                return;
            case 9:
                HeaderViewHolder._init_$lambda$2((HeaderViewHolder) obj, view);
                return;
            case 10:
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                if (k11.t().h().getValue().b().j()) {
                    d.a(new c(true, (AuthTokenDTO) null, 6), Gb0.d.LOGIN, true);
                    return;
                }
                int i11 = AuthFlowActivity.f97290u;
                r requireActivity = ((x) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                AuthFlowActivity.a.d(requireActivity, null, true, null);
                return;
            case 11:
                TipReviewItemInputV2ViewHolder.lambda$2$lambda$1((TextInputEditText) obj, view);
                return;
            case 12:
                ((ReturnListNormalizeBackStackConfigurator) obj).openCabinet();
                return;
            case 13:
                ScreenStateViewWidget.setButton$lambda$13$lambda$12((ScreenStateViewWidget) obj, view);
                return;
            case 14:
                ((b) obj).dismiss();
                return;
            case 15:
                CameraFragment.capturePhoto$default((CameraFragment) obj, false, 1, null);
                return;
            case 16:
                CurtainNavBarViewHolder._init_$lambda$7((CurtainNavBarViewHolder) obj, view);
                return;
            case 17:
                NewCredentialsViewHolder._init_$lambda$0((NewCredentialsViewHolder) obj, view);
                return;
            case 18:
                ((Function0) obj).invoke();
                return;
            default:
                SupportBenefitsBannerView._init_$lambda$20((SupportBenefitsBannerView) obj, view);
                return;
        }
    }
}
