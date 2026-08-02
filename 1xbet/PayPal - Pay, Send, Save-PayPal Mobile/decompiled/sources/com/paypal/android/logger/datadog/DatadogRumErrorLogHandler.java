package com.paypal.android.logger.datadog;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/android/logger/datadog/DatadogRumErrorLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "", "firstLevelAttributes", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "Ljava/util/Set;", "getFirstLevelAttributes", "()Ljava/util/Set;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DatadogRumErrorLogHandler implements com.paypal.android.logger.LogHandler {
    private final java.util.Set<java.lang.String> firstLevelAttributes;

    public DatadogRumErrorLogHandler(java.util.Set<java.lang.String> set) {
        this.firstLevelAttributes = set;
    }

    public /* synthetic */ DatadogRumErrorLogHandler(java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set);
    }

    public final java.util.Set<java.lang.String> getFirstLevelAttributes() {
        return this.firstLevelAttributes;
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        java.util.Set<java.lang.String> set = this.firstLevelAttributes;
        if (set != null) {
            com.paypal.android.logger.datadog.DatadogLogExtensionsKt.scopeNonFirstLevelAttributesWithLoggerName(log, set);
        }
        if (com.paypal.android.logger.LogLevel.ERROR == log.getLevel()) {
            com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null).addError(log.getMessage(), com.datadog.android.rum.RumErrorSource.SOURCE, log.getThrowable(), log.getAttributes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatadogRumErrorLogHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
