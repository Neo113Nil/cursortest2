package com.lyft.kronos.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/lyft/kronos/internal/SharedPreferenceSyncResponseCache;", "Lcom/lyft/kronos/SyncResponseCache;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "clear", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCurrentOffset", "()J", "setCurrentOffset", "(J)V", "currentOffset", "getCurrentTime", "setCurrentTime", "currentTime", "getElapsedTime", "setElapsedTime", "elapsedTime", "getHighSpeedVideoFpsRangesFor", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class SharedPreferenceSyncResponseCache implements com.lyft.kronos.SyncResponseCache {
    public static final java.lang.String KEY_CURRENT_TIME = "com.lyft.kronos.cached_current_time";
    public static final java.lang.String KEY_ELAPSED_TIME = "com.lyft.kronos.cached_elapsed_time";
    public static final java.lang.String KEY_OFFSET = "com.lyft.kronos.cached_offset";
    public static final java.lang.String SHARED_PREFERENCES_NAME = "com.lyft.kronos.shared_preferences";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.SharedPreferences getHighSpeedVideoFpsRanges;

    public SharedPreferenceSyncResponseCache(android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.getHighSpeedVideoFpsRanges = sharedPreferences;
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final long getCurrentTime() {
        return this.getHighSpeedVideoFpsRanges.getLong(KEY_CURRENT_TIME, 0L);
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final void setCurrentTime(long j) {
        this.getHighSpeedVideoFpsRanges.edit().putLong(KEY_CURRENT_TIME, j).apply();
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final long getElapsedTime() {
        return this.getHighSpeedVideoFpsRanges.getLong(KEY_ELAPSED_TIME, 0L);
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final void setElapsedTime(long j) {
        this.getHighSpeedVideoFpsRanges.edit().putLong(KEY_ELAPSED_TIME, j).apply();
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final long getCurrentOffset() {
        return this.getHighSpeedVideoFpsRanges.getLong(KEY_OFFSET, 0L);
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final void setCurrentOffset(long j) {
        this.getHighSpeedVideoFpsRanges.edit().putLong(KEY_OFFSET, j).apply();
    }

    @Override // com.lyft.kronos.SyncResponseCache
    public final void clear() {
        this.getHighSpeedVideoFpsRanges.edit().clear().apply();
    }
}
