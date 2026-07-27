package G0;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0326e;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;

/* loaded from: classes.dex */
public final class G extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final s2 f755e;

    public G(s2 s2Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.f755e = s2Var;
    }

    @Override // A1.a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        AbstractC0326e.b(parcel);
        Integer valueOf = Integer.valueOf(readInt);
        s2 s2Var = this.f755e;
        s2Var.f5256d = true;
        u2 u2Var = s2Var.f5254b;
        if (u2Var != null) {
            t2 t2Var = u2Var.f5269b;
            t2Var.getClass();
            if (r2.f5245f.D(t2Var, null, valueOf)) {
                r2.d(t2Var);
                s2Var.f5253a = null;
                s2Var.f5254b = null;
                s2Var.f5255c = null;
            }
        }
        return true;
    }
}
