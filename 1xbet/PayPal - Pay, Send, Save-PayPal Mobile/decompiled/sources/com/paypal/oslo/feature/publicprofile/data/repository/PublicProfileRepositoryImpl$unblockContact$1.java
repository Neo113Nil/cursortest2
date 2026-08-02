package com.paypal.oslo.feature.publicprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl", f = "PublicProfileRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {121}, m = "unblockContact", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "raise$iv$iv$iv", "$this$unblockContact_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PublicProfileRepositoryImpl$unblockContact$2"}, nl = {128}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PublicProfileRepositoryImpl$unblockContact$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.unblockContact(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PublicProfileRepositoryImpl$unblockContact$1(com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl publicProfileRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.publicprofile.data.repository.PublicProfileRepositoryImpl$unblockContact$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = publicProfileRepositoryImpl;
    }
}
