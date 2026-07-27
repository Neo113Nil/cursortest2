package c1;

import R0.u;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h1.e;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0169a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2527a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f2527a;
        return this;
    }

    public boolean d(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(int i3, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f2527a) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return d(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return e(i3, parcel, parcel2);
            default:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                switch (i3) {
                    case 3:
                        b1.b.b(parcel);
                        break;
                    case 4:
                        b1.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        b1.b.b(parcel);
                        break;
                    case 7:
                        b1.b.b(parcel);
                        break;
                    case 8:
                        e eVar = (e) b1.b.a(parcel, e.CREATOR);
                        b1.b.b(parcel);
                        u uVar = (u) this;
                        uVar.f1244e.post(new A.a(uVar, eVar, 4, false));
                        break;
                    case 9:
                        b1.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC0169a(String str, int i3) {
        this.f2527a = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
