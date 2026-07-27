package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class M1 implements InterfaceC4441h7 {

    /* renamed from: a, reason: collision with root package name */
    private final B7 f7759a;
    private N1 b;

    public static final class a {
        public final N1 a(K1 k1, B7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k1 != null ? Boolean.valueOf(k1.l()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                C4412fe.i().a(new C4689v5(EnumC4707w5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((k1 != null ? k1.l() : false) && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C4685v1() : new Q7();
        }
    }

    public M1(B7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f7759a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC4441h7
    public void a(K1 k1) {
        if (this.b == null) {
            this.b = new a().a(k1, this.f7759a);
        }
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        N1 n1 = this.b;
        if (n1 != null) {
            n1.b(observer);
        }
    }

    @Override // com.ironsource.N1
    public void a(InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        N1 n1 = this.b;
        if (n1 != null) {
            n1.a(observer);
        }
    }
}
