package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820ma implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1005te f8784a;

    public C0820ma() {
        this(new Wl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1065vm fromModel(C0969s4 c0969s4) {
        C1065vm c1065vm = new C1065vm();
        c1065vm.f9484b = c0969s4.f9229b;
        c1065vm.f9483a = c0969s4.f9228a;
        c1065vm.f9485c = c0969s4.f9230c;
        c1065vm.f9486d = c0969s4.f9231d;
        c1065vm.f9487e = c0969s4.f9232e;
        c1065vm.f9488f = this.f8784a.a(c0969s4.f9233f);
        return c1065vm;
    }

    public C0820ma(Wl wl) {
        this.f8784a = wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0969s4 toModel(C1065vm c1065vm) {
        C0918q4 c0918q4 = new C0918q4();
        c0918q4.f9052d = c1065vm.f9486d;
        c0918q4.f9051c = c1065vm.f9485c;
        c0918q4.f9050b = c1065vm.f9484b;
        c0918q4.f9049a = c1065vm.f9483a;
        c0918q4.f9053e = c1065vm.f9487e;
        c0918q4.f9054f = this.f8784a.a(c1065vm.f9488f);
        return new C0969s4(c0918q4);
    }
}
