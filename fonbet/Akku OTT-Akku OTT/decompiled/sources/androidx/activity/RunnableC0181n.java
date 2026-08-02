package androidx.activity;

/* renamed from: androidx.activity.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0181n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0181n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ComponentActivity) this.b).invalidateMenu();
                break;
            default:
                ((com.csdcorp.speech_to_text.b) this.b).b.notImplemented();
                break;
        }
    }
}
