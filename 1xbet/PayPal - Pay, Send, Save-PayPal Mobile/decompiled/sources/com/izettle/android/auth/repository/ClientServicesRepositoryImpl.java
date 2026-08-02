package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u00138CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019"}, d2 = {"Lcom/izettle/android/auth/repository/ClientServicesRepositoryImpl;", "Lcom/izettle/android/auth/repository/ClientServicesRepository;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "<init>", "(Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/repository/ServiceUriRepository;Lcom/izettle/android/auth/BackendEnvironment;)V", "", "service", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getServiceUrl", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/BackendEnvironment;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "", "fallbackUrls$delegate", "Lkotlin/Lazy;", "getFallbackUrls", "()Ljava/util/Map;", "fallbackUrls", "Lcom/izettle/android/auth/repository/ServiceUriRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClientServicesRepositoryImpl implements com.izettle.android.auth.repository.ClientServicesRepository {
    private final com.izettle.android.auth.BackendEnvironment backendEnvironment;
    private final com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;

    /* renamed from: fallbackUrls$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fallbackUrls;
    private final com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository;

    public ClientServicesRepositoryImpl(com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        this.baseUriRepository = baseUriRepository;
        this.serviceUriRepository = serviceUriRepository;
        this.backendEnvironment = backendEnvironment;
        this.fallbackUrls = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.izettle.android.auth.model.ServiceUrls>>() { // from class: com.izettle.android.auth.repository.ClientServicesRepositoryImpl$fallbackUrls$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> invoke() {
                com.izettle.android.auth.BackendEnvironment backendEnvironment2;
                backendEnvironment2 = com.izettle.android.auth.repository.ClientServicesRepositoryImpl.this.backendEnvironment;
                return backendEnvironment2.getFallbackUrls();
            }

            {
                super(0);
            }
        });
    }

    private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls() {
        return (java.util.Map) this.fallbackUrls.getValue();
    }

    @Override // com.izettle.android.auth.repository.ClientServicesRepository
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getServiceUrl(java.lang.String service) {
        com.izettle.android.auth.model.ServiceUrls serviceUrls;
        com.izettle.android.auth.model.ServiceUrls serviceUrls2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = service.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        com.izettle.android.core.data.result.Result baseUrls$default = com.izettle.android.auth.repository.BaseUriRepository.DefaultImpls.getBaseUrls$default(this.baseUriRepository, false, 1, null);
        if ((baseUrls$default instanceof com.izettle.android.core.data.result.Success) && (serviceUrls2 = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) baseUrls$default).getValue()).get(upperCase)) != null && serviceUrls2.getSize() > 0) {
            return com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls2);
        }
        com.izettle.android.core.data.result.Result serviceUrls$default = com.izettle.android.auth.repository.ServiceUriRepository.DefaultImpls.getServiceUrls$default(this.serviceUriRepository, false, 1, null);
        boolean z = serviceUrls$default instanceof com.izettle.android.core.data.result.Success;
        if (z) {
            com.izettle.android.auth.model.ServiceUrls serviceUrls3 = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) serviceUrls$default).getValue()).get(upperCase);
            if (serviceUrls3 != null && serviceUrls3.getSize() > 0) {
                return com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls3);
            }
        } else if ((serviceUrls$default instanceof com.izettle.android.core.data.result.Failure) && (((com.izettle.android.core.data.result.Failure) serviceUrls$default).getError() instanceof com.izettle.android.auth.exceptions.UnauthorizedException)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't get URL for service [");
            sb.append(upperCase);
            sb.append("]. Unauthorised.");
            return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException(sb.toString()));
        }
        if (z && (serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) serviceUrls$default).getValue()).get(upperCase)) != null && serviceUrls.getSize() > 0) {
            return com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls);
        }
        com.izettle.android.auth.model.ServiceUrls serviceUrls4 = getFallbackUrls().get(upperCase);
        if (serviceUrls4 != null) {
            return com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls4);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("URL for service [");
        sb2.append(upperCase);
        sb2.append("] not found");
        return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException(sb2.toString()));
    }
}
