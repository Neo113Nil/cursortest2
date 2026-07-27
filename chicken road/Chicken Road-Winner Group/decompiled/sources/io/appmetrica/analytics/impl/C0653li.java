package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653li implements Ya {

    /* renamed from: a, reason: collision with root package name */
    public final C0946x0 f7815a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f7816b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f7817c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7818d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f7819e;
    public final C0912vi f;

    /* renamed from: g, reason: collision with root package name */
    public final Te f7820g;

    public C0653li(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C0946x0());
    }

    public static Ya a(C0946x0 c0946x0, Context context, ReporterConfig reporterConfig) {
        c0946x0.getClass();
        return C0920w0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0575ii(this));
    }

    public final void d(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Yh(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f7820g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Qh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0550hi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f7816b.f5948h.a(adRevenue);
        this.f.getClass();
        this.f7817c.execute(new Uh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f7816b.f5950j.a(map);
        this.f.getClass();
        this.f7817c.execute(new RunnableC0472ei(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f7816b.f5949i.a(eCommerceEvent);
        this.f.getClass();
        this.f7817c.execute(new Wh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f7816b.f5943b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        this.f7817c.execute(new Mh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f7816b.f5942a.a(str);
        this.f.getClass();
        this.f7817c.execute(new RunnableC0601ji(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f7816b.f5947g.a(revenue);
        this.f.getClass();
        this.f7817c.execute(new Th(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f7816b.f5946e.a(th);
        this.f.getClass();
        this.f7817c.execute(new Oh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f7816b.f.a(userProfile);
        this.f.getClass();
        this.f7817c.execute(new Sh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Ph(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0524gi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z3) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Xh(this, z3));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0395bi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Rh(this, str));
    }

    public C0653li(Context context, String str, C0946x0 c0946x0) {
        this(context, new Fh(), c0946x0, new C0912vi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0388bb
    public final void a(Sn sn) {
        this.f7816b.f5945d.a(sn);
        this.f.getClass();
        this.f7817c.execute(new RunnableC0447di(this, sn));
    }

    public C0653li(Context context, Fh fh, C0946x0 c0946x0, C0912vi c0912vi, ReporterConfig reporterConfig) {
        this(context, fh, c0946x0, c0912vi, reporterConfig, new Te(new Vh(c0946x0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z3) {
        this.f7816b.f5948h.a(adRevenue);
        this.f.getClass();
        this.f7817c.execute(new RunnableC0421ci(this, adRevenue, z3));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f7816b.f5942a.a(str);
        this.f.getClass();
        this.f7817c.execute(new RunnableC0627ki(this, str, str2));
    }

    public C0653li(Context context, Fh fh, C0946x0 c0946x0, C0912vi c0912vi, ReporterConfig reporterConfig, Te te) {
        this.f7817c = C0587j4.l().g().a();
        this.f7818d = context;
        this.f7816b = fh;
        this.f7815a = c0946x0;
        this.f = c0912vi;
        this.f7819e = reporterConfig;
        this.f7820g = te;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f7816b.f5944c.a(str);
        this.f.getClass();
        this.f7817c.execute(new Nh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0506g0
    public final void a(V v3) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0498fi(this, v3));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f7816b.f5942a.a(str);
        this.f.getClass();
        this.f7817c.execute(new Lh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new Zh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f7816b.getClass();
        this.f.getClass();
        this.f7817c.execute(new RunnableC0369ai(this, moduleEvent));
    }
}
