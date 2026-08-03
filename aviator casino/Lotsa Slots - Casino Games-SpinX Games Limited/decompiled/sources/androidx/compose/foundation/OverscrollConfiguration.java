package androidx.compose.foundation;

/* compiled from: OverscrollConfiguration.android.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "glowColor", "Landroidx/compose/ui/graphics/Color;", "drawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getGlowColor-0d7_KjU", "()J", "J", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final androidx.compose.foundation.layout.PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, paddingValues);
    }

    private OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.glowColor = j;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284900966L) : j, (i & 2) != 0 ? androidx.compose.foundation.layout.PaddingKt.m563PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public final androidx.compose.foundation.layout.PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration = (androidx.compose.foundation.OverscrollConfiguration) other;
        return androidx.compose.ui.graphics.Color.m2114equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (androidx.compose.ui.graphics.Color.m2120hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public java.lang.String toString() {
        return "OverscrollConfiguration(glowColor=" + ((java.lang.Object) androidx.compose.ui.graphics.Color.m2121toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }
}
