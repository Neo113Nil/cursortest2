package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907dt implements InterfaceC2092b, InterfaceC2093c {

    /* renamed from: k, reason: collision with root package name */
    public final C1579st f13190k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13191l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13192m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedBlockingQueue f13193n;

    /* renamed from: o, reason: collision with root package name */
    public final HandlerThread f13194o;

    /* renamed from: p, reason: collision with root package name */
    public final P.W f13195p;

    /* renamed from: q, reason: collision with root package name */
    public final long f13196q;

    /* renamed from: r, reason: collision with root package name */
    public final int f13197r;

    public C0907dt(Context context, int i, String str, String str2, P.W w5) {
        this.f13191l = str;
        this.f13197r = i;
        this.f13192m = str2;
        this.f13195p = w5;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f13194o = handlerThread;
        handlerThread.start();
        this.f13196q = System.currentTimeMillis();
        C1579st c1579st = new C1579st(19621000, context, handlerThread.getLooper(), this, this);
        this.f13190k = c1579st;
        this.f13193n = new LinkedBlockingQueue();
        c1579st.n();
    }

    @Override // m3.InterfaceC2092b
    public final void L(int i) {
        try {
            b(4011, this.f13196q, null);
            this.f13193n.put(new C1849yt());
        } catch (InterruptedException unused) {
        }
    }

    @Override // m3.InterfaceC2092b
    public final void N() {
        C1714vt c1714vt;
        long j5 = this.f13196q;
        HandlerThread handlerThread = this.f13194o;
        try {
            c1714vt = (C1714vt) this.f13190k.t();
        } catch (DeadObjectException | IllegalStateException unused) {
            c1714vt = null;
        }
        if (c1714vt != null) {
            try {
                C1759wt c1759wt = new C1759wt(1, 1, this.f13197r - 1, this.f13191l, this.f13192m);
                Parcel N5 = c1714vt.N();
                F5.c(N5, c1759wt);
                Parcel Y4 = c1714vt.Y(N5, 3);
                C1849yt c1849yt = (C1849yt) F5.a(Y4, C1849yt.CREATOR);
                Y4.recycle();
                b(5011, j5, null);
                this.f13193n.put(c1849yt);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // m3.InterfaceC2093c
    public final void Y(j3.b bVar) {
        try {
            b(4012, this.f13196q, null);
            this.f13193n.put(new C1849yt());
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        C1579st c1579st = this.f13190k;
        if (c1579st != null) {
            if (c1579st.a() || c1579st.h()) {
                c1579st.l();
            }
        }
    }

    public final void b(int i, long j5, Exception exc) {
        this.f13195p.g(i, System.currentTimeMillis() - j5, exc);
    }
}
