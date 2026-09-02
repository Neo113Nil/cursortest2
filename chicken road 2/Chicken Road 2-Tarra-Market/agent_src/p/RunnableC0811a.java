package p;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0811a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0814d f6392b;

    public /* synthetic */ RunnableC0811a(DialogInterfaceOnCancelListenerC0814d dialogInterfaceOnCancelListenerC0814d, int i2) {
        this.f6391a = i2;
        this.f6392b = dialogInterfaceOnCancelListenerC0814d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6391a) {
            case 0:
                this.f6392b.f6405j.onDismiss(null);
                break;
            default:
                DialogInterfaceOnCancelListenerC0814d dialogInterfaceOnCancelListenerC0814d = this.f6392b;
                if (dialogInterfaceOnCancelListenerC0814d.f6399d != null) {
                    if (dialogInterfaceOnCancelListenerC0814d.f6399d == null) {
                        C0.b bVar = new C0.b(5, false);
                        Object obj = DialogInterfaceOnCancelListenerC0814d.f6395n;
                        bVar.f54b = obj;
                        bVar.f55c = obj;
                        bVar.f56d = obj;
                        dialogInterfaceOnCancelListenerC0814d.f6399d = bVar;
                    }
                    dialogInterfaceOnCancelListenerC0814d.f6399d.getClass();
                    break;
                }
                break;
        }
    }
}
