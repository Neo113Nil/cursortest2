package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lokio/ByteString;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Lcoil3/network/NetworkRequestBody;", "NetworkRequestBody", "(Lokio/ByteString;)Lcoil3/network/NetworkRequestBody;", "Lokio/BufferedSource;", "source", "Lcoil3/network/NetworkResponseBody;", "NetworkResponseBody", "(Lokio/BufferedSource;)Lcoil3/network/NetworkResponseBody;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkClientKt {
    public static final coil3.content.NetworkRequestBody NetworkRequestBody(okio.ByteString byteString) {
        return coil3.content.ByteStringNetworkRequestBody.getHighSpeedVideoSizes(coil3.content.ByteStringNetworkRequestBody.getHighSpeedVideoFpsRanges(byteString));
    }

    public static final coil3.content.NetworkResponseBody NetworkResponseBody(okio.BufferedSource bufferedSource) {
        return coil3.content.SourceResponseBody.getHighSpeedVideoFpsRangesFor(coil3.content.SourceResponseBody.Camera2StreamConfigurationMap(bufferedSource));
    }
}
