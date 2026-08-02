package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineInfo;", "", "", "lineIndex", "positionInLine", "Landroidx/compose/ui/unit/Dp;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "update-4j6BHR0$foundation_layout", "(IIFF)V", "update", com.visa.cbp.getEncExpo.warmup, "getLineIndex$foundation_layout", "()I", "setLineIndex$foundation_layout", "(I)V", "getPositionInLine$foundation_layout", "setPositionInLine$foundation_layout", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMaxMainAxisSize-D9Ej5fM$foundation_layout", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout", "(F)V", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout", "setMaxCrossAxisSize-0680j_4$foundation_layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    private FlowLineInfo(int i, int i2, float f, float f2) {
        this.lineIndex = i;
        this.positionInLine = i2;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f2;
    }

    /* renamed from: getLineIndex$foundation_layout, reason: from getter */
    public final int getLineIndex() {
        return this.lineIndex;
    }

    public final void setLineIndex$foundation_layout(int i) {
        this.lineIndex = i;
    }

    /* renamed from: getPositionInLine$foundation_layout, reason: from getter */
    public final int getPositionInLine() {
        return this.positionInLine;
    }

    public final void setPositionInLine$foundation_layout(int i) {
        this.positionInLine = i;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name and from getter */
    public final float getMaxMainAxisSize() {
        return this.maxMainAxisSize;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m1660setMaxMainAxisSize0680j_4$foundation_layout(float f) {
        this.maxMainAxisSize = f;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name and from getter */
    public final float getMaxCrossAxisSize() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m1659setMaxCrossAxisSize0680j_4$foundation_layout(float f) {
        this.maxCrossAxisSize = f;
    }

    /* renamed from: update-4j6BHR0$foundation_layout, reason: not valid java name */
    public final void m1661update4j6BHR0$foundation_layout(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i3 & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, null);
    }

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2);
    }
}
