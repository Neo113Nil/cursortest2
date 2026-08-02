package com.paypal.oslo.feature.identity.shared.data.capability;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/capability/DeviceLockCapabilityCheckerImpl;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability;", "check", "()Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceLockCapabilityCheckerImpl implements com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DeviceLockCapabilityCheckerImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker
    public final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability check() {
        java.lang.Object systemService = this.getHighSpeedVideoFpsRanges.getSystemService("keyguard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        if (((android.app.KeyguardManager) systemService).isDeviceSecure()) {
            return com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.Available.INSTANCE;
        }
        return com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.NotConfigured.INSTANCE;
    }
}
