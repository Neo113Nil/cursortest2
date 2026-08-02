package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/data/repository/mock/MockBusinessesHubRepository;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesHubRepository;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesWithIncentives;", "getLinkedBusinesses", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "p2", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "p3", "p4", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockBusinessesHubRepository implements com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockBusinessesHubRepository() {
    }

    private static com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType p3, java.lang.String p4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p3);
        sb.append(" - ");
        sb.append(p2);
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem(p0, p1, new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(sb.toString(), p3, null, p2, null, null, null, 116, null), null, null, null, p4, 56, null);
    }

    @Override // com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository
    public final java.lang.Object getLinkedBusinesses(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem[]{getHighSpeedVideoFpsRangesFor("BA-001", "Starbucks", "1234", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD, "https://upload.wikimedia.org/wikipedia/en/thumb/d/d3/Starbucks_Corporation_Logo_2011.svg/1200px-Starbucks_Corporation_Logo_2011.svg.png"), getHighSpeedVideoFpsRangesFor("BA-002", "Amazon", "5678", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.DEBIT_CARD, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Amazon_logo.svg/2560px-Amazon_logo.svg.png"), getHighSpeedVideoFpsRangesFor("BA-003", "Uber", "9012", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD, "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Uber_logo_2018.svg/2560px-Uber_logo_2018.svg.png"), getHighSpeedVideoFpsRangesFor("BA-004", "Target", "3456", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.DEBIT_CARD, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Target_logo.svg/2560px-Target_logo.svg.png"), getHighSpeedVideoFpsRangesFor("BA-005", "Walmart", "7890", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Walmart_logo.svg/2560px-Walmart_logo.svg.png")});
            com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives businessesWithIncentives = new com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives(listOf, listOf.size());
            defaultRaise.complete();
            return new arrow.core.Either.Right(businessesWithIncentives);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
