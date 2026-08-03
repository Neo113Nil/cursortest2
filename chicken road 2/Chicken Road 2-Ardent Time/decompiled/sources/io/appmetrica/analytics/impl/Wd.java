package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wd implements io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy {
    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(java.lang.String str) {
        return false;
    }

    public final java.lang.String toString() {
        return "AlwaysAskForPermissionStrategy{always allow permission}";
    }
}
