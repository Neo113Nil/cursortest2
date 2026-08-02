package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004g {

    /* renamed from: a, reason: collision with root package name */
    public final AH f13536a;

    /* renamed from: b, reason: collision with root package name */
    public final C1137j f13537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13538c;
    public long f;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f13539d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f13540e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f13541g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f13542h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f13543j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public Nm f13544k = Nm.f10813a;

    public C1004g(Context context, AH ah) {
        this.f13536a = ah;
        this.f13537b = new C1137j(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0116, code lost:
    
        if (r12 > 100000) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0122, code lost:
    
        if (r29 >= r33) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0128, code lost:
    
        if (r26.f13538c != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0076, code lost:
    
        if ((r11 == 0 ? false : r9.f16286g[(int) ((r11 - 1) % 15)]) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j5, long j6, long j7, long j8, boolean z3, M4.d dVar) {
        long j9;
        long j10;
        long j11;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        long j12;
        long j13;
        dVar.f3626a = -9223372036854775807L;
        dVar.f3627b = -9223372036854775807L;
        if (this.f13540e == -9223372036854775807L) {
            this.f13540e = j6;
        }
        if (this.f13541g != j5) {
            C1137j c1137j = this.f13537b;
            j10 = 1000;
            long j14 = c1137j.f14039n;
            if (j14 != -1) {
                c1137j.f14041p = j14;
                c1137j.f14042q = c1137j.f14040o;
            }
            c1137j.f14038m++;
            long j15 = j5 * 1000;
            C1829yH c1829yH = c1137j.f14028a;
            j9 = -1;
            c1829yH.f16428a.a(j15);
            if (c1829yH.f16428a.c()) {
                c1829yH.f16430c = false;
            } else if (c1829yH.f16431d != -9223372036854775807L) {
                if (c1829yH.f16430c) {
                    C1784xH c1784xH = c1829yH.f16429b;
                    j11 = 0;
                    long j16 = c1784xH.f16284d;
                } else {
                    j11 = 0;
                }
                c1829yH.f16429b.b();
                c1829yH.f16429b.a(c1829yH.f16431d);
                c1829yH.f16430c = true;
                c1829yH.f16429b.a(j15);
                if (c1829yH.f16430c && c1829yH.f16429b.c()) {
                    C1784xH c1784xH2 = c1829yH.f16428a;
                    c1829yH.f16428a = c1829yH.f16429b;
                    c1829yH.f16429b = c1784xH2;
                    c1829yH.f16430c = false;
                }
                c1829yH.f16431d = j15;
                c1829yH.f16432e = !c1829yH.f16428a.c() ? 0 : c1829yH.f16432e + 1;
                c1137j.c();
                this.f13541g = j5;
            }
            j11 = 0;
            if (c1829yH.f16430c) {
                C1784xH c1784xH22 = c1829yH.f16428a;
                c1829yH.f16428a = c1829yH.f16429b;
                c1829yH.f16429b = c1784xH22;
                c1829yH.f16430c = false;
            }
            c1829yH.f16431d = j15;
            c1829yH.f16432e = !c1829yH.f16428a.c() ? 0 : c1829yH.f16432e + 1;
            c1137j.c();
            this.f13541g = j5;
        } else {
            j9 = -1;
            j10 = 1000;
            j11 = 0;
        }
        long j17 = (long) ((j5 - j6) / this.f13543j);
        if (this.f13538c) {
            this.f13544k.getClass();
            j17 -= AbstractC1260lo.s(SystemClock.elapsedRealtime()) - j7;
        }
        dVar.f3626a = j17;
        if (this.f13542h == -9223372036854775807L || this.i) {
            int i9 = this.f13539d;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        i = 1;
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f13544k.getClass();
                        i = 1;
                        long s2 = AbstractC1260lo.s(SystemClock.elapsedRealtime()) - this.f;
                        if (this.f13538c) {
                            if (j17 < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
            i = 1;
        } else {
            i = 1;
        }
        if (!this.f13538c || j6 == this.f13540e) {
            return 5;
        }
        this.f13544k.getClass();
        long nanoTime = System.nanoTime();
        C1137j c1137j2 = this.f13537b;
        long j18 = dVar.f3626a;
        Long.signum(j18);
        long j19 = (j18 * j10) + nanoTime;
        if (c1137j2.f14041p == j9 || !c1137j2.f14028a.f16428a.c()) {
            i5 = 3;
            i6 = 2;
            i7 = i;
        } else {
            C1829yH c1829yH2 = c1137j2.f14028a;
            if (c1829yH2.f16428a.c()) {
                C1784xH c1784xH3 = c1829yH2.f16428a;
                long j20 = c1784xH3.f16285e;
                i5 = 3;
                i6 = 2;
                j13 = j20 == j11 ? j11 : c1784xH3.f / j20;
            } else {
                i5 = 3;
                i6 = 2;
                j13 = -9223372036854775807L;
            }
            i7 = i;
            long j21 = c1137j2.f14042q + ((long) (((c1137j2.f14038m - c1137j2.f14041p) * j13) / c1137j2.i));
            if (Math.abs(j19 - j21) > 20000000) {
                c1137j2.f14038m = j11;
                long j22 = j9;
                c1137j2.f14041p = j22;
                c1137j2.f14039n = j22;
            } else {
                j19 = j21;
            }
        }
        c1137j2.f14039n = c1137j2.f14038m;
        c1137j2.f14040o = j19;
        ChoreographerFrameCallbackC1094i choreographerFrameCallbackC1094i = c1137j2.f14030c;
        if (choreographerFrameCallbackC1094i != null && c1137j2.f14036k != -9223372036854775807L) {
            long j23 = choreographerFrameCallbackC1094i.f13842k;
            if (j23 != -9223372036854775807L) {
                long j24 = c1137j2.f14036k;
                long j25 = (((j19 - j23) / j24) * j24) + j23;
                if (j19 <= j25) {
                    j12 = j25 - j24;
                } else {
                    j12 = j25;
                    j25 = j24 + j25;
                }
                long j26 = c1137j2.f14037l;
                if (j25 - j19 >= j19 - j12) {
                    j25 = j12;
                }
                j19 = j25 - j26;
            }
        }
        dVar.f3627b = j19;
        long j27 = (j19 - nanoTime) / j10;
        dVar.f3626a = j27;
        int i10 = (this.f13542h == -9223372036854775807L || this.i) ? 0 : i7;
        AH ah = this.f13536a;
        if (j27 < -500000 && !z3) {
            NG ng = ah.f11404s;
            ng.getClass();
            int a5 = ng.a(j6 - ah.f11408u);
            if (a5 == 0) {
                i8 = 0;
            } else {
                if (i10 != 0) {
                    SD sd = ah.B0;
                    sd.f11514d += a5;
                    sd.f += ah.f7580d1;
                } else {
                    ah.B0.f11518j++;
                    ah.n0(a5, ah.f7580d1);
                }
                if (ah.B()) {
                    ah.u();
                }
                C0825c c0825c = ah.f7568R0;
                if (c0825c != null) {
                    c0825c.b(false);
                }
                i8 = i7;
            }
            if (i8 != 0) {
                return 4;
            }
        }
        long j28 = dVar.f3626a;
        if (j28 < -30000 && !z3) {
            return i10 != 0 ? i5 : i6;
        }
        if (j28 > 50000) {
            return 5;
        }
        return i7;
    }

    public final void b() {
        this.f13538c = true;
        this.f13544k.getClass();
        this.f = AbstractC1260lo.s(SystemClock.elapsedRealtime());
        C1137j c1137j = this.f13537b;
        c1137j.f14031d = true;
        c1137j.f14038m = 0L;
        c1137j.f14041p = -1L;
        c1137j.f14039n = -1L;
        C1049h c1049h = c1137j.f14029b;
        if (c1049h != null) {
            ChoreographerFrameCallbackC1094i choreographerFrameCallbackC1094i = c1137j.f14030c;
            choreographerFrameCallbackC1094i.getClass();
            choreographerFrameCallbackC1094i.f13843l.sendEmptyMessage(2);
            Looper myLooper = Looper.myLooper();
            AbstractC1668us.F(myLooper);
            Handler handler = new Handler(myLooper, null);
            DisplayManager displayManager = c1049h.f13691a;
            displayManager.registerDisplayListener(c1049h, handler);
            C1137j.a(c1049h.f13692b, displayManager.getDisplay(0));
        }
        c1137j.d(false);
    }

    public final void c() {
        this.f13538c = false;
        this.f13542h = -9223372036854775807L;
        C1137j c1137j = this.f13537b;
        c1137j.f14031d = false;
        C1049h c1049h = c1137j.f14029b;
        if (c1049h != null) {
            c1049h.f13691a.unregisterDisplayListener(c1049h);
            ChoreographerFrameCallbackC1094i choreographerFrameCallbackC1094i = c1137j.f14030c;
            choreographerFrameCallbackC1094i.getClass();
            choreographerFrameCallbackC1094i.f13843l.sendEmptyMessage(3);
        }
        c1137j.b();
    }

    public final void d(float f) {
        AbstractC1668us.S(f > 0.0f);
        if (f == this.f13543j) {
            return;
        }
        this.f13543j = f;
        C1137j c1137j = this.f13537b;
        c1137j.i = f;
        c1137j.f14038m = 0L;
        c1137j.f14041p = -1L;
        c1137j.f14039n = -1L;
        c1137j.d(false);
    }

    public final boolean e(boolean z3) {
        if (!z3 || this.f13539d != 3) {
            if (this.f13542h == -9223372036854775807L) {
                return false;
            }
            this.f13544k.getClass();
            r2 = SystemClock.elapsedRealtime() < this.f13542h;
            return r2;
        }
        this.f13542h = -9223372036854775807L;
        return r2;
    }

    public final void f(int i) {
        this.f13539d = Math.min(this.f13539d, i);
    }
}
