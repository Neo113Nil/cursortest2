package com.paypal.oslo.feature.bankingbundle.data.provider;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/data/provider/BankingBundleEligibilityProviderImpl;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityError;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityResult;", "getEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankingBundleEligibilityProviderImpl implements com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider {
    public static final int $stable = 8;
    private volatile com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public BankingBundleEligibilityProviderImpl(com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bankingBundleRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleRepository, "");
        this.getHighSpeedVideoFpsRangesFor = bankingBundleRepository;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getEligibility(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult>> continuation) {
        com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$getEligibility$1 bankingBundleEligibilityProviderImpl$getEligibility$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        arrow.core.Either right;
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$getEligibility$1) {
                bankingBundleEligibilityProviderImpl$getEligibility$1 = (com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$getEligibility$1) continuation;
                if ((bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes -= 2147483648;
                    obj = bankingBundleEligibilityProviderImpl$getEligibility$1.Camera2StreamConfigurationMap;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (bankingBundleEligibilityResult2 != null && (right = arrow.core.EitherKt.right(bankingBundleEligibilityResult2)) != null) {
                            return right;
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = this.getHighSpeedVideoSizes;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI = mutex3;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor = 0;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes = 1;
                        if (mutex3.lock(null, bankingBundleEligibilityProviderImpl$getEligibility$1) != coroutine_suspended) {
                            mutex = mutex3;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRanges;
                        int i4 = bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) bankingBundleEligibilityProviderImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            arrow.core.Either right2 = (arrow.core.Either) obj;
                            mutex = mutex2;
                            mutex.unlock(null);
                            return right2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor;
                    mutex = (kotlinx.coroutines.sync.Mutex) bankingBundleEligibilityProviderImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bankingBundleEligibilityResult = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (bankingBundleEligibilityResult != null || (right2 = arrow.core.EitherKt.right(bankingBundleEligibilityResult)) == null) {
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor = i2;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRanges = 0;
                        bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes = 2;
                        obj = getHighResolutionOutputSizeshNQ4ISI(bankingBundleEligibilityProviderImpl$getEligibility$1);
                        if (obj != coroutine_suspended) {
                            mutex2 = mutex;
                            arrow.core.Either right22 = (arrow.core.Either) obj;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    mutex.unlock(null);
                    return right22;
                }
            }
            bankingBundleEligibilityResult = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bankingBundleEligibilityResult != null) {
            }
            bankingBundleEligibilityProviderImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
            bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor = i2;
            bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoFpsRanges = 0;
            bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes = 2;
            obj = getHighResolutionOutputSizeshNQ4ISI(bankingBundleEligibilityProviderImpl$getEligibility$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        bankingBundleEligibilityProviderImpl$getEligibility$1 = new com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$getEligibility$1(this, continuation);
        obj = bankingBundleEligibilityProviderImpl$getEligibility$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankingBundleEligibilityProviderImpl$getEligibility$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult>> continuation) {
        com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1 bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1;
        int i;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Unknown unknown;
        if (continuation instanceof com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1) {
            bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1 = (com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1) continuation;
            if ((bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bankingBundleRepository = this.getHighSpeedVideoFpsRangesFor;
                    bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = bankingBundleRepository.getBalanceBundleEligibility("CONSUMER_DEBIT_CARD", bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility bankingBundleEligibility = (com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility) ((arrow.core.Either.Right) right).getValue();
                    com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus access$toApiStatus = com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImplKt.access$toApiStatus(bankingBundleEligibility.getStatus());
                    java.util.List<com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct> products = bankingBundleEligibility.getProducts();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(products, 10));
                    java.util.Iterator<T> it = products.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImplKt.access$toApiProduct((com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct) it.next()));
                    }
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult = new com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult(access$toApiStatus, arrayList);
                    if (bankingBundleEligibilityResult.getStatus().isTerminal()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = bankingBundleEligibilityResult;
                    }
                    right = new arrow.core.Either.Right(bankingBundleEligibilityResult);
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError bankingBundleError = (com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError) ((arrow.core.Either.Left) right).getValue();
                    if (bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network) {
                        unknown = com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Network.INSTANCE;
                    } else if (bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse) {
                        unknown = com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Unknown.INSTANCE;
                    } else {
                        if (!(bankingBundleError instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        unknown = com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Unknown.INSTANCE;
                    }
                    return new arrow.core.Either.Left(unknown);
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1 = new com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1(this, continuation);
        java.lang.Object obj2 = bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankingBundleEligibilityProviderImpl$fetchAndCacheEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }
}
