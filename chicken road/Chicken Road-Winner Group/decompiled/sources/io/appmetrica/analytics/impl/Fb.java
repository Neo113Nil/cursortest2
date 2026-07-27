package io.appmetrica.analytics.impl;

import d2.C0277g;
import d2.InterfaceC0273c;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* loaded from: classes.dex */
public final class Fb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f5940a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0273c f5941b = new C0277g(new Eb(this));

    public Fb(C0459e5 c0459e5) {
        this.f5940a = c0459e5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0756ph getConfig() {
        return (C0756ph) ((C0277g) this.f5941b).a();
    }
}
