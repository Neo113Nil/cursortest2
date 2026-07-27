package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613k4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0992yl f7682a;

    public C0613k4(InterfaceC0992yl interfaceC0992yl) {
        this.f7682a = interfaceC0992yl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C0467ed(str, this.f7682a);
    }
}
