package com.google.android.finsky.externalreferrer;

/* loaded from: classes3.dex */
public interface IGetInstallReferrerService extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.a.b implements com.google.android.finsky.externalreferrer.IGetInstallReferrerService {

        public static class Proxy extends com.google.android.a.a implements com.google.android.finsky.externalreferrer.IGetInstallReferrerService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final android.os.Bundle c(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel a2 = a();
                com.google.android.a.c.b(a2, bundle);
                android.os.Parcel b = b(a2);
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.a.c.a(b, android.os.Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        public static com.google.android.finsky.externalreferrer.IGetInstallReferrerService b(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof com.google.android.finsky.externalreferrer.IGetInstallReferrerService ? (com.google.android.finsky.externalreferrer.IGetInstallReferrerService) queryLocalInterface : new com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            android.os.Bundle c = c((android.os.Bundle) com.google.android.a.c.a(parcel, android.os.Bundle.CREATOR));
            parcel2.writeNoException();
            com.google.android.a.c.c(parcel2, c);
            return true;
        }
    }

    android.os.Bundle c(android.os.Bundle bundle) throws android.os.RemoteException;
}
