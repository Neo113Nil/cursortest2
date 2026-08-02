package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/paging/PagingLogger;", "", "<init>", "()V", "", "level", "", "isLoggable", "(I)Z", "", "message", "", "tr", "", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagingLogger {
    public static final androidx.paging.PagingLogger INSTANCE = new androidx.paging.PagingLogger();

    private PagingLogger() {
    }

    public final boolean isLoggable(int level) {
        return android.os.Build.ID != null && android.util.Log.isLoggable(androidx.paging.PagingLoggerKt.LOG_TAG, level);
    }

    public static /* synthetic */ void log$default(androidx.paging.PagingLogger pagingLogger, int i, java.lang.String str, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        pagingLogger.log(i, str, th);
    }

    public final void log(int level, java.lang.String message, java.lang.Throwable tr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (level == 2 || level == 3) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("debug level ");
        sb.append(level);
        sb.append(" is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
