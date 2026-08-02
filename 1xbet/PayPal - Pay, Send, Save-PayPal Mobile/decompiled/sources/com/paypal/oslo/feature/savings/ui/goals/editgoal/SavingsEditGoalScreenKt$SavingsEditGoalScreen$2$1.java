package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1", f = "SavingsEditGoalScreen.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1$1", f = "SavingsEditGoalScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect savingsEditGoalEffect = (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (savingsEditGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.NavigateBack) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (savingsEditGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!(savingsEditGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowNetworkErrorScreen)) {
                if (!(savingsEditGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.ShowServiceUnavailableScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
            } else {
                this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(true));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect savingsEditGoalEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult.INSTANCE.success(((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect.GoalUpdated) savingsEditGoalEffect).getGoalName()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult.INSTANCE.cancelled());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalEffect savingsEditGoalEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1) create(savingsEditGoalEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = mutableState;
            this.getHighSpeedVideoFpsRanges = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalScreenKt$SavingsEditGoalScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsEditGoalViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRangesFor = mutableState2;
    }
}
