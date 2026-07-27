package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d4 implements qg {
    public static final d4 b = new d4();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg f4723a = new rg();

    @Override // com.chartboost.sdk.impl.qg
    public Application a() {
        return this.f4723a.a();
    }

    public String b() {
        return this.f4723a.b();
    }

    public String c() {
        return this.f4723a.c();
    }

    public boolean d() {
        return this.f4723a.d();
    }

    public boolean e() {
        return this.f4723a.e();
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4723a.a(context);
    }

    public void a(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.f4723a.a(appId, appSignature);
    }
}
