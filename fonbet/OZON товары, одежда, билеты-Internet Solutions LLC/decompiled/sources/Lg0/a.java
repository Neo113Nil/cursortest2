package Lg0;

import android.app.Application;
import android.content.Intent;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface a {
    @NotNull
    Application getApplication();

    Mg0.a getCustomAlertDialogProvider();

    int getDialogThemeResId();

    @NotNull
    List<Intent> getPowerSettingsIntents();
}
