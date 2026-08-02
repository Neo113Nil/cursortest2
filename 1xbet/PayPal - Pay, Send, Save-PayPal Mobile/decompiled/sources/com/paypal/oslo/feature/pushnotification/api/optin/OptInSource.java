package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "", "", "getKey", "()Ljava/lang/String;", "key", "getDisplayName", "displayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OptInSource {
    java.lang.String getKey();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.String getDisplayName(com.paypal.oslo.feature.pushnotification.api.optin.OptInSource optInSource) {
            return com.paypal.oslo.feature.pushnotification.api.optin.OptInSource.super.getDisplayName();
        }
    }

    default java.lang.String getDisplayName() {
        return getKey();
    }
}
