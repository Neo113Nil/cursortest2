package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJg\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;)Larrow/core/Either;", "p0", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;", "p1", "p2", "Lkotlin/Function1;", "p3", "p4", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/SelectedFiUiModel;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/SelectedFiUiModel;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PersonalInfoReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState state, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect>> output;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error)) {
                            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline) state;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed.INSTANCE)) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition.INSTANCE);
                            } else {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                            }
                        } else {
                            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error) state;
                            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ErrorBackPressed) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(error.getData()), null, 2, null);
                            } else {
                                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                            }
                        }
                    } else {
                        final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError apiInputValidationError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError) state;
                        output = Camera2StreamConfigurationMap(apiInputValidationError, apiInputValidationError.getData(), event, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer.$r8$lambda$dngask8O5bXN5HtO__3bpuUv6ng((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) obj);
                            }
                        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer.$r8$lambda$LWNYd0o5Xa8jQm_KvO3duvPqSJI(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError.this, (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) obj);
                            }
                        });
                    }
                } else {
                    final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success) state;
                    output = Camera2StreamConfigurationMap(success, success.getData(), event, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer.$r8$lambda$qCiYzuQy6qUE6XH8gDufEhZIKog(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success.this, (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) obj);
                        }
                    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer.m12415$r8$lambda$wHjyouLvprVq2FMSvdzCJbgIro(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success.this, (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) obj);
                        }
                    });
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial.INSTANCE, null, 2, null);
                } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess)) {
                    boolean z = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress;
                    if (!z && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived)) {
                        boolean z2 = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess;
                        if (z2 || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed)) {
                            if (z2) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(loading.getData(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, true, null, null, null, null, 520093695, null)), new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess) event).getCreditApplication()));
                            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(loading.getData(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, true, null, null, null, null, 520093695, null)), new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess) event).getReviewDetails()));
                            } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError)) {
                                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed) {
                                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed apiFieldValidationFailed = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed) event;
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError(apiFieldValidationFailed.getUiModel().applyFieldErrors(apiFieldValidationFailed.getErrors())), null, 2, null);
                                } else {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                                }
                            } else {
                                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError updateApplicationError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError) event;
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error(updateApplicationError.getErrorContent(), updateApplicationError.getUiModel()), null, 2, null);
                            }
                        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack.INSTANCE);
                        } else {
                            output = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                        }
                    } else if (z) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                    } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError)) {
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted) {
                            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted addressFormatted = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted) event;
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(addressFormatted.getUiModel()), new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast(addressFormatted.getUiModel().getToast().getAddressSavedToast()));
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived) {
                            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived addressValidationErrorReceived = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived) event;
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(addressValidationErrorReceived.getUiModel()), new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal(addressValidationErrorReceived.getFailedAddressText(), addressValidationErrorReceived.getFailedAddress()));
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError updateAddressError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError) event;
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error(updateAddressError.getErrorContent(), updateAddressError.getUiModel()), null, 2, null);
                    }
                } else {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess) event).getData()), null, 2, null);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial initial = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded)) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded) event).getUiModel()), null, 2, null);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel p1, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent p2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel, ? extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState> p3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel, ? extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState> p4) {
        java.lang.Object obj;
        java.lang.String scrollKey;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethodUiModel;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy3;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel selectedFiUiModel;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy4;
        java.lang.Object obj2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethodUiModel2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy5;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.LegalConsentUiModel copy6;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy7;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel selectedFiUiModel2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel highSpeedVideoSizes;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel copy8;
        java.lang.Object obj3;
        boolean z = p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged;
        if (!z && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditBillingAddressPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditPersonalDetailsPressed.INSTANCE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissAddressBottomSheet.INSTANCE) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalEditAddressClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalChooseDifferentClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalDismissed.INSTANCE) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived)) {
                boolean z2 = p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed;
                if (z2 || (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue) || kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed.INSTANCE)) {
                    if (z2) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DisclaimerLinkPressed) p2).getUrl()));
                    }
                    if (!(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue)) {
                        return kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.BackPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Initial.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack.INSTANCE) : kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p2);
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue r1 = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue) p2;
                    if (r1 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, 520093695, null)), null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r1, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Pressed.INSTANCE)) {
                        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod = p1.getRepaymentMethod();
                        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.LegalConsentUiModel legalConsent = p1.getLegalConsent();
                        boolean z3 = repaymentMethod != null && repaymentMethod.getSelectedFi() == null;
                        boolean z4 = (legalConsent == null || legalConsent.isAccepted()) ? false : true;
                        if (z3 || z4) {
                            if (z3) {
                                copy = repaymentMethod.copy((r20 & 1) != 0 ? repaymentMethod.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod.selectedFi : null, (r20 & 16) != 0 ? repaymentMethod.isRepaymentRequired : true, (r20 & 32) != 0 ? repaymentMethod.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod.loadError : null);
                                repaymentMethodUiModel = copy;
                            } else {
                                repaymentMethodUiModel = repaymentMethod;
                            }
                            if (z4) {
                                legalConsent = legalConsent.copy((r20 & 1) != 0 ? legalConsent.headerText : null, (r20 & 2) != 0 ? legalConsent.legalDisclosureText : null, (r20 & 4) != 0 ? legalConsent.privacyStatementLabel : null, (r20 & 8) != 0 ? legalConsent.creditCheckLabel : null, (r20 & 16) != 0 ? legalConsent.privacyStatementUrl : null, (r20 & 32) != 0 ? legalConsent.creditCheckUrl : null, (r20 & 64) != 0 ? legalConsent.isAccepted : false, (r20 & 128) != 0 ? legalConsent.showRequiredError : true, (r20 & 256) != 0 ? legalConsent.requiredAlertText : null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p3.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, repaymentMethodUiModel, legalConsent, null, 335544319, null)), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    if (!(r1 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid invalid = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid) r1;
                    java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) invalid.getBillingAddress(), (java.lang.Iterable) invalid.getDob()), (java.lang.Iterable) invalid.getAnnualIncome());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = plus.iterator();
                    while (it.hasNext()) {
                        kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow) it.next()).getList());
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) obj).isError()) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) obj;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p3.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, invalid.getAnnualIncome(), false, false, null, invalid.getBillingAddress(), invalid.getDob(), null, null, null, false, false, false, false, null, null, null, null, 536670207, null)), (formFieldModel == null || (scrollKey = formFieldModel.getScrollKey()) == null) ? null : new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError(scrollKey));
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressLayoutFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet.INSTANCE);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.OpenRepaymentHalfSheet.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissRepaymentBottomSheet.INSTANCE) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed) && !kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingCancelled.INSTANCE) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError) && !(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p2);
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded fundingInstrumentsLoaded = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded) p2;
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod2 = p1.getRepaymentMethod();
                    if (repaymentMethod2 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel selectedFi = repaymentMethod2.getSelectedFi();
                    java.lang.String id = selectedFi != null ? selectedFi.getId() : null;
                    if (id != null) {
                        java.util.Iterator<T> it3 = fundingInstrumentsLoaded.getInstruments().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) obj3).getId(), id)) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) obj3;
                        if (fundingInstrument != null) {
                            highSpeedVideoSizes = getHighSpeedVideoSizes(fundingInstrument);
                            selectedFiUiModel2 = highSpeedVideoSizes;
                            copy8 = repaymentMethod2.copy((r20 & 1) != 0 ? repaymentMethod2.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod2.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod2.fundingInstruments : fundingInstrumentsLoaded.getInstruments(), (r20 & 8) != 0 ? repaymentMethod2.selectedFi : selectedFiUiModel2, (r20 & 16) != 0 ? repaymentMethod2.isRepaymentRequired : selectedFiUiModel2 != null && repaymentMethod2.isRepaymentRequired(), (r20 & 32) != 0 ? repaymentMethod2.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod2.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod2.fiLinkError : fundingInstrumentsLoaded.getFiLinkError(), (r20 & 256) != 0 ? repaymentMethod2.loadError : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy8, null, null, 469762047, null)), null, 2, null);
                        }
                    }
                    com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument preferred = fundingInstrumentsLoaded.getPreferred();
                    if (preferred != null) {
                        highSpeedVideoSizes = getHighSpeedVideoSizes(preferred);
                        selectedFiUiModel2 = highSpeedVideoSizes;
                        copy8 = repaymentMethod2.copy((r20 & 1) != 0 ? repaymentMethod2.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod2.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod2.fundingInstruments : fundingInstrumentsLoaded.getInstruments(), (r20 & 8) != 0 ? repaymentMethod2.selectedFi : selectedFiUiModel2, (r20 & 16) != 0 ? repaymentMethod2.isRepaymentRequired : selectedFiUiModel2 != null && repaymentMethod2.isRepaymentRequired(), (r20 & 32) != 0 ? repaymentMethod2.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod2.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod2.fiLinkError : fundingInstrumentsLoaded.getFiLinkError(), (r20 & 256) != 0 ? repaymentMethod2.loadError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy8, null, null, 469762047, null)), null, 2, null);
                    }
                    selectedFiUiModel2 = null;
                    copy8 = repaymentMethod2.copy((r20 & 1) != 0 ? repaymentMethod2.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod2.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod2.fundingInstruments : fundingInstrumentsLoaded.getInstruments(), (r20 & 8) != 0 ? repaymentMethod2.selectedFi : selectedFiUiModel2, (r20 & 16) != 0 ? repaymentMethod2.isRepaymentRequired : selectedFiUiModel2 != null && repaymentMethod2.isRepaymentRequired(), (r20 & 32) != 0 ? repaymentMethod2.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod2.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod2.fiLinkError : fundingInstrumentsLoaded.getFiLinkError(), (r20 & 256) != 0 ? repaymentMethod2.loadError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy8, null, null, 469762047, null)), null, 2, null);
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError fundingInstrumentsLoadError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError) p2;
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod3 = p1.getRepaymentMethod();
                    if (repaymentMethod3 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(p1), null, 2, null);
                    }
                    copy7 = repaymentMethod3.copy((r20 & 1) != 0 ? repaymentMethod3.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod3.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod3.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod3.selectedFi : null, (r20 & 16) != 0 ? repaymentMethod3.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod3.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod3.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod3.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod3.loadError : fundingInstrumentsLoadError.getErrorContent());
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy7, null, null, 469762047, null)), null, 2, null);
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged legalDisclosureCheckChanged = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LegalDisclosureCheckChanged) p2;
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.LegalConsentUiModel legalConsent2 = p1.getLegalConsent();
                    if (legalConsent2 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    copy6 = legalConsent2.copy((r20 & 1) != 0 ? legalConsent2.headerText : null, (r20 & 2) != 0 ? legalConsent2.legalDisclosureText : null, (r20 & 4) != 0 ? legalConsent2.privacyStatementLabel : null, (r20 & 8) != 0 ? legalConsent2.creditCheckLabel : null, (r20 & 16) != 0 ? legalConsent2.privacyStatementUrl : null, (r20 & 32) != 0 ? legalConsent2.creditCheckUrl : null, (r20 & 64) != 0 ? legalConsent2.isAccepted : legalDisclosureCheckChanged.getAccepted(), (r20 & 128) != 0 ? legalConsent2.showRequiredError : false, (r20 & 256) != 0 ? legalConsent2.requiredAlertText : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, null, copy6, null, 402653183, null)), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.OpenRepaymentHalfSheet.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod4 = p1.getRepaymentMethod();
                    if (repaymentMethod4 != null) {
                        copy5 = repaymentMethod4.copy((r20 & 1) != 0 ? repaymentMethod4.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod4.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod4.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod4.selectedFi : null, (r20 & 16) != 0 ? repaymentMethod4.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod4.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod4.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod4.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod4.loadError : null);
                        repaymentMethodUiModel2 = copy5;
                    } else {
                        repaymentMethodUiModel2 = null;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(repaymentMethodUiModel2 != null ? p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, repaymentMethodUiModel2, null, null, 469762047, null)) : p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissRepaymentBottomSheet.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet.INSTANCE);
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected repaymentMethodSelected = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.RepaymentMethodSelected) p2;
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod5 = p1.getRepaymentMethod();
                    if (repaymentMethod5 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> fundingInstruments = repaymentMethod5.getFundingInstruments();
                    if (fundingInstruments != null) {
                        java.util.Iterator<T> it4 = fundingInstruments.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it4.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) obj2).getId(), repaymentMethodSelected.getFundingInstrumentId())) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) obj2;
                        if (fundingInstrument2 != null) {
                            selectedFiUiModel = getHighSpeedVideoSizes(fundingInstrument2);
                            copy4 = repaymentMethod5.copy((r20 & 1) != 0 ? repaymentMethod5.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod5.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod5.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod5.selectedFi : selectedFiUiModel, (r20 & 16) != 0 ? repaymentMethod5.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod5.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod5.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod5.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod5.loadError : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p3.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy4, null, null, 469762047, null)), null, 2, null);
                        }
                    }
                    selectedFiUiModel = null;
                    copy4 = repaymentMethod5.copy((r20 & 1) != 0 ? repaymentMethod5.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod5.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod5.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod5.selectedFi : selectedFiUiModel, (r20 & 16) != 0 ? repaymentMethod5.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod5.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod5.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod5.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod5.loadError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p3.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy4, null, null, 469762047, null)), null, 2, null);
                }
                if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed) {
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding navigateToLinkFunding = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingPressed) p2).getType());
                    com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod6 = p1.getRepaymentMethod();
                    if (repaymentMethod6 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p4.invoke(p1), navigateToLinkFunding);
                    }
                    copy3 = repaymentMethod6.copy((r20 & 1) != 0 ? repaymentMethod6.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod6.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod6.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod6.selectedFi : null, (r20 & 16) != 0 ? repaymentMethod6.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod6.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod6.isLoadingFundingInstruments : true, (r20 & 128) != 0 ? repaymentMethod6.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod6.loadError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy3, null, null, 469762047, null)), navigateToLinkFunding);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LinkFundingCancelled.INSTANCE)) {
                    if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked) {
                        return p1.getRepaymentMethod() == null ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.output(p4.invoke(p1), com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.RepaymentMethodUiModel repaymentMethod7 = p1.getRepaymentMethod();
                if (repaymentMethod7 == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                copy2 = repaymentMethod7.copy((r20 & 1) != 0 ? repaymentMethod7.sectionTitle : null, (r20 & 2) != 0 ? repaymentMethod7.changeFiText : null, (r20 & 4) != 0 ? repaymentMethod7.fundingInstruments : null, (r20 & 8) != 0 ? repaymentMethod7.selectedFi : null, (r20 & 16) != 0 ? repaymentMethod7.isRepaymentRequired : false, (r20 & 32) != 0 ? repaymentMethod7.requiredAlertText : null, (r20 & 64) != 0 ? repaymentMethod7.isLoadingFundingInstruments : false, (r20 & 128) != 0 ? repaymentMethod7.fiLinkError : null, (r20 & 256) != 0 ? repaymentMethod7.loadError : null);
                java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> fundingInstruments2 = repaymentMethod7.getFundingInstruments();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, false, false, null, copy2, null, null, 469762047, null)), (fundingInstruments2 == null || fundingInstruments2.isEmpty()) ? com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet.INSTANCE : null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DismissAddressBottomSheet.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p3.invoke(p1.updateBillingAddressFieldIcon(com.paypal.pds.core.Icon.ChevronDown.INSTANCE)), com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet.INSTANCE);
            }
            if (!(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress)) {
                if (!(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalEditAddressClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalChooseDifferentClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet.INSTANCE);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationModalDismissed.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived) {
                        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived addressValidationErrorReceived = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived) p2;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(addressValidationErrorReceived.getUiModel()), new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal(addressValidationErrorReceived.getFailedAddressText(), addressValidationErrorReceived.getFailedAddress()));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p2);
                }
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError updateAddressError = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError) p2;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Error(updateAddressError.getErrorContent(), updateAddressError.getUiModel()), null, 2, null);
            }
            if (((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddress) p2).getAddress() == null) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading(p1), com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditBillingAddressPressed.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, null, null, null, null, null, false, false, false, false, null, null, null, null, 536854527, null)), null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.EditPersonalDetailsPressed.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p4.invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(p1.clearSsnField(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, false, false, false, false, null, null, null, null, 536862719, null)), null, 2, null);
        }
        if (z) {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged) p2;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p3.invoke(p1.updateFormFieldValueById(fieldValueChanged.getFieldId(), fieldValueChanged.getValue())), null, 2, null);
        }
        if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ValidateField) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated) {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated) p2;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p3.invoke(p1.updateFormFieldById(fieldValidated.getFieldId(), fieldValidated.getValidatedModel())), null, 2, null);
        }
        if (p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.PasteValue) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (!(p2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p2);
        }
        if (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldClicked) p2).getFieldId().ordinal()] == 1) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p3.invoke(p1.updateBillingAddressFieldIcon(com.paypal.pds.core.Icon.ChevronUp.INSTANCE)), com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
    }

    private static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument) {
        kotlin.Triple triple;
        if (fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank) fundingInstrument;
            triple = new kotlin.Triple(fundingInstrumentBank.getName(), fundingInstrumentBank.getLogoUrl(), com.paypal.pds.core.Icon.Bank.INSTANCE);
        } else {
            if (!(fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard) fundingInstrument;
            triple = new kotlin.Triple(fundingInstrumentCard.getName(), fundingInstrumentCard.getLogoUrl(), com.paypal.pds.core.Icon.Card.INSTANCE);
        }
        java.lang.String str = (java.lang.String) triple.component1();
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SelectedFiUiModel(fundingInstrument.getId(), str, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentKt.getSubtitle(fundingInstrument), (java.lang.String) triple.component2(), (com.paypal.pds.core.Icon) triple.component3(), str);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PersonalInfoReducer";
    }

    /* renamed from: $r8$lambda$-wHjyouLvprVq2FMSvdzCJbgIro, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState m12415$r8$lambda$wHjyouLvprVq2FMSvdzCJbgIro(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
        return success.copy(personalInfoUiModel);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState $r8$lambda$LWNYd0o5Xa8jQm_KvO3duvPqSJI(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.ApiInputValidationError apiInputValidationError, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
        return apiInputValidationError.copy(personalInfoUiModel);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState $r8$lambda$dngask8O5bXN5HtO__3bpuUv6ng(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success(personalInfoUiModel);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState $r8$lambda$qCiYzuQy6qUE6XH8gDufEhZIKog(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoUiModel, "");
        return success.copy(personalInfoUiModel);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BILLING_ADDRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
