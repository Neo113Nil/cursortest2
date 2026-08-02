package Bl0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3979b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f3980c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3981d;

    public i0(long j11, String uuid, String eventName, Map eventData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f3978a = uuid;
        this.f3979b = eventName;
        this.f3980c = eventData;
        this.f3981d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f3978a, i0Var.f3978a) && Intrinsics.d(this.f3979b, i0Var.f3979b) && Intrinsics.d(this.f3980c, i0Var.f3980c) && this.f3981d == i0Var.f3981d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3981d) + D40.c.a(this.f3980c, G.g.a(this.f3978a.hashCode() * 31, 31, this.f3979b), 31);
    }

    public final String toString() {
        return "MigrationDtoVer2(uuid=" + ((Object) ("MetricsEventUuid(value=" + this.f3978a + ')')) + ", eventName=" + this.f3979b + ", eventData=" + this.f3980c + ", eventTimeStamp=" + this.f3981d + ')';
    }
}
