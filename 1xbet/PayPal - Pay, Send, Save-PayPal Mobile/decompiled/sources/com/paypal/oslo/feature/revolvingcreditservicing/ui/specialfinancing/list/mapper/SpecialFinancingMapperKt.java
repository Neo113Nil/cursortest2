package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "toMerchantNameUiString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toMerchantNameUiString(java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_default_merchant_name, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str);
    }
}
