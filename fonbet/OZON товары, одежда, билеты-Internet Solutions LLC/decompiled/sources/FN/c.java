package FN;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean disableTouchAndShowLoader$lambda$1;
        disableTouchAndShowLoader$lambda$1 = HotelsBookTotalV3StickyContainerView.disableTouchAndShowLoader$lambda$1(view, motionEvent);
        return disableTouchAndShowLoader$lambda$1;
    }
}
