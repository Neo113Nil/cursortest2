package Dy;

import android.view.View;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.atom2.LabelsAtom;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.RadioViewHolder;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewHolder;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.selector.SwitchButtonsLayout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.BaseImageTitleVariantV2ViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.ImageTitleVariantV2Adapter;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleInCartQuantViewImpl;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainViewV4;
import ru.ozon.app.android.search.catalog.components.meta.MetaVO;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewHolder;
import ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorVO;
import ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorViewHolder;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonSelectorInputView;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionTileView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;
import ru.ozon.id.nativeauth.main.ErrorView;

/* renamed from: Dy.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2883a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6790c;

    public /* synthetic */ ViewOnClickListenerC2883a(int i11, Object obj, Object obj2) {
        this.f6788a = i11;
        this.f6789b = obj;
        this.f6790c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6788a) {
            case 0:
                SwitchButtonsLayout.createItems$lambda$1$lambda$0((InterfaceC6511n) this.f6789b, (AddressEditMapVO.Selector) this.f6790c, view);
                break;
            case 1:
                ControlsV3ViewHolder.bind$lambda$2$lambda$0((ControlsV3ViewHolder) this.f6789b, (ControlsV3VO) this.f6790c, view);
                break;
            case 2:
                OrderItemViewHolder._init_$lambda$1((OrderItemViewHolder) this.f6789b, (Function1) this.f6790c, view);
                break;
            case 3:
                ErrorView.c((Function0) this.f6789b, (ErrorView) this.f6790c);
                break;
            case 4:
                SearchResultErrorViewHolder.bind$lambda$1$lambda$0((SearchResultErrorVO) this.f6789b, (SearchResultErrorViewHolder) this.f6790c, view);
                break;
            case 5:
                SelectionTileView.bind$lambda$4((SelectionsListVI.SelectionsListItemVI.TileItem) this.f6789b, (Function1) this.f6790c, view);
                break;
            case 6:
                LabelsAtom.Element.TextLabel.bind$lambda$2((Labels.Label) this.f6789b, (LabelsAtom.Element.TextLabel) this.f6790c, view);
                break;
            case 7:
                MetaWidgetViewHolder.bind$lambda$5$lambda$4((MetaWidgetViewHolder) this.f6789b, (MetaVO) this.f6790c, view);
                break;
            case 8:
                CommonSelectorInputView.bind$lambda$3$lambda$2((Function1) this.f6789b, (CommonInputVO.Selector) this.f6790c, view);
                break;
            case 9:
                ProductPickerSearchAdapter.onCreateViewHolder$lambda$4$lambda$3$lambda$2((ProductPickerSearchAdapter) this.f6789b, (RadioViewHolder) this.f6790c, view);
                break;
            case 10:
                DoubleInCartQuantViewImpl.bindMinusPlus$lambda$4$lambda$2((DoubleInCartQuantViewImpl) this.f6789b, (DoubleCartQuantVO.CartMode) this.f6790c, view);
                break;
            case 11:
                ImageTitleVariantV2Adapter.onCreateViewHolder$lambda$3$lambda$2((BaseImageTitleVariantV2ViewHolder) this.f6789b, (ImageTitleVariantV2Adapter) this.f6790c, view);
                break;
            case 12:
                PlainViewV4.bind$lambda$2$lambda$1((PlainVO) this.f6789b, (PlainViewV4) this.f6790c, view);
                break;
            default:
                CellWithSubtitleCounterView.onClickListener$lambda$4((CellWithSubtitleCounterView) this.f6789b, (Function0) this.f6790c, view);
                break;
        }
    }
}
