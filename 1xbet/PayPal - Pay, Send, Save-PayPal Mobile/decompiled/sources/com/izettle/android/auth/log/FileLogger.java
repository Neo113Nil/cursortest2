package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010"}, d2 = {"Lcom/izettle/android/auth/log/FileLogger;", "Lcom/izettle/android/auth/log/Logger;", "Lcom/izettle/android/auth/log/LogFileLineWriter;", "logFileWriter", "<init>", "(Lcom/izettle/android/auth/log/LogFileLineWriter;)V", "Lcom/izettle/android/auth/log/Logger$Level;", "level", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/izettle/android/auth/log/Logger$Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/izettle/android/auth/log/LogFileLineWriter;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FileLogger implements com.izettle.android.auth.log.Logger {
    private final com.izettle.android.auth.log.LogFileLineWriter logFileWriter;

    public FileLogger(com.izettle.android.auth.log.LogFileLineWriter logFileLineWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileLineWriter, "");
        this.logFileWriter = logFileLineWriter;
    }

    @Override // com.izettle.android.auth.log.Logger
    public final void log(com.izettle.android.auth.log.Logger.Level level, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
        java.lang.String timestamped;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        if (message == null) {
            message = "";
        }
        java.lang.String str = throwable != null ? ": " : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append(str);
        java.lang.String obj = sb.toString();
        java.lang.String stackTraceToString = throwable != null ? kotlin.ExceptionsKt.stackTraceToString(throwable) : null;
        java.lang.String str2 = stackTraceToString != null ? stackTraceToString : "";
        com.izettle.android.auth.log.LogFileLineWriter logFileLineWriter = this.logFileWriter;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(str2);
        timestamped = com.izettle.android.auth.log.LoggerKt.timestamped(sb2.toString(), level, tag);
        logFileLineWriter.writeLine(timestamped);
    }
}
