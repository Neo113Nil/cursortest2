package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "component1", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "component2", "()I", "component3", "copy", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "getIntrinsics", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "getEndIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    private final int endIndex;
    private final androidx.compose.ui.text.ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public final androidx.compose.ui.text.ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.intrinsics);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + java.lang.Integer.hashCode(this.startIndex)) * 31) + java.lang.Integer.hashCode(this.endIndex);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.ParagraphIntrinsicInfo)) {
            return false;
        }
        androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo = (androidx.compose.ui.text.ParagraphIntrinsicInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final androidx.compose.ui.text.ParagraphIntrinsicInfo copy(androidx.compose.ui.text.ParagraphIntrinsics intrinsics, int startIndex, int endIndex) {
        return new androidx.compose.ui.text.ParagraphIntrinsicInfo(intrinsics, startIndex, endIndex);
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
    public final androidx.compose.ui.text.ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public static /* synthetic */ androidx.compose.ui.text.ParagraphIntrinsicInfo copy$default(androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo, androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsics, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i, i2);
    }
}
