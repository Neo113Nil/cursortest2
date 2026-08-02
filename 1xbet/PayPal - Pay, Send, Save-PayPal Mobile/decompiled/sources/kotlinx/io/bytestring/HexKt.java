package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "Lkotlin/text/HexFormat;", "format", "", "toHexString", "(Lkotlinx/io/bytestring/ByteString;Lkotlin/text/HexFormat;)Ljava/lang/String;", "", "startIndex", "endIndex", "(Lkotlinx/io/bytestring/ByteString;IILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToByteString", "(Ljava/lang/String;Lkotlin/text/HexFormat;)Lkotlinx/io/bytestring/ByteString;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HexKt {
    public static /* synthetic */ java.lang.String toHexString$default(kotlinx.io.bytestring.ByteString byteString, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(byteString, hexFormat);
    }

    public static final java.lang.String toHexString(kotlinx.io.bytestring.ByteString byteString, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return kotlin.text.HexExtensionsKt.toHexString(byteString.getGetHighSpeedVideoFpsRanges(), 0, byteString.getGetHighSpeedVideoFpsRanges().length, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(kotlinx.io.bytestring.ByteString byteString, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = byteString.getSize();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(byteString, i, i2, hexFormat);
    }

    public static final java.lang.String toHexString(kotlinx.io.bytestring.ByteString byteString, int i, int i2, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return kotlin.text.HexExtensionsKt.toHexString(byteString.getGetHighSpeedVideoFpsRanges(), i, i2, hexFormat);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString hexToByteString$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByteString(str, hexFormat);
    }

    public static final kotlinx.io.bytestring.ByteString hexToByteString(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(kotlin.text.HexExtensionsKt.hexToByteArray(str, hexFormat));
    }
}
