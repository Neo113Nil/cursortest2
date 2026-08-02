package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/startup/DefaultAppStartupActivityPredicate;", "Lcom/datadog/android/rum/startup/AppStartupActivityPredicate;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "shouldTrackStartup", "(Landroid/app/Activity;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAppStartupActivityPredicate implements com.datadog.android.rum.startup.AppStartupActivityPredicate {
    public static final com.datadog.android.rum.internal.startup.DefaultAppStartupActivityPredicate INSTANCE = new com.datadog.android.rum.internal.startup.DefaultAppStartupActivityPredicate();

    private DefaultAppStartupActivityPredicate() {
    }

    @Override // com.datadog.android.rum.startup.AppStartupActivityPredicate
    public final boolean shouldTrackStartup(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return true;
    }
}
