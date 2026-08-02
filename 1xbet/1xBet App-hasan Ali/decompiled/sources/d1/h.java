package d1;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static LocaleList b(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols c(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList d(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void e(Notification.Action.Builder builder, boolean z3) {
        builder.setAllowGeneratedReplies(z3);
    }

    public static void f(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
