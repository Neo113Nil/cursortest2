package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxx extends zzaxo implements zzbxy {
    public zzbxx() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbxy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbxy ? (zzbxy) iInterfaceQueryLocalInterface : new zzbxw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbxv zzbxtVar = null;
        switch (i7) {
            case 1:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzbyc zzbycVar = (zzbyc) zzaxp.zza(parcel, zzbyc.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxtVar = iInterfaceQueryLocalInterface instanceof zzbxv ? (zzbxv) iInterfaceQueryLocalInterface : new zzbxt(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzf(aVarZ, zzbycVar, zzbxtVar);
                parcel2.writeNoException();
                return true;
            case 2:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzk(aVarZ2);
                parcel2.writeNoException();
                return true;
            case 3:
                p105o3.b.Z(parcel.readStrongBinder());
                p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 4:
                p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                zzbtd zzbtdVarZzb = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, aVarZ3, zzbtdVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                zzbtd zzbtdVarZzb2 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, aVarZ4, zzbtdVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbtg zzbtgVar = (zzbtg) zzaxp.zza(parcel, zzbtg.CREATOR);
                zzaxp.zzc(parcel);
                zzg(zzbtgVar);
                parcel2.writeNoException();
                return true;
            case 8:
                p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(aVarZ5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                p105o3.a aVarZ6 = p105o3.b.Z(parcel.readStrongBinder());
                zzbtd zzbtdVarZzb3 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, aVarZ6, zzbtdVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                p105o3.a aVarZ7 = p105o3.b.Z(parcel.readStrongBinder());
                zzbtd zzbtdVarZzb4 = zzbtc.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, aVarZ7, zzbtdVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                p105o3.a aVarZ8 = p105o3.b.Z(parcel.readStrongBinder());
                p105o3.a aVarZ9 = p105o3.b.Z(parcel.readStrongBinder());
                String string = parcel.readString();
                p105o3.a aVarZ10 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                p105o3.a aVarZze = zze(aVarZ8, aVarZ9, string, aVarZ10);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZze);
                return true;
            default:
                return false;
        }
    }
}
