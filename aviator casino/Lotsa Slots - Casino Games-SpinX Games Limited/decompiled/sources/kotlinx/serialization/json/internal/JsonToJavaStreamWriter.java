package kotlinx.serialization.json.internal;

/* compiled from: JvmJsonStreams.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\u0011\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000bH\u0082\bJ\u0011\u0010\u0013\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000bH\u0082\bJ\t\u0010\"\u001a\u00020\u000bH\u0082\bJ\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "stream", "Ljava/io/OutputStream;", "<init>", "(Ljava/io/OutputStream;)V", "buffer", "", "charArray", "", "indexInBuffer", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "appendStringSlowPath", "currentSize", "string", "ensureTotalCapacity", "oldSize", "additional", "release", "flush", "ensure", "bytesCount", "byte", "rest", "writeUtf8", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "writeUtf8CodePoint", "codePoint", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToJavaStreamWriter implements kotlinx.serialization.json.internal.InternalJsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final java.io.OutputStream stream;

    public JsonToJavaStreamWriter(java.io.OutputStream stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = kotlinx.serialization.json.internal.ByteArrayPool.INSTANCE.take();
        this.charArray = kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.take();
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        write(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char r1) {
        writeUtf8CodePoint(r1);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length && kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i2, text);
                return;
            }
        }
        cArr[i] = '\"';
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void appendStringSlowPath(int currentSize, java.lang.String string) {
        int i;
        int length = string.length();
        for (int i2 = currentSize - 1; i2 < length; i2++) {
            int ensureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char charAt = string.charAt(i2);
            if (charAt < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length) {
                byte b = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b == 0) {
                    i = ensureTotalCapacity + 1;
                    this.charArray[ensureTotalCapacity] = charAt;
                } else {
                    if (b == 1) {
                        java.lang.String str = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        int ensureTotalCapacity2 = ensureTotalCapacity(ensureTotalCapacity, str.length());
                        str.getChars(0, str.length(), this.charArray, ensureTotalCapacity2);
                        currentSize = ensureTotalCapacity2 + str.length();
                    } else {
                        char[] cArr = this.charArray;
                        cArr[ensureTotalCapacity] = '\\';
                        cArr[ensureTotalCapacity + 1] = (char) b;
                        currentSize = ensureTotalCapacity + 2;
                    }
                }
            } else {
                i = ensureTotalCapacity + 1;
                this.charArray[ensureTotalCapacity] = charAt;
            }
            currentSize = i;
        }
        ensureTotalCapacity(currentSize, 1);
        char[] cArr2 = this.charArray;
        cArr2[currentSize] = '\"';
        writeUtf8(cArr2, currentSize + 1);
        flush();
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i = additional + oldSize;
        char[] cArr = this.charArray;
        if (cArr.length <= i) {
            char[] copyOf = java.util.Arrays.copyOf(cArr, kotlin.ranges.RangesKt.coerceAtLeast(i, oldSize * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.charArray = copyOf;
        }
        return oldSize;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        flush();
        kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.release(this.charArray);
        kotlinx.serialization.json.internal.ByteArrayPool.INSTANCE.release(this.buffer);
    }

    private final void flush() {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final void write(int r4) {
        byte[] bArr = this.buffer;
        int i = this.indexInBuffer;
        this.indexInBuffer = i + 1;
        bArr[i] = (byte) r4;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] string, int count) {
        if (count < 0) {
            throw new java.lang.IllegalArgumentException("count < 0".toString());
        }
        if (count > string.length) {
            throw new java.lang.IllegalArgumentException(("count > string.length: " + count + " > " + string.length).toString());
        }
        int i = 0;
        while (i < count) {
            char c = string[i];
            if (c < 128) {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr = this.buffer;
                int i2 = this.indexInBuffer;
                int i3 = i2 + 1;
                this.indexInBuffer = i3;
                bArr[i2] = (byte) c;
                i++;
                int min = java.lang.Math.min(count, (bArr.length - i3) + i);
                while (i < min) {
                    char c2 = string[i];
                    if (c2 < 128) {
                        byte[] bArr2 = this.buffer;
                        int i4 = this.indexInBuffer;
                        this.indexInBuffer = i4 + 1;
                        bArr2[i4] = (byte) c2;
                        i++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    byte[] bArr3 = this.buffer;
                    int i5 = this.indexInBuffer;
                    bArr3[i5] = (byte) ((c >> 6) | 192);
                    this.indexInBuffer = i5 + 2;
                    bArr3[i5 + 1] = (byte) ((c & '?') | 128);
                } else if (c >= 55296 && c <= 57343) {
                    int i6 = i + 1;
                    char c3 = i6 < count ? string[i6] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr4 = this.buffer;
                        int i7 = this.indexInBuffer;
                        this.indexInBuffer = i7 + 1;
                        bArr4[i7] = (byte) 63;
                        i = i6;
                    } else {
                        int i8 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i9 = this.indexInBuffer;
                        bArr5[i9] = (byte) ((i8 >> 18) | 240);
                        bArr5[i9 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                        bArr5[i9 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                        this.indexInBuffer = i9 + 4;
                        bArr5[i9 + 3] = (byte) ((i8 & 63) | 128);
                        i += 2;
                    }
                } else {
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    byte[] bArr6 = this.buffer;
                    int i10 = this.indexInBuffer;
                    bArr6[i10] = (byte) ((c >> '\f') | 224);
                    bArr6[i10 + 1] = (byte) (((c >> 6) & 63) | 128);
                    this.indexInBuffer = i10 + 3;
                    bArr6[i10 + 2] = (byte) ((c & '?') | 128);
                }
                i++;
            }
        }
    }

    private final void ensure(int bytesCount) {
        if (this.buffer.length - this.indexInBuffer < bytesCount) {
            flush();
        }
    }

    private final void writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i = this.indexInBuffer;
            this.indexInBuffer = i + 1;
            bArr[i] = (byte) codePoint;
            return;
        }
        if (codePoint < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.indexInBuffer;
            bArr2[i2] = (byte) ((codePoint >> 6) | 192);
            this.indexInBuffer = i2 + 2;
            bArr2[i2 + 1] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i3 = this.indexInBuffer;
            this.indexInBuffer = i3 + 1;
            bArr3[i3] = (byte) 63;
            return;
        }
        if (codePoint < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.indexInBuffer;
            bArr4[i4] = (byte) ((codePoint >> 12) | 224);
            bArr4[i4 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i4 + 3;
            bArr4[i4 + 2] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (codePoint > 1114111) {
            throw new kotlinx.serialization.json.internal.JsonEncodingException("Unexpected code point: " + codePoint);
        }
        if (this.buffer.length - this.indexInBuffer < 4) {
            flush();
        }
        byte[] bArr5 = this.buffer;
        int i5 = this.indexInBuffer;
        bArr5[i5] = (byte) ((codePoint >> 18) | 240);
        bArr5[i5 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr5[i5 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        this.indexInBuffer = i5 + 4;
        bArr5[i5 + 3] = (byte) ((codePoint & 63) | 128);
    }
}
