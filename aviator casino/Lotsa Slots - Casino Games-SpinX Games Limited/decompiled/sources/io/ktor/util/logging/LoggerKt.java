package io.ktor.util.logging;

/* compiled from: Logger.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "", "exception", "", "error", "(Lorg/slf4j/Logger;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "", "message", "trace", "(Lorg/slf4j/Logger;Lkotlin/jvm/functions/Function0;)V", "debug", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerKt {
    public static final void error(org.slf4j.Logger logger, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.String message = exception.getMessage();
        if (message == null) {
            message = "Exception of type " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(exception.getClass());
        }
        logger.error(message, exception);
    }

    public static final void trace(org.slf4j.Logger logger, kotlin.jvm.functions.Function0<java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
            logger.trace(message.invoke());
        }
    }

    public static final void debug(org.slf4j.Logger logger, kotlin.jvm.functions.Function0<java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (io.ktor.util.logging.LoggerJvmKt.isDebugEnabled(logger)) {
            logger.debug(message.invoke());
        }
    }
}
