package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001eB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\u0082\u0001\u0007\u001f !\"#$%"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "p2", "p3", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "Lcom/paypal/pds/components/BadgeEmphasis;", "emphasis", "textColor$pds_release", "(Lcom/paypal/pds/components/BadgeEmphasis;)Lcom/paypal/pds/core/Color;", "backgroundColor$pds_release", "textColorDefault", "Lcom/paypal/pds/core/Color;", "getTextColorDefault$pds_release", "()Lcom/paypal/pds/core/Color;", "textColorHigh", "getTextColorHigh$pds_release", "backgroundColorDefault", "getBackgroundColorDefault$pds_release", "backgroundColorHigh", "getBackgroundColorHigh$pds_release", "Info", "Positive", "Negative", com.google.common.net.HttpHeaders.WARNING, "Special", "Neutral", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/BadgeStyle$Custom;", "Lcom/paypal/pds/components/BadgeStyle$Info;", "Lcom/paypal/pds/components/BadgeStyle$Negative;", "Lcom/paypal/pds/components/BadgeStyle$Neutral;", "Lcom/paypal/pds/components/BadgeStyle$Positive;", "Lcom/paypal/pds/components/BadgeStyle$Special;", "Lcom/paypal/pds/components/BadgeStyle$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BadgeStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColorDefault;
    private final com.paypal.pds.core.Color backgroundColorHigh;
    private final com.paypal.pds.core.Color textColorDefault;
    private final com.paypal.pds.core.Color textColorHigh;

    private BadgeStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4) {
        this.textColorDefault = color;
        this.textColorHigh = color2;
        this.backgroundColorDefault = color3;
        this.backgroundColorHigh = color4;
    }

    /* renamed from: getTextColorDefault$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getTextColorDefault() {
        return this.textColorDefault;
    }

    /* renamed from: getTextColorHigh$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getTextColorHigh() {
        return this.textColorHigh;
    }

    /* renamed from: getBackgroundColorDefault$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColorDefault() {
        return this.backgroundColorDefault;
    }

    /* renamed from: getBackgroundColorHigh$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColorHigh() {
        return this.backgroundColorHigh;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Info;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Info extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Info INSTANCE = new com.paypal.pds.components.BadgeStyle.Info();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Info() {
            super(com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisInfo.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisInfo.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBaseInfo backgroundRoleBaseInfo = com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Positive;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Positive extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Positive INSTANCE = new com.paypal.pds.components.BadgeStyle.Positive();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Positive() {
            super(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisPositive.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisPositive.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBasePositive backgroundRoleBasePositive = com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Negative;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Negative extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Negative INSTANCE = new com.paypal.pds.components.BadgeStyle.Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNegative.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisNegative.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBaseNegative backgroundRoleBaseNegative = com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Warning;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Warning extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Warning INSTANCE = new com.paypal.pds.components.BadgeStyle.Warning();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Warning() {
            super(com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisWarning.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisWarning.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBaseWarning backgroundRoleBaseWarning = com.paypal.pds.core.Color.BackgroundRoleBaseWarning.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Special;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Special extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Special INSTANCE = new com.paypal.pds.components.BadgeStyle.Special();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Special() {
            super(com.paypal.pds.core.Color.ContentRoleBaseSpecial.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisSpecial.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisSpecial.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBaseSpecial backgroundRoleBaseSpecial = com.paypal.pds.core.Color.BackgroundRoleBaseSpecial.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Neutral;", "Lcom/paypal/pds/components/BadgeStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Neutral extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeStyle.Neutral INSTANCE = new com.paypal.pds.components.BadgeStyle.Neutral();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Neutral() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, r0, com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral.INSTANCE, null);
            com.paypal.pds.core.Color.BackgroundRoleBaseNeutral backgroundRoleBaseNeutral = com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/BadgeStyle$Custom;", "Lcom/paypal/pds/components/BadgeStyle;", "Lcom/paypal/pds/core/Color;", "backgroundColor", "iconTint", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Custom extends com.paypal.pds.components.BadgeStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
            super(color2, color2, color, color, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        }
    }

    public final com.paypal.pds.core.Color textColor$pds_release(com.paypal.pds.components.BadgeEmphasis emphasis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emphasis, "");
        int i = com.paypal.pds.components.BadgeStyle.WhenMappings.$EnumSwitchMapping$0[emphasis.ordinal()];
        if (i == 1) {
            return this.textColorDefault;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.textColorHigh;
    }

    public final com.paypal.pds.core.Color backgroundColor$pds_release(com.paypal.pds.components.BadgeEmphasis emphasis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emphasis, "");
        int i = com.paypal.pds.components.BadgeStyle.WhenMappings.$EnumSwitchMapping$0[emphasis.ordinal()];
        if (i == 1) {
            return this.backgroundColorDefault;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.backgroundColorHigh;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.pds.components.BadgeEmphasis.values().length];
            try {
                iArr[com.paypal.pds.components.BadgeEmphasis.Default.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.pds.components.BadgeEmphasis.High.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BadgeStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, color3, color4);
    }
}
