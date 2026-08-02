package D0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
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
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    bVar = new b();
                    bVar.f1625a = readStrongBinder;
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            int i9 = 0;
            if (readString != null) {
                synchronized (this.f1641a.f9770c) {
                    try {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1641a;
                        int i10 = multiInstanceInvalidationService.f9768a + 1;
                        multiInstanceInvalidationService.f9768a = i10;
                        if (multiInstanceInvalidationService.f9770c.register(bVar, Integer.valueOf(i10))) {
                            this.f1641a.f9769b.put(Integer.valueOf(i10), readString);
                            i9 = i10;
                        } else {
                            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f1641a;
                            multiInstanceInvalidationService2.f9768a--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i9);
            return true;
        }
        if (i7 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                    bVar = new b();
                    bVar.f1625a = readStrongBinder2;
                } else {
                    bVar = (b) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            synchronized (this.f1641a.f9770c) {
                this.f1641a.f9770c.unregister(bVar);
                this.f1641a.f9769b.remove(Integer.valueOf(readInt));
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
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        synchronized (this.f1641a.f9770c) {
            try {
                String str = (String) this.f1641a.f9769b.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = this.f1641a.f9770c.beginBroadcast();
                    for (int i11 = 0; i11 < beginBroadcast; i11++) {
                        try {
                            Integer num = (Integer) this.f1641a.f9770c.getBroadcastCookie(i11);
                            int intValue = num.intValue();
                            String str2 = (String) this.f1641a.f9769b.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((b) this.f1641a.f9770c.getBroadcastItem(i11)).Z(createStringArray);
                                } catch (RemoteException e7) {
                                    Log.w("ROOM", "Error invoking a remote callback", e7);
                                }
                            }
                        } finally {
                            this.f1641a.f9770c.finishBroadcast();
                        }
                    }
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
