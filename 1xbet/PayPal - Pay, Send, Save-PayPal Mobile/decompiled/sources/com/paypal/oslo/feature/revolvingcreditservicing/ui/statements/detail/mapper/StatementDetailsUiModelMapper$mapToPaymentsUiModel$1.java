package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper", f = "StatementDetailsUiModelMapper.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {129, 130}, m = "mapToPaymentsUiModel", n = {"statementDetails", "creditProductIdentifier", "productConfigurations", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedPaymentDueDate", "statementDetails", "creditProductIdentifier", "productConfigurations", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedPaymentDueDate"}, nl = {130, 131}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsUiModelMapper$mapToPaymentsUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.mapToPaymentsUiModel(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementDetailsUiModelMapper$mapToPaymentsUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper$mapToPaymentsUiModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = statementDetailsUiModelMapper;
    }
}
