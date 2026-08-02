package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cl1 extends Binder implements IInterface {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1287b = 0;

    public cl1(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: F */
    public boolean mo966F(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f1287b;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f1287b) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                ml1 ml1Var = (ml1) this;
                switch (i) {
                    case 3:
                        il1.m2662b(parcel);
                        break;
                    case 4:
                        il1.m2662b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        il1.m2662b(parcel);
                        break;
                    case 7:
                        il1.m2662b(parcel);
                        break;
                    case 8:
                        am1 am1Var = (am1) il1.m2661a(parcel, am1.CREATOR);
                        il1.m2662b(parcel);
                        ml1Var.f5083d.post(new f31(6, ml1Var, am1Var));
                        break;
                    case 9:
                        il1.m2662b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo966F(i, parcel, parcel2);
        }
    }

    public /* synthetic */ cl1() {
    }
}
