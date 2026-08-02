package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lio/ktor/http/cio/RequestResponseBuilder;", "", "<init>", "()V", "", "version", "", "status", "statusText", "", "responseLine", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)V", "Lio/ktor/http/HttpMethod;", "method", "uri", "requestLine", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "line", "(Ljava/lang/CharSequence;)V", "", "content", "offset", "length", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "([BII)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "headerLine", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "emptyLine", "Lkotlinx/io/Source;", "build", "()Lkotlinx/io/Source;", "release", "Lkotlinx/io/Sink;", "getHighSpeedVideoFpsRanges", "Lkotlinx/io/Sink;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestResponseBuilder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.io.Sink getHighSpeedVideoSizes = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();

    public final void responseLine(java.lang.CharSequence version, int status, java.lang.CharSequence statusText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusText, "");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, java.lang.String.valueOf(status), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, statusText, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 13);
        this.getHighSpeedVideoSizes.writeByte((byte) 10);
    }

    public static /* synthetic */ void bytes$default(io.ktor.http.cio.RequestResponseBuilder requestResponseBuilder, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        requestResponseBuilder.bytes(bArr, i, i2);
    }

    public final void requestLine(io.ktor.http.HttpMethod method, java.lang.CharSequence uri, java.lang.CharSequence version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, method.getValue(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, uri, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.getHighSpeedVideoSizes, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.getHighSpeedVideoSizes.writeByte((byte) 13);
        this.getHighSpeedVideoSizes.writeByte((byte) 10);
    }

    public final void line(java.lang.CharSequence line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.getHighSpeedVideoSizes, line, 0, 0, 6, null);
        this.getHighSpeedVideoSizes.writeByte((byte) 13);
        this.getHighSpeedVideoSizes.writeByte((byte) 10);
    }

    public final void bytes(byte[] content, int offset, int length) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(this.getHighSpeedVideoSizes, content, offset, length);
    }

    public final void bytes(java.nio.ByteBuffer content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(this.getHighSpeedVideoSizes, content);
    }

    public final void headerLine(java.lang.CharSequence name2, java.lang.CharSequence value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.getHighSpeedVideoSizes, name2, 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.getHighSpeedVideoSizes, ": ", 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.getHighSpeedVideoSizes, value, 0, 0, 6, null);
        this.getHighSpeedVideoSizes.writeByte((byte) 13);
        this.getHighSpeedVideoSizes.writeByte((byte) 10);
    }

    public final void emptyLine() {
        this.getHighSpeedVideoSizes.writeByte((byte) 13);
        this.getHighSpeedVideoSizes.writeByte((byte) 10);
    }

    public final kotlinx.io.Source build() {
        return io.ktor.utils.io.core.BytePacketBuilderKt.build(this.getHighSpeedVideoSizes);
    }

    public final void release() {
        this.getHighSpeedVideoSizes.close();
    }
}
