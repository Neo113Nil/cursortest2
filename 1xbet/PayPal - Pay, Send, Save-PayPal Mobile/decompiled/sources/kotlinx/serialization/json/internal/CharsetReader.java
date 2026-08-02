package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "", "array", "", "offset", "length", "read", "([CII)I", "getHighSpeedVideoFpsRanges", "()I", "", "release", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/InputStream;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "Camera2StreamConfigurationMap", "", "Z", "", "getOutputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CharsetReader {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.InputStream getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.nio.ByteBuffer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.nio.charset.CharsetDecoder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.nio.charset.Charset getHighSpeedVideoFpsRanges;
    private char getOutputFormats;

    public CharsetReader(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        this.getHighSpeedVideoFpsRangesFor = inputStream;
        this.getHighSpeedVideoFpsRanges = charset;
        java.nio.charset.CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = onUnmappableCharacter;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(kotlinx.serialization.json.internal.ByteArrayPool8k.INSTANCE.take());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap, "");
        this.Camera2StreamConfigurationMap = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        if (r0 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        r6.getHighResolutionOutputSizeshNQ4ISI.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        if (r4.position() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        r3 = r4.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        return r3 + r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(char[] array, int offset, int length) {
        int i;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        boolean z = false;
        if (length == 0) {
            return 0;
        }
        if (offset < 0 || offset >= array.length || length < 0 || offset + length > array.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected arguments: ");
            sb.append(offset);
            sb.append(", ");
            sb.append(length);
            sb.append(", ");
            sb.append(array.length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (this.getHighSpeedVideoSizes) {
            array[offset] = this.getOutputFormats;
            offset++;
            length--;
            this.getHighSpeedVideoSizes = false;
            if (length == 0) {
                return 1;
            }
            i = 1;
        } else {
            i = 0;
        }
        int i2 = -1;
        if (length == 1) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizes = false;
                c = this.getOutputFormats;
            } else {
                char[] cArr = new char[2];
                int read = read(cArr, 0, 2);
                if (read == -1) {
                    c = 65535;
                } else if (read == 1) {
                    c = cArr[0];
                } else if (read == 2) {
                    this.getOutputFormats = cArr[1];
                    this.getHighSpeedVideoSizes = true;
                    c = cArr[0];
                } else {
                    throw new java.lang.IllegalStateException("Unreachable state: ".concat(java.lang.String.valueOf(read)).toString());
                }
            }
            if (c == 65535) {
                return i == 0 ? -1 : 1;
            }
            array[offset] = c;
            return i + 1;
        }
        java.nio.CharBuffer wrap = java.nio.CharBuffer.wrap(array, offset, length);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        java.nio.CharBuffer charBuffer = wrap;
        while (true) {
            java.nio.charset.CoderResult decode = this.getHighResolutionOutputSizeshNQ4ISI.decode(this.Camera2StreamConfigurationMap, charBuffer, z);
            if (decode.isUnderflow()) {
                if (z || !charBuffer.hasRemaining()) {
                    break;
                }
                if (getHighSpeedVideoFpsRanges() < 0) {
                    if (charBuffer.position() == 0 && !this.Camera2StreamConfigurationMap.hasRemaining()) {
                        break;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.reset();
                    z = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    charBuffer.position();
                    break;
                }
                decode.throwException();
            }
        }
    }

    private final int getHighSpeedVideoFpsRanges() {
        this.Camera2StreamConfigurationMap.compact();
        try {
            int limit = this.Camera2StreamConfigurationMap.limit();
            int position = this.Camera2StreamConfigurationMap.position();
            int read = this.getHighSpeedVideoFpsRangesFor.read(this.Camera2StreamConfigurationMap.array(), this.Camera2StreamConfigurationMap.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            java.nio.ByteBuffer byteBuffer = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer, "");
            byteBuffer.position(position + read);
            this.Camera2StreamConfigurationMap.flip();
            return this.Camera2StreamConfigurationMap.remaining();
        } finally {
            this.Camera2StreamConfigurationMap.flip();
        }
    }

    public final void release() {
        kotlinx.serialization.json.internal.ByteArrayPool8k byteArrayPool8k = kotlinx.serialization.json.internal.ByteArrayPool8k.INSTANCE;
        byte[] array = this.Camera2StreamConfigurationMap.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        byteArrayPool8k.release(array);
    }
}
