package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u008f\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010&"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "copy", "", "enabled", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "containerColor-WaAFU9c$material3", "(ZZ)J", "labelColor-WaAFU9c$material3", "leadingIconContentColor-WaAFU9c$material3", "leadingIconContentColor", "trailingIconContentColor-WaAFU9c$material3", "trailingIconContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "J", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRanges", "getOutputSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputFormats", "getOutputStallDurationlomOqCM", "getOutputSizeshNQ4ISI", "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getOutputFormats;
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;
    private final long getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final long getOutputSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final long getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final long getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final long getOutputSizeshNQ4ISI;

    private SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = j2;
        this.getHighSpeedVideoFpsRanges = j3;
        this.getHighResolutionOutputSizeshNQ4ISI = j4;
        this.Camera2StreamConfigurationMap = j5;
        this.getOutputMinFrameDuration = j6;
        this.getInputFormats = j7;
        this.getHighSpeedVideoSizesFor = j8;
        this.getInputSizeshNQ4ISI = j9;
        this.getOutputFormats = j10;
        this.getOutputSizes = j11;
        this.getOutputSizeshNQ4ISI = j12;
        this.getOutputStallDurationlomOqCM = j13;
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final androidx.compose.material3.SelectableChipColors m3722copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        return new androidx.compose.material3.SelectableChipColors(containerColor == 16 ? this.getHighSpeedVideoFpsRangesFor : containerColor, labelColor == 16 ? this.getHighSpeedVideoSizes : labelColor, leadingIconColor == 16 ? this.getHighSpeedVideoFpsRanges : leadingIconColor, trailingIconColor == 16 ? this.getHighResolutionOutputSizeshNQ4ISI : trailingIconColor, disabledContainerColor == 16 ? this.Camera2StreamConfigurationMap : disabledContainerColor, disabledLabelColor == 16 ? this.getOutputMinFrameDuration : disabledLabelColor, disabledLeadingIconColor == 16 ? this.getInputFormats : disabledLeadingIconColor, disabledTrailingIconColor == 16 ? this.getHighSpeedVideoSizesFor : disabledTrailingIconColor, selectedContainerColor == 16 ? this.getInputSizeshNQ4ISI : selectedContainerColor, disabledSelectedContainerColor == 16 ? this.getOutputFormats : disabledSelectedContainerColor, selectedLabelColor == 16 ? this.getOutputSizes : selectedLabelColor, selectedLeadingIconColor == 16 ? this.getOutputSizeshNQ4ISI : selectedLeadingIconColor, selectedTrailingIconColor == 16 ? this.getOutputStallDurationlomOqCM : selectedTrailingIconColor, null);
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3721containerColorWaAFU9c$material3(boolean enabled, boolean selected) {
        if (!enabled) {
            return selected ? this.getOutputFormats : this.Camera2StreamConfigurationMap;
        }
        if (!selected) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return this.getInputSizeshNQ4ISI;
    }

    /* renamed from: labelColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3723labelColorWaAFU9c$material3(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.getOutputMinFrameDuration;
        }
        if (!selected) {
            return this.getHighSpeedVideoSizes;
        }
        return this.getOutputSizes;
    }

    /* renamed from: leadingIconContentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3724leadingIconContentColorWaAFU9c$material3(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.getInputFormats;
        }
        if (!selected) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return this.getOutputSizeshNQ4ISI;
    }

    /* renamed from: trailingIconContentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m3725trailingIconContentColorWaAFU9c$material3(boolean enabled, boolean selected) {
        if (!enabled) {
            return this.getHighSpeedVideoSizesFor;
        }
        if (!selected) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return this.getOutputStallDurationlomOqCM;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.SelectableChipColors)) {
            return false;
        }
        androidx.compose.material3.SelectableChipColors selectableChipColors = (androidx.compose.material3.SelectableChipColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRangesFor, selectableChipColors.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizes, selectableChipColors.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoFpsRanges, selectableChipColors.getHighSpeedVideoFpsRanges) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, selectableChipColors.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.Camera2StreamConfigurationMap, selectableChipColors.Camera2StreamConfigurationMap) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputMinFrameDuration, selectableChipColors.getOutputMinFrameDuration) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getInputFormats, selectableChipColors.getInputFormats) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighSpeedVideoSizesFor, selectableChipColors.getHighSpeedVideoSizesFor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getInputSizeshNQ4ISI, selectableChipColors.getInputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputFormats, selectableChipColors.getOutputFormats) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputSizes, selectableChipColors.getOutputSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputSizeshNQ4ISI, selectableChipColors.getOutputSizeshNQ4ISI) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputStallDurationlomOqCM, selectableChipColors.getOutputStallDurationlomOqCM);
    }

    public final int hashCode() {
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizes);
        int m6003hashCodeimpl3 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        int m6003hashCodeimpl4 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        int m6003hashCodeimpl5 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.Camera2StreamConfigurationMap);
        int m6003hashCodeimpl6 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputMinFrameDuration);
        int m6003hashCodeimpl7 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getInputFormats);
        int m6003hashCodeimpl8 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighSpeedVideoSizesFor);
        int m6003hashCodeimpl9 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getInputSizeshNQ4ISI);
        int m6003hashCodeimpl10 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputFormats);
        return (((((((((((((((((((((((m6003hashCodeimpl * 31) + m6003hashCodeimpl2) * 31) + m6003hashCodeimpl3) * 31) + m6003hashCodeimpl4) * 31) + m6003hashCodeimpl5) * 31) + m6003hashCodeimpl6) * 31) + m6003hashCodeimpl7) * 31) + m6003hashCodeimpl8) * 31) + m6003hashCodeimpl9) * 31) + m6003hashCodeimpl10) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputSizes)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputSizeshNQ4ISI)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputStallDurationlomOqCM);
    }

    public /* synthetic */ SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }
}
