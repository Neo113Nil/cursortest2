package XV;

import androidx.lifecycle.W;
import ru.ozon.app.android.cscore.payment.configurators.AddUserCardConfigurator;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerWidgetVH;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34209b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f34208a = i11;
        this.f34209b = obj;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f34208a) {
            case 0:
                MediaPickerWidgetVH.uploadErrorEventObserver$lambda$9((MediaPickerWidgetVH) this.f34209b, obj);
                break;
            default:
                AddUserCardConfigurator.onComposerInitialized$lambda$1((AddUserCardConfigurator) this.f34209b, (SelectPaymentViewModel.Action) obj);
                break;
        }
    }
}
