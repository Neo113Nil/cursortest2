package SQ;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.sticky.ButtonsBarStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26072a;

    public /* synthetic */ a(int i11) {
        this.f26072a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f26072a) {
            case 0:
                createHolder$lambda$1 = ButtonsBarStickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$12 = InfoPopupV4StickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
        }
    }
}
