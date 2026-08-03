package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446j0 {

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Fc f6143a;

    /* renamed from: b, reason: collision with root package name */
    public long f6144b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6145c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0674rl f6146d;

    public C0446j0(java.lang.String str, long j2, io.appmetrica.analytics.impl.C0674rl c0674rl) {
        this.f6144b = j2;
        try {
            this.f6143a = new io.appmetrica.analytics.impl.Fc(str);
        } catch (java.lang.Throwable unused) {
            this.f6143a = new io.appmetrica.analytics.impl.Fc();
        }
        this.f6146d = c0674rl;
    }

    public final synchronized void a(android.util.Pair pair) {
        if (this.f6146d.b(this.f6143a, (java.lang.String) pair.first, (java.lang.String) pair.second)) {
            this.f6145c = true;
        }
    }

    public final synchronized java.lang.String toString() {
        return "Map size " + this.f6143a.size() + ". Is changed " + this.f6145c + ". Current revision " + this.f6144b;
    }

    public final synchronized io.appmetrica.analytics.impl.C0421i0 a() {
        try {
            if (this.f6145c) {
                this.f6144b++;
                this.f6145c = false;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return new io.appmetrica.analytics.impl.C0421i0(io.appmetrica.analytics.impl.AbstractC0380gb.b(this.f6143a), this.f6144b);
    }
}
