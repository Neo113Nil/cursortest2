package C;

import C.I;
import C.s0;
import android.app.job.JobParameters;
import android.view.Window;
import android.widget.TextView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.SellerSortSwitcherViewHolder;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarWidgetViewHolder;
import ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1;

/* loaded from: classes8.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4194c;

    public /* synthetic */ h0(int i11, Object obj, Object obj2) {
        this.f4192a = i11;
        this.f4193b = obj;
        this.f4194c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f4194c;
        Object obj2 = this.f4193b;
        switch (this.f4192a) {
            case 0:
                ((s0.e) obj2).c((s0.d) obj);
                return;
            case 1:
                D3.i iVar = (D3.i) obj2;
                iVar.getClass();
                ((ExoManagerWithCacheImpl$downloadVideo$1) obj).onPrepared(iVar, false);
                return;
            case 2:
                E.d0 d0Var = (E.d0) obj2;
                d0Var.e();
                if (!(d0Var.g() != null)) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                I.f g10 = d0Var.g();
                Objects.requireNonNull(g10);
                g10.onError((K) obj);
                return;
            case 3:
                J2.a this$0 = (J2.a) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C2.h0 response = (C2.h0) obj;
                Intrinsics.checkNotNullParameter(response, "$response");
                this$0.l().onResult(response);
                return;
            case 4:
                K2.a this$02 = (K2.a) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                D2.g e11 = (D2.g) obj;
                Intrinsics.checkNotNullParameter(e11, "$e");
                C2.r rVar = this$02.f15113f;
                if (rVar != null) {
                    rVar.a(e11);
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 5:
                L30.i.a((Window) obj2, (L30.i) obj);
                return;
            case 6:
                FreshNavigationFragment.handleRedirect$lambda$1((FreshNavigationFragment) obj2, (String) obj);
                return;
            case 7:
                TravelScrollPriceCalendarWidgetViewHolder.bind$lambda$1((TravelScrollPriceCalendarWidgetViewHolder) obj2, (TravelScrollPriceCalendarVO) obj);
                return;
            case 8:
                SellerSortSwitcherViewHolder.updateMaxLines$lambda$7((SellerSortSwitcherViewHolder) obj2, (TextView) obj);
                return;
            default:
                int i11 = JobInfoSchedulerService.f57797a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
        }
    }
}
