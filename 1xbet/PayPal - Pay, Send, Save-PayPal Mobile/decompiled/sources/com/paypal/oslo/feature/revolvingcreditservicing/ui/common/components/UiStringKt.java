package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString$PlainString;", "toUiString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString$PlainString;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString$StringResOnly;", "(I)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString$StringResOnly;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "orEmpty", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UiStringKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString toUiString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly toUiString(int i) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
        return uiString == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE : uiString;
    }
}
