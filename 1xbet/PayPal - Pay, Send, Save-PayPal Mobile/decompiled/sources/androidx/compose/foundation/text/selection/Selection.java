package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "handlesCrossed", "<init>", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V", "other", "merge", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/ui/text/TextRange;", "toTextRange-d9O1mEE", "()J", "toTextRange", "component1", "()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "component2", "component3", "()Z", "copy", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)Landroidx/compose/foundation/text/selection/Selection;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getStart", "getEnd", "Z", "getHandlesCrossed", "AnchorInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Selection {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
    private final boolean handlesCrossed;
    private final androidx.compose.foundation.text.selection.Selection.AnchorInfo start;

    public Selection(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo2, boolean z) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z;
    }

    public /* synthetic */ Selection(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (i & 4) != 0 ? false : z);
    }

    public final androidx.compose.foundation.text.selection.Selection.AnchorInfo getStart() {
        return this.start;
    }

    public final androidx.compose.foundation.text.selection.Selection.AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "", "offset", "", "selectableId", "<init>", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "component1", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component2", "()I", "component3", "()J", "copy", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", com.visa.cbp.getEncExpo.warmup, "getOffset", "J", "getSelectableId"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnchorInfo {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.style.ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.direction = resolvedTextDirection;
            this.offset = i;
            this.selectableId = j;
        }

        public final androidx.compose.ui.text.style.ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AnchorInfo(direction=");
            sb.append(this.direction);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(", selectableId=");
            sb.append(this.selectableId);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.direction.hashCode() * 31) + java.lang.Integer.hashCode(this.offset)) * 31) + java.lang.Long.hashCode(this.selectableId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.foundation.text.selection.Selection.AnchorInfo)) {
                return false;
            }
            androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo = (androidx.compose.foundation.text.selection.Selection.AnchorInfo) other;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public final androidx.compose.foundation.text.selection.Selection.AnchorInfo copy(androidx.compose.ui.text.style.ResolvedTextDirection direction, int offset, long selectableId) {
            return new androidx.compose.foundation.text.selection.Selection.AnchorInfo(direction, offset, selectableId);
        }

        /* renamed from: component3, reason: from getter */
        public final long getSelectableId() {
            return this.selectableId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.style.ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public static /* synthetic */ androidx.compose.foundation.text.selection.Selection.AnchorInfo copy$default(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i2 & 2) != 0) {
                i = anchorInfo.offset;
            }
            if ((i2 & 4) != 0) {
                j = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i, j);
        }
    }

    public final androidx.compose.foundation.text.selection.Selection merge(androidx.compose.foundation.text.selection.Selection other) {
        if (other == null) {
            return this;
        }
        boolean z = this.handlesCrossed;
        if (z || other.handlesCrossed) {
            return new androidx.compose.foundation.text.selection.Selection(other.handlesCrossed ? other.start : other.end, z ? this.end : this.start, true);
        }
        return copy$default(this, null, other.end, false, 5, null);
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m2388toTextRanged9O1mEE() {
        return androidx.compose.ui.text.TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Selection(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", handlesCrossed=");
        sb.append(this.handlesCrossed);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + java.lang.Boolean.hashCode(this.handlesCrossed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.selection.Selection)) {
            return false;
        }
        androidx.compose.foundation.text.selection.Selection selection = (androidx.compose.foundation.text.selection.Selection) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.start, selection.start) && kotlin.jvm.internal.Intrinsics.areEqual(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public final androidx.compose.foundation.text.selection.Selection copy(androidx.compose.foundation.text.selection.Selection.AnchorInfo start, androidx.compose.foundation.text.selection.Selection.AnchorInfo end, boolean handlesCrossed) {
        return new androidx.compose.foundation.text.selection.Selection(start, end, handlesCrossed);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.foundation.text.selection.Selection.AnchorInfo getEnd() {
        return this.end;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.foundation.text.selection.Selection.AnchorInfo getStart() {
        return this.start;
    }

    public static /* synthetic */ androidx.compose.foundation.text.selection.Selection copy$default(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i & 4) != 0) {
            z = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z);
    }
}
