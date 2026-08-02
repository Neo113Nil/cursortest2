package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1", f = "SetupFlowScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetupFlowScreenKt$SetupFlowHostEffects$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.navigation.SetupDestination getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep = this.getHighSpeedVideoSizes;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setupFlowNavStep, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing.INSTANCE)) {
            if (setupFlowNavStep instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close) {
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep2 = this.getHighSpeedVideoSizes;
                final com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination = this.Camera2StreamConfigurationMap;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.this, setupDestination, setupFlowDestination, appNavigator, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                final com.paypal.oslo.feature.taptopay.navigation.SetupDestination resolveDestination$taptopay_prodRelease = this.getHighSpeedVideoFpsRangesFor.resolveDestination$taptopay_prodRelease(this.getHighSpeedVideoSizes);
                if (resolveDestination$taptopay_prodRelease == null) {
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, resolveDestination$taptopay_prodRelease)) {
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination2 = this.getHighSpeedVideoFpsRanges;
                if (setupDestination2 == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.navigation.SetupDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                    return kotlin.Unit.INSTANCE;
                }
                final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy resolveNavStrategy = this.getHighSpeedVideoFpsRangesFor.getNavigator().resolveNavStrategy(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationMapperKt.getNavStep(setupDestination2), this.getHighSpeedVideoSizes);
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination2 = this.Camera2StreamConfigurationMap;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.this, resolveDestination$taptopay_prodRelease, setupFlowDestination2, appNavigator2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(setupDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy navStrategy, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        int i = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1.WhenMappings.$EnumSwitchMapping$0[navStrategy.ordinal()];
        if (i == 1) {
            navigationScope.goBack();
        } else if (i == 2) {
            navigationScope.push(setupDestination);
        } else if (i == 3) {
            navigationScope.replaceTop(setupDestination);
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (setupFlowDestination != null && appNavigator.getBackStack().contains(setupFlowDestination)) {
                navigationScope.popTo(setupFlowDestination);
                navigationScope.push(setupDestination);
            } else {
                navigationScope.replaceTop(setupDestination);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.setResult(((com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close) setupFlowNavStep).getResult());
        if (setupDestination != null && setupFlowDestination != null && appNavigator.getBackStack().contains(setupFlowDestination)) {
            navigationScope.popTo(setupFlowDestination);
        } else if (setupDestination != null) {
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.SetupDestination.class));
            return kotlin.Unit.INSTANCE;
        }
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.GoBackInStack.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.Push.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.ReplaceTop.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.PopToAnchorThenPush.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupFlowScreenKt$SetupFlowHostEffects$3$1(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = setupFlowNavStep;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = setupFlowCoordinator;
        this.getHighSpeedVideoFpsRanges = setupDestination;
        this.Camera2StreamConfigurationMap = setupFlowDestination;
    }
}
