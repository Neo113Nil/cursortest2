package io.ktor.utils.io.core;

/* compiled from: Strings.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a)\u0010\u0013\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010!\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010#\u001a\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "", "toByteArray", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "bytes", "", "offset", "length", "String", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "Lkotlinx/io/Source;", "readBytes", "(Lkotlinx/io/Source;)[B", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "(Lkotlinx/io/Source;I)[B", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "readText", "(Lkotlinx/io/Source;Ljava/nio/charset/Charset;I)Ljava/lang/String;", com.ironsource.B5.q, "readTextExact", "charactersCount", "readTextExactCharacters", "(Lkotlinx/io/Source;ILjava/nio/charset/Charset;)Ljava/lang/String;", "Lkotlinx/io/Sink;", "", "text", "fromIndex", "toIndex", "", "writeText", "(Lkotlinx/io/Sink;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "", "(Lkotlinx/io/Sink;[CIILjava/nio/charset/Charset;)V", "", "prematureEndOfStreamToReadChars", "(I)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringsKt {
    public static /* synthetic */ byte[] toByteArray$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return toByteArray(str, charset);
    }

    public static final byte[] toByteArray(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8) ? kotlin.text.StringsKt.encodeToByteArray$default(str, 0, 0, true, 3, null) : io.ktor.utils.io.charsets.CharsetJVMKt.encodeToByteArray(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ java.lang.String String$default(byte[] bArr, int i, int i2, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 8) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return String(bArr, i, i2, charset);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use decodeToString instead", replaceWith = @kotlin.ReplaceWith(expression = "bytes.decodeToString(offset, offset + length)", imports = {}))
    public static final java.lang.String String(byte[] bytes, int i, int i2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            return kotlin.text.StringsKt.decodeToString$default(bytes, i, i + i2, false, 4, null);
        }
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(buffer, bytes, i, i2);
        return readText$default(buffer, charset, 0, 2, null);
    }

    @kotlin.Deprecated(message = "Use readByteArray instead", replaceWith = @kotlin.ReplaceWith(expression = "this.readByteArray()", imports = {"kotlinx.io.readByteArray"}))
    public static final byte[] readBytes(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlinx.io.SourcesKt.readByteArray(source);
    }

    @kotlin.Deprecated(message = "Use readByteArray instead", replaceWith = @kotlin.ReplaceWith(expression = "this.readByteArray(count)", imports = {}))
    public static final byte[] readBytes(kotlinx.io.Source source, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlinx.io.SourcesKt.readByteArray(source, i);
    }

    public static /* synthetic */ java.lang.String readText$default(kotlinx.io.Source source, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(source, charset, i);
    }

    public static final java.lang.String readText(kotlinx.io.Source source, java.nio.charset.Charset charset, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            return io.ktor.utils.io.charsets.EncodingKt.decode(charset.newDecoder(), source, i);
        }
        if (i == Integer.MAX_VALUE) {
            return kotlinx.io.Utf8Kt.readString(source);
        }
        return kotlinx.io.Utf8Kt.readString(source, java.lang.Math.min(source.getBufferField().getSizeMut(), i));
    }

    public static /* synthetic */ java.lang.String readTextExact$default(kotlinx.io.Source source, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readTextExact(source, charset, i);
    }

    @kotlin.Deprecated(message = "Use readTextExactCharacters instead.", replaceWith = @kotlin.ReplaceWith(expression = "readTextExactCharacters(n, charset)", imports = {}))
    public static final java.lang.String readTextExact(kotlinx.io.Source source, java.nio.charset.Charset charset, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return readTextExactCharacters(source, i, charset);
    }

    public static /* synthetic */ java.lang.String readTextExactCharacters$default(kotlinx.io.Source source, int i, java.nio.charset.Charset charset, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readTextExactCharacters(source, i, charset);
    }

    public static final java.lang.String readTextExactCharacters(kotlinx.io.Source source, int i, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.lang.String readText = readText(source, charset, i);
        if (readText.length() >= i) {
            return readText;
        }
        prematureEndOfStreamToReadChars(i);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ void writeText$default(kotlinx.io.Sink sink, java.lang.CharSequence charSequence, int i, int i2, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i3 & 8) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        writeText(sink, charSequence, i, i2, charset);
    }

    public static final void writeText(kotlinx.io.Sink sink, java.lang.CharSequence text, int i, int i2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == kotlin.text.Charsets.UTF_8) {
            kotlinx.io.Utf8Kt.writeString(sink, text.toString(), i, i2);
        } else {
            io.ktor.utils.io.charsets.EncodingKt.encodeToImpl(charset.newEncoder(), sink, text, i, i2);
        }
    }

    public static /* synthetic */ void writeText$default(kotlinx.io.Sink sink, char[] cArr, int i, int i2, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        if ((i3 & 8) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        writeText(sink, cArr, i, i2, charset);
    }

    public static final void writeText(kotlinx.io.Sink sink, char[] text, int i, int i2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == kotlin.text.Charsets.UTF_8) {
            kotlinx.io.Utf8Kt.writeString(sink, kotlin.text.StringsKt.concatToString(text, i, i + i2), 0, i2 - i);
        } else {
            io.ktor.utils.io.charsets.EncodingKt.encode(charset.newEncoder(), text, i, i2, sink);
        }
    }

    private static final java.lang.Void prematureEndOfStreamToReadChars(int i) {
        throw new java.io.EOFException("Not enough input bytes to read " + i + " characters.");
    }
}
