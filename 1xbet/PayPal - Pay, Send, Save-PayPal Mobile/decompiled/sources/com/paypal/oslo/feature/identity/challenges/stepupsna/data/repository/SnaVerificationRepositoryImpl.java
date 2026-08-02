package com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/repository/SnaVerificationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/repository/SnaVerificationRepository;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/network/CellularNetworkManager;", "cellularNetworkManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/network/CellularNetworkManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "evUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "callEvUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/network/CellularNetworkManager;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SnaVerificationRepositoryImpl implements com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SnaVerificationRepositoryImpl(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cellularNetworkManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = cellularNetworkManager;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository.SnaVerificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object callEvUrl(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$1 snaVerificationRepositoryImpl$callEvUrl$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$1) {
            snaVerificationRepositoryImpl$callEvUrl$1 = (com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$1) continuation;
            if ((snaVerificationRepositoryImpl$callEvUrl$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                snaVerificationRepositoryImpl$callEvUrl$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = snaVerificationRepositoryImpl$callEvUrl$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snaVerificationRepositoryImpl$callEvUrl$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$2 snaVerificationRepositoryImpl$callEvUrl$2 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$2(this, str, "{}", null);
                    snaVerificationRepositoryImpl$callEvUrl$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    snaVerificationRepositoryImpl$callEvUrl$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable("{}");
                    snaVerificationRepositoryImpl$callEvUrl$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, snaVerificationRepositoryImpl$callEvUrl$2, snaVerificationRepositoryImpl$callEvUrl$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return com.paypal.oslo.feature.identity.challenges.stepupsna.data.parser.EvUrlResponseParser.INSTANCE.parse((java.lang.String) ((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        snaVerificationRepositoryImpl$callEvUrl$1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl$callEvUrl$1(this, continuation);
        java.lang.Object obj2 = snaVerificationRepositoryImpl$callEvUrl$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snaVerificationRepositoryImpl$callEvUrl$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
