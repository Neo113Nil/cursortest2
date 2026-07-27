package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import h1.C0478a;
import h1.C0479b;
import x1.AbstractC1537a;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3472a = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3473e;

    public g(I1.h hVar) {
        this.f3473e = hVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i2 = this.f3472a;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        d callback = null;
        d callback2 = null;
        switch (this.f3472a) {
            case 0:
                if (i2 >= 1 && i2 <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i2 == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i2 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                            callback = new d();
                            callback.f3458a = readStrongBinder;
                        } else {
                            callback = (d) queryLocalInterface;
                        }
                    }
                    String readString = parcel.readString();
                    kotlin.jvm.internal.i.e(callback, "callback");
                    if (readString != null) {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f3473e;
                        synchronized (multiInstanceInvalidationService.f4698c) {
                            try {
                                int i6 = multiInstanceInvalidationService.f4696a + 1;
                                multiInstanceInvalidationService.f4696a = i6;
                                if (multiInstanceInvalidationService.f4698c.register(callback, Integer.valueOf(i6))) {
                                    multiInstanceInvalidationService.f4697b.put(Integer.valueOf(i6), readString);
                                    r2 = i6;
                                } else {
                                    multiInstanceInvalidationService.f4696a--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(r2);
                    return true;
                }
                if (i2 == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                            callback2 = new d();
                            callback2.f3458a = readStrongBinder2;
                        } else {
                            callback2 = (d) queryLocalInterface2;
                        }
                    }
                    int readInt = parcel.readInt();
                    kotlin.jvm.internal.i.e(callback2, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.f3473e;
                    synchronized (multiInstanceInvalidationService2.f4698c) {
                        multiInstanceInvalidationService2.f4698c.unregister(callback2);
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                int readInt2 = parcel.readInt();
                String[] tables = parcel.createStringArray();
                kotlin.jvm.internal.i.e(tables, "tables");
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = (MultiInstanceInvalidationService) this.f3473e;
                synchronized (multiInstanceInvalidationService3.f4698c) {
                    String str = (String) multiInstanceInvalidationService3.f4697b.get(Integer.valueOf(readInt2));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return true;
                    }
                    int beginBroadcast = multiInstanceInvalidationService3.f4698c.beginBroadcast();
                    while (r2 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f4698c.getBroadcastCookie(r2);
                            kotlin.jvm.internal.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.f4697b.get(num);
                            if (readInt2 != intValue && str.equals(str2)) {
                                try {
                                    ((d) multiInstanceInvalidationService3.f4698c.getBroadcastItem(r2)).b(tables);
                                } catch (RemoteException e3) {
                                    Log.w("ROOM", "Error invoking a remote callback", e3);
                                }
                            }
                            r2++;
                        } finally {
                            multiInstanceInvalidationService3.f4698c.finishBroadcast();
                        }
                    }
                    return true;
                }
            default:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                if (i2 == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i7 = AbstractC1537a.f12262a;
                    Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    C0479b createFromParcel2 = parcel.readInt() == 0 ? null : C0479b.CREATOR.createFromParcel(parcel);
                    C0478a c0478a = createFromParcel2 != null ? new C0478a(createFromParcel2.f5773a, createFromParcel2.f5774b) : null;
                    r2 = createFromParcel.f4977a <= 0 ? 1 : 0;
                    I1.h hVar = (I1.h) this.f3473e;
                    if (r2 != 0) {
                        hVar.b(c0478a);
                    } else {
                        hVar.a(createFromParcel.f4979c != null ? new m1.k(createFromParcel) : new m1.f(createFromParcel));
                    }
                    r2 = 1;
                }
                return r2;
        }
    }

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3473e = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
