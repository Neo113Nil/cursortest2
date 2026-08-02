package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1", f = "SavingsCreateGoalScreen.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, nl = {398}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1$1", f = "SavingsCreateGoalScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getInputFormats;
        final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
        int getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect savingsCreateGoalEffect = (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect) this.getInputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (savingsCreateGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateBack) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (savingsCreateGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview) {
                com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt.m18767handleNavigateToReviewZj63BCY((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.NavigateToReview) savingsCreateGoalEffect, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME, this.getHighSpeedVideoFpsRanges), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY, this.getInputSizeshNQ4ISI), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.EVERY_2_WEEKS, this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.EVERY_MONTH, this.getHighResolutionOutputSizeshNQ4ISI)));
            } else {
                if (!(savingsCreateGoalEffect instanceof com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect.GoalCreated)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalEffect savingsCreateGoalEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1) create(savingsCreateGoalEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getInputSizeshNQ4ISI = str3;
            this.getHighSpeedVideoFpsRangesFor = str4;
            this.getHighResolutionOutputSizeshNQ4ISI = str5;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputMinFrameDuration.getUiEffect(), new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel savingsCreateGoalViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$HandleCreateGoalEffects$1$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = savingsCreateGoalViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
        this.getInputFormats = str3;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = str5;
    }
}
