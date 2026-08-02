package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class m implements ComponentCallbacks2, com.bumptech.glide.manager.l {
    public static final com.bumptech.glide.request.i m;
    public final com.bumptech.glide.b a;
    public final Context b;
    public final com.bumptech.glide.manager.j c;

    @GuardedBy("this")
    public final r d;

    @GuardedBy("this")
    public final q e;

    @GuardedBy("this")
    public final u f;
    public final a i;
    public final com.bumptech.glide.manager.b j;
    public final CopyOnWriteArrayList<com.bumptech.glide.request.h<Object>> k;

    @GuardedBy("this")
    public final com.bumptech.glide.request.i l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            mVar.c.b(mVar);
        }
    }

    public class b implements b.a {

        @GuardedBy("RequestManager.this")
        public final r a;

        public b(@NonNull r rVar) {
            this.a = rVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z) {
            if (z) {
                synchronized (m.this) {
                    r rVar = this.a;
                    Iterator it = com.bumptech.glide.util.m.e(rVar.a).iterator();
                    while (it.hasNext()) {
                        com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
                        if (!dVar.isComplete() && !dVar.b()) {
                            dVar.clear();
                            if (rVar.c) {
                                rVar.b.add(dVar);
                            } else {
                                dVar.g();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        com.bumptech.glide.request.i c = new com.bumptech.glide.request.i().c(Bitmap.class);
        c.o = true;
        m = c;
        new com.bumptech.glide.request.i().c(com.bumptech.glide.load.resource.gif.c.class).o = true;
    }

    public m(@NonNull com.bumptech.glide.b bVar, @NonNull com.bumptech.glide.manager.j jVar, @NonNull q qVar, @NonNull Context context) {
        com.bumptech.glide.request.i iVar;
        r rVar = new r();
        com.bumptech.glide.manager.c cVar = bVar.f;
        this.f = new u();
        a aVar = new a();
        this.i = aVar;
        this.a = bVar;
        this.c = jVar;
        this.e = qVar;
        this.d = rVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(rVar);
        ((com.bumptech.glide.manager.e) cVar).getClass();
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        com.bumptech.glide.manager.b dVar = z ? new com.bumptech.glide.manager.d(applicationContext, bVar2) : new o();
        this.j = dVar;
        synchronized (bVar.i) {
            if (bVar.i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.i.add(this);
        }
        char[] cArr = com.bumptech.glide.util.m.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.b(this);
        } else {
            com.bumptech.glide.util.m.f().post(aVar);
        }
        jVar.b(dVar);
        this.k = new CopyOnWriteArrayList<>(bVar.c.d);
        f fVar = bVar.c;
        synchronized (fVar) {
            try {
                if (fVar.i == null) {
                    ((c) fVar.c).getClass();
                    com.bumptech.glide.request.i iVar2 = new com.bumptech.glide.request.i();
                    iVar2.o = true;
                    fVar.i = iVar2;
                }
                iVar = fVar.i;
            } finally {
            }
        }
        synchronized (this) {
            com.bumptech.glide.request.i clone = iVar.clone();
            if (clone.o && !clone.p) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.p = true;
            clone.o = true;
            this.l = clone;
        }
    }

    public final void e(@Nullable com.bumptech.glide.request.target.b<?> bVar) {
        if (bVar == null) {
            return;
        }
        boolean l = l(bVar);
        com.bumptech.glide.request.d d = bVar.d();
        if (l) {
            return;
        }
        com.bumptech.glide.b bVar2 = this.a;
        synchronized (bVar2.i) {
            try {
                Iterator it = bVar2.i.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).l(bVar)) {
                        return;
                    }
                }
                if (d != null) {
                    bVar.g(null);
                    d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f() {
        try {
            Iterator it = com.bumptech.glide.util.m.e(this.f.a).iterator();
            while (it.hasNext()) {
                e((com.bumptech.glide.request.target.b) it.next());
            }
            this.f.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.manager.l
    public final synchronized void h() {
        this.f.h();
        j();
    }

    public final synchronized void j() {
        r rVar = this.d;
        rVar.c = true;
        Iterator it = com.bumptech.glide.util.m.e(rVar.a).iterator();
        while (it.hasNext()) {
            com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                rVar.b.add(dVar);
            }
        }
    }

    public final synchronized void k() {
        r rVar = this.d;
        rVar.c = false;
        Iterator it = com.bumptech.glide.util.m.e(rVar.a).iterator();
        while (it.hasNext()) {
            com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.g();
            }
        }
        rVar.b.clear();
    }

    public final synchronized boolean l(@NonNull com.bumptech.glide.request.target.b<?> bVar) {
        com.bumptech.glide.request.d d = bVar.d();
        if (d == null) {
            return true;
        }
        if (!this.d.a(d)) {
            return false;
        }
        this.f.a.remove(bVar);
        bVar.g(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.l
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        f();
        r rVar = this.d;
        Iterator it = com.bumptech.glide.util.m.e(rVar.a).iterator();
        while (it.hasNext()) {
            rVar.a((com.bumptech.glide.request.d) it.next());
        }
        rVar.b.clear();
        this.c.a(this);
        this.c.a(this.j);
        com.bumptech.glide.util.m.f().removeCallbacks(this.i);
        com.bumptech.glide.b bVar = this.a;
        synchronized (bVar.i) {
            if (!bVar.i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.i.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.l
    public final synchronized void onStart() {
        k();
        this.f.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }
}
