package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel$handleEvent$1", f = "AddEmailViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {60, 63, 67}, m = "invokeSuspend", n = {"email", "updatedCustomer", "email", "updatedCustomer", "this_$iv", "it$iv", "result", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-AddEmailViewModel$handleEvent$1$3", "email", "updatedCustomer", "this_$iv", "it$iv", "error", "$i$f$onLeft", "$i$a$-also-Either$onLeft$1$iv", "$i$a$-onLeft-AddEmailViewModel$handleEvent$1$4"}, nl = {61, 64, 68}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class AddEmailViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel getOutputSizes;

    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer copy;
        com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase;
        java.lang.Object invoke;
        java.lang.String str;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        arrow.core.Either either2;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value4;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Exception exc;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent addEmailModalEvent = this.getHighSpeedVideoFpsRanges;
            if (!(addEmailModalEvent instanceof com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String email = ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext) addEmailModalEvent).getEmail();
            java.lang.String str3 = email;
            if (str3 == null || kotlin.text.StringsKt.isBlank(str3) || !com.paypal.oslo.feature.businesscustomers.ui.utils.EmailUtilsKt.isValidEmail(email)) {
                mutableStateFlow = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) value, null, null, false, true, 7, null)));
                return kotlin.Unit.INSTANCE;
            }
            mutableStateFlow2 = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) value2, null, null, true, false, 11, null)));
            mutableStateFlow3 = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
            copy = r8.copy((r24 & 1) != 0 ? r8.id : null, (r24 & 2) != 0 ? r8.type : null, (r24 & 4) != 0 ? r8.accountId : null, (r24 & 8) != 0 ? r8.externalId : null, (r24 & 16) != 0 ? r8.name : null, (r24 & 32) != 0 ? r8.photoUrl : null, (r24 & 64) != 0 ? r8.addresses : null, (r24 & 128) != 0 ? r8.emails : kotlin.collections.CollectionsKt.listOf(email), (r24 & 256) != 0 ? r8.phoneNumbers : null, (r24 & 512) != 0 ? r8.description : null, (r24 & 1024) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) mutableStateFlow3.getValue()).getCustomer().isFavorite : false);
            updateCustomerUseCase = this.getOutputSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(email);
            this.getOutputFormats = copy;
            this.getOutputMinFrameDurationlomOqCM = 1;
            invoke = updateCustomerUseCase.invoke(copy, this);
            if (invoke != coroutine_suspended) {
                str = email;
                customer = copy;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (java.lang.Exception) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("AddEmailViewModel failed to add email to customer", exc);
                return kotlin.Unit.INSTANCE;
            }
            either2 = (arrow.core.Either) this.getOutputMinFrameDuration;
            customer2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) this.getOutputFormats;
            str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            str = str2;
            either = either2;
            customer = customer2;
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel = this.getOutputSizes;
            if (either.isLeft()) {
                java.lang.Exception exc2 = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                mutableStateFlow5 = addEmailViewModel.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value4 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value4, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) value4, null, null, false, false, 11, null)));
                mutableSharedFlow2 = addEmailViewModel.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack navigateBack = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack(customer);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDuration = either;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = exc2;
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getOutputMinFrameDurationlomOqCM = 3;
                if (mutableSharedFlow2.emit(navigateBack, this) != coroutine_suspended) {
                    exc = exc2;
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("AddEmailViewModel failed to add email to customer", exc);
                }
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) this.getOutputFormats;
        java.lang.String str4 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        str = str4;
        invoke = obj;
        either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel2 = this.getOutputSizes;
        if (either.isRight()) {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = addEmailViewModel2.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) value3, null, null, false, false, 11, null)));
            mutableSharedFlow = addEmailViewModel2.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack navigateBack2 = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack(customer3);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getOutputFormats = customer;
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = either;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer3);
            this.getHighSpeedVideoSizes = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputMinFrameDurationlomOqCM = 2;
            if (mutableSharedFlow.emit(navigateBack2, this) != coroutine_suspended) {
                customer2 = customer;
                either2 = either;
                str2 = str;
                str = str2;
                either = either2;
                customer = customer2;
            }
            return coroutine_suspended;
        }
        com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel3 = this.getOutputSizes;
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel$handleEvent$1(this.getHighSpeedVideoFpsRanges, this.getOutputSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEmailViewModel$handleEvent$1(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent addEmailModalEvent, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = addEmailModalEvent;
        this.getOutputSizes = addEmailViewModel;
    }
}
