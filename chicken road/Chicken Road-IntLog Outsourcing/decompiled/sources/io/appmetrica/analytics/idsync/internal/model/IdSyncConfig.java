package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6468a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6469b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6470c;

    public IdSyncConfig(boolean z, long j2, List<RequestConfig> list) {
        this.f6468a = z;
        this.f6469b = j2;
        this.f6470c = list;
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
        return this.f6468a == idSyncConfig.f6468a && this.f6469b == idSyncConfig.f6469b && i.a(this.f6470c, idSyncConfig.f6470c);
    }

    public final boolean getEnabled() {
        return this.f6468a;
    }

    public final long getLaunchDelay() {
        return this.f6469b;
    }

    public final List<RequestConfig> getRequests() {
        return this.f6470c;
    }

    public int hashCode() {
        return this.f6470c.hashCode() + ((Long.hashCode(this.f6469b) + (Boolean.hashCode(this.f6468a) * 31)) * 31);
    }

    public String toString() {
        return "IdSyncConfig(enabled=" + this.f6468a + ", launchDelay=" + this.f6469b + ", requests=" + this.f6470c + ')';
    }
}
