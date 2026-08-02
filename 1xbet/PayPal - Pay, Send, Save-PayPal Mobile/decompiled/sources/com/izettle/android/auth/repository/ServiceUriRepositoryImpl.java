package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R8\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f0\u00188\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/izettle/android/auth/repository/ServiceUriRepositoryImpl;", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "Lcom/izettle/android/auth/services/MobileService;", "mobileService", "Lkotlin/Function0;", "", "accessTokenResolver", "<init>", "(Lcom/izettle/android/auth/services/MobileService;Lkotlin/jvm/functions/Function0;)V", "", "forceSync", "Lcom/izettle/android/core/data/result/Result;", "", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getServiceUrls", "(Z)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/HttpUrl;", "url", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "Lkotlin/jvm/functions/Function0;", "Lcom/izettle/android/auth/services/MobileService;", "", "serviceUrls", "Ljava/util/Map;", "getServiceUrls$auth_release", "()Ljava/util/Map;", "getServiceUrls$auth_release$annotations", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServiceUriRepositoryImpl implements com.izettle.android.auth.repository.ServiceUriRepository {
    private final kotlin.jvm.functions.Function0<java.lang.String> accessTokenResolver;
    private final com.izettle.android.auth.services.MobileService mobileService;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>> serviceUrls;

    public static /* synthetic */ void getServiceUrls$auth_release$annotations() {
    }

    public ServiceUriRepositoryImpl(com.izettle.android.auth.services.MobileService mobileService, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.mobileService = mobileService;
        this.accessTokenResolver = function0;
        this.serviceUrls = new java.util.LinkedHashMap();
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>> getServiceUrls$auth_release() {
        return this.serviceUrls;
    }

    @Override // com.izettle.android.auth.repository.ServiceUriRepository
    public final void invalidateUrl(com.izettle.android.net.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.izettle.android.core.data.result.Result serviceUrls$default = com.izettle.android.auth.repository.ServiceUriRepository.DefaultImpls.getServiceUrls$default(this, false, 1, null);
        if (serviceUrls$default instanceof com.izettle.android.core.data.result.Success) {
            java.util.Iterator it = ((java.util.Map) ((com.izettle.android.core.data.result.Success) serviceUrls$default).getValue()).values().iterator();
            while (it.hasNext()) {
                ((com.izettle.android.auth.model.ServiceUrls) it.next()).invalidateUrl(url);
            }
        }
    }

    @Override // com.izettle.android.auth.repository.ServiceUriRepository
    public final com.izettle.android.core.data.result.Result<java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>, java.lang.Throwable> getServiceUrls(boolean forceSync) {
        com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
        com.izettle.android.auth.dto.JwtUser user;
        java.lang.String userId;
        synchronized (this) {
            java.lang.String invoke = this.accessTokenResolver.invoke();
            if (invoke == null || (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(invoke)) == null || (user = decodeAsJwtOrNull.getUser()) == null || (userId = user.getUserId()) == null) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(new com.izettle.android.auth.exceptions.UnauthorizedException());
            }
            java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> map = this.serviceUrls.get(userId);
            if (!forceSync && map != null) {
                return com.izettle.android.core.data.result.ResultKt.asSuccess(map);
            }
            com.izettle.android.core.data.result.Result serviceUrls = this.mobileService.getServiceUrls(invoke);
            if (serviceUrls instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) serviceUrls).getValue();
                java.util.Map map2 = (java.util.Map) response.getBody();
                if (map2 != null) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map2.size()));
                    for (java.lang.Object obj : map2.entrySet()) {
                        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) obj).getKey();
                        java.util.Locale locale = java.util.Locale.ROOT;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String upperCase = str.toUpperCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        linkedHashMap.put(upperCase, ((java.util.Map.Entry) obj).getValue());
                    }
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
                    this.serviceUrls.put(userId, linkedHashMap2);
                    com.izettle.android.core.data.result.Result asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(linkedHashMap2);
                    if (asSuccess != null) {
                        serviceUrls = asSuccess;
                    }
                }
                serviceUrls = com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
            } else if (!(serviceUrls instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return serviceUrls;
        }
    }
}
