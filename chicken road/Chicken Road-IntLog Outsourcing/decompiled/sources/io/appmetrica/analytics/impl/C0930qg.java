package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930qg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9103a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0981sg f9104b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9105c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f9106d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9107e;

    public C0930qg(Context context, yo yoVar) {
        this.f9107e = context;
        this.f9106d = yoVar;
        this.f9104b = yoVar.b();
        this.f9105c = yoVar.c();
    }

    public final void a() {
        if (this.f9105c) {
            return;
        }
        Context context = this.f9107e;
        Va a6 = Ag.a(context, C1027ua.f9366H.f9377d.a());
        InterfaceC1111xg interfaceC1111xg = (InterfaceC1111xg) new C0748jg(this, new Ag(a6), new Ga(context), new Bg(context)).f8545f.getValue();
        try {
            a6.a(interfaceC1111xg);
        } catch (Throwable th) {
            interfaceC1111xg.a(th);
        }
    }

    public final synchronized void a(C1033ug c1033ug) {
        this.f9103a.add(c1033ug);
        if (this.f9105c) {
            c1033ug.a(this.f9104b);
        }
    }

    public final synchronized void a(C0981sg c0981sg) {
        Iterator it = this.f9103a.iterator();
        while (it.hasNext()) {
            ((C1033ug) it.next()).a(c0981sg);
        }
    }
}
