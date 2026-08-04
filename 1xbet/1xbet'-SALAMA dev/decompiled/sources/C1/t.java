package C1;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f1520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1525f;

    public t(AudioTrack audioTrack) {
        if (p151v2.t.f17159a >= 19) {
            this.f1520a = new s(audioTrack);
            a();
        } else {
            this.f1520a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f1520a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f1521b = i7;
        if (i7 == 0) {
            this.f1524e = 0L;
            this.f1525f = -1L;
            this.f1522c = System.nanoTime() / 1000;
            this.f1523d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f1523d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f1523d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f1523d = 500000L;
        }
    }
}
