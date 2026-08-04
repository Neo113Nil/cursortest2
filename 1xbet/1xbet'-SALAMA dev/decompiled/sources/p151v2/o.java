package p151v2;

import A1.w0;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f17146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f17150e = w0.f605d;

    public o(p pVar) {
        this.f17146a = pVar;
    }

    @Override // p151v2.h
    public final long a() {
        long j = this.f17148c;
        if (!this.f17147b) {
            return j;
        }
        this.f17146a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f17149d;
        w0 w0Var = this.f17150e;
        return j + (w0Var.f606a == 1.0f ? t.E(jElapsedRealtime) : jElapsedRealtime * ((long) w0Var.f608c));
    }

    @Override // p151v2.h
    public final void b(w0 w0Var) {
        if (this.f17147b) {
            c(a());
        }
        this.f17150e = w0Var;
    }

    public final void c(long j) {
        this.f17148c = j;
        if (this.f17147b) {
            this.f17146a.getClass();
            this.f17149d = SystemClock.elapsedRealtime();
        }
    }

    @Override // p151v2.h
    public final w0 d() {
        return this.f17150e;
    }

    public final void e() {
        if (this.f17147b) {
            return;
        }
        this.f17146a.getClass();
        this.f17149d = SystemClock.elapsedRealtime();
        this.f17147b = true;
    }
}
