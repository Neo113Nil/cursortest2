package UA;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        z11 = SelectCancelReasonViewHolder.touchListener$lambda$4(view, motionEvent);
        return z11;
    }
}
