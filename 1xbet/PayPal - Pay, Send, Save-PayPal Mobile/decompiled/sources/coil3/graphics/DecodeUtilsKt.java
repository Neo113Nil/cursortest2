package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0005\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f"}, d2 = {"Lcoil3/decode/DecodeUtils;", "Lokio/BufferedSource;", "source", "", "isGif", "(Lcoil3/decode/DecodeUtils;Lokio/BufferedSource;)Z", "isWebP", "isAnimatedWebP", "isHeif", "isAnimatedHeif", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "Lokio/ByteString;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "getInputFormats"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecodeUtilsKt {
    private static final okio.ByteString getHighSpeedVideoFpsRangesFor = okio.ByteString.INSTANCE.encodeUtf8("GIF87a");
    private static final okio.ByteString getHighSpeedVideoSizes = okio.ByteString.INSTANCE.encodeUtf8("GIF89a");
    private static final okio.ByteString getOutputMinFrameDuration = okio.ByteString.INSTANCE.encodeUtf8("RIFF");
    private static final okio.ByteString getHighSpeedVideoSizesFor = okio.ByteString.INSTANCE.encodeUtf8("WEBP");
    private static final okio.ByteString getInputSizeshNQ4ISI = okio.ByteString.INSTANCE.encodeUtf8("VP8X");
    private static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.INSTANCE.encodeUtf8("ftyp");
    private static final okio.ByteString getOutputFormats = okio.ByteString.INSTANCE.encodeUtf8("msf1");
    private static final okio.ByteString Camera2StreamConfigurationMap = okio.ByteString.INSTANCE.encodeUtf8("hevc");
    private static final okio.ByteString getHighSpeedVideoFpsRanges = okio.ByteString.INSTANCE.encodeUtf8("hevx");

    public static final boolean isGif(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, getHighSpeedVideoSizes) || bufferedSource.rangeEquals(0L, getHighSpeedVideoFpsRangesFor);
    }

    public static final boolean isWebP(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, getOutputMinFrameDuration) && bufferedSource.rangeEquals(8L, getHighSpeedVideoSizesFor);
    }

    public static final boolean isAnimatedWebP(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        return isWebP(decodeUtils, bufferedSource) && bufferedSource.rangeEquals(12L, getInputSizeshNQ4ISI) && bufferedSource.request(21L) && ((byte) (bufferedSource.getBuffer().getByte(20L) & 2)) > 0;
    }

    public static final boolean isHeif(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(4L, getHighResolutionOutputSizeshNQ4ISI);
    }

    public static final boolean isAnimatedHeif(coil3.graphics.DecodeUtils decodeUtils, okio.BufferedSource bufferedSource) {
        if (isHeif(decodeUtils, bufferedSource)) {
            return bufferedSource.rangeEquals(8L, getOutputFormats) || bufferedSource.rangeEquals(8L, Camera2StreamConfigurationMap) || bufferedSource.rangeEquals(8L, getHighSpeedVideoFpsRanges);
        }
        return false;
    }
}
