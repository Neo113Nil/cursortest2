package Bl0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3958b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f3959c;

    public a0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f3957a, a0Var.f3957a) && Intrinsics.d(this.f3958b, a0Var.f3958b) && Intrinsics.d(this.f3959c, a0Var.f3959c);
    }

    public final int hashCode() {
        return this.f3959c.hashCode() + G.g.a(this.f3957a.hashCode() * 31, 31, this.f3958b);
    }

    public final String toString() {
        return "MigrationDtoVer1(uuid=" + ((Object) ("MetricsEventUuid(value=" + this.f3957a + ')')) + ", eventName=" + this.f3958b + ", eventData=" + this.f3959c + ')';
    }

    public a0(String uuid, String eventName, Map eventData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f3957a = uuid;
        this.f3958b = eventName;
        this.f3959c = eventData;
    }
}
