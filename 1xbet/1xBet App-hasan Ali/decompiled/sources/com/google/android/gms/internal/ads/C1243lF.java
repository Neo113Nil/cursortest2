package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.lF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243lF {

    /* renamed from: A, reason: collision with root package name */
    public long f14338A;

    /* renamed from: B, reason: collision with root package name */
    public long f14339B;

    /* renamed from: C, reason: collision with root package name */
    public long f14340C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14341D;

    /* renamed from: E, reason: collision with root package name */
    public long f14342E;

    /* renamed from: F, reason: collision with root package name */
    public long f14343F;

    /* renamed from: G, reason: collision with root package name */
    public Nm f14344G;

    /* renamed from: a, reason: collision with root package name */
    public final Qs f14345a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f14346b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f14347c;

    /* renamed from: d, reason: collision with root package name */
    public int f14348d;

    /* renamed from: e, reason: collision with root package name */
    public C1198kF f14349e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14350g;

    /* renamed from: h, reason: collision with root package name */
    public long f14351h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14352j;

    /* renamed from: k, reason: collision with root package name */
    public long f14353k;

    /* renamed from: l, reason: collision with root package name */
    public long f14354l;

    /* renamed from: m, reason: collision with root package name */
    public Method f14355m;

    /* renamed from: n, reason: collision with root package name */
    public long f14356n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14357o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14358p;

    /* renamed from: q, reason: collision with root package name */
    public long f14359q;

    /* renamed from: r, reason: collision with root package name */
    public long f14360r;

    /* renamed from: s, reason: collision with root package name */
    public long f14361s;

    /* renamed from: t, reason: collision with root package name */
    public long f14362t;

    /* renamed from: u, reason: collision with root package name */
    public long f14363u;

    /* renamed from: v, reason: collision with root package name */
    public int f14364v;

    /* renamed from: w, reason: collision with root package name */
    public int f14365w;

    /* renamed from: x, reason: collision with root package name */
    public long f14366x;

    /* renamed from: y, reason: collision with root package name */
    public long f14367y;

    /* renamed from: z, reason: collision with root package name */
    public long f14368z;

    public C1243lF(Qs qs) {
        this.f14345a = qs;
        try {
            this.f14355m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14346b = new long[10];
        this.f14344G = Nm.f10813a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z3) {
        C1243lF c1243lF;
        C1557sF c1557sF;
        long j5;
        boolean z5;
        float f;
        boolean z6;
        long t5;
        long j6;
        boolean timestamp;
        long j7;
        long j8;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.f14347c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        C1557sF c1557sF2 = (C1557sF) this.f14345a.f11279l;
        if (playState == 3) {
            this.f14344G.getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f14354l >= 30000) {
                long t6 = AbstractC1260lo.t(this.f, d());
                if (t6 != 0) {
                    int i = this.f14364v;
                    f = 1.0f;
                    float f5 = this.i;
                    if (f5 == 1.0f) {
                        j5 = 1000;
                    } else {
                        j5 = 1000;
                        t6 = Math.round(t6 / f5);
                    }
                    long[] jArr = this.f14346b;
                    jArr[i] = t6 - nanoTime;
                    this.f14364v = (this.f14364v + 1) % 10;
                    int i5 = this.f14365w;
                    if (i5 < 10) {
                        this.f14365w = i5 + 1;
                    }
                    this.f14354l = nanoTime;
                    this.f14353k = 0L;
                    int i6 = 0;
                    while (true) {
                        int i7 = this.f14365w;
                        if (i6 >= i7) {
                            break;
                        }
                        this.f14353k = (jArr[i6] / i7) + this.f14353k;
                        i6++;
                    }
                }
            } else {
                j5 = 1000;
                f = 1.0f;
            }
            if (this.f14350g) {
                c1243lF = this;
                c1557sF = c1557sF2;
                z5 = false;
            } else {
                C1198kF c1198kF = this.f14349e;
                c1198kF.getClass();
                long j9 = nanoTime - c1198kF.f14237e;
                long j10 = c1198kF.f14236d;
                C1276m3 c1276m3 = c1198kF.f14233a;
                if (j9 < j10) {
                    timestamp = false;
                    j7 = 500000;
                } else {
                    c1198kF.f14237e = nanoTime;
                    AudioTrack audioTrack3 = (AudioTrack) c1276m3.f14468d;
                    AudioTimestamp audioTimestamp = (AudioTimestamp) c1276m3.f14469e;
                    timestamp = audioTrack3.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j7 = 500000;
                        long j11 = audioTimestamp.framePosition;
                        if (c1276m3.f14466b > j11) {
                            c1276m3.f14465a++;
                        }
                        c1276m3.f14466b = j11;
                        c1276m3.f14467c = j11 + (c1276m3.f14465a << 32);
                    } else {
                        j7 = 500000;
                    }
                    int i8 = c1198kF.f14234b;
                    if (i8 == 0) {
                        if (timestamp) {
                            if (audioTimestamp.nanoTime / j5 >= c1198kF.f14235c) {
                                c1198kF.f = c1276m3.f14467c;
                                c1198kF.a(1);
                                timestamp = true;
                            }
                        } else if (nanoTime - c1198kF.f14235c > j7) {
                            c1198kF.a(3);
                        }
                        timestamp = false;
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            if (!timestamp) {
                                c1198kF.a(0);
                                timestamp = false;
                            }
                            timestamp = true;
                        } else if (i8 == 3) {
                            if (timestamp) {
                                c1198kF.a(0);
                                timestamp = true;
                            }
                            timestamp = false;
                        }
                    } else if (timestamp) {
                        if (c1276m3.f14467c > c1198kF.f) {
                            c1198kF.a(2);
                        }
                        timestamp = true;
                    } else {
                        c1198kF.a(0);
                        timestamp = false;
                    }
                }
                if (timestamp) {
                    j8 = 5000000;
                    long j12 = ((AudioTimestamp) c1276m3.f14469e).nanoTime / j5;
                    long j13 = c1276m3.f14467c;
                    long t7 = AbstractC1260lo.t(this.f, d());
                    if (Math.abs(j12 - nanoTime) > 5000000) {
                        JB.l("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j13 + ", " + j12 + ", " + nanoTime + ", " + t7 + ", " + c1557sF2.a() + ", " + c1557sF2.b());
                        c1198kF.a(4);
                        c1243lF = this;
                        c1557sF = c1557sF2;
                        z5 = false;
                    } else {
                        if (Math.abs(AbstractC1260lo.t(this.f, j13) - t7) > 5000000) {
                            c1557sF = c1557sF2;
                            JB.l("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j12 + ", " + nanoTime + ", " + t7 + ", " + c1557sF2.a() + ", " + c1557sF2.b());
                            c1198kF.a(4);
                        } else {
                            c1557sF = c1557sF2;
                            if (c1198kF.f14234b == 4) {
                                z5 = false;
                                c1198kF.a(0);
                                c1243lF = this;
                            }
                        }
                        z5 = false;
                        c1243lF = this;
                    }
                } else {
                    c1243lF = this;
                    c1557sF = c1557sF2;
                    z5 = false;
                    j8 = 5000000;
                }
                if (c1243lF.f14358p && (method = c1243lF.f14355m) != null && nanoTime - c1243lF.f14359q >= j7) {
                    try {
                        audioTrack = c1243lF.f14347c;
                    } catch (Exception unused) {
                        c1243lF.f14355m = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i9 = AbstractC1260lo.f14419a;
                    long intValue = (num.intValue() * j5) - c1243lF.f14351h;
                    c1243lF.f14356n = intValue;
                    long max = Math.max(intValue, 0L);
                    c1243lF.f14356n = max;
                    if (max > j8) {
                        JB.l("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                        c1243lF.f14356n = 0L;
                    }
                    c1243lF.f14359q = nanoTime;
                }
            }
            c1243lF.f14344G.getClass();
            long nanoTime2 = System.nanoTime() / j5;
            C1198kF c1198kF2 = c1243lF.f14349e;
            c1198kF2.getClass();
            z6 = c1198kF2.f14234b != 2 ? true : z5;
            if (z6) {
                t5 = c1243lF.f14365w == 0 ? AbstractC1260lo.t(c1243lF.f, c1243lF.d()) : AbstractC1260lo.r(c1243lF.i, c1243lF.f14353k + nanoTime2);
                if (!z3) {
                    t5 = Math.max(0L, t5 - c1243lF.f14356n);
                }
            } else {
                C1276m3 c1276m32 = c1198kF2.f14233a;
                t5 = AbstractC1260lo.r(c1243lF.i, nanoTime2 - (((AudioTimestamp) c1276m32.f14469e).nanoTime / j5)) + AbstractC1260lo.t(c1243lF.f, c1276m32.f14467c);
            }
            if (c1243lF.f14341D != z6) {
                c1243lF.f14343F = c1243lF.f14340C;
                c1243lF.f14342E = c1243lF.f14339B;
            }
            j6 = nanoTime2 - c1243lF.f14343F;
            if (j6 < 1000000) {
                long r5 = AbstractC1260lo.r(c1243lF.i, j6) + c1243lF.f14342E;
                long j14 = (j6 * j5) / 1000000;
                t5 = (((j5 - j14) * r5) + (t5 * j14)) / j5;
            }
            if (!c1243lF.f14352j) {
                long j15 = c1243lF.f14339B;
                if (t5 > j15) {
                    c1243lF.f14352j = true;
                    float f6 = c1243lF.i;
                    long v4 = AbstractC1260lo.v(t5 - j15);
                    if (f6 != f) {
                        v4 = Math.round(v4 / f6);
                    }
                    c1243lF.f14344G.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - AbstractC1260lo.v(v4);
                    Hq hq = c1557sF.f15464l;
                    if (hq != null) {
                        Er er = ((C1602tF) hq.f9491l).f15666J0;
                        Handler handler = (Handler) er.f8617l;
                        if (handler != null) {
                            handler.post(new RunnableC0975fF(er, currentTimeMillis));
                        }
                    }
                }
            }
            c1243lF.f14340C = nanoTime2;
            c1243lF.f14339B = t5;
            c1243lF.f14341D = z6;
            return t5;
        }
        c1243lF = this;
        c1557sF = c1557sF2;
        j5 = 1000;
        z5 = false;
        f = 1.0f;
        c1243lF.f14344G.getClass();
        long nanoTime22 = System.nanoTime() / j5;
        C1198kF c1198kF22 = c1243lF.f14349e;
        c1198kF22.getClass();
        if (c1198kF22.f14234b != 2) {
        }
        if (z6) {
        }
        if (c1243lF.f14341D != z6) {
        }
        j6 = nanoTime22 - c1243lF.f14343F;
        if (j6 < 1000000) {
        }
        if (!c1243lF.f14352j) {
        }
        c1243lF.f14340C = nanoTime22;
        c1243lF.f14339B = t5;
        c1243lF.f14341D = z6;
        return t5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AudioTrack audioTrack, boolean z3, int i, int i5, int i6) {
        boolean z5;
        boolean c5;
        long j5;
        this.f14347c = audioTrack;
        this.f14348d = i6;
        this.f14349e = new C1198kF(audioTrack);
        this.f = audioTrack.getSampleRate();
        if (z3 && AbstractC1260lo.f14419a < 23) {
            z5 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.f14350g = z5;
            c5 = AbstractC1260lo.c(i);
            this.f14358p = c5;
            if (c5) {
                j5 = -9223372036854775807L;
            } else {
                j5 = AbstractC1260lo.t(this.f, i6 / i5);
            }
            this.f14351h = j5;
            this.f14361s = 0L;
            this.f14362t = 0L;
            this.f14363u = 0L;
            this.f14357o = false;
            this.f14366x = -9223372036854775807L;
            this.f14367y = -9223372036854775807L;
            this.f14359q = 0L;
            this.f14356n = 0L;
            this.i = 1.0f;
        }
        z5 = false;
        this.f14350g = z5;
        c5 = AbstractC1260lo.c(i);
        this.f14358p = c5;
        if (c5) {
        }
        this.f14351h = j5;
        this.f14361s = 0L;
        this.f14362t = 0L;
        this.f14363u = 0L;
        this.f14357o = false;
        this.f14366x = -9223372036854775807L;
        this.f14367y = -9223372036854775807L;
        this.f14359q = 0L;
        this.f14356n = 0L;
        this.i = 1.0f;
    }

    public final boolean c(long j5) {
        long a5 = a(false);
        int i = this.f;
        int i5 = AbstractC1260lo.f14419a;
        if (j5 > AbstractC1260lo.u(a5, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f14350g) {
            AudioTrack audioTrack = this.f14347c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && d() == 0) {
                return true;
            }
        }
        return false;
    }

    public final long d() {
        this.f14344G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.f14366x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f14347c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f14368z;
            }
            return Math.min(this.f14338A, this.f14368z + AbstractC1260lo.u(AbstractC1260lo.r(this.i, AbstractC1260lo.s(elapsedRealtime) - this.f14366x), this.f, 1000000L, RoundingMode.UP));
        }
        if (elapsedRealtime - this.f14360r >= 5) {
            AudioTrack audioTrack2 = this.f14347c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j5 = 0;
                if (this.f14350g) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f14363u = this.f14361s;
                    }
                    playbackHeadPosition += this.f14363u;
                    playState = i;
                }
                if (AbstractC1260lo.f14419a <= 29) {
                    if (playbackHeadPosition != 0) {
                        j5 = playbackHeadPosition;
                    } else if (this.f14361s > 0 && playState == 3) {
                        if (this.f14367y == -9223372036854775807L) {
                            this.f14367y = elapsedRealtime;
                        }
                    }
                    this.f14367y = -9223372036854775807L;
                    playbackHeadPosition = j5;
                }
                if (this.f14361s > playbackHeadPosition) {
                    this.f14362t++;
                }
                this.f14361s = playbackHeadPosition;
            }
            this.f14360r = elapsedRealtime;
        }
        return this.f14361s + (this.f14362t << 32);
    }
}
