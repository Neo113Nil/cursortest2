package androidx.compose.foundation.layout;

/* compiled from: WindowInsets.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "getSides-JoeWqyM", "()I", "I", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "hashCode", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LimitInsets implements androidx.compose.foundation.layout.WindowInsets {
    private final androidx.compose.foundation.layout.WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }

    private LimitInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }

    public final androidx.compose.foundation.layout.WindowInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name and from getter */
    public final int getSides() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int m658getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            m658getAllowLeftInRtlJoeWqyM$foundation_layout_release = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m657getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m658getAllowLeftInRtlJoeWqyM$foundation_layout_release = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m658getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (androidx.compose.foundation.layout.WindowInsetsSides.m651hasAnybkgdKaI$foundation_layout_release(this.sides, m658getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(androidx.compose.ui.unit.Density density) {
        if (androidx.compose.foundation.layout.WindowInsetsSides.m651hasAnybkgdKaI$foundation_layout_release(this.sides, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m667getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int m660getAllowRightInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            m660getAllowRightInRtlJoeWqyM$foundation_layout_release = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m659getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m660getAllowRightInRtlJoeWqyM$foundation_layout_release = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m660getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (androidx.compose.foundation.layout.WindowInsetsSides.m651hasAnybkgdKaI$foundation_layout_release(this.sides, m660getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(androidx.compose.ui.unit.Density density) {
        if (androidx.compose.foundation.layout.WindowInsetsSides.m651hasAnybkgdKaI$foundation_layout_release(this.sides, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m661getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.LimitInsets)) {
            return false;
        }
        androidx.compose.foundation.layout.LimitInsets limitInsets = (androidx.compose.foundation.layout.LimitInsets) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.insets, limitInsets.insets) && androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(this.sides, limitInsets.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + androidx.compose.foundation.layout.WindowInsetsSides.m652hashCodeimpl(this.sides);
    }

    public java.lang.String toString() {
        return "(" + this.insets + " only " + ((java.lang.Object) androidx.compose.foundation.layout.WindowInsetsSides.m654toStringimpl(this.sides)) + ')';
    }
}
