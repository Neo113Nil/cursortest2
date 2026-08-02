package H30;

import C.C2702w;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {
    public static final boolean a(@NotNull Context context) {
        float f7;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            f7 = ValueAnimator.getDurationScale();
        } else {
            try {
                f7 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            } catch (Exception unused) {
                f7 = 1.0f;
            }
        }
        return !(f7 == 0.0f);
    }

    public static final void b(@NotNull Context context, @NotNull String label, @NotNull String textToCopy) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(textToCopy, "textToCopy");
        ClipData newPlainText = ClipData.newPlainText(label, textToCopy);
        Object systemService = context.getApplicationContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public static final void c(@NotNull Context context, @NotNull String text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Toast.makeText(context.getApplicationContext(), text, 0).show();
    }

    public static final boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean e(@NotNull l80.f fVar, @NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        boolean d11 = d(fVar);
        boolean z11 = prefs.getBoolean("is_dark_theme_active", d11);
        C2702w.e(prefs, "is_dark_theme_active", d11);
        return z11 != d11;
    }
}
