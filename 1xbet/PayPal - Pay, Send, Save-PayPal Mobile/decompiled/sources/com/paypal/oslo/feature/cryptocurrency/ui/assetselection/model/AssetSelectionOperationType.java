package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "RECEIVE", "LOYALTY_REDEEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AssetSelectionOperationType {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType BUY;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType LOYALTY_REDEEM;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType RECEIVE;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType SELL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private AssetSelectionOperationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType("BUY", 0);
        BUY = assetSelectionOperationType;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType2 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType("SELL", 1);
        SELL = assetSelectionOperationType2;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType3 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType("RECEIVE", 2);
        RECEIVE = assetSelectionOperationType3;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType4 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType("LOYALTY_REDEEM", 3);
        LOYALTY_REDEEM = assetSelectionOperationType4;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType[] assetSelectionOperationTypeArr = {assetSelectionOperationType, assetSelectionOperationType2, assetSelectionOperationType3, assetSelectionOperationType4};
        Camera2StreamConfigurationMap = assetSelectionOperationTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(assetSelectionOperationTypeArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
