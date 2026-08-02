package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/Activity;", "Landroid/app/KeyguardManager$KeyguardDismissCallback;", com.sun.jna.Callback.METHOD_NAME, "", "allowOnLockScreen", "(Landroid/app/Activity;Landroid/app/KeyguardManager$KeyguardDismissCallback;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LockScreenUtilsKt {
    public static /* synthetic */ void allowOnLockScreen$default(android.app.Activity activity, android.app.KeyguardManager.KeyguardDismissCallback keyguardDismissCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            keyguardDismissCallback = null;
        }
        allowOnLockScreen(activity, keyguardDismissCallback);
    }

    public static final void allowOnLockScreen(android.app.Activity activity, android.app.KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        java.lang.Object m23436constructorimpl;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            activity.setShowWhenLocked(true);
            activity.setTurnScreenOn(true);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) androidx.core.content.ContextCompat.getSystemService(activity, android.app.KeyguardManager.class);
                if (keyguardManager != null) {
                    keyguardManager.requestDismissKeyguard(activity, keyguardDismissCallback);
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            kotlin.Result.m23435boximpl(m23436constructorimpl);
            return;
        }
        activity.getWindow().addFlags(6815744);
    }
}
