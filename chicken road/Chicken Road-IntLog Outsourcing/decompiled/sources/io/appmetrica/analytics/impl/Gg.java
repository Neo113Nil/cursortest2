package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Gg implements Ul, Na {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6839a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f6840b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4 f6841c;

    /* renamed from: d, reason: collision with root package name */
    public final Em f6842d;

    /* renamed from: e, reason: collision with root package name */
    public final Wa f6843e;

    public Gg(Context context, X4 x42, C1073w4 c1073w4, InterfaceC0634f5 interfaceC0634f5, Y4 y42, Ll ll) {
        this.f6839a = context;
        this.f6840b = x42;
        this.f6841c = y42;
        Em a6 = ll.a(context, x42, c1073w4.f9497a);
        this.f6842d = a6;
        this.f6843e = interfaceC0634f5.a(context, x42, c1073w4.f9498b, a6);
        ll.a(x42, this);
    }

    public final X4 a() {
        return this.f6840b;
    }

    public final Context b() {
        return this.f6839a;
    }

    public final void a(InterfaceC0814m4 interfaceC0814m4) {
        this.f6841c.f7724a.add(interfaceC0814m4);
    }

    public final void b(InterfaceC0814m4 interfaceC0814m4) {
        this.f6841c.f7724a.remove(interfaceC0814m4);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0754jm c0754jm) {
        ((C0608e5) this.f6843e).a(c0754jm);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0754jm c0754jm) {
        ((C0608e5) this.f6843e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C1073w4 c1073w4) {
        this.f6842d.a(c1073w4.f9497a);
        this.f6843e.a(c1073w4.f9498b);
    }

    public Gg(Context context, X4 x42, C1073w4 c1073w4, InterfaceC0634f5 interfaceC0634f5) {
        this(context, x42, c1073w4, interfaceC0634f5, new Y4(), Ll.a());
    }

    public final void a(W5 w5, C1073w4 c1073w4) {
        if (!D9.f6672c.contains(EnumC0718ib.a(w5.f7651d))) {
            this.f6843e.a(c1073w4.f9498b);
        }
        ((C0608e5) this.f6843e).a(w5);
    }
}
