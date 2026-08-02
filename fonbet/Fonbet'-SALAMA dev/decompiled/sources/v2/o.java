package v2;

import A1.w0;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    public final p f17140a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17141b;

    /* renamed from: c, reason: collision with root package name */
    public long f17142c;

    /* renamed from: d, reason: collision with root package name */
    public long f17143d;

    /* renamed from: e, reason: collision with root package name */
    public w0 f17144e = w0.f605d;

    public o(p pVar) {
        this.f17140a = pVar;
    }

    @Override // v2.h
    public final long a() {
        long j = this.f17142c;
        if (!this.f17141b) {
            return j;
        }
        this.f17140a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17143d;
        return j + (this.f17144e.f606a == 1.0f ? t.E(elapsedRealtime) : elapsedRealtime * r4.f608c);
    }

    @Override // v2.h
    public final void b(w0 w0Var) {
        if (this.f17141b) {
            c(a());
        }
        this.f17144e = w0Var;
    }

    public final void c(long j) {
        this.f17142c = j;
        if (this.f17141b) {
            this.f17140a.getClass();
            this.f17143d = SystemClock.elapsedRealtime();
        }
    }

    @Override // v2.h
    public final w0 d() {
        return this.f17144e;
    }

    public final void e() {
        if (this.f17141b) {
            return;
        }
        this.f17140a.getClass();
        this.f17143d = SystemClock.elapsedRealtime();
        this.f17141b = true;
    }
}
