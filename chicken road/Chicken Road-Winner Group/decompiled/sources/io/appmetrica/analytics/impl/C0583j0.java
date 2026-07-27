package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583j0 {

    /* renamed from: a, reason: collision with root package name */
    public Mc f7558a;

    /* renamed from: b, reason: collision with root package name */
    public long f7559b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7560c;

    /* renamed from: d, reason: collision with root package name */
    public final C0915vl f7561d;

    public C0583j0(String str, long j3, C0915vl c0915vl) {
        this.f7559b = j3;
        try {
            this.f7558a = new Mc(str);
        } catch (Throwable unused) {
            this.f7558a = new Mc();
        }
        this.f7561d = c0915vl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f7561d.b(this.f7558a, (String) pair.first, (String) pair.second)) {
            this.f7560c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f7558a.size() + ". Is changed " + this.f7560c + ". Current revision " + this.f7559b;
    }

    public final synchronized C0558i0 a() {
        try {
            if (this.f7560c) {
                this.f7559b++;
                this.f7560c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0558i0(AbstractC0698nb.b(this.f7558a), this.f7559b);
    }
}
