package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/core/log/ManualAppEventsRepositoryImpl;", "Lcom/zettle/sdk/core/log/ManualAppEventsRepository;", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/SharedPreferences;)V", "", "userUuid", "", "defaultValue", "getLastManualEvent", "(Ljava/lang/String;J)J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setLastManualEvent", "(Ljava/lang/String;J)V", "getHighSpeedVideoSizes", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ManualAppEventsRepositoryImpl implements com.zettle.sdk.core.log.ManualAppEventsRepository {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.SharedPreferences getHighSpeedVideoFpsRangesFor;

    public ManualAppEventsRepositoryImpl(android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.getHighSpeedVideoFpsRangesFor = sharedPreferences;
    }

    @Override // com.zettle.sdk.core.log.ManualAppEventsRepository
    public final long getLastManualEvent(java.lang.String userUuid, long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userUuid, "");
        return this.getHighSpeedVideoFpsRangesFor.getLong(userUuid, defaultValue);
    }

    @Override // com.zettle.sdk.core.log.ManualAppEventsRepository
    public final void setLastManualEvent(java.lang.String userUuid, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userUuid, "");
        android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoFpsRangesFor.edit();
        edit.putLong(userUuid, value);
        edit.apply();
    }
}
