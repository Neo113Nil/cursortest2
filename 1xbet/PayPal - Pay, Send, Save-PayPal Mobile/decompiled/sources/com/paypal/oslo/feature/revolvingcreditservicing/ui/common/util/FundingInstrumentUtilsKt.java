package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "accountType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;", "mapBankAccountType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentUtilsKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType mapBankAccountType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.INSTANCE.from(str);
    }
}
