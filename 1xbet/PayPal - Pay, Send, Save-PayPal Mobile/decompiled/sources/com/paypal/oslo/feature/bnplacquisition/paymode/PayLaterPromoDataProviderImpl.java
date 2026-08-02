package com.paypal.oslo.feature.bnplacquisition.paymode;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayLaterPromoDataProviderImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPromoDataProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig;", "paymodeConfig", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeContentProvider;", "payModeContentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig;Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeContentProvider;)V", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoType;", "type", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoData;", "getPromoData", "(Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoType;)Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoData;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeContentProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayLaterPromoDataProviderImpl implements com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayLaterPromoDataProviderImpl(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig payModeConfig, com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider payModeContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeContentProvider, "");
        this.getHighSpeedVideoSizes = payModeConfig;
        this.Camera2StreamConfigurationMap = payModeContentProvider;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider
    public final com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoData getPromoData(com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        int i = com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoData(this.Camera2StreamConfigurationMap.getTitle(type), this.Camera2StreamConfigurationMap.getDescription(type), this.getHighSpeedVideoSizes.getUis().getPromoCardArt().getCardArtUrl(), com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "bnpl_contactless_mobile", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_PAY_LATER_SOURCE);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoData(this.Camera2StreamConfigurationMap.getTitle(type), this.Camera2StreamConfigurationMap.getDescription(type), this.getHighSpeedVideoSizes.getUis().getPromoCardArt().getCardArtUrl(), "activate", "bnpl_contactless_mobile", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.ACTIVATE_PROMO_PAY_LATER_SOURCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.APPLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
