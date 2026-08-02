package L3;

import L3.L;
import androidx.recyclerview.widget.RecyclerView;
import d0.InterfaceC6000k;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderWidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerWidgetVH;

/* loaded from: classes8.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16422b;

    public /* synthetic */ p(Object obj, int i11) {
        this.f16421a = i11;
        this.f16422b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16421a) {
            case 0:
                ((L.a) this.f16422b).e();
                break;
            case 1:
                MediaPickerWidgetVH.updateAttaches$lambda$21$lambda$20((MediaPickerWidgetVH) this.f16422b);
                break;
            case 2:
                ((InterfaceC6000k) this.f16422b).getClass();
                break;
            case 3:
                H30.m.c((androidx.appcompat.app.g) ((androidx.fragment.app.r) this.f16422b));
                break;
            case 4:
                ((RecyclerView) this.f16422b).scrollToPosition(0);
                break;
            default:
                ((BonusExpirationRemainderWidgetViewHolder) this.f16422b).animationIsNotRunning = false;
                break;
        }
    }
}
