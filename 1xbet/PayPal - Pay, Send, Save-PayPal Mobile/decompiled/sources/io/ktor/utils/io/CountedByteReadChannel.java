package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00158WX\u0096\u0004¢\u0006\f\u0012\u0004\b&\u0010\f\u001a\u0004\b$\u0010%"}, d2 = {"Lio/ktor/utils/io/CountedByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "", "cause", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/utils/io/ByteReadChannel;", "getDelegate", "()Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Buffer;", "Lkotlinx/io/Buffer;", "", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getTotalBytesRead", "()J", "totalBytesRead", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "getReadBuffer", "()Lkotlinx/io/Buffer;", "getReadBuffer$annotations", "readBuffer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountedByteReadChannel implements io.ktor.utils.io.ByteReadChannel {
    private final io.ktor.utils.io.ByteReadChannel delegate;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public CountedByteReadChannel(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        this.delegate = byteReadChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlinx.io.Buffer();
    }

    public final io.ktor.utils.io.ByteReadChannel getDelegate() {
        return this.delegate;
    }

    public final long getTotalBytesRead() {
        getHighSpeedVideoFpsRangesFor();
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final java.lang.Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return this.getHighResolutionOutputSizeshNQ4ISI.exhausted() && this.delegate.isClosedForRead();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final kotlinx.io.Buffer getReadBuffer() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 countedByteReadChannel$awaitContent$1;
        java.lang.Object obj;
        int i2;
        if (continuation instanceof io.ktor.utils.io.CountedByteReadChannel$awaitContent$1) {
            countedByteReadChannel$awaitContent$1 = (io.ktor.utils.io.CountedByteReadChannel$awaitContent$1) continuation;
            if ((countedByteReadChannel$awaitContent$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                countedByteReadChannel$awaitContent$1.getHighSpeedVideoSizes -= 2147483648;
                obj = countedByteReadChannel$awaitContent$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = countedByteReadChannel$awaitContent$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getReadBuffer().getSizeMut() >= i) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    io.ktor.utils.io.ByteReadChannel byteReadChannel = this.delegate;
                    countedByteReadChannel$awaitContent$1.getHighSpeedVideoSizes = 1;
                    obj = byteReadChannel.awaitContent(i, countedByteReadChannel$awaitContent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
        }
        countedByteReadChannel$awaitContent$1 = new io.ktor.utils.io.CountedByteReadChannel$awaitContent$1(this, continuation);
        obj = countedByteReadChannel$awaitContent$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = countedByteReadChannel$awaitContent$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor();
        this.Camera2StreamConfigurationMap += this.getHighResolutionOutputSizeshNQ4ISI.transferFrom(this.delegate.getReadBuffer());
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(java.lang.Throwable cause) {
        this.delegate.cancel(cause);
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoSizes += this.Camera2StreamConfigurationMap - this.getHighResolutionOutputSizeshNQ4ISI.getSizeMut();
        this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.getSizeMut();
    }
}
