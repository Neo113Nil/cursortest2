package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/util/DeflateEncoder;", "Lio/ktor/util/ContentEncoder;", "Lio/ktor/util/Encoder;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "decode", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "encode", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeflateEncoder implements io.ktor.util.ContentEncoder, io.ktor.util.Encoder {
    public static final io.ktor.util.DeflateEncoder INSTANCE = new io.ktor.util.DeflateEncoder();
    private static final java.lang.String name = "deflate";
    private final /* synthetic */ io.ktor.util.Encoder getHighResolutionOutputSizeshNQ4ISI = io.ktor.util.EncodersJvmKt.getDeflate();

    private DeflateEncoder() {
    }

    @Override // io.ktor.util.ContentEncoder
    public final java.lang.Long predictCompressedLength(long j) {
        return io.ktor.util.ContentEncoder.DefaultImpls.predictCompressedLength(this, j);
    }

    @Override // io.ktor.util.ContentEncoder
    public final java.lang.String getName() {
        return name;
    }

    @Override // io.ktor.util.Encoder
    public final io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.encode(source, coroutineContext);
    }

    @Override // io.ktor.util.Encoder
    public final io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.encode(source, coroutineContext);
    }

    @Override // io.ktor.util.Encoder
    public final io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.decode(source, coroutineContext);
    }
}
