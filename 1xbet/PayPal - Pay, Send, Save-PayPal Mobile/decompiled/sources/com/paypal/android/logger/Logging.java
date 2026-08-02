package com.paypal.android.logger;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b"}, d2 = {"Lcom/paypal/android/logger/Logging;", "", "<init>", "()V", "Lcom/paypal/android/logger/LogHandler;", "logHandler", "", "install", "(Lcom/paypal/android/logger/LogHandler;)V", "uninstall", "Lcom/paypal/android/logger/LogHandler;", "getLogHandler$logger_release", "()Lcom/paypal/android/logger/LogHandler;", "setLogHandler$logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Logging {
    public static final com.paypal.android.logger.Logging INSTANCE = new com.paypal.android.logger.Logging();
    private static com.paypal.android.logger.LogHandler logHandler = new com.paypal.android.logger.handlers.NullLogHandler();

    private Logging() {
    }

    public final com.paypal.android.logger.LogHandler getLogHandler$logger_release() {
        return logHandler;
    }

    public final void setLogHandler$logger_release(com.paypal.android.logger.LogHandler logHandler2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logHandler2, "");
        logHandler = logHandler2;
    }

    public final void install(com.paypal.android.logger.LogHandler logHandler2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logHandler2, "");
        com.paypal.android.logger.LogHandler logHandler3 = logHandler;
        if (!(logHandler3 instanceof com.paypal.android.logger.handlers.NullLogHandler)) {
            logHandler3.handle(new com.paypal.android.logger.Log("A logger is already installed. Call Logger.uninstall() prior to installing a new logger.", com.paypal.android.logger.LogLevel.ERROR, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new com.paypal.android.logger.LoggerAlreadyInstalledException()));
        } else {
            logHandler = logHandler2;
        }
    }

    public final void uninstall() {
        logHandler = new com.paypal.android.logger.handlers.NullLogHandler();
    }
}
