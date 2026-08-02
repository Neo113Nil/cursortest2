package com.paypal.oslo.feature.bnplservicing.ui.plandetails.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;", "", "<init>", "()V", "", "amount", "date", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "autopayOffMessage", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "confirmButtonText", "getConfirmButtonText", "neverMindButtonText", "getNeverMindButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TurnOffAutopayContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_turn_autopay_off_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText description = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_turn_autopay_off_description, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText confirmButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_confirm_autopay_off, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText neverMindButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_never_mind, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getNeverMindButtonText() {
        return this.neverMindButtonText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText autopayOffMessage(java.lang.String amount, java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_autopay_off_message, amount, date);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
