package com.datadog.android.core.internal.time;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/core/internal/time/LoggingSyncListener;", "Lcom/lyft/kronos/SyncListener;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", com.datadog.android.log.LogAttributes.HOST, "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "onStartSync", "(Ljava/lang/String;)V", "", "ticksDelta", "responseTimeMs", "onSuccess", "(JJ)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggingSyncListener implements com.lyft.kronos.SyncListener {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.lyft.kronos.SyncListener
    public final void onSuccess(long ticksDelta, long responseTimeMs) {
    }

    public LoggingSyncListener(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    @Override // com.lyft.kronos.SyncListener
    public final void onError(final java.lang.String host, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.time.LoggingSyncListener$onError$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "Kronos onError @host:".concat(java.lang.String.valueOf(host));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, throwable, false, (java.util.Map) null, 48, (java.lang.Object) null);
    }

    @Override // com.lyft.kronos.SyncListener
    public final void onStartSync(java.lang.String host) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
    }
}
