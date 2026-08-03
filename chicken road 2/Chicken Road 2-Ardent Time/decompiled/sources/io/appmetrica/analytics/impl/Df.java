package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
/* loaded from: classes.dex */
public final class Df implements io.appmetrica.analytics.impl.Cf {

    /* renamed from: a, reason: collision with root package name */
    private volatile java.lang.String f4209a;

    @android.annotation.SuppressLint({"PrivateApi"})
    private final java.lang.String b() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (invoke != null) {
                return (java.lang.String) invoke;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException(th);
        }
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public java.lang.String a() {
        if (this.f4209a != null) {
            return this.f4209a;
        }
        synchronized (this) {
            if (this.f4209a == null) {
                this.f4209a = b();
            }
        }
        return this.f4209a;
    }
}
