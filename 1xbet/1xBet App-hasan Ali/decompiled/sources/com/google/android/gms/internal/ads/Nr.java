package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Nr implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f10840s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final Object f10841t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f10842u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static Boolean f10843v;

    /* renamed from: k, reason: collision with root package name */
    public final Context f10844k;

    /* renamed from: l, reason: collision with root package name */
    public final U2.a f10845l;

    /* renamed from: o, reason: collision with root package name */
    public int f10848o;

    /* renamed from: p, reason: collision with root package name */
    public final C0855cl f10849p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractCollection f10850q;

    /* renamed from: m, reason: collision with root package name */
    public final Qr f10846m = Tr.x();

    /* renamed from: n, reason: collision with root package name */
    public String f10847n = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f10851r = false;

    public Nr(Context context, U2.a aVar, C0855cl c0855cl, V9 v9) {
        this.f10844k = context;
        this.f10845l = aVar;
        this.f10849p = c0855cl;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.v8)).booleanValue()) {
            this.f10850q = T2.L.y();
        } else {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            this.f10850q = C1761wv.f16184o;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f10840s) {
            try {
                if (f10843v == null) {
                    if (((Boolean) AbstractC0834c8.f12976b.s()).booleanValue()) {
                        f10843v = Boolean.valueOf(Math.random() < ((Double) AbstractC0834c8.f12975a.s()).doubleValue());
                    } else {
                        f10843v = Boolean.FALSE;
                    }
                }
                booleanValue = f10843v.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(Lr lr) {
        AbstractC0613Id.f9539a.b(new RunnableC1081hn(9, this, lr));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] d5;
        if (a()) {
            Object obj = f10841t;
            synchronized (obj) {
                try {
                    if (((Tr) this.f10846m.f10141l).w() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            d5 = ((Tr) this.f10846m.b()).d();
                            Qr qr = this.f10846m;
                            qr.e();
                            Tr.z((Tr) qr.f10141l);
                        }
                        Hm hm = new Hm((String) Q2.r.f5053d.f5056c.a(F7.p8), 60000, new HashMap(), d5, "application/x-protobuf");
                        Context context = this.f10844k;
                        String str = this.f10845l.f5852k;
                        Binder.getCallingUid();
                        new C0709Wb(24, context, str).p(hm);
                    } catch (Exception e3) {
                        if ((e3 instanceof C0856cm) && ((C0856cm) e3).f13035k == 3) {
                            return;
                        }
                        P2.o.f4767B.f4774g.h("CuiMonitor.sendCuiPing", e3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
