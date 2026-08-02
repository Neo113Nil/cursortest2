package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004"}, d2 = {"Lcom/izettle/android/auth/BackendEnvironment;", "", "", "getClientId", "()Ljava/lang/String;", "clientId", "", "Lcom/izettle/android/auth/model/ServiceUrls;", "getFallbackUrls", "()Ljava/util/Map;", "fallbackUrls", "getServiceLookupUrl", "serviceLookupUrl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BackendEnvironment {
    java.lang.String getClientId();

    java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls();

    java.lang.String getServiceLookupUrl();
}
