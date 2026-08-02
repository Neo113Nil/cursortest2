package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/material/RippleConfiguration;", "", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(JLandroidx/compose/material/ripple/RippleAlpha;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getColor-0d7_KjU", "()J", "Landroidx/compose/material/ripple/RippleAlpha;", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final androidx.compose.material.ripple.RippleAlpha rippleAlpha;

    private RippleConfiguration(long j, androidx.compose.material.ripple.RippleAlpha rippleAlpha) {
        this.color = j;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j, androidx.compose.material.ripple.RippleAlpha rippleAlpha, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j, (i & 2) != 0 ? null : rippleAlpha, null);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final androidx.compose.material.ripple.RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.RippleConfiguration)) {
            return false;
        }
        androidx.compose.material.RippleConfiguration rippleConfiguration = (androidx.compose.material.RippleConfiguration) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, rippleConfiguration.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color);
        androidx.compose.material.ripple.RippleAlpha rippleAlpha = this.rippleAlpha;
        return (m6003hashCodeimpl * 31) + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RippleConfiguration(color=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.color));
        sb.append(", rippleAlpha=");
        sb.append(this.rippleAlpha);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ RippleConfiguration(long j, androidx.compose.material.ripple.RippleAlpha rippleAlpha, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, rippleAlpha);
    }
}
