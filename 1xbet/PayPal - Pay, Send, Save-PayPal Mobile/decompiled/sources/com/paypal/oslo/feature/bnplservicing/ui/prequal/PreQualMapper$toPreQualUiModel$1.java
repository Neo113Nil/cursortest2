package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper", f = "PreQualMapper.kt", i = {0, 0, 0}, l = {26}, m = "toPreQualUiModel", n = {org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "it", "$i$a$-let-PreQualMapper$toPreQualUiModel$2"}, nl = {25}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PreQualMapper$toPreQualUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.toPreQualUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreQualMapper$toPreQualUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper preQualMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1> continuation) {
        super(continuation);
        this.getInputFormats = preQualMapper;
    }
}
