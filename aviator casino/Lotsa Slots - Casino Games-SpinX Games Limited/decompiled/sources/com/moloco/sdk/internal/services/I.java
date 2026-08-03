package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class I implements androidx.lifecycle.DefaultLifecycleObserver {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.analytics.a f7206a;
    public final com.moloco.sdk.internal.services.J b;
    public java.lang.Long c;
    public boolean d;

    public I(com.moloco.sdk.internal.services.analytics.a analyticsService, com.moloco.sdk.internal.services.J timeProviderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f7206a = analyticsService;
        this.b = timeProviderService;
    }

    public final void a() {
        this.d = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.lifecycle.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.C3437h.f7278a, "Application onStart", false, 4, null);
        java.lang.Long l = this.c;
        if (l != null) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.C3437h.f7278a, "Background event has been recorded, recording foreground", false, 4, null);
            this.f7206a.a(this.b.invoke(), l.longValue());
            this.c = null;
            this.d = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.C3437h.f7278a, "Application onStop", false, 4, null);
        if (this.d) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.C3437h.f7278a, "Tracking of event is true. Recording background", false, 4, null);
            long invoke = this.b.invoke();
            this.c = java.lang.Long.valueOf(invoke);
            this.f7206a.a(invoke);
        }
    }
}
