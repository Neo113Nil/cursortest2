package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1", f = "ManageCardScreen.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, nl = {558}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardScreenKt$ManageCardUiEffectHandler$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.Clipboard getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1", f = "ManageCardScreen.kt", i = {0}, l = {546}, m = "invokeSuspend", n = {"uiEffect"}, nl = {547}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.ui.platform.Clipboard getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> getInputFormats;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getInputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getOutputFormats;
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect manageCardUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect) this.getOutputFormats;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer) {
                    com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt.launchDialer(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer) manageCardUiEffect).getPhoneNumber());
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet) manageCardUiEffect).getPhoneNumber()));
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StopPaperlessDeliveryBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StopStatementDelivery.INSTANCE);
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StartStatementDelivery.INSTANCE);
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliveryDetailsBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StatementDeliveryDetails.INSTANCE);
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet) manageCardUiEffect).getPhoneNumber()));
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView navigateToWebView = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView) manageCardUiEffect;
                    final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(navigateToWebView.getUrl(), this.getOutputMinFrameDuration.getNavArgs().getCpi(), navigateToWebView.isAuthRequired(), false, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.MANAGE_CARD_FEATURE, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet showLockCardErrorBottomSheet = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet) manageCardUiEffect;
                    this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError(showLockCardErrorBottomSheet.isLocking(), showLockCardErrorBottomSheet.getPhoneNumber()));
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel = this.getOutputMinFrameDuration;
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.this, manageCardUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToAutopay) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel2 = this.getOutputMinFrameDuration;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateBack) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    final androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> state = this.getInputFormats;
                    appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin) {
                    this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast) {
                    this.getInputSizeshNQ4ISI.setValue(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast) manageCardUiEffect).getMessage());
                    this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.None.INSTANCE);
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet) manageCardUiEffect).getCardDetails()));
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsErrorBottomSheet) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.CardDetailsError.INSTANCE);
                } else if (manageCardUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber) {
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageCardUiEffect);
                    this.getHighSpeedVideoSizesFor = 1;
                    if (com.paypal.oslo.feature.revolvingcreditservicing.utils.ClipboardExtensionsKt.copyPlainText$default(this.getHighSpeedVideoSizes, null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber) manageCardUiEffect).getCardNumber(), this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(manageCardUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToCreditLimitHub.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(manageCardUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToSetAsPreferred.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(manageCardUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(manageCardUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_details_toast_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            if (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt.access$ManageCardUiEffectHandler$lambda$0(state).getCardLockStatusChanged()) {
                navigationScope.setResult(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardAction.CARD_LOCK_STATUS_CHANGED));
            }
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect manageCardUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs(manageCardViewModel.getNavArgs().getCpi(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen) manageCardUiEffect).getPhoneNumber())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect manageCardUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin navigateToManagePin = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin) manageCardUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs(navigateToManagePin.getCreditProductIdentifier(), navigateToManagePin.getCardArtUrl(), navigateToManagePin.getLastDigits(), navigateToManagePin.getHasPhysicalCard())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs(manageCardViewModel.getNavArgs().getCpi(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(revolvingCreditWebViewArgs));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect manageCardUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1) create(manageCardUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getInputFormats, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType, kotlin.Unit> function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, androidx.compose.ui.platform.Clipboard clipboard, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getHighSpeedVideoFpsRanges = function1;
            this.getOutputMinFrameDuration = manageCardViewModel;
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getInputSizeshNQ4ISI = mutableState;
            this.getHighSpeedVideoSizes = clipboard;
            this.getInputFormats = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getInputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ManageCardScreenKt$ManageCardUiEffectHandler$3$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel manageCardViewModel, android.content.Context context, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType, kotlin.Unit> function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, androidx.compose.ui.platform.Clipboard clipboard, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$3$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = manageCardViewModel;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getInputFormats = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = clipboard;
        this.getOutputFormats = state;
    }
}
