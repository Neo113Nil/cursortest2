package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$onConfirmPhoneSave$1", f = "AddEditPhoneViewModel.kt", i = {0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2}, l = {546, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_WRONG_ACT_CODE, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_TOKEN}, m = "invokeSuspend", n = {"phoneId", "isMobile", "$i$a$-let-AddEditPhoneViewModel$onConfirmPhoneSave$1$result$1", "isMobile", "result", "this_$iv", "profilePhone", "event", "isMobile", "$i$f$fold", "$i$a$-fold-AddEditPhoneViewModel$onConfirmPhoneSave$1$2"}, nl = {553, 545, 583}, s = {"L$0", "Z$0", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneViewModel$onConfirmPhoneSave$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0145, code lost:
    
        if (r1.emit(r4, r21) == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x019e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r1 != r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (r0 != r9) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.String str;
        boolean areEqual;
        java.lang.String str2;
        com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase replacePhoneUseCase;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object invoke;
        boolean z;
        com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase addPhoneUseCase;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object invoke2;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.String str7;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully phoneAddedSuccessfully;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.String str8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputSizes.isOutputSupportedFor;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            mutableStateFlow2 = this.getOutputSizes.getOutputStallDuration;
            mutableStateFlow2.setValue(null);
            str = this.getOutputSizes.d;
            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, "Mobile");
            str2 = this.getOutputSizes.ArtificialStackFrames;
            if (str2 != null) {
                com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this.getOutputSizes;
                java.lang.String str9 = this.Camera2StreamConfigurationMap;
                java.lang.String str10 = this.getHighSpeedVideoSizes;
                replacePhoneUseCase = addEditPhoneViewModel.getOutputFormats;
                str3 = addEditPhoneViewModel.d;
                str4 = addEditPhoneViewModel._BOUNDARY;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getInputFormats = areEqual;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getInputSizeshNQ4ISI = 1;
                invoke = replacePhoneUseCase.invoke(str2, str9, str10, str3, str4, !areEqual, this);
            }
            z = areEqual;
            addPhoneUseCase = this.getOutputSizes.getInputFormats;
            java.lang.String str11 = this.Camera2StreamConfigurationMap;
            java.lang.String str12 = this.getHighSpeedVideoSizes;
            str5 = this.getOutputSizes.d;
            str6 = this.getOutputSizes._BOUNDARY;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getInputFormats = z;
            this.getInputSizeshNQ4ISI = 2;
            invoke2 = addPhoneUseCase.invoke(str11, str12, str5, str6, !z, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                z = this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke2 = obj;
                areEqual = z;
                either = (arrow.core.Either) invoke2;
                com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel2 = this.getOutputSizes;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((arrow.core.Either.Right) either).getValue();
                    mutableStateFlow6 = addEditPhoneViewModel2.isOutputSupportedFor;
                    mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    if (areEqual) {
                        str8 = addEditPhoneViewModel2.ArtificialStackFrames;
                        phoneAddedSuccessfully = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired(profilePhone, str8 != null ? com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.EDIT : com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.ADD);
                    } else {
                        str7 = addEditPhoneViewModel2.ArtificialStackFrames;
                        if (str7 != null) {
                            phoneAddedSuccessfully = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully(profilePhone);
                        } else {
                            phoneAddedSuccessfully = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully(profilePhone);
                        }
                    }
                    mutableSharedFlow = addEditPhoneViewModel2.unwrapAs;
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profilePhone);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneAddedSuccessfully);
                    this.getInputFormats = areEqual;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getInputSizeshNQ4ISI = 3;
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError = (com.paypal.oslo.feature.userprofile.domain.model.PhoneError) ((arrow.core.Either.Left) either).getValue();
                    mutableStateFlow3 = addEditPhoneViewModel2.isOutputSupportedFor;
                    mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$trackPhoneSaveError(addEditPhoneViewModel2, phoneError);
                    if (phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.NetworkError) {
                        mutableStateFlow5 = addEditPhoneViewModel2.getOutputStallDuration;
                        mutableStateFlow5.setValue(((com.paypal.oslo.feature.userprofile.domain.model.PhoneError.NetworkError) phoneError).getMessage());
                    } else if (phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) {
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$handleValidationError(addEditPhoneViewModel2, (com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) phoneError);
                    } else if (phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ServerError) {
                        mutableStateFlow4 = addEditPhoneViewModel2.getOutputStallDuration;
                        mutableStateFlow4.setValue(((com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ServerError) phoneError).getMessage());
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            boolean z2 = this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            areEqual = z2;
            invoke = obj;
        }
        either = (arrow.core.Either) invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$onConfirmPhoneSave$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$onConfirmPhoneSave$1(this.getOutputSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneViewModel$onConfirmPhoneSave$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$onConfirmPhoneSave$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = addEditPhoneViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
    }
}
