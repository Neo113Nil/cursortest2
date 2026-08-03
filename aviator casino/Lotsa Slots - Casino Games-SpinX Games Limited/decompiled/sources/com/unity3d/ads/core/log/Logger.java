package com.unity3d.ads.core.log;

/* compiled from: Logger.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u001c\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u001c\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/log/Logger;", "", "logLevel", "Lcom/unity3d/ads/core/log/LogLevel;", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevel;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevel;)V", "debug", "", "fb", "Lkotlin/Function0;", "", "message", "error", "e", "", "info", "trace", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Logger {
    void debug(java.lang.String message);

    void debug(kotlin.jvm.functions.Function0<java.lang.String> fb);

    void error(java.lang.String message, java.lang.Throwable e);

    com.unity3d.ads.core.log.LogLevel getLogLevel();

    void info(java.lang.String message);

    void setLogLevel(com.unity3d.ads.core.log.LogLevel logLevel);

    void trace(java.lang.String message, java.lang.Throwable e);

    /* compiled from: Logger.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(com.unity3d.ads.core.log.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(com.unity3d.ads.core.log.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }
}
