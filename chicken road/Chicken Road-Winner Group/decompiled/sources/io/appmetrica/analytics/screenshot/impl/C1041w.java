package io.appmetrica.analytics.screenshot.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041w implements InterfaceC1028i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9076a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9077b;

    public C1041w(ClientContext clientContext, U u3) {
        this.f9076a = clientContext;
        this.f9077b = u3;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1028i
    public final List<T> a() {
        return AbstractC0293h.S(new C1023d(this.f9076a, this.f9077b), new C1040v(this.f9076a, this.f9077b), new g0(this.f9076a, this.f9077b));
    }
}
