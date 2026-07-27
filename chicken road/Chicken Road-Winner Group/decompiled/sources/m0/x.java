package m0;

import Y1.C0081e;
import a0.C0087a;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0181d1;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;

/* loaded from: classes.dex */
public final class x extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1.b f10091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1116d f10092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1116d c1116d, Handler handler, F1.b bVar) {
        super(handler);
        this.f10091a = bVar;
        this.f10092b = c1116d;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        C0087a a3 = C1120h.a();
        a3.f1781b = i3;
        F1.b bVar = this.f10091a;
        if (i3 != 0) {
            C1116d c1116d = this.f10092b;
            if (bundle == null) {
                c1116d.G(bVar, O.f9975i, 73, null);
                return;
            } else {
                a3.f1780a = AbstractC0213o0.e(bundle, "BillingClient");
                int i4 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                c1116d.r(M.c(i4 != 0 ? AbstractC0181d1.m(i4) : 23, 16, a3.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        ((C0081e) bVar.f378b).a(F2.b.s(a3.a()));
    }
}
