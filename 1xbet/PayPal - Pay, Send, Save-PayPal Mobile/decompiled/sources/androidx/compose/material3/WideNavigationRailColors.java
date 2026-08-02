package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016"}, d2 = {"Landroidx/compose/material3/WideNavigationRailColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "modalContainerColor", "modalScrimColor", "modalContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/WideNavigationRailColors;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getModalContainerColor-0d7_KjU", "getModalScrimColor-0d7_KjU", "getModalContentColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WideNavigationRailColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long modalContainerColor;
    private final long modalContentColor;
    private final long modalScrimColor;

    private WideNavigationRailColors(long j, long j2, long j3, long j4, long j5) {
        this.containerColor = j;
        this.contentColor = j2;
        this.modalContainerColor = j3;
        this.modalScrimColor = j4;
        this.modalContentColor = j5;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getModalContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getModalContainerColor() {
        return this.modalContainerColor;
    }

    /* renamed from: getModalScrimColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getModalScrimColor() {
        return this.modalScrimColor;
    }

    /* renamed from: getModalContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getModalContentColor() {
        return this.modalContentColor;
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final androidx.compose.material3.WideNavigationRailColors m4212copyt635Npw(long containerColor, long contentColor, long modalContainerColor, long modalScrimColor, long modalContentColor) {
        return new androidx.compose.material3.WideNavigationRailColors(containerColor == 16 ? this.containerColor : containerColor, contentColor == 16 ? this.contentColor : contentColor, modalContainerColor == 16 ? this.modalContainerColor : modalContainerColor, modalScrimColor == 16 ? this.modalScrimColor : modalScrimColor, modalContentColor == 16 ? this.modalContentColor : modalContentColor, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.WideNavigationRailColors)) {
            return false;
        }
        androidx.compose.material3.WideNavigationRailColors wideNavigationRailColors = (androidx.compose.material3.WideNavigationRailColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.containerColor, wideNavigationRailColors.containerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.contentColor, wideNavigationRailColors.contentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.modalContainerColor, wideNavigationRailColors.modalContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.modalScrimColor, wideNavigationRailColors.modalScrimColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.containerColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.contentColor);
        return (((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.modalContainerColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.modalScrimColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.modalContentColor);
    }

    public /* synthetic */ WideNavigationRailColors(long j, long j2, long j3, long j4, long j5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }
}
