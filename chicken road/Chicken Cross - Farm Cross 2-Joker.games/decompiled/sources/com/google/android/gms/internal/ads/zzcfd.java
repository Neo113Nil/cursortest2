package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcfd extends zzbev implements zzcfe {
    public zzcfd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcfe zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcfe ? (zzcfe) queryLocalInterface : new zzcfc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcfb zzcfbVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcfi zzcfiVar = (zzcfi) zzbew.zzb(parcel, zzcfi.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcfbVar = queryLocalInterface instanceof zzcfb ? (zzcfb) queryLocalInterface : new zzcez(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zze(asInterface, zzcfiVar, zzcfbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzf(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcai zza = zzcah.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzg(createTypedArrayList, asInterface3, zza);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcai zza2 = zzcah.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzh(createTypedArrayList2, asInterface4, zza2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcal zzcalVar = (zzcal) zzbew.zzb(parcel, zzcal.CREATOR);
                zzbew.zzh(parcel);
                zzi(zzcalVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzj(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcai zza3 = zzcah.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzk(createTypedArrayList3, asInterface6, zza3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcai zza4 = zzcah.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzl(createTypedArrayList4, asInterface7, zza4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                IObjectWrapper zzm = zzm(asInterface8, asInterface9, readString, asInterface10);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzm);
                return true;
            default:
                return false;
        }
    }
}
