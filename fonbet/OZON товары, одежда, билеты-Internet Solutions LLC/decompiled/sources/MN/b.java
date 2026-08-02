package MN;

import android.view.MotionEvent;
import android.view.View;
import d20.AbstractC6065b;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputWidgetViewHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC6065b f17728b;

    public /* synthetic */ b(AbstractC6065b abstractC6065b, int i11) {
        this.f17727a = i11;
        this.f17728b = abstractC6065b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean lambda$3$lambda$2;
        switch (this.f17727a) {
            case 0:
                z11 = PassengersDirectoryV3InputWidgetViewHolder.touchListener$lambda$0((PassengersDirectoryV3InputWidgetViewHolder) this.f17728b, view, motionEvent);
                return z11;
            default:
                lambda$3$lambda$2 = ButtonsViewHolder.lambda$3$lambda$2((ButtonsViewHolder) this.f17728b, view, motionEvent);
                return lambda$3$lambda$2;
        }
    }
}
