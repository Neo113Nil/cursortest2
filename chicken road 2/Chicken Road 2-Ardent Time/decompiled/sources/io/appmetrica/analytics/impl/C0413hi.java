package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0413hi implements io.appmetrica.analytics.impl.Ra {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Pe f6056a = new io.appmetrica.analytics.impl.Pe();

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(io.appmetrica.analytics.impl.Qn qn) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final io.appmetrica.analytics.plugins.IPluginReporter getPluginExtension() {
        return this.f6056a;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(io.appmetrica.analytics.Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(java.lang.Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(java.lang.String str, byte[] bArr) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(java.lang.String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0369g0
    public final void a(io.appmetrica.analytics.impl.V v2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
    }
}
