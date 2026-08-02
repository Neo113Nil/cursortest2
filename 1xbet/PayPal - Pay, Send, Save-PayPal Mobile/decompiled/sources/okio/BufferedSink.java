package okio;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\b\u0010\u0010J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H&¢\u0006\u0004\b\b\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH&¢\u0006\u0004\b'\u0010 J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b-\u0010 J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0000H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0000H&¢\u0006\u0004\b9\u00108J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005\u0082\u0001\u0002\u0003>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "Lokio/ByteString;", "byteString", "write", "(Lokio/ByteString;)Lokio/BufferedSink;", "", "offset", "byteCount", "(Lokio/ByteString;II)Lokio/BufferedSink;", "", "source", "([B)Lokio/BufferedSink;", "([BII)Lokio/BufferedSink;", "Lokio/Source;", "", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/BufferedSink;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", util.h.xy.cb.b.f1091, "writeByte", lib.android.paypal.com.magnessdk.g.n2, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lokio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "", "flush", "()V", "emit", "()Lokio/BufferedSink;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "getBuffer", "Lokio/RealBufferedSink;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.ReplaceWith(expression = "buffer", imports = {}))
    okio.Buffer buffer();

    okio.BufferedSink emit() throws java.io.IOException;

    okio.BufferedSink emitCompleteSegments() throws java.io.IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws java.io.IOException;

    okio.Buffer getBuffer();

    java.io.OutputStream outputStream();

    okio.BufferedSink write(okio.ByteString byteString) throws java.io.IOException;

    okio.BufferedSink write(okio.ByteString byteString, int offset, int byteCount) throws java.io.IOException;

    okio.BufferedSink write(okio.Source source, long byteCount) throws java.io.IOException;

    okio.BufferedSink write(byte[] source) throws java.io.IOException;

    okio.BufferedSink write(byte[] source, int offset, int byteCount) throws java.io.IOException;

    long writeAll(okio.Source source) throws java.io.IOException;

    okio.BufferedSink writeByte(int b) throws java.io.IOException;

    okio.BufferedSink writeDecimalLong(long v) throws java.io.IOException;

    okio.BufferedSink writeHexadecimalUnsignedLong(long v) throws java.io.IOException;

    okio.BufferedSink writeInt(int i) throws java.io.IOException;

    okio.BufferedSink writeIntLe(int i) throws java.io.IOException;

    okio.BufferedSink writeLong(long v) throws java.io.IOException;

    okio.BufferedSink writeLongLe(long v) throws java.io.IOException;

    okio.BufferedSink writeShort(int s) throws java.io.IOException;

    okio.BufferedSink writeShortLe(int s) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String string, java.nio.charset.Charset charset) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String string) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String string, int beginIndex, int endIndex) throws java.io.IOException;

    okio.BufferedSink writeUtf8CodePoint(int codePoint) throws java.io.IOException;
}
