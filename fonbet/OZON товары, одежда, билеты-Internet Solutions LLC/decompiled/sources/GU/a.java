package GU;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.monetization.widgets.overlayButton.core.OverlayButtonViewMapper;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonViewGroup;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;
import ru.ozon.app.android.ugc.core.databinding.ItemReviewCommentInputBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentInputV3NoUiViewMapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9845b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9844a = i11;
        this.f9845b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$0;
        View createHolder$lambda$12;
        switch (this.f9844a) {
            case 0:
                createHolder$lambda$1 = CommentInputV3NoUiViewMapper.createHolder$lambda$1((ItemReviewCommentInputBinding) this.f9845b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$0 = OverlayButtonViewMapper.createHolder$lambda$0((OverlayButtonViewGroup) this.f9845b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            default:
                createHolder$lambda$12 = SelectCancelReasonStickyViewMapper.createHolder$lambda$1((ViewGroup) this.f9845b, (LinearLayout) viewGroup);
                return createHolder$lambda$12;
        }
    }
}
