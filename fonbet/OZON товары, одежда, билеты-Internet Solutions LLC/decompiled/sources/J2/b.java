package J2;

import C2.C2711f;
import C2.r;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarWidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;
import w2.C10416g;
import w3.i;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13686c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f13684a = i11;
        this.f13685b = obj;
        this.f13686c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13684a) {
            case 0:
                a this$0 = (a) this.f13685b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                M exception = (M) this.f13686c;
                Intrinsics.checkNotNullParameter(exception, "$exception");
                this$0.l().a(exception.f71787a);
                return;
            case 1:
                K2.a this$02 = (K2.a) this.f13685b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                C2711f response = (C2711f) this.f13686c;
                Intrinsics.checkNotNullParameter(response, "$response");
                r rVar = this$02.f15113f;
                if (rVar != null) {
                    rVar.onResult(response);
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 2:
                TravelScrollPriceCalendarWidgetViewHolder.scrollToSelectedItem$lambda$7$lambda$6$lambda$5((RecyclerView) this.f13685b, (Integer) this.f13686c);
                return;
            case 3:
                StickyBubbleViewHolder.shrinkBubble$lambda$14$lambda$13((StickyBubbleView) this.f13685b, (StickyBubbleViewHolder) this.f13686c);
                return;
            case 4:
                OzonSelectActivity.hideSplash$lambda$3((C10416g) this.f13685b, (Function0) this.f13686c);
                return;
            case 5:
                p.a((p) this.f13685b, (View[]) this.f13686c);
                return;
            default:
                i.a aVar = (i.a) this.f13685b;
                ((i) this.f13686c).V(aVar.f103476a, aVar.f103477b);
                return;
        }
    }
}
