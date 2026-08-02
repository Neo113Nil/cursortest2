package LG;

import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.J;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarWidgetViewHolder;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder.ReturnCreationItemViewHolder;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f16640b;

    public /* synthetic */ a(J j11, int i11) {
        this.f16639a = i11;
        this.f16640b = j11;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean actionSelectTouchListener$lambda$0;
        boolean lambda$3$lambda$1;
        boolean _init_$lambda$4;
        switch (this.f16639a) {
            case 0:
                actionSelectTouchListener$lambda$0 = ReturnCreationItemViewHolder.actionSelectTouchListener$lambda$0((ReturnCreationItemViewHolder) this.f16640b, view, motionEvent);
                return actionSelectTouchListener$lambda$0;
            case 1:
                lambda$3$lambda$1 = ButtonsViewHolder.lambda$3$lambda$1((ButtonsViewHolder) this.f16640b, view, motionEvent);
                return lambda$3$lambda$1;
            default:
                _init_$lambda$4 = NavBarWidgetViewHolder._init_$lambda$4((NavBarWidgetViewHolder) this.f16640b, view, motionEvent);
                return _init_$lambda$4;
        }
    }
}
