package androidx.compose.foundation;

@kotlin.Deprecated(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getGlowColor-0d7_KjU", "()J", "Landroidx/compose/foundation/layout/PaddingValues;", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final androidx.compose.foundation.layout.PaddingValues drawPadding;
    private final long glowColor;

    private OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.glowColor = j;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284900966L) : j, (i & 2) != 0 ? androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public final androidx.compose.foundation.layout.PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration = (androidx.compose.foundation.OverscrollConfiguration) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public final int hashCode() {
        return (androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OverscrollConfiguration(glowColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.glowColor));
        sb.append(", drawPadding=");
        sb.append(this.drawPadding);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ OverscrollConfiguration(long j, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, paddingValues);
    }
}
