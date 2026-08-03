package io.appmetrica.analytics.remotepermissions.impl;

/* loaded from: classes.dex */
public final class e implements io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f7478a = i1.C0201t.f3327a;

    public final synchronized void a(java.util.Set<java.lang.String> set) {
        this.f7478a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(java.lang.String str) {
        return !this.f7478a.contains(str);
    }
}
