package androidx.compose.foundation.text2.input.internal;

/* compiled from: GapBuffer.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0096\u0002J2\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "", "text", "(Ljava/lang/CharSequence;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/foundation/text2/input/internal/GapBuffer;", "length", "getLength", "()I", "contentEquals", "", "other", "get", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "replace", "", "start", "end", "textStart", "textEnd", "subSequence", "startIndex", "endIndex", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PartialGapBuffer implements java.lang.CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private androidx.compose.foundation.text2.input.internal.GapBuffer buffer;
    private java.lang.CharSequence text;
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(java.lang.CharSequence charSequence) {
        this.text = charSequence;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public int getLength() {
        androidx.compose.foundation.text2.input.internal.GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public static /* synthetic */ void replace$default(androidx.compose.foundation.text2.input.internal.PartialGapBuffer partialGapBuffer, int i, int i2, java.lang.CharSequence charSequence, int i3, int i4, int i5, java.lang.Object obj) {
        int i6 = (i5 & 8) != 0 ? 0 : i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        partialGapBuffer.replace(i, i2, charSequence, i6, i4);
    }

    public final void replace(int start, int end, java.lang.CharSequence text, int textStart, int textEnd) {
        if (start > end) {
            throw new java.lang.IllegalArgumentException(("start=" + start + " > end=" + end).toString());
        }
        if (textStart > textEnd) {
            throw new java.lang.IllegalArgumentException(("textStart=" + textStart + " > textEnd=" + textEnd).toString());
        }
        if (start < 0) {
            throw new java.lang.IllegalArgumentException(("start must be non-negative, but was " + start).toString());
        }
        if (textStart < 0) {
            throw new java.lang.IllegalArgumentException(("textStart must be non-negative, but was " + textStart).toString());
        }
        androidx.compose.foundation.text2.input.internal.GapBuffer gapBuffer = this.buffer;
        int i = textEnd - textStart;
        if (gapBuffer == null) {
            int max = java.lang.Math.max(255, i + 128);
            char[] cArr = new char[max];
            int min = java.lang.Math.min(start, 64);
            int min2 = java.lang.Math.min(this.text.length() - end, 64);
            int i2 = start - min;
            androidx.compose.foundation.text2.input.internal.ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i2, start);
            int i3 = max - min2;
            int i4 = min2 + end;
            androidx.compose.foundation.text2.input.internal.ToCharArray_androidKt.toCharArray(this.text, cArr, i3, end, i4);
            androidx.compose.foundation.text2.input.internal.ToCharArray_androidKt.toCharArray(text, cArr, min, textStart, textEnd);
            this.buffer = new androidx.compose.foundation.text2.input.internal.GapBuffer(cArr, min + i, i3);
            this.bufStart = i2;
            this.bufEnd = i4;
            return;
        }
        int i5 = this.bufStart;
        int i6 = start - i5;
        int i7 = end - i5;
        if (i6 < 0 || i7 > gapBuffer.length()) {
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(start, end, text, textStart, textEnd);
            return;
        }
        gapBuffer.replace(i6, i7, text, textStart, textEnd);
    }

    public char get(int index) {
        androidx.compose.foundation.text2.input.internal.GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int length = gapBuffer.length();
        int i = this.bufStart;
        if (index < length + i) {
            return gapBuffer.get(index - i);
        }
        return this.text.charAt(index - ((length - this.bufEnd) + i));
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        return toString().subSequence(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        androidx.compose.foundation.text2.input.internal.GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        java.lang.CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }

    public final boolean contentEquals(java.lang.CharSequence other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(toString(), other.toString());
    }
}
