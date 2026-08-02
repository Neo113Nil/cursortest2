package G;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class f {

    private static class a {
        @NonNull
        static Context a(@NonNull Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    private static class b {
        @NonNull
        static Context a(int i11, @NonNull Context context) {
            return context.createDeviceContext(i11);
        }

        static int b(@NonNull Context context) {
            return context.getDeviceId();
        }
    }

    @NonNull
    public static Context a(@NonNull Context context) {
        int b11;
        Context applicationContext = context.getApplicationContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34 && (b11 = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(b11, applicationContext);
        }
        if (i11 >= 30) {
            String b12 = a.b(context);
            if (!Objects.equals(b12, a.b(applicationContext))) {
                return a.a(applicationContext, b12);
            }
        }
        return applicationContext;
    }
}
