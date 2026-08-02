package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0018H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u001bJ$\u0010\u001c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "", "lineIndex", "indexInLine", "Landroidx/compose/ui/unit/Dp;", "maxWidth", "maxHeightInLine", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxColumnWidth", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", com.visa.cbp.getEncExpo.warmup, "getLineIndex", "()I", "getIndexInLine", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMaxWidth-D9Ej5fM", "()F", "getMaxHeightInLine-D9Ej5fM"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextualFlowColumnScopeImpl implements androidx.compose.foundation.layout.ColumnScope, androidx.compose.foundation.layout.ContextualFlowColumnScope {
    public static final int $stable = 0;
    private final /* synthetic */ androidx.compose.foundation.layout.ColumnScopeInstance getHighSpeedVideoFpsRangesFor;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeightInLine;
    private final float maxWidth;

    private ContextualFlowColumnScopeImpl(int i, int i2, float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        this.lineIndex = i;
        this.indexInLine = i2;
        this.maxWidth = f;
        this.maxHeightInLine = f2;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public final int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public final int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxWidth-D9Ej5fM, reason: from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: from getter */
    public final float getMaxHeightInLine() {
        return this.maxHeightInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public final androidx.compose.ui.Modifier fillMaxColumnWidth(androidx.compose.ui.Modifier modifier, float f) {
        if (0.0f > f || f > 1.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid fraction ");
            sb.append(f);
            sb.append("; must be >= 0 and <= 1.0");
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return modifier.then(new androidx.compose.foundation.layout.FillCrossAxisSizeElement(f));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier weight(androidx.compose.ui.Modifier modifier, float f, boolean z) {
        return this.getHighSpeedVideoFpsRangesFor.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
        return this.getHighSpeedVideoFpsRangesFor.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier alignBy(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.VerticalAlignmentLine verticalAlignmentLine) {
        return this.getHighSpeedVideoFpsRangesFor.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal) {
        return this.getHighSpeedVideoFpsRangesFor.align(modifier, horizontal);
    }

    public /* synthetic */ ContextualFlowColumnScopeImpl(int i, int i2, float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2);
    }
}
