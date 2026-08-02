package io.ktor.util.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004*\n\u0010\u0006\"\u00020\u00002\u00020\u0000"}, d2 = {"Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "", "isTraceEnabled", "(Lorg/slf4j/Logger;)Z", "isDebugEnabled", "Logger"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerJvmKt {
    public static final boolean isTraceEnabled(org.slf4j.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return logger.isTraceEnabled();
    }

    public static final boolean isDebugEnabled(org.slf4j.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return logger.isDebugEnabled();
    }
}
