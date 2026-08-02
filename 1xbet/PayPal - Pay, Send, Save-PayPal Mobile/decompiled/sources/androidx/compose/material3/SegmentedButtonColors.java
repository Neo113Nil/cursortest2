package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0085\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010'R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b-\u0010'R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b.\u0010'R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b/\u0010'R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b0\u0010'R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b1\u0010'R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b2\u0010'"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "copy", "", "enabled", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "borderColor-WaAFU9c$material3", "(ZZ)J", "borderColor", "checked", "contentColor-WaAFU9c$material3", "contentColor", "containerColor-WaAFU9c$material3", "containerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getActiveContainerColor-0d7_KjU", "()J", "getActiveContentColor-0d7_KjU", "getActiveBorderColor-0d7_KjU", "getInactiveContainerColor-0d7_KjU", "getInactiveContentColor-0d7_KjU", "getInactiveBorderColor-0d7_KjU", "getDisabledActiveContainerColor-0d7_KjU", "getDisabledActiveContentColor-0d7_KjU", "getDisabledActiveBorderColor-0d7_KjU", "getDisabledInactiveContainerColor-0d7_KjU", "getDisabledInactiveContentColor-0d7_KjU", "getDisabledInactiveBorderColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    private SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.activeContainerColor = j;
        this.activeContentColor = j2;
        this.activeBorderColor = j3;
        this.inactiveContainerColor = j4;
        this.inactiveContentColor = j5;
        this.inactiveBorderColor = j6;
        this.disabledActiveContainerColor = j7;
        this.disabledActiveContentColor = j8;
        this.disabledActiveBorderColor = j9;
        this.disabledInactiveContainerColor = j10;
        this.disabledInactiveContentColor = j11;
        this.disabledInactiveBorderColor = j12;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContainerColor() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContentColor() {
        return this.activeContentColor;
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveBorderColor() {
        return this.activeBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContainerColor() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContentColor() {
        return this.inactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveBorderColor() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContainerColor() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContentColor() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveBorderColor() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContainerColor() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContentColor() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveBorderColor() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final androidx.compose.material3.SegmentedButtonColors m3695copy2qZNXz8(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor) {
        return new androidx.compose.material3.SegmentedButtonColors(activeContainerColor == 16 ? this.activeContainerColor : activeContainerColor, activeContentColor == 16 ? this.activeContentColor : activeContentColor, activeBorderColor == 16 ? this.activeBorderColor : activeBorderColor, inactiveContainerColor == 16 ? this.inactiveContainerColor : inactiveContainerColor, inactiveContentColor == 16 ? this.inactiveContentColor : inactiveContentColor, inactiveBorderColor == 16 ? this.inactiveBorderColor : inactiveBorderColor, disabledActiveContainerColor == 16 ? this.disabledActiveContainerColor : disabledActiveContainerColor, disabledActiveContentColor == 16 ? this.disabledActiveContentColor : disabledActiveContentColor, disabledActiveBorderColor == 16 ? this.disabledActiveBorderColor : disabledActiveBorderColor, disabledInactiveContainerColor == 16 ? this.disabledInactiveContainerColor : disabledInactiveContainerColor, disabledInactiveContentColor == 16 ? this.disabledInactiveContentColor : disabledInactiveContentColor, disabledInactiveBorderColor == 16 ? this.disabledInactiveBorderColor : disabledInactiveBorderColor, null);
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3692borderColorWaAFU9c$material3(boolean enabled, boolean active) {
        if (enabled && active) {
            return this.activeBorderColor;
        }
        if (enabled && !active) {
            return this.inactiveBorderColor;
        }
        if (!enabled && active) {
            return this.disabledActiveBorderColor;
        }
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: contentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3694contentColorWaAFU9c$material3(boolean enabled, boolean checked) {
        if (enabled && checked) {
            return this.activeContentColor;
        }
        if (enabled && !checked) {
            return this.inactiveContentColor;
        }
        if (!enabled && checked) {
            return this.disabledActiveContentColor;
        }
        return this.disabledInactiveContentColor;
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3693containerColorWaAFU9c$material3(boolean enabled, boolean active) {
        if (enabled && active) {
            return this.activeContainerColor;
        }
        if (enabled && !active) {
            return this.inactiveContainerColor;
        }
        if (!enabled && active) {
            return this.disabledActiveContainerColor;
        }
        return this.disabledInactiveContainerColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.material3.SegmentedButtonColors segmentedButtonColors = (androidx.compose.material3.SegmentedButtonColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.activeBorderColor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.activeContentColor);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.activeContainerColor);
        int m6003hashCodeimpl4 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.inactiveBorderColor);
        int m6003hashCodeimpl5 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.inactiveContentColor);
        int m6003hashCodeimpl6 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.inactiveContainerColor);
        int m6003hashCodeimpl7 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledActiveBorderColor);
        int m6003hashCodeimpl8 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledActiveContentColor);
        int m6003hashCodeimpl9 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledActiveContainerColor);
        return (((((((((((((((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + m6003hashCodeimpl4) * 31) + m6003hashCodeimpl5) * 31) + m6003hashCodeimpl6) * 31) + m6003hashCodeimpl7) * 31) + m6003hashCodeimpl8) * 31) + m6003hashCodeimpl9) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledInactiveContentColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.disabledInactiveContainerColor);
    }

    public /* synthetic */ SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }
}
