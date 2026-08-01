package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Te;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class De implements Ee {

    /* renamed from: a, reason: collision with root package name */
    private final T9 f7601a = new T9();
    private final InterfaceC4673u7 b = Ib.v.d().a();

    @Override // com.ironsource.Ee
    public InterfaceC4673u7 a() {
        return this.b;
    }

    @Override // com.ironsource.Ee
    public void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void c(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().a(runnable);
    }

    @Override // com.ironsource.Ee
    public void d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void e() {
        com.ironsource.mediationsdk.p.g().H();
    }

    @Override // com.ironsource.Ee
    public void f() {
        Kd.c().a();
    }

    @Override // com.ironsource.Ee
    public T9 g() {
        return this.f7601a;
    }

    @Override // com.ironsource.Ee
    public void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.Ee
    public boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.f(context);
    }

    @Override // com.ironsource.Ee
    public String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String b = com.ironsource.mediationsdk.p.g().b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().getAdvertiserId(context)");
        return b;
    }

    @Override // com.ironsource.Ee
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.Ee
    public void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, com.ironsource.environment.thread.a.f8176a.a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void b() {
        Ib.v.d().q().a(new C4689v5(EnumC4707w5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ee
    public C4293aa c() {
        return com.ironsource.mediationsdk.p.g().m();
    }

    @Override // com.ironsource.Ee
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        I6.a().a(key, value);
    }

    @Override // com.ironsource.Ee
    public void a(long j, Te.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.g().a(j, responseOrigin);
    }

    @Override // com.ironsource.Ee
    public Te a(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.g().a(context, appKey);
    }

    @Override // com.ironsource.Ee
    public String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a2 = a().a(context);
        Intrinsics.checkNotNullExpressionValue(a2, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return a2;
    }

    @Override // com.ironsource.Ee
    public void a(D1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C4491k4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.Ee
    public void a(Be initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        Ce.f7585a.a(initStatus);
    }
}
