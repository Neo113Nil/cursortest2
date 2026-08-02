package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class b implements f, d {
    public final Object a;

    @Nullable
    public final f b;
    public volatile d c;
    public volatile d d;

    @GuardedBy("requestLock")
    public int e = 3;

    @GuardedBy("requestLock")
    public int f = 3;

    public b(Object obj, @Nullable f fVar) {
        this.a = obj;
        this.b = fVar;
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.d
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.f
    public final boolean c(d dVar) {
        boolean z;
        int i;
        synchronized (this.a) {
            f fVar = this.b;
            z = false;
            if (fVar == null || fVar.c(this)) {
                if (this.e != 5 ? dVar.equals(this.c) : dVar.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public final boolean d(d dVar) {
        boolean z;
        synchronized (this.a) {
            f fVar = this.b;
            z = fVar == null || fVar.d(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.f
    public final void e(d dVar) {
        synchronized (this.a) {
            try {
                if (dVar.equals(this.d)) {
                    this.f = 5;
                    f fVar = this.b;
                    if (fVar != null) {
                        fVar.e(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean f(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.c.f(bVar.c) && this.d.f(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.d
    public final void g() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public final f getRoot() {
        f root;
        synchronized (this.a) {
            try {
                f fVar = this.b;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.f
    public final void h(d dVar) {
        synchronized (this.a) {
            try {
                if (dVar.equals(this.c)) {
                    this.e = 4;
                } else if (dVar.equals(this.d)) {
                    this.f = 4;
                }
                f fVar = this.b;
                if (fVar != null) {
                    fVar.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public final boolean i(d dVar) {
        boolean z;
        synchronized (this.a) {
            f fVar = this.b;
            z = (fVar == null || fVar.i(this)) && dVar.equals(this.c);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final void pause() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.pause();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
