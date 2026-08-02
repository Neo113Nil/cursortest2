package V5;

import V5.g;
import Z5.p;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
final class A implements g, g.a {

    /* renamed from: a, reason: collision with root package name */
    private final h<?> f28107a;

    /* renamed from: b, reason: collision with root package name */
    private final g.a f28108b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f28109c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f28110d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f28111e;

    /* renamed from: f, reason: collision with root package name */
    private volatile p.a<?> f28112f;

    /* renamed from: g, reason: collision with root package name */
    private volatile e f28113g;

    A(h<?> hVar, g.a aVar) {
        this.f28107a = hVar;
        this.f28108b = aVar;
    }

    private boolean d(Object obj) throws IOException {
        Throwable th2;
        int i11 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z11 = false;
        try {
            com.bumptech.glide.load.data.e<T> o11 = this.f28107a.o(obj);
            Object a11 = o11.a();
            T5.d<X> q11 = this.f28107a.q(a11);
            f fVar = new f(q11, a11, this.f28107a.k());
            e eVar = new e(this.f28112f.f35542a, this.f28107a.p());
            X5.a d11 = this.f28107a.d();
            d11.b(eVar, fVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar + ", data: " + obj + ", encoder: " + q11 + ", duration: " + p6.g.a(elapsedRealtimeNanos));
            }
            if (d11.a(eVar) != null) {
                this.f28113g = eVar;
                this.f28110d = new d(Collections.singletonList(this.f28112f.f35542a), this.f28107a, this);
                this.f28112f.f35544c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f28113g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                ((i) this.f28108b).c(this.f28112f.f35542a, o11.a(), this.f28112f.f35544c, this.f28112f.f35544c.getDataSource(), this.f28112f.f35542a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z11 = true;
                if (z11) {
                    throw th2;
                }
                this.f28112f.f35544c.cleanup();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // V5.g.a
    public final void a(T5.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, T5.a aVar) {
        this.f28108b.a(fVar, exc, dVar, this.f28112f.f35544c.getDataSource());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // V5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.f28111e != null) {
            Object obj = this.f28111e;
            this.f28111e = null;
            try {
            } catch (IOException e11) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e11);
                }
            }
        }
        if (this.f28110d == null || !this.f28110d.b()) {
            this.f28110d = null;
            this.f28112f = null;
            boolean z11 = false;
            while (!z11 && this.f28109c < this.f28107a.g().size()) {
                ArrayList g10 = this.f28107a.g();
                int i11 = this.f28109c;
                this.f28109c = i11 + 1;
                this.f28112f = (p.a) g10.get(i11);
                if (this.f28112f != null && (this.f28107a.e().c(this.f28112f.f35544c.getDataSource()) || this.f28107a.h(this.f28112f.f35544c.getDataClass()) != null)) {
                    this.f28112f.f35544c.loadData(this.f28107a.l(), new z(this, this.f28112f));
                    z11 = true;
                }
            }
            return z11;
        }
        return true;
    }

    @Override // V5.g.a
    public final void c(T5.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, T5.a aVar, T5.f fVar2) {
        this.f28108b.c(fVar, obj, dVar, this.f28112f.f35544c.getDataSource(), fVar);
    }

    @Override // V5.g
    public final void cancel() {
        p.a<?> aVar = this.f28112f;
        if (aVar != null) {
            aVar.f35544c.cancel();
        }
    }

    final boolean e(p.a<?> aVar) {
        p.a<?> aVar2 = this.f28112f;
        return aVar2 != null && aVar2 == aVar;
    }

    final void f(p.a<?> aVar, Object obj) {
        k e11 = this.f28107a.e();
        if (obj != null && e11.c(aVar.f35544c.getDataSource())) {
            this.f28111e = obj;
            ((i) this.f28108b).p();
            return;
        }
        g.a aVar2 = this.f28108b;
        T5.f fVar = aVar.f35542a;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f35544c;
        ((i) aVar2).c(fVar, obj, dVar, dVar.getDataSource(), this.f28113g);
    }

    final void g(p.a<?> aVar, @NonNull Exception exc) {
        g.a aVar2 = this.f28108b;
        e eVar = this.f28113g;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f35544c;
        aVar2.a(eVar, exc, dVar, dVar.getDataSource());
    }
}
