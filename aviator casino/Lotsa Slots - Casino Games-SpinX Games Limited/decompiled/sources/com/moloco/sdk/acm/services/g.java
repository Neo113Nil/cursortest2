package com.moloco.sdk.acm.services;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.acm.services.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6922a;
    public final kotlin.Lazy b;

    public g(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6922a = context;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.acm.services.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.acm.services.g.a(com.moloco.sdk.acm.services.g.this);
            }
        });
    }

    public static final android.os.PowerManager a(com.moloco.sdk.acm.services.g gVar) {
        java.lang.Object systemService = gVar.f6922a.getSystemService("power");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (android.os.PowerManager) systemService;
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean b() {
        return this.f6922a.getPackageManager().checkPermission("android.permission.USE_FULL_SCREEN_INTENT", this.f6922a.getPackageName()) == 0;
    }

    public final android.os.PowerManager c() {
        return (android.os.PowerManager) this.b.getValue();
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean a() {
        return c().isInteractive();
    }
}
