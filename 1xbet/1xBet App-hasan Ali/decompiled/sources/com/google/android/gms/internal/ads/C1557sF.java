package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.sF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557sF {

    /* renamed from: Z, reason: collision with root package name */
    public static final Object f15429Z = new Object();

    /* renamed from: a0, reason: collision with root package name */
    public static ScheduledExecutorService f15430a0;

    /* renamed from: b0, reason: collision with root package name */
    public static int f15431b0;

    /* renamed from: A, reason: collision with root package name */
    public long f15432A;

    /* renamed from: B, reason: collision with root package name */
    public long f15433B;

    /* renamed from: C, reason: collision with root package name */
    public int f15434C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f15435D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15436E;

    /* renamed from: F, reason: collision with root package name */
    public long f15437F;

    /* renamed from: G, reason: collision with root package name */
    public float f15438G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f15439H;

    /* renamed from: I, reason: collision with root package name */
    public int f15440I;
    public ByteBuffer J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f15441L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15442M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15443N;

    /* renamed from: O, reason: collision with root package name */
    public int f15444O;

    /* renamed from: P, reason: collision with root package name */
    public C1891zq f15445P;

    /* renamed from: Q, reason: collision with root package name */
    public Dp f15446Q;

    /* renamed from: R, reason: collision with root package name */
    public long f15447R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f15448S;

    /* renamed from: T, reason: collision with root package name */
    public Looper f15449T;

    /* renamed from: U, reason: collision with root package name */
    public long f15450U;

    /* renamed from: V, reason: collision with root package name */
    public long f15451V;

    /* renamed from: W, reason: collision with root package name */
    public Handler f15452W;

    /* renamed from: X, reason: collision with root package name */
    public final Fx f15453X;

    /* renamed from: Y, reason: collision with root package name */
    public final C1667ur f15454Y;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15455a;

    /* renamed from: b, reason: collision with root package name */
    public final C1288mF f15456b;

    /* renamed from: c, reason: collision with root package name */
    public final C1737wF f15457c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761wv f15458d;

    /* renamed from: e, reason: collision with root package name */
    public final C1761wv f15459e;
    public final C1243lF f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f15460g;

    /* renamed from: h, reason: collision with root package name */
    public Fx f15461h;
    public final T2.z i;

    /* renamed from: j, reason: collision with root package name */
    public final T2.z f15462j;

    /* renamed from: k, reason: collision with root package name */
    public ZE f15463k;

    /* renamed from: l, reason: collision with root package name */
    public Hq f15464l;

    /* renamed from: m, reason: collision with root package name */
    public C1378oF f15465m;

    /* renamed from: n, reason: collision with root package name */
    public C1378oF f15466n;

    /* renamed from: o, reason: collision with root package name */
    public C0607He f15467o;

    /* renamed from: p, reason: collision with root package name */
    public AudioTrack f15468p;

    /* renamed from: q, reason: collision with root package name */
    public C0797bF f15469q;

    /* renamed from: r, reason: collision with root package name */
    public C0802bc f15470r;

    /* renamed from: s, reason: collision with root package name */
    public Fx f15471s;

    /* renamed from: t, reason: collision with root package name */
    public Mm f15472t;

    /* renamed from: u, reason: collision with root package name */
    public C1423pF f15473u;

    /* renamed from: v, reason: collision with root package name */
    public C1423pF f15474v;

    /* renamed from: w, reason: collision with root package name */
    public Y7 f15475w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15476x;

    /* renamed from: y, reason: collision with root package name */
    public long f15477y;

    /* renamed from: z, reason: collision with root package name */
    public long f15478z;

    public C1557sF(C1894zt c1894zt) {
        C0797bF c0797bF;
        Context context = (Context) c1894zt.f16783l;
        this.f15455a = context;
        Mm mm = Mm.f10718b;
        this.f15472t = mm;
        if (context != null) {
            C0797bF c0797bF2 = C0797bF.f12791c;
            int i = AbstractC1260lo.f14419a;
            c0797bF = C0797bF.b(context, mm, null);
        } else {
            c0797bF = (C0797bF) c1894zt.f16784m;
        }
        this.f15469q = c0797bF;
        this.f15453X = (Fx) c1894zt.f16785n;
        int i5 = AbstractC1260lo.f14419a;
        C1667ur c1667ur = (C1667ur) c1894zt.f16786o;
        c1667ur.getClass();
        this.f15454Y = c1667ur;
        this.f = new C1243lF(new Qs(10, this));
        C1288mF c1288mF = new C1288mF();
        this.f15456b = c1288mF;
        C1737wF c1737wF = new C1737wF();
        c1737wF.f16103m = AbstractC1260lo.f;
        this.f15457c = c1737wF;
        C0692Tf c0692Tf = new C0692Tf();
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        Object[] objArr = {c0692Tf, c1288mF, c1737wF};
        AbstractC1400ot.C(3, objArr);
        this.f15458d = AbstractC1044gv.k(3, objArr);
        this.f15459e = AbstractC1044gv.n(new C1692vF());
        this.f15438G = 1.0f;
        this.f15444O = 0;
        this.f15445P = new C1891zq();
        Y7 y7 = Y7.f12279d;
        this.f15474v = new C1423pF(y7, 0L, 0L);
        this.f15475w = y7;
        this.f15476x = false;
        this.f15460g = new ArrayDeque();
        this.i = new T2.z();
        this.f15462j = new T2.z();
    }

    public static boolean m(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC1260lo.f14419a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public static final AudioTrack n(C1020gF c1020gF, Mm mm, int i, C1407p c1407p) {
        AudioTrack audioTrack;
        try {
            int i5 = AbstractC1260lo.f14419a;
            int i6 = c1020gF.f13576a;
            int i7 = c1020gF.f13578c;
            int i8 = c1020gF.f13577b;
            if (i5 >= 23) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes((AudioAttributes) mm.a().f10741l).setAudioFormat(AbstractC1260lo.w(i8, i7, i6)).setTransferMode(1).setBufferSizeInBytes(c1020gF.f13580e).setSessionId(i);
                if (i5 >= 29) {
                    sessionId.setOffloadedPlayback(c1020gF.f13579d);
                }
                audioTrack = sessionId.build();
            } else {
                audioTrack = new AudioTrack((AudioAttributes) mm.a().f10741l, AbstractC1260lo.w(i8, i7, i6), c1020gF.f13580e, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new C1110iF(state, c1020gF.f13577b, c1020gF.f13578c, c1020gF.f13576a, c1407p, c1020gF.f13579d, null);
        } catch (IllegalArgumentException e3) {
            e = e3;
            RuntimeException runtimeException = e;
            throw new C1110iF(0, c1020gF.f13577b, c1020gF.f13578c, c1020gF.f13576a, c1407p, c1020gF.f13579d, runtimeException);
        } catch (UnsupportedOperationException e5) {
            e = e5;
            RuntimeException runtimeException2 = e;
            throw new C1110iF(0, c1020gF.f13577b, c1020gF.f13578c, c1020gF.f13576a, c1407p, c1020gF.f13579d, runtimeException2);
        }
    }

    public final long a() {
        return this.f15466n.f14793c == 0 ? this.f15477y / r0.f14792b : this.f15478z;
    }

    public final long b() {
        C1378oF c1378oF = this.f15466n;
        if (c1378oF.f14793c != 0) {
            return this.f15433B;
        }
        long j5 = this.f15432A;
        long j6 = c1378oF.f14794d;
        int i = AbstractC1260lo.f14419a;
        return ((j5 + j6) - 1) / j6;
    }

    public final AudioTrack c(C1378oF c1378oF) {
        try {
            return n(c1378oF.a(), this.f15472t, this.f15444O, c1378oF.f14791a);
        } catch (C1110iF e3) {
            Hq hq = this.f15464l;
            if (hq != null) {
                hq.c(e3);
            }
            throw e3;
        }
    }

    public final void d(long j5) {
        boolean z3;
        Y7 y7;
        C1378oF c1378oF = this.f15466n;
        boolean z5 = false;
        if (c1378oF.f14793c == 0) {
            int i = c1378oF.f14791a.f14888D;
            z3 = true;
        } else {
            z3 = false;
        }
        Fx fx = this.f15453X;
        if (z3) {
            y7 = this.f15475w;
            fx.getClass();
            float f = y7.f12280a;
            C0685Sf c0685Sf = (C0685Sf) fx.f9144l;
            if (c0685Sf.f11560c != f) {
                c0685Sf.f11560c = f;
                c0685Sf.i = true;
            }
            float f5 = c0685Sf.f11561d;
            float f6 = y7.f12281b;
            if (f5 != f6) {
                c0685Sf.f11561d = f6;
                c0685Sf.i = true;
            }
        } else {
            y7 = Y7.f12279d;
        }
        Y7 y72 = y7;
        this.f15475w = y72;
        C1378oF c1378oF2 = this.f15466n;
        if (c1378oF2.f14793c == 0) {
            int i5 = c1378oF2.f14791a.f14888D;
            z5 = this.f15476x;
            ((C1647uF) fx.f9143k).f15823j = z5;
        }
        this.f15476x = z5;
        this.f15460g.add(new C1423pF(y72, Math.max(0L, j5), AbstractC1260lo.t(this.f15466n.f14795e, b())));
        C0607He c0607He = this.f15466n.i;
        this.f15467o = c0607He;
        c0607He.b();
        Hq hq = this.f15464l;
        if (hq != null) {
            boolean z6 = this.f15476x;
            Er er = ((C1602tF) hq.f9491l).f15666J0;
            Handler handler = (Handler) er.f8617l;
            if (handler != null) {
                handler.post(new P2.f(4, er, z6));
            }
        }
    }

    public final void e() {
        boolean z3;
        if (this.J == null) {
            return;
        }
        T2.z zVar = this.f15462j;
        if (((Exception) zVar.f5756m) != null) {
            synchronized (f15429Z) {
                z3 = f15431b0 > 0;
            }
            if (z3 || SystemClock.elapsedRealtime() < zVar.f5755l) {
                return;
            }
        }
        int remaining = this.J.remaining();
        int write = this.f15468p.write(this.J, remaining, 1);
        this.f15447R = SystemClock.elapsedRealtime();
        if (write >= 0) {
            zVar.f5756m = null;
            zVar.f5754k = -9223372036854775807L;
            zVar.f5755l = -9223372036854775807L;
            m(this.f15468p);
            int i = this.f15466n.f14793c;
            if (i == 0) {
                this.f15432A += write;
            }
            if (write == remaining) {
                if (i != 0) {
                    AbstractC1668us.a0(this.J == this.f15439H);
                    this.f15433B = (this.f15434C * this.f15440I) + this.f15433B;
                }
                this.J = null;
                return;
            }
            return;
        }
        if ((AbstractC1260lo.f14419a >= 24 && write == -6) || write == -32) {
            if (b() <= 0) {
                if (m(this.f15468p)) {
                    if (this.f15466n.f14793c == 1) {
                        this.f15448S = true;
                    }
                }
            }
            r2 = true;
        }
        C1153jF c1153jF = new C1153jF(write, this.f15466n.f14791a, r2);
        Hq hq = this.f15464l;
        if (hq != null) {
            hq.c(c1153jF);
        }
        if (c1153jF.f14090l) {
            this.f15469q = C0797bF.f12791c;
            throw c1153jF;
        }
        zVar.h(c1153jF);
    }

    public final void f() {
        Context context;
        C0797bF c5;
        C0841cF c0841cF;
        if (this.f15470r != null || (context = this.f15455a) == null) {
            return;
        }
        this.f15449T = Looper.myLooper();
        C0802bc c0802bc = new C0802bc(context, new Ps(this), this.f15472t, this.f15446Q);
        this.f15470r = c0802bc;
        if (c0802bc.f12823m) {
            c5 = (C0797bF) c0802bc.f12827q;
            c5.getClass();
        } else {
            c0802bc.f12823m = true;
            C0886dF c0886dF = (C0886dF) c0802bc.f12822l;
            if (c0886dF != null) {
                c0886dF.f13105a.registerContentObserver(c0886dF.f13106b, false, c0886dF);
            }
            int i = AbstractC1260lo.f14419a;
            Handler handler = (Handler) c0802bc.f12824n;
            Context context2 = (Context) c0802bc.f12821k;
            if (i >= 23 && (c0841cF = (C0841cF) c0802bc.f12825o) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(c0841cF, handler);
            }
            c5 = C0797bF.c(context2, context2.registerReceiver((T2.E) c0802bc.f12826p, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (Mm) c0802bc.f12829s, (Dp) c0802bc.f12828r);
            c0802bc.f12827q = c5;
        }
        this.f15469q = c5;
    }

    public final void g() {
        if (this.f15441L) {
            return;
        }
        this.f15441L = true;
        long b3 = b();
        C1243lF c1243lF = this.f;
        c1243lF.f14368z = c1243lF.d();
        c1243lF.f14344G.getClass();
        c1243lF.f14366x = AbstractC1260lo.s(SystemClock.elapsedRealtime());
        c1243lF.f14338A = b3;
        if (m(this.f15468p)) {
            this.f15442M = false;
        }
        this.f15468p.stop();
    }

    public final void h() {
        ByteBuffer byteBuffer;
        e();
        if (this.J != null) {
            return;
        }
        if (!this.f15467o.d()) {
            ByteBuffer byteBuffer2 = this.f15439H;
            if (byteBuffer2 != null) {
                i(byteBuffer2);
                e();
                return;
            }
            return;
        }
        while (!this.f15467o.c()) {
            do {
                C0607He c0607He = this.f15467o;
                if (c0607He.d()) {
                    ByteBuffer byteBuffer3 = c0607He.f9413c[c0607He.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0607He.f(InterfaceC1431pf.f15014a);
                        byteBuffer = c0607He.f9413c[c0607He.e()];
                    }
                } else {
                    byteBuffer = InterfaceC1431pf.f15014a;
                }
                if (byteBuffer.hasRemaining()) {
                    i(byteBuffer);
                    e();
                } else {
                    ByteBuffer byteBuffer4 = this.f15439H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0607He c0607He2 = this.f15467o;
                    ByteBuffer byteBuffer5 = this.f15439H;
                    if (c0607He2.d() && !c0607He2.f9414d) {
                        c0607He2.f(byteBuffer5);
                    }
                }
            } while (this.J == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC1668us.a0(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f15466n.f14793c == 0) {
                int u5 = (int) AbstractC1260lo.u(AbstractC1260lo.s(20L), this.f15466n.f14795e, 1000000L, RoundingMode.UP);
                long b3 = b();
                long j5 = u5;
                if (b3 < j5) {
                    C1378oF c1378oF = this.f15466n;
                    int i14 = c1378oF.f14796g;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i15 = (int) b3;
                    while (byteBuffer.hasRemaining() && i15 < u5) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i6 = (byteBuffer.get() & 255) << 24;
                            } else if (i14 != 4) {
                                if (i14 != 21) {
                                    if (i14 == 22) {
                                        i10 = byteBuffer.get() & 255;
                                        i11 = (byteBuffer.get() & 255) << 8;
                                        i12 = (byteBuffer.get() & 255) << 16;
                                        i13 = (byteBuffer.get() & 255) << 24;
                                    } else if (i14 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i5 = (byteBuffer.get() & 255) << 16;
                                    } else if (i14 == 1342177280) {
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = (byteBuffer.get() & 255) << 16;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i14 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i10 = (byteBuffer.get() & 255) << 24;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                        i12 = (byteBuffer.get() & 255) << 8;
                                        i13 = byteBuffer.get() & 255;
                                    }
                                    i6 = i10 | i11 | i12 | i13;
                                } else {
                                    i7 = (byteBuffer.get() & 255) << 8;
                                    i8 = (byteBuffer.get() & 255) << 16;
                                    i9 = (byteBuffer.get() & 255) << 24;
                                }
                                i6 = i7 | i8 | i9;
                            } else {
                                float max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i6 = (int) (max < 0.0f ? (-max) * (-2.1474836E9f) : max * 2.1474836E9f);
                            }
                            int i16 = (int) ((i6 * i15) / j5);
                            if (i14 != 2) {
                                order.put((byte) (i16 >> 16));
                                order.put((byte) (i16 >> 24));
                            } else if (i14 == 3) {
                                order.put((byte) (i16 >> 24));
                            } else if (i14 != 4) {
                                if (i14 == 21) {
                                    order.put((byte) (i16 >> 8));
                                    order.put((byte) (i16 >> 16));
                                    order.put((byte) (i16 >> 24));
                                } else if (i14 == 22) {
                                    order.put((byte) i16);
                                    order.put((byte) (i16 >> 8));
                                    order.put((byte) (i16 >> 16));
                                    order.put((byte) (i16 >> 24));
                                } else if (i14 == 268435456) {
                                    order.put((byte) (i16 >> 24));
                                    order.put((byte) (i16 >> 16));
                                } else if (i14 == 1342177280) {
                                    order.put((byte) (i16 >> 24));
                                    order.put((byte) (i16 >> 16));
                                    order.put((byte) (i16 >> 8));
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    order.put((byte) (i16 >> 24));
                                    order.put((byte) (i16 >> 16));
                                    order.put((byte) (i16 >> 8));
                                    order.put((byte) i16);
                                }
                            } else if (i16 < 0) {
                                order.putFloat((-i16) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i16 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != c1378oF.f14794d + position) {
                                i15++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i5 = (byteBuffer.get() & 255) << 24;
                        }
                        i6 = i | i5;
                        int i162 = (int) ((i6 * i15) / j5);
                        if (i14 != 2) {
                        }
                        if (byteBuffer.position() != c1378oF.f14794d + position) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.J = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.J = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() {
        ByteBuffer byteBuffer;
        if (!this.f15467o.d()) {
            e();
            return this.J == null;
        }
        C0607He c0607He = this.f15467o;
        if (c0607He.d() && !c0607He.f9414d) {
            c0607He.f9414d = true;
            ((InterfaceC1431pf) c0607He.f9412b.get(0)).j();
        }
        h();
        if (!this.f15467o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final boolean k() {
        return this.f15468p != null;
    }

    public final int l(C1407p c1407p) {
        f();
        if (!"audio/raw".equals(c1407p.f14904m)) {
            return this.f15469q.a(c1407p, this.f15472t) != null ? 2 : 0;
        }
        int i = c1407p.f14888D;
        if (AbstractC1260lo.c(i)) {
            return i != 2 ? 1 : 2;
        }
        AbstractC0467k.y(i, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final void o(C1407p c1407p, int[] iArr) {
        int intValue;
        int intValue2;
        C0607He c0607He;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int max;
        int i9;
        int t5;
        int x5;
        f();
        boolean equals = "audio/raw".equals(c1407p.f14904m);
        int i10 = 2;
        int i11 = c1407p.f14887C;
        if (equals) {
            int i12 = c1407p.f14888D;
            AbstractC1668us.S(AbstractC1260lo.c(i12));
            int n5 = AbstractC1260lo.n(i12);
            int i13 = c1407p.f14886B;
            i5 = n5 * i13;
            C0909dv c0909dv = new C0909dv(4);
            c0909dv.c(this.f15458d);
            InterfaceC1431pf[] interfaceC1431pfArr = (InterfaceC1431pf[]) this.f15453X.f9145m;
            AbstractC1400ot.C(2, interfaceC1431pfArr);
            c0909dv.e(2);
            System.arraycopy(interfaceC1431pfArr, 0, c0909dv.f12730a, c0909dv.f12731b, 2);
            c0909dv.f12731b += 2;
            C0607He c0607He2 = new C0607He(c0909dv.f());
            if (c0607He2.equals(this.f15467o)) {
                c0607He2 = this.f15467o;
            }
            int i14 = c1407p.f14889E;
            C1737wF c1737wF = this.f15457c;
            c1737wF.i = i14;
            c1737wF.f16100j = c1407p.f14890F;
            this.f15456b.i = iArr;
            try {
                C0684Se a5 = c0607He2.a(new C0684Se(i11, i13, i12));
                int i15 = a5.f11556b;
                intValue2 = AbstractC1260lo.m(i15);
                intValue = a5.f11557c;
                int n6 = AbstractC1260lo.n(intValue) * i15;
                i11 = a5.f11555a;
                i = n6;
                c0607He = c0607He2;
                i10 = 0;
            } catch (C0938ef e3) {
                throw new C1065hF(e3, c1407p);
            }
        } else {
            C0607He c0607He3 = new C0607He(C1761wv.f16184o);
            C0930eF c0930eF = C0930eF.f13241d;
            Pair a6 = this.f15469q.a(c1407p, this.f15472t);
            if (a6 == null) {
                throw new C1065hF("Unable to configure passthrough for: ".concat(String.valueOf(c1407p)), c1407p);
            }
            intValue = ((Integer) a6.first).intValue();
            intValue2 = ((Integer) a6.second).intValue();
            c0607He = c0607He3;
            i = -1;
            i5 = -1;
        }
        if (intValue == 0) {
            throw new C1065hF("Invalid output encoding (mode=" + i10 + ") for: " + String.valueOf(c1407p), c1407p);
        }
        if (intValue2 == 0) {
            throw new C1065hF("Invalid output channel config (mode=" + i10 + ") for: " + String.valueOf(c1407p), c1407p);
        }
        boolean equals2 = "audio/vnd.dts.hd;profile=lbr".equals(c1407p.f14904m);
        int i16 = c1407p.i;
        if (equals2 && i16 == -1) {
            i16 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, intValue2, intValue);
        AbstractC1668us.a0(minBufferSize != -2);
        int i17 = i != -1 ? i : 1;
        int i18 = 250000;
        if (i10 != 0) {
            if (i10 != 1) {
                if (intValue == 5) {
                    i18 = 500000;
                } else if (intValue == 8) {
                    i18 = 1000000;
                    intValue = 8;
                }
                if (i16 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    x5 = AbstractC0952et.y(i16, 8);
                } else {
                    x5 = AbstractC0952et.x(intValue);
                }
                i6 = i11;
                i9 = i17;
                t5 = AbstractC1400ot.t((i18 * x5) / 1000000);
            } else {
                i6 = i11;
                i9 = i17;
                t5 = AbstractC1400ot.t((AbstractC0952et.x(intValue) * 50000000) / 1000000);
            }
            i8 = i;
            max = t5;
            i7 = i9;
        } else {
            i6 = i11;
            long j5 = i6;
            i7 = i17;
            i8 = i;
            long j6 = i7;
            max = Math.max(AbstractC1400ot.t(((250000 * j5) * j6) / 1000000), Math.min(minBufferSize * 4, AbstractC1400ot.t(((750000 * j5) * j6) / 1000000)));
        }
        this.f15448S = false;
        C1378oF c1378oF = new C1378oF(c1407p, i5, i10, i8, i6, intValue2, intValue, (((Math.max(minBufferSize, max) + i7) - 1) / i7) * i7, c0607He);
        if (k()) {
            this.f15465m = c1378oF;
        } else {
            this.f15466n = c1378oF;
        }
    }

    public final void p() {
        Fx fx;
        if (k()) {
            this.f15477y = 0L;
            this.f15478z = 0L;
            this.f15432A = 0L;
            this.f15433B = 0L;
            this.f15434C = 0;
            this.f15474v = new C1423pF(this.f15475w, 0L, 0L);
            this.f15437F = 0L;
            this.f15473u = null;
            this.f15460g.clear();
            this.f15439H = null;
            this.f15440I = 0;
            this.J = null;
            this.f15441L = false;
            this.K = false;
            this.f15442M = false;
            this.f15457c.f16105o = 0L;
            C0607He c0607He = this.f15466n.i;
            this.f15467o = c0607He;
            c0607He.b();
            AudioTrack audioTrack = this.f.f14347c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f15468p.pause();
            }
            if (m(this.f15468p)) {
                Fx fx2 = this.f15461h;
                fx2.getClass();
                this.f15468p.unregisterStreamEventCallback((C1512rF) fx2.f9143k);
                ((Handler) fx2.f9145m).removeCallbacksAndMessages(null);
            }
            C1020gF a5 = this.f15466n.a();
            C1378oF c1378oF = this.f15465m;
            if (c1378oF != null) {
                this.f15466n = c1378oF;
                this.f15465m = null;
            }
            C1243lF c1243lF = this.f;
            c1243lF.f14353k = 0L;
            c1243lF.f14365w = 0;
            c1243lF.f14364v = 0;
            c1243lF.f14354l = 0L;
            c1243lF.f14340C = 0L;
            c1243lF.f14343F = 0L;
            c1243lF.f14352j = false;
            c1243lF.f14347c = null;
            c1243lF.f14349e = null;
            if (AbstractC1260lo.f14419a >= 24 && (fx = this.f15471s) != null) {
                C1468qF c1468qF = (C1468qF) fx.f9144l;
                c1468qF.getClass();
                ((AudioTrack) fx.f9145m).removeOnRoutingChangedListener(c1468qF);
                fx.f9144l = null;
                this.f15471s = null;
            }
            AudioTrack audioTrack2 = this.f15468p;
            Hq hq = this.f15464l;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f15429Z) {
                try {
                    if (f15430a0 == null) {
                        f15430a0 = Executors.newSingleThreadScheduledExecutor(new Sn(1));
                    }
                    f15431b0++;
                    f15430a0.schedule(new K2.e(audioTrack2, hq, handler, a5, 8), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f15468p = null;
        }
        T2.z zVar = this.f15462j;
        zVar.f5756m = null;
        zVar.f5754k = -9223372036854775807L;
        zVar.f5755l = -9223372036854775807L;
        T2.z zVar2 = this.i;
        zVar2.f5756m = null;
        zVar2.f5754k = -9223372036854775807L;
        zVar2.f5755l = -9223372036854775807L;
        this.f15450U = 0L;
        this.f15451V = 0L;
        Handler handler2 = this.f15452W;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void q() {
        this.f15443N = true;
        if (k()) {
            C1243lF c1243lF = this.f;
            if (c1243lF.f14366x != -9223372036854775807L) {
                c1243lF.f14344G.getClass();
                c1243lF.f14366x = AbstractC1260lo.s(SystemClock.elapsedRealtime());
            }
            C1198kF c1198kF = c1243lF.f14349e;
            c1198kF.getClass();
            c1198kF.a(0);
            this.f15468p.play();
        }
    }

    public final void r() {
        p();
        C1761wv c1761wv = this.f15458d;
        int i = c1761wv.f16186n;
        for (int i5 = 0; i5 < i; i5++) {
            ((InterfaceC1431pf) c1761wv.get(i5)).c();
        }
        C1761wv c1761wv2 = this.f15459e;
        int i6 = c1761wv2.f16186n;
        for (int i7 = 0; i7 < i6; i7++) {
            ((InterfaceC1431pf) c1761wv2.get(i7)).c();
        }
        C0607He c0607He = this.f15467o;
        if (c0607He != null) {
            int i8 = 0;
            while (true) {
                C1761wv c1761wv3 = c0607He.f9411a;
                if (i8 >= c1761wv3.f16186n) {
                    break;
                }
                InterfaceC1431pf interfaceC1431pf = (InterfaceC1431pf) c1761wv3.get(i8);
                interfaceC1431pf.i();
                interfaceC1431pf.c();
                i8++;
            }
            c0607He.f9413c = new ByteBuffer[0];
            C0684Se c0684Se = C0684Se.f11554e;
            c0607He.f9414d = false;
        }
        this.f15443N = false;
        this.f15448S = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d9 A[PHI: r16
      0x02d9: PHI (r16v9 long) = (r16v8 long), (r16v8 long), (r16v10 long), (r16v10 long) binds: [B:172:0x03dd, B:174:0x03e6, B:76:0x02ac, B:78:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c5 A[Catch: iF -> 0x0107, TryCatch #3 {iF -> 0x0107, blocks: (B:219:0x0074, B:228:0x00dd, B:230:0x00e5, B:232:0x00eb, B:233:0x010a, B:234:0x0125, B:236:0x012b, B:238:0x012f, B:240:0x0141, B:241:0x0144, B:244:0x015a, B:246:0x0169, B:247:0x0170, B:251:0x017d, B:253:0x018a, B:256:0x0197, B:258:0x019b, B:259:0x01bf, B:261:0x01c6, B:263:0x01d8, B:269:0x00a6, B:271:0x00af, B:276:0x05bb, B:277:0x05be, B:279:0x05c5, B:280:0x05c7, B:282:0x007b, B:283:0x007d, B:290:0x0089, B:298:0x05ca, B:273:0x00d7, B:285:0x007e, B:288:0x0085, B:225:0x0099, B:227:0x009d, B:266:0x00a5), top: B:218:0x0074, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[Catch: iF -> 0x0107, SYNTHETIC, TRY_LEAVE, TryCatch #3 {iF -> 0x0107, blocks: (B:219:0x0074, B:228:0x00dd, B:230:0x00e5, B:232:0x00eb, B:233:0x010a, B:234:0x0125, B:236:0x012b, B:238:0x012f, B:240:0x0141, B:241:0x0144, B:244:0x015a, B:246:0x0169, B:247:0x0170, B:251:0x017d, B:253:0x018a, B:256:0x0197, B:258:0x019b, B:259:0x01bf, B:261:0x01c6, B:263:0x01d8, B:269:0x00a6, B:271:0x00af, B:276:0x05bb, B:277:0x05be, B:279:0x05c5, B:280:0x05c7, B:282:0x007b, B:283:0x007d, B:290:0x0089, B:298:0x05ca, B:273:0x00d7, B:285:0x007e, B:288:0x0085, B:225:0x0099, B:227:0x009d, B:266:0x00a5), top: B:218:0x0074, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(ByteBuffer byteBuffer, long j5, int i) {
        boolean z3;
        boolean z5;
        AudioTrack c5;
        Object obj;
        C0802bc c0802bc;
        ZE ze;
        boolean equals;
        C1378oF c1378oF;
        long j6;
        int i5;
        int b02;
        int i6;
        int i7;
        byte b3;
        int i8;
        int i9;
        int i10;
        int i11;
        LogSessionId unused;
        ByteBuffer byteBuffer2 = this.f15439H;
        AbstractC1668us.S(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f15465m != null) {
            if (j()) {
                C1378oF c1378oF2 = this.f15465m;
                C1378oF c1378oF3 = this.f15466n;
                if (c1378oF3.f14793c == c1378oF2.f14793c && c1378oF3.f14796g == c1378oF2.f14796g && c1378oF3.f14795e == c1378oF2.f14795e && c1378oF3.f == c1378oF2.f && c1378oF3.f14794d == c1378oF2.f14794d) {
                    this.f15466n = c1378oF2;
                    this.f15465m = null;
                    AudioTrack audioTrack = this.f15468p;
                    if (audioTrack != null && m(audioTrack)) {
                        this.f15466n.getClass();
                    }
                } else {
                    g();
                    if (!t()) {
                        p();
                    }
                }
                d(j5);
            }
            return false;
        }
        boolean k5 = k();
        T2.z zVar = this.i;
        if (!k5) {
            try {
                if (((Exception) zVar.f5756m) != null) {
                    synchronized (f15429Z) {
                        z3 = f15431b0 > 0;
                    }
                    if (z3 || SystemClock.elapsedRealtime() < zVar.f5755l) {
                        z5 = true;
                        if (!z5) {
                            try {
                                c1378oF = this.f15466n;
                            } catch (C1110iF e3) {
                                C1378oF c1378oF4 = this.f15466n;
                                if (c1378oF4.f14797h > 1000000) {
                                    C1378oF c1378oF5 = new C1378oF(c1378oF4.f14791a, c1378oF4.f14792b, c1378oF4.f14793c, c1378oF4.f14794d, c1378oF4.f14795e, c1378oF4.f, c1378oF4.f14796g, 1000000, c1378oF4.i);
                                    try {
                                        c5 = c(c1378oF5);
                                        this.f15466n = c1378oF5;
                                    } catch (C1110iF e5) {
                                        e3.addSuppressed(e5);
                                        if (this.f15466n.f14793c == 1) {
                                            throw e3;
                                        }
                                        this.f15448S = true;
                                        throw e3;
                                    }
                                }
                                if (this.f15466n.f14793c == 1) {
                                }
                            }
                            if (c1378oF == null) {
                                throw null;
                            }
                            c5 = c(c1378oF);
                            this.f15468p = c5;
                            if (m(c5)) {
                                AudioTrack audioTrack2 = this.f15468p;
                                if (this.f15461h == null) {
                                    Fx fx = new Fx();
                                    fx.f9144l = this;
                                    fx.f9145m = new Handler(Looper.myLooper());
                                    fx.f9143k = new C1512rF(fx);
                                    this.f15461h = fx;
                                }
                                Fx fx2 = this.f15461h;
                                Handler handler = (Handler) fx2.f9145m;
                                Objects.requireNonNull(handler);
                                audioTrack2.registerStreamEventCallback(new ExecutorC1590t3(handler, 1), (C1512rF) fx2.f9143k);
                                this.f15466n.getClass();
                            }
                            int i12 = AbstractC1260lo.f14419a;
                            if (i12 >= 31 && (ze = this.f15463k) != null) {
                                AudioTrack audioTrack3 = this.f15468p;
                                YE ye = ze.f12471b;
                                ye.getClass();
                                LogSessionId logSessionId = ye.f12310a;
                                unused = LogSessionId.LOG_SESSION_ID_NONE;
                                equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                if (!equals) {
                                    audioTrack3.setLogSessionId(logSessionId);
                                }
                            }
                            this.f15444O = this.f15468p.getAudioSessionId();
                            C1243lF c1243lF = this.f;
                            AudioTrack audioTrack4 = this.f15468p;
                            C1378oF c1378oF6 = this.f15466n;
                            c1243lF.b(audioTrack4, c1378oF6.f14793c == 2, c1378oF6.f14796g, c1378oF6.f14794d, c1378oF6.f14797h);
                            if (k()) {
                                this.f15468p.setVolume(this.f15438G);
                            }
                            this.f15445P.getClass();
                            Dp dp = this.f15446Q;
                            if (dp != null && i12 >= 23) {
                                this.f15468p.setPreferredDevice((AudioDeviceInfo) dp.f8377l);
                                C0802bc c0802bc2 = this.f15470r;
                                if (c0802bc2 != null) {
                                    c0802bc2.h((AudioDeviceInfo) this.f15446Q.f8377l);
                                }
                            }
                            if (i12 >= 24 && (c0802bc = this.f15470r) != null) {
                                AudioTrack audioTrack5 = this.f15468p;
                                final Fx fx3 = new Fx();
                                fx3.f9145m = audioTrack5;
                                fx3.f9143k = c0802bc;
                                fx3.f9144l = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.qF
                                    public final void onRoutingChanged(AudioRouting audioRouting) {
                                        AudioDeviceInfo routedDevice;
                                        AudioDeviceInfo routedDevice2;
                                        Fx fx4 = Fx.this;
                                        if (((C1468qF) fx4.f9144l) == null) {
                                            return;
                                        }
                                        routedDevice = audioRouting.getRoutedDevice();
                                        if (routedDevice != null) {
                                            C0802bc c0802bc3 = (C0802bc) fx4.f9143k;
                                            routedDevice2 = audioRouting.getRoutedDevice();
                                            c0802bc3.h(routedDevice2);
                                        }
                                    }
                                };
                                audioTrack5.addOnRoutingChangedListener((C1468qF) fx3.f9144l, new Handler(Looper.myLooper()));
                                this.f15471s = fx3;
                            }
                            this.f15436E = true;
                            Hq hq = this.f15464l;
                            if (hq != null) {
                                C1020gF a5 = this.f15466n.a();
                                Er er = ((C1602tF) hq.f9491l).f15666J0;
                                Handler handler2 = (Handler) er.f8617l;
                                if (handler2 != null) {
                                    handler2.post(new RunnableC0975fF(er, a5, 3));
                                }
                            }
                            obj = null;
                        }
                        return false;
                    }
                }
                z5 = false;
                if (!z5) {
                }
                return false;
            } catch (C1110iF e6) {
                if (e6.f13927l) {
                    throw e6;
                }
                zVar.h(e6);
                return false;
            }
        }
        obj = null;
        zVar.f5756m = obj;
        zVar.f5754k = -9223372036854775807L;
        zVar.f5755l = -9223372036854775807L;
        if (this.f15436E) {
            this.f15437F = Math.max(0L, j5);
            this.f15435D = false;
            this.f15436E = false;
            d(j5);
            if (this.f15443N) {
                q();
            }
        }
        long b5 = b();
        C1243lF c1243lF2 = this.f;
        AudioTrack audioTrack6 = c1243lF2.f14347c;
        audioTrack6.getClass();
        int playState = audioTrack6.getPlayState();
        if (c1243lF2.f14350g) {
            if (playState == 2) {
                c1243lF2.f14357o = false;
                return false;
            }
            if (playState == 1) {
                if (c1243lF2.d() != 0) {
                    playState = 1;
                }
                return false;
            }
        }
        boolean z6 = c1243lF2.f14357o;
        boolean c6 = c1243lF2.c(b5);
        c1243lF2.f14357o = c6;
        if (z6 && !c6 && playState != 1) {
            int i13 = c1243lF2.f14348d;
            long v4 = AbstractC1260lo.v(c1243lF2.f14351h);
            C1557sF c1557sF = (C1557sF) c1243lF2.f14345a.f11279l;
            if (c1557sF.f15464l != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - c1557sF.f15447R;
                Er er2 = ((C1602tF) c1557sF.f15464l.f9491l).f15666J0;
                Handler handler3 = (Handler) er2.f8617l;
                if (handler3 != null) {
                    handler3.post(new RunnableC0975fF(er2, i13, v4, elapsedRealtime));
                }
            }
        }
        if (this.f15439H == null) {
            AbstractC1668us.S(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C1378oF c1378oF7 = this.f15466n;
            if (c1378oF7.f14793c == 0 || this.f15434C != 0) {
                j6 = -9223372036854775807L;
            } else {
                int i14 = c1378oF7.f14796g;
                if (i14 != 20) {
                    if (i14 != 30) {
                        j6 = -9223372036854775807L;
                        switch (i14) {
                            case 5:
                            case 6:
                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                    b02 = JB.f9890a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    break;
                                } else {
                                    b02 = 1536;
                                    break;
                                }
                            case 7:
                            case 8:
                                break;
                            case 9:
                                int i15 = byteBuffer.getInt(byteBuffer.position());
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    i15 = Integer.reverseBytes(i15);
                                }
                                if ((i15 & (-2097152)) == -2097152 && (i9 = (i15 >>> 19) & 3) != 1 && (i10 = (i15 >>> 17) & 3) != 0) {
                                    int i16 = (i15 >>> 10) & 3;
                                    int i17 = (i15 >>> 12) & 15;
                                    if (i17 != 0 && i17 != 15 && i16 != 3) {
                                        b02 = 1152;
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                b02 = 384;
                                            }
                                        } else if (i9 != 3) {
                                            b02 = 576;
                                        }
                                        if (b02 == -1) {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                }
                                b02 = -1;
                                if (b02 == -1) {
                                }
                                break;
                            case 10:
                                b02 = 1024;
                                break;
                            case 11:
                            case 12:
                                b02 = 2048;
                                break;
                            default:
                                char c7 = 16;
                                switch (i14) {
                                    case 14:
                                        int position = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i18 = position;
                                        while (true) {
                                            if (i18 <= limit) {
                                                int i19 = byteBuffer.getInt(i18 + 4);
                                                char c8 = c7;
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    i19 = Integer.reverseBytes(i19);
                                                }
                                                if ((i19 & (-2)) == -126718022) {
                                                    i11 = i18 - position;
                                                } else {
                                                    i18++;
                                                    c7 = c8;
                                                }
                                            } else {
                                                i11 = -1;
                                            }
                                        }
                                        if (i11 == -1) {
                                            b02 = 0;
                                            break;
                                        } else {
                                            b02 = (40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            break;
                                        }
                                    case 15:
                                        b02 = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        byte[] bArr = new byte[16];
                                        int position2 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position2);
                                        b02 = AbstractC1561sb.a(new C0826c0(16, bArr)).f15623c;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        throw new IllegalStateException(AbstractC2107A.q("Unexpected audio encoding: ", i14));
                                }
                        }
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                        if (byteBuffer.getInt(0) == 622876772) {
                            b02 = 4096;
                        } else {
                            int position3 = byteBuffer.position();
                            byte b6 = byteBuffer.get(position3);
                            if (b6 != -2) {
                                if (b6 == -1) {
                                    i7 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                    b3 = byteBuffer.get(position3 + 7);
                                } else if (b6 != 31) {
                                    i7 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                    i8 = byteBuffer.get(position3 + 5) & 252;
                                    i6 = (i8 >> 2) | i7;
                                } else {
                                    i7 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                    b3 = byteBuffer.get(position3 + 6);
                                }
                                i8 = b3 & 60;
                                i6 = (i8 >> 2) | i7;
                            } else {
                                i6 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
                            }
                            b02 = (i6 + 1) * 32;
                        }
                    }
                    b02 = 1024;
                } else {
                    j6 = -9223372036854775807L;
                    if ((byteBuffer.get(5) & 2) == 0) {
                        i5 = 0;
                    } else {
                        byte b7 = byteBuffer.get(26);
                        int i20 = 28;
                        int i21 = 28;
                        for (int i22 = 0; i22 < b7; i22++) {
                            i21 += byteBuffer.get(i22 + 27);
                        }
                        byte b8 = byteBuffer.get(i21 + 26);
                        for (int i23 = 0; i23 < b8; i23++) {
                            i20 += byteBuffer.get(i21 + 27 + i23);
                        }
                        i5 = i21 + i20;
                    }
                    int i24 = byteBuffer.get(i5 + 26) + 27 + i5;
                    b02 = (int) ((AbstractC1803xs.b0(byteBuffer.get(i24), byteBuffer.limit() - i24 > 1 ? byteBuffer.get(i24 + 1) : (byte) 0) * 48000) / 1000000);
                }
                this.f15434C = b02;
                if (b02 == 0) {
                    return true;
                }
            }
            if (this.f15473u != null) {
                if (j()) {
                    d(j5);
                    this.f15473u = null;
                }
                return false;
            }
            long t5 = AbstractC1260lo.t(this.f15466n.f14791a.f14887C, a() - this.f15457c.f16105o) + this.f15437F;
            if (!this.f15435D && Math.abs(t5 - j5) > 200000) {
                Hq hq2 = this.f15464l;
                if (hq2 != null) {
                    hq2.c(new C1650ua("Unexpected audio track timestamp discontinuity: expected " + t5 + ", got " + j5));
                }
                this.f15435D = true;
            }
            if (this.f15435D) {
                if (j()) {
                    long j7 = j5 - t5;
                    this.f15437F += j7;
                    this.f15435D = false;
                    d(j5);
                    Hq hq3 = this.f15464l;
                    if (hq3 != null && j7 != 0) {
                        ((C1602tF) hq3.f9491l).f15675S0 = true;
                    }
                }
                return false;
            }
            if (this.f15466n.f14793c == 0) {
                this.f15477y += byteBuffer.remaining();
            } else {
                this.f15478z = (this.f15434C * i) + this.f15478z;
            }
            this.f15439H = byteBuffer;
            this.f15440I = i;
        } else {
            j6 = -9223372036854775807L;
        }
        h();
        if (!this.f15439H.hasRemaining()) {
            this.f15439H = null;
            this.f15440I = 0;
            return true;
        }
        long b9 = b();
        if (c1243lF2.f14367y != j6 && b9 > 0) {
            c1243lF2.f14344G.getClass();
            if (SystemClock.elapsedRealtime() - c1243lF2.f14367y >= 200) {
                JB.l("DefaultAudioSink", "Resetting stalled audio track");
                p();
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        boolean isOffloadedPlayback;
        if (!k()) {
            return false;
        }
        if (AbstractC1260lo.f14419a >= 29) {
            isOffloadedPlayback = this.f15468p.isOffloadedPlayback();
            if (isOffloadedPlayback && this.f15442M) {
                return false;
            }
        }
        return this.f.c(b());
    }
}
