package io.ktor.http.cio;

/* compiled from: RequestResponseBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/http/cio/RequestResponseBuilder;", "", "<init>", "()V", "", "version", "", "status", "statusText", "", "responseLine", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)V", "Lio/ktor/http/HttpMethod;", "method", com.facebook.share.internal.ShareConstants.MEDIA_URI, "requestLine", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "line", "(Ljava/lang/CharSequence;)V", "", "content", "offset", "length", "bytes", "([BII)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "name", "value", "headerLine", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "emptyLine", "Lkotlinx/io/Source;", "build", "()Lkotlinx/io/Source;", "release", "Lkotlinx/io/Sink;", "packet", "Lkotlinx/io/Sink;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestResponseBuilder {
    private final kotlinx.io.Sink packet = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();

    public final void responseLine(java.lang.CharSequence version, int status, java.lang.CharSequence statusText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusText, "statusText");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, java.lang.String.valueOf(status), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, statusText, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte(com.google.common.base.Ascii.CR);
        this.packet.writeByte((byte) 10);
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, method.getValue(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, uri, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.writeByte(com.google.common.base.Ascii.CR);
        this.packet.writeByte((byte) 10);
    }

    public final void line(java.lang.CharSequence line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, line, 0, 0, 6, null);
        this.packet.writeByte(com.google.common.base.Ascii.CR);
        this.packet.writeByte((byte) 10);
    }

    public final void bytes(byte[] content, int offset, int length) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(this.packet, content, offset, length);
    }

    public final void bytes(java.nio.ByteBuffer content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(this.packet, content);
    }

    public final void headerLine(java.lang.CharSequence name, java.lang.CharSequence value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, name, 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, ": ", 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, value, 0, 0, 6, null);
        this.packet.writeByte(com.google.common.base.Ascii.CR);
        this.packet.writeByte((byte) 10);
    }

    public final void emptyLine() {
        this.packet.writeByte(com.google.common.base.Ascii.CR);
        this.packet.writeByte((byte) 10);
    }

    public final kotlinx.io.Source build() {
        return io.ktor.utils.io.core.BytePacketBuilderKt.build(this.packet);
    }

    public final void release() {
        this.packet.close();
    }
}
