package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class r<Z> implements x<Z> {
    public final boolean a;
    public final boolean b;
    public final x<Z> c;
    public final a d;
    public final com.bumptech.glide.load.g e;
    public int f;
    public boolean i;

    public interface a {
        void a(com.bumptech.glide.load.g gVar, r<?> rVar);
    }

    public r(x<Z> xVar, boolean z, boolean z2, com.bumptech.glide.load.g gVar, a aVar) {
        com.bumptech.glide.util.l.c(xVar, "Argument must not be null");
        this.c = xVar;
        this.a = z;
        this.b = z2;
        this.e = gVar;
        com.bumptech.glide.util.l.c(aVar, "Argument must not be null");
        this.d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return this.c.a();
    }

    public final synchronized void b() {
        if (this.i) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<Z> c() {
        return this.c.c();
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Z get() {
        return this.c.get();
    }

    @Override // com.bumptech.glide.load.engine.x
    public final synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.i) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.i = true;
        if (this.b) {
            this.c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.i + ", resource=" + this.c + '}';
    }
}
