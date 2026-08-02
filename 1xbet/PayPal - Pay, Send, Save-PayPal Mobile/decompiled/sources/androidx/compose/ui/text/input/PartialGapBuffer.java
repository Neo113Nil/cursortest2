package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "replace", "(IILjava/lang/String;)V", "index", "", "get", "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "setText", "Landroidx/compose/ui/text/input/GapBuffer;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/input/GapBuffer;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getLength", "()I", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.GapBuffer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes = -1;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges = -1;
    private java.lang.String text;
    public static final int $stable = 8;

    public PartialGapBuffer(java.lang.String str) {
        this.text = str;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final void setText(java.lang.String str) {
        this.text = str;
    }

    public final int getLength() {
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.getHighSpeedVideoFpsRanges - this.getHighSpeedVideoSizes)) + (gapBuffer.Camera2StreamConfigurationMap - (gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes));
    }

    public final void replace(int start, int end, java.lang.String text) {
        while (true) {
            if (start > end) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("start index must be less than or equal to end index: ");
                sb.append(start);
                sb.append(" > ");
                sb.append(end);
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            if (start < 0) {
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was ".concat(java.lang.String.valueOf(start)));
            }
            androidx.compose.ui.text.input.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
            if (gapBuffer == null) {
                int max = java.lang.Math.max(255, text.length() + 128);
                char[] cArr = new char[max];
                int min = java.lang.Math.min(start, 64);
                int min2 = java.lang.Math.min(this.text.length() - end, 64);
                int i = start - min;
                androidx.compose.ui.text.input.GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i, start);
                int i2 = max - min2;
                int i3 = min2 + end;
                androidx.compose.ui.text.input.GapBuffer_jvmKt.toCharArray(this.text, cArr, i2, end, i3);
                androidx.compose.ui.text.input.GapBuffer_jvmKt.toCharArray(text, cArr, min, 0, text.length());
                this.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.input.GapBuffer(cArr, min + text.length(), i2);
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRanges = i3;
                return;
            }
            int i4 = this.getHighSpeedVideoSizes;
            int i5 = start - i4;
            int i6 = end - i4;
            if (i5 < 0 || i6 > gapBuffer.Camera2StreamConfigurationMap - (gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes)) {
                this.text = toString();
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = -1;
                this.getHighSpeedVideoFpsRanges = -1;
            } else {
                int length = text.length() - (i6 - i5);
                if (length > gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes) {
                    int i7 = gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes;
                    int i8 = gapBuffer.Camera2StreamConfigurationMap;
                    do {
                        i8 *= 2;
                    } while (i8 - gapBuffer.Camera2StreamConfigurationMap < length - i7);
                    char[] cArr2 = new char[i8];
                    kotlin.collections.ArraysKt.copyInto(gapBuffer.getHighSpeedVideoFpsRanges, cArr2, 0, 0, gapBuffer.getHighSpeedVideoSizes);
                    int i9 = gapBuffer.Camera2StreamConfigurationMap;
                    int i10 = gapBuffer.getHighSpeedVideoFpsRangesFor;
                    int i11 = i9 - i10;
                    int i12 = i8 - i11;
                    kotlin.collections.ArraysKt.copyInto(gapBuffer.getHighSpeedVideoFpsRanges, cArr2, i12, i10, i11 + i10);
                    gapBuffer.getHighSpeedVideoFpsRanges = cArr2;
                    gapBuffer.Camera2StreamConfigurationMap = i8;
                    gapBuffer.getHighSpeedVideoFpsRangesFor = i12;
                }
                int i13 = gapBuffer.getHighSpeedVideoSizes;
                if (i5 < i13 && i6 <= i13) {
                    int i14 = i13 - i6;
                    char[] cArr3 = gapBuffer.getHighSpeedVideoFpsRanges;
                    kotlin.collections.ArraysKt.copyInto(cArr3, cArr3, gapBuffer.getHighSpeedVideoFpsRangesFor - i14, i6, i13);
                    gapBuffer.getHighSpeedVideoSizes = i5;
                    gapBuffer.getHighSpeedVideoFpsRangesFor -= i14;
                } else if (i5 < i13 && i6 >= i13) {
                    gapBuffer.getHighSpeedVideoFpsRangesFor = i6 + (gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes);
                    gapBuffer.getHighSpeedVideoSizes = i5;
                } else {
                    int i15 = i5 + (gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes);
                    int i16 = gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes;
                    int i17 = gapBuffer.getHighSpeedVideoFpsRangesFor;
                    char[] cArr4 = gapBuffer.getHighSpeedVideoFpsRanges;
                    kotlin.collections.ArraysKt.copyInto(cArr4, cArr4, gapBuffer.getHighSpeedVideoSizes, i17, i15);
                    gapBuffer.getHighSpeedVideoSizes += i15 - i17;
                    gapBuffer.getHighSpeedVideoFpsRangesFor = i6 + i16;
                }
                androidx.compose.ui.text.input.GapBuffer_jvmKt.toCharArray(text, gapBuffer.getHighSpeedVideoFpsRanges, gapBuffer.getHighSpeedVideoSizes, 0, text.length());
                gapBuffer.getHighSpeedVideoSizes += text.length();
                return;
            }
        }
    }

    public final char get(int index) {
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        if (gapBuffer == null) {
            return this.text.charAt(index);
        }
        if (index < this.getHighSpeedVideoSizes) {
            return this.text.charAt(index);
        }
        int i = gapBuffer.Camera2StreamConfigurationMap - (gapBuffer.getHighSpeedVideoFpsRangesFor - gapBuffer.getHighSpeedVideoSizes);
        int i2 = this.getHighSpeedVideoSizes;
        if (index >= i + i2) {
            return this.text.charAt(index - ((i - this.getHighSpeedVideoFpsRanges) + i2));
        }
        int i3 = index - i2;
        int i4 = gapBuffer.getHighSpeedVideoSizes;
        if (i3 < i4) {
            return gapBuffer.getHighSpeedVideoFpsRanges[i3];
        }
        return gapBuffer.getHighSpeedVideoFpsRanges[(i3 - i4) + gapBuffer.getHighSpeedVideoFpsRangesFor];
    }

    public final java.lang.String toString() {
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        if (gapBuffer == null) {
            return this.text;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) this.text, 0, this.getHighSpeedVideoSizes);
        sb.append(gapBuffer.getHighSpeedVideoFpsRanges, 0, gapBuffer.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        char[] cArr = gapBuffer.getHighSpeedVideoFpsRanges;
        int i = gapBuffer.getHighSpeedVideoFpsRangesFor;
        sb.append(cArr, i, gapBuffer.Camera2StreamConfigurationMap - i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.String str = this.text;
        sb.append((java.lang.CharSequence) str, this.getHighSpeedVideoFpsRanges, str.length());
        return sb.toString();
    }
}
