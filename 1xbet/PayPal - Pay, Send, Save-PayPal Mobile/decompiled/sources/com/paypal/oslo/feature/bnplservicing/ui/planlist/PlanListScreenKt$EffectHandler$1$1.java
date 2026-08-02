package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1", f = "PlanListScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PlanListScreenKt$EffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect planListUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect) obj;
            if (planListUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (planListUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToPlanDetail) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(planListUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToVirtualCardOverview)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect planListUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination(((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToVirtualCardOverview) planListUiEffect).getCreditAccountId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect planListUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination(((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToPlanDetail) planListUiEffect).getCreditAccountId(), com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlansList.INSTANCE.getValue()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.collect(new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlanListScreenKt$EffectHandler$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect> flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListScreenKt$EffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
