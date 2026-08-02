package org.betup.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SignInDialogManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/utils/SignInDialogManager;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "PREF_KEY_LAST_SHOWN_UID", "", "PREF_KEY_DIALOG_SHOWN", "getAppContext", "Landroid/content/Context;", "shouldShowDialog", "", "userService", "Lorg/betup/services/user/UserService;", "markDialogAsShown", "", "reset", "shouldForceShow", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SignInDialogManager {
    public static final int $stable = 0;
    public static final SignInDialogManager INSTANCE = new SignInDialogManager();
    private static final String PREF_KEY_DIALOG_SHOWN = "sign_in_dialog_shown";
    private static final String PREF_KEY_LAST_SHOWN_UID = "sign_in_dialog_last_shown_uid";

    private SignInDialogManager() {
    }

    private final Context getAppContext() {
        Context context = BetUpApp.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Application context not available");
    }

    public final boolean shouldShowDialog(UserService userService) {
        FirebaseUser currentUser;
        String uid;
        Intrinsics.checkNotNullParameter(userService, "userService");
        if (!userService.isAnonymous() || (currentUser = FirebaseAuth.getInstance().getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getAppContext());
        return (Intrinsics.areEqual(defaultSharedPreferences.getString(PREF_KEY_LAST_SHOWN_UID, null), uid) && defaultSharedPreferences.getBoolean(PREF_KEY_DIALOG_SHOWN, false)) ? false : true;
    }

    public final void markDialogAsShown() {
        String uid;
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(getAppContext()).edit().putString(PREF_KEY_LAST_SHOWN_UID, uid).putBoolean(PREF_KEY_DIALOG_SHOWN, true).apply();
    }

    public final void reset() {
        PreferenceManager.getDefaultSharedPreferences(getAppContext()).edit().remove(PREF_KEY_LAST_SHOWN_UID).remove(PREF_KEY_DIALOG_SHOWN).apply();
    }

    public final boolean shouldForceShow(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        return userService.isAnonymous();
    }
}
