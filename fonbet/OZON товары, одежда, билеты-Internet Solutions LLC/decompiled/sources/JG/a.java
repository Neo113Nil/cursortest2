package JG;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewHolder.ReturnCreationGroupViewHolder;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14278b;

    public /* synthetic */ a(int i11, k kVar) {
        this.f14277a = i11;
        this.f14278b = kVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean actionSelectTouchListener$lambda$0;
        boolean z11;
        switch (this.f14277a) {
            case 0:
                actionSelectTouchListener$lambda$0 = ReturnCreationGroupViewHolder.actionSelectTouchListener$lambda$0((ReturnCreationGroupViewHolder) this.f14278b, view, motionEvent);
                return actionSelectTouchListener$lambda$0;
            default:
                z11 = ParticipantPhoneViewHolder.touchListener$lambda$0((ParticipantPhoneViewHolder) this.f14278b, view, motionEvent);
                return z11;
        }
    }
}
