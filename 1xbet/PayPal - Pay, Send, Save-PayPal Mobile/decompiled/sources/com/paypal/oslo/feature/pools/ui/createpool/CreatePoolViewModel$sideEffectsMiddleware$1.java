package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreatePoolViewModel$sideEffectsMiddleware$1 implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent> {
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel getHighSpeedVideoSizes;

    CreatePoolViewModel$sideEffectsMiddleware$1(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel createPoolViewModel) {
        this.getHighSpeedVideoSizes = createPoolViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$createPool(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1 createPoolViewModel$sideEffectsMiddleware$1, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1 createPoolViewModel$sideEffectsMiddleware$1$createPool$1;
        int i;
        com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase createPoolUseCase;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper;
        if (continuation instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1) {
            createPoolViewModel$sideEffectsMiddleware$1$createPool$1 = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1) continuation;
            if ((createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = createPoolViewModel$sideEffectsMiddleware$1$createPool$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.pools.domain.models.CreatePoolInput createPoolInput = new com.paypal.oslo.feature.pools.domain.models.CreatePoolInput(editing.getPoolName(), editing.getPoolDescription(), editing.getBackgroundImageUrl(), editing.getTargetAmount(), editing.getTargetDate());
                    createPoolUseCase = createPoolViewModel$sideEffectsMiddleware$1.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoSizes = input;
                    createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(editing);
                    createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createPoolInput);
                    createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = createPoolUseCase.invoke(createPoolInput, createPoolViewModel$sideEffectsMiddleware$1$createPool$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    input = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel createPoolViewModel = createPoolViewModel$sideEffectsMiddleware$1.getHighSpeedVideoSizes;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.pools.domain.error.PoolError poolError = (com.paypal.oslo.feature.pools.domain.error.PoolError) ((arrow.core.Ior.Left) ior).getValue();
                    poolUiErrorMapper = createPoolViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError map = poolUiErrorMapper.map(poolError);
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed(map.getTitleRes(), map.getDescriptionRes()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded((com.paypal.oslo.feature.pools.domain.models.Pool) ((arrow.core.Ior.Right) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded((com.paypal.oslo.feature.pools.domain.models.Pool) both.getRightValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        createPoolViewModel$sideEffectsMiddleware$1$createPool$1 = new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$createPool$1(createPoolViewModel$sideEffectsMiddleware$1, continuation);
        java.lang.Object obj2 = createPoolViewModel$sideEffectsMiddleware$1$createPool$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createPoolViewModel$sideEffectsMiddleware$1$createPool$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel createPoolViewModel2 = createPoolViewModel$sideEffectsMiddleware$1.getHighSpeedVideoSizes;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input.getEvent() instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked) {
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState component2 = input.getStates().component2();
            if (component2 instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1$invoke$1(this, input, component2, null), 3, null);
            }
        }
    }
}
