package HQ;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.presentation.TravelNotificationModalCheckNoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedRoundedBottomViewMapper;
import ru.ozon.app.android.ugc.widgets.additionalReview.core.AdditionalReviewNoUIViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10747a;

    public /* synthetic */ a(int i11) {
        this.f10747a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View createHolder$lambda$02;
        View createHolder$lambda$2;
        View createHolder$lambda$1;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f10747a) {
            case 0:
                createHolder$lambda$0 = TravelNotificationModalCheckNoUiViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            case 1:
                createHolder$lambda$02 = AdditionalReviewNoUIViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$02;
            case 2:
                createHolder$lambda$2 = ReviewGalleryFeedRoundedBottomViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$1 = ButtonWithInformationV2ViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
        }
    }
}
