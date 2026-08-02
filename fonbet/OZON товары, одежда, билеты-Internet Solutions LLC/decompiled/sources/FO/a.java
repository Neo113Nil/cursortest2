package FO;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.util.EmptyStateV3ShowLoaderHelperKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean showLoader$lambda$2$lambda$0;
        showLoader$lambda$2$lambda$0 = EmptyStateV3ShowLoaderHelperKt.showLoader$lambda$2$lambda$0(view, motionEvent);
        return showLoader$lambda$2$lambda$0;
    }
}
