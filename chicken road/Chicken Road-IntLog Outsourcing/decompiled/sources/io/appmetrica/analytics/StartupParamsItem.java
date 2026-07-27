package io.appmetrica.analytics;

import b2.AbstractC0279e;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f5926a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f5927b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5928c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f5926a = str;
        this.f5927b = startupParamsItemStatus;
        this.f5928c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f5926a, startupParamsItem.f5926a) && this.f5927b == startupParamsItem.f5927b && Objects.equals(this.f5928c, startupParamsItem.f5928c);
    }

    public String getErrorDetails() {
        return this.f5928c;
    }

    public String getId() {
        return this.f5926a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f5927b;
    }

    public int hashCode() {
        return Objects.hash(this.f5926a, this.f5927b, this.f5928c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f5926a);
        sb.append("', status=");
        sb.append(this.f5927b);
        sb.append(", errorDetails='");
        return AbstractC0279e.h(sb, this.f5928c, "'}");
    }
}
