package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/io/Sink;", "Ljava/nio/ByteBuffer;", "bb", "", "writeByteBuffer", "(Lkotlinx/io/Sink;Ljava/nio/ByteBuffer;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OutputArraysJVMKt {
    public static final void writeByteBuffer(kotlinx.io.Sink sink, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlinx.io.SinksJvmKt.write(sink, byteBuffer);
    }
}
