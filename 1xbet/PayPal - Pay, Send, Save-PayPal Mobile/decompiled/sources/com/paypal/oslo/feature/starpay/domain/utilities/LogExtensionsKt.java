package com.paypal.oslo.feature.starpay.domain.utilities;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\tH\u0000¢\u0006\u0004\b\u0003\u0010\n"}, d2 = {"Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "", "", "mapLog", "(Lcom/google/android/gms/tapandpay/issuer/TokenInfo;)Ljava/util/Map;", "mapPIILog", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "(Ljava/lang/Exception;)Ljava/util/Map;", "Lcom/paypal/oslo/feature/starpay/api/TokenMatchPolicy;", "(Lcom/paypal/oslo/feature/starpay/api/TokenMatchPolicy;)Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LogExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.String> mapLog(com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenInfo, "");
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDefaultToken", java.lang.String.valueOf(tokenInfo.getIsDefaultToken())), kotlin.TuplesKt.to("issuerName", tokenInfo.getIssuerName()), kotlin.TuplesKt.to("network", java.lang.String.valueOf(tokenInfo.getNetwork())), kotlin.TuplesKt.to("portfolioName", tokenInfo.getPortfolioName()), kotlin.TuplesKt.to("tokenServiceProvider", java.lang.String.valueOf(tokenInfo.getTokenServiceProvider())), kotlin.TuplesKt.to("tokenState", java.lang.String.valueOf(tokenInfo.getTokenState())));
    }

    public static final java.util.Map<java.lang.String, java.lang.String> mapPIILog(com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenInfo, "");
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fpanLastFour", tokenInfo.getFpanLastFour()), kotlin.TuplesKt.to("dpanLastFour", tokenInfo.getDpanLastFour()), kotlin.TuplesKt.to("issuerTokenId", tokenInfo.getIssuerTokenId()));
    }

    public static final java.util.Map<java.lang.String, java.lang.String> mapLog(java.lang.Exception exc) {
        if (exc instanceof com.google.android.gms.common.api.ApiException) {
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            com.google.android.gms.common.api.ApiException apiException = (com.google.android.gms.common.api.ApiException) exc;
            pairArr[0] = kotlin.TuplesKt.to("statusCode", java.lang.String.valueOf(apiException.getStatusCode()));
            java.lang.String message = apiException.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("message", message != null ? message : "");
            return kotlin.collections.MapsKt.mapOf(pairArr);
        }
        java.lang.String message2 = exc != null ? exc.getMessage() : null;
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", message2 != null ? message2 : ""));
    }

    public static final java.util.Map<java.lang.String, java.lang.String> mapLog(com.paypal.oslo.feature.starpay.api.TokenMatchPolicy tokenMatchPolicy) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenMatchPolicy, "");
        if (tokenMatchPolicy instanceof com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.PanSuffix) {
            str = "PanSuffix";
        } else {
            if (!(tokenMatchPolicy instanceof com.paypal.oslo.feature.starpay.api.TokenMatchPolicy.TokenReference)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "TokenReference";
        }
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenMatchPolicy", str));
    }
}
