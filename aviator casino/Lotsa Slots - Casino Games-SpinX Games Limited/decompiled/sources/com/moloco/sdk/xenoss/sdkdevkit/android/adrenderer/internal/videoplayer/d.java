package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.Lifecycle f7950a;
    public final androidx.lifecycle.LifecycleEventObserver b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7951a;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f7951a = iArr;
        }
    }

    public d(androidx.lifecycle.Lifecycle lifecycle, final kotlin.jvm.functions.Function0<kotlin.Unit> onExoResume, final kotlin.jvm.functions.Function0<kotlin.Unit> onExoPause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExoResume, "onExoResume");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExoPause, "onExoPause");
        this.f7950a = lifecycle;
        androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d.a(kotlin.jvm.functions.Function0.this, onExoPause, lifecycleOwner, event);
            }
        };
        this.b = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }

    public static final void a(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d.a.f7951a[event.ordinal()];
        if (i == 1) {
            if (android.os.Build.VERSION.SDK_INT > 23) {
                function0.invoke();
            }
        } else if (i == 2) {
            if (android.os.Build.VERSION.SDK_INT <= 23) {
                function0.invoke();
            }
        } else if (i == 3) {
            if (android.os.Build.VERSION.SDK_INT <= 23) {
                function02.invoke();
            }
        } else if (i == 4 && android.os.Build.VERSION.SDK_INT > 23) {
            function02.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.f7950a.removeObserver(this.b);
    }
}
