package androidx.lifecycle;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B f7077k;

    public z(B b3) {
        this.f7077k = b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f7077k.f6996a) {
            obj = this.f7077k.f6999d;
            this.f7077k.f6999d = B.i;
        }
        this.f7077k.b(obj);
    }
}
