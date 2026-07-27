package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671ma implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0856te f7857a;

    public C0671ma() {
        this(new Wl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0916vm fromModel(C0820s4 c0820s4) {
        C0916vm c0916vm = new C0916vm();
        c0916vm.f8529b = c0820s4.f8283b;
        c0916vm.f8528a = c0820s4.f8282a;
        c0916vm.f8530c = c0820s4.f8284c;
        c0916vm.f8531d = c0820s4.f8285d;
        c0916vm.f8532e = c0820s4.f8286e;
        c0916vm.f = this.f7857a.a(c0820s4.f);
        return c0916vm;
    }

    public C0671ma(Wl wl) {
        this.f7857a = wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0820s4 toModel(C0916vm c0916vm) {
        C0769q4 c0769q4 = new C0769q4();
        c0769q4.f8114d = c0916vm.f8531d;
        c0769q4.f8113c = c0916vm.f8530c;
        c0769q4.f8112b = c0916vm.f8529b;
        c0769q4.f8111a = c0916vm.f8528a;
        c0769q4.f8115e = c0916vm.f8532e;
        c0769q4.f = this.f7857a.a(c0916vm.f);
        return new C0820s4(c0769q4);
    }
}
