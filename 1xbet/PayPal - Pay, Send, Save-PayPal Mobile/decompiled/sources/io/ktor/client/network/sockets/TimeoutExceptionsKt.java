package io.ktor.client.network.sockets;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0000\u0010\t\"\u00020\b2\u00020\b*\n\u0010\n\"\u00020\u00042\u00020\u0004"}, d2 = {"", "message", "", "cause", "Ljava/net/SocketTimeoutException;", "Lio/ktor/client/network/sockets/Camera2StreamConfigurationMap;", "SocketTimeoutException", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;", "Ljava/io/InterruptedIOException;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TimeoutExceptionsKt {
    public static /* synthetic */ java.net.SocketTimeoutException SocketTimeoutException$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return SocketTimeoutException(str, th);
    }

    public static final java.net.SocketTimeoutException SocketTimeoutException(java.lang.String str, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(str);
        socketTimeoutException.initCause(th);
        return socketTimeoutException;
    }
}
