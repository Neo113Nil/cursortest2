package FG;

import Ve.A2;
import Ve.A7;
import Ve.C4238fb;
import Ve.C4409l9;
import Ve.C4612sa;
import Ve.C4825zo;
import Ve.I8;
import android.view.View;
import androidx.lifecycle.x0;
import kc0.C7645c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.abtool.presentation.features.recycler.BooleanAbToggleHolder;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH;
import ru.ozon.app.android.common.ui.actionCards.presentation.ActionCardWidgetViewHolder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingBannerView;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2View;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items.OrderProductViewHolder;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation.StickyPromoBannerView;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignVH;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantQuantView;
import ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerVH;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewHolder;
import ru.ozon.app.android.search.views.galleryswipeview.ImageViewHolder;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselCardView;
import ru.ozon.app.android.uikit.view.input.MobilizationSmsCodeEditText;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.bottom.FintechBottomSheetView;
import ru.ozon.fintech.ui.radio.RadioWrapperView;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import ru.ozon.uni.atoms.v3.containers.RecyclerContainer;
import tj.e;
import xe.C10727i;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9179b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9178a = i11;
        this.f9179b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9178a) {
            case 0:
                CancelPostingsV2ShipmentViewHolder._init_$lambda$0((CancelPostingsV2ShipmentViewHolder) this.f9179b, view);
                break;
            case 1:
                GeotrackingMapV2View.lambda$1$lambda$0((GeotrackingMapV2View) this.f9179b, view);
                break;
            case 2:
                OrderProductViewHolder._init_$lambda$0((OrderProductViewHolder) this.f9179b, view);
                break;
            case 3:
                StickyPromoBannerView._init_$lambda$7((StickyPromoBannerView) this.f9179b, view);
                break;
            case 4:
                SelectSellerVH._init_$lambda$0((SelectSellerVH) this.f9179b, view);
                break;
            case 5:
                ChipWrapper.setChipState$lambda$2((ChipWrapper) this.f9179b, view);
                break;
            case 6:
                PinPadFragment.u((PinPadFragment) this.f9179b);
                break;
            case 7:
                AspectCompactV2FooterWidgetViewHolder._init_$lambda$1((AspectCompactV2FooterWidgetViewHolder) this.f9179b, view);
                break;
            case 8:
                RecyclerContainer.AtomRecyclerListAdapter.ViewHolder._init_$lambda$0((RecyclerContainer.AtomRecyclerListAdapter.ViewHolder) this.f9179b, view);
                break;
            case 9:
                C4612sa this$0 = (C4612sa) this.f9179b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                A7 a72 = (A7) this$0.u();
                Object event = C4409l9.f31516a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (!event.equals(I8.f29221a)) {
                    if (event.equals(event)) {
                        C10727i.c(x0.a(a72), null, null, new A2(a72, null, 1), 3);
                        break;
                    }
                } else {
                    ((C4238fb) a72.f28585d).b(C4825zo.f32678a);
                    break;
                }
                break;
            case 10:
                OnBoardingBannerView.bind$lambda$2$lambda$1$lambda$0((Function0) this.f9179b, view);
                break;
            case 11:
                BooleanAbToggleHolder._init_$lambda$1((BooleanAbToggleHolder) this.f9179b, view);
                break;
            case 12:
                SmsSignVH._init_$lambda$1((SmsSignVH) this.f9179b, view);
                break;
            case 13:
                CartQuantQuantView.bindMinusPlus$lambda$4((CartQuantQuantView) this.f9179b, view);
                break;
            case 14:
                ActionCardWidgetViewHolder.lambda$1$lambda$0((ActionCardWidgetViewHolder) this.f9179b, view);
                break;
            case 15:
                C7645c.x((C7645c) this.f9179b);
                break;
            case 16:
                ImageViewHolder._init_$lambda$0((ImageViewHolder) this.f9179b, view);
                break;
            case 17:
                x.t((x) this.f9179b);
                break;
            case 18:
                BankAccountStatusWidgetVH.lambda$2$lambda$1((BankAccountStatusWidgetVH) this.f9179b, view);
                break;
            case 19:
                FintechBottomSheetView.lambda$2$lambda$1((FintechBottomSheetView) this.f9179b, view);
                break;
            case 20:
                RadioWrapperView.clickListener$lambda$1((RadioWrapperView) this.f9179b, view);
                break;
            case 21:
                ServicePackageCarouselCardView._init_$lambda$7((ServicePackageCarouselCardView) this.f9179b, view);
                break;
            case 22:
                e.w((e) this.f9179b);
                break;
            case 23:
                ComplexRouteItemView.setUpDateView$lambda$21$lambda$20((ComplexRouteItemView) this.f9179b, view);
                break;
            case 24:
                ((OTPWidgetViewHolder) this.f9179b).retryRequestNewCode();
                break;
            default:
                MobilizationSmsCodeEditText._init_$lambda$4((MobilizationSmsCodeEditText) this.f9179b, view);
                break;
        }
    }
}
