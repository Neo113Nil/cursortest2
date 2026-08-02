package R1;

import D3.o;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import g3.C1984b;
import v3.AbstractC2535a;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5140k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5141l;

    public f(D3.f fVar) {
        this.f5141l = fVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public void L(int i, String[] strArr) {
        synchronized (((MultiInstanceInvalidationService) this.f5141l).f7080m) {
            try {
                String str = (String) ((MultiInstanceInvalidationService) this.f5141l).f7079l.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = ((MultiInstanceInvalidationService) this.f5141l).f7080m.beginBroadcast();
                for (int i5 = 0; i5 < beginBroadcast; i5++) {
                    try {
                        Integer num = (Integer) ((MultiInstanceInvalidationService) this.f5141l).f7080m.getBroadcastCookie(i5);
                        int intValue = num.intValue();
                        String str2 = (String) ((MultiInstanceInvalidationService) this.f5141l).f7079l.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((a) ((MultiInstanceInvalidationService) this.f5141l).f7080m.getBroadcastItem(i5)).L(strArr);
                            } catch (RemoteException e3) {
                                Log.w("ROOM", "Error invoking a remote callback", e3);
                            }
                        }
                    } finally {
                        ((MultiInstanceInvalidationService) this.f5141l).f7080m.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int N(a aVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (((MultiInstanceInvalidationService) this.f5141l).f7080m) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f5141l;
                int i = multiInstanceInvalidationService.f7078k + 1;
                multiInstanceInvalidationService.f7078k = i;
                if (multiInstanceInvalidationService.f7080m.register(aVar, Integer.valueOf(i))) {
                    ((MultiInstanceInvalidationService) this.f5141l).f7079l.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f5141l;
                multiInstanceInvalidationService2.f7078k--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f5140k;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        a aVar = null;
        a aVar2 = null;
        switch (this.f5140k) {
            case 0:
                if (i == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                            aVar = new a();
                            aVar.f5125k = readStrongBinder;
                        } else {
                            aVar = (a) queryLocalInterface;
                        }
                    }
                    int N5 = N(aVar, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(N5);
                    return true;
                }
                if (i != 2) {
                    if (i == 3) {
                        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                        L(parcel.readInt(), parcel.createStringArray());
                        return true;
                    }
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i5);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof a)) {
                        aVar2 = new a();
                        aVar2.f5125k = readStrongBinder2;
                    } else {
                        aVar2 = (a) queryLocalInterface2;
                    }
                }
                int readInt = parcel.readInt();
                synchronized (((MultiInstanceInvalidationService) this.f5141l).f7080m) {
                    ((MultiInstanceInvalidationService) this.f5141l).f7080m.unregister(aVar2);
                    ((MultiInstanceInvalidationService) this.f5141l).f7079l.remove(Integer.valueOf(readInt));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i5)) {
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i6 = AbstractC2535a.f20428a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                g3.c createFromParcel2 = parcel.readInt() == 0 ? null : g3.c.CREATOR.createFromParcel(parcel);
                C1984b c1984b = createFromParcel2 != null ? new C1984b(createFromParcel2.f17159k, createFromParcel2.f17160l) : null;
                int i7 = createFromParcel.f7483k;
                o oVar = ((D3.f) this.f5141l).f946a;
                if (i7 <= 0) {
                    oVar.f(c1984b);
                    return true;
                }
                oVar.e(new k3.d(createFromParcel));
                return true;
        }
    }

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f5141l = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
