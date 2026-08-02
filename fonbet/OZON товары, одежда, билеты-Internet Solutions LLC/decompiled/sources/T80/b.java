package T80;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b {
    boolean canStartOzonIdRecoveryFlow(Activity activity, String str);

    boolean gotoDeeplinkOnlyIntegration(@NotNull String str);

    void hideBottomNavigation(@NotNull Activity activity);

    void showBottomNavigation(@NotNull Activity activity);

    void startOzonIdSign(@NotNull Activity activity, String str, String str2);
}
