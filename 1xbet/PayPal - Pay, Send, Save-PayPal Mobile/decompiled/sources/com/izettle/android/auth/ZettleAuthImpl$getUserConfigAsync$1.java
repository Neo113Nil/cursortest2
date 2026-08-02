package com.izettle.android.auth;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ZettleAuthImpl$getUserConfigAsync$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable>> {
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable> invoke() {
        return com.izettle.android.auth.repository.UserConfigRepository.DefaultImpls.getUserConfig$default((com.izettle.android.auth.repository.UserConfigRepository) this.receiver, null, 1, null);
    }

    ZettleAuthImpl$getUserConfigAsync$1(java.lang.Object obj) {
        super(0, obj, com.izettle.android.auth.repository.UserConfigRepository.class, "getUserConfig", "getUserConfig(Lcom/izettle/android/auth/repository/GetStrategy;)Lcom/izettle/android/core/data/result/Result;", 0);
    }
}
