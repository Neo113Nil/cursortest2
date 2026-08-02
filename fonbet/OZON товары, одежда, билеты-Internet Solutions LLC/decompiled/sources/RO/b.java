package RO;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean showLoader$lambda$11;
        showLoader$lambda$11 = MilesForBuyersView.showLoader$lambda$11(view, motionEvent);
        return showLoader$lambda$11;
    }
}
