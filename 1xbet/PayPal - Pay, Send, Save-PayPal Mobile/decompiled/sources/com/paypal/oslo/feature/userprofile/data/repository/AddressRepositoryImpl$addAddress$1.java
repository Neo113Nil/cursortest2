package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl", f = "AddressRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {78, 105}, m = "addAddress", n = {"address", "raise$iv$iv$iv", "$this$addAddress_u24lambda_u240", "input", "userCountry", "mutation", androidx.core.app.NotificationCompat.CATEGORY_CALL, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-AddressRepositoryImpl$addAddress$2", "address", "raise$iv$iv$iv", "$this$addAddress_u24lambda_u240", "input", "userCountry", "mutation", androidx.core.app.NotificationCompat.CATEGORY_CALL, "profileAddress", "billingAddressFields", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-AddressRepositoryImpl$addAddress$2"}, nl = {81, 107}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class AddressRepositoryImpl$addAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.unwrapAs.addAddress(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$addAddress$1(com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$addAddress$1> continuation) {
        super(continuation);
        this.unwrapAs = addressRepositoryImpl;
    }
}
