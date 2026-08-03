package com.moloco.sdk.internal.services.events;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.internal.services.events.e f7272a;

    public c() {
        com.moloco.sdk.internal.services.events.e eVar;
        eVar = com.moloco.sdk.internal.services.events.d.f7273a;
        this.f7272a = eVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public void a(boolean z, boolean z2, java.lang.String appForegroundUrl, java.lang.String appBackgroundUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f7272a = new com.moloco.sdk.internal.services.events.e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean b() {
        return this.f7272a.h();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean c() {
        return this.f7272a.g();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public java.lang.String d() {
        return this.f7272a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public java.lang.String a() {
        return this.f7272a.e();
    }
}
