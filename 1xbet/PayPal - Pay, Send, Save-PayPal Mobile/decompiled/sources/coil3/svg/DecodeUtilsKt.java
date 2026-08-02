package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b"}, d2 = {"Lcoil3/decode/DecodeUtils;", "Lokio/BufferedSource;", "source", "", "isSvg", "(Lcoil3/decode/DecodeUtils;Lokio/BufferedSource;)Z", "Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/ByteString;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeUtilsKt {
    private static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.INSTANCE.encodeUtf8("<svg");
    private static final okio.ByteString getHighSpeedVideoSizes = okio.ByteString.INSTANCE.encodeUtf8("<");

    public static final boolean isSvg(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, getHighSpeedVideoSizes) && bufferedSource.indexOf(getHighResolutionOutputSizeshNQ4ISI, 0L, okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != -1;
    }
}
