package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "redirectUrlKey", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;", "getLegacyWebViewServicingUrlUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlError;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlError;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyServicingLandingSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getHighSpeedVideoFpsRanges;

    public LegacyServicingLandingSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getLegacyWebViewServicingUrlUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLegacyWebViewServicingUrlUseCase, "");
        this.getHighSpeedVideoFpsRanges = creditProductIdentifier;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = getLegacyWebViewServicingUrlUseCase;
    }

    public /* synthetic */ LegacyServicingLandingSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getLegacyWebViewServicingUrlUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(creditProductIdentifier, (i & 2) != 0 ? null : str, getLegacyWebViewServicingUrlUseCase);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState legacyServicingLandingState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(legacyServicingLandingState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState legacyServicingLandingState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(legacyServicingLandingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(function1, continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1 legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1) {
            legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1) continuation;
            if ((legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput getLegacyWebViewServicingUrlInput = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getLegacyWebViewServicingUrlUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getLegacyWebViewServicingUrlInput);
                    legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoSizes = 1;
                    obj = getLegacyWebViewServicingUrlUseCase.invoke2(getLegacyWebViewServicingUrlInput, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String>>) legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetchFailed(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError) ((arrow.core.Ior.Left) ior).getValue())));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetched((java.lang.String) ((arrow.core.Ior.Right) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetched((java.lang.String) both.getRightValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1(this, continuation);
        java.lang.Object obj2 = legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = legacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError legacyWebViewServicingUrlError) {
        if (legacyWebViewServicingUrlError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.NetworkError) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.NetworkError) legacyWebViewServicingUrlError).getMessage();
        }
        if (legacyWebViewServicingUrlError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.GraphQLError) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.GraphQLError) legacyWebViewServicingUrlError).getMessage();
        }
        if (legacyWebViewServicingUrlError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.UrlNotAvailable) {
            return "Servicing URL not available";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
