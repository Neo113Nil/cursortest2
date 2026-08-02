package com.paypal.oslo.core.network.rest.cache;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/cache/CacheControl;", "", "toHeader", "(Lcom/paypal/oslo/core/network/http/cache/CacheControl;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CacheControlExtensionsKt {
    public static final java.lang.String toHeader(com.paypal.oslo.core.network.http.cache.CacheControl cacheControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheControl, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(cacheControl, com.paypal.oslo.core.network.http.cache.CacheControl.ForceNetwork.INSTANCE)) {
            return "no-cache";
        }
        if (cacheControl instanceof com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge) {
            return "max-age=".concat(java.lang.String.valueOf(kotlin.time.Duration.m23956getInWholeSecondsimpl(((com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge) cacheControl).m11665getTtlUwyO8pc())));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
