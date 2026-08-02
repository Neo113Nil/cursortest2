package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "backgroundColor", "Lcom/paypal/pds/core/Color;", "getBackgroundColor$pds_release", "()Lcom/paypal/pds/core/Color;", "progressColor", "getProgressColor$pds_release", "Info", "Positive", "Negative", com.google.common.net.HttpHeaders.WARNING, "Special", "Neutral", "Brand", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/ProgressBarStyle$Brand;", "Lcom/paypal/pds/components/ProgressBarStyle$Custom;", "Lcom/paypal/pds/components/ProgressBarStyle$Info;", "Lcom/paypal/pds/components/ProgressBarStyle$Negative;", "Lcom/paypal/pds/components/ProgressBarStyle$Neutral;", "Lcom/paypal/pds/components/ProgressBarStyle$Positive;", "Lcom/paypal/pds/components/ProgressBarStyle$Special;", "Lcom/paypal/pds/components/ProgressBarStyle$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ProgressBarStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final com.paypal.pds.core.Color progressColor;

    private ProgressBarStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        this.backgroundColor = color;
        this.progressColor = color2;
    }

    /* renamed from: getBackgroundColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getProgressColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getProgressColor() {
        return this.progressColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Info;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Info extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Info INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Info();

        private Info() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisInfo.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Positive;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Positive extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Positive INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Positive();

        private Positive() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisPositive.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Negative;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Negative extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Negative INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Negative();

        private Negative() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisNegative.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Warning;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Warning extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Warning INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Warning();

        private Warning() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisWarning.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Special;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Special extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Special INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Special();

        private Special() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisSpecial.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Neutral;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Neutral extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Neutral INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Neutral();

        private Neutral() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BorderRoleEmphasisNeutral.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Brand;", "Lcom/paypal/pds/components/ProgressBarStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Brand extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ProgressBarStyle.Brand INSTANCE = new com.paypal.pds.components.ProgressBarStyle.Brand();

        private Brand() {
            super(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/ProgressBarStyle$Custom;", "Lcom/paypal/pds/components/ProgressBarStyle;", "Lcom/paypal/pds/core/Color;", "trackerColor", "progressColor", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Custom extends com.paypal.pds.components.ProgressBarStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
            super(color, color2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        }
    }

    public /* synthetic */ ProgressBarStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2);
    }
}
