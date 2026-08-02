package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u000fR\u001d\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u000fR\u001d\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "end", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaddingValuesImpl implements androidx.compose.foundation.layout.PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1711getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1712getEndD9Ej5fM$annotations() {
    }

    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1713getStartD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1714getTopD9Ej5fM$annotations() {
    }

    private PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        boolean z = f >= 0.0f;
        boolean z2 = f2 >= 0.0f;
        if (!(z & z2 & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m1718getTopD9Ej5fM() {
        return this.top;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m1715getBottomD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo1672calculateLeftPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo1673calculateRightPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.foundation.layout.PaddingValuesImpl)) {
            return false;
        }
        androidx.compose.foundation.layout.PaddingValuesImpl paddingValuesImpl = (androidx.compose.foundation.layout.PaddingValuesImpl) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.start, paddingValuesImpl.start) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.top, paddingValuesImpl.top) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.end, paddingValuesImpl.end) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    public final int hashCode() {
        return (((((androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.start) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.top)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.end)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.bottom);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaddingValues(start=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.start));
        sb.append(", top=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.top));
        sb.append(", end=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.end));
        sb.append(", bottom=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f4, null);
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
