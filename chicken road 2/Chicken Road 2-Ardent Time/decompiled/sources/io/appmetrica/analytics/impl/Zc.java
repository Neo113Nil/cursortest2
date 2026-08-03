package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zc implements io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qj f5408a = io.appmetrica.analytics.impl.AbstractC0810x1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f5409b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(java.lang.String str, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.Qj qj = this.f5408a;
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.C0621pj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(java.lang.String str) {
        io.appmetrica.analytics.impl.Qj qj = this.f5408a;
        io.appmetrica.analytics.ModuleEvent build = io.appmetrica.analytics.ModuleEvent.newBuilder(this.f5409b).withName(str).build();
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(java.lang.String str, java.lang.String str2) {
        this.f5408a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        io.appmetrica.analytics.impl.Qj qj = this.f5408a;
        io.appmetrica.analytics.ModuleEvent build = io.appmetrica.analytics.ModuleEvent.newBuilder(this.f5409b).withName(str).withAttributes(map).build();
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.Qj qj = this.f5408a;
        io.appmetrica.analytics.ModuleEvent build = io.appmetrica.analytics.ModuleEvent.newBuilder(this.f5409b).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i2, java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.Qj qj = this.f5408a;
        io.appmetrica.analytics.ModuleEvent build = io.appmetrica.analytics.ModuleEvent.newBuilder(i2).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Fj(build));
    }
}
