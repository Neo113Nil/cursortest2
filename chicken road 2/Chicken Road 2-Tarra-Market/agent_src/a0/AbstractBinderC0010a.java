package a0;

import P.q;
import P.y;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d0.C0056e;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0010a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f547a = 1;

    public /* synthetic */ AbstractBinderC0010a() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i2 = this.f547a;
        return this;
    }

    public boolean d(int i2, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (this.f547a) {
            case 0:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                return d(i2, parcel, parcel2);
            default:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                switch (i2) {
                    case 3:
                        Z.b.b(parcel);
                        break;
                    case 4:
                        Z.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        Z.b.b(parcel);
                        break;
                    case 7:
                        Z.b.b(parcel);
                        break;
                    case 8:
                        C0056e c0056e = (C0056e) Z.b.a(parcel, C0056e.CREATOR);
                        Z.b.b(parcel);
                        y yVar = (y) this;
                        yVar.f369c.post(new q(1, yVar, c0056e));
                        break;
                    case 9:
                        Z.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC0010a(String str) {
        attachInterface(this, str);
    }
}
