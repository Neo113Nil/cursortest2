package com.izettle.android.auth;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class AuthManagerImpl$refreshLoginState$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke() {
        return java.lang.Boolean.valueOf(((com.izettle.android.auth.AuthManagerImpl) this.receiver).isLoggedIn());
    }

    AuthManagerImpl$refreshLoginState$1(java.lang.Object obj) {
        super(0, obj, com.izettle.android.auth.AuthManagerImpl.class, "isLoggedIn", "isLoggedIn()Z", 0);
    }
}
