package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbxx extends zzaxo implements zzbxy {
    public zzbxx() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbxy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbxy ? (zzbxy) queryLocalInterface : new zzbxw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbxv zzbxvVar = null;
        switch (i7) {
            case 1:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbyc zzbycVar = (zzbyc) zzaxp.zza(parcel, zzbyc.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxvVar = queryLocalInterface instanceof zzbxv ? (zzbxv) queryLocalInterface : new zzbxt(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzf(Z6, zzbycVar, zzbxvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzk(Z7);
                parcel2.writeNoException();
                return true;
            case 3:
                BinderC1507b.Z(parcel.readStrongBinder());
                BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 4:
                BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbtd zzb = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzm(createTypedArrayList, Z8, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbtd zzb2 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(createTypedArrayList2, Z9, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbtg zzbtgVar = (zzbtg) zzaxp.zza(parcel, zzbtg.CREATOR);
                zzaxp.zzc(parcel);
                zzg(zzbtgVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(Z10);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1506a Z11 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbtd zzb3 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(createTypedArrayList3, Z11, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1506a Z12 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbtd zzb4 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(createTypedArrayList4, Z12, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1506a Z13 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z14 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString = parcel.readString();
                InterfaceC1506a Z15 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                InterfaceC1506a zze = zze(Z13, Z14, readString, Z15);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
