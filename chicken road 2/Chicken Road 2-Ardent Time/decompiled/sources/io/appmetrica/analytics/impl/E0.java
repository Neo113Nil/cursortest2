package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E0 implements io.appmetrica.analytics.impl.Ca {
    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.A6
    public final void a(int i2, android.os.Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void b(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.Ra c(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        return new io.appmetrica.analytics.impl.C0413hi();
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.X9 d() {
        return new io.appmetrica.analytics.impl.X9();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final java.lang.String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final java.util.Map<java.lang.String, java.lang.String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.AdvIdentifiersResult h() {
        io.appmetrica.analytics.AdvIdentifiersResult.Details details = io.appmetrica.analytics.AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new io.appmetrica.analytics.AdvIdentifiersResult(new io.appmetrica.analytics.AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new io.appmetrica.analytics.AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new io.appmetrica.analytics.AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.C0458jc i() {
        io.appmetrica.analytics.impl.C0821xc c0821xc = new io.appmetrica.analytics.impl.C0821xc();
        return new io.appmetrica.analytics.impl.C0458jc(c0821xc, new io.appmetrica.analytics.impl.C0842y7(c0821xc));
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(java.lang.String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(android.location.Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list) {
        startupParamsCallback.onRequestError(io.appmetrica.analytics.StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Ta
    public final io.appmetrica.analytics.impl.Sa a() {
        return new io.appmetrica.analytics.impl.C0490ki();
    }
}
