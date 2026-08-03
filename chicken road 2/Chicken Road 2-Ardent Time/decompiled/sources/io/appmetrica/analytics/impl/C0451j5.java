package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451j5 implements io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy[] f6159a;

    public C0451j5(io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy... permissionStrategyArr) {
        this.f6159a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(java.lang.String str) {
        for (io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy permissionStrategy : this.f6159a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return "CompositePermissionStrategy(strategies=" + java.util.Arrays.toString(this.f6159a) + ')';
    }
}
