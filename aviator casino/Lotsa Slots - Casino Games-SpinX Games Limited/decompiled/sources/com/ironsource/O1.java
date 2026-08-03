package com.ironsource;

/* loaded from: classes5.dex */
public class O1 implements com.ironsource.InterfaceC3129k7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.E7 f5866a;
    private com.ironsource.P1 b;

    public static final class a {
        public final com.ironsource.P1 a(com.ironsource.M1 m1, com.ironsource.E7 featureAvailabilityService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (m1 != null ? java.lang.Boolean.valueOf(m1.k()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                com.ironsource.C3065ge.i().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
            }
            if (m1 != null && m1.k() && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new com.ironsource.C3356x1() : new com.ironsource.S7();
        }
    }

    public O1(com.ironsource.E7 featureAvailabilityService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f5866a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC3129k7
    public void a(com.ironsource.M1 m1) {
        if (this.b == null) {
            this.b = new com.ironsource.O1.a().a(m1, this.f5866a);
        }
    }

    @Override // com.ironsource.P1
    public void b(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.P1 p1 = this.b;
        if (p1 != null) {
            p1.b(observer);
        }
    }

    @Override // com.ironsource.P1
    public void a(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.P1 p1 = this.b;
        if (p1 != null) {
            p1.a(observer);
        }
    }
}
