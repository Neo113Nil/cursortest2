package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Lio/ktor/util/Encoder;", "Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZip", "getGZip"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EncodersJvmKt {
    private static final io.ktor.util.Encoder Deflate = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            io.ktor.utils.io.ByteReadChannel channel;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2) new io.ktor.util.EncodersJvmKt$inflate$1(false, source, null), 2, (java.lang.Object) null).getChannel();
            return channel;
        }
    };
    private static final io.ktor.util.Encoder GZip = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public final io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            io.ktor.utils.io.ByteReadChannel channel;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2) new io.ktor.util.EncodersJvmKt$inflate$1(true, source, null), 2, (java.lang.Object) null).getChannel();
            return channel;
        }
    };

    public static final /* synthetic */ boolean access$has(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$inflateTo(java.util.zip.Inflater inflater, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, java.util.zip.Checksum checksum, kotlin.coroutines.Continuation continuation) {
        io.ktor.util.EncodersJvmKt$inflateTo$1 encodersJvmKt$inflateTo$1;
        int i;
        int inflate;
        if (continuation instanceof io.ktor.util.EncodersJvmKt$inflateTo$1) {
            encodersJvmKt$inflateTo$1 = (io.ktor.util.EncodersJvmKt$inflateTo$1) continuation;
            if ((encodersJvmKt$inflateTo$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                encodersJvmKt$inflateTo$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = encodersJvmKt$inflateTo$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = encodersJvmKt$inflateTo$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.clear();
                    inflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
                    byteBuffer.position(byteBuffer.position() + inflate);
                    byteBuffer.flip();
                    io.ktor.util.DeflaterKt.updateKeepPosition(checksum, byteBuffer);
                    encodersJvmKt$inflateTo$1.getHighSpeedVideoFpsRangesFor = inflate;
                    encodersJvmKt$inflateTo$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, encodersJvmKt$inflateTo$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inflate = encodersJvmKt$inflateTo$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(inflate);
            }
        }
        encodersJvmKt$inflateTo$1 = new io.ktor.util.EncodersJvmKt$inflateTo$1(continuation);
        java.lang.Object obj2 = encodersJvmKt$inflateTo$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = encodersJvmKt$inflateTo$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(inflate);
    }

    public static final io.ktor.util.Encoder getDeflate() {
        return Deflate;
    }

    public static final io.ktor.util.Encoder getGZip() {
        return GZip;
    }
}
