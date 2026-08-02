package Y1;

import G.v;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class e implements X1.b, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final Context f6129k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6130l;

    /* renamed from: m, reason: collision with root package name */
    public final v f6131m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6132n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6133o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public d f6134p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6135q;

    public e(Context context, String str, v vVar, boolean z3) {
        this.f6129k = context;
        this.f6130l = str;
        this.f6131m = vVar;
        this.f6132n = z3;
    }

    public final d b() {
        d dVar;
        synchronized (this.f6133o) {
            try {
                if (this.f6134p == null) {
                    b[] bVarArr = new b[1];
                    if (this.f6130l == null || !this.f6132n) {
                        this.f6134p = new d(this.f6129k, this.f6130l, bVarArr, this.f6131m);
                    } else {
                        this.f6134p = new d(this.f6129k, new File(this.f6129k.getNoBackupFilesDir(), this.f6130l).getAbsolutePath(), bVarArr, this.f6131m);
                    }
                    this.f6134p.setWriteAheadLoggingEnabled(this.f6135q);
                }
                dVar = this.f6134p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // X1.b
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        synchronized (this.f6133o) {
            try {
                d dVar = this.f6134p;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z3);
                }
                this.f6135q = z3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X1.b
    public final b z() {
        return b().d();
    }
}
