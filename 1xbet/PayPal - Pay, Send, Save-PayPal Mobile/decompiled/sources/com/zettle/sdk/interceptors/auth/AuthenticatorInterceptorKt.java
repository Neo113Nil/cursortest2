package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u001f\u0010\u000e\u001a\u00020\t*\u00020\b8AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"", "AUTHORIZATION", "Ljava/lang/String;", "AUTHORIZATION_VALUE", "", "ERROR_CODE_TOKEN_RETRIEVAL_EXCEPTION", com.visa.cbp.getEncExpo.warmup, "PAYPAL_AUTHORIZATION", "Lcom/zettle/sdk/commons/util/Log$Companion;", "Lcom/zettle/sdk/commons/util/Log;", "AuthInterceptor$delegate", "Lkotlin/Lazy;", "getAuthInterceptor", "(Lcom/zettle/sdk/commons/util/Log$Companion;)Lcom/zettle/sdk/commons/util/Log;", "AuthInterceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthenticatorInterceptorKt {
    public static final java.lang.String AUTHORIZATION = "Authorization";
    public static final java.lang.String AUTHORIZATION_VALUE = "Bearer %s";
    private static final kotlin.Lazy AuthInterceptor$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.util.Log>() { // from class: com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt$AuthInterceptor$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.util.Log invoke() {
            return com.zettle.sdk.commons.util.Log.INSTANCE.get("AuthInterceptor");
        }
    });
    public static final int ERROR_CODE_TOKEN_RETRIEVAL_EXCEPTION = 499;
    public static final java.lang.String PAYPAL_AUTHORIZATION = "x-paypal-internal-euat";

    public static final com.zettle.sdk.commons.util.Log getAuthInterceptor(com.zettle.sdk.commons.util.Log.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.util.Log) AuthInterceptor$delegate.getValue();
    }
}
