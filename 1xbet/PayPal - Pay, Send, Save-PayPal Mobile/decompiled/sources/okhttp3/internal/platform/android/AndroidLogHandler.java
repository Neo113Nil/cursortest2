package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "Ljava/util/logging/LogRecord;", "record", "", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "close"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLogHandler extends java.util.logging.Handler {
    public static final okhttp3.internal.platform.android.AndroidLogHandler INSTANCE = new okhttp3.internal.platform.android.AndroidLogHandler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        okhttp3.internal.platform.android.AndroidLog androidLog = okhttp3.internal.platform.android.AndroidLog.INSTANCE;
        java.lang.String loggerName = record.getLoggerName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loggerName, "");
        int access$getAndroidLevel = okhttp3.internal.platform.android.AndroidLogKt.access$getAndroidLevel(record);
        java.lang.String message = record.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel, message, record.getThrown());
    }
}
