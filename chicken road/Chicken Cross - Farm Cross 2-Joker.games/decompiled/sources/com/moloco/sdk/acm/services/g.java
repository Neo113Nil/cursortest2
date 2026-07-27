package com.moloco.sdk.acm.services;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10425a;
    public final Lazy b;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10425a = context;
        this.b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.acm.services.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(g.this);
            }
        });
    }

    public static final PowerManager a(g gVar) {
        Object systemService = gVar.f10425a.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean b() {
        return this.f10425a.getPackageManager().checkPermission("android.permission.USE_FULL_SCREEN_INTENT", this.f10425a.getPackageName()) == 0;
    }

    public final PowerManager c() {
        return (PowerManager) this.b.getValue();
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean a() {
        return c().isInteractive();
    }
}
