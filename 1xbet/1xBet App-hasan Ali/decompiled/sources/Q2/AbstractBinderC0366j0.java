package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0366j0 extends E5 implements InterfaceC0368k0 {
    public AbstractBinderC0366j0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
        F5.b(parcel);
        u0(c0387u0);
        parcel2.writeNoException();
        return true;
    }
}
