package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl", f = "PhotoRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {393, 407}, m = "uploadToDms", n = {"file", "countryCode", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "file", "countryCode", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "authToken", "requestBody"}, nl = {395, 414}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class PhotoRepositoryImpl$uploadToDms$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoRepositoryImpl$uploadToDms$1(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadToDms$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = photoRepositoryImpl;
    }
}
