package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "", "Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;", "apiService", "<init>", "(Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;)V", "", "endpoint", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lkotlinx/serialization/json/JsonObject;", "fetchData", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public NetworkRepository(com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService i18nMetadataApiService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i18nMetadataApiService, "");
        this.getHighResolutionOutputSizeshNQ4ISI = i18nMetadataApiService;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, kotlinx.serialization.json.JsonObject>> fetchData(java.lang.String endpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
        return kotlinx.coroutines.flow.FlowKt.m24097catch(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1(this, endpoint, null)), new com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$2(endpoint, null));
    }
}
