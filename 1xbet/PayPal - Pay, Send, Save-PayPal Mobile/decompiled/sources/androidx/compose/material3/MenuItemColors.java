package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001c"}, d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "copy", "", "enabled", "textColor-vNxB06k$material3", "(Z)J", "leadingIconColor-vNxB06k$material3", "trailingIconColor-vNxB06k$material3", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getTextColor-0d7_KjU", "()J", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    private MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconColor() {
        return this.trailingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final androidx.compose.material3.MenuItemColors m3446copytNS2XkQ(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        return new androidx.compose.material3.MenuItemColors(textColor == 16 ? this.textColor : textColor, leadingIconColor == 16 ? this.leadingIconColor : leadingIconColor, trailingIconColor == 16 ? this.trailingIconColor : trailingIconColor, disabledTextColor == 16 ? this.disabledTextColor : disabledTextColor, disabledLeadingIconColor == 16 ? this.disabledLeadingIconColor : disabledLeadingIconColor, disabledTrailingIconColor == 16 ? this.disabledTrailingIconColor : disabledTrailingIconColor, null);
    }

    /* renamed from: textColor-vNxB06k$material3, reason: not valid java name */
    public final long m3454textColorvNxB06k$material3(boolean enabled) {
        return enabled ? this.textColor : this.disabledTextColor;
    }

    /* renamed from: leadingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m3453leadingIconColorvNxB06k$material3(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    /* renamed from: trailingIconColor-vNxB06k$material3, reason: not valid java name */
    public final long m3455trailingIconColorvNxB06k$material3(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.MenuItemColors)) {
            return false;
        }
        androidx.compose.material3.MenuItemColors menuItemColors = (androidx.compose.material3.MenuItemColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.textColor, menuItemColors.textColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.textColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.leadingIconColor);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.trailingIconColor);
        return (((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledTextColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledLeadingIconColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledTrailingIconColor);
    }

    public /* synthetic */ MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }
}
