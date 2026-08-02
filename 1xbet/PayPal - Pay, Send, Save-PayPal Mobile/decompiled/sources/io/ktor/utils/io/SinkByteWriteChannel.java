package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/utils/io/SinkByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlinx/io/RawSink;", "origin", "<init>", "(Lkotlinx/io/RawSink;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flushAndClose", "", "cause", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "Lkotlinx/io/Sink;", "getHighSpeedVideoFpsRanges", "Lkotlinx/io/Sink;", "getHighSpeedVideoSizes", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "getWriteBuffer", "()Lkotlinx/io/Sink;", "getWriteBuffer$annotations", "()V", "writeBuffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SinkByteWriteChannel implements io.ktor.utils.io.ByteWriteChannel {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.utils.io.SinkByteWriteChannel.class, java.lang.Object.class, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
    volatile /* synthetic */ java.lang.Object closed;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.io.Sink getHighSpeedVideoSizes;

    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    public SinkByteWriteChannel(kotlinx.io.RawSink rawSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSink, "");
        this.closed = null;
        this.getHighSpeedVideoSizes = kotlinx.io.CoreKt.buffered(rawSink);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final boolean isClosedForWrite() {
        return this.closed != null;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = (io.ktor.utils.io.CloseToken) this.closed;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final kotlinx.io.Sink getWriteBuffer() {
        if (!isClosedForWrite()) {
            return this.getHighSpeedVideoSizes;
        }
        java.lang.Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            throw new java.io.IOException("Channel is closed for write");
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        getWriteBuffer().flush();
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        getWriteBuffer().flush();
        return !androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, null, io.ktor.utils.io.CloseTokenKt.getCLOSED()) ? kotlin.Unit.INSTANCE : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final void cancel(java.lang.Throwable cause) {
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, null, cause == null ? io.ktor.utils.io.CloseTokenKt.getCLOSED() : new io.ktor.utils.io.CloseToken(cause));
    }
}
