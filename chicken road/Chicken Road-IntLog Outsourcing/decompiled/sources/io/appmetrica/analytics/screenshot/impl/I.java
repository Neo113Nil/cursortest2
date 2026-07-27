package io.appmetrica.analytics.screenshot.impl;

import g4.AbstractC0466k;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements InterfaceC1177i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9967a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9968b;

    public I(ClientContext clientContext, U u5) {
        this.f9967a = clientContext;
        this.f9968b = u5;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1177i
    public final List<T> a() {
        return AbstractC0466k.A0(new C1189v(this.f9967a, this.f9968b), new g0(this.f9967a, this.f9968b));
    }
}
