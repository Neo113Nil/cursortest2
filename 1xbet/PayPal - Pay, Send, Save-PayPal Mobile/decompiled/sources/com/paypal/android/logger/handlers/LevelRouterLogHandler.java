package com.paypal.android.logger.handlers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/android/logger/handlers/LevelRouterLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "Lcom/paypal/android/logger/LogLevel;", "", "loggersByLevel", "<init>", "(Ljava/util/Map;)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "Ljava/util/Map;", "getLoggersByLevel", "()Ljava/util/Map;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LevelRouterLogHandler implements com.paypal.android.logger.LogHandler {
    private final java.util.Map<com.paypal.android.logger.LogLevel, java.util.List<com.paypal.android.logger.LogHandler>> loggersByLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public LevelRouterLogHandler(java.util.Map<com.paypal.android.logger.LogLevel, ? extends java.util.List<? extends com.paypal.android.logger.LogHandler>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.loggersByLevel = map;
    }

    public final java.util.Map<com.paypal.android.logger.LogLevel, java.util.List<com.paypal.android.logger.LogHandler>> getLoggersByLevel() {
        return this.loggersByLevel;
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        java.util.List<com.paypal.android.logger.LogHandler> list = this.loggersByLevel.get(log.getLevel());
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((com.paypal.android.logger.LogHandler) it.next()).handle(log);
            }
        }
    }
}
