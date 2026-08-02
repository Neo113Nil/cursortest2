package Lg0;

import androidx.fragment.app.G;
import androidx.lifecycle.J;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.start.dialog.AppProtectionAppDialogConfig;

/* loaded from: classes7.dex */
public interface c {

    public static final class a {
        @NotNull
        public static Ng0.a a(@NotNull AppProtectionAppDialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Ng0.a(new b(config));
        }
    }

    void a(@NotNull J j11, @NotNull Function0<? extends G> function0);
}
