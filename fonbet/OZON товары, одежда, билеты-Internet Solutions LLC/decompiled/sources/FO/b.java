package FO;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.util.EmptyStateV3ShowLoaderHelperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.view.PriceCalendarFooterV3View;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9198a;

    public /* synthetic */ b(int i11) {
        this.f9198a = i11;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean showLoader$lambda$2$lambda$1;
        boolean render$lambda$2$lambda$1;
        boolean showLoader$lambda$7$lambda$6;
        switch (this.f9198a) {
            case 0:
                showLoader$lambda$2$lambda$1 = EmptyStateV3ShowLoaderHelperKt.showLoader$lambda$2$lambda$1(view, motionEvent);
                return showLoader$lambda$2$lambda$1;
            case 1:
                render$lambda$2$lambda$1 = NotificationSubscriptionBannerWidgetViewHolder.render$lambda$2$lambda$1(view, motionEvent);
                return render$lambda$2$lambda$1;
            default:
                showLoader$lambda$7$lambda$6 = PriceCalendarFooterV3View.showLoader$lambda$7$lambda$6(view, motionEvent);
                return showLoader$lambda$7$lambda$6;
        }
    }
}
