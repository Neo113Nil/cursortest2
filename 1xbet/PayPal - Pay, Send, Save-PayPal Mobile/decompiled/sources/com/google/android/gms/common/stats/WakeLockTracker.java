package com.google.android.gms.common.stats;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class WakeLockTracker {
    private static final com.google.android.gms.common.stats.WakeLockTracker zza = new com.google.android.gms.common.stats.WakeLockTracker();

    public void registerAcquireEvent(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
    }

    public void registerDeadlineEvent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.util.List<java.lang.String> list, boolean z, long j) {
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.util.List<java.lang.String> list) {
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.util.List<java.lang.String> list, long j) {
    }

    public void registerReleaseEvent(android.content.Context context, android.content.Intent intent) {
    }

    public static com.google.android.gms.common.stats.WakeLockTracker getInstance() {
        return zza;
    }
}
