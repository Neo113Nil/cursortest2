package io.appmetrica.analytics.idsync.internal.model;

/* loaded from: classes.dex */
public final class IdSyncConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3988a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3989b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.List f3990c;

    public IdSyncConfig(boolean z2, long j2, java.util.List<io.appmetrica.analytics.idsync.internal.model.RequestConfig> list) {
        this.f3988a = z2;
        this.f3989b = j2;
        this.f3990c = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.idsync.internal.model.IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig = (io.appmetrica.analytics.idsync.internal.model.IdSyncConfig) obj;
        return this.f3988a == idSyncConfig.f3988a && this.f3989b == idSyncConfig.f3989b && kotlin.jvm.internal.i.a(this.f3990c, idSyncConfig.f3990c);
    }

    public final boolean getEnabled() {
        return this.f3988a;
    }

    public final long getLaunchDelay() {
        return this.f3989b;
    }

    public final java.util.List<io.appmetrica.analytics.idsync.internal.model.RequestConfig> getRequests() {
        return this.f3990c;
    }

    public int hashCode() {
        return this.f3990c.hashCode() + ((java.lang.Long.hashCode(this.f3989b) + (java.lang.Boolean.hashCode(this.f3988a) * 31)) * 31);
    }

    public java.lang.String toString() {
        return "IdSyncConfig(enabled=" + this.f3988a + ", launchDelay=" + this.f3989b + ", requests=" + this.f3990c + ')';
    }
}
