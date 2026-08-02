package com.paypal.oslo.feature.starpay.domain.utilities;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "message", "Lcom/paypal/oslo/feature/starpay/api/Error;", "mapError", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/Error;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "toError", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/starpay/api/Error;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorExtensionsKt {
    public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Error mapError$default(java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return mapError(num, str);
    }

    public static final com.paypal.oslo.feature.starpay.api.Error mapError(java.lang.Integer num, java.lang.String str) {
        if (num == null || num.intValue() != 15002) {
            return (num == null || num.intValue() != 0) ? new com.paypal.oslo.feature.starpay.api.Error.SystemError(num, str) : new com.paypal.oslo.feature.starpay.api.Error.Canceled(num.intValue(), str);
        }
        return new com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet(num.intValue(), str);
    }

    public static final com.paypal.oslo.feature.starpay.api.Error toError(java.lang.Exception exc) {
        if (exc instanceof com.google.android.gms.common.api.ApiException) {
            com.google.android.gms.common.api.ApiException apiException = (com.google.android.gms.common.api.ApiException) exc;
            return mapError(java.lang.Integer.valueOf(apiException.getStatusCode()), apiException.getMessage());
        }
        if (exc instanceof com.google.android.gms.common.api.UnsupportedApiCallException) {
            return new com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi(null, ((com.google.android.gms.common.api.UnsupportedApiCallException) exc).getMessage(), 1, null);
        }
        return new com.paypal.oslo.feature.starpay.api.Error.SystemError(null, exc != null ? exc.getMessage() : null, 1, null);
    }
}
