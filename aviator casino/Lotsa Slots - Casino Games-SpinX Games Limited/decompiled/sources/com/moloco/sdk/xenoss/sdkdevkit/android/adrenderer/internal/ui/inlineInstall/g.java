package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class g implements androidx.lifecycle.DefaultLifecycleObserver {
    public static boolean c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g f7628a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g();
    public static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> b = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
    public static final int d = 8;

    public final void a() {
        if (c) {
            return;
        }
        androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
        c = true;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> b() {
        return b;
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
        b.setValue(java.lang.Boolean.TRUE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        b.setValue(java.lang.Boolean.FALSE);
    }
}
