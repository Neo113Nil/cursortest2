package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u0007"}, d2 = {"Lio/ktor/util/Encoder;", "", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "decode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Encoder {
    io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext);

    io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext);

    io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.ktor.utils.io.ByteReadChannel encode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i & 2) != 0) {
                coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            }
            return encoder.encode(byteReadChannel, coroutineContext);
        }

        public static /* synthetic */ io.ktor.utils.io.ByteWriteChannel encode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i & 2) != 0) {
                coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            }
            return encoder.encode(byteWriteChannel, coroutineContext);
        }

        public static /* synthetic */ io.ktor.utils.io.ByteReadChannel decode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
            }
            if ((i & 2) != 0) {
                coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            }
            return encoder.decode(byteReadChannel, coroutineContext);
        }
    }
}
