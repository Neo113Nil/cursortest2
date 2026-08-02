package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper", f = "TransactionToRecentActivityUiModelMapper.kt", i = {0, 0, 0}, l = {30}, m = "map", n = {"transaction", "creditProductIdentifier", "formattingLocale"}, nl = {35}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class TransactionToRecentActivityUiModelMapper$map$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.map(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionToRecentActivityUiModelMapper$map$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper transactionToRecentActivityUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper$map$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = transactionToRecentActivityUiModelMapper;
    }
}
