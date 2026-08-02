package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolDetailsViewModel$sideEffectsMiddleware$1 implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent> {
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel getHighSpeedVideoFpsRanges;

    PoolDetailsViewModel$sideEffectsMiddleware$1(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel) {
        this.getHighSpeedVideoFpsRanges = poolDetailsViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadPoolDetails(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1 poolDetailsViewModel$sideEffectsMiddleware$1, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1 poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1;
        int i;
        com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase getPoolDetailsUseCase;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper;
        if (continuation instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1) {
            poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1 = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1) continuation;
            if ((poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getPoolDetailsUseCase = poolDetailsViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                    poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighSpeedVideoFpsRanges = input;
                    poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.Camera2StreamConfigurationMap = 1;
                    obj = getPoolDetailsUseCase.invoke(str, poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                    input = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel = poolDetailsViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.pools.domain.error.PoolError poolError = (com.paypal.oslo.feature.pools.domain.error.PoolError) ((arrow.core.Ior.Left) ior).getValue();
                    poolUiErrorMapper = poolDetailsViewModel.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError map = poolUiErrorMapper.map(poolError);
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error(map.getTitleRes(), map.getDescriptionRes(), map.getPrimaryButtonRes(), str));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded((com.paypal.oslo.feature.pools.domain.models.Pool) ((arrow.core.Ior.Right) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded((com.paypal.oslo.feature.pools.domain.models.Pool) both.getRightValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1 = new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1(poolDetailsViewModel$sideEffectsMiddleware$1, continuation);
        java.lang.Object obj2 = poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = poolDetailsViewModel$sideEffectsMiddleware$1$loadPoolDetails$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel2 = poolDetailsViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$1(this, input, event, null), 3, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.RetryRequested.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2(input, this.getHighSpeedVideoFpsRanges, this, null), 3, null);
        } else {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
