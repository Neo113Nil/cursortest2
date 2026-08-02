package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\r\u0010\tJ7\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u00020\u00168'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/DebugLogger;", "", "", "tag", "message", "", "params", "", "log", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "logBuilder", "()Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "logError", "logInfo", "Lcom/discover/mpos/sdk/core/debug/logger/Logger;", "logger", "register", "(Lcom/discover/mpos/sdk/core/debug/logger/Logger;)V", "unregister", "unregisterAll", "()V", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface DebugLogger {
    boolean getEnabled();

    void log(java.lang.String tag, java.lang.String message, java.lang.Object... params);

    com.discover.mpos.sdk.core.debug.logger.LogBuilder logBuilder();

    void logError(java.lang.String tag, java.lang.String message, java.lang.Object... params);

    void logInfo(java.lang.String tag, java.lang.String message, java.lang.Object... params);

    void register(com.discover.mpos.sdk.core.debug.logger.Logger logger);

    void setEnabled(boolean z);

    void unregister(com.discover.mpos.sdk.core.debug.logger.Logger logger);

    void unregisterAll();
}
