package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "", "getLastNChars", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentKt {
    public static final java.lang.String getLastNChars(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        java.lang.String lastNChars;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        if (!(fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount)) {
            return (!(fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) || (lastNChars = ((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) fundingInstrument).getLastNChars()) == null) ? "" : lastNChars;
        }
        java.lang.String lastNChars2 = ((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) fundingInstrument).getLastNChars();
        return lastNChars2 == null ? "" : lastNChars2;
    }
}
