package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class C implements h, h.a {
    public final i<?> a;
    public final j b;
    public volatile int c;
    public volatile e d;
    public volatile Object e;
    public volatile ModelLoader.LoadData<?> f;
    public volatile f i;

    public C(i iVar, j jVar) {
        this.a = iVar;
        this.b = jVar;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.b.a(gVar, exc, dVar, this.f.fetcher.getDataSource());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L13;
     */
    @Override // com.bumptech.glide.load.engine.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.d == null || !this.d.b()) {
            this.d = null;
            this.f = null;
            boolean z = false;
            while (!z && this.c < this.a.b().size()) {
                ArrayList b = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.f = (ModelLoader.LoadData) b.get(i);
                if (this.f != null && (this.a.p.c(this.f.fetcher.getDataSource()) || this.a.c(this.f.fetcher.getDataClass()) != null)) {
                    this.f.fetcher.loadData(this.a.o, new B(this, this.f));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void c(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.b.c(gVar, obj, dVar, this.f.fetcher.getDataSource(), gVar);
    }

    @Override // com.bumptech.glide.load.engine.h
    public final void cancel() {
        ModelLoader.LoadData<?> loadData = this.f;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    public final boolean d(Object obj) throws IOException {
        Throwable th;
        int i = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.e e = this.a.c.a().e(obj);
            Object a = e.a();
            com.bumptech.glide.load.d<X> d = this.a.d(a);
            g gVar = new g(d, a, this.a.i);
            com.bumptech.glide.load.g gVar2 = this.f.sourceKey;
            i<?> iVar = this.a;
            f fVar = new f(gVar2, iVar.n);
            com.bumptech.glide.load.engine.cache.a a2 = ((m.c) iVar.h).a();
            a2.a(fVar, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                fVar.toString();
                obj.toString();
                d.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (a2.b(fVar) != null) {
                this.i = fVar;
                this.d = new e(Collections.singletonList(this.f.sourceKey), this.a, this);
                this.f.fetcher.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.i);
                obj.toString();
            }
            try {
                this.b.c(this.f.sourceKey, e.a(), this.f.fetcher, this.f.fetcher.getDataSource(), this.f.sourceKey);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.fetcher.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
