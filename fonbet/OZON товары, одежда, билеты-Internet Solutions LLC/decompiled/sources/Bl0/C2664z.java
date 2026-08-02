package Bl0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2664z {

    /* renamed from: a, reason: collision with root package name */
    public final String f4000a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4001b;

    public C2664z(String uuid, byte[] serializedMetricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(serializedMetricsEvent, "serializedMetricsEvent");
        this.f4000a = uuid;
        this.f4001b = serializedMetricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2664z.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        C2664z c2664z = (C2664z) obj;
        return Intrinsics.d(this.f4000a, c2664z.f4000a) && Arrays.equals(this.f4001b, c2664z.f4001b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4001b) + (this.f4000a.hashCode() * 31);
    }
}
