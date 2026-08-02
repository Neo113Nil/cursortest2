package J7;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class d {
    @NonNull
    public static h a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new h(new k(context));
    }
}
