package com.izettle.android.auth;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class AuthManagerImpl$logoutAsync$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> invoke() {
        return ((com.izettle.android.auth.AuthManagerImpl) this.receiver).logout();
    }

    AuthManagerImpl$logoutAsync$1(java.lang.Object obj) {
        super(0, obj, com.izettle.android.auth.AuthManagerImpl.class, "logout", "logout()Lcom/izettle/android/core/data/result/Result;", 0);
    }
}
