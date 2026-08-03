package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qj implements io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.plugins.IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4870a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0387gi f4871b;

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(io.appmetrica.analytics.impl.Qn qn) {
        a(new io.appmetrica.analytics.impl.C0880zj(qn));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        a(new io.appmetrica.analytics.impl.Lj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final io.appmetrica.analytics.plugins.IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        a(new io.appmetrica.analytics.impl.C0724tj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        a(new io.appmetrica.analytics.impl.Kj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
        a(new io.appmetrica.analytics.impl.Aj(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
        a(new io.appmetrica.analytics.impl.Ij(map));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        a(new io.appmetrica.analytics.impl.C0828xj(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.Throwable th) {
        a(new io.appmetrica.analytics.impl.C0621pj(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str) {
        a(new io.appmetrica.analytics.impl.Nj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(io.appmetrica.analytics.Revenue revenue) {
        a(new io.appmetrica.analytics.impl.C0802wj(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(java.lang.Throwable th) {
        a(new io.appmetrica.analytics.impl.C0672rj(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile) {
        a(new io.appmetrica.analytics.impl.C0776vj(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        a(new io.appmetrica.analytics.impl.C0698sj());
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        a(new io.appmetrica.analytics.impl.Mj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        a(new io.appmetrica.analytics.impl.C0854yj(z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(java.lang.String str, byte[] bArr) {
        a(new io.appmetrica.analytics.impl.Gj(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(java.lang.String str) {
        a(new io.appmetrica.analytics.impl.C0750uj(str));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0369g0
    public final void a(io.appmetrica.analytics.impl.V v2) {
        a(new io.appmetrica.analytics.impl.Jj(v2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        a(new io.appmetrica.analytics.impl.Hj(adRevenue, z2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2) {
        a(new io.appmetrica.analytics.impl.C0647qj(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.lang.String str2) {
        a(new io.appmetrica.analytics.impl.Oj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        a(new io.appmetrica.analytics.impl.Bj(pluginErrorDetails));
    }

    public final void a(io.appmetrica.analytics.impl.Tj tj) {
        a(new io.appmetrica.analytics.impl.Ej(tj));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        a(new io.appmetrica.analytics.impl.C0647qj(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(new io.appmetrica.analytics.impl.Pj(str, map));
    }

    public final synchronized void a(io.appmetrica.analytics.impl.Qa qa) {
        try {
            if (this.f4871b == null) {
                this.f4870a.add(qa);
            } else {
                qa.a(this.f4871b);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        a(new io.appmetrica.analytics.impl.Cj(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent) {
        a(new io.appmetrica.analytics.impl.Fj(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        a(new io.appmetrica.analytics.impl.Dj(str, str2, pluginErrorDetails));
    }
}
