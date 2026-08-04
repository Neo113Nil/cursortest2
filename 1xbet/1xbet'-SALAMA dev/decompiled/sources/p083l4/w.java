package p083l4;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.w f15021b;

    public /* synthetic */ w(com.google.android.gms.common.internal.w wVar, int i7) {
        this.f15020a = i7;
        this.f15021b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15020a) {
            case 0:
                com.google.android.gms.common.internal.w wVar = this.f15021b;
                ((y) wVar.f11336c).f15033h.cancel(false);
                y yVar = (y) wVar.f11336c;
                yVar.f15027b = true;
                if (yVar.j.r0()) {
                    ((y) wVar.f11336c).j.W(null, "websocket opened", new Object[0]);
                }
                ((y) wVar.f11336c).e();
                break;
            default:
                com.google.android.gms.common.internal.w wVar2 = this.f15021b;
                if (((y) wVar2.f11336c).j.r0()) {
                    ((y) wVar2.f11336c).j.W(null, "closed", new Object[0]);
                }
                y.a((y) wVar2.f11336c);
                break;
        }
    }
}
