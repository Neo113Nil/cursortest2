package androidx.media3.session;

/* loaded from: classes3.dex */
public final /* synthetic */ class E5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((SequencedFutureManager) this.b).release();
                break;
            default:
                ((MediaController) this.b).release();
                break;
        }
    }
}
