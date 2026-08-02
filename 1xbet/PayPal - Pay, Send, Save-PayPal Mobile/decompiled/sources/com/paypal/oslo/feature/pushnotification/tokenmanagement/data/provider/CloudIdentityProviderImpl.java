package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/provider/CloudIdentityProviderImpl;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;", "adobeProvider", "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;)V", "", "getCloudIdentity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CloudIdentityProviderImpl implements com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CloudIdentityProviderImpl(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider adobeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeProvider, "");
        this.getHighSpeedVideoFpsRangesFor = adobeProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCloudIdentity(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl$getCloudIdentity$1 cloudIdentityProviderImpl$getCloudIdentity$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl$getCloudIdentity$1) {
                cloudIdentityProviderImpl$getCloudIdentity$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl$getCloudIdentity$1) continuation;
                if ((cloudIdentityProviderImpl$getCloudIdentity$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    cloudIdentityProviderImpl$getCloudIdentity$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = cloudIdentityProviderImpl$getCloudIdentity$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cloudIdentityProviderImpl$getCloudIdentity$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider adobeProvider = this.getHighSpeedVideoFpsRangesFor;
                        cloudIdentityProviderImpl$getCloudIdentity$1.getHighSpeedVideoFpsRanges = 1;
                        obj = adobeProvider.experienceCloudId(cloudIdentityProviderImpl$getCloudIdentity$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (java.lang.String) obj;
                }
            }
            if (i != 0) {
            }
            return (java.lang.String) obj;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.pushnotification.LoggerKt.log.e("Failed to retrieve Adobe ECID", e2);
            return null;
        }
        cloudIdentityProviderImpl$getCloudIdentity$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl$getCloudIdentity$1(this, continuation);
        java.lang.Object obj2 = cloudIdentityProviderImpl$getCloudIdentity$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cloudIdentityProviderImpl$getCloudIdentity$1.getHighSpeedVideoFpsRanges;
    }
}
