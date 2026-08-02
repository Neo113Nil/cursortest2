package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.support.customtabs.b;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.text.Typography;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface c extends IInterface {
    public static final String i = "android$support$customtabs$ICustomTabsService".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newAuthTabSession = 18;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_prefetch = 15;
        static final int TRANSACTION_prefetchWithMultipleUrls = 16;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* renamed from: android.support.customtabs.c$a$a, reason: collision with other inner class name */
        public static class C0006a implements c {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.customtabs.c
            public final Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeString(str);
                    b.c(obtain, bundle, 0);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) b.a(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean isEngagementSignalsApiAvailable(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, bundle, 0);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean mayLaunchUrl(android.support.customtabs.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, uri, 0);
                    b.c(obtain, bundle, 0);
                    b.b(obtain, list);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean newAuthTabSession(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(aVar);
                    b.c(obtain, bundle, 0);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean newSession(android.support.customtabs.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean newSessionWithExtras(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, bundle, 0);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final int postMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    obtain.writeString(str);
                    b.c(obtain, bundle, 0);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final void prefetch(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, uri, 0);
                    b.c(obtain, bundle, 0);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final void prefetchWithMultipleUrls(android.support.customtabs.b bVar, List<Uri> list, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.b(obtain, list);
                    b.c(obtain, bundle, 0);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean receiveFile(android.support.customtabs.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, uri, 0);
                    obtain.writeInt(i);
                    b.c(obtain, bundle, 0);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean requestPostMessageChannel(android.support.customtabs.b bVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, uri, 0);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean requestPostMessageChannelWithExtras(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, uri, 0);
                    b.c(obtain, bundle, 0);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean setEngagementSignalsCallback(android.support.customtabs.b bVar, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    obtain.writeStrongBinder(iBinder);
                    b.c(obtain, bundle, 0);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean updateVisuals(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    b.c(obtain, bundle, 0);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean validateRelationship(android.support.customtabs.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeStrongInterface(bVar);
                    obtain.writeInt(i);
                    b.c(obtain, uri, 0);
                    b.c(obtain, bundle, 0);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public final boolean warmup(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.i);
                    obtain.writeLong(j);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, c.i);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(c.i);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            C0006a c0006a = new C0006a();
            c0006a.a = iBinder;
            return c0006a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = c.i;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean warmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(warmup ? 1 : 0);
                    return true;
                case 3:
                    boolean newSession = newSession(b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSession ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.b asInterface = b.a.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) b.a(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean mayLaunchUrl = mayLaunchUrl(asInterface, uri, (Bundle) b.a(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.c(parcel2, extraCommand, 1);
                    return true;
                case 6:
                    boolean updateVisuals = updateVisuals(b.a.asInterface(parcel.readStrongBinder()), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(updateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean requestPostMessageChannel = requestPostMessageChannel(b.a.asInterface(parcel.readStrongBinder()), (Uri) b.a(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int postMessage = postMessage(b.a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(postMessage);
                    return true;
                case 9:
                    boolean validateRelationship = validateRelationship(b.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) b.a(parcel, Uri.CREATOR), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(validateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean newSessionWithExtras = newSessionWithExtras(b.a.asInterface(parcel.readStrongBinder()), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(b.a.asInterface(parcel.readStrongBinder()), (Uri) b.a(parcel, Uri.CREATOR), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean receiveFile = receiveFile(b.a.asInterface(parcel.readStrongBinder()), (Uri) b.a(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(receiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean isEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(b.a.asInterface(parcel.readStrongBinder()), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(isEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(b.a.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                case 15:
                    prefetch(b.a.asInterface(parcel.readStrongBinder()), (Uri) b.a(parcel, Uri.CREATOR), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    prefetchWithMultipleUrls(b.a.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(Uri.CREATOR), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 18:
                    boolean newAuthTabSession = newAuthTabSession(a.AbstractBinderC0002a.asInterface(parcel.readStrongBinder()), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newAuthTabSession ? 1 : 0);
                    return true;
            }
        }
    }

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, List list) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                c(parcel, (Parcelable) list.get(i), 0);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(android.support.customtabs.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newAuthTabSession(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    boolean newSession(android.support.customtabs.b bVar) throws RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    int postMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException;

    void prefetch(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

    void prefetchWithMultipleUrls(android.support.customtabs.b bVar, List<Uri> list, Bundle bundle) throws RemoteException;

    boolean receiveFile(android.support.customtabs.b bVar, Uri uri, int i2, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.b bVar, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean setEngagementSignalsCallback(android.support.customtabs.b bVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean updateVisuals(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    boolean validateRelationship(android.support.customtabs.b bVar, int i2, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j) throws RemoteException;
}
