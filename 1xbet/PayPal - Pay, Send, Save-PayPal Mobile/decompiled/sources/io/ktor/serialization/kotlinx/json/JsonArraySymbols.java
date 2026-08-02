package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0011\u0010\r\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\f\u0010\t"}, d2 = {"Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", "p0", "<init>", "(Ljava/nio/charset/Charset;)V", "", "getHighSpeedVideoFpsRanges", "[B", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class JsonArraySymbols {
    final byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final byte[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final byte[] getHighSpeedVideoSizes;

    public JsonArraySymbols(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        this.Camera2StreamConfigurationMap = io.ktor.utils.io.core.StringsKt.toByteArray("[", charset);
        this.getHighResolutionOutputSizeshNQ4ISI = io.ktor.utils.io.core.StringsKt.toByteArray("]", charset);
        this.getHighSpeedVideoSizes = io.ktor.utils.io.core.StringsKt.toByteArray(",", charset);
    }
}
