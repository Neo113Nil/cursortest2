package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;", "", "<init>", "(Ljava/lang/String;)V", "NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlowEntryPoint {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint[] getHighSpeedVideoFpsRangesFor;

    private FlowEntryPoint(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint("NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING");
        NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING = flowEntryPoint;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint[] flowEntryPointArr = {flowEntryPoint};
        getHighSpeedVideoFpsRangesFor = flowEntryPointArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(flowEntryPointArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
