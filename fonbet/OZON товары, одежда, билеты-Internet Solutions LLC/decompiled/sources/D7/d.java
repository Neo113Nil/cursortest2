package D7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i11, parcel, parcel2, i12)) {
            return true;
        }
        i iVar = (i) this;
        if (i11 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i13 = e.f6103a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(Ej.b.a(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            iVar.k(bundle);
            return true;
        }
        if (i11 != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i14 = e.f6103a;
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 > 0) {
            throw new BadParcelableException(Ej.b.a(dataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        iVar.a(bundle2);
        return true;
    }
}
