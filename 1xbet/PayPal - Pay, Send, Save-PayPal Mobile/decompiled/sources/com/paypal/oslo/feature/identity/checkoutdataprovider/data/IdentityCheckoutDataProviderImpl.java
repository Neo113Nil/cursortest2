package com.paypal.oslo.feature.identity.checkoutdataprovider.data;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/data/IdentityCheckoutDataProviderImpl;", "Lcom/paypal/oslo/feature/identity/api/IdentityCheckoutDataProvider;", "Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;", "llsLoginUseCase", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "checkoutInputDataStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "checkoutOutputDataStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "authCodeDataStore", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "identityTokenStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "authenticationContext", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "getCheckoutData", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityCheckoutDataProviderImpl implements com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public IdentityCheckoutDataProviderImpl(com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSLoginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutOutputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCodeDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.getHighSpeedVideoSizes = lLSLoginUseCase;
        this.getHighSpeedVideoFpsRanges = checkoutInputDataStore;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutOutputDataStore;
        this.Camera2StreamConfigurationMap = authCodeDataStore;
        this.getHighSpeedVideoFpsRangesFor = identityTokenStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1 A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TryCatch #4 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0090, B:14:0x00b1, B:15:0x00dc, B:18:0x00b8, B:20:0x00bc, B:22:0x00c8, B:23:0x00d2, B:25:0x00d6, B:26:0x00ed, B:27:0x00f2, B:28:0x00f3, B:29:0x00f8), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TryCatch #4 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0090, B:14:0x00b1, B:15:0x00dc, B:18:0x00b8, B:20:0x00bc, B:22:0x00c8, B:23:0x00d2, B:25:0x00d6, B:26:0x00ed, B:27:0x00f2, B:28:0x00f3, B:29:0x00f8), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCheckoutData(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>> continuation) {
        com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl$getCheckoutData$1 identityCheckoutDataProviderImpl$getCheckoutData$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either left;
        if (continuation instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl$getCheckoutData$1) {
            identityCheckoutDataProviderImpl$getCheckoutData$1 = (com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl$getCheckoutData$1) continuation;
            if ((identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = identityCheckoutDataProviderImpl$getCheckoutData$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        this.getHighSpeedVideoFpsRangesFor.clearUserAccessTokenSilently();
                        this.Camera2StreamConfigurationMap.clearAuthCode();
                        this.getHighResolutionOutputSizeshNQ4ISI.clearCheckoutOutputData();
                        this.getHighSpeedVideoFpsRanges.setCheckoutInputData(checkoutAuthenticationContext.getCheckoutInputData());
                        com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase = this.getHighSpeedVideoSizes;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutAuthenticationContext);
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getOutputFormats = defaultRaise;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getOutputMinFrameDuration = defaultRaise3;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizes = 0;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoFpsRanges = 0;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoFpsRangesFor = 0;
                        identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object invoke = lLSLoginUseCase.invoke(identityCheckoutDataProviderImpl$getCheckoutData$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = invoke;
                        raise = defaultRaise3;
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
                    int i2 = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoFpsRanges;
                    int i4 = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) identityCheckoutDataProviderImpl$getCheckoutData$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) identityCheckoutDataProviderImpl$getCheckoutData$1.getOutputFormats;
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
                either = (arrow.core.Either) obj;
                java.lang.String authCode = this.Camera2StreamConfigurationMap.getAuthCode();
                com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutOutputData = this.getHighResolutionOutputSizeshNQ4ISI.getCheckoutOutputData();
                this.getHighSpeedVideoFpsRanges.clearCheckoutInputData();
                this.getHighResolutionOutputSizeshNQ4ISI.clearCheckoutOutputData();
                this.Camera2StreamConfigurationMap.clearAuthCode();
                if (!(either instanceof arrow.core.Either.Left)) {
                    left = arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) either).getValue();
                    if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                        left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData(authCode, checkoutOutputData));
                    } else {
                        if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        left = arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                    }
                }
                com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) raise.bind(left);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(checkoutAuthenticationSuccessData);
            }
        }
        identityCheckoutDataProviderImpl$getCheckoutData$1 = new com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl$getCheckoutData$1(this, continuation);
        java.lang.Object obj2 = identityCheckoutDataProviderImpl$getCheckoutData$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityCheckoutDataProviderImpl$getCheckoutData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        java.lang.String authCode2 = this.Camera2StreamConfigurationMap.getAuthCode();
        com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutOutputData2 = this.getHighResolutionOutputSizeshNQ4ISI.getCheckoutOutputData();
        this.getHighSpeedVideoFpsRanges.clearCheckoutInputData();
        this.getHighResolutionOutputSizeshNQ4ISI.clearCheckoutOutputData();
        this.Camera2StreamConfigurationMap.clearAuthCode();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData2 = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) raise.bind(left);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(checkoutAuthenticationSuccessData2);
    }
}
