package B1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class o extends A1.a implements e {

    /* renamed from: e, reason: collision with root package name */
    public final n f238e;

    public o(n nVar) {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
        this.f238e = nVar;
    }

    @Override // A1.a
    public final boolean c(Parcel parcel, int i2) {
        if (i2 == 1) {
            Status status = ((b) k.a(parcel, b.CREATOR)).f212a;
            n nVar = this.f238e;
            nVar.getClass();
            nVar.H(status);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }
}
