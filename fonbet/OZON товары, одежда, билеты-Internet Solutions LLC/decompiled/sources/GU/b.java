package GU;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2OverlayWidgetViewMapper;
import ru.ozon.app.android.cs_orders.databinding.WidgetActionButtonBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsHeaderV3NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderView;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9847b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f9846a = i11;
        this.f9847b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        switch (this.f9846a) {
            case 0:
                createHolder$lambda$1 = CommentsHeaderV3NoUiViewMapper.createHolder$lambda$1((CommentsHeaderView) this.f9847b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$12 = ActionButtonV2OverlayWidgetViewMapper.createHolder$lambda$1((WidgetActionButtonBinding) this.f9847b, (LinearLayout) viewGroup);
                return createHolder$lambda$12;
        }
    }
}
