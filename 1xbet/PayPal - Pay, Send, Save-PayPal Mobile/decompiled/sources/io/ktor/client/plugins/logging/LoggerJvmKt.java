package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\n\u001a\u00020\u0000*\u00020\u00038GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/logging/Logger;", "getHighSpeedVideoSizes", "()Lio/ktor/client/plugins/logging/Logger;", "Lio/ktor/client/plugins/logging/Logger$Companion;", "getDEFAULT", "(Lio/ktor/client/plugins/logging/Logger$Companion;)Lio/ktor/client/plugins/logging/Logger;", "DEFAULT", "ANDROID$delegate", "Lkotlin/Lazy;", "getANDROID", "ANDROID"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggerJvmKt {
    private static final kotlin.Lazy ANDROID$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.logging.LoggerJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            io.ktor.client.plugins.logging.Logger highSpeedVideoSizes;
            highSpeedVideoSizes = io.ktor.client.plugins.logging.LoggerJvmKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    public static final io.ktor.client.plugins.logging.Logger getDEFAULT(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return new io.ktor.client.plugins.logging.Logger() { // from class: io.ktor.client.plugins.logging.LoggerJvmKt$DEFAULT$1

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final org.slf4j.Logger getHighSpeedVideoFpsRanges;

            {
                org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) io.ktor.client.HttpClient.class);
                kotlin.jvm.internal.Intrinsics.checkNotNull(logger);
                this.getHighSpeedVideoFpsRanges = logger;
            }

            @Override // io.ktor.client.plugins.logging.Logger
            public final void log(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                this.getHighSpeedVideoFpsRanges.info(message);
            }
        };
    }

    public static final io.ktor.client.plugins.logging.Logger getANDROID(io.ktor.client.plugins.logging.Logger.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (io.ktor.client.plugins.logging.Logger) ANDROID$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.client.plugins.logging.Logger getHighSpeedVideoSizes() {
        io.ktor.client.plugins.logging.Logger logger = getDEFAULT(io.ktor.client.plugins.logging.Logger.INSTANCE);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.util.Log");
            if (!(org.slf4j.LoggerFactory.getILoggerFactory() instanceof org.slf4j.helpers.NOPLoggerFactory)) {
                return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, logger, 3, null);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, new io.ktor.client.plugins.logging.LogcatLogger(cls, logger), 3, null);
        } catch (java.lang.ClassNotFoundException unused) {
            return new io.ktor.client.plugins.logging.MessageLengthLimitingLogger(0, 0, logger, 3, null);
        }
    }
}
