package Dc0;

import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarWidgetViewHolder;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6495d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i11) {
        this.f6492a = i11;
        this.f6493b = obj;
        this.f6494c = obj2;
        this.f6495d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6492a) {
            case 0:
                q.E((com.google.common.util.concurrent.m) this.f6493b, (Fc0.b) this.f6494c, (q) this.f6495d);
                break;
            default:
                EnableNotificationsSnackbarWidgetViewHolder.bind$lambda$0((EnableNotificationsSnackbarWidgetViewHolder) this.f6493b, (NotificationLayoutManager) this.f6494c, (EnableNotificationsSnackbarVO) this.f6495d);
                break;
        }
    }
}
