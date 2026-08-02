package Lw;

import android.view.View;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.AddressSelectorFieldVH;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler.PriceActionsRecyclerAdapter;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionVO;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionWidgetViewHolder;

/* renamed from: Lw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3598a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17174c;

    public /* synthetic */ ViewOnClickListenerC3598a(int i11, Object obj, Object obj2) {
        this.f17172a = i11;
        this.f17173b = obj;
        this.f17174c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17172a) {
            case 0:
                BindableViewHolder.bind$lambda$0((BindableViewHolder) this.f17173b, (WiseSkuScrollElement) this.f17174c, view);
                break;
            case 1:
                AddressSelectorFieldVH.AddressSuggestsAdapter.SuggestVH._init_$lambda$0((AddressSelectorFieldVH.AddressSuggestsAdapter) this.f17173b, (AddressSelectorFieldVH.AddressSuggestsAdapter.SuggestVH) this.f17174c, view);
                break;
            case 2:
                ServicePackageSelectionWidgetViewHolder.bindTabs$lambda$8$lambda$7$lambda$6$lambda$5((ServicePackageSelectionVO.PackageTabVO) this.f17173b, (ServicePackageSelectionWidgetViewHolder) this.f17174c, view);
                break;
            case 3:
                MainDrawMajorScreenViewHolder.bind$lambda$0((MainDrawMajorScreenVO) this.f17173b, (MainDrawMajorScreenViewHolder) this.f17174c, view);
                break;
            case 4:
                CouponBlockViewHolder.bind$lambda$3$lambda$1((CouponBlockViewHolder) this.f17173b, (BaseCouponVO) this.f17174c, view);
                break;
            default:
                PriceActionsRecyclerAdapter.onBindViewHolder$lambda$1$lambda$0((PriceActionsRecyclerAdapter) this.f17173b, (PriceActionsVO.Action) this.f17174c, view);
                break;
        }
    }
}
