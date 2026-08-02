package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/pds/components/SliderStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "activeTrackColor", "Lcom/paypal/pds/core/Color;", "getActiveTrackColor$pds_release", "()Lcom/paypal/pds/core/Color;", "inactiveTrackColor", "getInactiveTrackColor$pds_release", "Neutral", "Info", "BrandPrimary", "BrandSecondary", "BrandTertiary", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/SliderStyle$BrandPrimary;", "Lcom/paypal/pds/components/SliderStyle$BrandSecondary;", "Lcom/paypal/pds/components/SliderStyle$BrandTertiary;", "Lcom/paypal/pds/components/SliderStyle$Custom;", "Lcom/paypal/pds/components/SliderStyle$Info;", "Lcom/paypal/pds/components/SliderStyle$Neutral;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class SliderStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color activeTrackColor;
    private final com.paypal.pds.core.Color inactiveTrackColor;

    private SliderStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        this.activeTrackColor = color;
        this.inactiveTrackColor = color2;
    }

    /* renamed from: getActiveTrackColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getActiveTrackColor() {
        return this.activeTrackColor;
    }

    public /* synthetic */ SliderStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral backgroundRoleBaseNeutral, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, (i & 2) != 0 ? com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE : backgroundRoleBaseNeutral, null);
    }

    /* renamed from: getInactiveTrackColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getInactiveTrackColor() {
        return this.inactiveTrackColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$Neutral;", "Lcom/paypal/pds/components/SliderStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Neutral extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.SliderStyle.Neutral INSTANCE = new com.paypal.pds.components.SliderStyle.Neutral();

        /* JADX WARN: Multi-variable type inference failed */
        private Neutral() {
            super(com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$Info;", "Lcom/paypal/pds/components/SliderStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Info extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.SliderStyle.Info INSTANCE = new com.paypal.pds.components.SliderStyle.Info();

        /* JADX WARN: Multi-variable type inference failed */
        private Info() {
            super(com.paypal.pds.core.Color.BackgroundRoleEmphasisInfo.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$BrandPrimary;", "Lcom/paypal/pds/components/SliderStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BrandPrimary extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.SliderStyle.BrandPrimary INSTANCE = new com.paypal.pds.components.SliderStyle.BrandPrimary();

        /* JADX WARN: Multi-variable type inference failed */
        private BrandPrimary() {
            super(com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$BrandSecondary;", "Lcom/paypal/pds/components/SliderStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BrandSecondary extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.SliderStyle.BrandSecondary INSTANCE = new com.paypal.pds.components.SliderStyle.BrandSecondary();

        /* JADX WARN: Multi-variable type inference failed */
        private BrandSecondary() {
            super(com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$BrandTertiary;", "Lcom/paypal/pds/components/SliderStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BrandTertiary extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.SliderStyle.BrandTertiary INSTANCE = new com.paypal.pds.components.SliderStyle.BrandTertiary();

        /* JADX WARN: Multi-variable type inference failed */
        private BrandTertiary() {
            super(com.paypal.pds.core.Color.BackgroundBrandTertiary.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/SliderStyle$Custom;", "Lcom/paypal/pds/components/SliderStyle;", "Lcom/paypal/pds/core/Color;", "activeTrackColor", "inactiveTrackColor", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Custom extends com.paypal.pds.components.SliderStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
            super(color, color2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        }

        public /* synthetic */ Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral backgroundRoleBaseNeutral, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(color, (i & 2) != 0 ? com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE : backgroundRoleBaseNeutral);
        }
    }

    public /* synthetic */ SliderStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2);
    }
}
