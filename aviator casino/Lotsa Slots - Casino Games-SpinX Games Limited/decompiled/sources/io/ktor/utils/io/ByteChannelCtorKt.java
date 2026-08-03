package io.ktor.utils.io;

/* compiled from: ByteChannelCtor.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\u0006\u0010\r\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"", "content", "", "offset", "length", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([BII)Lio/ktor/utils/io/ByteReadChannel;", "", "text", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Source;", "source", "(Lkotlinx/io/Source;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteChannelCtorKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel ByteReadChannel$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ByteReadChannel(bArr, i, i2);
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(byte[] content, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        buffer.write(content, i, i2 + i);
        return ByteReadChannel(buffer);
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel ByteReadChannel$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return ByteReadChannel(str, charset);
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return ByteReadChannel$default(io.ktor.utils.io.core.StringsKt.toByteArray(text, charset), 0, 0, 6, null);
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new io.ktor.utils.io.SourceByteReadChannel(source);
    }
}
