package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/izettle/android/auth/Test;", "Lcom/izettle/android/auth/BackendEnvironment;", "", "clientId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "", "Lcom/izettle/android/auth/model/ServiceUrls;", "fallbackUrls", "Ljava/util/Map;", "getFallbackUrls", "()Ljava/util/Map;", "serviceLookupUrl", "getServiceLookupUrl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Test implements com.izettle.android.auth.BackendEnvironment {
    private final java.lang.String clientId;
    private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> fallbackUrls;
    private final java.lang.String serviceLookupUrl;

    public Test(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.clientId = str;
        this.serviceLookupUrl = "https://service-lookup.izettletest.com/";
        this.fallbackUrls = com.izettle.android.auth.model.FallbackUrlsKt.testFallbackUrls();
    }

    @Override // com.izettle.android.auth.BackendEnvironment
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    @Override // com.izettle.android.auth.BackendEnvironment
    public final java.lang.String getServiceLookupUrl() {
        return this.serviceLookupUrl;
    }

    @Override // com.izettle.android.auth.BackendEnvironment
    public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls() {
        return this.fallbackUrls;
    }
}
