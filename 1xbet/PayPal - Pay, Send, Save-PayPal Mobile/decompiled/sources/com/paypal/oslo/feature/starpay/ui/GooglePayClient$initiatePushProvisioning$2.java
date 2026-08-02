package com.paypal.oslo.feature.starpay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient$initiatePushProvisioning$2;", "Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;", "Lcom/paypal/oslo/feature/starpay/api/WalletData;", "Lcom/paypal/oslo/feature/starpay/api/Result;", "result", "", "onComplete", "(Lcom/paypal/oslo/feature/starpay/api/Result;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GooglePayClient$initiatePushProvisioning$2 implements com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.paypal.oslo.feature.starpay.api.WalletData> {
    final /* synthetic */ com.paypal.oslo.feature.starpay.ui.GooglePayClient getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    GooglePayClient$initiatePushProvisioning$2(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, ? super kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function2, com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = googlePayClient;
        this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
    }

    @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
    public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletData> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.paypal.oslo.feature.starpay.api.Result.Success) {
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function2 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.starpay.api.Result.Success success = new com.paypal.oslo.feature.starpay.api.Result.Success(((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData());
            final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.getHighSpeedVideoFpsRanges;
            function2.invoke(success, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2.$r8$lambda$F9uDBaJXbXC0sy625EfzP4jzUa8(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, managedActivityResultLauncher, (com.paypal.oslo.feature.starpay.api.ProvisioningMetadata) obj);
                }
            });
            return;
        }
        if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, kotlin.Unit>, kotlin.Unit> function22 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.starpay.api.Result.Failure failure = new com.paypal.oslo.feature.starpay.api.Result.Failure(((com.paypal.oslo.feature.starpay.api.Result.Failure) result).getError());
        final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient2 = this.getHighResolutionOutputSizeshNQ4ISI;
        function22.invoke(failure, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2.$r8$lambda$o5HuUrBGbRleHT9DbZqpP9tH_c4(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, (com.paypal.oslo.feature.starpay.api.ProvisioningMetadata) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$-iu-7Qu-Ibh6VOgSkAUG2JiKlcY, reason: not valid java name */
    public static /* synthetic */ void m19742$r8$lambda$iu7QuIbh6VOgSkAUG2JiKlcY(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "pushTokenize failed", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(exc), null, exc, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F9uDBaJXbXC0sy625EfzP4jzUa8(final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, final androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, com.paypal.oslo.feature.starpay.api.ProvisioningMetadata provisioningMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningMetadata, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "Calling pushTokenize", null, null, 6, null);
        com.google.android.gms.tasks.Task<android.app.PendingIntent> pushTokenize = googlePayClient.getTapAndPayClient().pushTokenize(com.paypal.oslo.feature.starpay.domain.utilities.ExtensionsKt.createPushTokenizeRequest(provisioningMetadata));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2.$r8$lambda$mpfdqnezrCzL6x18oIO9noa5tyY(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, managedActivityResultLauncher, (android.app.PendingIntent) obj);
            }
        };
        pushTokenize.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                com.paypal.oslo.feature.starpay.ui.GooglePayClient$initiatePushProvisioning$2.m19742$r8$lambda$iu7QuIbh6VOgSkAUG2JiKlcY(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, exc);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mpfdqnezrCzL6x18oIO9noa5tyY(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, android.app.PendingIntent pendingIntent) {
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "pushTokenize successful, launching intent", null, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(pendingIntent);
        managedActivityResultLauncher.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent).build());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o5HuUrBGbRleHT9DbZqpP9tH_c4(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.paypal.oslo.feature.starpay.api.ProvisioningMetadata provisioningMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningMetadata, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "OnProvisioningDataReceivedCallback should not be called when fetch operation fails", null, null, null, 14, null);
        return kotlin.Unit.INSTANCE;
    }
}
