package com.paypal.oslo.feature.publicprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl", f = "PublicProfileRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {43}, m = "getPublicProfile", n = {"accountId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "raise$iv$iv$iv", "$this$getPublicProfile_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PublicProfileRepositoryImpl$getPublicProfile$2"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PublicProfileRepositoryImpl$getPublicProfile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.getPublicProfile(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PublicProfileRepositoryImpl$getPublicProfile$1(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl publicProfileRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$getPublicProfile$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = publicProfileRepositoryImpl;
    }
}
