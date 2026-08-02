package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/DeleteMoneyboxUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;)V", "", "moneyboxId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "Lcom/paypal/oslo/feature/savings/graphql/type/MoneyboxCategory;", "category", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/DeleteMoneyboxResult;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DeleteMoneyboxUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DeleteMoneyboxUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = savingsRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase deleteMoneyboxUseCase, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            moneyboxCategory = com.paypal.oslo.feature.savings.constants.SavingsConstants.MoneyboxDefaults.INSTANCE.getDEFAULT_CATEGORY();
        }
        return deleteMoneyboxUseCase.invoke(str, moneyboxCategory, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.goals.DeleteMoneyboxResult>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.deleteMoneybox(str, moneyboxCategory, continuation);
    }
}
