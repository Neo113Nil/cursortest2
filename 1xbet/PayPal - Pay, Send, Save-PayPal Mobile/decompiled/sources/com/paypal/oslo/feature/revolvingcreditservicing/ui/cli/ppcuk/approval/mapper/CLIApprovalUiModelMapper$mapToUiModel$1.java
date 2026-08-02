package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper", f = "CLIApprovalUiModelMapper.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {47, 48, 49}, m = "mapToUiModel", n = {"expirationDate", "newCreditLimit", "monthlyPaymentAmount", "currentCreditLimit", "date", "formattedDate", "expirationDate", "newCreditLimit", "monthlyPaymentAmount", "currentCreditLimit", "date", "formattedDate", "formattedNewCreditLimit", "expirationDate", "newCreditLimit", "monthlyPaymentAmount", "currentCreditLimit", "date", "formattedDate", "formattedNewCreditLimit", "formattedInstalmentAmount"}, nl = {48, 49, 51}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes14.dex */
final class CLIApprovalUiModelMapper$mapToUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.mapToUiModel(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CLIApprovalUiModelMapper$mapToUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper cLIApprovalUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper$mapToUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = cLIApprovalUiModelMapper;
    }
}
