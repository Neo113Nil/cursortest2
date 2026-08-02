package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getBackgroundColor-0d7_KjU", "()J", "getTextColor-0d7_KjU", "getIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledIconColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    private ContextMenuColors(long j, long j2, long j3, long j4, long j5) {
        this.backgroundColor = j;
        this.textColor = j2;
        this.iconColor = j3;
        this.disabledTextColor = j4;
        this.disabledIconColor = j5;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.foundation.contextmenu.ContextMenuColors)) {
            return false;
        }
        androidx.compose.foundation.contextmenu.ContextMenuColors contextMenuColors = (androidx.compose.foundation.contextmenu.ContextMenuColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.textColor, contextMenuColors.textColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.iconColor, contextMenuColors.iconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.backgroundColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.textColor);
        return (((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.iconColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledTextColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledIconColor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextMenuColors(backgroundColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.backgroundColor));
        sb.append(", textColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.textColor));
        sb.append(", iconColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.iconColor));
        sb.append(", disabledTextColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.disabledTextColor));
        sb.append(", disabledIconColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.disabledIconColor));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ContextMenuColors(long j, long j2, long j3, long j4, long j5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }
}
