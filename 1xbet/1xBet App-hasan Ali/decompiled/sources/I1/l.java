package I1;

import android.window.OnBackInvokedCallback;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2595b;

    public /* synthetic */ l(int i, Object obj) {
        this.f2594a = i;
        this.f2595b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2594a) {
            case 0:
                ((k) this.f2595b).a();
                break;
            case 1:
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) this.f2595b;
                if (interfaceC2015a != null) {
                    interfaceC2015a.invoke();
                    break;
                }
                break;
            default:
                ((Runnable) this.f2595b).run();
                break;
        }
    }
}
