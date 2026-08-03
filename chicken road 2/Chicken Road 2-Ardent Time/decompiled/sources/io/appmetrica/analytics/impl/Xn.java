package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xn implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((android.os.UserManager) obj).isUserUnlocked());
    }
}
