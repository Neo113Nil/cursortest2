package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.request.transition.a;
import com.bumptech.glide.util.pool.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j<R> implements d {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);
    public final d.a a;
    public final Object b;

    @Nullable
    public final h<R> c;
    public final f d;
    public final com.bumptech.glide.f e;

    @Nullable
    public final Object f;
    public final Class<R> g;
    public final com.bumptech.glide.request.a<?> h;
    public final int i;
    public final int j;
    public final com.bumptech.glide.h k;
    public final com.bumptech.glide.request.target.b<R> l;

    @Nullable
    public final List<h<R>> m;
    public final a.C0066a n;
    public final Executor o;

    @GuardedBy("requestLock")
    public x<R> p;

    @GuardedBy("requestLock")
    public m.d q;
    public volatile m r;

    @GuardedBy("requestLock")
    public a s;

    @Nullable
    @GuardedBy("requestLock")
    public Drawable t;

    @Nullable
    @GuardedBy("requestLock")
    public Drawable u;

    @Nullable
    @GuardedBy("requestLock")
    public Drawable v;

    @GuardedBy("requestLock")
    public int w;

    @GuardedBy("requestLock")
    public int x;

    @GuardedBy("requestLock")
    public boolean y;

    @Nullable
    public final RuntimeException z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("PENDING", 0);
            a = aVar;
            a aVar2 = new a("RUNNING", 1);
            b = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            c = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            d = aVar4;
            a aVar5 = new a("FAILED", 4);
            e = aVar5;
            a aVar6 = new a("CLEARED", 5);
            f = aVar6;
            i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public j(Context context, com.bumptech.glide.f fVar, @NonNull Object obj, @Nullable Object obj2, Class cls, com.bumptech.glide.request.a aVar, int i, int i2, com.bumptech.glide.h hVar, com.bumptech.glide.request.target.b bVar, @Nullable h hVar2, @Nullable ArrayList arrayList, f fVar2, m mVar, Executor executor) {
        a.C0066a c0066a = com.bumptech.glide.request.transition.a.a;
        if (A) {
            String.valueOf(hashCode());
        }
        this.a = new d.a();
        this.b = obj;
        this.e = fVar;
        this.f = obj2;
        this.g = cls;
        this.h = aVar;
        this.i = i;
        this.j = i2;
        this.k = hVar;
        this.l = bVar;
        this.c = hVar2;
        this.m = arrayList;
        this.d = fVar2;
        this.r = mVar;
        this.n = c0066a;
        this.o = executor;
        this.s = a.a;
        if (this.z == null && fVar.g.a.containsKey(com.bumptech.glide.e.class)) {
            this.z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.d;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.f;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final void c() {
        if (this.y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.l.getClass();
        m.d dVar = this.q;
        if (dVar != null) {
            synchronized (m.this) {
                dVar.a.h(dVar.b);
            }
            this.q = null;
        }
    }

    @Override // com.bumptech.glide.request.d
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                a aVar = this.s;
                a aVar2 = a.f;
                if (aVar == aVar2) {
                    return;
                }
                c();
                x<R> xVar = this.p;
                if (xVar != null) {
                    this.p = null;
                } else {
                    xVar = null;
                }
                f fVar = this.d;
                if (fVar == null || fVar.i(this)) {
                    com.bumptech.glide.request.target.b<R> bVar = this.l;
                    d();
                    bVar.i();
                }
                this.s = aVar2;
                if (xVar != null) {
                    this.r.getClass();
                    m.e(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable d() {
        if (this.u == null) {
            this.h.getClass();
            this.u = null;
        }
        return this.u;
    }

    public final void e(s sVar, int i) {
        Drawable drawable;
        this.a.a();
        synchronized (this.b) {
            try {
                sVar.getClass();
                int i2 = this.e.h;
                if (i2 <= i) {
                    Objects.toString(this.f);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        s.a(sVar, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.q = null;
                this.s = a.e;
                f fVar = this.d;
                if (fVar != null) {
                    fVar.e(this);
                }
                boolean z = true;
                this.y = true;
                try {
                    List<h<R>> list = this.m;
                    if (list != null) {
                        for (h<R> hVar : list) {
                            f fVar2 = this.d;
                            if (fVar2 != null) {
                                fVar2.getRoot().a();
                            }
                            hVar.f(sVar);
                        }
                    }
                    h<R> hVar2 = this.c;
                    if (hVar2 != null) {
                        f fVar3 = this.d;
                        if (fVar3 != null) {
                            fVar3.getRoot().a();
                        }
                        hVar2.f(sVar);
                    }
                    f fVar4 = this.d;
                    if (fVar4 != null && !fVar4.c(this)) {
                        z = false;
                    }
                    if (this.f == null) {
                        if (this.v == null) {
                            this.h.getClass();
                            this.v = null;
                        }
                        drawable = this.v;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.t == null) {
                            this.h.getClass();
                            this.t = null;
                        }
                        drawable = this.t;
                    }
                    if (drawable == null) {
                        d();
                    }
                    this.l.c();
                } finally {
                    this.y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean f(d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                aVar = this.h;
                hVar = this.k;
                List<h<R>> list = this.m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.b) {
            try {
                i3 = jVar.i;
                i4 = jVar.j;
                obj2 = jVar.f;
                cls2 = jVar.g;
                aVar2 = jVar.h;
                hVar2 = jVar.k;
                List<h<R>> list2 = jVar.m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = com.bumptech.glide.util.m.a;
            if ((obj == null ? obj2 == null : obj instanceof Model ? ((Model) obj).isEquivalentTo(obj2) : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.e(aVar2)) && hVar == hVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.d
    public final void g() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = com.bumptech.glide.util.h.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (com.bumptech.glide.util.m.i(this.i, this.j)) {
                        this.w = this.i;
                        this.x = this.j;
                    }
                    if (this.v == null) {
                        this.h.getClass();
                        this.v = null;
                    }
                    e(new s("Received null model"), this.v == null ? 5 : 3);
                    return;
                }
                a aVar = this.s;
                if (aVar == a.b) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.d) {
                    h(this.p, com.bumptech.glide.load.a.e, false);
                    return;
                }
                List<h<R>> list = this.m;
                if (list != null) {
                    for (h<R> hVar : list) {
                        if (hVar instanceof c) {
                            ((c) hVar).getClass();
                        }
                    }
                }
                a aVar2 = a.c;
                this.s = aVar2;
                if (com.bumptech.glide.util.m.i(this.i, this.j)) {
                    j(this.i, this.j);
                } else {
                    this.l.b(this);
                }
                a aVar3 = this.s;
                if (aVar3 == a.b || aVar3 == aVar2) {
                    f fVar = this.d;
                    if (fVar == null || fVar.c(this)) {
                        com.bumptech.glide.request.target.b<R> bVar = this.l;
                        d();
                        bVar.getClass();
                    }
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(x<?> xVar, com.bumptech.glide.load.a aVar, boolean z) {
        this.a.a();
        x<?> xVar2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (xVar == null) {
                        e(new s("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = xVar.get();
                    try {
                        if (obj != null && this.g.isAssignableFrom(obj.getClass())) {
                            f fVar = this.d;
                            if (fVar == null || fVar.d(this)) {
                                i(xVar, obj, aVar, z);
                                return;
                            }
                            this.p = null;
                            this.s = a.d;
                            this.r.getClass();
                            m.e(xVar);
                        }
                        this.p = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.g);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(xVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new s(sb.toString()), 5);
                        this.r.getClass();
                        m.e(xVar);
                    } catch (Throwable th) {
                        xVar2 = xVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (xVar2 != null) {
                this.r.getClass();
                m.e(xVar2);
            }
            throw th3;
        }
    }

    @GuardedBy("requestLock")
    public final void i(x<R> xVar, R r, com.bumptech.glide.load.a aVar, boolean z) {
        boolean z2;
        f fVar = this.d;
        if (fVar != null) {
            fVar.getRoot().a();
        }
        this.s = a.d;
        this.p = xVar;
        if (this.e.h <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.f);
            int i = com.bumptech.glide.util.h.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (fVar != null) {
            fVar.h(this);
        }
        this.y = true;
        try {
            List<h<R>> list = this.m;
            if (list != null) {
                z2 = false;
                for (h<R> hVar : list) {
                    hVar.e(r);
                    if (hVar instanceof c) {
                        z2 |= ((c) hVar).a();
                    }
                }
            } else {
                z2 = false;
            }
            h<R> hVar2 = this.c;
            if (hVar2 != null) {
                hVar2.e(r);
            }
            if (!z2) {
                this.n.getClass();
                this.l.a(r);
            }
            this.y = false;
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isComplete() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.d;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            try {
                a aVar = this.s;
                z = aVar == a.b || aVar == a.c;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, int i2) {
        j<R> jVar = this;
        int i3 = i;
        jVar.a.a();
        Object obj = jVar.b;
        synchronized (obj) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i4 = com.bumptech.glide.util.h.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (jVar.s == a.c) {
                        a aVar = a.b;
                        jVar.s = aVar;
                        jVar.h.getClass();
                        if (i3 != Integer.MIN_VALUE) {
                            i3 = Math.round(i3 * 1.0f);
                        }
                        jVar.w = i3;
                        jVar.x = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            int i5 = com.bumptech.glide.util.h.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        m mVar = jVar.r;
                        try {
                            com.bumptech.glide.f fVar = jVar.e;
                            Object obj2 = jVar.f;
                            com.bumptech.glide.request.a<?> aVar2 = jVar.h;
                            try {
                                com.bumptech.glide.load.g gVar = aVar2.i;
                                int i6 = jVar.w;
                                try {
                                    int i7 = jVar.x;
                                    Class<?> cls = aVar2.n;
                                    try {
                                        Class<R> cls2 = jVar.g;
                                        com.bumptech.glide.h hVar = jVar.k;
                                        try {
                                            l lVar = aVar2.b;
                                            com.bumptech.glide.util.b bVar = aVar2.m;
                                            try {
                                                boolean z2 = aVar2.j;
                                                boolean z3 = aVar2.q;
                                                try {
                                                    com.bumptech.glide.load.i iVar = aVar2.l;
                                                    boolean z4 = aVar2.d;
                                                    boolean z5 = aVar2.r;
                                                    Executor executor = jVar.o;
                                                    jVar = obj;
                                                    try {
                                                        jVar.q = mVar.b(fVar, obj2, gVar, i6, i7, cls, cls2, hVar, lVar, bVar, z2, z3, iVar, z4, z5, jVar, executor);
                                                        if (jVar.s != aVar) {
                                                            jVar.q = null;
                                                        }
                                                        if (z) {
                                                            int i8 = com.bumptech.glide.util.h.a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    jVar = obj;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                jVar = obj;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            jVar = obj;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        jVar = obj;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    jVar = obj;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                jVar = obj;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            jVar = obj;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    jVar = obj;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public final void pause() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
