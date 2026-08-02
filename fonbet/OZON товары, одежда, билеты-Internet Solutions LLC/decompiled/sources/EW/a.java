package EW;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3View;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterVH;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7713a;

    public /* synthetic */ a(int i11) {
        this.f7713a = i11;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bind$lambda$3$lambda$2;
        boolean updateButtonState$lambda$13;
        switch (this.f7713a) {
            case 0:
                bind$lambda$3$lambda$2 = ReviewsFilterVH.bind$lambda$3$lambda$2(view, motionEvent);
                return bind$lambda$3$lambda$2;
            default:
                updateButtonState$lambda$13 = NotificationSubscriptionBannerV3View.updateButtonState$lambda$13(view, motionEvent);
                return updateButtonState$lambda$13;
        }
    }
}
