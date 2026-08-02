package l4;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.w f15015b;

    public /* synthetic */ w(com.google.android.gms.common.internal.w wVar, int i7) {
        this.f15014a = i7;
        this.f15015b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15014a) {
            case 0:
                com.google.android.gms.common.internal.w wVar = this.f15015b;
                ((y) wVar.f11336c).f15027h.cancel(false);
                y yVar = (y) wVar.f11336c;
                yVar.f15021b = true;
                if (yVar.j.r0()) {
                    ((y) wVar.f11336c).j.W(null, "websocket opened", new Object[0]);
                }
                ((y) wVar.f11336c).e();
                break;
            default:
                com.google.android.gms.common.internal.w wVar2 = this.f15015b;
                if (((y) wVar2.f11336c).j.r0()) {
                    ((y) wVar2.f11336c).j.W(null, "closed", new Object[0]);
                }
                y.a((y) wVar2.f11336c);
                break;
        }
    }
}
