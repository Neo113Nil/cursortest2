package X5;

import Q5.a;
import X5.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f34090b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34091c;

    /* renamed from: e, reason: collision with root package name */
    private Q5.a f34093e;

    /* renamed from: d, reason: collision with root package name */
    private final c f34092d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f34089a = new j();

    @Deprecated
    protected e(File file, long j11) {
        this.f34090b = file;
        this.f34091c = j11;
    }

    private synchronized Q5.a c() throws IOException {
        try {
            if (this.f34093e == null) {
                this.f34093e = Q5.a.y(this.f34090b, this.f34091c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34093e;
    }

    @Override // X5.a
    public final File a(T5.f fVar) {
        String a11 = this.f34089a.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a11 + " for for Key: " + fVar);
        }
        try {
            a.e w11 = c().w(a11);
            if (w11 != null) {
                return w11.a();
            }
            return null;
        } catch (IOException e11) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e11);
            return null;
        }
    }

    @Override // X5.a
    public final void b(T5.f fVar, a.InterfaceC0604a interfaceC0604a) {
        Q5.a c11;
        String a11 = this.f34089a.a(fVar);
        c cVar = this.f34092d;
        cVar.a(a11);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a11 + " for for Key: " + fVar);
            }
            try {
                c11 = c();
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e11);
                }
            }
            if (c11.w(a11) != null) {
                return;
            }
            a.c t2 = c11.t(a11);
            if (t2 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(a11));
            }
            try {
                if (interfaceC0604a.a(t2.f())) {
                    t2.e();
                }
                t2.b();
            } catch (Throwable th2) {
                t2.b();
                throw th2;
            }
        } finally {
            cVar.b(a11);
        }
    }
}
