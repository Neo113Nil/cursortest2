package com.paypal.oslo.feature.wallet.cards.ui.add.manual;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class AddCardsManualViewModelImpl$performCardSubmission$3<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager addCardScreenStateManager;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState2;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState3;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy2;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager addCardScreenStateManager2;
        final arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl = this.getHighSpeedVideoSizes;
        addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        addCardsManualViewModelImpl.getOutputStallDuration = copy;
        addCardScreenStateManager = this.getHighSpeedVideoSizes.getOutputFormats;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class);
        final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl2 = this.getHighSpeedVideoSizes;
        addCardScreenStateManager.updateWhen(orCreateKotlinClass, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj2);
            }
        });
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError addCardError = (com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError) ((arrow.core.Either.Left) either).getValue();
            if (addCardError instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.YearFormatInvalid) {
                com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl3 = this.getHighSpeedVideoSizes;
                addCardFormState2 = addCardsManualViewModelImpl3.getOutputStallDuration;
                addCardFormState3 = this.getHighSpeedVideoSizes.getOutputStallDuration;
                copy2 = addCardFormState2.copy((r24 & 1) != 0 ? addCardFormState2.firstName : null, (r24 & 2) != 0 ? addCardFormState2.lastName : null, (r24 & 4) != 0 ? addCardFormState2.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState2.expirationDateField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState3.getExpirationDateField(), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_expiration_date, new java.lang.Object[0]), false, false, 0, 29, null), (r24 & 16) != 0 ? addCardFormState2.cvvField : null, (r24 & 32) != 0 ? addCardFormState2.address : null, (r24 & 64) != 0 ? addCardFormState2.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState2.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState2.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState2.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState2.bannerState : null);
                addCardsManualViewModelImpl3.getOutputStallDuration = copy2;
                addCardScreenStateManager2 = this.getHighSpeedVideoSizes.getOutputFormats;
                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class);
                final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl4 = this.getHighSpeedVideoSizes;
                addCardScreenStateManager2.updateWhen(orCreateKotlinClass2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj2);
                    }
                });
            } else if (addCardError instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.Network) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_network_error_please_try_again);
            } else if (addCardError instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.DataNotFound) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_error_generic);
            } else {
                if (!(addCardError instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.ServerError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError cardServerError = (com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.ServerError) addCardError).m20977getDetails1X0FAY()));
                if (!(cardServerError instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.SharedInstrumentConsentRequired)) {
                    if (cardServerError instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.RiskDeclined) {
                        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_error_unable_add_card_try_diff_payment);
                    } else if (cardServerError instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.MaxCardAdded) {
                        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_error_unable_add_card_max_limit);
                    } else {
                        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_error_server);
                    }
                } else {
                    r1.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$8QjpqJY4B68hRJBNHyXbyRPFv18(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, r2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            }
        } else if (either instanceof arrow.core.Either.Right) {
            appNavigator = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3.getHighSpeedVideoFpsRangesFor(arrow.core.Either.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(arrow.core.Either either, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success(com.paypal.oslo.feature.wallet.cards.ui.AddCardResultKtKt.toCard((com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult) ((arrow.core.Either.Right) either).getValue()), "")));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardFormState, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardFormState, null, null, null, 14, null);
    }

    AddCardsManualViewModelImpl$performCardSubmission$3(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard) {
        this.getHighSpeedVideoSizes = addCardsManualViewModelImpl;
        this.getHighSpeedVideoFpsRanges = creditCard;
    }
}
