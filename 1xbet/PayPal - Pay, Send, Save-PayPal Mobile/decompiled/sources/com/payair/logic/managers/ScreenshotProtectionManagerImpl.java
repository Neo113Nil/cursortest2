package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/payair/logic/managers/ScreenshotProtectionManagerImpl;", "Lcom/payair/logic/managers/ScreenshotProtectionManager;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "Landroid/content/Context;", "context", "", "enableScreenshotProtection", "(Landroid/content/Context;)V", "disableScreenshotProtection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenshotProtectionManagerImpl implements com.payair.logic.managers.ScreenshotProtectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4450a;
    public final java.util.concurrent.atomic.AtomicBoolean b;

    public ScreenshotProtectionManagerImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4450a = hceSDKInterface;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.payair.logic.managers.ScreenshotProtectionManager
    public final void disableScreenshotProtection(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.b.compareAndSet(true, false)) {
            this.f4450a.disableScreenshotProtection(context);
        }
    }

    @Override // com.payair.logic.managers.ScreenshotProtectionManager
    public final void enableScreenshotProtection(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.b.compareAndSet(false, true)) {
            this.f4450a.enableScreenshotProtection(context);
        }
    }
}
