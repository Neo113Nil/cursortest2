package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u00ad\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b/\u0010,R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b0\u0010,R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b1\u0010,R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b2\u0010,R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b3\u0010,R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b4\u0010,R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b5\u0010,R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b6\u0010,R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b7\u0010,R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b8\u0010,R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b9\u0010,R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b:\u0010,R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b;\u0010,"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "copy", "", "enabled", "checked", "thumbColor-WaAFU9c$material3", "(ZZ)J", "thumbColor", "trackColor-WaAFU9c$material3", "trackColor", "borderColor-WaAFU9c$material3", "borderColor", "iconColor-WaAFU9c$material3", "iconColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedThumbColor-0d7_KjU", "()J", "getCheckedTrackColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getCheckedIconColor-0d7_KjU", "getUncheckedThumbColor-0d7_KjU", "getUncheckedTrackColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedIconColor-0d7_KjU", "getDisabledCheckedThumbColor-0d7_KjU", "getDisabledCheckedTrackColor-0d7_KjU", "getDisabledCheckedBorderColor-0d7_KjU", "getDisabledCheckedIconColor-0d7_KjU", "getDisabledUncheckedThumbColor-0d7_KjU", "getDisabledUncheckedTrackColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedIconColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.checkedBorderColor = j3;
        this.checkedIconColor = j4;
        this.uncheckedThumbColor = j5;
        this.uncheckedTrackColor = j6;
        this.uncheckedBorderColor = j7;
        this.uncheckedIconColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledCheckedBorderColor = j11;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = j13;
        this.disabledUncheckedTrackColor = j14;
        this.disabledUncheckedBorderColor = j15;
        this.disabledUncheckedIconColor = j16;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedThumbColor() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedIconColor() {
        return this.checkedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedThumbColor() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedIconColor() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedThumbColor() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedTrackColor() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBorderColor() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedIconColor() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedThumbColor() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedTrackColor() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedIconColor() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final androidx.compose.material3.SwitchColors m3841copyQ_H9qLU(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        return new androidx.compose.material3.SwitchColors(checkedThumbColor == 16 ? this.checkedThumbColor : checkedThumbColor, checkedTrackColor == 16 ? this.checkedTrackColor : checkedTrackColor, checkedBorderColor == 16 ? this.checkedBorderColor : checkedBorderColor, checkedIconColor == 16 ? this.checkedIconColor : checkedIconColor, uncheckedThumbColor == 16 ? this.uncheckedThumbColor : uncheckedThumbColor, uncheckedTrackColor == 16 ? this.uncheckedTrackColor : uncheckedTrackColor, uncheckedBorderColor == 16 ? this.uncheckedBorderColor : uncheckedBorderColor, uncheckedIconColor == 16 ? this.uncheckedIconColor : uncheckedIconColor, disabledCheckedThumbColor == 16 ? this.disabledCheckedThumbColor : disabledCheckedThumbColor, disabledCheckedTrackColor == 16 ? this.disabledCheckedTrackColor : disabledCheckedTrackColor, disabledCheckedBorderColor == 16 ? this.disabledCheckedBorderColor : disabledCheckedBorderColor, disabledCheckedIconColor == 16 ? this.disabledCheckedIconColor : disabledCheckedIconColor, disabledUncheckedThumbColor == 16 ? this.disabledUncheckedThumbColor : disabledUncheckedThumbColor, disabledUncheckedTrackColor == 16 ? this.disabledUncheckedTrackColor : disabledUncheckedTrackColor, disabledUncheckedBorderColor == 16 ? this.disabledUncheckedBorderColor : disabledUncheckedBorderColor, disabledUncheckedIconColor == 16 ? this.disabledUncheckedIconColor : disabledUncheckedIconColor, null);
    }

    /* renamed from: thumbColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3859thumbColorWaAFU9c$material3(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedThumbColor : this.uncheckedThumbColor : checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3860trackColorWaAFU9c$material3(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedTrackColor : this.uncheckedTrackColor : checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3840borderColorWaAFU9c$material3(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedBorderColor : this.uncheckedBorderColor : checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3858iconColorWaAFU9c$material3(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedIconColor : this.uncheckedIconColor : checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.SwitchColors)) {
            return false;
        }
        androidx.compose.material3.SwitchColors switchColors = (androidx.compose.material3.SwitchColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedThumbColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedTrackColor);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedBorderColor);
        int m6003hashCodeimpl4 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.checkedIconColor);
        int m6003hashCodeimpl5 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.uncheckedThumbColor);
        int m6003hashCodeimpl6 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.uncheckedTrackColor);
        int m6003hashCodeimpl7 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.uncheckedBorderColor);
        int m6003hashCodeimpl8 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.uncheckedIconColor);
        int m6003hashCodeimpl9 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledCheckedThumbColor);
        int m6003hashCodeimpl10 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledCheckedTrackColor);
        int m6003hashCodeimpl11 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledCheckedBorderColor);
        int m6003hashCodeimpl12 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledCheckedIconColor);
        int m6003hashCodeimpl13 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledUncheckedThumbColor);
        return (((((((((((((((((((((((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + m6003hashCodeimpl4) * 31) + m6003hashCodeimpl5) * 31) + m6003hashCodeimpl6) * 31) + m6003hashCodeimpl7) * 31) + m6003hashCodeimpl8) * 31) + m6003hashCodeimpl9) * 31) + m6003hashCodeimpl10) * 31) + m6003hashCodeimpl11) * 31) + m6003hashCodeimpl12) * 31) + m6003hashCodeimpl13) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledUncheckedIconColor);
    }

    public /* synthetic */ SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }
}
