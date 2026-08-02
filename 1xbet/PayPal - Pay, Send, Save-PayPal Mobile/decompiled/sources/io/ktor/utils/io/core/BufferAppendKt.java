package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/io/Buffer;", "other", "", "maxSize", "writeBufferAppend", "(Lkotlinx/io/Buffer;Lkotlinx/io/Buffer;I)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferAppendKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = io.ktor.utils.io.DeprecationKt.IO_DEPRECATION_MESSAGE, replaceWith = @kotlin.ReplaceWith(expression = "write(other, min(other.size, maxSize.toLong())", imports = {}))
    public static final int writeBufferAppend(kotlinx.io.Buffer buffer, kotlinx.io.Buffer buffer2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer2, "");
        long min = java.lang.Math.min(buffer2.getSizeMut(), i);
        buffer.write(buffer2, min);
        return (int) min;
    }
}
