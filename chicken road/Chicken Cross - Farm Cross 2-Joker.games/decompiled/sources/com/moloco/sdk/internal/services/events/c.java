package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public e f10793a;

    public c() {
        e eVar;
        eVar = d.f10794a;
        this.f10793a = eVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public void a(boolean z, boolean z2, String appForegroundUrl, String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f10793a = new e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean b() {
        return this.f10793a.h();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean c() {
        return this.f10793a.g();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String d() {
        return this.f10793a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String a() {
        return this.f10793a.e();
    }
}
