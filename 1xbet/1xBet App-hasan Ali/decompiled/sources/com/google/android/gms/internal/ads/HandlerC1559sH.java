package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.sH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1559sH extends Handler implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final EG f15479k;

    /* renamed from: l, reason: collision with root package name */
    public HG f15480l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f15481m;

    /* renamed from: n, reason: collision with root package name */
    public int f15482n;

    /* renamed from: o, reason: collision with root package name */
    public Thread f15483o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15484p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f15485q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0905dr f15486r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1559sH(C0905dr c0905dr, Looper looper, EG eg, HG hg, long j5) {
        super(looper);
        this.f15486r = c0905dr;
        this.f15479k = eg;
        this.f15480l = hg;
    }

    public final void a(boolean z3) {
        this.f15485q = z3;
        this.f15481m = null;
        if (hasMessages(1)) {
            this.f15484p = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f15484p = true;
                    this.f15479k.f8499g = true;
                    Thread thread = this.f15483o;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.f15486r.f13187m = null;
            SystemClock.elapsedRealtime();
            HG hg = this.f15480l;
            hg.getClass();
            hg.h(this.f15479k, true);
            this.f15480l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long j5;
        C1141j3 c1141j3;
        U u5;
        int i;
        if (this.f15485q) {
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            SystemClock.elapsedRealtime();
            this.f15480l.getClass();
            this.f15481m = null;
            C0905dr c0905dr = this.f15486r;
            ExecutorC0599Gd executorC0599Gd = (ExecutorC0599Gd) c0905dr.f13186l;
            HandlerC1559sH handlerC1559sH = (HandlerC1559sH) c0905dr.f13187m;
            handlerC1559sH.getClass();
            executorC0599Gd.execute(handlerC1559sH);
            return;
        }
        if (i5 == 4) {
            throw ((Error) message.obj);
        }
        this.f15486r.f13187m = null;
        SystemClock.elapsedRealtime();
        HG hg = this.f15480l;
        hg.getClass();
        if (this.f15484p) {
            hg.h(this.f15479k, false);
            return;
        }
        int i6 = message.what;
        if (i6 == 2) {
            try {
                hg.n(this.f15479k);
                return;
            } catch (RuntimeException e3) {
                JB.g("LoadTask", "Unexpected exception handling load completed", e3);
                this.f15486r.f13188n = new C1604tH(e3);
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f15481m = iOException;
        int i7 = this.f15482n;
        this.f15482n = i7 + 1;
        EG eg = this.f15479k;
        Uri uri = eg.f8495b.f8942l;
        C1199kG c1199kG = new C1199kG();
        int i8 = AbstractC1260lo.f14419a;
        if (!(iOException instanceof B7) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1540rz) && !(iOException instanceof C1604tH)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1806xv) || ((C1806xv) th).f16348k != 2008) {
                }
            }
            j5 = Math.min(i7 * 1000, 5000);
            if (j5 != -9223372036854775807L) {
                c1141j3 = C0905dr.f13184q;
            } else {
                int o5 = hg.o();
                int i9 = o5 > hg.f9375T ? 1 : 0;
                if (hg.f9371P || !((u5 = hg.f9365H) == null || u5.a() == -9223372036854775807L)) {
                    hg.f9375T = o5;
                } else {
                    boolean z3 = hg.f9361D;
                    if (!z3 || hg.B()) {
                        hg.f9368M = z3;
                        hg.f9372Q = 0L;
                        hg.f9375T = 0;
                        for (MG mg : hg.f9358A) {
                            mg.p(false);
                        }
                        eg.f.f658a = 0L;
                        eg.i = 0L;
                        eg.f8500h = true;
                        eg.f8503l = false;
                    } else {
                        hg.f9374S = true;
                        c1141j3 = C0905dr.f13183p;
                    }
                }
                c1141j3 = new C1141j3(i9, j5);
            }
            int i10 = c1141j3.f14059a;
            boolean z5 = !(i10 != 0 || i10 == 1);
            C1469qG c1469qG = new C1469qG(-1, null, AbstractC1260lo.v(eg.i), AbstractC1260lo.v(hg.f9366I));
            C1872zF c1872zF = hg.f9382n;
            c1872zF.a(new C1894zt(c1872zF, c1199kG, c1469qG, iOException, z5));
            i = c1141j3.f14059a;
            if (i != 3) {
                this.f15486r.f13188n = this.f15481m;
                return;
            }
            if (i != 2) {
                if (i == 1) {
                    this.f15482n = 1;
                }
                long j6 = c1141j3.f14060b;
                if (j6 == -9223372036854775807L) {
                    j6 = Math.min((this.f15482n - 1) * 1000, 5000);
                }
                C0905dr c0905dr2 = this.f15486r;
                AbstractC1668us.a0(((HandlerC1559sH) c0905dr2.f13187m) == null);
                c0905dr2.f13187m = this;
                if (j6 > 0) {
                    sendEmptyMessageDelayed(1, j6);
                    return;
                }
                SystemClock.elapsedRealtime();
                this.f15480l.getClass();
                this.f15481m = null;
                ExecutorC0599Gd executorC0599Gd2 = (ExecutorC0599Gd) c0905dr2.f13186l;
                HandlerC1559sH handlerC1559sH2 = (HandlerC1559sH) c0905dr2.f13187m;
                handlerC1559sH2.getClass();
                executorC0599Gd2.execute(handlerC1559sH2);
                return;
            }
            return;
        }
        j5 = -9223372036854775807L;
        if (j5 != -9223372036854775807L) {
        }
        int i102 = c1141j3.f14059a;
        boolean z52 = !(i102 != 0 || i102 == 1);
        C1469qG c1469qG2 = new C1469qG(-1, null, AbstractC1260lo.v(eg.i), AbstractC1260lo.v(hg.f9366I));
        C1872zF c1872zF2 = hg.f9382n;
        c1872zF2.a(new C1894zt(c1872zF2, c1199kG, c1469qG2, iOException, z52));
        i = c1141j3.f14059a;
        if (i != 3) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f15484p;
                this.f15483o = Thread.currentThread();
            }
            if (!z3) {
                Trace.beginSection("load:".concat(this.f15479k.getClass().getSimpleName()));
                try {
                    this.f15479k.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f15483o = null;
                Thread.interrupted();
            }
            if (this.f15485q) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            if (this.f15485q) {
                return;
            }
            obtainMessage(3, e3).sendToTarget();
        } catch (Exception e5) {
            if (this.f15485q) {
                return;
            }
            JB.g("LoadTask", "Unexpected exception loading stream", e5);
            obtainMessage(3, new C1604tH(e5)).sendToTarget();
        } catch (OutOfMemoryError e6) {
            if (this.f15485q) {
                return;
            }
            JB.g("LoadTask", "OutOfMemory error loading stream", e6);
            obtainMessage(3, new C1604tH(e6)).sendToTarget();
        } catch (Error e7) {
            if (!this.f15485q) {
                JB.g("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        }
    }
}
