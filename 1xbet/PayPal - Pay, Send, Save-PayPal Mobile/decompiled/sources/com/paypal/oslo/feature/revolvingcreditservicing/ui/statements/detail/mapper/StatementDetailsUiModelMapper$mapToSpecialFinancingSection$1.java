package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper", f = "StatementDetailsUiModelMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {193}, m = "mapToSpecialFinancingSection", n = {"statementDetails", "creditProductIdentifier", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "activity", "$i$f$map", "$i$f$mapTo", "$i$a$-map-StatementDetailsUiModelMapper$mapToSpecialFinancingSection$uiModels$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsUiModelMapper$mapToSpecialFinancingSection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.mapToSpecialFinancingSection(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementDetailsUiModelMapper$mapToSpecialFinancingSection$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper$mapToSpecialFinancingSection$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = statementDetailsUiModelMapper;
    }
}
