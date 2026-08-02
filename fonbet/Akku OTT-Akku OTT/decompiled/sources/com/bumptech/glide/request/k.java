package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class k implements f, d {

    @Nullable
    public final f a;
    public final Object b;
    public volatile j c;
    public volatile d d;

    @GuardedBy("requestLock")
    public int e = 3;

    @GuardedBy("requestLock")
    public int f = 3;

    @GuardedBy("requestLock")
    public boolean g;

    public k(Object obj, @Nullable f fVar) {
        this.b = obj;
        this.a = fVar;
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.d
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.f
    public final boolean c(d dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                f fVar = this.a;
                z = (fVar == null || fVar.c(this)) && dVar.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.f
    public final boolean d(d dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                f fVar = this.a;
                z = (fVar == null || fVar.d(this)) && (dVar.equals(this.c) || this.e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.f
    public final void e(d dVar) {
        synchronized (this.b) {
            try {
                if (!dVar.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                f fVar = this.a;
                if (fVar != null) {
                    fVar.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean f(d dVar) {
        if (!(dVar instanceof k)) {
            return false;
        }
        k kVar = (k) dVar;
        if (this.c == null) {
            if (kVar.c != null) {
                return false;
            }
        } else if (!this.c.f(kVar.c)) {
            return false;
        }
        return this.d == null ? kVar.d == null : this.d.f(kVar.d);
    }

    @Override // com.bumptech.glide.request.d
    public final void g() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.g();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.g();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public final f getRoot() {
        f root;
        synchronized (this.b) {
            try {
                f fVar = this.a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.f
    public final void h(d dVar) {
        synchronized (this.b) {
            try {
                if (dVar.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                f fVar = this.a;
                if (fVar != null) {
                    fVar.h(this);
                }
                if (!android.support.v4.media.session.f.a(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public final boolean i(d dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                f fVar = this.a;
                z = (fVar == null || fVar.i(this)) && dVar.equals(this.c) && this.e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isComplete() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!android.support.v4.media.session.f.a(this.f)) {
                    this.f = 2;
                    this.d.pause();
                }
                if (!android.support.v4.media.session.f.a(this.e)) {
                    this.e = 2;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
