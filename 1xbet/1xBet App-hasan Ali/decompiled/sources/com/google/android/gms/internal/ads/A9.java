package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class A9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7539a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7540b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f7541c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7542d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f7541c;
    }

    public final synchronized void b(boolean z3, float f) {
        this.f7540b = z3;
        this.f7541c = f;
    }

    public final synchronized boolean c(boolean z3) {
        if (!this.f7542d.get()) {
            return z3;
        }
        return this.f7539a;
    }
}
