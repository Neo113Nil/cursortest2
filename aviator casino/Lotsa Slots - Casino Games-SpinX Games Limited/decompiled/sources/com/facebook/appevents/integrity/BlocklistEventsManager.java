package com.facebook.appevents.integrity;

/* compiled from: BlocklistEventsManager.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/integrity/BlocklistEventsManager;", "", "()V", "blocklist", "", "", "enabled", "", "disable", "", com.ironsource.mediationsdk.metadata.a.j, "isInBlocklist", com.ironsource.X3.i.j0, "loadBlocklistEvents", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BlocklistEventsManager {
    public static final com.facebook.appevents.integrity.BlocklistEventsManager INSTANCE = new com.facebook.appevents.integrity.BlocklistEventsManager();
    private static java.util.Set<java.lang.String> blocklist = new java.util.HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.BlocklistEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadBlocklistEvents();
            java.util.Set<java.lang.String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.BlocklistEventsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.BlocklistEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            blocklist = new java.util.HashSet();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.BlocklistEventsManager.class);
        }
    }

    private final void loadBlocklistEvents() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.HashSet<java.lang.String> convertJSONArrayToHashSet = com.facebook.internal.Utility.convertJSONArrayToHashSet(queryAppSettings.getBlocklistEvents());
            if (convertJSONArrayToHashSet == null) {
                return;
            }
            blocklist = convertJSONArrayToHashSet;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInBlocklist(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.BlocklistEventsManager.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.BlocklistEventsManager.class);
            return false;
        }
    }
}
