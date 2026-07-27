package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519gd implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Vj f7373a = AbstractC0921w1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f7374b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        Vj vj = this.f7373a;
        vj.getClass();
        vj.a(new C0887uj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Vj vj = this.f7373a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7374b).withName(str).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f7373a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Vj vj = this.f7373a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7374b).withName(str).withAttributes(map).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Vj vj = this.f7373a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7374b).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i3, String str, String str2) {
        Vj vj = this.f7373a;
        ModuleEvent build = ModuleEvent.newBuilder(i3).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(build));
    }
}
