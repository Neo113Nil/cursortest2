package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5641a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5642b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5643c;

    public IdSyncConfig(boolean z3, long j3, List<RequestConfig> list) {
        this.f5641a = z3;
        this.f5642b = j3;
        this.f5643c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.f5641a == idSyncConfig.f5641a && this.f5642b == idSyncConfig.f5642b && j.a(this.f5643c, idSyncConfig.f5643c);
    }

    public final boolean getEnabled() {
        return this.f5641a;
    }

    public final long getLaunchDelay() {
        return this.f5642b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f5643c;
    }

    public int hashCode() {
        return this.f5643c.hashCode() + ((Long.hashCode(this.f5642b) + (Boolean.hashCode(this.f5641a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f5641a + ", launchDelay=" + this.f5642b + ", requests=" + this.f5643c + ')';
    }
}
