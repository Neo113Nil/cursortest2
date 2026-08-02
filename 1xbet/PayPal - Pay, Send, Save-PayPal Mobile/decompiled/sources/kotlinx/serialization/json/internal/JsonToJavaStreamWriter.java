package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Ljava/io/OutputStream;", "stream", "<init>", "(Ljava/io/OutputStream;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(II)I", "release", "()V", "", "getHighSpeedVideoFpsRangesFor", "([CI)V", "Ljava/io/OutputStream;", "Camera2StreamConfigurationMap", "", "getHighResolutionOutputSizeshNQ4ISI", "[B", "[C", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JsonToJavaStreamWriter implements kotlinx.serialization.json.internal.InternalJsonWriter {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.OutputStream Camera2StreamConfigurationMap;
    private char[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public JsonToJavaStreamWriter(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        this.Camera2StreamConfigurationMap = outputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.json.internal.ByteArrayPool.INSTANCE.take();
        this.getHighSpeedVideoFpsRangesFor = kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.take();
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeLong(long value) {
        write(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void write(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        int length = text.length();
        getHighSpeedVideoFpsRanges(0, length);
        text.getChars(0, length, this.getHighSpeedVideoFpsRangesFor, 0);
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeQuoted(java.lang.String text) {
        byte b;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        getHighSpeedVideoFpsRanges(0, text.length() + 2);
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c < kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length && kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                int length2 = text.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i3, 2);
                    char charAt = text.charAt(i4);
                    if (charAt >= kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS().length || (b = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_MARKERS()[charAt]) == 0) {
                        this.getHighSpeedVideoFpsRangesFor[highSpeedVideoFpsRanges] = charAt;
                        i3 = highSpeedVideoFpsRanges + 1;
                    } else {
                        if (b == 1) {
                            java.lang.String str = kotlinx.serialization.json.internal.StringOpsKt.getESCAPE_STRINGS()[charAt];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, str.length());
                            str.getChars(0, str.length(), this.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges2);
                            i = highSpeedVideoFpsRanges2 + str.length();
                        } else {
                            char[] cArr2 = this.getHighSpeedVideoFpsRangesFor;
                            cArr2[highSpeedVideoFpsRanges] = '\\';
                            cArr2[highSpeedVideoFpsRanges + 1] = (char) b;
                            i = highSpeedVideoFpsRanges + 2;
                        }
                        i3 = i;
                    }
                }
                getHighSpeedVideoFpsRanges(i3, 1);
                char[] cArr3 = this.getHighSpeedVideoFpsRangesFor;
                cArr3[i3] = '\"';
                getHighSpeedVideoFpsRangesFor(cArr3, i3 + 1);
                this.Camera2StreamConfigurationMap.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoFpsRanges = 0;
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        getHighSpeedVideoFpsRangesFor(cArr, length + 2);
        this.Camera2StreamConfigurationMap.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = 0;
    }

    @kotlin.IgnorableReturnValue
    private final int getHighSpeedVideoFpsRanges(int p0, int p1) {
        int i = p1 + p0;
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        if (cArr.length <= i) {
            char[] copyOf = java.util.Arrays.copyOf(cArr, kotlin.ranges.RangesKt.coerceAtLeast(i, p0 * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighSpeedVideoFpsRangesFor = copyOf;
        }
        return p0;
    }

    private final void getHighSpeedVideoFpsRangesFor(char[] p0, int p1) {
        if (p1 < 0) {
            throw new java.lang.IllegalArgumentException("count < 0".toString());
        }
        if (p1 > p0.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("count > string.length: ");
            sb.append(p1);
            sb.append(" > ");
            sb.append(p0.length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        int i = 0;
        while (i < p1) {
            char c = p0[i];
            if (c < 128) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int length = bArr.length;
                int i2 = this.getHighSpeedVideoFpsRanges;
                if (length - i2 <= 0) {
                    this.Camera2StreamConfigurationMap.write(bArr, 0, i2);
                    this.getHighSpeedVideoFpsRanges = 0;
                }
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoFpsRanges;
                int i4 = i3 + 1;
                this.getHighSpeedVideoFpsRanges = i4;
                bArr2[i3] = (byte) c;
                i++;
                int min = java.lang.Math.min(p1, (bArr2.length - i4) + i);
                while (i < min) {
                    char c2 = p0[i];
                    if (c2 < 128) {
                        byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = this.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges = i5 + 1;
                        bArr3[i5] = (byte) c2;
                        i++;
                    }
                }
            } else {
                if (c < 2048) {
                    byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int length2 = bArr4.length;
                    int i6 = this.getHighSpeedVideoFpsRanges;
                    if (length2 - i6 < 2) {
                        this.Camera2StreamConfigurationMap.write(bArr4, 0, i6);
                        this.getHighSpeedVideoFpsRanges = 0;
                    }
                    byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i7 = this.getHighSpeedVideoFpsRanges;
                    bArr5[i7] = (byte) ((c >> 6) | 192);
                    this.getHighSpeedVideoFpsRanges = i7 + 2;
                    bArr5[i7 + 1] = (byte) ((c & '?') | 128);
                } else if (c >= 55296 && c <= 57343) {
                    int i8 = i + 1;
                    char c3 = i8 < p1 ? p0[i8] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int length3 = bArr6.length;
                        int i9 = this.getHighSpeedVideoFpsRanges;
                        if (length3 - i9 <= 0) {
                            this.Camera2StreamConfigurationMap.write(bArr6, 0, i9);
                            this.getHighSpeedVideoFpsRanges = 0;
                        }
                        byte[] bArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i10 = this.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges = i10 + 1;
                        bArr7[i10] = 63;
                        i = i8;
                    } else {
                        int i11 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        byte[] bArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int length4 = bArr8.length;
                        int i12 = this.getHighSpeedVideoFpsRanges;
                        if (length4 - i12 < 4) {
                            this.Camera2StreamConfigurationMap.write(bArr8, 0, i12);
                            this.getHighSpeedVideoFpsRanges = 0;
                        }
                        byte[] bArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i13 = this.getHighSpeedVideoFpsRanges;
                        bArr9[i13] = (byte) ((i11 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr9[i13 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr9[i13 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        this.getHighSpeedVideoFpsRanges = i13 + 4;
                        bArr9[i13 + 3] = (byte) ((i11 & 63) | 128);
                        i += 2;
                    }
                } else {
                    byte[] bArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int length5 = bArr10.length;
                    int i14 = this.getHighSpeedVideoFpsRanges;
                    if (length5 - i14 < 3) {
                        this.Camera2StreamConfigurationMap.write(bArr10, 0, i14);
                        this.getHighSpeedVideoFpsRanges = 0;
                    }
                    byte[] bArr11 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i15 = this.getHighSpeedVideoFpsRanges;
                    bArr11[i15] = (byte) ((c >> '\f') | 224);
                    bArr11[i15 + 1] = (byte) ((63 & (c >> 6)) | 128);
                    this.getHighSpeedVideoFpsRanges = i15 + 3;
                    bArr11[i15 + 2] = (byte) ((c & '?') | 128);
                }
                i++;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void release() {
        this.Camera2StreamConfigurationMap.write(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = 0;
        kotlinx.serialization.json.internal.CharArrayPool.INSTANCE.release(this.getHighSpeedVideoFpsRangesFor);
        kotlinx.serialization.json.internal.ByteArrayPool.INSTANCE.release(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public final void writeChar(char r9) {
        if (r9 < 128) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int length = bArr.length;
            int i = this.getHighSpeedVideoFpsRanges;
            if (length - i <= 0) {
                this.Camera2StreamConfigurationMap.write(bArr, 0, i);
                this.getHighSpeedVideoFpsRanges = 0;
            }
            byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i2 + 1;
            bArr2[i2] = (byte) r9;
            return;
        }
        if (r9 < 2048) {
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int length2 = bArr3.length;
            int i3 = this.getHighSpeedVideoFpsRanges;
            if (length2 - i3 < 2) {
                this.Camera2StreamConfigurationMap.write(bArr3, 0, i3);
                this.getHighSpeedVideoFpsRanges = 0;
            }
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRanges;
            bArr4[i4] = (byte) ((r9 >> 6) | 192);
            this.getHighSpeedVideoFpsRanges = i4 + 2;
            bArr4[i4 + 1] = (byte) ((r9 & '?') | 128);
            return;
        }
        if (55296 <= r9 && r9 < 57344) {
            byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
            int length3 = bArr5.length;
            int i5 = this.getHighSpeedVideoFpsRanges;
            if (length3 - i5 <= 0) {
                this.Camera2StreamConfigurationMap.write(bArr5, 0, i5);
                this.getHighSpeedVideoFpsRanges = 0;
            }
            byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i6 + 1;
            bArr6[i6] = 63;
            return;
        }
        if (r9 < 0) {
            byte[] bArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
            int length4 = bArr7.length;
            int i7 = this.getHighSpeedVideoFpsRanges;
            if (length4 - i7 < 3) {
                this.Camera2StreamConfigurationMap.write(bArr7, 0, i7);
                this.getHighSpeedVideoFpsRanges = 0;
            }
            byte[] bArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i8 = this.getHighSpeedVideoFpsRanges;
            bArr8[i8] = (byte) ((r9 >> '\f') | 224);
            bArr8[i8 + 1] = (byte) (((r9 >> 6) & 63) | 128);
            this.getHighSpeedVideoFpsRanges = i8 + 3;
            bArr8[i8 + 2] = (byte) ((r9 & '?') | 128);
            return;
        }
        if (r9 > 65535) {
            throw new kotlinx.serialization.json.internal.JsonEncodingException("Unexpected code point: ".concat(java.lang.String.valueOf((int) r9)));
        }
        byte[] bArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
        int length5 = bArr9.length;
        int i9 = this.getHighSpeedVideoFpsRanges;
        if (length5 - i9 < 4) {
            this.Camera2StreamConfigurationMap.write(bArr9, 0, i9);
            this.getHighSpeedVideoFpsRanges = 0;
        }
        byte[] bArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i10 = this.getHighSpeedVideoFpsRanges;
        bArr10[i10] = (byte) ((r9 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        bArr10[i10 + 1] = (byte) (((r9 >> '\f') & 63) | 128);
        bArr10[i10 + 2] = (byte) (((r9 >> 6) & 63) | 128);
        this.getHighSpeedVideoFpsRanges = i10 + 4;
        bArr10[i10 + 3] = (byte) ((r9 & '?') | 128);
    }
}
