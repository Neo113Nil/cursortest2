package CG;

import Ve.C4532pg;
import Ve.C4629sr;
import Ve.S7;
import android.view.View;
import androidx.fragment.app.G;
import kc0.C7645c;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.ProfileAvatarViewHolder;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.imagetitle.BlackFridayStatusImageTitleViewHolder;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListViewHolder;
import ru.ozon.app.android.product.common.header.HeaderViewHolder;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots.DateSlotsAdapter;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.single.SingleNaviCategoriesViewHolder;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.rv.VideoViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2FooterBlockView;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.view.TravelFlightCheckTariffView;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.fintech.ui.qrcode.QrCodeView;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import tj.e;
import tj.f;
import uj.C10065b;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4533b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f4532a = i11;
        this.f4533b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4532a) {
            case 0:
                ((CancelPostingsV2MonopostingViewHolder) this.f4533b).clickToPriceUpView();
                break;
            case 1:
                HeaderViewHolder._init_$lambda$2((HeaderViewHolder) this.f4533b, view);
                break;
            case 2:
                CrossSaleListViewHolder._init_$lambda$1((CrossSaleListViewHolder) this.f4533b, view);
                break;
            case 3:
                ChipWrapper.setChipState$lambda$0((ChipWrapper) this.f4533b, view);
                break;
            case 4:
                FreshTabOnboardingDialog.onViewCreated$lambda$1((FreshTabOnboardingDialog) this.f4533b, view);
                break;
            case 5:
                ProfileAvatarViewHolder.titleOnClickListener$lambda$3((ProfileAvatarViewHolder) this.f4533b, view);
                break;
            case 6:
                VideoViewHolder._init_$lambda$2((VideoViewHolder) this.f4533b, view);
                break;
            case 7:
                FlightSeatsSchemeV2FooterBlockView._init_$lambda$16((FlightSeatsSchemeV2FooterBlockView) this.f4533b, view);
                break;
            case 8:
                S7 this$0 = (S7) this.f4533b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4532pg) this$0.u()).e0(C4629sr.f32072b);
                break;
            case 9:
                ButtonAtomWrapperView.bindState$lambda$1((ButtonAtomWrapperState) this.f4533b, view);
                break;
            case 10:
                ProfileHeaderViewHolder.setCountClickListeners$lambda$11$lambda$10((ProfileHeaderViewHolder) this.f4533b, view);
                break;
            case 11:
                TravelFlightCheckTariffView._init_$lambda$0((TravelFlightCheckTariffView) this.f4533b, view);
                break;
            case 12:
                C7645c.w((C7645c) this.f4533b);
                break;
            case 13:
                DateSlotsAdapter.ViewHolder._init_$lambda$1((DateSlotsAdapter.ViewHolder) this.f4533b, view);
                break;
            case 14:
                BlackFridayStatusImageTitleViewHolder.configureTitleImage$lambda$7$lambda$5((BlackFridayStatusImageTitleViewHolder) this.f4533b, view);
                break;
            case 15:
                QrCodeView._init_$lambda$1((QrCodeView) this.f4533b, view);
                break;
            case 16:
                G parentFragmentManager = ((e) this.f4533b).getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                f.a(parentFragmentManager, new C10065b());
                break;
            default:
                SingleNaviCategoriesViewHolder._init_$lambda$1((SingleNaviCategoriesViewHolder) this.f4533b, view);
                break;
        }
    }
}
