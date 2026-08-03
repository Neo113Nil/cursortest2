package io.ktor.util;

/* compiled from: InputJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "Ljava/io/InputStream;", "asStream", "(Lkotlinx/io/Source;)Ljava/io/InputStream;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputJvmKt {
    public static final java.io.InputStream asStream(final kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return new java.io.InputStream() { // from class: io.ktor.util.InputJvmKt$asStream$1
            @Override // java.io.InputStream
            public int read() {
                if (io.ktor.utils.io.core.InputKt.getEndOfInput(kotlinx.io.Source.this)) {
                    return -1;
                }
                return kotlinx.io.Source.this.readByte();
            }

            @Override // java.io.InputStream
            public int read(byte[] buffer, int offset, int length) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (io.ktor.utils.io.core.InputKt.getEndOfInput(kotlinx.io.Source.this)) {
                    return -1;
                }
                return io.ktor.utils.io.core.InputKt.readAvailable(kotlinx.io.Source.this, buffer, offset, length);
            }

            @Override // java.io.InputStream
            public long skip(long count) {
                return io.ktor.utils.io.core.ByteReadPacketKt.discard(kotlinx.io.Source.this, count);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                kotlinx.io.Source.this.close();
            }
        };
    }
}
