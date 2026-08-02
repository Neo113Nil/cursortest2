package okio.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lokio/internal/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "timedOut", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/net/Socket;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SocketAsyncTimeout extends okio.AsyncTimeout {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.net.Socket getHighSpeedVideoFpsRanges;

    public SocketAsyncTimeout(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        this.getHighSpeedVideoFpsRanges = socket;
    }

    @Override // okio.AsyncTimeout
    public final java.io.IOException newTimeoutException(java.io.IOException cause) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        try {
            this.getHighSpeedVideoFpsRanges.close();
        } catch (java.lang.AssertionError e) {
            if (okio.internal._JavaIoKt.isAndroidGetsocknameError(e)) {
                logger2 = okio.internal._JavaIoKt.getHighSpeedVideoSizes;
                java.util.logging.Level level = java.util.logging.Level.WARNING;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to close timed out socket ");
                sb.append(this.getHighSpeedVideoFpsRanges);
                logger2.log(level, sb.toString(), (java.lang.Throwable) e);
                return;
            }
            throw e;
        } catch (java.lang.Exception e2) {
            logger = okio.internal._JavaIoKt.getHighSpeedVideoSizes;
            java.util.logging.Level level2 = java.util.logging.Level.WARNING;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to close timed out socket ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            logger.log(level2, sb2.toString(), (java.lang.Throwable) e2);
        }
    }
}
