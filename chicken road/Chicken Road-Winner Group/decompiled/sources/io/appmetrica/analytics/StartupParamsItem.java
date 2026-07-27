package io.appmetrica.analytics;

import B0.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f5121a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f5122b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5123c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f5121a = str;
        this.f5122b = startupParamsItemStatus;
        this.f5123c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f5121a, startupParamsItem.f5121a) && this.f5122b == startupParamsItem.f5122b && Objects.equals(this.f5123c, startupParamsItem.f5123c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f5123c;
    }

    public String getId() {
        return this.f5121a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f5122b;
    }

    public int hashCode() {
        return Objects.hash(this.f5121a, this.f5122b, this.f5123c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f5121a);
        sb.append("', status=");
        sb.append(this.f5122b);
        sb.append(", errorDetails='");
        return c.l(sb, this.f5123c, "'}");
    }
}
