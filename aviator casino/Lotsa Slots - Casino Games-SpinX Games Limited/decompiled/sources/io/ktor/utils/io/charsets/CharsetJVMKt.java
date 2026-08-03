package io.ktor.utils.io.charsets;

/* compiled from: CharsetJVM.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0013\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a7\u0010\u0018\u001a\u00020\u000f*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001a1\u0010!\u001a\u00020\u000f*\u00060\u001bj\u0002`\u001c2\u0006\u0010\u000e\u001a\u00020\u001d2\n\u0010\u0017\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u000bj\u0002`\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u001bj\u0002`\u001c8F¢\u0006\u0006\u001a\u0004\b%\u0010(*\n\u0010)\"\u00020\u00042\u00020\u0004*\n\u0010*\"\u00020\u000b2\u00020\u000b*\n\u0010+\"\u00020\u001b2\u00020\u001b*\n\u0010,\"\u00020\u00002\u00020\u0000¨\u0006-"}, d2 = {"Lkotlin/text/Charsets;", "Lio/ktor/utils/io/charsets/Charsets;", "", "name", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "forName", "(Lkotlin/text/Charsets;Ljava/lang/String;)Ljava/nio/charset/Charset;", "", "isSupported", "(Lkotlin/text/Charsets;Ljava/lang/String;)Z", "Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "encodeToByteArray", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "encodeToByteArraySlow", "Lkotlinx/io/Sink;", "dst", "encodeImpl", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILkotlinx/io/Sink;)I", "encodeToByteArrayImpl", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lkotlinx/io/Source;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "decode", "(Ljava/nio/charset/CharsetDecoder;Lkotlinx/io/Source;Ljava/lang/Appendable;I)I", "getName", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "getCharset", "(Ljava/nio/charset/CharsetEncoder;)Ljava/nio/charset/Charset;", "charset", "(Ljava/nio/charset/CharsetDecoder;)Ljava/nio/charset/Charset;", "Charset", "CharsetEncoder", "CharsetDecoder", "Charsets", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CharsetJVMKt {
    public static /* synthetic */ void Charset$annotations() {
    }

    public static final java.nio.charset.Charset forName(kotlin.text.Charsets charsets, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsets, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        return forName;
    }

    public static final boolean isSupported(kotlin.text.Charsets charsets, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsets, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return java.nio.charset.Charset.isSupported(name);
    }

    public static final java.lang.String getName(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "<this>");
        java.lang.String name = charset.name();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name(...)");
        return name;
    }

    public static final java.nio.charset.Charset getCharset(java.nio.charset.CharsetEncoder charsetEncoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        java.nio.charset.Charset charset = charsetEncoder.charset();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "charset(...)");
        return charset;
    }

    public static final byte[] encodeToByteArray(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof java.lang.String) {
            if (i == 0) {
                java.lang.String str = (java.lang.String) input;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            java.lang.String substring = ((java.lang.String) input).substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        }
        return encodeToByteArraySlow(charsetEncoder, input, i, i2);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encodeToByteArray(charsetEncoder, charSequence, i, i2);
    }

    private static final byte[] encodeToByteArraySlow(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i, int i2) {
        java.nio.ByteBuffer encode = charsetEncoder.encode(java.nio.CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final int encodeImpl(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i, int i2, kotlinx.io.Sink dst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        byte[] encodeToByteArray = encodeToByteArray(charsetEncoder, input, i, i2);
        kotlinx.io.Sink.CC.write$default(dst, encodeToByteArray, 0, 0, 6, null);
        return encodeToByteArray.length;
    }

    public static final byte[] encodeToByteArrayImpl(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        throw new java.lang.IllegalStateException("Not needed on jvm".toString());
    }

    public static final java.nio.charset.Charset getCharset(java.nio.charset.CharsetDecoder charsetDecoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        java.nio.charset.Charset charset = charsetDecoder.charset();
        kotlin.jvm.internal.Intrinsics.checkNotNull(charset);
        return charset;
    }

    public static final int decode(java.nio.charset.CharsetDecoder charsetDecoder, kotlinx.io.Source input, java.lang.Appendable dst, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        if (kotlin.jvm.internal.Intrinsics.areEqual(getCharset(charsetDecoder), kotlin.text.Charsets.UTF_8)) {
            java.lang.String readString = kotlinx.io.Utf8Kt.readString(input);
            dst.append(readString);
            return readString.length();
        }
        long remaining = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(input);
        dst.append(kotlinx.io.bytestring.ByteStringJvmExtKt.decodeToString(kotlinx.io.ByteStringsKt.readByteString(input), getCharset(charsetDecoder)));
        return (int) remaining;
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl$default(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encodeToByteArrayImpl(charsetEncoder, charSequence, i, i2);
    }
}
