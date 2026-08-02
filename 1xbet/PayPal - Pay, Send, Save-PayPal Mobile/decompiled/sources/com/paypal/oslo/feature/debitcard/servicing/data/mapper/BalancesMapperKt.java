package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitInstrumentBalancesMapper", "Lkotlin/jvm/functions/Function1;", "getDebitInstrumentBalancesMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BalancesMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances> debitInstrumentBalancesMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.BalancesMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.BalancesMapperKt.m14276$r8$lambda$r5zRPulBfqAHIhxnVL7Gl0Abg((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances> getDebitInstrumentBalancesMapper() {
        return debitInstrumentBalancesMapper;
    }

    /* renamed from: $r8$lambda$r5zRPulBf-q-AHIhxnVL7Gl0Abg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances m14276$r8$lambda$r5zRPulBfqAHIhxnVL7Gl0Abg(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount(balances.getTotalAvailableAmount().getCurrencyCode().toString(), balances.getTotalAvailableAmount().getValue(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), kotlin.collections.CollectionsKt.emptyList());
    }
}
