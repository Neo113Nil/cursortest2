package com.paypal.oslo.feature.cardconnect.data;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/data/CardConnectApiImpl;", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CheckCardConnectEligibilityUseCase;", "checkCardConnectEligibilityUseCase", "Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CardConnectCreateSessionUseCase;", "cardConnectCreateSessionUseCase", "Lcom/paypal/oslo/feature/cardconnect/sdk/KnotSDKLauncher;", "knotSDKLauncher", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CheckCardConnectEligibilityUseCase;Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CardConnectCreateSessionUseCase;Lcom/paypal/oslo/feature/cardconnect/sdk/KnotSDKLauncher;)V", "", "cardProduct", "instrumentId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEligibility;", "checkEligibility", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merchantId", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "createSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "eventDispatcher", "launchKnotSdk", "(Landroid/content/Context;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CheckCardConnectEligibilityUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CardConnectCreateSessionUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cardconnect/sdk/KnotSDKLauncher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectApiImpl implements com.paypal.oslo.feature.cardconnect.api.CardConnectApi {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardConnectApiImpl(com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase checkCardConnectEligibilityUseCase, com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase cardConnectCreateSessionUseCase, com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher knotSDKLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCardConnectEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectCreateSessionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(knotSDKLauncher, "");
        this.Camera2StreamConfigurationMap = checkCardConnectEligibilityUseCase;
        this.getHighSpeedVideoSizes = cardConnectCreateSessionUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = knotSDKLauncher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cardconnect.api.CardConnectApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkEligibility(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError, ? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility>> continuation) {
        com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$checkEligibility$1 cardConnectApiImpl$checkEligibility$1;
        int i;
        com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility.Ineligible ineligible;
        if (continuation instanceof com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$checkEligibility$1) {
            cardConnectApiImpl$checkEligibility$1 = (com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$checkEligibility$1) continuation;
            if ((cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest = new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.INSTANCE.fromValue(str), str2);
                    com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase checkCardConnectEligibilityUseCase = this.Camera2StreamConfigurationMap;
                    cardConnectApiImpl$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cardConnectApiImpl$checkEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardConnectEligibilityRequest);
                    cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRanges = 1;
                    obj = checkCardConnectEligibilityUseCase.invoke(cardConnectEligibilityRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse>>) cardConnectApiImpl$checkEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult) obj;
                if (useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) {
                    if (useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.toCardConnectError((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error) useCaseResult));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse cardConnectEligibilityResponse = (com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse) ((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) useCaseResult).getData();
                if (cardConnectEligibilityResponse instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible) {
                    ineligible = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility.Eligible(((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Eligible) cardConnectEligibilityResponse).getMerchants());
                } else {
                    if (!(cardConnectEligibilityResponse instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    ineligible = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility.Ineligible(((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse.Ineligible) cardConnectEligibilityResponse).getReasonCode());
                }
                return arrow.core.EitherKt.right(ineligible);
            }
        }
        cardConnectApiImpl$checkEligibility$1 = new com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardConnectApiImpl$checkEligibility$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult) obj2;
        if (useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cardconnect.api.CardConnectApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createSession(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession>> continuation) {
        com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$createSession$1 cardConnectApiImpl$createSession$1;
        int i;
        com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$createSession$1) {
            cardConnectApiImpl$createSession$1 = (com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$createSession$1) continuation;
            if ((cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cardConnectApiImpl$createSession$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest = new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.INSTANCE.fromValue(str), str2, str3);
                    com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase cardConnectCreateSessionUseCase = this.getHighSpeedVideoSizes;
                    cardConnectApiImpl$createSession$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cardConnectApiImpl$createSession$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    cardConnectApiImpl$createSession$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardConnectSessionRequest);
                    cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = cardConnectCreateSessionUseCase.invoke2(cardConnectSessionRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>>) cardConnectApiImpl$createSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success)) {
                    com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse cardConnectSessionResponse = (com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse) ((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) useCaseResult).getData();
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession(cardConnectSessionResponse.getSessionId(), cardConnectSessionResponse.getClientId(), cardConnectSessionResponse.getMerchants()));
                }
                if (useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.toCardConnectError((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error) useCaseResult));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardConnectApiImpl$createSession$1 = new com.paypal.oslo.feature.cardconnect.data.CardConnectApiImpl$createSession$1(this, continuation);
        java.lang.Object obj2 = cardConnectApiImpl$createSession$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardConnectApiImpl$createSession$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success)) {
        }
    }

    @Override // com.paypal.oslo.feature.cardconnect.api.CardConnectApi
    public final void launchKnotSdk(android.content.Context context, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration configuration, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI.launch(context, configuration, eventDispatcher);
    }
}
