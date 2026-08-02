package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\u00020\u0005*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018*\n\u0010\u0001\"\u00020\u00002\u00020\u0000"}, d2 = {"Lkotlinx/io/Sink;", "BytePacketBuilder", "()Lkotlinx/io/Sink;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "startIndex", "endIndex", "", "append", "(Lkotlinx/io/Sink;Ljava/lang/CharSequence;II)V", "Lkotlinx/io/Source;", "build", "(Lkotlinx/io/Sink;)Lkotlinx/io/Source;", "", "buffer", "offset", "length", "writeFully", "(Lkotlinx/io/Sink;[BII)V", "packet", "writePacket", "(Lkotlinx/io/Sink;Lkotlinx/io/Source;)V", "getSize", "(Lkotlinx/io/Sink;)I", "getSize$annotations", "(Lkotlinx/io/Sink;)V", io.ktor.http.ContentDisposition.Parameters.Size}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BytePacketBuilderKt {
    @kotlin.Deprecated(message = io.ktor.utils.io.DeprecationKt.IO_DEPRECATION_MESSAGE, replaceWith = @kotlin.ReplaceWith(expression = "Sink", imports = {"kotlinx.io.Sink"}))
    public static /* synthetic */ void BytePacketBuilder$annotations() {
    }

    public static /* synthetic */ void getSize$annotations(kotlinx.io.Sink sink) {
    }

    public static final int getSize(kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return (int) sink.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut();
    }

    public static final kotlinx.io.Sink BytePacketBuilder() {
        return new kotlinx.io.Buffer();
    }

    public static /* synthetic */ void append$default(kotlinx.io.Sink sink, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        append(sink, charSequence, i, i2);
    }

    public static final void append(kotlinx.io.Sink sink, java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        io.ktor.utils.io.core.StringsKt.writeText$default(sink, charSequence, i, i2, (java.nio.charset.Charset) null, 8, (java.lang.Object) null);
    }

    public static final kotlinx.io.Source build(kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return sink.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public static /* synthetic */ void writeFully$default(kotlinx.io.Sink sink, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        writeFully(sink, bArr, i, i2);
    }

    public static final void writeFully(kotlinx.io.Sink sink, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        sink.write(bArr, i, i2 + i);
    }

    public static final void writePacket(kotlinx.io.Sink sink, kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        sink.transferFrom(source);
    }
}
