package m0;

import android.os.Parcel;
import c1.AbstractBinderC0169a;
import com.google.android.gms.internal.play_billing.AbstractC0182e;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;

/* loaded from: classes.dex */
public final class G extends AbstractBinderC0169a {

    /* renamed from: d, reason: collision with root package name */
    public final s2 f9951d;

    public G(s2 s2Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 1);
        this.f9951d = s2Var;
    }

    @Override // c1.AbstractBinderC0169a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        AbstractC0182e.b(parcel);
        Integer valueOf = Integer.valueOf(readInt);
        s2 s2Var = this.f9951d;
        s2Var.f2820d = true;
        u2 u2Var = s2Var.f2818b;
        if (u2Var != null) {
            t2 t2Var = u2Var.f2833b;
            t2Var.getClass();
            if (r2.f.v(t2Var, null, valueOf)) {
                r2.c(t2Var);
                s2Var.f2817a = null;
                s2Var.f2818b = null;
                s2Var.f2819c = null;
            }
        }
        return true;
    }
}
