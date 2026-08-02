package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel", f = "PreQualViewModel.kt", i = {0, 0, 0}, l = {102}, m = "mapToDataLoadedEvent", n = {com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "it", "$i$a$-let-PreQualViewModel$mapToDataLoadedEvent$2"}, nl = {102}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PreQualViewModel$mapToDataLoadedEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel.access$mapToDataLoadedEvent(this.getInputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreQualViewModel$mapToDataLoadedEvent$1(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel preQualViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualViewModel$mapToDataLoadedEvent$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = preQualViewModel;
    }
}
