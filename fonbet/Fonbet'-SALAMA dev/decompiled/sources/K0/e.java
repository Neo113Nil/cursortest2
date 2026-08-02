package K0;

import android.content.Context;
import java.io.File;
import w1.P2;

/* loaded from: classes.dex */
public final class e implements J0.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3875b;

    /* renamed from: c, reason: collision with root package name */
    public final P2 f3876c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3877d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3878e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public d f3879f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3880x;

    public e(Context context, String str, P2 p22, boolean z4) {
        this.f3874a = context;
        this.f3875b = str;
        this.f3876c = p22;
        this.f3877d = z4;
    }

    public final d a() {
        d dVar;
        synchronized (this.f3878e) {
            try {
                if (this.f3879f == null) {
                    b[] bVarArr = new b[1];
                    if (this.f3875b == null || !this.f3877d) {
                        this.f3879f = new d(this.f3874a, this.f3875b, bVarArr, this.f3876c);
                    } else {
                        this.f3879f = new d(this.f3874a, new File(this.f3874a.getNoBackupFilesDir(), this.f3875b).getAbsolutePath(), bVarArr, this.f3876c);
                    }
                    this.f3879f.setWriteAheadLoggingEnabled(this.f3880x);
                }
                dVar = this.f3879f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // J0.c
    public final b l() {
        return a().b();
    }

    @Override // J0.c
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        synchronized (this.f3878e) {
            try {
                d dVar = this.f3879f;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z4);
                }
                this.f3880x = z4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
