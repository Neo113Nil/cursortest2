package com.paypal.oslo.feature.wallet.banks.ui.router.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/model/AddBankMethod;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_BANKING", "MANUAL", "WEBSITE", "MANUAL_VIA_WEB", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankMethod {
    public static final com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod MANUAL;
    public static final com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod MANUAL_VIA_WEB;
    public static final com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod OPEN_BANKING;
    public static final com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod WEBSITE;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private AddBankMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod addBankMethod = new com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod("OPEN_BANKING", 0);
        OPEN_BANKING = addBankMethod;
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod addBankMethod2 = new com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod("MANUAL", 1);
        MANUAL = addBankMethod2;
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod addBankMethod3 = new com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod("WEBSITE", 2);
        WEBSITE = addBankMethod3;
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod addBankMethod4 = new com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod("MANUAL_VIA_WEB", 3);
        MANUAL_VIA_WEB = addBankMethod4;
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod addBankMethod5 = new com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod("UNKNOWN", 4);
        UNKNOWN = addBankMethod5;
        com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod[] addBankMethodArr = {addBankMethod, addBankMethod2, addBankMethod3, addBankMethod4, addBankMethod5};
        getHighResolutionOutputSizeshNQ4ISI = addBankMethodArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(addBankMethodArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod[] values() {
        return (com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
