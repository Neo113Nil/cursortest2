package com.paypal.oslo.feature.publicprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl", f = "PublicProfileRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {90}, m = "deleteContact", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "raise$iv$iv$iv", "$this$deleteContact_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PublicProfileRepositoryImpl$deleteContact$2"}, nl = {97}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PublicProfileRepositoryImpl$deleteContact$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.deleteContact(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PublicProfileRepositoryImpl$deleteContact$1(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl publicProfileRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$deleteContact$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = publicProfileRepositoryImpl;
    }
}
