package Gk0;

import a7.b;
import com.google.android.gms.tasks.Task;
import io.reactivex.InterfaceC7095c;
import io.reactivex.e;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import nl0.InterfaceC8605e;
import ru.ozon.app.android.checkoutgeo.location.GoogleLocationDataSourceImpl;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.view.NotificationBarContainerView;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import u3.InterfaceC9928b;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements NotificationBarContainerView.DismissDirectionalCallback, b.a, e, InterfaceC8605e, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10281a;

    public /* synthetic */ b(Object obj) {
        this.f10281a = obj;
    }

    @Override // io.reactivex.e
    public void a(InterfaceC7095c interfaceC7095c) {
        GoogleLocationDataSourceImpl.asCompletable$lambda$7((Task) this.f10281a, interfaceC7095c);
    }

    public void b(NotificationBarContainerView.DismissDirection dismissDirection) {
        NotificationBar.showView$lambda$10$lambda$9((NotificationBar) this.f10281a, dismissDirection);
    }

    @Override // nl0.InterfaceC8605e
    public void c(ru.rustore.sdk.activitylauncher.a launcherResult) {
        Intrinsics.checkNotNullParameter(launcherResult, "launcherResult");
        boolean equals = launcherResult instanceof a.d ? true : launcherResult.equals(a.e.f97952b) ? true : launcherResult.equals(a.f.f97953b) ? true : launcherResult.equals(a.C2157a.f97948b);
        lm0.e eVar = (lm0.e) this.f10281a;
        if (equals) {
            eVar.a(new RuStoreInstallException(launcherResult.a()));
            return;
        }
        if (launcherResult.equals(a.b.f97949b) ? true : launcherResult.equals(a.c.f97950b)) {
            eVar.b(Integer.valueOf(launcherResult.a()));
        }
    }

    @Override // a7.b.a
    public Object execute() {
        return Integer.valueOf(((Z6.d) this.f10281a).i());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).onPlayerReleased((InterfaceC9928b.a) this.f10281a);
    }
}
