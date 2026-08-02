package V4;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f28070a = true;

    static void a(@NonNull ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z11);
        } else if (f28070a) {
            try {
                viewGroup.suppressLayout(z11);
            } catch (NoSuchMethodError unused) {
                f28070a = false;
            }
        }
    }
}
