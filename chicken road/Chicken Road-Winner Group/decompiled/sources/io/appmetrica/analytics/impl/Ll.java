package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ll {

    /* renamed from: a, reason: collision with root package name */
    public final C0930wa f6249a = new C0930wa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6250b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0605jm f6251c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Jl f6252d = new Jl(this);

    public static final Ll a() {
        return Kl.f6195a;
    }

    public final Em a(Context context, X4 x4, C0451dm c0451dm) {
        Em em = (Em) this.f6250b.get(x4.f6822a);
        boolean z3 = true;
        if (em == null) {
            synchronized (this.f6250b) {
                try {
                    em = (Em) this.f6250b.get(x4.f6822a);
                    if (em == null) {
                        em = new Em(new Fm(context, x4.f6822a, c0451dm, this.f6252d));
                        em.f();
                        this.f6250b.put(x4.f6822a, em);
                        z3 = false;
                    }
                } finally {
                }
            }
        }
        if (z3) {
            em.a(c0451dm);
        }
        return em;
    }

    public final void a(X4 x4, Ul ul) {
        synchronized (this.f6250b) {
            try {
                this.f6249a.a(x4.f6822a, ul);
                C0605jm c0605jm = this.f6251c;
                if (c0605jm != null) {
                    ul.a(c0605jm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
