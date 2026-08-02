package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "", "toErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApiCallErrorKt {
    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError apiCallError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiCallError, "");
        if (apiCallError instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.DataNotFound) {
            return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.DataNotFound) apiCallError).getMessage();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.InvalidData) {
            return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.InvalidData) apiCallError).getMessage();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed) {
            return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed) apiCallError).getMessage();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
