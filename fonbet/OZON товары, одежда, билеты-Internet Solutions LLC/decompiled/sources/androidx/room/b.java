package androidx.room;

import J4.m;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface b extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f45037b = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements b {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            int i13 = 0;
            String str = b.f45037b;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            Object callback = null;
            if (i11 == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(m.f13890a);
                    callback = (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new androidx.room.a(readStrongBinder) : (m) queryLocalInterface;
                }
                String readString = parcel.readString();
                MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (readString != null) {
                    MultiInstanceInvalidationService.b f45032c = MultiInstanceInvalidationService.this.getF45032c();
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    synchronized (f45032c) {
                        try {
                            multiInstanceInvalidationService.d(multiInstanceInvalidationService.getF45030a() + 1);
                            int f45030a = multiInstanceInvalidationService.getF45030a();
                            if (multiInstanceInvalidationService.getF45032c().register(callback, Integer.valueOf(f45030a))) {
                                multiInstanceInvalidationService.getF45031b().put(Integer.valueOf(f45030a), readString);
                                i13 = f45030a;
                            } else {
                                multiInstanceInvalidationService.d(multiInstanceInvalidationService.getF45030a() - 1);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i13);
                return true;
            }
            if (i11 == 2) {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(m.f13890a);
                    callback = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof m)) ? new androidx.room.a(readStrongBinder2) : (m) queryLocalInterface2;
                }
                int readInt = parcel.readInt();
                MultiInstanceInvalidationService.a aVar2 = (MultiInstanceInvalidationService.a) this;
                Intrinsics.checkNotNullParameter(callback, "callback");
                MultiInstanceInvalidationService.b f45032c2 = MultiInstanceInvalidationService.this.getF45032c();
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                synchronized (f45032c2) {
                    multiInstanceInvalidationService2.getF45032c().unregister(callback);
                }
                parcel2.writeNoException();
                return true;
            }
            if (i11 != 3) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            int readInt2 = parcel.readInt();
            String[] tables = parcel.createStringArray();
            MultiInstanceInvalidationService.a aVar3 = (MultiInstanceInvalidationService.a) this;
            Intrinsics.checkNotNullParameter(tables, "tables");
            MultiInstanceInvalidationService.b f45032c3 = MultiInstanceInvalidationService.this.getF45032c();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = MultiInstanceInvalidationService.this;
            synchronized (f45032c3) {
                String str2 = (String) multiInstanceInvalidationService3.getF45031b().get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.getF45032c().beginBroadcast();
                    while (i13 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.getF45032c().getBroadcastCookie(i13);
                            Intrinsics.g(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.getF45031b().get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    multiInstanceInvalidationService3.getF45032c().getBroadcastItem(i13).c(tables);
                                } catch (RemoteException e11) {
                                    Log.w("ROOM", "Error invoking a remote callback", e11);
                                }
                            }
                            i13++;
                        } catch (Throwable th3) {
                            multiInstanceInvalidationService3.getF45032c().finishBroadcast();
                            throw th3;
                        }
                    }
                    multiInstanceInvalidationService3.getF45032c().finishBroadcast();
                    Unit unit = Unit.f71690a;
                }
            }
            return true;
        }
    }
}
