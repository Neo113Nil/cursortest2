package com.paypal.oslo.feature.identity.sna.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0004H\u0096@¢\u0006\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/data/repository/DefaultSNAConsentRepository;", "Lcom/paypal/oslo/feature/identity/sna/domain/repository/SNAConsentRepository;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentStatus;", "getSNAConsentStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult;", "updateSNAConsent", "(Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "toggleSNAConsent", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "getMobileNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultSNAConsentRepository implements com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DefaultSNAConsentRepository() {
    }

    @Override // com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository
    public final java.lang.Object getSNAConsentStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError, ? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus sNAConsentStatus = com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus.DENY_CONSENT;
            defaultRaise.complete();
            return new arrow.core.Either.Right(sNAConsentStatus);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository
    public final java.lang.Object updateSNAConsent(com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation sNAConsentOperation, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError, ? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success success = com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success.INSTANCE;
            defaultRaise.complete();
            return new arrow.core.Either.Right(success);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository
    public final java.lang.Object toggleSNAConsent(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError, ? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success success = com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success.INSTANCE;
            defaultRaise.complete();
            return new arrow.core.Either.Right(success);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @Override // com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository
    public final java.lang.Object getMobileNumbers(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError, ? extends java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData>>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            defaultRaise.complete();
            return new arrow.core.Either.Right(emptyList);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
