package io.ktor.utils.io.charsets;

/* compiled from: Encoding.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\b\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0015\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "Lkotlinx/io/Source;", "encode", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lkotlinx/io/Source;", "", "Lkotlinx/io/Sink;", "dst", "", "(Ljava/nio/charset/CharsetEncoder;[CIILkotlinx/io/Sink;)V", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "", "decode", "(Ljava/nio/charset/CharsetDecoder;Lkotlinx/io/Source;I)Ljava/lang/String;", "encodeArrayImpl", "(Ljava/nio/charset/CharsetEncoder;[CIILkotlinx/io/Sink;)I", "destination", "encodeToImpl", "(Ljava/nio/charset/CharsetEncoder;Lkotlinx/io/Sink;Ljava/lang/CharSequence;II)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncodingKt {
    public static /* synthetic */ kotlinx.io.Source encode$default(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encode(charsetEncoder, charSequence, i, i2);
    }

    public static final void encode(java.nio.charset.CharsetEncoder charsetEncoder, char[] input, int i, int i2, kotlinx.io.Sink dst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        encodeArrayImpl(charsetEncoder, input, i, i2, dst);
    }

    public static /* synthetic */ java.lang.String decode$default(java.nio.charset.CharsetDecoder charsetDecoder, kotlinx.io.Source source, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return decode(charsetDecoder, source, i);
    }

    public static final java.lang.String decode(java.nio.charset.CharsetDecoder charsetDecoder, kotlinx.io.Source input, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(i, input.getBufferField().getSizeMut()));
        io.ktor.utils.io.charsets.CharsetJVMKt.decode(charsetDecoder, input, sb, i);
        return sb.toString();
    }

    public static final int encodeArrayImpl(java.nio.charset.CharsetEncoder charsetEncoder, char[] input, int i, int i2, kotlinx.io.Sink dst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        int i3 = i2 - i;
        return io.ktor.utils.io.charsets.CharsetJVMKt.encodeImpl(charsetEncoder, new io.ktor.utils.io.core.internal.CharArraySequence(input, i, i3), 0, i3, dst);
    }

    public static final void encodeToImpl(java.nio.charset.CharsetEncoder charsetEncoder, kotlinx.io.Sink destination, java.lang.CharSequence input, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        if (i >= i2) {
            return;
        }
        do {
            int encodeImpl = io.ktor.utils.io.charsets.CharsetJVMKt.encodeImpl(charsetEncoder, input, i, i2, destination);
            if (encodeImpl < 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            i += encodeImpl;
        } while (i < i2);
    }

    public static final kotlinx.io.Source encode(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        encodeToImpl(charsetEncoder, buffer, input, i, i2);
        return buffer;
    }
}
