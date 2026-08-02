package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010'\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "textStart", "textEnd", "", "replace", "(IILjava/lang/CharSequence;II)V", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/CharSequence;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getLength", "()I", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PartialGapBuffer implements java.lang.CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes = -1;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.GapBuffer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    public PartialGapBuffer(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRanges = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public final int getLength() {
        androidx.compose.foundation.text.input.internal.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        return gapBuffer == null ? this.getHighSpeedVideoFpsRanges.length() : (this.getHighSpeedVideoFpsRanges.length() - (this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI)) + (gapBuffer.getHighSpeedVideoFpsRanges - (gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes));
    }

    public static /* synthetic */ void replace$default(androidx.compose.foundation.text.input.internal.PartialGapBuffer partialGapBuffer, int i, int i2, java.lang.CharSequence charSequence, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        partialGapBuffer.replace(i, i2, charSequence, i6, i4);
    }

    public final void replace(int start, int end, java.lang.CharSequence text, int textStart, int textEnd) {
        while (true) {
            if (start > end) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("start=");
                sb.append(start);
                sb.append(" > end=");
                sb.append(end);
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            if (textStart > textEnd) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textStart=");
                sb2.append(textStart);
                sb2.append(" > textEnd=");
                sb2.append(textEnd);
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
            }
            if (start < 0) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was ".concat(java.lang.String.valueOf(start)));
            }
            if (textStart < 0) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was ".concat(java.lang.String.valueOf(textStart)));
            }
            androidx.compose.foundation.text.input.internal.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
            int i = textEnd - textStart;
            if (gapBuffer == null) {
                int max = java.lang.Math.max(255, i + 128);
                char[] cArr = new char[max];
                int min = java.lang.Math.min(start, 64);
                int min2 = java.lang.Math.min(this.getHighSpeedVideoFpsRanges.length() - end, 64);
                int i2 = start - min;
                androidx.compose.foundation.text.input.internal.ToCharArray_androidKt.toCharArray(this.getHighSpeedVideoFpsRanges, cArr, 0, i2, start);
                int i3 = max - min2;
                int i4 = min2 + end;
                androidx.compose.foundation.text.input.internal.ToCharArray_androidKt.toCharArray(this.getHighSpeedVideoFpsRanges, cArr, i3, end, i4);
                androidx.compose.foundation.text.input.internal.ToCharArray_androidKt.toCharArray(text, cArr, min, textStart, textEnd);
                this.getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.input.internal.GapBuffer(cArr, min + i, i3);
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                this.getHighSpeedVideoSizes = i4;
                return;
            }
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = start - i5;
            int i7 = end - i5;
            if (i6 < 0 || i7 > gapBuffer.getHighSpeedVideoFpsRanges - (gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes)) {
                this.getHighSpeedVideoFpsRanges = toString();
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getHighSpeedVideoSizes = -1;
            } else {
                int i8 = i - (i7 - i6);
                if (i8 > gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes) {
                    int i9 = gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes;
                    int i10 = gapBuffer.getHighSpeedVideoFpsRanges;
                    do {
                        i10 *= 2;
                    } while (i10 - gapBuffer.getHighSpeedVideoFpsRanges < i8 - i9);
                    char[] cArr2 = new char[i10];
                    kotlin.collections.ArraysKt.copyInto(gapBuffer.getHighSpeedVideoFpsRangesFor, cArr2, 0, 0, gapBuffer.getHighSpeedVideoSizes);
                    int i11 = gapBuffer.getHighSpeedVideoFpsRanges;
                    int i12 = gapBuffer.Camera2StreamConfigurationMap;
                    int i13 = i11 - i12;
                    int i14 = i10 - i13;
                    kotlin.collections.ArraysKt.copyInto(gapBuffer.getHighSpeedVideoFpsRangesFor, cArr2, i14, i12, i13 + i12);
                    gapBuffer.getHighSpeedVideoFpsRangesFor = cArr2;
                    gapBuffer.getHighSpeedVideoFpsRanges = i10;
                    gapBuffer.Camera2StreamConfigurationMap = i14;
                }
                int i15 = gapBuffer.getHighSpeedVideoSizes;
                if (i6 < i15 && i7 <= i15) {
                    int i16 = i15 - i7;
                    char[] cArr3 = gapBuffer.getHighSpeedVideoFpsRangesFor;
                    kotlin.collections.ArraysKt.copyInto(cArr3, cArr3, gapBuffer.Camera2StreamConfigurationMap - i16, i7, i15);
                    gapBuffer.getHighSpeedVideoSizes = i6;
                    gapBuffer.Camera2StreamConfigurationMap -= i16;
                } else if (i6 < i15 && i7 >= i15) {
                    gapBuffer.Camera2StreamConfigurationMap = i7 + (gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes);
                    gapBuffer.getHighSpeedVideoSizes = i6;
                } else {
                    int i17 = i6 + (gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes);
                    int i18 = gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes;
                    int i19 = gapBuffer.Camera2StreamConfigurationMap;
                    char[] cArr4 = gapBuffer.getHighSpeedVideoFpsRangesFor;
                    kotlin.collections.ArraysKt.copyInto(cArr4, cArr4, gapBuffer.getHighSpeedVideoSizes, i19, i17);
                    gapBuffer.getHighSpeedVideoSizes += i17 - i19;
                    gapBuffer.Camera2StreamConfigurationMap = i7 + i18;
                }
                androidx.compose.foundation.text.input.internal.ToCharArray_androidKt.toCharArray(text, gapBuffer.getHighSpeedVideoFpsRangesFor, gapBuffer.getHighSpeedVideoSizes, textStart, textEnd);
                gapBuffer.getHighSpeedVideoSizes += i;
                return;
            }
        }
    }

    public final char get(int index) {
        androidx.compose.foundation.text.input.internal.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        if (gapBuffer == null) {
            return this.getHighSpeedVideoFpsRanges.charAt(index);
        }
        if (index < this.getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRanges.charAt(index);
        }
        int i = gapBuffer.getHighSpeedVideoFpsRanges - (gapBuffer.Camera2StreamConfigurationMap - gapBuffer.getHighSpeedVideoSizes);
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (index >= i + i2) {
            return this.getHighSpeedVideoFpsRanges.charAt(index - ((i - this.getHighSpeedVideoSizes) + i2));
        }
        int i3 = index - i2;
        int i4 = gapBuffer.getHighSpeedVideoSizes;
        if (i3 < i4) {
            return gapBuffer.getHighSpeedVideoFpsRangesFor[i3];
        }
        return gapBuffer.getHighSpeedVideoFpsRangesFor[(i3 - i4) + gapBuffer.Camera2StreamConfigurationMap];
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        return toString().subSequence(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        androidx.compose.foundation.text.input.internal.GapBuffer gapBuffer = this.getHighSpeedVideoFpsRangesFor;
        if (gapBuffer == null) {
            return this.getHighSpeedVideoFpsRanges.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges, 0, this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(gapBuffer.getHighSpeedVideoFpsRangesFor, 0, gapBuffer.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        char[] cArr = gapBuffer.getHighSpeedVideoFpsRangesFor;
        int i = gapBuffer.Camera2StreamConfigurationMap;
        sb.append(cArr, i, gapBuffer.getHighSpeedVideoFpsRanges - i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRanges;
        sb.append(charSequence, this.getHighSpeedVideoSizes, charSequence.length());
        return sb.toString();
    }

    public final boolean contentEquals(java.lang.CharSequence other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(toString(), other.toString());
    }
}
