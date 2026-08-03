package kotlinx.serialization.json.internal;

/* compiled from: CharsetReader.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "decoder", "Ljava/nio/charset/CharsetDecoder;", "byteBuffer", "Ljava/nio/ByteBuffer;", "hasLeftoverPotentiallySurrogateChar", "", "leftoverChar", "", "read", "", "array", "", "offset", "length", "doRead", "fillByteBuffer", "oneShotReadSlowPath", "release", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CharsetReader {
    private final java.nio.ByteBuffer byteBuffer;
    private final java.nio.charset.Charset charset;
    private final java.nio.charset.CharsetDecoder decoder;
    private boolean hasLeftoverPotentiallySurrogateChar;
    private final java.io.InputStream inputStream;
    private char leftoverChar;

    public CharsetReader(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        java.nio.charset.CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.decoder = onUnmappableCharacter;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(kotlinx.serialization.json.internal.ByteArrayPool8k.INSTANCE.take());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        this.byteBuffer = wrap;
        wrap.flip();
    }

    public final int read(char[] array, int offset, int length) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        int i = 0;
        if (length == 0) {
            return 0;
        }
        if (offset < 0 || offset >= array.length || length < 0 || offset + length > array.length) {
            throw new java.lang.IllegalArgumentException(("Unexpected arguments: " + offset + ", " + length + ", " + array.length).toString());
        }
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[offset] = this.leftoverChar;
            offset++;
            length--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            if (length == 0) {
                return 1;
            }
            i = 1;
        }
        if (length == 1) {
            int oneShotReadSlowPath = oneShotReadSlowPath();
            if (oneShotReadSlowPath != -1) {
                array[offset] = (char) oneShotReadSlowPath;
                return i + 1;
            }
            if (i == 0) {
                return -1;
            }
            return i;
        }
        return doRead(array, offset, length) + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r1.decoder.reset();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int doRead(char[] array, int offset, int length) {
        java.nio.CharBuffer wrap = java.nio.CharBuffer.wrap(array, offset, length);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            java.nio.charset.CoderResult decode = this.decoder.decode(this.byteBuffer, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining()) {
                    break;
                }
                if (fillByteBuffer() < 0) {
                    if (wrap.position() == 0 && !this.byteBuffer.hasRemaining()) {
                        break;
                    }
                    this.decoder.reset();
                    z = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    wrap.position();
                    break;
                }
                decode.throwException();
            }
            if (wrap.position() == 0) {
                return -1;
            }
            return wrap.position();
        }
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int limit = this.byteBuffer.limit();
            int position = this.byteBuffer.position();
            int read = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            java.nio.ByteBuffer byteBuffer = this.byteBuffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.byteBuffer.flip();
            return this.byteBuffer.remaining();
        } finally {
            this.byteBuffer.flip();
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] cArr = new char[2];
        int read = read(cArr, 0, 2);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return cArr[0];
        }
        if (read == 2) {
            this.leftoverChar = cArr[1];
            this.hasLeftoverPotentiallySurrogateChar = true;
            return cArr[0];
        }
        throw new java.lang.IllegalStateException(("Unreachable state: " + read).toString());
    }

    public final void release() {
        kotlinx.serialization.json.internal.ByteArrayPool8k byteArrayPool8k = kotlinx.serialization.json.internal.ByteArrayPool8k.INSTANCE;
        byte[] array = this.byteBuffer.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        byteArrayPool8k.release(array);
    }
}
