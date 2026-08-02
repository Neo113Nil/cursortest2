package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Minimum", "Statement", "CustomAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayMethod {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod CustomAmount;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod Minimum;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod Statement;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private AutopayMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod("Minimum", 0);
        Minimum = autopayMethod;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod("Statement", 1);
        Statement = autopayMethod2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod("CustomAmount", 2);
        CustomAmount = autopayMethod3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod[] autopayMethodArr = {autopayMethod, autopayMethod2, autopayMethod3};
        getHighResolutionOutputSizeshNQ4ISI = autopayMethodArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(autopayMethodArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
