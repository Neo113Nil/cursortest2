package B90;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityTracker;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewHolder;
import ru.ozon.uni.android.flashbar.view.FlashbarContainerView;

/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3149b;

    public /* synthetic */ f0(Object obj, int i11) {
        this.f3148a = i11;
        this.f3149b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3148a) {
            case 0:
                v0.f0((v0) this.f3149b);
                break;
            case 1:
                FlashbarContainerView.dismissRunnable$lambda$0((FlashbarContainerView) this.f3149b);
                break;
            case 2:
                L2.a.h((L2.a) this.f3149b);
                break;
            case 3:
                ((MarqueeItemVisibilityTracker) this.f3149b).updateMostVisibleHolder();
                break;
            case 4:
                ((RecyclerView) this.f3149b).scrollToPosition(0);
                break;
            case 5:
                ((Function0) this.f3149b).invoke();
                break;
            case 6:
                f50.b.u((f50.b) this.f3149b);
                break;
            case 7:
                HotTicketsWidgetViewHolder.bindLoadedState$lambda$6$lambda$5$lambda$4((HotTicketsWidgetViewHolder) this.f3149b);
                break;
            default:
                ru.ozon.android.messenger.blocks.chat.common.j.a((ru.ozon.android.messenger.blocks.chat.common.j) this.f3149b);
                break;
        }
    }
}
