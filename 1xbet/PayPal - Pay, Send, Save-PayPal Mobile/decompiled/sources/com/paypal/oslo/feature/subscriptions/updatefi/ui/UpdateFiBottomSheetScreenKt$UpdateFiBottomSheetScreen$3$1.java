package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1", f = "UpdateFiBottomSheetScreen.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, nl = {149}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1", f = "UpdateFiBottomSheetScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect updateFiUiEffect = (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDuration != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(updateFiUiEffect, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAboutPaymentMethods.INSTANCE)) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
                final java.lang.String str = this.getHighSpeedVideoSizes;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(updateFiUiEffect, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAddPaymentMethod.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor.getAddFiRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(updateFiUiEffect, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToSuccessScreen.INSTANCE)) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(updateFiUiEffect, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToErrorScreen.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination2 = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.GenericInAppBrowserDestination("https://www.paypal.com/us/digital-wallet/ways-to-pay/about-payment-methods", "subscriptions-update-payment-methods-update-fi-screen", str, false, false, true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.SUBSCRIPTIONS, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (java.lang.String) null, (java.lang.String) null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.BANK, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.CARD, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null))), 31, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            if (updateFIBottomSheetDestination.getSource() == com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI_POST_UPDATE) {
                navigationScope.goBackWithResult(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult.INSTANCE);
            } else {
                navigationScope.goBack();
                navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination(updateFIBottomSheetDestination.getAgreementType()));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            int i = com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[updateFIBottomSheetDestination.getSource().ordinal()];
            if (i == 1) {
                navigationScope.goBack();
                navigationScope.setResult(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult.INSTANCE);
                navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination(updateFIBottomSheetDestination.getAgreementType()));
            } else if (i == 2) {
                navigationScope.setResult(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult.INSTANCE);
                navigationScope.popTo(new com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination(updateFIBottomSheetDestination.getAgreementType()));
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                navigationScope.setResult(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiSuccessNavResult.INSTANCE);
                navigationScope.goBack();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect updateFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1) create(updateFiUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.values().length];
                try {
                    iArr[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI_POST_UPDATE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.DETAILS.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = updateFiViewModel;
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = updateFIBottomSheetDestination;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = updateFiViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = updateFIBottomSheetDestination;
    }
}
