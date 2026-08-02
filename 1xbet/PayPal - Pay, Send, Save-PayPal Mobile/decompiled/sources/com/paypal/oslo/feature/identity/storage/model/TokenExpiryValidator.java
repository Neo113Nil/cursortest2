package com.paypal.oslo.feature.identity.storage.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/model/TokenExpiryValidator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "nowElapsedRealtime", "", "isValid", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;J)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenExpiryValidator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.storage.model.TokenExpiryValidator INSTANCE = new com.paypal.oslo.feature.identity.storage.model.TokenExpiryValidator();

    private TokenExpiryValidator() {
    }

    public final boolean isValid(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData token, long nowElapsedRealtime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return token.getExpiresAtElapsedRealtime() - nowElapsedRealtime > 10000;
    }
}
