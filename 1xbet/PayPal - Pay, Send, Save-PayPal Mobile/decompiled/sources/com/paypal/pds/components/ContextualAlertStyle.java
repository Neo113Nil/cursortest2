package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB%\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0007\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/pds/components/IconSize;", "p1", "Lcom/paypal/pds/core/Color;", "p2", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/IconSize;Lcom/paypal/pds/core/Color;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "iconSize", "Lcom/paypal/pds/components/IconSize;", "getIconSize$pds_release", "()Lcom/paypal/pds/components/IconSize;", "iconTintColor", "Lcom/paypal/pds/core/Color;", "getIconTintColor$pds_release", "()Lcom/paypal/pds/core/Color;", "Positive", "Negative", com.google.common.net.HttpHeaders.WARNING, "Neutral", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/ContextualAlertStyle$Custom;", "Lcom/paypal/pds/components/ContextualAlertStyle$Negative;", "Lcom/paypal/pds/components/ContextualAlertStyle$Neutral;", "Lcom/paypal/pds/components/ContextualAlertStyle$Positive;", "Lcom/paypal/pds/components/ContextualAlertStyle$Warning;", "Lcom/paypal/pds/components/PasswordNeutral;", "Lcom/paypal/pds/components/PasswordPositive;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContextualAlertStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.pds.components.IconSize iconSize;
    private final com.paypal.pds.core.Color iconTintColor;

    private ContextualAlertStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color) {
        this.icon = icon;
        this.iconSize = iconSize;
        this.iconTintColor = color;
    }

    /* renamed from: getIcon$pds_release, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ ContextualAlertStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.components.IconSize.XSmall xSmall, com.paypal.pds.core.Color color, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, (i & 2) != 0 ? com.paypal.pds.components.IconSize.XSmall.INSTANCE : xSmall, color, null);
    }

    /* renamed from: getIconSize$pds_release, reason: from getter */
    public final com.paypal.pds.components.IconSize getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getIconTintColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getIconTintColor() {
        return this.iconTintColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle$Positive;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "<init>", "()V", "Lcom/paypal/pds/core/Icon;", "icon", "invoke", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/ContextualAlertStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Positive extends com.paypal.pds.components.ContextualAlertStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ContextualAlertStyle.Positive INSTANCE = new com.paypal.pds.components.ContextualAlertStyle.Positive();

        private Positive() {
            super(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, null, com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, 2, null);
        }

        public final com.paypal.pds.components.ContextualAlertStyle invoke(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.ContextualAlertStyle.Custom(icon, getIconTintColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle$Negative;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Negative extends com.paypal.pds.components.ContextualAlertStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ContextualAlertStyle.Negative INSTANCE = new com.paypal.pds.components.ContextualAlertStyle.Negative();

        private Negative() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, 2, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle$Warning;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Warning extends com.paypal.pds.components.ContextualAlertStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ContextualAlertStyle.Warning INSTANCE = new com.paypal.pds.components.ContextualAlertStyle.Warning();

        private Warning() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, null, com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, 2, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle$Neutral;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "<init>", "()V", "Lcom/paypal/pds/core/Icon;", "icon", "invoke", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/ContextualAlertStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Neutral extends com.paypal.pds.components.ContextualAlertStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ContextualAlertStyle.Neutral INSTANCE = new com.paypal.pds.components.ContextualAlertStyle.Neutral();

        private Neutral() {
            super(com.paypal.pds.core.Icon.Info.INSTANCE, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, 2, null);
        }

        public final com.paypal.pds.components.ContextualAlertStyle invoke(com.paypal.pds.core.Icon icon) {
            return new com.paypal.pds.components.ContextualAlertStyle.Custom(icon, getIconTintColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/ContextualAlertStyle$Custom;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/core/Color;", "iconTintColor", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Custom extends com.paypal.pds.components.ContextualAlertStyle {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color) {
            super(icon, null, color, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        }
    }

    public /* synthetic */ ContextualAlertStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, iconSize, color);
    }
}
