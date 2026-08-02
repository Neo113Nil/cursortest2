package com.paypal.oslo.feature.bnplservicing.ui.plandetails.content;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/UsedVccContent;", "", "<init>", "()V", "", "merchantName", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "purchaseMerchantText", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "lastFour", "lastFourDigits", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "singleUseLabel", "getSingleUseLabel", "alertMessage", "getAlertMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UsedVccContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText singleUseLabel = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_single_use, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText alertMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_single_use_card_alert_text, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSingleUseLabel() {
        return this.singleUseLabel;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText purchaseMerchantText(java.lang.String merchantName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_pl2go_half_sheet_purchase_merchant, merchantName);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getAlertMessage() {
        return this.alertMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText lastFourDigits(java.lang.String lastFour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFour, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_single_use_card_sheet_default_last4_digits, lastFour);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
