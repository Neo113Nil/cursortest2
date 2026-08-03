package kotlinx.io.bytestring;

/* compiled from: Base64.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a:\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001aC\u0010\r\u001a\u0002H\u000e\"\f\b\u0000\u0010\u000e*\u00060\u000fj\u0002`\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u0002H\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0011\u001a(\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a:\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u0016"}, d2 = {"encodeToByteArray", "", "Lkotlin/io/encoding/Base64;", "source", "Lkotlinx/io/bytestring/ByteString;", "startIndex", "", "endIndex", "encodeIntoByteArray", "destination", "destinationOffset", "encode", "", "encodeToAppendable", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "(Lkotlin/io/encoding/Base64;Lkotlinx/io/bytestring/ByteString;Ljava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeToByteString", "", "decodeIntoByteArray", "kotlinx-io-bytestring"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Base64Kt {
    public static /* synthetic */ byte[] encodeToByteArray$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        return encodeToByteArray(base64, byteString, i, i2);
    }

    public static final byte[] encodeToByteArray(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return base64.encodeToByteArray(source.getData(), i, i2);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = byteString.getSize();
        }
        return encodeIntoByteArray(base64, byteString, bArr, i5, i6, i3);
    }

    public static final int encodeIntoByteArray(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, byte[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        return base64.encodeIntoByteArray(source.getData(), destination, i, i2, i3);
    }

    public static /* synthetic */ java.lang.String encode$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        return encode(base64, byteString, i, i2);
    }

    public static final java.lang.String encode(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return base64.encode(source.getData(), i, i2);
    }

    public static /* synthetic */ java.lang.Appendable encodeToAppendable$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, java.lang.Appendable appendable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = byteString.getSize();
        }
        return encodeToAppendable(base64, byteString, appendable, i, i2);
    }

    public static final <A extends java.lang.Appendable> A encodeToAppendable(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, A destination, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        return (A) base64.encodeToAppendable(source.getData(), destination, i, i2);
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        return decode(base64, byteString, i, i2);
    }

    public static final byte[] decode(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return base64.decode(source.getData(), i, i2);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString decodeToByteString$default(kotlin.io.encoding.Base64 base64, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return decodeToByteString(base64, charSequence, i, i2);
    }

    public static final kotlinx.io.bytestring.ByteString decodeToByteString(kotlin.io.encoding.Base64 base64, java.lang.CharSequence source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(base64.decode(source, i, i2));
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = byteString.getSize();
        }
        return decodeIntoByteArray(base64, byteString, bArr, i5, i6, i3);
    }

    public static final int decodeIntoByteArray(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, byte[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        return base64.decodeIntoByteArray(source.getData(), destination, i, i2, i3);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString decodeToByteString$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return decodeToByteString(base64, bArr, i, i2);
    }

    public static final kotlinx.io.bytestring.ByteString decodeToByteString(kotlin.io.encoding.Base64 base64, byte[] source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(base64.decode(source, i, i2));
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString decodeToByteString$default(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        return decodeToByteString(base64, byteString, i, i2);
    }

    public static final kotlinx.io.bytestring.ByteString decodeToByteString(kotlin.io.encoding.Base64 base64, kotlinx.io.bytestring.ByteString source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(base64.decode(source.getData(), i, i2));
    }
}
