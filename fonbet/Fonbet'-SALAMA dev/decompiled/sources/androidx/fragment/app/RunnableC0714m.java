package androidx.fragment.app;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0714m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9472b;

    public /* synthetic */ RunnableC0714m(Object obj, int i7) {
        this.f9471a = i7;
        this.f9472b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9471a) {
            case 0:
                DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q = (DialogInterfaceOnCancelListenerC0718q) this.f9472b;
                dialogInterfaceOnCancelListenerC0718q.f9478k0.onDismiss(dialogInterfaceOnCancelListenerC0718q.f9486s0);
                break;
            case 1:
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = (AbstractComponentCallbacksC0722v) this.f9472b;
                if (abstractComponentCallbacksC0722v.f9528Y != null) {
                    abstractComponentCallbacksC0722v.f().getClass();
                    break;
                }
                break;
            default:
                ((Q) this.f9472b).A(true);
                break;
        }
    }
}
