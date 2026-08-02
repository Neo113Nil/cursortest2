package android.support.customtabs;

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
public interface a extends IInterface {
    public static final String g = "android$support$customtabs$IAuthTabCallback".replace(Typography.dollar, '.');

    /* renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0002a extends Binder implements a {
        static final int TRANSACTION_onExtraCallback = 3;
        static final int TRANSACTION_onExtraCallbackWithResult = 4;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onWarmupCompleted = 5;

        /* renamed from: android.support.customtabs.a$a$a, reason: collision with other inner class name */
        public static class C0003a implements a {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.customtabs.a
            public final void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.g);
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.g);
                    obtain.writeString(str);
                    b.b(obtain, bundle, 0);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) b.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public final void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.g);
                    obtain.writeInt(i);
                    b.b(obtain, bundle, 0);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public final void onWarmupCompleted(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.g);
                    b.b(obtain, bundle, 0);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0002a() {
            attachInterface(this, a.g);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.g);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            C0003a c0003a = new C0003a();
            c0003a.a = iBinder;
            return c0003a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = a.g;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                onNavigationEvent(readInt, (Bundle) b.a(parcel));
                return true;
            }
            if (i == 3) {
                String readString = parcel.readString();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                onExtraCallback(readString, (Bundle) b.a(parcel));
                return true;
            }
            if (i != 4) {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                onWarmupCompleted((Bundle) b.a(parcel));
                return true;
            }
            String readString2 = parcel.readString();
            Parcelable.Creator creator4 = Bundle.CREATOR;
            Bundle onExtraCallbackWithResult = onExtraCallbackWithResult(readString2, (Bundle) b.a(parcel));
            parcel2.writeNoException();
            b.b(parcel2, onExtraCallbackWithResult, 1);
            return true;
        }
    }

    public static class b {
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

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

    void onWarmupCompleted(Bundle bundle) throws RemoteException;
}
