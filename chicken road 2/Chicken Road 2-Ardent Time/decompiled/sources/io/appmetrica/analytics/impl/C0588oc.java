package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588oc implements io.appmetrica.analytics.impl.InterfaceC0488kg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0614pc f6582a;

    public C0588oc(io.appmetrica.analytics.impl.C0614pc c0614pc) {
        this.f6582a = c0614pc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0488kg
    public final void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        if (c0566ng == null) {
            return;
        }
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", "", 0);
        p5.setValueBytes(c0566ng.a());
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 4097;
        this.f6582a.a(p5);
    }
}
