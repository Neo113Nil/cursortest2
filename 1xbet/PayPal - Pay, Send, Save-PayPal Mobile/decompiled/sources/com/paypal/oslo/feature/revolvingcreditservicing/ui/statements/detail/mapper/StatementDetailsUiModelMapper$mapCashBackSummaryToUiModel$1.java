package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper", f = "StatementDetailsUiModelMapper.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {155, 156, 165, 175}, m = "mapCashBackSummaryToUiModel", n = {"cashBackSummary", "adjustmentsAmount", "cashBackSummary", "adjustmentsAmount", "formattedNetEarnedAmount", "cashBackSummary", "adjustmentsAmount", "formattedNetEarnedAmount", "formattedAdjustmentsTotal", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "tier", "$i$f$map", "$i$f$mapTo", "$i$a$-map-StatementDetailsUiModelMapper$mapCashBackSummaryToUiModel$3", "cashBackSummary", "adjustmentsAmount", "formattedNetEarnedAmount", "formattedAdjustmentsTotal", "adj", "$i$a$-let-StatementDetailsUiModelMapper$mapCashBackSummaryToUiModel$5"}, nl = {155, 156, 163, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsUiModelMapper$mapCashBackSummaryToUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    int isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object toString;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.toString = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.unwrapAs.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementDetailsUiModelMapper$mapCashBackSummaryToUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper$mapCashBackSummaryToUiModel$1> continuation) {
        super(continuation);
        this.unwrapAs = statementDetailsUiModelMapper;
    }
}
