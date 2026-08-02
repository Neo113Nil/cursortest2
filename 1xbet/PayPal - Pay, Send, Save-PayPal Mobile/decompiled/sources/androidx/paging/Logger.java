package androidx.paging;

@kotlin.Deprecated(message = "Logger interface is no longer supported.")
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/Logger;", "", "", "level", "", "isLoggable", "(I)Z", "", "message", "", "tr", "", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Logger {
    boolean isLoggable(int level);

    void log(int level, java.lang.String message, java.lang.Throwable tr);

    static /* synthetic */ void log$default(androidx.paging.Logger logger, int i, java.lang.String str, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        logger.log(i, str, th);
    }
}
