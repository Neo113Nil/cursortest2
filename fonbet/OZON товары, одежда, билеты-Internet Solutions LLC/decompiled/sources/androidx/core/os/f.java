package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(@NonNull Configuration configuration, @NonNull i iVar) {
            configuration.setLocales((LocaleList) iVar.i());
        }
    }

    @NonNull
    public static i a(@NonNull Configuration configuration) {
        return i.j(a.a(configuration));
    }

    public static void b(@NonNull Configuration configuration, @NonNull i iVar) {
        a.b(configuration, iVar);
    }
}
