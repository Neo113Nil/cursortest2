package io.ktor.websocket.internals;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/io/Source;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "endsWith", "(Lkotlinx/io/Source;[B)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BytePacketUtilsKt {
    public static final boolean endsWith(kotlinx.io.Source source, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlinx.io.Buffer copy = source.getGetHighResolutionOutputSizeshNQ4ISI().copy();
        io.ktor.utils.io.core.ByteReadPacketKt.discard(copy, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(copy) - bArr.length);
        return java.util.Arrays.equals(kotlinx.io.SourcesKt.readByteArray(copy), bArr);
    }
}
