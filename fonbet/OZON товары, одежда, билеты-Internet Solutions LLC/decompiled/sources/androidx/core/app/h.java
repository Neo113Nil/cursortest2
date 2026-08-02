package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class h {

    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    @NonNull
    public static androidx.core.os.i a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.i.b(e.b(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? androidx.core.os.i.j(a.a(systemService)) : androidx.core.os.i.e();
    }
}
