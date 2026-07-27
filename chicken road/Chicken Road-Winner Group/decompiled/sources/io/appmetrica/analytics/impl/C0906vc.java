package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906vc implements InterfaceC0755pg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0932wc f8509a;

    public C0906vc(C0932wc c0932wc) {
        this.f8509a = c0932wc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0755pg
    public final void a(C0832sg c0832sg) {
        if (c0832sg == null) {
            return;
        }
        W5 w5 = new W5("", "", 0);
        w5.setValueBytes(c0832sg.a());
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 4097;
        this.f8509a.a(w5);
    }
}
