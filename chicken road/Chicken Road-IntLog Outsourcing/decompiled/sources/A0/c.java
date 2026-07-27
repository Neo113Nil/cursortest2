package A0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f17b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f19d;

    public c(SystemForegroundService systemForegroundService, int i2, Notification notification, int i3) {
        this.f19d = systemForegroundService;
        this.f16a = i2;
        this.f17b = notification;
        this.f18c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f18c;
        Notification notification = this.f17b;
        int i6 = this.f16a;
        SystemForegroundService systemForegroundService = this.f19d;
        if (i2 >= 31) {
            g.a(systemForegroundService, i6, notification, i3);
        } else if (i2 >= 29) {
            f.a(systemForegroundService, i6, notification, i3);
        } else {
            systemForegroundService.startForeground(i6, notification);
        }
    }
}
