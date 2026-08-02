package com.paypal.oslo.feature.starpay.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\n\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient;", "Lcom/paypal/oslo/feature/starpay/api/TokenMatchPolicy;", "tokenMatchPolicy", "Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;", "Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "onCompleteListener", "", "findTokenInWalletInternal", "(Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient;Lcom/paypal/oslo/feature/starpay/api/TokenMatchPolicy;Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;)V", "Lcom/paypal/oslo/feature/starpay/api/WalletData;", "getWalletInfo", "(Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient;Lcom/paypal/oslo/feature/starpay/api/OnCompleteListener;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GooglePayClientExtensionsKt {
    public static final void findTokenInWalletInternal(final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, final com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy, final com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.google.android.gms.tapandpay.issuer.TokenInfo> onCompleteListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googlePayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenMatchPolicy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCompleteListener, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "findTokenInWalletInternal()", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(tokenMatchPolicy), null, 4, null);
        googlePayClient.getTapAndPayClient().listTokens().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt.m19744$r8$lambda$zdwUCn0mK1kXaMIxuY5oicE(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, tokenMatchPolicy, onCompleteListener, task);
            }
        });
    }

    public static final void getWalletInfo(final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, final com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.paypal.oslo.feature.starpay.api.WalletData> onCompleteListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googlePayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCompleteListener, "");
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "getWalletInfo()", null, null, 6, null);
        googlePayClient.getTapAndPayClient().getActiveWalletId().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt.$r8$lambda$5kCqkmjcXcB4b62WWXgGtg1eIhs(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, onCompleteListener, task);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$5kCqkmjcXcB4b62WWXgGtg1eIhs(final com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, final com.paypal.oslo.feature.starpay.api.OnCompleteListener onCompleteListener, final com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "activeWalletId successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("activeWalletId", task.getResult())), 2, null);
            googlePayClient.getTapAndPayClient().getStableHardwareId().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task2) {
                    com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt.$r8$lambda$TsVMKE2jjHfLvHPTy6WEilcJ6x0(com.paypal.oslo.feature.starpay.ui.GooglePayClient.this, onCompleteListener, task, task2);
                }
            });
        } else {
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "activeWalletId failed", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(task.getException()), null, task.getException(), 4, null);
            onCompleteListener.onComplete(new com.paypal.oslo.feature.starpay.api.Result.Failure(com.paypal.oslo.feature.starpay.domain.utilities.ErrorExtensionsKt.toError(task.getException())));
        }
    }

    public static /* synthetic */ void $r8$lambda$TsVMKE2jjHfLvHPTy6WEilcJ6x0(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, com.paypal.oslo.feature.starpay.api.OnCompleteListener onCompleteListener, com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task2, "");
        if (!task2.isSuccessful()) {
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "stableHardwareId failed", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(task2.getException()), null, task2.getException(), 4, null);
            onCompleteListener.onComplete(new com.paypal.oslo.feature.starpay.api.Result.Failure(com.paypal.oslo.feature.starpay.domain.utilities.ErrorExtensionsKt.toError(task2.getException())));
            return;
        }
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "stableHardwareId successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("stableHardwareId", task2.getResult())), 2, null);
        java.lang.Object result = task.getResult();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "");
        java.lang.Object result2 = task2.getResult();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result2, "");
        onCompleteListener.onComplete(new com.paypal.oslo.feature.starpay.api.Result.Success(new com.paypal.oslo.feature.starpay.api.WalletData((java.lang.String) result, (java.lang.String) result2)));
    }

    /* renamed from: $r8$lambda$qxgJHo-cfsPmY4sFx1IE9BAv7Q0, reason: not valid java name */
    public static /* synthetic */ boolean m19743$r8$lambda$qxgJHocfsPmY4sFx1IE9BAv7Q0(com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy, com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenInfo, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(tokenInfo.getFpanLastFour(), ((com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.PanSuffix) tokenMatchPolicy).getFpanLastFour());
    }

    public static /* synthetic */ boolean $r8$lambda$x7_WxZB__458GexrBnFvnN5TB6Y(com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy, com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenInfo, "");
        return ((com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.TokenReference) tokenMatchPolicy).getTokenReferenceIds().contains(tokenInfo.getIssuerTokenId());
    }

    /* renamed from: $r8$lambda$z-dwUCn0mK1-kX-aM-IxuY5oicE, reason: not valid java name */
    public static /* synthetic */ void m19744$r8$lambda$zdwUCn0mK1kXaMIxuY5oicE(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePayClient, final com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy, com.paypal.oslo.feature.starpay.api.OnCompleteListener onCompleteListener, com.google.android.gms.tasks.Task task) {
        kotlin.jvm.functions.Function1 function1;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful()) {
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.e$default(googlePayClient.getLogger(), "List tokens failed", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(task.getException()), null, task.getException(), 4, null);
            onCompleteListener.onComplete(new com.paypal.oslo.feature.starpay.api.Result.Failure(com.paypal.oslo.feature.starpay.domain.utilities.ErrorExtensionsKt.toError(task.getException())));
            return;
        }
        com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger.i$default(googlePayClient.getLogger(), "List tokens success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(io.ktor.http.ContentDisposition.Parameters.Size, java.lang.Integer.valueOf(((java.util.List) task.getResult()).size()))), null, 4, null);
        for (com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo : (java.util.List) task.getResult()) {
            com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger logger = googlePayClient.getLogger();
            kotlin.jvm.internal.Intrinsics.checkNotNull(tokenInfo);
            logger.i("TokenInfo", com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapLog(tokenInfo), com.paypal.oslo.feature.starpay.domain.utilities.LogExtensionsKt.mapPIILog(tokenInfo));
        }
        if (tokenMatchPolicy instanceof com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.PanSuffix) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt.m19743$r8$lambda$qxgJHocfsPmY4sFx1IE9BAv7Q0(com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.this, (com.google.android.gms.tapandpay.issuer.TokenInfo) obj2));
                }
            };
        } else {
            if (!(tokenMatchPolicy instanceof com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.TokenReference)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.starpay.ui.GooglePayClientExtensionsKt.$r8$lambda$x7_WxZB__458GexrBnFvnN5TB6Y(com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.this, (com.google.android.gms.tapandpay.issuer.TokenInfo) obj2));
                }
            };
        }
        java.lang.Object result = task.getResult();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "");
        java.util.Iterator it = ((java.lang.Iterable) result).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo2 = (com.google.android.gms.tapandpay.issuer.TokenInfo) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNull(tokenInfo2);
            if (((java.lang.Boolean) function1.invoke(tokenInfo2)).booleanValue()) {
                break;
            }
        }
        onCompleteListener.onComplete(new com.paypal.oslo.feature.starpay.api.Result.Success((com.google.android.gms.tapandpay.issuer.TokenInfo) obj));
    }
}
