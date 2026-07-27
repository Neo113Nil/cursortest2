package io.appmetrica.analytics.impl;

import android.content.Context;
import d2.C0277g;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781qg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8160a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0832sg f8161b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8162c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f8163d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8164e;

    public C0781qg(Context context, yo yoVar) {
        this.f8164e = context;
        this.f8163d = yoVar;
        this.f8161b = yoVar.b();
        this.f8162c = yoVar.c();
    }

    public final void a() {
        if (this.f8162c) {
            return;
        }
        Context context = this.f8164e;
        Va a3 = Ag.a(context, C0878ua.f8414H.f8425d.a());
        InterfaceC0962xg interfaceC0962xg = (InterfaceC0962xg) ((C0277g) new C0599jg(this, new Ag(a3), new Ga(context), new Bg(context)).f).a();
        try {
            a3.a(interfaceC0962xg);
        } catch (Throwable th) {
            interfaceC0962xg.a(th);
        }
    }

    public final synchronized void a(C0884ug c0884ug) {
        this.f8160a.add(c0884ug);
        if (this.f8162c) {
            c0884ug.a(this.f8161b);
        }
    }

    public final synchronized void a(C0832sg c0832sg) {
        Iterator it = this.f8160a.iterator();
        while (it.hasNext()) {
            ((C0884ug) it.next()).a(c0832sg);
        }
    }
}
