package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper", f = "CLIApplicationUiModelMapper.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {29, 30}, m = "mapToUiModel", n = {"currentCreditLimit", "offeredCreditLimit", "privacyStatementUrl", "currentCreditLimit", "offeredCreditLimit", "privacyStatementUrl", "formattedCurrentCreditLimit"}, nl = {30, 31}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class CLIApplicationUiModelMapper$mapToUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.mapToUiModel(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CLIApplicationUiModelMapper$mapToUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper cLIApplicationUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper$mapToUiModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = cLIApplicationUiModelMapper;
    }
}
