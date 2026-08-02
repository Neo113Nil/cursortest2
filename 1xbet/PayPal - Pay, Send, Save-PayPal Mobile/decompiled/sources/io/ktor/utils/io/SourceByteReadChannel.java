package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/utils/io/SourceByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Source;", "source", "<init>", "(Lkotlinx/io/Source;)V", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Lkotlinx/io/Source;", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/CloseToken;", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Lio/ktor/utils/io/CloseToken;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SourceByteReadChannel implements io.ktor.utils.io.ByteReadChannel {
    private volatile io.ktor.utils.io.CloseToken closed;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.io.Source Camera2StreamConfigurationMap;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public SourceByteReadChannel(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        this.Camera2StreamConfigurationMap = source;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = this.closed;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return this.Camera2StreamConfigurationMap.exhausted();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final kotlinx.io.Source getReadBuffer() {
        java.lang.Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return this.Camera2StreamConfigurationMap.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.lang.Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Camera2StreamConfigurationMap.request(i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(java.lang.Throwable cause) {
        java.lang.String str;
        if (this.closed != null) {
            return;
        }
        this.Camera2StreamConfigurationMap.close();
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        this.closed = new io.ktor.utils.io.CloseToken(new java.io.IOException(str, cause));
    }
}
