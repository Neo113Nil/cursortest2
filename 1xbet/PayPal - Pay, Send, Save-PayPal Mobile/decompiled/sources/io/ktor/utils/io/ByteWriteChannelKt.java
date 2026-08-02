package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "close", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lio/ktor/utils/io/ByteChannel;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lio/ktor/utils/io/ByteChannel;)V", "flushIfNeeded", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteWriteChannelKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Async close is deprecated. Please consider replacing it with flushAndClose or cancel ", replaceWith = @kotlin.ReplaceWith(expression = "flushAndClose()", imports = {}))
    public static final void close(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        io.ktor.utils.io.ByteWriteChannelOperationsKt.fireAndForget(new io.ktor.utils.io.ByteWriteChannelKt$close$1(byteWriteChannel));
    }

    public static final void cancel(io.ktor.utils.io.ByteChannel byteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        byteChannel.cancel(new java.io.IOException("Channel was cancelled"));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Cancel without reason is deprecated. Please provide a cause for cancellation.", replaceWith = @kotlin.ReplaceWith(expression = "cancel(IOException())", imports = {"kotlinx.coroutines.cancel"}))
    public static final void cancel(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        byteWriteChannel.cancel(new java.io.IOException("Channel was cancelled"));
    }

    public static final java.lang.Object flushIfNeeded(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(byteWriteChannel);
        io.ktor.utils.io.ByteChannel byteChannel = byteWriteChannel instanceof io.ktor.utils.io.ByteChannel ? (io.ktor.utils.io.ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) < 1048576) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object flush = byteWriteChannel.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }
}
