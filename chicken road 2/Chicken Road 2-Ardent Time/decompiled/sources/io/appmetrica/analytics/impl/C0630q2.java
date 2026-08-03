package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630q2 implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        return ((android.location.LocationManager) obj).getProviders(true);
    }
}
