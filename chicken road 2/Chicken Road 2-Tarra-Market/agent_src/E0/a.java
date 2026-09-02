package E0;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager f(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange o(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void q() {
    }
}
