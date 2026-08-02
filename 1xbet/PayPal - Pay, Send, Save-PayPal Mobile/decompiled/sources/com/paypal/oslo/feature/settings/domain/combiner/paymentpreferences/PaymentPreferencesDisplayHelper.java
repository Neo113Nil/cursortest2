package com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/combiner/paymentpreferences/PaymentPreferencesDisplayHelper;", "", "<init>", "()V", "", "itemId", "Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "strings", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "status", "getSubtitleText", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;)Ljava/lang/String;", "getStatusText", "(Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentPreferencesDisplayHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper INSTANCE = new com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper();

    private PaymentPreferencesDisplayHelper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return r4.getAutoPay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CREDIT) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r3.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CASHBACK_CARD) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        return r4.getPaypalCardFallbackText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getSubtitleText(java.lang.String itemId, com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings strings, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        switch (itemId.hashCode()) {
            case -11599639:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE)) {
                    return status == null ? strings.getManageYourBalanceOptions() : strings.getAutoReload();
                }
                return "";
            case 1290675020:
                break;
            case 1353166612:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.AUTO_SAVE)) {
                    return strings.getAutoSave();
                }
                return "";
            case 1805429218:
                break;
            default:
                return "";
        }
    }

    public final java.lang.String getStatusText(com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings strings, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        java.lang.String text$default = status != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status, strings.getOn(), null, strings.getOff(), null, 10, null) : null;
        return text$default == null ? "" : text$default;
    }
}
