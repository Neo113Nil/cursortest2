package L3;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.view.ViewGroup;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder;

/* loaded from: classes8.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16378b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f16377a = i11;
        this.f16378b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16377a) {
            case 0:
                o.a((o) this.f16378b);
                break;
            case 1:
                GalleryV3ViewHolder.otherButtonsRunnable$lambda$1((GalleryV3ViewHolder) this.f16378b);
                break;
            case 2:
                O0.r.a((O0.r) this.f16378b);
                break;
            case 3:
                H30.m.a((androidx.appcompat.app.g) ((androidx.fragment.app.r) this.f16378b));
                break;
            case 4:
                EnableNotificationsSnackbarWidgetViewHolder.dismissNotification$lambda$1((EnableNotificationsSnackbarWidgetViewHolder) this.f16378b);
                break;
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.f16378b;
                if (viewGroup.isAttachedToWindow()) {
                    viewGroup.requestLayout();
                    break;
                }
                break;
            default:
                Context context = (Context) this.f16378b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    Intent makeRestartActivityTask = Intent.makeRestartActivityTask(launchIntentForPackage.getComponent());
                    Thread.sleep(300L);
                    context.startActivity(makeRestartActivityTask);
                    Process.killProcess(Process.myPid());
                    break;
                }
                break;
        }
    }
}
