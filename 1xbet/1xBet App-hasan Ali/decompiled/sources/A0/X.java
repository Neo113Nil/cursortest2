package A0;

import android.app.NotificationChannel;
import android.view.autofill.AutofillId;
import java.lang.invoke.MethodHandles;

/* loaded from: classes.dex */
public abstract /* synthetic */ class X {
    public static /* synthetic */ NotificationChannel c(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* bridge */ /* synthetic */ AutofillId e(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup k(Object obj) {
        return (MethodHandles.Lookup) obj;
    }
}
