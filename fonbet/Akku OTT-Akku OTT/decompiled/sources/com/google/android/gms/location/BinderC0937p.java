package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;

/* renamed from: com.google.android.gms.location.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class BinderC0937p extends zzb implements InterfaceC0938q {
    public static InterfaceC0938q zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof InterfaceC0938q ? (InterfaceC0938q) queryLocalInterface : new C0936o(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
