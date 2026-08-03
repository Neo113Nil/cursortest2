package kotlinx.io.bytestring;

/* compiled from: Hex.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\b\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"toHexString", "", "Lkotlinx/io/bytestring/ByteString;", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "hexToByteString", "kotlinx-io-bytestring"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HexKt {
    public static /* synthetic */ java.lang.String toHexString$default(kotlinx.io.bytestring.ByteString byteString, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(byteString, hexFormat);
    }

    public static final java.lang.String toHexString(kotlinx.io.bytestring.ByteString byteString, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(byteString.getData(), 0, byteString.getData().length, format);
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

    public static final java.lang.String toHexString(kotlinx.io.bytestring.ByteString byteString, int i, int i2, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(byteString.getData(), i, i2, format);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString hexToByteString$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByteString(str, hexFormat);
    }

    public static final kotlinx.io.bytestring.ByteString hexToByteString(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(kotlin.text.HexExtensionsKt.hexToByteArray(str, format));
    }
}
