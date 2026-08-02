package FH;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainWidgetHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        z11 = DeliveryComplainWidgetHolder.touchListener$lambda$0(view, motionEvent);
        return z11;
    }
}
