package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.a.b;
import com.google.android.a.c;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.google.android.finsky.externalreferrer.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0104a extends b implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.google.android.finsky.externalreferrer.a$a$a, reason: collision with other inner class name */
        public static class C0105a extends com.google.android.a.a implements a {
            @Override // com.google.android.finsky.externalreferrer.a
            public final Bundle c(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = c.a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
                } catch (RuntimeException e) {
                    throw e;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle c(Bundle bundle) throws RemoteException;
}
