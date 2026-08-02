package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0019\u001a\u00020\u0016*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0019\u001a\u00020\u001a*\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001cJ\u0011\u0010\u001b\u001a\u00020\u001d*\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001eJ\u001b\u0010\u001b\u001a\u00020\u001f*\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010,JV\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010'J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010'R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010'R\"\u0010\u0007\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010'\"\u0004\b=\u0010>R\"\u0010\b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00109\u001a\u0004\b?\u0010'\"\u0004\b@\u0010>R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010,\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010A\u001a\u0004\bE\u0010,\"\u0004\bF\u0010DR\u0011\u0010H\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bG\u0010'"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "Landroidx/compose/ui/text/Paragraph;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "toLocalIndex", "(I)I", "toGlobalIndex", "toLocalLineIndex", "toGlobalLineIndex", "toGlobalYPosition", "(F)F", "toLocalYPosition", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocal", "Landroidx/compose/ui/geometry/Rect;", "toGlobal", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "", "treatZeroAsNull", "toGlobal-xdX6-G0", "(JZ)J", "component1", "()Landroidx/compose/ui/text/Paragraph;", "component2", "()I", "component3", "component4", "component5", "component6", "()F", "component7", "copy", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)Landroidx/compose/ui/text/ParagraphInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/Paragraph;", "getParagraph", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "getEndIndex", "getStartLineIndex", "setStartLineIndex", "(I)V", "getEndLineIndex", "setEndLineIndex", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTop", "setTop", "(F)V", "getBottom", "setBottom", "getLength", "length"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final androidx.compose.ui.text.Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(androidx.compose.ui.text.Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.paragraph = paragraph;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public /* synthetic */ ParagraphInfo(androidx.compose.ui.text.Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }

    public final androidx.compose.ui.text.Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final void setStartLineIndex(int i) {
        this.startLineIndex = i;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final void setEndLineIndex(int i) {
        this.endLineIndex = i;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final int toLocalIndex(int i) {
        return kotlin.ranges.RangesKt.coerceIn(i, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toGlobalIndex(int i) {
        return i + this.startIndex;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.startLineIndex;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.top;
    }

    public final float toLocalYPosition(float f) {
        return f - this.top;
    }

    public final androidx.compose.ui.geometry.Rect toGlobal(androidx.compose.ui.geometry.Rect rect) {
        float f = this.top;
        return rect.m5789translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)));
    }

    public final androidx.compose.ui.geometry.Rect toLocal(androidx.compose.ui.geometry.Rect rect) {
        float f = -this.top;
        return rect.m5789translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)));
    }

    public final androidx.compose.ui.graphics.Path toGlobal(androidx.compose.ui.graphics.Path path) {
        float f = this.top;
        path.mo5889translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)));
        return path;
    }

    /* renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m7892toGlobalxdX6G0$default(androidx.compose.ui.text.ParagraphInfo paragraphInfo, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return paragraphInfo.m7893toGlobalxdX6G0(j, z);
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m7893toGlobalxdX6G0(long j, boolean z) {
        if (z && androidx.compose.ui.text.TextRange.m8032equalsimpl0(j, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE())) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(toGlobalIndex(androidx.compose.ui.text.TextRange.m8039getStartimpl(j)), toGlobalIndex(androidx.compose.ui.text.TextRange.m8034getEndimpl(j)));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m7894toLocalMKHz9U(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - this.top) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.paragraph);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", startLineIndex=");
        sb.append(this.startLineIndex);
        sb.append(", endLineIndex=");
        sb.append(this.endLineIndex);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + java.lang.Integer.hashCode(this.startIndex)) * 31) + java.lang.Integer.hashCode(this.endIndex)) * 31) + java.lang.Integer.hashCode(this.startLineIndex)) * 31) + java.lang.Integer.hashCode(this.endLineIndex)) * 31) + java.lang.Float.hashCode(this.top)) * 31) + java.lang.Float.hashCode(this.bottom);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.ParagraphInfo)) {
            return false;
        }
        androidx.compose.ui.text.ParagraphInfo paragraphInfo = (androidx.compose.ui.text.ParagraphInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && java.lang.Float.compare(this.top, paragraphInfo.top) == 0 && java.lang.Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final androidx.compose.ui.text.ParagraphInfo copy(androidx.compose.ui.text.Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        return new androidx.compose.ui.text.ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
    }

    /* renamed from: component7, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component6, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.text.Paragraph getParagraph() {
        return this.paragraph;
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphInfo copy$default(androidx.compose.ui.text.ParagraphInfo paragraphInfo, androidx.compose.ui.text.Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.startIndex;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.endIndex;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.startLineIndex;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.endLineIndex;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = paragraphInfo.top;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i6, i7, i8, i9, f3, f2);
    }
}
