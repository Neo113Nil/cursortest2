package Bl0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f3929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3930b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3931c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3932d;

    /* renamed from: e, reason: collision with root package name */
    public final Al0.b f3933e;

    public L(String packageName, String uuid, String userId, String str, Al0.b metricsEvent) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f3929a = packageName;
        this.f3930b = uuid;
        this.f3931c = userId;
        this.f3932d = str;
        this.f3933e = metricsEvent;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (!L.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto");
        L l11 = (L) obj;
        if (!Intrinsics.d(this.f3929a, l11.f3929a) || !Intrinsics.d(this.f3930b, l11.f3930b) || !Intrinsics.d(this.f3931c, l11.f3931c)) {
            return false;
        }
        String str = this.f3932d;
        String str2 = l11.f3932d;
        if (str == null) {
            if (str2 == null) {
                equals = true;
            }
            equals = false;
        } else {
            if (str2 != null) {
                equals = str.equals(str2);
            }
            equals = false;
        }
        return equals && Intrinsics.d(this.f3933e, l11.f3933e);
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(this.f3929a.hashCode() * 31, 31, this.f3930b), 31, this.f3931c);
        String str = this.f3932d;
        C2648i c2648i = str != null ? new C2648i(str) : null;
        return this.f3933e.hashCode() + ((a11 + (c2648i != null ? c2648i.f3977a.hashCode() : 0)) * 31);
    }
}
