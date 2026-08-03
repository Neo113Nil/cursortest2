package androidx.compose.ui.text.input;

/* compiled from: GapBuffer.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "(Ljava/lang/String;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "length", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "get", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "replace", "", "start", "end", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private androidx.compose.ui.text.input.GapBuffer buffer;
    private java.lang.String text;
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

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
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final void replace(int start, int end, java.lang.String text) {
        if (start > end) {
            throw new java.lang.IllegalArgumentException(("start index must be less than or equal to end index: " + start + " > " + end).toString());
        }
        if (start < 0) {
            throw new java.lang.IllegalArgumentException(("start must be non-negative, but was " + start).toString());
        }
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.buffer;
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
            androidx.compose.ui.text.input.GapBufferKt.toCharArray(text, cArr, min);
            this.buffer = new androidx.compose.ui.text.input.GapBuffer(cArr, min + text.length(), i2);
            this.bufStart = i;
            this.bufEnd = i3;
            return;
        }
        int i4 = this.bufStart;
        int i5 = start - i4;
        int i6 = end - i4;
        if (i5 < 0 || i6 > gapBuffer.length()) {
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(start, end, text);
            return;
        }
        gapBuffer.replace(i5, i6, text);
    }

    public final char get(int index) {
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.buffer;
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

    public java.lang.String toString() {
        androidx.compose.ui.text.input.GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        java.lang.String str = this.text;
        sb.append((java.lang.CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
