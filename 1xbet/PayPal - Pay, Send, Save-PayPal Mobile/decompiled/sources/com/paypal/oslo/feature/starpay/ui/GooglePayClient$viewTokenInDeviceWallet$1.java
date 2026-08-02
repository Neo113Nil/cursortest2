package com.paypal.oslo.feature.starpay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient$viewTokenInDeviceWallet$1;", "Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;", "Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "Lcom/paypal/oslo/feature/starpay/api/Result;", "result", "", "onComplete", "(Lcom/paypal/oslo/feature/starpay/api/Result;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GooglePayClient$viewTokenInDeviceWallet$1 implements com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.google.android.gms.tapandpay.issuer.TokenInfo> {
    final /* synthetic */ com.paypal.oslo.feature.starpay.ui.GooglePayClient getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.TokenMatchPolicy getHighSpeedVideoSizes;

    GooglePayClient$viewTokenInDeviceWallet$1(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy) {
        this.getHighSpeedVideoFpsRangesFor = googlePayClient;
        this.getHighSpeedVideoSizes = tokenMatchPolicy;
    }

    @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
    public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends com.google.android.gms.tapandpay.issuer.TokenInfo> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result instanceof com.paypal.oslo.feature.starpay.api.Result.Success) {
            final com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo = (com.google.android.gms.tapandpay.issuer.TokenInfo) ((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData();
            if (tokenInfo != null) {
                final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient = this.getHighSpeedVideoFpsRangesFor;
                com.google.android.gms.tapandpay.issuer.ViewTokenRequest build = new com.google.android.gms.tapandpay.issuer.ViewTokenRequest.Builder().setIssuerTokenId(tokenInfo.getIssuerTokenId()).setTokenServiceProvider(tokenInfo.getTokenServiceProvider()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                if (googlePayClient.getTapAndPayClient().viewToken(build).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClient$viewTokenInDeviceWallet$1$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.paypal.oslo.feature.starpay.ui.GooglePayClient$viewTokenInDeviceWallet$1.$r8$lambda$9K146xF_gAeQZKDygbIw93QFlcQ(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, tokenInfo, task);
                    }
                }) != null) {
                    return;
                }
            }
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(this.getHighSpeedVideoFpsRangesFor.getLogger(), "No matching token found in wallet", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(this.getHighSpeedVideoSizes), null, 4, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return;
        }
        if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(this.getHighSpeedVideoFpsRangesFor.getLogger(), "Failed to find token in wallet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.starpay.api.Result.Failure) result).getError().toString()), kotlin.TuplesKt.to("tokenMatchPolicy", this.getHighSpeedVideoSizes.toString())), null, null, 12, null);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$9K146xF_gAeQZKDygbIw93QFlcQ(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo, com.google.android.gms.tasks.Task task) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            try {
                ((android.app.PendingIntent) task.getResult()).send();
                return;
            } catch (android.app.PendingIntent.CanceledException e) {
                com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "View token failed", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(e), null, e, 4, null);
                return;
            }
        }
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger logger = googlePayClient.getLogger();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("tokenId", tokenInfo.getIssuerTokenId());
        java.lang.Exception exception = task.getException();
        if (exception == null || (str = exception.getMessage()) == null) {
            str = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        pairArr[1] = kotlin.TuplesKt.to("error", str);
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(logger, "View token operation failed", kotlin.collections.MapsKt.mapOf(pairArr), null, task.getException(), 4, null);
    }
}
