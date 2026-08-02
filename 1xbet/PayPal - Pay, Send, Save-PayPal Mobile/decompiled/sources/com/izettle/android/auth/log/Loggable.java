package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/izettle/android/auth/log/Loggable;", "", "", "message", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "(Ljava/lang/String;)V", "error", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "info", "verbose", "warn", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcom/izettle/android/auth/log/Logger;", "getLogger", "()Lcom/izettle/android/auth/log/Logger;", "logger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Loggable {
    void debug(java.lang.String message);

    void error(java.lang.String message);

    void error(java.lang.String message, java.lang.Throwable throwable);

    void error(java.lang.Throwable throwable);

    java.lang.String getLogTag();

    com.izettle.android.auth.log.Logger getLogger();

    void info(java.lang.String message);

    void verbose(java.lang.String message);

    void warn(java.lang.String message);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void info(com.izettle.android.auth.log.Loggable loggable, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.izettle.android.auth.log.Logger.DefaultImpls.log$default(loggable.getLogger(), com.izettle.android.auth.log.Logger.Level.INFO, loggable.getLogTag(), str, null, 8, null);
        }

        public static void warn(com.izettle.android.auth.log.Loggable loggable, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.izettle.android.auth.log.Logger.DefaultImpls.log$default(loggable.getLogger(), com.izettle.android.auth.log.Logger.Level.WARN, loggable.getLogTag(), str, null, 8, null);
        }

        public static void debug(com.izettle.android.auth.log.Loggable loggable, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.izettle.android.auth.log.Logger.DefaultImpls.log$default(loggable.getLogger(), com.izettle.android.auth.log.Logger.Level.DEBUG, loggable.getLogTag(), str, null, 8, null);
        }

        public static void verbose(com.izettle.android.auth.log.Loggable loggable, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.izettle.android.auth.log.Logger.DefaultImpls.log$default(loggable.getLogger(), com.izettle.android.auth.log.Logger.Level.VERBOSE, loggable.getLogTag(), str, null, 8, null);
        }

        public static void error(com.izettle.android.auth.log.Loggable loggable, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.izettle.android.auth.log.Logger.DefaultImpls.log$default(loggable.getLogger(), com.izettle.android.auth.log.Logger.Level.ERROR, loggable.getLogTag(), str, null, 8, null);
        }

        public static void error(com.izettle.android.auth.log.Loggable loggable, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            loggable.getLogger().log(com.izettle.android.auth.log.Logger.Level.ERROR, loggable.getLogTag(), null, th);
        }

        public static void error(com.izettle.android.auth.log.Loggable loggable, java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            loggable.getLogger().log(com.izettle.android.auth.log.Logger.Level.ERROR, loggable.getLogTag(), str, th);
        }
    }
}
