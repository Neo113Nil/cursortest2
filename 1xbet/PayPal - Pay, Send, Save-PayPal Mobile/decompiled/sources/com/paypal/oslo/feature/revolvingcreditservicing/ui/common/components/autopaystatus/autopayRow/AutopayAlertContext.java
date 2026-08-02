package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayAlertContext;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "alertTextRes", com.visa.cbp.getEncExpo.warmup, "getAlertTextRes", "()I", "PaymentPastDue", "PartialError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayAlertContext {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext PartialError;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext PaymentPastDue;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int alertTextRes;

    private AutopayAlertContext(java.lang.String str, int i, int i2) {
        this.alertTextRes = i2;
    }

    public final int getAlertTextRes() {
        return this.alertTextRes;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext autopayAlertContext = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext("PaymentPastDue", 0, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_debt_collection_notice);
        PaymentPastDue = autopayAlertContext;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext autopayAlertContext2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext("PartialError", 1, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_error_details);
        PartialError = autopayAlertContext2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext[] autopayAlertContextArr = {autopayAlertContext, autopayAlertContext2};
        Camera2StreamConfigurationMap = autopayAlertContextArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(autopayAlertContextArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
