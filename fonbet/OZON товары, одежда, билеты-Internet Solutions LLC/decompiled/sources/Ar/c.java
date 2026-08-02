package Ar;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.abtool.presentation.debug.AbDebugFragment;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorWidgetViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.TailCarriageViewHolder;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopViewHolder;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleBlockItemView;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VH;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.uni.atoms.v3.holders.buttons.GetButtonHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1264b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f1263a = i11;
        this.f1264b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1263a) {
            case 0:
                ThemeSelectorWidgetViewHolder.lambda$3$lambda$2((ThemeSelectorWidgetViewHolder) this.f1264b, view);
                break;
            case 1:
                PriceV4TopViewHolder._init_$lambda$0((PriceV4TopViewHolder) this.f1264b, view);
                break;
            case 2:
                GalleryFullViewPinchToZoomTouchListener.startZooming$lambda$11$lambda$10((GalleryFullViewPinchToZoomTouchListener) this.f1264b, view);
                break;
            case 3:
                PinPadFragment.x((PinPadFragment) this.f1264b);
                break;
            case 4:
                ((TextInputFilterViewHolder) this.f1264b).onTitleClick();
                break;
            case 5:
                AdditionalReviewV2VH.lambda$1$lambda$0((AdditionalReviewV2VH) this.f1264b, view);
                break;
            case 6:
                GetButtonHolder._init_$lambda$1((GetButtonHolder) this.f1264b, view);
                break;
            case 7:
                AbDebugFragment.onViewCreated$lambda$1$lambda$0((AbDebugFragment) this.f1264b, view);
                break;
            case 8:
                FinRadioButtonView._init_$lambda$0((FinRadioButtonView) this.f1264b, view);
                break;
            case 9:
                DeliveryWidgetV3View.bindDeliveryIcon$lambda$29$lambda$28((Function0) this.f1264b, view);
                break;
            case 10:
                CoupleBlockItemView._init_$lambda$8((CoupleBlockItemView) this.f1264b, view);
                break;
            case 11:
                TailCarriageViewHolder._init_$lambda$1((TailCarriageViewHolder) this.f1264b, view);
                break;
            case 12:
                ExpressNavigationSliderV2ItemsViewHolder._init_$lambda$1((ExpressNavigationSliderV2ItemsViewHolder) this.f1264b, view);
                break;
            default:
                FinToolbarView.lambda$1$lambda$0((FinToolbarView) this.f1264b, view);
                break;
        }
    }
}
