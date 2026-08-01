package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rg implements qg {

    /* renamed from: a, reason: collision with root package name */
    public volatile String f4998a;
    public volatile String b;
    public volatile Application c;

    @Override // com.chartboost.sdk.impl.qg
    public Application a() {
        Application application = this.c;
        if (application != null) {
            return application;
        }
        mb.b("Missing application. Cannot start Chartboost SDK.", (Throwable) null, 2, (Object) null);
        throw new c4();
    }

    public String b() {
        String str = this.f4998a;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        String str;
        String str2 = this.f4998a;
        return (str2 == null || str2.length() == 0 || (str = this.b) == null || str.length() == 0) ? false : true;
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            mb.b("Failed to initialize Chartboost SDK. Application is null.", (Throwable) null, 2, (Object) null);
            return;
        }
        this.c = application;
        try {
            InterruptionController.a(InterruptionController.f5128a, a(), null, 2, null);
            mb.c("InterruptionController initialized.", null, 2, null);
        } catch (Exception e) {
            mb.b("Error initializing InterruptionController.", e);
        }
    }

    public void a(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.f4998a = appId;
        this.b = appSignature;
    }
}
