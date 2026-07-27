package A0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import s0.s;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(Service service, int i2, Notification notification, int i3) {
        try {
            service.startForeground(i2, notification, i3);
        } catch (ForegroundServiceStartNotAllowedException e3) {
            s d6 = s.d();
            String str = SystemForegroundService.f4746f;
            if (d6.f11793a <= 5) {
                Log.w(str, "Unable to start foreground service", e3);
            }
        }
    }
}
