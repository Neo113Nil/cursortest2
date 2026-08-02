package com.izettle.android.auth;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ZettleAuthImpl$getOneTimeTokenAsync$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends java.lang.String, ? extends java.lang.Throwable>> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final com.izettle.android.core.data.result.Result<java.lang.String, java.lang.Throwable> invoke() {
        return ((com.izettle.android.auth.token.TokenManager) this.receiver).getOneTimeToken();
    }

    ZettleAuthImpl$getOneTimeTokenAsync$1(java.lang.Object obj) {
        super(0, obj, com.izettle.android.auth.token.TokenManager.class, "getOneTimeToken", "getOneTimeToken()Lcom/izettle/android/core/data/result/Result;", 0);
    }
}
