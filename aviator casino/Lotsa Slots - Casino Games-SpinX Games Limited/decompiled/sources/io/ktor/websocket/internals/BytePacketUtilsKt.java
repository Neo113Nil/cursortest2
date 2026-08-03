package io.ktor.websocket.internals;

/* compiled from: BytePacketUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/Source;", "", "data", "", "endsWith", "(Lkotlinx/io/Source;[B)Z", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BytePacketUtilsKt {
    public static final boolean endsWith(kotlinx.io.Source source, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlinx.io.Buffer copy = source.getBufferField().copy();
        io.ktor.utils.io.core.ByteReadPacketKt.discard(copy, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(copy) - data.length);
        return java.util.Arrays.equals(kotlinx.io.SourcesKt.readByteArray(copy), data);
    }
}
