package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class A3 implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final E3 f7519k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7520l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7521m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7522n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7523o;

    /* renamed from: p, reason: collision with root package name */
    public final B3 f7524p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f7525q;

    /* renamed from: r, reason: collision with root package name */
    public Q2.C0 f7526r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7527s;

    /* renamed from: t, reason: collision with root package name */
    public C1456q3 f7528t;

    /* renamed from: u, reason: collision with root package name */
    public m2.g f7529u;

    /* renamed from: v, reason: collision with root package name */
    public final E.H0 f7530v;

    public A3(int i, String str, B3 b3) {
        Uri parse;
        String host;
        this.f7519k = E3.f8456c ? new E3() : null;
        this.f7523o = new Object();
        int i5 = 0;
        this.f7527s = false;
        this.f7528t = null;
        this.f7520l = i;
        this.f7521m = str;
        this.f7524p = b3;
        E.H0 h02 = new E.H0();
        h02.f1041a = 2500;
        this.f7530v = h02;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i5 = host.hashCode();
        }
        this.f7522n = i5;
    }

    public abstract P.W a(C1815y3 c1815y3);

    public final String b() {
        int i = this.f7520l;
        String str = this.f7521m;
        return i != 0 ? AbstractC0467k.v(Integer.toString(1), "-", str) : str;
    }

    public Map c() {
        return Collections.EMPTY_MAP;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7525q.intValue() - ((A3) obj).f7525q.intValue();
    }

    public final void d(String str) {
        if (E3.f8456c) {
            this.f7519k.a(str, Thread.currentThread().getId());
        }
    }

    public abstract void e(Object obj);

    public final void f(String str) {
        Q2.C0 c02 = this.f7526r;
        if (c02 != null) {
            synchronized (((HashSet) c02.f4903b)) {
                ((HashSet) c02.f4903b).remove(this);
            }
            synchronized (((ArrayList) c02.i)) {
                Iterator it = ((ArrayList) c02.i).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            c02.h();
        }
        if (E3.f8456c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1317n(this, str, id));
            } else {
                this.f7519k.a(str, id);
                this.f7519k.b(toString());
            }
        }
    }

    public final void g() {
        m2.g gVar;
        synchronized (this.f7523o) {
            gVar = this.f7529u;
        }
        if (gVar != null) {
            gVar.q(this);
        }
    }

    public final void h(P.W w5) {
        m2.g gVar;
        synchronized (this.f7523o) {
            gVar = this.f7529u;
        }
        if (gVar != null) {
            gVar.v(this, w5);
        }
    }

    public final void i() {
        Q2.C0 c02 = this.f7526r;
        if (c02 != null) {
            c02.h();
        }
    }

    public final void j(m2.g gVar) {
        synchronized (this.f7523o) {
            this.f7529u = gVar;
        }
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f7523o) {
            z3 = this.f7527s;
        }
        return z3;
    }

    public final void l() {
        synchronized (this.f7523o) {
        }
    }

    public byte[] m() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f7522n));
        l();
        return "[ ] " + this.f7521m + " " + "0x".concat(valueOf) + " NORMAL " + this.f7525q;
    }
}
