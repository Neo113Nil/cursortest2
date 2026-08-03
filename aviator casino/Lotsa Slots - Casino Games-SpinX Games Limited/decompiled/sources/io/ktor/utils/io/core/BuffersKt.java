package io.ktor.utils.io.core;

/* compiled from: Buffers.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/io/Buffer;", "", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "readBytes", "(Lkotlinx/io/Buffer;I)[B", "", "isEmpty", "(Lkotlinx/io/Buffer;)Z", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuffersKt {
    public static /* synthetic */ byte[] readBytes$default(kotlinx.io.Buffer buffer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = (int) buffer.getSizeMut();
        }
        return readBytes(buffer, i);
    }

    public static final byte[] readBytes(kotlinx.io.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        return kotlinx.io.SourcesKt.readByteArray(buffer, i);
    }

    public static final boolean isEmpty(kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.getSizeMut() == 0;
    }
}
