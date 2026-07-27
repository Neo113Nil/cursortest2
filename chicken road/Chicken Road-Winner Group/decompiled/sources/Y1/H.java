package Y1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import m0.C1120h;
import m0.InterfaceC1117e;

/* loaded from: classes.dex */
public final class H implements InterfaceC1117e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1659a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0081e f1660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f1661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f1662d;

    public H(I i3, C0081e c0081e, Long l3) {
        this.f1662d = i3;
        this.f1660b = c0081e;
        this.f1661c = l3;
    }

    @Override // m0.InterfaceC1117e
    public final void onBillingServiceDisconnected() {
        b0.i iVar = this.f1662d.f1667e;
        C0077a c0077a = new C0077a(2);
        iVar.getClass();
        new D0.a((T1.f) iVar.f2461b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", (T1.k) C0082f.f1677a, (P0.j) null).f(new ArrayList(Collections.singletonList(this.f1661c)), new G0.j(c0077a, 4, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected"));
    }

    @Override // m0.InterfaceC1117e
    public final void onBillingSetupFinished(C1120h c1120h) {
        if (this.f1659a) {
            Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
            return;
        }
        this.f1659a = true;
        this.f1660b.a(F2.b.s(c1120h));
    }
}
