package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959f {

    /* renamed from: n, reason: collision with root package name */
    public static final DH f13392n = new DH();

    /* renamed from: a, reason: collision with root package name */
    public final C0825c f13393a;

    /* renamed from: b, reason: collision with root package name */
    public final C1004g f13394b;

    /* renamed from: c, reason: collision with root package name */
    public final C1182k f13395c;

    /* renamed from: d, reason: collision with root package name */
    public final C0914e f13396d;

    /* renamed from: e, reason: collision with root package name */
    public final C1761wv f13397e;
    public final Fx f;

    /* renamed from: g, reason: collision with root package name */
    public final Nm f13398g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f13399h;
    public C1019gE i;

    /* renamed from: j, reason: collision with root package name */
    public C1439pn f13400j;

    /* renamed from: k, reason: collision with root package name */
    public Pair f13401k;

    /* renamed from: l, reason: collision with root package name */
    public int f13402l;

    /* renamed from: m, reason: collision with root package name */
    public int f13403m;

    public C0959f(EH eh) {
        C0825c c0825c = new C0825c(this, eh.f8505a);
        this.f13393a = c0825c;
        Nm nm = eh.f;
        this.f13398g = nm;
        C1004g c1004g = eh.f8506b;
        this.f13394b = c1004g;
        c1004g.f13544k = nm;
        C1182k c1182k = new C1182k(new Er(10, this), c1004g);
        this.f13395c = c1182k;
        C0914e c0914e = eh.f8508d;
        AbstractC1668us.F(c0914e);
        this.f13396d = c0914e;
        this.f13397e = eh.f8509e;
        Fx fx = new Fx();
        fx.f9145m = c1004g;
        fx.f9143k = c1182k;
        fx.f9144l = new C1407p(new C1649uH());
        this.f = fx;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f13399h = copyOnWriteArraySet;
        this.f13403m = 0;
        new C1407p(new C1649uH());
        copyOnWriteArraySet.add(c0825c);
    }

    public static void a(C0959f c0959f, long j5, long j6) {
        Fx fx = c0959f.f;
        fx.getClass();
        try {
            ((C1182k) fx.f9143k).a(j5, j6);
        } catch (XD e3) {
            throw new r(e3, (C1407p) fx.f9144l);
        }
    }
}
