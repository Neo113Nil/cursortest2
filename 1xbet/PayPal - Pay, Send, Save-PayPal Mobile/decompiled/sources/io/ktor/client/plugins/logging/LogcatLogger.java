package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/logging/LogcatLogger;", "Lio/ktor/client/plugins/logging/Logger;", "Ljava/lang/Class;", "p0", "p1", "<init>", "(Ljava/lang/Class;Lio/ktor/client/plugins/logging/Logger;)V", "", "", "log", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lio/ktor/client/plugins/logging/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class LogcatLogger implements io.ktor.client.plugins.logging.Logger {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.reflect.Method getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.client.plugins.logging.Logger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public LogcatLogger(java.lang.Class<?> cls, io.ktor.client.plugins.logging.Logger logger) {
        java.lang.reflect.Method method;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = logger;
        this.getHighSpeedVideoFpsRangesFor = "Ktor Client";
        try {
            method = cls.getDeclaredMethod("i", java.lang.String.class, java.lang.String.class);
        } catch (java.lang.Throwable unused) {
            method = null;
        }
        this.getHighSpeedVideoSizes = method;
    }

    @Override // io.ktor.client.plugins.logging.Logger
    public final void log(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.reflect.Method method = this.getHighSpeedVideoSizes;
        if (method == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.log(p0);
            return;
        }
        try {
            method.invoke(null, this.getHighSpeedVideoFpsRangesFor, p0);
        } catch (java.lang.Throwable unused) {
            this.getHighResolutionOutputSizeshNQ4ISI.log(p0);
        }
    }
}
