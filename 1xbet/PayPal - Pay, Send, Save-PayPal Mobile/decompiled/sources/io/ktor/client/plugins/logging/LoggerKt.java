package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003"}, d2 = {"Lio/ktor/client/plugins/logging/Logger$Companion;", "Lio/ktor/client/plugins/logging/Logger;", "getSIMPLE", "(Lio/ktor/client/plugins/logging/Logger$Companion;)Lio/ktor/client/plugins/logging/Logger;", "SIMPLE", "getEMPTY", "EMPTY"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggerKt {
    public static final io.ktor.client.plugins.logging.Logger getSIMPLE(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return new io.ktor.client.plugins.logging.SimpleLogger();
    }

    public static final io.ktor.client.plugins.logging.Logger getEMPTY(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return new io.ktor.client.plugins.logging.Logger() { // from class: io.ktor.client.plugins.logging.LoggerKt$EMPTY$1
            @Override // io.ktor.client.plugins.logging.Logger
            public final void log(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            }
        };
    }
}
