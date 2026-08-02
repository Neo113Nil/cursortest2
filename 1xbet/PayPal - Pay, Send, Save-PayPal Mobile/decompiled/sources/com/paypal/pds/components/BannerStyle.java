package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0001\u0007\u001a\u001b\u001c\u001d\u001e\u001f "}, d2 = {"Lcom/paypal/pds/components/BannerStyle;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/pds/core/Color;", "p1", "p2", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "startIcon", "Lcom/paypal/pds/core/Icon;", "getStartIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "backgroundColor", "Lcom/paypal/pds/core/Color;", "getBackgroundColor$pds_release", "()Lcom/paypal/pds/core/Color;", "startIconColor", "getStartIconColor$pds_release", "Info", "Positive", "Negative", com.google.common.net.HttpHeaders.WARNING, "Special", "Neutral", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/BannerStyle$Custom;", "Lcom/paypal/pds/components/BannerStyle$Info;", "Lcom/paypal/pds/components/BannerStyle$Negative;", "Lcom/paypal/pds/components/BannerStyle$Neutral;", "Lcom/paypal/pds/components/BannerStyle$Positive;", "Lcom/paypal/pds/components/BannerStyle$Special;", "Lcom/paypal/pds/components/BannerStyle$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class BannerStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final com.paypal.pds.core.Icon startIcon;
    private final com.paypal.pds.core.Color startIconColor;

    private BannerStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        this.startIcon = icon;
        this.backgroundColor = color;
        this.startIconColor = color2;
    }

    /* renamed from: getStartIcon$pds_release, reason: from getter */
    public final com.paypal.pds.core.Icon getStartIcon() {
        return this.startIcon;
    }

    /* renamed from: getBackgroundColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getStartIconColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getStartIconColor() {
        return this.startIconColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Info;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V", "Lcom/paypal/pds/core/Icon;", "icon", "invoke", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/BannerStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Info extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Info INSTANCE = new com.paypal.pds.components.BannerStyle.Info();

        private Info() {
            super(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, null);
        }

        public final com.paypal.pds.components.BannerStyle invoke(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.BannerStyle.Custom(icon, getBackgroundColor(), getStartIconColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Positive;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Positive extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Positive INSTANCE = new com.paypal.pds.components.BannerStyle.Positive();

        private Positive() {
            super(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Negative;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Negative extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Negative INSTANCE = new com.paypal.pds.components.BannerStyle.Negative();

        private Negative() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Warning;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Warning extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Warning INSTANCE = new com.paypal.pds.components.BannerStyle.Warning();

        private Warning() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseWarning.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Special;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V", "Lcom/paypal/pds/core/Icon;", "icon", "invoke", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/BannerStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Special extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Special INSTANCE = new com.paypal.pds.components.BannerStyle.Special();

        private Special() {
            super(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseSpecial.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseSpecial.INSTANCE, null);
        }

        public final com.paypal.pds.components.BannerStyle invoke(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.BannerStyle.Custom(icon, getBackgroundColor(), getStartIconColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Neutral;", "Lcom/paypal/pds/components/BannerStyle;", "<init>", "()V", "Lcom/paypal/pds/core/Icon;", "icon", "invoke", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/BannerStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Neutral extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BannerStyle.Neutral INSTANCE = new com.paypal.pds.components.BannerStyle.Neutral();

        private Neutral() {
            super(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, null);
        }

        public final com.paypal.pds.components.BannerStyle invoke(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.BannerStyle.Custom(icon, getBackgroundColor(), getStartIconColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/components/BannerStyle$Custom;", "Lcom/paypal/pds/components/BannerStyle;", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/core/Color;", "backgroundColor", "startIconColor", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Custom extends com.paypal.pds.components.BannerStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
            super(icon, color, color2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        }
    }

    public /* synthetic */ BannerStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, color, color2);
    }
}
