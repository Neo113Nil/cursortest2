package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes.dex */
public abstract class L2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0992yl f6204a;

    public L2(InterfaceC0992yl interfaceC0992yl) {
        this.f6204a = interfaceC0992yl;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z3) {
        return ((Fd) this.f6204a).c(str, z3);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i3) {
        return ((Fd) this.f6204a).c(str, i3);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j3) {
        return ((Fd) this.f6204a).c(a(str), j3);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((Fd) this.f6204a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z3) {
        Fd fd = (Fd) this.f6204a;
        ((AbstractC0418cf) ((InterfaceC0992yl) fd.b(fd.f(a(str)), z3))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i3) {
        Fd fd = (Fd) this.f6204a;
        ((AbstractC0418cf) ((InterfaceC0992yl) fd.b(fd.f(str), i3))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j3) {
        Fd fd = (Fd) this.f6204a;
        ((AbstractC0418cf) ((InterfaceC0992yl) fd.b(fd.f(a(str)), j3))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        Fd fd = (Fd) this.f6204a;
        ((AbstractC0418cf) ((InterfaceC0992yl) fd.b(fd.f(a(str)), str2))).b();
    }
}
