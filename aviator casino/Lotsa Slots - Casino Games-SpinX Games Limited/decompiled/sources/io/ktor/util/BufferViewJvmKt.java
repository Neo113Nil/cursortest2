package io.ktor.util;

/* compiled from: BufferViewJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "Lkotlinx/io/Buffer;", "buffer", "", "read", "(Ljava/nio/channels/ReadableByteChannel;Lkotlinx/io/Buffer;)I", "Ljava/nio/channels/WritableByteChannel;", "write", "(Ljava/nio/channels/WritableByteChannel;Lkotlinx/io/Buffer;)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferViewJvmKt {
    public static final int read(final java.nio.channels.ReadableByteChannel readableByteChannel, kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (io.ktor.utils.io.core.internal.ChunkBufferKt.getWriteRemaining(buffer) == 0) {
            return 0;
        }
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        io.ktor.utils.io.core.internal.ChunkBufferJvmKt.writeDirect(buffer, 1, new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.BufferViewJvmKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit read$lambda$0;
                read$lambda$0 = io.ktor.util.BufferViewJvmKt.read$lambda$0(kotlin.jvm.internal.Ref.IntRef.this, readableByteChannel, (java.nio.ByteBuffer) obj);
                return read$lambda$0;
            }
        });
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit read$lambda$0(kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "bb");
        intRef.element = readableByteChannel.read(bb);
        return kotlin.Unit.INSTANCE;
    }

    public static final int write(final java.nio.channels.WritableByteChannel writableByteChannel, kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        io.ktor.utils.io.core.internal.ChunkBufferJvmKt.readDirect(buffer, new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.BufferViewJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit write$lambda$1;
                write$lambda$1 = io.ktor.util.BufferViewJvmKt.write$lambda$1(kotlin.jvm.internal.Ref.IntRef.this, writableByteChannel, (java.nio.ByteBuffer) obj);
                return write$lambda$1;
            }
        });
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit write$lambda$1(kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "bb");
        intRef.element = writableByteChannel.write(bb);
        return kotlin.Unit.INSTANCE;
    }
}
