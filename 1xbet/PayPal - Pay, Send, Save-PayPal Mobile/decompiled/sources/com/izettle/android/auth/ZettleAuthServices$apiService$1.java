package com.izettle.android.auth;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ZettleAuthServices$apiService$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.OAuthTokens, ? extends java.lang.Throwable>> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> invoke() {
        return ((com.izettle.android.auth.token.TokenManager) this.receiver).refreshAccessToken();
    }

    ZettleAuthServices$apiService$1(java.lang.Object obj) {
        super(0, obj, com.izettle.android.auth.token.TokenManager.class, "refreshAccessToken", "refreshAccessToken()Lcom/izettle/android/core/data/result/Result;", 0);
    }
}
