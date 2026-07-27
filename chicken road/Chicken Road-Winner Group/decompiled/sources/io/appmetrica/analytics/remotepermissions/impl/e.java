package io.appmetrica.analytics.remotepermissions.impl;

import e2.q;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public Set f8966a = q.f4879a;

    public final synchronized void a(Set<String> set) {
        this.f8966a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f8966a.contains(str);
    }
}
