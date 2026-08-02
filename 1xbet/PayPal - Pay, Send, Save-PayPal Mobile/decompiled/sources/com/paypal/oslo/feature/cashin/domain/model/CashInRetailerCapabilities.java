package com.paypal.oslo.feature.cashin.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInRetailerCapabilities;", "", "<init>", "(Ljava/lang/String;I)V", "BARCODE", "SWIPE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInRetailerCapabilities {
    public static final com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities BARCODE;
    public static final com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities SWIPE;
    private static final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private CashInRetailerCapabilities(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities cashInRetailerCapabilities = new com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities("BARCODE", 0);
        BARCODE = cashInRetailerCapabilities;
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities cashInRetailerCapabilities2 = new com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities("SWIPE", 1);
        SWIPE = cashInRetailerCapabilities2;
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities[] cashInRetailerCapabilitiesArr = {cashInRetailerCapabilities, cashInRetailerCapabilities2};
        getHighResolutionOutputSizeshNQ4ISI = cashInRetailerCapabilitiesArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cashInRetailerCapabilitiesArr);
    }

    public static com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities[] values() {
        return (com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities) java.lang.Enum.valueOf(com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
