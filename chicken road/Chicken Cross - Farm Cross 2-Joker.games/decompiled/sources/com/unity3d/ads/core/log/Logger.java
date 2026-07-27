package com.unity3d.ads.core.log;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/log/Logger;", "", "logLevel", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "info", "", "message", "", "debug", "fb", "Lkotlin/Function0;", "error", "e", "", "trace", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Logger {
    void debug(String message);

    void debug(Function0<String> fb);

    void error(String message, Throwable e);

    LogLevelInternal getLogLevel();

    void info(String message);

    void setLogLevel(LogLevelInternal logLevelInternal);

    void trace(String message, Throwable e);

    void trace(Function0<String> fb);

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }
}
