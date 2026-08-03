package com.inmobi.media;

/* loaded from: classes5.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2313c0 f5041a;
    public final com.inmobi.media.C2576m0 b;

    public X(com.inmobi.media.C2313c0 adLifecycleData, com.inmobi.media.C2576m0 adManagerTelemetryHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerTelemetryHelper, "adManagerTelemetryHelper");
        this.f5041a = adLifecycleData;
        this.b = adManagerTelemetryHelper;
    }

    public final void a(com.inmobi.media.W adFetchEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        if (adFetchEvent instanceof com.inmobi.media.C2641ob) {
            com.inmobi.media.C2313c0 c2313c0 = this.f5041a;
            c2313c0.getClass();
            c2313c0.b = android.os.SystemClock.elapsedRealtime();
        } else if (adFetchEvent instanceof com.inmobi.media.Qf) {
            com.inmobi.media.C2313c0 c2313c02 = this.f5041a;
            c2313c02.getClass();
            c2313c02.f = android.os.SystemClock.elapsedRealtime();
        } else {
            if (!(adFetchEvent instanceof com.inmobi.media.C2334cj)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.inmobi.media.C2576m0 c2576m0 = this.b;
            java.util.Map payload = ((com.inmobi.media.C2334cj) adFetchEvent).f5144a;
            c2576m0.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2523k0(c2576m0, payload, null), 3, null);
        }
    }
}
