package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0693m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9472b;

    public /* synthetic */ RunnableC0693m(Object obj, int i7) {
        this.f9471a = i7;
        this.f9472b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9471a) {
            case 0:
                DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q = (DialogInterfaceOnCancelListenerC0697q) this.f9472b;
                dialogInterfaceOnCancelListenerC0697q.f9478k0.onDismiss(dialogInterfaceOnCancelListenerC0697q.f9486s0);
                break;
            case 1:
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = (AbstractComponentCallbacksC0701v) this.f9472b;
                if (abstractComponentCallbacksC0701v.f9528Y != null) {
                    abstractComponentCallbacksC0701v.f().getClass();
                }
                break;
            default:
                ((Q) this.f9472b).A(true);
                break;
        }
    }
}
