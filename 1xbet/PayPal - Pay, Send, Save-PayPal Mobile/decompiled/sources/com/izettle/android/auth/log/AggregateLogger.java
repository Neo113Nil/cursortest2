package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013"}, d2 = {"Lcom/izettle/android/auth/log/AggregateLogger;", "Lcom/izettle/android/auth/log/Logger;", "loggers", "<init>", "([Lcom/izettle/android/auth/log/Logger;)V", "logger", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Lcom/izettle/android/auth/log/Logger;)V", "Lcom/izettle/android/auth/log/Logger$Level;", "level", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "log", "(Lcom/izettle/android/auth/log/Logger$Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "[Lcom/izettle/android/auth/log/Logger;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AggregateLogger implements com.izettle.android.auth.log.Logger {
    private com.izettle.android.auth.log.Logger[] loggers;

    public AggregateLogger(com.izettle.android.auth.log.Logger... loggerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerArr, "");
        this.loggers = loggerArr;
    }

    public final void add(com.izettle.android.auth.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.loggers = (com.izettle.android.auth.log.Logger[]) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.izettle.android.auth.log.Logger>) kotlin.collections.ArraysKt.toList(this.loggers), logger).toArray(new com.izettle.android.auth.log.Logger[0]);
    }

    @Override // com.izettle.android.auth.log.Logger
    public final void log(com.izettle.android.auth.log.Logger.Level level, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        for (com.izettle.android.auth.log.Logger logger : this.loggers) {
            logger.log(level, tag, message, throwable);
        }
    }
}
