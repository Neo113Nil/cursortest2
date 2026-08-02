package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "networkError", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ErrorMapper() {
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapperKt.mapToApiCallError(callError);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapperKt.mapToApiCallError(networkError);
    }
}
