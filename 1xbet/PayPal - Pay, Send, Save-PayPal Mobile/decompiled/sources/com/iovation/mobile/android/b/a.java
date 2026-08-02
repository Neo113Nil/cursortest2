package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class a implements com.iovation.mobile.android.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowManager f3926a;
    public boolean b;
    public final java.util.function.Consumer c;

    public a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.f3926a = (android.view.WindowManager) systemService;
        this.c = new java.util.function.Consumer() { // from class: com.iovation.mobile.android.b.a$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                com.iovation.mobile.android.b.a.a(com.iovation.mobile.android.b.a.this, (java.lang.Integer) obj);
            }
        };
    }

    public static final void a(com.iovation.mobile.android.b.a aVar, java.lang.Integer num) {
        if (num == null || num.intValue() != 1) {
            return;
        }
        aVar.b = true;
    }

    @Override // com.iovation.mobile.android.a.g
    public final void b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.DETECT_SCREEN_RECORDING", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.DETECT_SCREEN_RECORDING", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                this.c.accept(java.lang.Integer.valueOf(this.f3926a.addScreenRecordingCallback(context.getMainExecutor(), this.c)));
            }
        }
    }

    @Override // com.iovation.mobile.android.a.g
    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.DETECT_SCREEN_RECORDING", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.DETECT_SCREEN_RECORDING", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                this.f3926a.removeScreenRecordingCallback(this.c);
            }
        }
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "aadca0";
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.DETECT_SCREEN_RECORDING", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.DETECT_SCREEN_RECORDING", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                linkedHashMap.put("SCREENSHARE", java.lang.String.valueOf(this.b));
            }
        }
        return linkedHashMap;
    }
}
