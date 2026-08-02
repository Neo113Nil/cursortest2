package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\u0082\u0001\u0004\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/paypal/pds/components/LinkStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "p2", "Lcom/paypal/pds/core/Typography;", "p3", "p4", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;)V", "linkColor", "Lcom/paypal/pds/core/Color;", "getLinkColor", "()Lcom/paypal/pds/core/Color;", "pressedLinkColor", "getPressedLinkColor", "linkBackgroundColor", "getLinkBackgroundColor", "linkTypography", "Lcom/paypal/pds/core/Typography;", "getLinkTypography", "()Lcom/paypal/pds/core/Typography;", "pressedStateIndicationColor", "getPressedStateIndicationColor", "Default", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/LinkMedium;", "Lcom/paypal/pds/components/LinkMediumStyle;", "Lcom/paypal/pds/components/LinkStyle$Custom;", "Lcom/paypal/pds/components/LinkStyle$Default;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color linkBackgroundColor;
    private final com.paypal.pds.core.Color linkColor;
    private final com.paypal.pds.core.Typography linkTypography;
    private final com.paypal.pds.core.Color pressedLinkColor;
    private final com.paypal.pds.core.Color pressedStateIndicationColor;

    private LinkStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color4) {
        this.linkColor = color;
        this.pressedLinkColor = color2;
        this.linkBackgroundColor = color3;
        this.linkTypography = typography;
        this.pressedStateIndicationColor = color4;
    }

    public /* synthetic */ LinkStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, color3, (i & 8) != 0 ? null : typography, color4, null);
    }

    public final com.paypal.pds.core.Color getLinkColor() {
        return this.linkColor;
    }

    public final com.paypal.pds.core.Color getPressedLinkColor() {
        return this.pressedLinkColor;
    }

    public final com.paypal.pds.core.Color getLinkBackgroundColor() {
        return this.linkBackgroundColor;
    }

    public final com.paypal.pds.core.Typography getLinkTypography() {
        return this.linkTypography;
    }

    public final com.paypal.pds.core.Color getPressedStateIndicationColor() {
        return this.pressedStateIndicationColor;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/LinkStyle$Default;", "Lcom/paypal/pds/components/LinkStyle;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default extends com.paypal.pds.components.LinkStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.LinkStyle.Default INSTANCE = new com.paypal.pds.components.LinkStyle.Default();

        public final int hashCode() {
            return -1090763057;
        }

        private Default() {
            super(com.paypal.pds.core.Color.ContentLink.INSTANCE, com.paypal.pds.core.Color.ContentLink.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE, null, com.paypal.pds.core.Color.BackgroundStatesEmphasisPressed.INSTANCE, 8, null);
        }

        public final java.lang.String toString() {
            return "Default";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.LinkStyle.Default)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJF\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019"}, d2 = {"Lcom/paypal/pds/components/LinkStyle$Custom;", "Lcom/paypal/pds/components/LinkStyle;", "Lcom/paypal/pds/core/Color;", "customLinkColor", "customPressedLinkColor", "customLinkBackgroundColor", "Lcom/paypal/pds/core/Typography;", "customLinkTypography", "customPressedStateIndicationColor", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;)V", "copy", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;)Lcom/paypal/pds/components/LinkStyle$Custom;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/pds/core/Color;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/core/Typography;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Custom extends com.paypal.pds.components.LinkStyle {
        public static final int $stable = 0;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.paypal.pds.core.Color getHighSpeedVideoFpsRangesFor;
        private final com.paypal.pds.core.Color getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.paypal.pds.core.Typography getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.paypal.pds.core.Color Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.paypal.pds.core.Color getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color4) {
            super(color, color2 == null ? color : color2, color3, typography, color4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color4, "");
            this.getHighSpeedVideoFpsRangesFor = color;
            this.Camera2StreamConfigurationMap = color2;
            this.getHighResolutionOutputSizeshNQ4ISI = color3;
            this.getHighSpeedVideoSizes = typography;
            this.getHighSpeedVideoFpsRanges = color4;
        }

        public /* synthetic */ Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color.Transparent transparent, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color.BackgroundStatesEmphasisPressed backgroundStatesEmphasisPressed, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(color, (i & 2) != 0 ? null : color2, (i & 4) != 0 ? com.paypal.pds.core.Color.Transparent.INSTANCE : transparent, (i & 8) != 0 ? null : typography, (i & 16) != 0 ? com.paypal.pds.core.Color.BackgroundStatesEmphasisPressed.INSTANCE : backgroundStatesEmphasisPressed);
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Color color = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.pds.core.Color color2 = this.Camera2StreamConfigurationMap;
            com.paypal.pds.core.Color color3 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.pds.core.Typography typography = this.getHighSpeedVideoSizes;
            com.paypal.pds.core.Color color4 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom(getHighSpeedVideoFpsRangesFor=");
            sb.append(color);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(color2);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(color3);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(typography);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(color4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
            com.paypal.pds.core.Color color = this.Camera2StreamConfigurationMap;
            int hashCode2 = color == null ? 0 : color.hashCode();
            int hashCode3 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            com.paypal.pds.core.Typography typography = this.getHighSpeedVideoSizes;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (typography != null ? typography.hashCode() : 0)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.LinkStyle.Custom)) {
                return false;
            }
            com.paypal.pds.components.LinkStyle.Custom custom = (com.paypal.pds.components.LinkStyle.Custom) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, custom.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, custom.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, custom.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, custom.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, custom.getHighSpeedVideoFpsRanges);
        }

        public final com.paypal.pds.components.LinkStyle.Custom copy(com.paypal.pds.core.Color customLinkColor, com.paypal.pds.core.Color customPressedLinkColor, com.paypal.pds.core.Color customLinkBackgroundColor, com.paypal.pds.core.Typography customLinkTypography, com.paypal.pds.core.Color customPressedStateIndicationColor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customLinkColor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customLinkBackgroundColor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customPressedStateIndicationColor, "");
            return new com.paypal.pds.components.LinkStyle.Custom(customLinkColor, customPressedLinkColor, customLinkBackgroundColor, customLinkTypography, customPressedStateIndicationColor);
        }

        public static /* synthetic */ com.paypal.pds.components.LinkStyle.Custom copy$default(com.paypal.pds.components.LinkStyle.Custom custom, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                color = custom.getHighSpeedVideoFpsRangesFor;
            }
            if ((i & 2) != 0) {
                color2 = custom.Camera2StreamConfigurationMap;
            }
            com.paypal.pds.core.Color color5 = color2;
            if ((i & 4) != 0) {
                color3 = custom.getHighResolutionOutputSizeshNQ4ISI;
            }
            com.paypal.pds.core.Color color6 = color3;
            if ((i & 8) != 0) {
                typography = custom.getHighSpeedVideoSizes;
            }
            com.paypal.pds.core.Typography typography2 = typography;
            if ((i & 16) != 0) {
                color4 = custom.getHighSpeedVideoFpsRanges;
            }
            return custom.copy(color, color5, color6, typography2, color4);
        }
    }

    public /* synthetic */ LinkStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, color3, typography, color4);
    }
}
