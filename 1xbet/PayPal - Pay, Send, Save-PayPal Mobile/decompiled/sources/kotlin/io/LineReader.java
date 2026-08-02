package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0013\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u00060!j\u0002`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lkotlin/io/LineReader;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "readLine", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "p0", "", "Camera2StreamConfigurationMap", "(Z)I", "", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "getInputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoFpsRanges", "[B", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "[C", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "Ljava/nio/CharBuffer;", "Ljava/nio/CharBuffer;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "getOutputMinFrameDuration", "Ljava/lang/StringBuilder;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LineReader {
    private static java.nio.charset.CharsetDecoder Camera2StreamConfigurationMap;
    public static final kotlin.io.LineReader INSTANCE = new kotlin.io.LineReader();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.nio.ByteBuffer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.nio.CharBuffer getInputSizeshNQ4ISI;
    private static final char[] getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.lang.StringBuilder getHighSpeedVideoSizesFor;

    private LineReader() {
    }

    static {
        byte[] bArr = new byte[32];
        getHighResolutionOutputSizeshNQ4ISI = bArr;
        char[] cArr = new char[32];
        getHighSpeedVideoSizes = cArr;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap, "");
        getHighSpeedVideoFpsRanges = wrap;
        java.nio.CharBuffer wrap2 = java.nio.CharBuffer.wrap(cArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap2, "");
        getInputSizeshNQ4ISI = wrap2;
        getHighSpeedVideoSizesFor = new java.lang.StringBuilder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if (r12 <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        r11 = kotlin.io.LineReader.getHighSpeedVideoSizes;
        r0 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if (r11[r0] != '\n') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r0 <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        r12 = r12 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (r11[r12] != '\r') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r11 = kotlin.io.LineReader.getHighSpeedVideoSizesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        if (r11.length() != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        r11 = new java.lang.String(kotlin.io.LineReader.getHighSpeedVideoSizes, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        r11.append(kotlin.io.LineReader.getHighSpeedVideoSizes, 0, r12);
        r12 = r11.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        if (r11.length() <= 32) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        r11.setLength(32);
        r11.trimToSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        r11.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.charset(), r12) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String readLine(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        int Camera2StreamConfigurationMap2;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
            java.nio.charset.CharsetDecoder charsetDecoder = Camera2StreamConfigurationMap;
            java.nio.charset.CharsetDecoder charsetDecoder2 = null;
            if (charsetDecoder != null) {
                if (charsetDecoder == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    charsetDecoder = null;
                }
            }
            java.nio.charset.CharsetDecoder newDecoder = charset.newDecoder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newDecoder, "");
            Camera2StreamConfigurationMap = newDecoder;
            java.nio.ByteBuffer byteBuffer = getHighSpeedVideoFpsRanges;
            byteBuffer.clear();
            java.nio.CharBuffer charBuffer = getInputSizeshNQ4ISI;
            charBuffer.clear();
            byteBuffer.put((byte) 10);
            byteBuffer.flip();
            java.nio.charset.CharsetDecoder charsetDecoder3 = Camera2StreamConfigurationMap;
            if (charsetDecoder3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                charsetDecoder3 = null;
            }
            charsetDecoder3.decode(byteBuffer, charBuffer, false);
            getHighSpeedVideoFpsRangesFor = charBuffer.position() == 1 && charBuffer.get(0) == '\n';
            Camera2StreamConfigurationMap();
            int i = 0;
            int i2 = 0;
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    if (getHighSpeedVideoSizesFor.length() == 0 && i == 0 && i2 == 0) {
                        return null;
                    }
                    java.nio.ByteBuffer byteBuffer2 = getHighSpeedVideoFpsRanges;
                    byteBuffer2.limit(i);
                    getInputSizeshNQ4ISI.position(i2);
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(true);
                    java.nio.charset.CharsetDecoder charsetDecoder4 = Camera2StreamConfigurationMap;
                    if (charsetDecoder4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        charsetDecoder2 = charsetDecoder4;
                    }
                    charsetDecoder2.reset();
                    byteBuffer2.position(0);
                } else {
                    int i3 = i + 1;
                    getHighResolutionOutputSizeshNQ4ISI[i] = (byte) read;
                    if (read != 10 && i3 != 32 && getHighSpeedVideoFpsRangesFor) {
                        i = i3;
                    }
                    java.nio.ByteBuffer byteBuffer3 = getHighSpeedVideoFpsRanges;
                    byteBuffer3.limit(i3);
                    getInputSizeshNQ4ISI.position(i2);
                    i2 = Camera2StreamConfigurationMap(false);
                    if (i2 > 0 && getHighSpeedVideoSizes[i2 - 1] == '\n') {
                        byteBuffer3.position(0);
                        Camera2StreamConfigurationMap2 = i2;
                        break;
                    }
                    byteBuffer3.compact();
                    int position = byteBuffer3.position();
                    byteBuffer3.position(0);
                    i = position;
                }
            }
        }
    }

    private static int Camera2StreamConfigurationMap(boolean p0) {
        while (true) {
            java.nio.charset.CharsetDecoder charsetDecoder = Camera2StreamConfigurationMap;
            if (charsetDecoder == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                charsetDecoder = null;
            }
            java.nio.ByteBuffer byteBuffer = getHighSpeedVideoFpsRanges;
            java.nio.CharBuffer charBuffer = getInputSizeshNQ4ISI;
            java.nio.charset.CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, p0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
            if (decode.isError()) {
                Camera2StreamConfigurationMap();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            java.lang.StringBuilder sb = getHighSpeedVideoSizesFor;
            char[] cArr = getHighSpeedVideoSizes;
            int i = position - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private static void Camera2StreamConfigurationMap() {
        java.nio.charset.CharsetDecoder charsetDecoder = Camera2StreamConfigurationMap;
        if (charsetDecoder == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        getHighSpeedVideoFpsRanges.position(0);
        getHighSpeedVideoSizesFor.setLength(0);
    }
}
