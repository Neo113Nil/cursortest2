package io.appmetrica.analytics;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3418a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.StartupParamsItemStatus f3419b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3420c;

    public StartupParamsItem(java.lang.String str, io.appmetrica.analytics.StartupParamsItemStatus startupParamsItemStatus, java.lang.String str2) {
        this.f3418a = str;
        this.f3419b = startupParamsItemStatus;
        this.f3420c = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.StartupParamsItem startupParamsItem = (io.appmetrica.analytics.StartupParamsItem) obj;
        return java.util.Objects.equals(this.f3418a, startupParamsItem.f3418a) && this.f3419b == startupParamsItem.f3419b && java.util.Objects.equals(this.f3420c, startupParamsItem.f3420c);
    }

    public java.lang.String getErrorDetails() {
        return this.f3420c;
    }

    public java.lang.String getId() {
        return this.f3418a;
    }

    public io.appmetrica.analytics.StartupParamsItemStatus getStatus() {
        return this.f3419b;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f3418a, this.f3419b, this.f3420c);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StartupParamsItem{id='");
        sb.append(this.f3418a);
        sb.append("', status=");
        sb.append(this.f3419b);
        sb.append(", errorDetails='");
        return B1.a.j(sb, this.f3420c, "'}");
    }
}
