package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1", f = "SecondaryCardManagementScreen.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect manageSecondaryCardUserEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect) obj;
            if (manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateBack) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToDebitPin) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!(manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToCardReplacement)) {
                if (!(manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToDidntGetYourCard)) {
                    if (manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToReportCardReasonSelection) {
                        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToCancelCard) {
                        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (!(manageSecondaryCardUserEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToActivatePin)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$qUbndzxdRU87zWscGges_VB4MWA(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            } else {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt.$r8$lambda$qUbndzxdRU87zWscGges_VB4MWA(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect manageSecondaryCardUserEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToDebitPin) manageSecondaryCardUserEffect).getCardId(), (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType) null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode) null, false, 30, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.SecondaryCardManagementNavResult((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect manageSecondaryCardUserEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToCancelCard) manageSecondaryCardUserEffect).getCancelCardInfo()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect manageSecondaryCardUserEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.ReportCardReasonSelectionDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToReportCardReasonSelection) manageSecondaryCardUserEffect).getReplacementInfo()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoSizes.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel secondaryCardManagementViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.SecondaryCardManagementScreenKt$SecondaryCardManagementScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = secondaryCardManagementViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
