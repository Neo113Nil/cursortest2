package com.facebook.appevents;

/* compiled from: AppEventsManager.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEventsManager;", "", "()V", "start", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsManager {
    public static final com.facebook.appevents.AppEventsManager INSTANCE = new com.facebook.appevents.AppEventsManager();

    private AppEventsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void start() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsManager.class)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.internal.FetchedAppSettingsManager.getAppSettingsAsync(new com.facebook.appevents.AppEventsManager$start$1());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsManager.class);
        }
    }
}
