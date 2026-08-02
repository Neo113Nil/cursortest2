package N;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel f(String str, CharSequence charSequence) {
        return new NotificationChannel(str, charSequence, 2);
    }

    public static /* bridge */ /* synthetic */ AutofillManager l(Object obj) {
        return (AutofillManager) obj;
    }
}
