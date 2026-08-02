package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\"#$%&'BG\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0001\f()*+,-./0123"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "p1", "p2", "p3", "Lcom/paypal/pds/core/PDSIndication;", "p4", "p5", "Landroidx/compose/ui/unit/Dp;", "p6", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/PDSIndication;Lcom/paypal/pds/core/Color;F)V", "textColor", "Lcom/paypal/pds/core/Color;", "getTextColor$pds_release", "()Lcom/paypal/pds/core/Color;", "backgroundColor", "getBackgroundColor$pds_release", "loaderTrackColor", "getLoaderTrackColor$pds_release", "loaderProgressColor", "getLoaderProgressColor$pds_release", "indication", "Lcom/paypal/pds/core/PDSIndication;", "getIndication$pds_release", "()Lcom/paypal/pds/core/PDSIndication;", "borderColor", "getBorderColor$pds_release", "borderWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBorderWidth-D9Ej5fM$pds_release", "()F", "Primary", "Secondary", "Tertiary", "Outline", "Overlay", "TertiaryContained", "Lcom/paypal/pds/components/AvatarButtonStyle;", "Lcom/paypal/pds/components/BannerButtonStyle;", "Lcom/paypal/pds/components/ButtonStyle$Outline;", "Lcom/paypal/pds/components/ButtonStyle$Overlay;", "Lcom/paypal/pds/components/ButtonStyle$Primary;", "Lcom/paypal/pds/components/ButtonStyle$Secondary;", "Lcom/paypal/pds/components/ButtonStyle$Tertiary;", "Lcom/paypal/pds/components/ButtonStyle$TertiaryContained;", "Lcom/paypal/pds/components/ChipItemStyle;", "Lcom/paypal/pds/components/InlineButtonStyle;", "Lcom/paypal/pds/components/Outline;", "Lcom/paypal/pds/components/SelectedChipStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ButtonStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final com.paypal.pds.core.Color borderColor;
    private final float borderWidth;
    private final com.paypal.pds.core.PDSIndication indication;
    private final com.paypal.pds.core.Color loaderProgressColor;
    private final com.paypal.pds.core.Color loaderTrackColor;
    private final com.paypal.pds.core.Color textColor;

    private ButtonStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, com.paypal.pds.core.PDSIndication pDSIndication, com.paypal.pds.core.Color color5, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color5, "");
        this.textColor = color;
        this.backgroundColor = color2;
        this.loaderTrackColor = color3;
        this.loaderProgressColor = color4;
        this.indication = pDSIndication;
        this.borderColor = color5;
        this.borderWidth = f;
    }

    /* renamed from: getTextColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getTextColor() {
        return this.textColor;
    }

    /* renamed from: getBackgroundColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getLoaderTrackColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getLoaderTrackColor() {
        return this.loaderTrackColor;
    }

    /* renamed from: getLoaderProgressColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getLoaderProgressColor() {
        return this.loaderProgressColor;
    }

    public /* synthetic */ ButtonStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, com.paypal.pds.core.PDSIndication pDSIndication, com.paypal.pds.core.Color color5, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, color3, color4, (i & 16) != 0 ? com.paypal.pds.core.PDSIndication.Base.INSTANCE : pDSIndication, (i & 32) != 0 ? com.paypal.pds.core.Color.Transparent.INSTANCE : color5, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, null);
    }

    /* renamed from: getIndication$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication getIndication() {
        return this.indication;
    }

    /* renamed from: getBorderColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: getBorderWidth-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$Primary;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Primary extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.Primary INSTANCE = new com.paypal.pds.components.ButtonStyle.Primary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Primary() {
            super(r0, r1, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, r2, null, 0.0f, 96, null);
            com.paypal.pds.core.Color.ContentRoleEmphasisNeutral contentRoleEmphasisNeutral = com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE;
            com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral backgroundRoleEmphasisNeutral = com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral.INSTANCE;
            com.paypal.pds.core.PDSIndication.Emphasis emphasis = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$Secondary;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Secondary extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.Secondary INSTANCE = new com.paypal.pds.components.ButtonStyle.Secondary();

        private Secondary() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, com.paypal.pds.core.Color.BorderUtilityGlow.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$Tertiary;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Tertiary extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.Tertiary INSTANCE = new com.paypal.pds.components.ButtonStyle.Tertiary();

        private Tertiary() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, 0.0f, 112, null);
        }
    }

    @kotlin.Deprecated(message = "Deprecated\n\nThe Outline Button variant is deprecated and will be removed in a future release.\n\nPlease use the Secondary Button variant instead.\n\nWork with your design team to adjust this change or join Design System Office Hours for guidance", replaceWith = @kotlin.ReplaceWith(expression = "ButtonStyle.Secondary", imports = {}))
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$Outline;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Outline extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.Outline INSTANCE = new com.paypal.pds.components.ButtonStyle.Outline();

        private Outline() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, com.paypal.pds.core.Color.BorderRoleBaseNeutral.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$Overlay;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Overlay extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.Overlay INSTANCE = new com.paypal.pds.components.ButtonStyle.Overlay();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Overlay() {
            super(r0, r1, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, r2, null, 0.0f, 96, null);
            com.paypal.pds.core.Color.ContentUtilityInverse contentUtilityInverse = com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE;
            com.paypal.pds.core.Color.BackgroundOverlayUi backgroundOverlayUi = com.paypal.pds.core.Color.BackgroundOverlayUi.INSTANCE;
            com.paypal.pds.core.PDSIndication.Emphasis emphasis = com.paypal.pds.core.PDSIndication.Emphasis.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonStyle$TertiaryContained;", "Lcom/paypal/pds/components/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class TertiaryContained extends com.paypal.pds.components.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonStyle.TertiaryContained INSTANCE = new com.paypal.pds.components.ButtonStyle.TertiaryContained();

        private TertiaryContained() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, 0.0f, 112, null);
        }
    }

    public /* synthetic */ ButtonStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.paypal.pds.core.Color color3, com.paypal.pds.core.Color color4, com.paypal.pds.core.PDSIndication pDSIndication, com.paypal.pds.core.Color color5, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, color3, color4, pDSIndication, color5, f);
    }
}
