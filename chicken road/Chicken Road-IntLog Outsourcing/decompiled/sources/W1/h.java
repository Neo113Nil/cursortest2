package W1;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ AutofillManager e(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue f(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
