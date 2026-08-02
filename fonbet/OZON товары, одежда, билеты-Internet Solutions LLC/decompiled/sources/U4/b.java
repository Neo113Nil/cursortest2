package U4;

import android.os.Trace;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class b {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(int i11, @NonNull String str) {
        Trace.setCounter(str, i11);
    }
}
