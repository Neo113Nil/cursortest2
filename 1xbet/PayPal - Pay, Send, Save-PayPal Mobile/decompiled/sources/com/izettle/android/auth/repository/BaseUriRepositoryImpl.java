package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00198\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/izettle/android/auth/repository/BaseUriRepositoryImpl;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "Lcom/izettle/android/auth/services/BaseService;", "baseService", "<init>", "(Lcom/izettle/android/auth/services/BaseService;)V", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getApiServiceUrls", "()Lcom/izettle/android/core/data/result/Result;", "", "forceSync", "", "", "getBaseUrls", "(Z)Lcom/izettle/android/core/data/result/Result;", "getOAuth2ServiceUrls", "getOAuthServiceUrls", "Lcom/izettle/android/net/HttpUrl;", "url", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "Lcom/izettle/android/auth/services/BaseService;", "", "baseUrls", "Ljava/util/Map;", "getBaseUrls$auth_release", "()Ljava/util/Map;", "getBaseUrls$auth_release$annotations", "()V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BaseUriRepositoryImpl implements com.izettle.android.auth.repository.BaseUriRepository {
    public static final java.lang.String API_SERVICE_KEY = "API";
    public static final java.lang.String OAUTH2_SERVICE_KEY = "OAUTH2_SERVICE";
    public static final java.lang.String OAUTH_SERVICE_KEY = "AUTHORIZATION_SERVICE";
    private final com.izettle.android.auth.services.BaseService baseService;
    private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> baseUrls;

    public static /* synthetic */ void getBaseUrls$auth_release$annotations() {
    }

    public BaseUriRepositoryImpl(com.izettle.android.auth.services.BaseService baseService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseService, "");
        this.baseService = baseService;
        this.baseUrls = new java.util.LinkedHashMap();
    }

    public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getBaseUrls$auth_release() {
        return this.baseUrls;
    }

    @Override // com.izettle.android.auth.repository.BaseUriRepository
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getApiServiceUrls() {
        com.izettle.android.core.data.result.Success asSuccess;
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> baseUrls$default = com.izettle.android.auth.repository.BaseUriRepository.DefaultImpls.getBaseUrls$default(this, false, 1, null);
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) baseUrls$default).getValue()).get(API_SERVICE_KEY);
            return (serviceUrls == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls)) == null) ? com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("API not found in service urls")) : asSuccess;
        }
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Failure) {
            return baseUrls$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.repository.BaseUriRepository
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getOAuth2ServiceUrls() {
        com.izettle.android.core.data.result.Success asSuccess;
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> baseUrls$default = com.izettle.android.auth.repository.BaseUriRepository.DefaultImpls.getBaseUrls$default(this, false, 1, null);
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) baseUrls$default).getValue()).get(OAUTH2_SERVICE_KEY);
            return (serviceUrls == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls)) == null) ? com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("OAUTH2_SERVICE not found in service urls")) : asSuccess;
        }
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Failure) {
            return baseUrls$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.repository.BaseUriRepository
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getOAuthServiceUrls() {
        com.izettle.android.core.data.result.Success asSuccess;
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> baseUrls$default = com.izettle.android.auth.repository.BaseUriRepository.DefaultImpls.getBaseUrls$default(this, false, 1, null);
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((java.util.Map) ((com.izettle.android.core.data.result.Success) baseUrls$default).getValue()).get(OAUTH_SERVICE_KEY);
            return (serviceUrls == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(serviceUrls)) == null) ? com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("AUTHORIZATION_SERVICE not found in service urls")) : asSuccess;
        }
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Failure) {
            return baseUrls$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.repository.BaseUriRepository
    public final void invalidateUrl(com.izettle.android.net.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.izettle.android.core.data.result.Result baseUrls$default = com.izettle.android.auth.repository.BaseUriRepository.DefaultImpls.getBaseUrls$default(this, false, 1, null);
        if (baseUrls$default instanceof com.izettle.android.core.data.result.Success) {
            java.util.Iterator it = ((java.util.Map) ((com.izettle.android.core.data.result.Success) baseUrls$default).getValue()).values().iterator();
            while (it.hasNext()) {
                ((com.izettle.android.auth.model.ServiceUrls) it.next()).invalidateUrl(url);
            }
        }
    }

    @Override // com.izettle.android.auth.repository.BaseUriRepository
    public final com.izettle.android.core.data.result.Result<java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>, java.lang.Throwable> getBaseUrls(boolean forceSync) {
        synchronized (this) {
            if (!forceSync) {
                if (!this.baseUrls.isEmpty()) {
                    return com.izettle.android.core.data.result.ResultKt.asSuccess(this.baseUrls);
                }
            }
            com.izettle.android.core.data.result.Result baseUrls = this.baseService.getBaseUrls();
            if (baseUrls instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) baseUrls).getValue();
                java.util.Map map = (java.util.Map) response.getBody();
                if (map != null) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
                    for (java.lang.Object obj : map.entrySet()) {
                        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) obj).getKey();
                        java.util.Locale locale = java.util.Locale.ROOT;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String upperCase = str.toUpperCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        linkedHashMap.put(upperCase, ((java.util.Map.Entry) obj).getValue());
                    }
                    java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> map2 = this.baseUrls;
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
                    for (java.lang.Object obj2 : linkedHashMap.entrySet()) {
                        java.lang.Object key = ((java.util.Map.Entry) obj2).getKey();
                        java.util.List list = (java.util.List) ((java.util.Map.Entry) obj2).getValue();
                        com.izettle.android.auth.model.ServiceUrls.Companion companion = com.izettle.android.auth.model.ServiceUrls.INSTANCE;
                        java.util.List list2 = list;
                        com.izettle.android.net.HttpUrl.Companion companion2 = com.izettle.android.net.HttpUrl.INSTANCE;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(companion2.parse((java.lang.String) it.next()));
                        }
                        linkedHashMap2.put(key, companion.create(arrayList));
                    }
                    map2.putAll(linkedHashMap2);
                    com.izettle.android.core.data.result.Result asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(this.baseUrls);
                    if (asSuccess != null) {
                        baseUrls = asSuccess;
                    }
                }
                baseUrls = com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
            } else if (!(baseUrls instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return baseUrls;
        }
    }
}
