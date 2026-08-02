package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/utils/io/LookAheadSuspendSession;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "skip", "atLeast", "Ljava/nio/ByteBuffer;", "request", "(II)Ljava/nio/ByteBuffer;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "", "awaitAtLeast", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "consumed", "(I)V", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/ByteReadChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LookAheadSuspendSession {
    private final io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap;

    public LookAheadSuspendSession(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        this.Camera2StreamConfigurationMap = byteReadChannel;
    }

    public final java.nio.ByteBuffer request(int skip, int atLeast) {
        if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.Camera2StreamConfigurationMap.getReadBuffer()) < atLeast + skip) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) io.ktor.utils.io.core.ByteReadPacketKt.preview(this.Camera2StreamConfigurationMap.getReadBuffer(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.LookAheadSuspendSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.utils.io.LookAheadSuspendSession.m23424$r8$lambda$wNKfuLNrRdJAVCJf9Nkl3sL8YE((kotlinx.io.Source) obj);
            }
        });
        if (skip > 0) {
            byteBuffer.position(byteBuffer.position() + skip);
        }
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitAtLeast(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1 lookAheadSuspendSession$awaitAtLeast$1;
        int i2;
        if (continuation instanceof io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1) {
            lookAheadSuspendSession$awaitAtLeast$1 = (io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1) continuation;
            if ((lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = lookAheadSuspendSession$awaitAtLeast$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.Camera2StreamConfigurationMap.getReadBuffer()) >= i) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    io.ktor.utils.io.ByteReadChannel byteReadChannel = this.Camera2StreamConfigurationMap;
                    lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoSizes = i;
                    lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (byteReadChannel.awaitContent(i, lookAheadSuspendSession$awaitAtLeast$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.Camera2StreamConfigurationMap.getReadBuffer()) >= ((long) i));
            }
        }
        lookAheadSuspendSession$awaitAtLeast$1 = new io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1(this, continuation);
        java.lang.Object obj2 = lookAheadSuspendSession$awaitAtLeast$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lookAheadSuspendSession$awaitAtLeast$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.Camera2StreamConfigurationMap.getReadBuffer()) >= ((long) i));
    }

    public final void consumed(int count) {
        io.ktor.utils.io.core.ByteReadPacketKt.discard(this.Camera2StreamConfigurationMap.getReadBuffer(), count);
    }

    /* renamed from: $r8$lambda$wNKfuLNrRdJAVCJf9Nkl3sL8Y-E, reason: not valid java name */
    public static /* synthetic */ java.nio.ByteBuffer m23424$r8$lambda$wNKfuLNrRdJAVCJf9Nkl3sL8YE(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return java.nio.ByteBuffer.wrap(kotlinx.io.SourcesKt.readByteArray(source));
    }
}
