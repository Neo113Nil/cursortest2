package io.appmetrica.analytics;

import java.util.Objects;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f1554a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f1555b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1556c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f1554a = str;
        this.f1555b = startupParamsItemStatus;
        this.f1556c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f1554a, startupParamsItem.f1554a) && this.f1555b == startupParamsItem.f1555b && Objects.equals(this.f1556c, startupParamsItem.f1556c);
    }

    public String getErrorDetails() {
        return this.f1556c;
    }

    public String getId() {
        return this.f1554a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f1555b;
    }

    public int hashCode() {
        return Objects.hash(this.f1554a, this.f1555b, this.f1556c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f1554a);
        sb.append("', status=");
        sb.append(this.f1555b);
        sb.append(", errorDetails='");
        return AbstractC0819i.b(sb, this.f1556c, "'}");
    }
}
