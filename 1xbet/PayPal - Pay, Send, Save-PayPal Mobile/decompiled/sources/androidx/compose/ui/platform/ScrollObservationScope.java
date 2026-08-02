package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", com.visa.cbp.getEncExpo.warmup, "getSemanticsNodeId", "()I", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "Ljava/lang/Float;", "getOldXValue", "()Ljava/lang/Float;", "setOldXValue", "(Ljava/lang/Float;)V", "getOldYValue", "setOldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "", "isValidOwnerScope", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollObservationScope implements androidx.compose.ui.node.OwnerScope {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.ui.platform.ScrollObservationScope> allScopes;
    private androidx.compose.ui.semantics.ScrollAxisRange horizontalScrollAxisRange;
    private java.lang.Float oldXValue;
    private java.lang.Float oldYValue;
    private final int semanticsNodeId;
    private androidx.compose.ui.semantics.ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i, java.util.List<androidx.compose.ui.platform.ScrollObservationScope> list, java.lang.Float f, java.lang.Float f2, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i;
        this.allScopes = list;
        this.oldXValue = f;
        this.oldYValue = f2;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final java.util.List<androidx.compose.ui.platform.ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final java.lang.Float getOldXValue() {
        return this.oldXValue;
    }

    public final void setOldXValue(java.lang.Float f) {
        this.oldXValue = f;
    }

    public final java.lang.Float getOldYValue() {
        return this.oldYValue;
    }

    public final void setOldYValue(java.lang.Float f) {
        this.oldYValue = f;
    }

    public final androidx.compose.ui.semantics.ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final void setHorizontalScrollAxisRange(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final androidx.compose.ui.semantics.ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void setVerticalScrollAxisRange(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }
}
