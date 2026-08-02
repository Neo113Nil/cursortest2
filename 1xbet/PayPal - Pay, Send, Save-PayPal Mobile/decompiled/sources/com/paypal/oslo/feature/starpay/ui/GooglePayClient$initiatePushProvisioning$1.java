package com.paypal.oslo.feature.starpay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient$initiatePushProvisioning$1;", "Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;", "Lcom/paypal/oslo/feature/starpay/api/WalletData;", "Lcom/paypal/oslo/feature/starpay/api/Result;", "result", "", "onComplete", "(Lcom/paypal/oslo/feature/starpay/api/Result;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GooglePayClient$initiatePushProvisioning$1 implements com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.paypal.oslo.feature.starpay.api.WalletData> {
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.starpay.ui.GooglePayClient getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    GooglePayClient$initiatePushProvisioning$1(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, ? super kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function2, com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient) {
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = googlePayClient;
    }

    @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
    public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletData> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.paypal.oslo.feature.starpay.api.Result.Success) {
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.starpay.api.Result.Success success = new com.paypal.oslo.feature.starpay.api.Result.Success(((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData());
            final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient = this.getHighSpeedVideoFpsRangesFor;
            function2.invoke(success, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$1.m19741$r8$lambda$vuc5kdkgy4_9z6wM8AowA9d6o(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, (com.paypal.oslo.feature.starpay.api.ProvisioningMetadata) obj);
                }
            });
            return;
        }
        if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function22 = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.starpay.api.Result.Failure failure = new com.paypal.oslo.feature.starpay.api.Result.Failure(((com.paypal.oslo.feature.starpay.api.Result.Failure) result).getError());
        final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient2 = this.getHighSpeedVideoFpsRangesFor;
        function22.invoke(failure, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$1.m19740$r8$lambda$U54RtikYbWaaJ8A5odszcWz5Jk(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, (com.paypal.oslo.feature.starpay.api.ProvisioningMetadata) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$U54RtikYbWaaJ8A5odszcWz5-Jk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19740$r8$lambda$U54RtikYbWaaJ8A5odszcWz5Jk(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.paypal.oslo.feature.starpay.api.ProvisioningMetadata provisioningMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningMetadata, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "OnProvisioningDataReceivedCallback should not be called when fetch operation fails", null, null, null, 14, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vuc5k-dkgy4_9z6wM8AowA9d-6o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19741$r8$lambda$vuc5kdkgy4_9z6wM8AowA9d6o(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.paypal.oslo.feature.starpay.api.ProvisioningMetadata provisioningMetadata) {
        android.app.Activity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningMetadata, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "Calling pushTokenize", null, null, 6, null);
        com.google.android.gms.tapandpay.TapAndPayClient tapAndPayClient = googlePayClient.getTapAndPayClient();
        activity = googlePayClient.getHighSpeedVideoFpsRanges;
        tapAndPayClient.pushTokenize(activity, com.paypal.oslo.feature.starpay.domain.utilities.ExtensionsKt.createPushTokenizeRequest(provisioningMetadata), 100);
        return kotlin.Unit.INSTANCE;
    }
}
