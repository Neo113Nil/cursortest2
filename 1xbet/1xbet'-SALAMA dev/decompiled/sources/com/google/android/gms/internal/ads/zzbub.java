package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbub extends zzaxo implements zzbuc {
    public zzbub() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbug zzbueVar = null;
        zzbuh zzbuhVar = null;
        zzbug zzbueVar2 = null;
        zzbug zzbueVar3 = null;
        zzbug zzbueVar4 = null;
        switch (i7) {
            case 1:
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zze(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z4 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbud;
                }
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbuo zzbuoVar = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbueVar = iInterfaceQueryLocalInterface instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface : new zzbue(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzg(zzbuoVar, zzbueVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbuo zzbuoVar2 = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbueVar4 = iInterfaceQueryLocalInterface2 instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface2 : new zzbue(strongBinder3);
                }
                zzaxp.zzc(parcel);
                zzf(zzbuoVar2, zzbueVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbuo zzbuoVar3 = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbueVar3 = iInterfaceQueryLocalInterface3 instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface3 : new zzbue(strongBinder4);
                }
                zzaxp.zzc(parcel);
                zze(zzbuoVar3, zzbueVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbueVar2 = iInterfaceQueryLocalInterface4 instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface4 : new zzbue(strongBinder5);
                }
                zzaxp.zzc(parcel);
                zzh(string, zzbueVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbty zzbtyVar = (zzbty) zzaxp.zza(parcel, zzbty.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbuhVar = iInterfaceQueryLocalInterface5 instanceof zzbuh ? (zzbuh) iInterfaceQueryLocalInterface5 : new zzbuh(strongBinder6);
                }
                zzaxp.zzc(parcel);
                zzi(zzbtyVar, zzbuhVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
