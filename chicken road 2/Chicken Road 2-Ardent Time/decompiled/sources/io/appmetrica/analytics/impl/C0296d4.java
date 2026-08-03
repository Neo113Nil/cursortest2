package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296d4 implements io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0752ul f5693a;

    public C0296d4(io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul) {
        this.f5693a = interfaceC0752ul;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Xc(str, this.f5693a);
    }
}
