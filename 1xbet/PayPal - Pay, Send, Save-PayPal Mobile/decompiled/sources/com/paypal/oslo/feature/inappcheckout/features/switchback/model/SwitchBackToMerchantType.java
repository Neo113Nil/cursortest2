package com.paypal.oslo.feature.inappcheckout.features.switchback.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "", "<init>", "(Ljava/lang/String;I)V", "", "isResume", "()Z", "Resume", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchBackToMerchantType {
    public static final com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType Cancel;
    public static final com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType Resume;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SwitchBackToMerchantType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType switchBackToMerchantType = new com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType("Resume", 0);
        Resume = switchBackToMerchantType;
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType switchBackToMerchantType2 = new com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, 1);
        Cancel = switchBackToMerchantType2;
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType[] switchBackToMerchantTypeArr = {switchBackToMerchantType, switchBackToMerchantType2};
        getHighSpeedVideoFpsRanges = switchBackToMerchantTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(switchBackToMerchantTypeArr);
    }

    public final boolean isResume() {
        return this == Resume;
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
