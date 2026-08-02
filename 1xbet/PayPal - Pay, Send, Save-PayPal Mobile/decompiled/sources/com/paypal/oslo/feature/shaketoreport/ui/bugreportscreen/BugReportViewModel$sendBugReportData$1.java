package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$sendBugReportData$1", f = "BugReportViewModel.kt", i = {1, 2, 2, 3, 3, 4}, l = {174, 179, 181, 185, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m = "invokeSuspend", n = {"file", "file", "result", "file", "result", "e"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 179, 201}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"}, v = 2)
/* loaded from: classes14.dex */
final class BugReportViewModel$sendBugReportData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.domain.IssueData getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r5.emit(((arrow.core.Either.Right) r10).getValue(), r18) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r10 != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r5.emit(new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(r9, null, null, r8, null, null, null, 118, null), r18) != r2) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate;
        java.lang.String employeeId;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        java.io.File file;
        com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase sendBugReportUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter screenshotConverter;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            try {
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_failed_to_submit_bug_report", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", e.getMessage()), kotlin.TuplesKt.to("type", "unknown")), null, e, 4, null);
                mutableSharedFlow = this.getOutputFormats.getInputFormats;
                com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.UNKNOWN;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                }
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 5;
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow3 = this.getOutputFormats.getHighSpeedVideoSizesFor;
                mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                featureGate = this.getOutputFormats.getOutputMinFrameDuration;
                if (featureGate.checkGate(com.paypal.oslo.feature.shaketoreport.ShakeToReportConfigFeatureGate.INSTANCE.getSaveEmployeeId()) && (employeeId = this.getHighSpeedVideoSizes.getEmployeeId()) != null && employeeId.length() != 0) {
                    appStorage = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
                    unencrypted = this.getOutputFormats.getOutputSizes;
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (appStorage.setString(unencrypted, this.getHighSpeedVideoSizes.getEmployeeId(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow2 = this.getOutputFormats.getHighSpeedVideoSizesFor;
                    mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    return kotlin.Unit.INSTANCE;
                }
                file = (java.io.File) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke = obj;
                arrow.core.Either either = (arrow.core.Either) invoke;
                if (either instanceof arrow.core.Either.Right) {
                    mutableSharedFlow3 = this.getOutputFormats.getInputSizeshNQ4ISI;
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighSpeedVideoFpsRanges = 3;
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        mutableSharedFlow2 = this.getOutputFormats.getInputFormats;
                        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getHighSpeedVideoFpsRanges = 4;
                        if (mutableSharedFlow2.emit(((arrow.core.Either.Left) either).getValue(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableStateFlow2 = this.getOutputFormats.getHighSpeedVideoSizesFor;
                        mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bArr != null) {
                screenshotConverter = this.getOutputFormats.Camera2StreamConfigurationMap;
                file = screenshotConverter.convert(bArr);
            } else {
                file = null;
            }
            sendBugReportUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
            this.getHighSpeedVideoFpsRanges = 2;
            invoke = sendBugReportUseCase.invoke(this.getHighSpeedVideoSizes, file, this);
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.getOutputFormats.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$sendBugReportData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$sendBugReportData$1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BugReportViewModel$sendBugReportData$1(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel, com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, byte[] bArr, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel$sendBugReportData$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = bugReportViewModel;
        this.getHighSpeedVideoSizes = issueData;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
