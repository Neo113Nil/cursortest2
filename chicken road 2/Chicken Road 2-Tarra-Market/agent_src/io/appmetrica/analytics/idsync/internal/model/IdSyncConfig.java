package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2096a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2097b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2098c;

    public IdSyncConfig(boolean z2, long j2, List<RequestConfig> list) {
        this.f2096a = z2;
        this.f2097b = j2;
        this.f2098c = list;
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
        return this.f2096a == idSyncConfig.f2096a && this.f2097b == idSyncConfig.f2097b && j.a(this.f2098c, idSyncConfig.f2098c);
    }

    public final boolean getEnabled() {
        return this.f2096a;
    }

    public final long getLaunchDelay() {
        return this.f2097b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f2098c;
    }

    public int hashCode() {
        return this.f2098c.hashCode() + ((Long.hashCode(this.f2097b) + (Boolean.hashCode(this.f2096a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f2096a + ", launchDelay=" + this.f2097b + ", requests=" + this.f2098c + ')';
    }
}
