package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/plugins/logging/MessageLengthLimitingLogger;", "Lio/ktor/client/plugins/logging/Logger;", "", "maxLength", "minLength", "delegate", "<init>", "(IILio/ktor/client/plugins/logging/Logger;)V", "", "message", "", "log", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/client/plugins/logging/Logger;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MessageLengthLimitingLogger implements io.ktor.client.plugins.logging.Logger {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final io.ktor.client.plugins.logging.Logger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public MessageLengthLimitingLogger(int i, int i2, io.ktor.client.plugins.logging.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRangesFor = logger;
    }

    public /* synthetic */ MessageLengthLimitingLogger(int i, int i2, io.ktor.client.plugins.logging.Logger logger, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4000 : i, (i3 & 2) != 0 ? 3000 : i2, (i3 & 4) != 0 ? io.ktor.client.plugins.logging.LoggerJvmKt.getDEFAULT(io.ktor.client.plugins.logging.Logger.INSTANCE) : logger);
    }

    @Override // io.ktor.client.plugins.logging.Logger
    public final void log(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        while (true) {
            int length = message.length();
            int i = this.getHighSpeedVideoSizes;
            if (length > i) {
                java.lang.String substring = message.substring(0, i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                int i2 = this.getHighSpeedVideoSizes;
                int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) substring, '\n', 0, false, 6, (java.lang.Object) null);
                if (lastIndexOf$default >= this.getHighResolutionOutputSizeshNQ4ISI) {
                    substring = substring.substring(0, lastIndexOf$default);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    i2 = lastIndexOf$default + 1;
                }
                this.getHighSpeedVideoFpsRangesFor.log(substring);
                message = message.substring(i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
            } else {
                this.getHighSpeedVideoFpsRangesFor.log(message);
                return;
            }
        }
    }

    public MessageLengthLimitingLogger() {
        this(0, 0, null, 7, null);
    }
}
