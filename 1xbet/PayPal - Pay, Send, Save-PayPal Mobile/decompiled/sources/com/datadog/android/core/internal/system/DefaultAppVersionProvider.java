package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAppVersionProvider;", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "", "initialVersion", "", "versionCode", "<init>", "(Ljava/lang/String;I)V", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "version", com.visa.cbp.getEncExpo.warmup, "getVersionCode", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAppVersionProvider implements com.datadog.android.core.internal.system.AppVersionProvider {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> getHighSpeedVideoFpsRanges;
    private final int versionCode;

    public DefaultAppVersionProvider(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.versionCode = i;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(str);
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final int getVersionCode() {
        return this.versionCode;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final java.lang.String getVersion() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public final void setVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges.set(str);
    }
}
