package AG;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewMapper.ConfirmDateButtonViewMapper;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewMapper.StickyViewMapper;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f622b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f621a = i11;
        this.f622b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$0;
        View createHolder$lambda$2;
        switch (this.f621a) {
            case 0:
                createHolder$lambda$1 = SelectCancelReasonStickyViewMapper.createHolder$lambda$1((ViewGroup) this.f622b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$0 = StickyViewMapper.createHolder$lambda$0((VerticalAtomsLayout) this.f622b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            default:
                createHolder$lambda$2 = ConfirmDateButtonViewMapper.createHolder$lambda$2((i) this.f622b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
        }
    }
}
