package Ao;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2WidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.WidgetPaymentInfoV2View;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.DebouncedTextWatcher;
import ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListVO;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListView;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1252c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f1250a = i11;
        this.f1251b = obj;
        this.f1252c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1250a) {
            case 0:
                PaymentInfoV2WidgetViewHolder.bind$lambda$4$lambda$3((PaymentInfoV2WidgetViewHolder) this.f1251b, (WidgetPaymentInfoV2View) this.f1252c);
                break;
            case 1:
                ProductStarsTileView.updateUserStars$lambda$6$lambda$4((ProductStarsTileView) this.f1251b, (Drawable) this.f1252c);
                break;
            case 2:
                DebouncedTextWatcher.afterTextChanged$lambda$0((DebouncedTextWatcher) this.f1251b, (Editable) this.f1252c);
                break;
            default:
                ((QuickFiltersRowListView) this.f1251b).bindOrGoneFilterControls((QuickFiltersRowListVO) this.f1252c);
                break;
        }
    }
}
