package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041gs {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13666a;

    /* renamed from: b, reason: collision with root package name */
    public final Qw f13667b;

    /* renamed from: c, reason: collision with root package name */
    public final Rw f13668c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.m f13669d;

    /* renamed from: e, reason: collision with root package name */
    public final C0906ds f13670e;
    public final Nr f;

    public C1041gs(Context context, Qw qw, Rw rw, U2.m mVar, C0906ds c0906ds, Nr nr) {
        this.f13666a = context;
        this.f13667b = qw;
        this.f13668c = rw;
        this.f13669d = mVar;
        this.f13670e = c0906ds;
        this.f = nr;
    }

    public final E3.a a(String str, A0.J0 j02) {
        Qw qw = this.f13668c;
        if (j02 != null) {
            try {
                return new m2.g((U2.i) j02.f304k, this.f13669d, qw, this.f13670e, 14, false).B(1, 0L, str);
            } catch (NullPointerException | RejectedExecutionException unused) {
                return AbstractC1400ot.c0(U2.l.f5882l);
            }
        }
        return ((C0606Hd) qw).d(new A4(10, this, str));
    }

    public final void b(String str, A0.J0 j02, Mr mr) {
        boolean a5 = Nr.a();
        Qw qw = this.f13667b;
        if (!a5 || !((Boolean) AbstractC0834c8.f12978d.s()).booleanValue()) {
            qw.execute(new RunnableC1029gg(this, str, j02, 1));
            return;
        }
        Jr j5 = AbstractC1668us.j(this.f13666a, 14);
        j5.e();
        E3.a a6 = a(str, j02);
        a6.a(new Kw(0, a6, new C0905dr(this, j5, mr, 26)), qw);
    }

    public final void c(List list, A0.J0 j02) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), j02, null);
        }
    }
}
