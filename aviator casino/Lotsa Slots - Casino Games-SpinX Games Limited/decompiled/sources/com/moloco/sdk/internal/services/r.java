package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class r implements com.moloco.sdk.internal.services.q {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7310a;

    public r(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7310a = context;
    }

    @Override // com.moloco.sdk.internal.services.q
    public int a() {
        android.content.Intent registerReceiver = this.f7310a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 1);
        }
        return 1;
    }

    @Override // com.moloco.sdk.internal.services.q
    public int b() {
        android.content.Intent registerReceiver = this.f7310a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("scale", -1);
        }
        return -1;
    }

    @Override // com.moloco.sdk.internal.services.q
    public boolean c() {
        java.lang.Object systemService = this.f7310a.getSystemService("power");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isPowerSaveMode();
    }
}
