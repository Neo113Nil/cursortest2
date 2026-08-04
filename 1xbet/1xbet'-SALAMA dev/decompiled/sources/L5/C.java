package L5;

import java.lang.ref.WeakReference;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC0332k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f4394c;

    public C(int i7, C1050x1 c1050x1, InterfaceC0333l interfaceC0333l) {
        super(i7, c1050x1);
        this.f4394c = new WeakReference(interfaceC0333l);
    }

    @Override // p167y2.d
    public final void onAdLoaded() {
        WeakReference weakReference = this.f4394c;
        if (weakReference.get() != null) {
            ((InterfaceC0333l) weakReference.get()).a();
        }
    }
}
