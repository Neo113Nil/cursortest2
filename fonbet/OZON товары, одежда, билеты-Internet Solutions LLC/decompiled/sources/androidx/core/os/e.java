package androidx.core.os;

import android.os.CancellationSignal;

@Deprecated
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42179a;

    /* renamed from: b, reason: collision with root package name */
    private a f42180b;

    /* renamed from: c, reason: collision with root package name */
    private CancellationSignal f42181c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42182d;

    public interface a {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f42179a) {
                    return;
                }
                this.f42179a = true;
                this.f42182d = true;
                a aVar = this.f42180b;
                CancellationSignal cancellationSignal = this.f42181c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f42182d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f42182d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public final Object b() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.f42181c == null) {
                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                    this.f42181c = cancellationSignal2;
                    if (this.f42179a) {
                        cancellationSignal2.cancel();
                    }
                }
                cancellationSignal = this.f42181c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cancellationSignal;
    }

    public final void c(a aVar) {
        synchronized (this) {
            while (this.f42182d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f42180b == aVar) {
                return;
            }
            this.f42180b = aVar;
            if (this.f42179a) {
                aVar.onCancel();
            }
        }
    }
}
