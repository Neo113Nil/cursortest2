package org.betup.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PushPermissionAfterBetHelper.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/betup/utils/PushPermissionAfterBetHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "PREFS_NAME", "", "KEY_EVER_SHOWN_EDUCATION", "KEY_BETS_SINCE_LAST_PROMPT", "LEGACY_PUSH_PERMISSION_REQUESTED_ONCE", "BETS_BETWEEN_PROMPTS", "", "shouldOfferPromptAfterBetPlaced", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "migrateLegacyIfNeeded", "", "prefs", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "isPostNotificationsGranted", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushPermissionAfterBetHelper {
    public static final int $stable = 0;
    public static final int BETS_BETWEEN_PROMPTS = 5;
    public static final PushPermissionAfterBetHelper INSTANCE = new PushPermissionAfterBetHelper();
    private static final String KEY_BETS_SINCE_LAST_PROMPT = "push_perm_bets_since_last_prompt";
    private static final String KEY_EVER_SHOWN_EDUCATION = "push_perm_edu_ever_shown";
    private static final String LEGACY_PUSH_PERMISSION_REQUESTED_ONCE = "push_permission_requested_after_real_bet";
    private static final String PREFS_NAME = "analytics";

    private PushPermissionAfterBetHelper() {
    }

    @JvmStatic
    public static final boolean shouldOfferPromptAfterBetPlaced(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SharedPreferences sharedPreferences = activity.getSharedPreferences(PREFS_NAME, 0);
        PushPermissionAfterBetHelper pushPermissionAfterBetHelper = INSTANCE;
        Intrinsics.checkNotNull(sharedPreferences);
        AppCompatActivity appCompatActivity = activity;
        pushPermissionAfterBetHelper.migrateLegacyIfNeeded(sharedPreferences, appCompatActivity);
        if (Build.VERSION.SDK_INT < 33 || pushPermissionAfterBetHelper.isPostNotificationsGranted(appCompatActivity)) {
            return false;
        }
        int i = sharedPreferences.getInt(KEY_BETS_SINCE_LAST_PROMPT, 0) + 1;
        sharedPreferences.edit().putInt(KEY_BETS_SINCE_LAST_PROMPT, i).apply();
        boolean z = !sharedPreferences.getBoolean(KEY_EVER_SHOWN_EDUCATION, false) || i >= 5;
        if (z) {
            sharedPreferences.edit().putBoolean(KEY_EVER_SHOWN_EDUCATION, true).putInt(KEY_BETS_SINCE_LAST_PROMPT, 0).apply();
        }
        return z;
    }

    private final void migrateLegacyIfNeeded(SharedPreferences prefs, Context context) {
        if (prefs.contains(LEGACY_PUSH_PERMISSION_REQUESTED_ONCE)) {
            boolean z = prefs.getBoolean(LEGACY_PUSH_PERMISSION_REQUESTED_ONCE, false);
            prefs.edit().remove(LEGACY_PUSH_PERMISSION_REQUESTED_ONCE).apply();
            if (z && Build.VERSION.SDK_INT >= 33 && !isPostNotificationsGranted(context)) {
                prefs.edit().putBoolean(KEY_EVER_SHOWN_EDUCATION, true).putInt(KEY_BETS_SINCE_LAST_PROMPT, 4).apply();
            }
        }
    }

    private final boolean isPostNotificationsGranted(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }
}
