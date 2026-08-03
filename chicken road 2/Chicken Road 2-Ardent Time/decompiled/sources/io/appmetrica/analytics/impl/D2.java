package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class D2 implements io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0752ul f4186a;

    public D2(io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul) {
        this.f4186a = interfaceC0752ul;
    }

    public abstract java.lang.String a(java.lang.String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(java.lang.String str, boolean z2) {
        return ((io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a).c(str, z2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(java.lang.String str, int i2) {
        return ((io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a).c(str, i2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(java.lang.String str, long j2) {
        return ((io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a).c(a(str), j2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return ((io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(java.lang.String str, boolean z2) {
        io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd = (io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a;
        ((io.appmetrica.analytics.impl.Xe) ((io.appmetrica.analytics.impl.InterfaceC0752ul) abstractC0848yd.b(abstractC0848yd.f(a(str)), z2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(java.lang.String str, int i2) {
        io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd = (io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a;
        ((io.appmetrica.analytics.impl.Xe) ((io.appmetrica.analytics.impl.InterfaceC0752ul) abstractC0848yd.b(abstractC0848yd.f(str), i2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(java.lang.String str, long j2) {
        io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd = (io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a;
        ((io.appmetrica.analytics.impl.Xe) ((io.appmetrica.analytics.impl.InterfaceC0752ul) abstractC0848yd.b(abstractC0848yd.f(a(str)), j2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd = (io.appmetrica.analytics.impl.AbstractC0848yd) this.f4186a;
        ((io.appmetrica.analytics.impl.Xe) ((io.appmetrica.analytics.impl.InterfaceC0752ul) abstractC0848yd.b(abstractC0848yd.f(a(str)), str2))).b();
    }
}
