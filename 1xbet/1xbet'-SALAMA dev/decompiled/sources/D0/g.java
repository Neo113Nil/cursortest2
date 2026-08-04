package D0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1641a;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1641a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        b bVar = null;
        if (i7 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                    bVar = new b();
                    bVar.f1625a = strongBinder;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            int i9 = 0;
            if (string != null) {
                synchronized (this.f1641a.f9770c) {
                    try {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1641a;
                        int i10 = multiInstanceInvalidationService.f9768a + 1;
                        multiInstanceInvalidationService.f9768a = i10;
                        if (multiInstanceInvalidationService.f9770c.register(bVar, Integer.valueOf(i10))) {
                            this.f1641a.f9769b.put(Integer.valueOf(i10), string);
                            i9 = i10;
                        } else {
                            this.f1641a.f9768a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i9);
            return true;
        }
        if (i7 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                    bVar = new b();
                    bVar.f1625a = strongBinder2;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface2;
                }
            }
            int i11 = parcel.readInt();
            synchronized (this.f1641a.f9770c) {
                this.f1641a.f9770c.unregister(bVar);
                this.f1641a.f9769b.remove(Integer.valueOf(i11));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 3) {
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        int i12 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        synchronized (this.f1641a.f9770c) {
            try {
                String str = (String) this.f1641a.f9769b.get(Integer.valueOf(i12));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = this.f1641a.f9770c.beginBroadcast();
                    for (int i13 = 0; i13 < iBeginBroadcast; i13++) {
                        try {
                            Integer num = (Integer) this.f1641a.f9770c.getBroadcastCookie(i13);
                            int iIntValue = num.intValue();
                            String str2 = (String) this.f1641a.f9769b.get(num);
                            if (i12 != iIntValue && str.equals(str2)) {
                                try {
                                    ((b) this.f1641a.f9770c.getBroadcastItem(i13)).Z(strArrCreateStringArray);
                                } catch (RemoteException e7) {
                                    Log.w("ROOM", "Error invoking a remote callback", e7);
                                }
                            }
                        } catch (Throwable th2) {
                            this.f1641a.f9770c.finishBroadcast();
                            throw th2;
                        }
                    }
                    this.f1641a.f9770c.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
