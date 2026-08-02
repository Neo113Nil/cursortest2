package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015"}, d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RichTooltipColors;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getActionContentColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    private RichTooltipColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.titleContentColor = j3;
        this.actionContentColor = j4;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* renamed from: getActionContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionContentColor() {
        return this.actionContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final androidx.compose.material3.RichTooltipColors m3635copyjRlVdoo(long containerColor, long contentColor, long titleContentColor, long actionContentColor) {
        return new androidx.compose.material3.RichTooltipColors(containerColor == 16 ? this.containerColor : containerColor, contentColor == 16 ? this.contentColor : contentColor, titleContentColor == 16 ? this.titleContentColor : titleContentColor, actionContentColor == 16 ? this.actionContentColor : actionContentColor, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.RichTooltipColors)) {
            return false;
        }
        androidx.compose.material3.RichTooltipColors richTooltipColors = (androidx.compose.material3.RichTooltipColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.containerColor, richTooltipColors.containerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.contentColor, richTooltipColors.contentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.containerColor);
        return (((((m6003hashCodeimpl * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.contentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.titleContentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.actionContentColor);
    }

    public /* synthetic */ RichTooltipColors(long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }
}
