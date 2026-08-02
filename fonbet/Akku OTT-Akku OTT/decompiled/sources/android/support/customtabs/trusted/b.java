package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface b extends IInterface {
    public static final String m = "android$support$customtabs$trusted$ITrustedWebActivityService".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        /* renamed from: android.support.customtabs.trusted.b$a$a, reason: collision with other inner class name */
        public static class C0011a implements b {
            public IBinder a;

            @Override // android.support.customtabs.trusted.b
            public final Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    C0012b.b(obtain, bundle, 0);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) C0012b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.customtabs.trusted.b
            public final void cancelNotification(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    C0012b.b(obtain, bundle, 0);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    obtain.writeString(str);
                    C0012b.b(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) C0012b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public final Bundle getActiveNotifications() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) C0012b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public final Bundle getSmallIconBitmap() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) C0012b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public final int getSmallIconId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public final Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.m);
                    C0012b.b(obtain, bundle, 0);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) C0012b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.m);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.m);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            C0011a c0011a = new C0011a();
            c0011a.a = iBinder;
            return c0011a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = b.m;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) C0012b.a(parcel));
                    parcel2.writeNoException();
                    C0012b.b(parcel2, notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    cancelNotification((Bundle) C0012b.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    C0012b.b(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) C0012b.a(parcel));
                    parcel2.writeNoException();
                    C0012b.b(parcel2, areNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    C0012b.b(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    String readString = parcel.readString();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle extraCommand = extraCommand(readString, (Bundle) C0012b.a(parcel), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    C0012b.b(parcel2, extraCommand, 1);
                    return true;
            }
        }
    }

    /* renamed from: android.support.customtabs.trusted.b$b, reason: collision with other inner class name */
    public static class C0012b {
        public static Object a(Parcel parcel) {
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Bundle bundle, int i) {
            if (bundle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, i);
            }
        }
    }

    Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

    void cancelNotification(Bundle bundle) throws RemoteException;

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle getActiveNotifications() throws RemoteException;

    Bundle getSmallIconBitmap() throws RemoteException;

    int getSmallIconId() throws RemoteException;

    Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;
}
