package com.paypal.android.logger.handlers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/android/logger/handlers/LogcatLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "shouldRemoveLoggerAttribute", "Lcom/paypal/android/logger/formatters/LogFormatter;", "logFormatter", "<init>", "(ZLcom/paypal/android/logger/formatters/LogFormatter;)V", "(Z)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/logger/formatters/LogFormatter;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogcatLogHandler implements com.paypal.android.logger.LogHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.android.logger.formatters.LogFormatter getHighSpeedVideoFpsRangesFor;

    public LogcatLogHandler(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.android.logger.formatters.DefaultLogFormatter();
    }

    public /* synthetic */ LogcatLogHandler(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public /* synthetic */ LogcatLogHandler(boolean z, com.paypal.android.logger.formatters.LogFormatter logFormatter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, logFormatter);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LogcatLogHandler(boolean z, com.paypal.android.logger.formatters.LogFormatter logFormatter) {
        this(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFormatter, "");
        this.getHighSpeedVideoFpsRangesFor = logFormatter;
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        log.getAttributes().get("logger");
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            log.getAttributes().remove("logger");
        }
        this.getHighSpeedVideoFpsRangesFor.format(log);
        int i = com.paypal.android.logger.handlers.LogcatLogHandler.WhenMappings.$EnumSwitchMapping$0[log.getLevel().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i != 5) {
            return;
        }
        log.getThrowable();
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.android.logger.LogLevel.values().length];
            try {
                iArr[com.paypal.android.logger.LogLevel.VERBOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.android.logger.LogLevel.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.android.logger.LogLevel.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.android.logger.LogLevel.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.android.logger.LogLevel.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LogcatLogHandler() {
        this(false, 1, null);
    }
}
