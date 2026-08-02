package com.paypal.oslo.feature.wallet.cards.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013j\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSizeConfig;", "", "Lcom/paypal/pds/components/IconSize;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "Lcom/paypal/pds/core/Typography;", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;ILcom/paypal/pds/components/IconSize;FLcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Typography;F)V", "iconSize", "Lcom/paypal/pds/components/IconSize;", "getIconSize", "()Lcom/paypal/pds/components/IconSize;", "iconSpacing", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getIconSpacing-D9Ej5fM", "()F", "primaryTypography", "Lcom/paypal/pds/core/Typography;", "getPrimaryTypography", "()Lcom/paypal/pds/core/Typography;", "secondaryTypography", "getSecondaryTypography", "verticalSpacing", "getVerticalSpacing-D9Ej5fM", "SMALL", "STANDARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailsSizeConfig {
    public static final com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig SMALL;
    public static final com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig STANDARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig[] getHighSpeedVideoSizes;
    private final com.paypal.pds.components.IconSize iconSize;
    private final float iconSpacing;
    private final com.paypal.pds.core.Typography primaryTypography;
    private final com.paypal.pds.core.Typography secondaryTypography;
    private final float verticalSpacing;

    private CardDetailsSizeConfig(java.lang.String str, int i, com.paypal.pds.components.IconSize iconSize, float f, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Typography typography2, float f2) {
        this.iconSize = iconSize;
        this.iconSpacing = f;
        this.primaryTypography = typography;
        this.secondaryTypography = typography2;
        this.verticalSpacing = f2;
    }

    public final com.paypal.pds.components.IconSize getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSpacing() {
        return this.iconSpacing;
    }

    public final com.paypal.pds.core.Typography getPrimaryTypography() {
        return this.primaryTypography;
    }

    public final com.paypal.pds.core.Typography getSecondaryTypography() {
        return this.secondaryTypography;
    }

    /* renamed from: getVerticalSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalSpacing() {
        return this.verticalSpacing;
    }

    static {
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig cardDetailsSizeConfig = new com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig("SMALL", 0, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.Typography.BodyMedium.INSTANCE, com.paypal.pds.core.Typography.BodySmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
        SMALL = cardDetailsSizeConfig;
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig cardDetailsSizeConfig2 = new com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig("STANDARD", 1, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
        STANDARD = cardDetailsSizeConfig2;
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig[] cardDetailsSizeConfigArr = {cardDetailsSizeConfig, cardDetailsSizeConfig2};
        getHighSpeedVideoSizes = cardDetailsSizeConfigArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cardDetailsSizeConfigArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig[] values() {
        return (com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
