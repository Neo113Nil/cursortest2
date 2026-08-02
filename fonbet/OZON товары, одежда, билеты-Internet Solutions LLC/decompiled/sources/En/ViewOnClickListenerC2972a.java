package En;

import GZ.g;
import android.view.View;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.CheckboxViewHolder;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation.AddLegalMobileViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleInCartQuantViewImpl;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

/* renamed from: En.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC2972a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8143c;

    public /* synthetic */ ViewOnClickListenerC2972a(int i11, Object obj, Object obj2) {
        this.f8141a = i11;
        this.f8142b = obj;
        this.f8143c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8141a) {
            case 0:
                ControlsV3ViewHolder.bind$lambda$2$lambda$1((ControlsV3ViewHolder) this.f8142b, (ControlsV3VO) this.f8143c, view);
                break;
            case 1:
                AddLegalMobileViewHolder._init_$lambda$1((AddLegalMobileViewHolder) this.f8142b, (g) this.f8143c, view);
                break;
            case 2:
                ProductPickerSearchAdapter.onCreateViewHolder$lambda$7$lambda$6$lambda$5((ProductPickerSearchAdapter) this.f8142b, (CheckboxViewHolder) this.f8143c, view);
                break;
            case 3:
                DoubleInCartQuantViewImpl.bindMinusPlus$lambda$4$lambda$3((DoubleInCartQuantViewImpl) this.f8142b, (DoubleCartQuantVO.CartMode) this.f8143c, view);
                break;
            case 4:
                ScreenStateViewWidget.setSecondaryButton$lambda$16$lambda$15$lambda$14((ScreenStateViewWidget) this.f8142b, (String) this.f8143c, view);
                break;
            case 5:
                DoubleInCartViewV4.bindMinusPlus$lambda$4$lambda$2((DoubleInCartViewV4) this.f8142b, (DoubleCartVO.CartMode) this.f8143c, view);
                break;
            default:
                CellWithSubtitleDefaultView.onClickListener$lambda$0((CellWithSubtitleDefaultView) this.f8142b, (Function0) this.f8143c, view);
                break;
        }
    }
}
