package OW;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.checkoutcomposer.celllist.presentation.sticky.CheckoutCellListStickyViewMapper;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonViewGroup;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonViewMapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f20159b;

    public /* synthetic */ a(ViewGroup viewGroup, int i11) {
        this.f20158a = i11;
        this.f20159b = viewGroup;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$1;
        switch (this.f20158a) {
            case 0:
                createHolder$lambda$2 = SelectionFormSubmitButtonViewMapper.createHolder$lambda$2((SelectionFormSubmitButtonViewGroup) this.f20159b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$1 = CheckoutCellListStickyViewMapper.createHolder$lambda$1((CheckoutCellListView) this.f20159b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
        }
    }
}
