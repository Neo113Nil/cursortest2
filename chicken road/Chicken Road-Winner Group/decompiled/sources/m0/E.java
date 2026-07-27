package m0;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0182e;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0185f;
import com.google.android.gms.internal.play_billing.InterfaceC0191h;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;

/* loaded from: classes.dex */
public final /* synthetic */ class E {

    /* renamed from: a, reason: collision with root package name */
    public int f9945a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9946b;

    public /* synthetic */ E(int i3, Object obj) {
        this.f9946b = obj;
        this.f9945a = i3;
    }

    public void a(s2 s2Var) {
        String str;
        J j3 = (J) this.f9946b;
        int i3 = this.f9945a;
        j3.getClass();
        try {
            if (j3.f9958H == null) {
                throw null;
            }
            InterfaceC0191h interfaceC0191h = j3.f9958H;
            String packageName = j3.f9956F.getPackageName();
            switch (i3) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            G g3 = new G(s2Var);
            C0185f c0185f = (C0185f) interfaceC0191h;
            Parcel a3 = c0185f.a();
            a3.writeString(packageName);
            a3.writeString(str);
            int i4 = AbstractC0182e.f2742a;
            a3.writeStrongBinder(g3);
            c0185f.c(a3, 1);
        } catch (Exception e3) {
            j3.Q(107, 28, O.f9967E);
            AbstractC0213o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            s2Var.f2820d = true;
            u2 u2Var = s2Var.f2818b;
            if (u2Var != null) {
                t2 t2Var = u2Var.f2833b;
                t2Var.getClass();
                if (r2.f.v(t2Var, null, 0)) {
                    r2.c(t2Var);
                    s2Var.f2817a = null;
                    s2Var.f2818b = null;
                    s2Var.f2819c = null;
                }
            }
        }
    }

    public /* synthetic */ E(int i3, Object[] objArr) {
        this.f9945a = i3;
        this.f9946b = objArr;
    }

    public E(P0.b bVar, int i3) {
        S0.r.c(bVar);
        this.f9946b = bVar;
        this.f9945a = i3;
    }

    public E(int i3) {
        if (i3 > 0) {
            this.f9946b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
