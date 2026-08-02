package AP;

import android.view.View;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingBottomOffsetDecorator;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.PageModifier;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky.TotalPriceWithButtonV2StickyWidgetViewHolder;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f654b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f653a = i11;
        this.f654b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f653a) {
            case 0:
                TotalPriceWithButtonV2StickyWidgetViewHolder.layoutChangeListener$lambda$0((TotalPriceWithButtonV2StickyWidgetViewHolder) this.f654b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            case 1:
                PageModifier.setup$lambda$8((GeotrackingBottomOffsetDecorator) this.f654b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            case 2:
                RelatedProductsBottomSheetView.layoutChangeListener$lambda$5((RelatedProductsBottomSheetView) this.f654b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            default:
                MobilizationTextInputLayout.updateLayout$default((MobilizationTextInputLayout) this.f654b, false, 1, null);
                break;
        }
    }
}
