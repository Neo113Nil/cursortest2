package K;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K.e f944b;

    public /* synthetic */ b(K.e eVar, int i2) {
        this.f943a = i2;
        this.f944b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f943a) {
            case 0:
                this.f944b.f957j.onDismiss(null);
                break;
            default:
                K.e eVar = this.f944b;
                if (eVar.f951d != null) {
                    if (eVar.f951d == null) {
                        I0.b bVar = new I0.b(1, false);
                        java.lang.Object obj = K.e.f947n;
                        bVar.f657b = obj;
                        bVar.f658c = obj;
                        bVar.f659d = obj;
                        eVar.f951d = bVar;
                    }
                    eVar.f951d.getClass();
                    break;
                }
                break;
        }
    }
}
