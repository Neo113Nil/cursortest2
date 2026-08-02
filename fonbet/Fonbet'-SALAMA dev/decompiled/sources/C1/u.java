package C1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import w1.C1761y0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public long f1526A;

    /* renamed from: B, reason: collision with root package name */
    public long f1527B;

    /* renamed from: C, reason: collision with root package name */
    public long f1528C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1529D;

    /* renamed from: E, reason: collision with root package name */
    public long f1530E;

    /* renamed from: F, reason: collision with root package name */
    public long f1531F;

    /* renamed from: a, reason: collision with root package name */
    public final C1761y0 f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1533b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f1534c;

    /* renamed from: d, reason: collision with root package name */
    public int f1535d;

    /* renamed from: e, reason: collision with root package name */
    public int f1536e;

    /* renamed from: f, reason: collision with root package name */
    public t f1537f;

    /* renamed from: g, reason: collision with root package name */
    public int f1538g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1539h;

    /* renamed from: i, reason: collision with root package name */
    public long f1540i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1541k;

    /* renamed from: l, reason: collision with root package name */
    public long f1542l;

    /* renamed from: m, reason: collision with root package name */
    public long f1543m;

    /* renamed from: n, reason: collision with root package name */
    public Method f1544n;

    /* renamed from: o, reason: collision with root package name */
    public long f1545o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1546p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1547q;

    /* renamed from: r, reason: collision with root package name */
    public long f1548r;

    /* renamed from: s, reason: collision with root package name */
    public long f1549s;

    /* renamed from: t, reason: collision with root package name */
    public long f1550t;

    /* renamed from: u, reason: collision with root package name */
    public long f1551u;

    /* renamed from: v, reason: collision with root package name */
    public int f1552v;

    /* renamed from: w, reason: collision with root package name */
    public int f1553w;

    /* renamed from: x, reason: collision with root package name */
    public long f1554x;

    /* renamed from: y, reason: collision with root package name */
    public long f1555y;

    /* renamed from: z, reason: collision with root package name */
    public long f1556z;

    public u(C1761y0 c1761y0) {
        this.f1532a = c1761y0;
        if (v2.t.f17153a >= 18) {
            try {
                this.f1544n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f1533b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f1534c;
        audioTrack.getClass();
        if (this.f1554x != -9223372036854775807L) {
            return Math.min(this.f1526A, this.f1556z + ((((SystemClock.elapsedRealtime() * 1000) - this.f1554x) * this.f1538g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f1539h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f1551u = this.f1549s;
            }
            playbackHeadPosition += this.f1551u;
        }
        if (v2.t.f17153a <= 29) {
            if (playbackHeadPosition == 0 && this.f1549s > 0 && playState == 3) {
                if (this.f1555y == -9223372036854775807L) {
                    this.f1555y = SystemClock.elapsedRealtime();
                }
                return this.f1549s;
            }
            this.f1555y = -9223372036854775807L;
        }
        if (this.f1549s > playbackHeadPosition) {
            this.f1550t++;
        }
        this.f1549s = playbackHeadPosition;
        return playbackHeadPosition + (this.f1550t << 32);
    }

    public final boolean b(long j) {
        if (j <= a()) {
            if (this.f1539h) {
                AudioTrack audioTrack = this.f1534c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }
}
