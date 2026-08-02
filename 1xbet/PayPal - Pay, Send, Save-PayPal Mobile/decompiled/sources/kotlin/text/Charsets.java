package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "UTF32_LE", "UTF_32LE", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "UTF32_BE", "UTF_32BE", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {
    public static final kotlin.text.Charsets INSTANCE = new kotlin.text.Charsets();
    public static final java.nio.charset.Charset ISO_8859_1;
    public static final java.nio.charset.Charset US_ASCII;
    public static final java.nio.charset.Charset UTF_16;
    public static final java.nio.charset.Charset UTF_16BE;
    public static final java.nio.charset.Charset UTF_16LE;
    public static final java.nio.charset.Charset UTF_8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static volatile java.nio.charset.Charset getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static volatile java.nio.charset.Charset Camera2StreamConfigurationMap;
    private static volatile java.nio.charset.Charset getHighSpeedVideoSizes;

    private Charsets() {
    }

    static {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
        UTF_8 = forName;
        java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName2, "");
        UTF_16 = forName2;
        java.nio.charset.Charset forName3 = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16BE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName3, "");
        UTF_16BE = forName3;
        java.nio.charset.Charset forName4 = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16LE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName4, "");
        UTF_16LE = forName4;
        java.nio.charset.Charset forName5 = java.nio.charset.Charset.forName("US-ASCII");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName5, "");
        US_ASCII = forName5;
        java.nio.charset.Charset forName6 = java.nio.charset.Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName6, "");
        ISO_8859_1 = forName6;
    }

    public final java.nio.charset.Charset UTF32() {
        java.nio.charset.Charset charset = Camera2StreamConfigurationMap;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
        Camera2StreamConfigurationMap = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_LE() {
        java.nio.charset.Charset charset = getHighSpeedVideoFpsRanges;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32LE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
        getHighSpeedVideoFpsRanges = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_BE() {
        java.nio.charset.Charset charset = getHighSpeedVideoSizes;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32BE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
        getHighSpeedVideoSizes = forName;
        return forName;
    }
}
