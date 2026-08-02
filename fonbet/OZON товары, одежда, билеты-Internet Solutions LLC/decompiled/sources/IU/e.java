package IU;

import D2.o;
import androidx.camera.core.impl.O0;
import androidx.work.impl.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.C5942x;
import g5.C6643p;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorViewHolder;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarWidgetViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12117c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f12115a = i11;
        this.f12116b = obj;
        this.f12117c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12115a) {
            case 0:
                CommentsListViewImpl.loadItems$lambda$4((String) this.f12116b, (CommentsListViewImpl) this.f12117c);
                break;
            case 1:
                M2.a this$0 = (M2.a) this.f12116b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o e11 = (o) this.f12117c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.m().a(e11);
                break;
            case 2:
                TabSelectorViewHolder.updateTabsContent$lambda$5$lambda$4$lambda$3((TabSelectorViewHolder) this.f12116b, (TabLayout.e) this.f12117c);
                break;
            case 3:
                OrderNavBarWidgetViewHolder.configAppBar$lambda$8$lambda$4$lambda$3((OrderNavBarWidgetViewHolder) this.f12116b, (AppBarLayout) this.f12117c);
                break;
            case 4:
                ((p) this.f12116b).b((C6643p) this.f12117c, false);
                break;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12117c;
                C5942x c5942x = (C5942x) this.f12116b;
                c5942x.getClass();
                try {
                    taskCompletionSource.setResult(c5942x.c());
                    break;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            default:
                ((O0.d) this.f12116b).a((O0) this.f12117c, O0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                break;
        }
    }
}
