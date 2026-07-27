package G0;

import M2.C0105i;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0325d1;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class z extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D3.g f912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0054d f913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0054d c0054d, Handler handler, D3.g gVar) {
        super(handler);
        this.f912a = gVar;
        this.f913b = c0054d;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        C0058h b6 = C0060j.b();
        b6.f854a = i2;
        D3.g gVar = this.f912a;
        if (i2 != 0) {
            C0054d c0054d = this.f913b;
            if (bundle == null) {
                c0054d.G(gVar, O.f779i, 73, null);
                return;
            } else {
                b6.f855b = AbstractC0357o0.e(bundle, "BillingClient");
                int i3 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                c0054d.r(M.c(i3 != 0 ? AbstractC0325d1.o(i3) : 23, 16, b6.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        ((C0105i) gVar.f448b).a(AbstractC1341c.j(b6.a()));
    }
}
