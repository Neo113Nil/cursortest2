package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/pds/components/AvatarEmphasis;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "Lcom/paypal/pds/core/PDSIndication;", "p2", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/PDSIndication;)V", "contentColor", "Lcom/paypal/pds/core/Color;", "getContentColor$pds_release", "()Lcom/paypal/pds/core/Color;", "backgroundColor", "getBackgroundColor$pds_release", "indication", "Lcom/paypal/pds/core/PDSIndication;", "getIndication$pds_release", "()Lcom/paypal/pds/core/PDSIndication;", "Default", "High", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/pds/components/AvatarEmphasis$Custom;", "Lcom/paypal/pds/components/AvatarEmphasis$Default;", "Lcom/paypal/pds/components/AvatarEmphasis$High;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AvatarEmphasis {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final com.paypal.pds.core.Color contentColor;
    private final com.paypal.pds.core.PDSIndication indication;

    private AvatarEmphasis(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.PDSIndication pDSIndication) {
        this.contentColor = color;
        this.backgroundColor = color2;
        this.indication = pDSIndication;
    }

    /* renamed from: getContentColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getBackgroundColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getIndication$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication getIndication() {
        return this.indication;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarEmphasis$Default;", "Lcom/paypal/pds/components/AvatarEmphasis;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Default extends com.paypal.pds.components.AvatarEmphasis {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarEmphasis.Default INSTANCE = new com.paypal.pds.components.AvatarEmphasis.Default();

        private Default() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, com.paypal.pds.core.PDSIndication.Base.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarEmphasis$High;", "Lcom/paypal/pds/components/AvatarEmphasis;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class High extends com.paypal.pds.components.AvatarEmphasis {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarEmphasis.High INSTANCE = new com.paypal.pds.components.AvatarEmphasis.High();

        private High() {
            super(com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral.INSTANCE, com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/AvatarEmphasis$Custom;", "Lcom/paypal/pds/components/AvatarEmphasis;", "Lcom/paypal/pds/core/Color;", "contentColor", "backgroundColor", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Custom extends com.paypal.pds.components.AvatarEmphasis {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
            super(color, color2, com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        }
    }

    public /* synthetic */ AvatarEmphasis(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.PDSIndication pDSIndication, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, pDSIndication);
    }
}
