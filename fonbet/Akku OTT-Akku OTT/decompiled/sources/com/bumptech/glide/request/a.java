package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.m;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public int a;
    public boolean j;
    public boolean o;
    public boolean p;
    public boolean r;

    @NonNull
    public l b = l.c;

    @NonNull
    public com.bumptech.glide.h c = com.bumptech.glide.h.c;
    public boolean d = true;
    public int e = -1;
    public int f = -1;

    @NonNull
    public com.bumptech.glide.load.g i = com.bumptech.glide.signature.a.b;
    public boolean k = true;

    @NonNull
    public com.bumptech.glide.load.i l = new com.bumptech.glide.load.i();

    @NonNull
    public com.bumptech.glide.util.b m = new com.bumptech.glide.util.b();

    @NonNull
    public Class<?> n = Object.class;
    public boolean q = true;

    public static boolean f(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public T a(@NonNull a<?> aVar) {
        if (this.p) {
            return (T) clone().a(aVar);
        }
        int i = aVar.a;
        if (f(aVar.a, 1048576)) {
            this.r = aVar.r;
        }
        if (f(aVar.a, 4)) {
            this.b = aVar.b;
        }
        if (f(aVar.a, 8)) {
            this.c = aVar.c;
        }
        if (f(aVar.a, 16)) {
            this.a &= -33;
        }
        if (f(aVar.a, 32)) {
            this.a &= -17;
        }
        if (f(aVar.a, 64)) {
            this.a &= -129;
        }
        if (f(aVar.a, 128)) {
            this.a &= -65;
        }
        if (f(aVar.a, 256)) {
            this.d = aVar.d;
        }
        if (f(aVar.a, 512)) {
            this.f = aVar.f;
            this.e = aVar.e;
        }
        if (f(aVar.a, 1024)) {
            this.i = aVar.i;
        }
        if (f(aVar.a, 4096)) {
            this.n = aVar.n;
        }
        if (f(aVar.a, 8192)) {
            this.a &= -16385;
        }
        if (f(aVar.a, 16384)) {
            this.a &= -8193;
        }
        if (f(aVar.a, 65536)) {
            this.k = aVar.k;
        }
        if (f(aVar.a, 131072)) {
            this.j = aVar.j;
        }
        if (f(aVar.a, 2048)) {
            this.m.putAll((Map) aVar.m);
            this.q = aVar.q;
        }
        if (!this.k) {
            this.m.clear();
            int i2 = this.a;
            this.j = false;
            this.a = i2 & (-133121);
            this.q = true;
        }
        this.a |= aVar.a;
        this.l.b.putAll((SimpleArrayMap) aVar.l.b);
        i();
        return this;
    }

    @Override // 
    @CheckResult
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            com.bumptech.glide.load.i iVar = new com.bumptech.glide.load.i();
            t.l = iVar;
            iVar.b.putAll((SimpleArrayMap) this.l.b);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t.m = bVar;
            bVar.putAll((Map) this.m);
            t.o = false;
            t.p = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public final T c(@NonNull Class<?> cls) {
        if (this.p) {
            return (T) clone().c(cls);
        }
        this.n = cls;
        this.a |= 4096;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final T d(@NonNull l lVar) {
        if (this.p) {
            return (T) clone().d(lVar);
        }
        com.bumptech.glide.util.l.c(lVar, "Argument must not be null");
        this.b = lVar;
        this.a |= 4;
        i();
        return this;
    }

    public final boolean e(a<?> aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = m.a;
        return this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.j == aVar.j && this.k == aVar.k && this.b.equals(aVar.b) && this.c == aVar.c && this.l.equals(aVar.l) && this.m.equals(aVar.m) && this.n.equals(aVar.n) && m.b(this.i, aVar.i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return e((a) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public final T g(int i, int i2) {
        if (this.p) {
            return (T) clone().g(i, i2);
        }
        this.f = i;
        this.e = i2;
        this.a |= 512;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a h() {
        if (this.p) {
            return clone().h();
        }
        this.c = com.bumptech.glide.h.d;
        this.a |= 8;
        i();
        return this;
    }

    public int hashCode() {
        char[] cArr = m.a;
        return m.h(m.h(m.h(m.h(m.h(m.h(m.h(m.g(0, m.g(0, m.g(this.k ? 1 : 0, m.g(this.j ? 1 : 0, m.g(this.f, m.g(this.e, m.g(this.d ? 1 : 0, m.h(m.g(0, m.h(m.g(0, m.h(m.g(0, m.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.b), this.c), this.l), this.m), this.n), this.i), null);
    }

    @NonNull
    public final void i() {
        if (this.o) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @NonNull
    @CheckResult
    public final <Y> T j(@NonNull com.bumptech.glide.load.h<Y> hVar, @NonNull Y y) {
        if (this.p) {
            return (T) clone().j(hVar, y);
        }
        com.bumptech.glide.util.l.b(hVar);
        com.bumptech.glide.util.l.b(y);
        this.l.b.put(hVar, y);
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a k(@NonNull com.bumptech.glide.signature.b bVar) {
        if (this.p) {
            return clone().k(bVar);
        }
        this.i = bVar;
        this.a |= 1024;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a l() {
        if (this.p) {
            return clone().l();
        }
        this.d = false;
        this.a |= 256;
        i();
        return this;
    }

    @NonNull
    public final a m(@NonNull com.bumptech.glide.load.m mVar) {
        if (this.p) {
            return clone().m(mVar);
        }
        n nVar = new n(mVar);
        o(Bitmap.class, mVar);
        o(Drawable.class, nVar);
        o(BitmapDrawable.class, nVar);
        o(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(mVar));
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a n(@NonNull com.bumptech.glide.load.resource.bitmap.k kVar, @NonNull com.bumptech.glide.load.resource.bitmap.i iVar) {
        if (this.p) {
            return clone().n(kVar, iVar);
        }
        com.bumptech.glide.load.h hVar = com.bumptech.glide.load.resource.bitmap.k.e;
        com.bumptech.glide.util.l.c(kVar, "Argument must not be null");
        j(hVar, kVar);
        return m(iVar);
    }

    @NonNull
    public final a o(@NonNull Class cls, @NonNull com.bumptech.glide.load.m mVar) {
        if (this.p) {
            return clone().o(cls, mVar);
        }
        com.bumptech.glide.util.l.b(mVar);
        this.m.put(cls, mVar);
        int i = this.a;
        this.k = true;
        this.q = false;
        this.a = i | 198656;
        this.j = true;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a p() {
        if (this.p) {
            return clone().p();
        }
        this.r = true;
        this.a |= 1048576;
        i();
        return this;
    }
}
