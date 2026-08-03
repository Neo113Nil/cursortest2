package androidx.compose.ui.text.android;

/* compiled from: LayoutHelper.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0018\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getLineVisibleEnd", "lineIndex", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "lineStart", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final android.text.Layout layout;
    private final java.util.List<java.text.Bidi> paragraphBidi;
    private final int paragraphCount;
    private final java.util.List<java.lang.Integer> paragraphEnds;
    private char[] tmpBuffer;

    public LayoutHelper(android.text.Layout layout) {
        this.layout = layout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        do {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default(this.layout.getText(), '\n', i, false, 4, (java.lang.Object) null);
            i = indexOf$default < 0 ? this.layout.getText().length() : indexOf$default + 1;
            arrayList.add(java.lang.Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final android.text.Layout getLayout() {
        return this.layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0.getRunCount() == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.text.Bidi analyzeBidi(int paragraphIndex) {
        java.text.Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return this.paragraphBidi.get(paragraphIndex);
        }
        int intValue = paragraphIndex == 0 ? 0 : this.paragraphEnds.get(paragraphIndex - 1).intValue();
        int intValue2 = this.paragraphEnds.get(paragraphIndex).intValue();
        int i = intValue2 - intValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i) {
            cArr = new char[i];
        }
        char[] cArr2 = cArr;
        android.text.TextUtils.getChars(this.layout.getText(), intValue, intValue2, cArr2, 0);
        if (java.text.Bidi.requiresBidi(cArr2, 0, i)) {
            bidi = new java.text.Bidi(cArr2, 0, null, 0, i, isRtlParagraph(paragraphIndex) ? 1 : 0);
        }
        bidi = null;
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public static /* synthetic */ int getParagraphForOffset$default(androidx.compose.ui.text.android.LayoutHelper layoutHelper, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    public final int getParagraphForOffset(int offset, boolean upstream) {
        int binarySearch$default = kotlin.collections.CollectionsKt.binarySearch$default(this.paragraphEnds, java.lang.Integer.valueOf(offset), 0, 0, 6, (java.lang.Object) null);
        int i = binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
        if (upstream && i > 0) {
            int i2 = i - 1;
            if (offset == this.paragraphEnds.get(i2).intValue()) {
                return i2;
            }
        }
        return i;
    }

    public final int getParagraphStart(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final int getParagraphEnd(int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }

    public final boolean isRtlParagraph(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(paragraphIndex))) == -1;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection, boolean upstream) {
        int i = offset;
        if (!upstream) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int lineForOffset = androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(this.layout, i, upstream);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i != lineStart && i != lineEnd) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        if (i == 0 || i == this.layout.getText().length()) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int paragraphForOffset = getParagraphForOffset(i, upstream);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i2 = lineStart - paragraphStart;
        int i3 = lineEndToVisibleEnd - paragraphStart;
        java.text.Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        java.text.Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i2, i3) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            return (i != lineStart ? isRtlParagraph : !isRtlParagraph) ? this.layout.getLineRight(lineForOffset) : this.layout.getLineLeft(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        androidx.compose.ui.text.android.LayoutHelper.BidiRun[] bidiRunArr = new androidx.compose.ui.text.android.LayoutHelper.BidiRun[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            bidiRunArr[i4] = new androidx.compose.ui.text.android.LayoutHelper.BidiRun(createLineBidi.getRunStart(i4) + lineStart, createLineBidi.getRunLimit(i4) + lineStart, createLineBidi.getRunLevel(i4) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i5 = 0; i5 < runCount2; i5++) {
            bArr[i5] = (byte) createLineBidi.getRunLevel(i5);
        }
        java.text.Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i6 = -1;
        if (i == lineStart) {
            int i7 = 0;
            while (true) {
                if (i7 >= runCount) {
                    break;
                }
                if (bidiRunArr[i7].getStart() == i) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            androidx.compose.ui.text.android.LayoutHelper.BidiRun bidiRun = bidiRunArr[i6];
            if (usePrimaryDirection || isRtlParagraph == bidiRun.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i6 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i6 == kotlin.collections.ArraysKt.getLastIndex(bidiRunArr) && !isRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            if (isRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getStart());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getStart());
        }
        if (i > lineEndToVisibleEnd) {
            i = lineEndToVisibleEnd(i, lineStart);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= runCount) {
                break;
            }
            if (bidiRunArr[i8].getEnd() == i) {
                i6 = i8;
                break;
            }
            i8++;
        }
        androidx.compose.ui.text.android.LayoutHelper.BidiRun bidiRun2 = bidiRunArr[i6];
        if (!usePrimaryDirection && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i6 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i6 == kotlin.collections.ArraysKt.getLastIndex(bidiRunArr) && !isRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        if (isRtlParagraph) {
            return this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getEnd());
        }
        return this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getEnd());
    }

    public final int getLineVisibleEnd(int lineIndex) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    private final float getDownstreamHorizontal(int offset, boolean primary) {
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        if (primary) {
            return this.layout.getPrimaryHorizontal(coerceAtMost);
        }
        return this.layout.getSecondaryHorizontal(coerceAtMost);
    }

    /* compiled from: LayoutHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public static /* synthetic */ androidx.compose.ui.text.android.LayoutHelper.BidiRun copy$default(androidx.compose.ui.text.android.LayoutHelper.BidiRun bidiRun, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public final androidx.compose.ui.text.android.LayoutHelper.BidiRun copy(int start, int end, boolean isRtl) {
            return new androidx.compose.ui.text.android.LayoutHelper.BidiRun(start, end, isRtl);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.text.android.LayoutHelper.BidiRun)) {
                return false;
            }
            androidx.compose.ui.text.android.LayoutHelper.BidiRun bidiRun = (androidx.compose.ui.text.android.LayoutHelper.BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public int hashCode() {
            return (((this.start * 31) + this.end) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isRtl);
        }

        public java.lang.String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }
    }

    private final int lineEndToVisibleEnd(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && isLineEndSpace(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    public final boolean isLineEndSpace(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (kotlin.jvm.internal.Intrinsics.compare((int) c, 8192) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }
}
