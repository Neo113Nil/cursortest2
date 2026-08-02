package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJI\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001c"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/TopAppBarColors;", "copy", "", "colorTransitionFraction", "containerColor-vNxB06k$material3", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getScrolledContainerColor-0d7_KjU", "getNavigationIconContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getActionIconContentColor-0d7_KjU", "getSubtitleContentColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long subtitleContentColor;
    private final long titleContentColor;

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.scrolledContainerColor = j2;
        this.navigationIconContentColor = j3;
        this.titleContentColor = j4;
        this.actionIconContentColor = j5;
        this.subtitleContentColor = j6;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* renamed from: getSubtitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleContentColor() {
        return this.subtitleContentColor;
    }

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5) {
        this(j, j2, j3, j4, j5, j4, null);
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final androidx.compose.material3.TopAppBarColors m4181copytNS2XkQ(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, long subtitleContentColor) {
        return new androidx.compose.material3.TopAppBarColors(containerColor == 16 ? this.containerColor : containerColor, scrolledContainerColor == 16 ? this.scrolledContainerColor : scrolledContainerColor, navigationIconContentColor == 16 ? this.navigationIconContentColor : navigationIconContentColor, titleContentColor == 16 ? this.titleContentColor : titleContentColor, actionIconContentColor == 16 ? this.actionIconContentColor : actionIconContentColor, subtitleContentColor == 16 ? this.subtitleContentColor : subtitleContentColor, null);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m4180containerColorvNxB06k$material3(float colorTransitionFraction) {
        return androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, androidx.compose.animation.core.EasingKt.getFastOutLinearInEasing().transform(colorTransitionFraction));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.TopAppBarColors)) {
            return false;
        }
        androidx.compose.material3.TopAppBarColors topAppBarColors = (androidx.compose.material3.TopAppBarColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.containerColor, topAppBarColors.containerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.subtitleContentColor, topAppBarColors.subtitleContentColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.containerColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.scrolledContainerColor);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.navigationIconContentColor);
        return (((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.titleContentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.actionIconContentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.subtitleContentColor);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the TopAppBarColors constructor with subtitleContentColor", replaceWith = @kotlin.ReplaceWith(expression = "TopAppBarColors(containerColor, scrolledContainerColor,navigationIconContentColor, titleContentColor, actionIconContentColor, subtitleContentColor)", imports = {}))
    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }
}
