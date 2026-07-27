package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final C3639d0 f6960a;
    public final C3922n0 b;

    public Y(C3639d0 adLifecycleData, C3922n0 adManagerTelemetryHelper) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(adManagerTelemetryHelper, "adManagerTelemetryHelper");
        this.f6960a = adLifecycleData;
        this.b = adManagerTelemetryHelper;
    }

    public final void a(X adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        if (adFetchEvent instanceof C3735gc) {
            C3639d0 c3639d0 = this.f6960a;
            c3639d0.getClass();
            c3639d0.b = SystemClock.elapsedRealtime();
        } else if (adFetchEvent instanceof Mg) {
            C3639d0 c3639d02 = this.f6960a;
            c3639d02.getClass();
            c3639d02.f = SystemClock.elapsedRealtime();
        } else {
            if (!(adFetchEvent instanceof C4221xk)) {
                throw new NoWhenBranchMatchedException();
            }
            C3922n0 c3922n0 = this.b;
            Map payload = ((C4221xk) adFetchEvent).f7482a;
            c3922n0.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3864l0(c3922n0, payload, null), 3, null);
        }
    }
}
