package Al0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f1243a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f1244b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1245c;

    public b(String eventName, Map<String, String> eventData, long j11) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f1243a = eventName;
        this.f1244b = eventData;
        this.f1245c = j11;
    }

    public final Map<String, String> a() {
        return this.f1244b;
    }

    public final String b() {
        return this.f1243a;
    }

    public final long c() {
        return this.f1245c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f1243a, bVar.f1243a) && Intrinsics.d(this.f1244b, bVar.f1244b);
    }

    public final int hashCode() {
        return this.f1244b.hashCode() + (this.f1243a.hashCode() * 31);
    }

    public final String toString() {
        return "MetricsEvent(eventName='" + this.f1243a + "', eventData=" + this.f1244b + ", eventTime=" + this.f1245c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String eventName, Map<String, String> eventData) {
        this(eventName, eventData, System.currentTimeMillis());
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
    }
}
