package Y;

import O.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import e0.k;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0.d f525a;

    public f(e0.d dVar) {
        this.f525a = dVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i4 = a.f517a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        K.b createFromParcel2 = parcel.readInt() == 0 ? null : K.b.CREATOR.createFromParcel(parcel);
        K.a aVar = createFromParcel2 != null ? new K.a(createFromParcel2.f194a, createFromParcel2.f195b) : null;
        int i5 = createFromParcel.f727a;
        k kVar = this.f525a.f954a;
        if (i5 <= 0) {
            kVar.f(aVar);
            return true;
        }
        kVar.e(createFromParcel.f729c != null ? new j(createFromParcel) : new O.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
