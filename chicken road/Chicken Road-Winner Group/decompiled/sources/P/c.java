package P;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1081b;

    public /* synthetic */ c(f fVar, int i3) {
        this.f1080a = i3;
        this.f1081b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1080a) {
            case 0:
                this.f1081b.f1094k.onDismiss(null);
                break;
            default:
                f fVar = this.f1081b;
                if (fVar.f1089e != null) {
                    if (fVar.f1089e == null) {
                        D0.a aVar = new D0.a();
                        Object obj = f.f1084o;
                        aVar.f261a = obj;
                        aVar.f262b = obj;
                        aVar.f263c = obj;
                        aVar.f264d = null;
                        fVar.f1089e = aVar;
                    }
                    fVar.f1089e.getClass();
                    break;
                }
                break;
        }
    }
}
