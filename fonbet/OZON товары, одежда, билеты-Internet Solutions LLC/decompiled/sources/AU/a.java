package AU;

import Ui.C4069c;
import android.view.View;
import ld0.C7929D;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewHolder.OpenCloudViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonHolder;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.NaviGridVerticalCoupleViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.view.HotelsCheckoutTitleView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager.HotelsGalleryFullPagerVideoViewHolder;
import ru.ozon.app.android.travel.pageconfigurator.onBackPressed.MainTabRedirectOnBackPressedConfigurator;
import ru.ozon.app.android.uikit.view.input.ToggleImageView;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f664b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f663a = i11;
        this.f664b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f663a) {
            case 0:
                MainTabRedirectOnBackPressedConfigurator.onComposerInitialized$lambda$1$lambda$0((MainTabRedirectOnBackPressedConfigurator) this.f664b, view);
                break;
            case 1:
                ((OpenCloudViewHolder) this.f664b).onClick(view);
                break;
            case 2:
                HotelsCheckoutTitleView._init_$lambda$5((HotelsCheckoutTitleView) this.f664b, view);
                break;
            case 3:
                PinPadFragment.F((PinPadFragment) this.f664b);
                break;
            case 4:
                SocialIconButtonHolder._init_$lambda$1((SocialIconButtonHolder) this.f664b, view);
                break;
            case 5:
                C4069c.t((C4069c) this.f664b);
                break;
            case 6:
                SellerTransparencyV3ViewHolder.clickListener$lambda$0((SellerTransparencyV3ViewHolder) this.f664b, view);
                break;
            case 7:
                DSDisclaimerHolder._init_$lambda$5((DSDisclaimerHolder) this.f664b, view);
                break;
            case 8:
                HotelsGalleryFullPagerVideoViewHolder.lambda$5$lambda$4((HotelsGalleryFullPagerVideoViewHolder) this.f664b, view);
                break;
            case 9:
                C7929D.u((C7929D) this.f664b);
                break;
            case 10:
                ((CancelPostingsV2MonopostingViewHolder) this.f664b).clickToPriceUpView();
                break;
            case 11:
                ((d) this.f664b).d().requireActivity().onBackPressed();
                break;
            case 12:
                QrScannerResultBottomSheet.onViewCreated$lambda$3((QrScannerResultBottomSheet) this.f664b, view);
                break;
            case 13:
                NaviGridVerticalCoupleViewHolder.bottomOnClickListener$lambda$3((NaviGridVerticalCoupleViewHolder) this.f664b, view);
                break;
            default:
                ((ToggleImageView) this.f664b).toggle();
                break;
        }
    }
}
