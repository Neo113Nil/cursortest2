package io.ktor.utils.io.core;

/* compiled from: BufferPrimitivesJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/Buffer;", "Ljava/nio/ByteBuffer;", "source", "", "writeByteBuffer", "(Lkotlinx/io/Buffer;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferPrimitivesJvmKt {
    @kotlin.Deprecated(message = "[writeByteBuffer] is deprecated. Consider using [transferFrom] instead", replaceWith = @kotlin.ReplaceWith(expression = "this.transferFrom(source)", imports = {}))
    public static final void writeByteBuffer(kotlinx.io.Buffer buffer, java.nio.ByteBuffer source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.io.BuffersJvmKt.transferFrom(buffer, source);
    }
}
