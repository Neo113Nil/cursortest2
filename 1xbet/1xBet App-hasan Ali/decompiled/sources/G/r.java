package G;

import E.Z;
import I.O;
import K0.N;
import android.os.CancellationSignal;
import p4.C2285z;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1745b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1744a = i;
        this.f1745b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f1744a) {
            case 0:
                O o5 = (O) this.f1745b;
                if (o5 != null) {
                    Z z3 = o5.f2426d;
                    if (z3 != null) {
                        z3.e(N.f2801b);
                    }
                    Z z5 = o5.f2426d;
                    if (z5 != null) {
                        z5.f(N.f2801b);
                        break;
                    }
                }
                break;
            default:
                ((C2285z) this.f1745b).d(null);
                break;
        }
    }
}
