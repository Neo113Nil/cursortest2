package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "level", "", "tr", "Lkotlin/Function0;", "", "block", "", "log", "(ILjava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "LOG_TAG", "Ljava/lang/String;", "VERBOSE", com.visa.cbp.getEncExpo.warmup, "DEBUG"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagingLoggerKt {
    public static final int DEBUG = 3;
    public static final java.lang.String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    public static /* synthetic */ void log$default(int i, java.lang.Throwable th, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i)) {
            pagingLogger.log(i, (java.lang.String) function0.invoke(), th);
        }
    }

    public static final void log(int i, java.lang.Throwable th, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i)) {
            pagingLogger.log(i, function0.invoke(), th);
        }
    }
}
