package sg.bigo.ads.K0;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public final long f12341a;
    public long b;
    public long c;
    public long d;
    public long g;
    public boolean e = false;
    public boolean f = false;
    public final D h = new D(this);

    public E(long j, long j2) {
        this.f12341a = j2;
        this.g = j;
    }

    public final synchronized void a() {
        this.e = true;
        this.h.removeMessages(1);
    }

    public abstract void a(long j);

    public final boolean b() {
        return !this.f && this.e;
    }

    public abstract void c();

    public final void d() {
        if (this.f || this.e) {
            return;
        }
        a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.d = elapsedRealtime;
        this.g = this.b - elapsedRealtime;
    }

    public final synchronized void e() {
        this.e = false;
        if (this.g <= 0) {
            if (!this.f) {
                this.f = true;
                c();
            }
        } else {
            this.b = SystemClock.elapsedRealtime() + this.g;
            D d = this.h;
            d.sendMessage(d.obtainMessage(1));
        }
    }
}
