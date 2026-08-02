package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper", f = "StatementDetailsUiModelMapper.kt", i = {0, 0, 0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE}, m = "mapSpecialFinancingActivityToUiModel", n = {"activity", "formattingLocale", "formattedExpirationDate", "activity", "formattingLocale", "formattedExpirationDate"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsUiModelMapper$mapSpecialFinancingActivityToUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity) null, (java.util.Locale) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementDetailsUiModelMapper$mapSpecialFinancingActivityToUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper$mapSpecialFinancingActivityToUiModel$1> continuation) {
        super(continuation);
        this.getOutputSizes = statementDetailsUiModelMapper;
    }
}
