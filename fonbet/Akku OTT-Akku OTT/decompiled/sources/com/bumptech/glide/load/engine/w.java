package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.pool.a;
import com.bumptech.glide.util.pool.d;

/* loaded from: classes3.dex */
public final class w<Z> implements x<Z>, a.d {
    public static final a.c e = com.bumptech.glide.util.pool.a.a(20, new a());
    public final d.a a = new d.a();
    public x<Z> b;
    public boolean c;
    public boolean d;

    public class a implements a.b<w<?>> {
        @Override // com.bumptech.glide.util.pool.a.b
        public final w<?> create() {
            return new w<>();
        }
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @NonNull
    public final d.a b() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<Z> c() {
        return this.b.c();
    }

    public final synchronized void d() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Z get() {
        return this.b.get();
    }

    @Override // com.bumptech.glide.load.engine.x
    public final synchronized void recycle() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            this.b = null;
            e.release(this);
        }
    }
}
