package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsHubDataResult;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsHubDataResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHomeViewModel$sideEffectsMiddleware$1 implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getHighSpeedVideoFpsRanges;

    SavingsHomeViewModel$sideEffectsMiddleware$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        this.getHighSpeedVideoFpsRanges = savingsHomeViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0109, code lost:
    
        if (r9.getHighSpeedVideoSizes(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0160, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r4 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$updateTaxStatementDeliveryPreference(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 savingsHomeViewModel$sideEffectsMiddleware$1, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input, boolean z, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1 savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1;
        int i;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState savingsHomeState;
        java.lang.String savingsAccountId;
        com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase updateTaxStatementDeliveryPreferenceUseCase;
        java.lang.Object invoke;
        arrow.core.Either either;
        com.paypal.oslo.core.mvi.Event event;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1) {
            savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1 = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1) continuation;
            if ((savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    savingsHomeState = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState) input.getStates().getFirst();
                    savingsAccountId = savingsHomeState instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success ? ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success) savingsHomeState).getSavingsAccountId() : null;
                    if (savingsAccountId != null) {
                        updateTaxStatementDeliveryPreferenceUseCase = savingsHomeViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI = input;
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizes = str;
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHomeState);
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountId);
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputFormats = z;
                        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration = 1;
                        invoke = updateTaxStatementDeliveryPreferenceUseCase.invoke(savingsAccountId, z, savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1);
                    } else {
                        input.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("No savings account found"));
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges;
                        int i3 = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRangesFor;
                        boolean z2 = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    z = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputFormats;
                    java.lang.String str2 = (java.lang.String) savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.savings.ui.home.SavingsHomeState savingsHomeState2 = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState) savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.Camera2StreamConfigurationMap;
                    java.lang.String str3 = (java.lang.String) savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    savingsAccountId = str2;
                    input = input2;
                    invoke = obj;
                    savingsHomeState = savingsHomeState2;
                    str = str3;
                }
                either = (arrow.core.Either) invoke;
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess(str));
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHomeState);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountId);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputFormats = z;
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRangesFor = 0;
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges = 0;
                    savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration = 2;
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                    if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                        event = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent) com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError.INSTANCE;
                    } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                        event = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent) new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError(((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getMessage());
                    } else {
                        if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        event = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent) new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Unexpected error: ".concat(java.lang.String.valueOf(savingsError)));
                    }
                    input.getEventDispatcher().invoke(event);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1(savingsHomeViewModel$sideEffectsMiddleware$1, continuation);
        java.lang.Object obj2 = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHomeViewModel$sideEffectsMiddleware$1$updateTaxStatementDeliveryPreference$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) invoke;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent event = input.getEvent();
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.RetryRequested.INSTANCE) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$1(this, input, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2(this, input, event, null), 3, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoShowTaxPreferencePrompt.INSTANCE)) {
            this.getHighSpeedVideoFpsRanges.wasAutoShownTaxPreference = true;
            this.getHighSpeedVideoFpsRanges.getOutputSizes = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118 A[Catch: IllegalArgumentException -> 0x0050, IllegalStateException -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IllegalArgumentException -> 0x0050, IllegalStateException -> 0x0053, blocks: (B:13:0x0049, B:15:0x0112, B:18:0x0118, B:19:0x012f, B:25:0x0129, B:26:0x0150, B:27:0x0155), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3 A[Catch: IllegalArgumentException -> 0x0091, IllegalStateException -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IllegalArgumentException -> 0x0091, IllegalStateException -> 0x0094, blocks: (B:49:0x008d, B:50:0x00ba, B:53:0x00c3, B:58:0x015a, B:61:0x0166, B:62:0x0198, B:65:0x016f, B:68:0x0182, B:69:0x01a0, B:70:0x01a5, B:71:0x01a6, B:72:0x01ab), top: B:48:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1 savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1;
        int i;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input2;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input3;
        com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager;
        boolean isSavingsFeatureAvailable;
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input4;
        arrow.core.Either either;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError unknownError;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input5;
        int i2;
        int i3;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO;
        com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase shouldAutoShowTaxPreferencePromptUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2;
        boolean z;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult2;
        arrow.core.Either either2;
        java.lang.Object value;
        if (continuation instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1) {
            savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1 = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1) continuation;
            if ((savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        savingsFeatureManager = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                        isSavingsFeatureAvailable = savingsFeatureManager.isSavingsFeatureAvailable();
                        getSavingsHubDataUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                        input2 = input;
                    } catch (java.lang.IllegalArgumentException e) {
                        e = e;
                        input2 = input;
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        input2 = input;
                    }
                    try {
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor = input2;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor = isSavingsFeatureAvailable;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats = 1;
                        obj = com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase.invoke$default(getSavingsHubDataUseCase, null, savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1, 1, null);
                        if (obj != coroutine_suspended) {
                            input4 = input2;
                        }
                        return coroutine_suspended;
                    } catch (java.lang.IllegalArgumentException e3) {
                        e = e3;
                        input3 = input2;
                        input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.IllegalStateException e4) {
                        e = e4;
                        input3 = input2;
                        input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.Camera2StreamConfigurationMap;
                        int i5 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizes;
                        boolean z2 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getInputFormats;
                        savingsHubDataResult2 = (com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRanges;
                        input3 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            z = z2;
                            goalSummaryDTO2 = goalSummaryDTO3;
                            either2 = (arrow.core.Either) obj;
                            if (!(either2 instanceof arrow.core.Either.Left)) {
                                value = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                            } else {
                                if (!(either2 instanceof arrow.core.Either.Right)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                value = ((arrow.core.Either.Right) either2).getValue();
                            }
                            input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult(z, savingsHubDataResult2.getTiles(), savingsHubDataResult2.getElectronic1099OptIn(), savingsHubDataResult2.getSavingsAccountId(), goalSummaryDTO2, ((java.lang.Boolean) value).booleanValue()));
                        } catch (java.lang.IllegalArgumentException e5) {
                            e = e5;
                            input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.IllegalStateException e6) {
                            e = e6;
                            input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                            return kotlin.Unit.INSTANCE;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    int i6 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.Camera2StreamConfigurationMap;
                    int i7 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizes;
                    boolean z3 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor;
                    savingsHubDataResult = (com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getInputFormats;
                    savingsHomeViewModel = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRanges;
                    either = (arrow.core.Either) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighResolutionOutputSizeshNQ4ISI;
                    input5 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i6;
                        isSavingsFeatureAvailable = z3;
                        i3 = i7;
                        goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
                        shouldAutoShowTaxPreferencePromptUseCase = savingsHomeViewModel.getOutputMinFrameDuration;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor = input5;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRanges = savingsHubDataResult;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getInputFormats = goalSummaryDTO;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor = isSavingsFeatureAvailable;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizes = i3;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.Camera2StreamConfigurationMap = i2;
                        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats = 3;
                        invoke = shouldAutoShowTaxPreferencePromptUseCase.invoke(savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1);
                    } catch (java.lang.IllegalArgumentException e7) {
                        e = e7;
                        input3 = input5;
                        input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.IllegalStateException e8) {
                        e = e8;
                        input3 = input5;
                        input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (invoke != coroutine_suspended) {
                        goalSummaryDTO2 = goalSummaryDTO;
                        obj = invoke;
                        z = isSavingsFeatureAvailable;
                        savingsHubDataResult2 = savingsHubDataResult;
                        input3 = input5;
                        either2 = (arrow.core.Either) obj;
                        if (!(either2 instanceof arrow.core.Either.Left)) {
                        }
                        input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult(z, savingsHubDataResult2.getTiles(), savingsHubDataResult2.getElectronic1099OptIn(), savingsHubDataResult2.getSavingsAccountId(), goalSummaryDTO2, ((java.lang.Boolean) value).booleanValue()));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                isSavingsFeatureAvailable = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor;
                input4 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.IllegalArgumentException e9) {
                    e = e9;
                    input3 = input4;
                    input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.IllegalStateException e10) {
                    e = e10;
                    input3 = input4;
                    input3.getEventDispatcher().invoke(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError("Error loading savings data: ".concat(java.lang.String.valueOf(e.getMessage()))));
                    return kotlin.Unit.INSTANCE;
                }
                either = (arrow.core.Either) obj;
                savingsHomeViewModel = this.getHighSpeedVideoFpsRanges;
                if (either instanceof arrow.core.Either.Right) {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                    if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                        unknownError = com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError.INSTANCE;
                    } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                        unknownError = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError(((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getMessage());
                    } else {
                        if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected error: ");
                        sb.append(savingsError);
                        unknownError = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError(sb.toString());
                    }
                    input4.getEventDispatcher().invoke(unknownError);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult3 = (com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult) ((arrow.core.Either.Right) either).getValue();
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor = input4;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRanges = savingsHomeViewModel;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getInputFormats = savingsHubDataResult3;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor = isSavingsFeatureAvailable;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizes = 0;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.Camera2StreamConfigurationMap = 0;
                savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats = 2;
                java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(savingsHubDataResult3, savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1);
                if (Camera2StreamConfigurationMap != coroutine_suspended) {
                    savingsHubDataResult = savingsHubDataResult3;
                    obj = Camera2StreamConfigurationMap;
                    input5 = input4;
                    i2 = 0;
                    i3 = 0;
                    goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
                    shouldAutoShowTaxPreferencePromptUseCase = savingsHomeViewModel.getOutputMinFrameDuration;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRangesFor = input5;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoFpsRanges = savingsHubDataResult;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getInputFormats = goalSummaryDTO;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizesFor = isSavingsFeatureAvailable;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getHighSpeedVideoSizes = i3;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.Camera2StreamConfigurationMap = i2;
                    savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats = 3;
                    invoke = shouldAutoShowTaxPreferencePromptUseCase.invoke(savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1);
                    if (invoke != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1(this, continuation);
        java.lang.Object obj2 = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        savingsHomeViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1 savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1;
        int i;
        java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;
        java.lang.String value;
        java.lang.String value2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1) {
                savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1 = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1) continuation;
                if ((savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> tiles = savingsHubDataResult.getTiles();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : tiles) {
                            if (obj2 instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) {
                                arrayList.add(obj2);
                            }
                        }
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                        if (goalZoneDTO != null && (goals = goalZoneDTO.getGoals()) != null) {
                            for (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO : goals) {
                                if (!goalSummaryDTO.isGeneralSavingsTile()) {
                                    com.paypal.oslo.feature.savings.domain.model.transfers.Money currentAmount = goalSummaryDTO.getCurrentAmount();
                                    java.lang.Double doubleOrNull = (currentAmount == null || (value2 = currentAmount.getValue()) == null) ? null : kotlin.text.StringsKt.toDoubleOrNull(value2);
                                    com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount = goalSummaryDTO.getTargetAmount();
                                    java.lang.Double doubleOrNull2 = (targetAmount == null || (value = targetAmount.getValue()) == null) ? null : kotlin.text.StringsKt.toDoubleOrNull(value);
                                    boolean z = doubleOrNull != null;
                                    boolean z2 = doubleOrNull2 != null;
                                    if (z && z2 && doubleOrNull.doubleValue() > 0.0d && doubleOrNull2.doubleValue() > 0.0d && doubleOrNull.doubleValue() >= doubleOrNull2.doubleValue()) {
                                        linkedHashSet.add(goalSummaryDTO);
                                    }
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return null;
                        }
                        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2 savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2(linkedHashSet, this.getHighSpeedVideoFpsRanges, null);
                        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubDataResult);
                        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashSet);
                        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2, savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
                }
            }
            if (i != 0) {
            }
            return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1(this, continuation);
        java.lang.Object obj3 = savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1.getHighResolutionOutputSizeshNQ4ISI;
    }
}
