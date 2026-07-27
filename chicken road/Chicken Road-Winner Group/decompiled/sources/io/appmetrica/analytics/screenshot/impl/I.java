package io.appmetrica.analytics.screenshot.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements InterfaceC1028i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f8986a;

    /* renamed from: b, reason: collision with root package name */
    public final U f8987b;

    public I(ClientContext clientContext, U u3) {
        this.f8986a = clientContext;
        this.f8987b = u3;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1028i
    public final List<T> a() {
        return AbstractC0293h.S(new C1040v(this.f8986a, this.f8987b), new g0(this.f8986a, this.f8987b));
    }
}
