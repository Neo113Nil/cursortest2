package com.paypal.oslo.feature.identity.userverification.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/usecase/FetchGoogleSignUpDetailsUseCase;", "", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;", "googleSignUpRepository", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "Landroid/content/Context;", "activityContext", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpDetails;", "invoke", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FetchGoogleSignUpDetailsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FetchGoogleSignUpDetailsUseCase(com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository googleSignUpRepository, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleSignUpRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = googleSignUpRepository;
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(android.content.Context context, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError, com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails>> continuation) {
        com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase$invoke$1 fetchGoogleSignUpDetailsUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase$invoke$1) {
            fetchGoogleSignUpDetailsUseCase$invoke$1 = (com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase$invoke$1) continuation;
            if ((fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = fetchGoogleSignUpDetailsUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getGoogleSignUpEnabled())) {
                            com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository googleSignUpRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getInputFormats = defaultRaise;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getOutputFormats = defaultRaise3;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                            fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                            java.lang.Object fetchSignUpDetails = googleSignUpRepository.fetchSignUpDetails(context, fetchGoogleSignUpDetailsUseCase$invoke$1);
                            if (fetchSignUpDetails == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                            obj = fetchSignUpDetails;
                            raise = defaultRaise3;
                        } else {
                            defaultRaise3.raise(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.FeatureGoogleSignUpDisabled.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i5 = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) fetchGoogleSignUpDetailsUseCase$invoke$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) fetchGoogleSignUpDetailsUseCase$invoke$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails googleSignUpDetails = (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(googleSignUpDetails);
            }
        }
        fetchGoogleSignUpDetailsUseCase$invoke$1 = new com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = fetchGoogleSignUpDetailsUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchGoogleSignUpDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails googleSignUpDetails2 = (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(googleSignUpDetails2);
    }
}
