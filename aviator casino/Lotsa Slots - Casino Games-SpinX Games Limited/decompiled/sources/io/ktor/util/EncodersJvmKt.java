package io.ktor.util;

/* compiled from: EncodersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0013\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"", "flag", "", "has", "(II)Z", "Lio/ktor/utils/io/ByteReadChannel;", "source", "gzip", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "inflate", "(Lio/ktor/utils/io/ByteReadChannel;ZLkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/util/zip/Inflater;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/util/zip/Checksum;", "checksum", "inflateTo", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GZIP_HEADER_SIZE", "I", "Lio/ktor/util/Encoder;", "Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZip", "getGZip", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final io.ktor.util.Encoder Deflate = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            io.ktor.utils.io.ByteReadChannel inflate;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            inflate = io.ktor.util.EncodersJvmKt.inflate(source, false, coroutineContext);
            return inflate;
        }
    };
    private static final io.ktor.util.Encoder GZip = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return io.ktor.util.EncodersJvmKt.inflate$default(source, false, coroutineContext, 2, null);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final io.ktor.util.Encoder getDeflate() {
        return Deflate;
    }

    public static final io.ktor.util.Encoder getGZip() {
        return GZip;
    }

    static /* synthetic */ io.ktor.utils.io.ByteReadChannel inflate$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return inflate(byteReadChannel, z, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel inflate(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z, kotlin.coroutines.CoroutineContext coroutineContext) {
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2) new io.ktor.util.EncodersJvmKt$inflate$1(z, byteReadChannel, null), 2, (java.lang.Object) null).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object inflateTo(java.util.zip.Inflater inflater, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, java.util.zip.Checksum checksum, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.util.EncodersJvmKt$inflateTo$1 encodersJvmKt$inflateTo$1;
        int i;
        int inflate;
        if (continuation instanceof io.ktor.util.EncodersJvmKt$inflateTo$1) {
            encodersJvmKt$inflateTo$1 = (io.ktor.util.EncodersJvmKt$inflateTo$1) continuation;
            if ((encodersJvmKt$inflateTo$1.label & Integer.MIN_VALUE) != 0) {
                encodersJvmKt$inflateTo$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = encodersJvmKt$inflateTo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = encodersJvmKt$inflateTo$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.clear();
                    inflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
                    byteBuffer.position(byteBuffer.position() + inflate);
                    byteBuffer.flip();
                    io.ktor.util.DeflaterKt.updateKeepPosition(checksum, byteBuffer);
                    encodersJvmKt$inflateTo$1.I$0 = inflate;
                    encodersJvmKt$inflateTo$1.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, encodersJvmKt$inflateTo$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inflate = encodersJvmKt$inflateTo$1.I$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(inflate);
            }
        }
        encodersJvmKt$inflateTo$1 = new io.ktor.util.EncodersJvmKt$inflateTo$1(continuation);
        java.lang.Object obj2 = encodersJvmKt$inflateTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = encodersJvmKt$inflateTo$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(inflate);
    }
}
