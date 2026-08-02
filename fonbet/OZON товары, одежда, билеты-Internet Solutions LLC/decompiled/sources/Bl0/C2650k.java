package Bl0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2650k {

    /* renamed from: a, reason: collision with root package name */
    public final String f3983a;

    /* renamed from: b, reason: collision with root package name */
    public final Al0.b f3984b;

    public C2650k(String uuid, Al0.b metricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f3983a = uuid;
        this.f3984b = metricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2650k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        C2650k c2650k = (C2650k) obj;
        return Intrinsics.d(this.f3983a, c2650k.f3983a) && Intrinsics.d(this.f3984b, c2650k.f3984b);
    }

    public final int hashCode() {
        return this.f3984b.hashCode() + (this.f3983a.hashCode() * 31);
    }
}
