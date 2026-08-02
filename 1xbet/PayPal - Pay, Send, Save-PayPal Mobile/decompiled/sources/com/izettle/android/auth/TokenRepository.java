package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0015\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH'¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/izettle/android/auth/TokenRepository;", "", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "", "applyClearToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "oAuthTokens", "", "isNative", "applyStoreCanonicalTokensToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/OAuthTokens;Z)V", "Lcom/izettle/android/core/data/result/Result;", "", "clear", "()Lcom/izettle/android/core/data/result/Result;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "deleteAccessToken", "(Ljava/lang/String;)V", "deleteRefreshToken", "getRefreshToken", "()Ljava/lang/String;", "", "getTokens", "()Ljava/util/List;", "isNativeLogin", "()Z", "storeTokens", "(Lcom/izettle/android/auth/model/OAuthTokens;Z)Lcom/izettle/android/core/data/result/Result;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TokenRepository {
    void applyClearToTransaction(com.izettle.android.auth.storage.Transaction transaction);

    void applyStoreCanonicalTokensToTransaction(com.izettle.android.auth.storage.Transaction transaction, com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> clear();

    void deleteAccessToken(java.lang.String token);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteRefreshToken();

    java.lang.String getRefreshToken();

    java.util.List<com.izettle.android.auth.model.OAuthTokens> getTokens();

    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    boolean isNativeLogin();

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> storeTokens(com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative);
}
