package C1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f1526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1527B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f1528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f1529D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f1530E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f1531F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1052y0 f1532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f1533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f1534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f1537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1540i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f1544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1555y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1556z;

    public u(C1052y0 c1052y0) {
        this.f1532a = c1052y0;
        if (p151v2.t.f17159a >= 18) {
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
            return Math.min(this.f1526A, this.f1556z + ((((SystemClock.elapsedRealtime() * 1000) - this.f1554x) * ((long) this.f1538g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f1539h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f1551u = this.f1549s;
            }
            playbackHeadPosition += this.f1551u;
        }
        if (p151v2.t.f17159a <= 29) {
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
