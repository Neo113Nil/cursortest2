package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbub extends zzaxo implements zzbuc {
    public zzbub() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbug zzbugVar = null;
        zzbuh zzbuhVar = null;
        zzbug zzbugVar2 = null;
        zzbug zzbugVar3 = null;
        zzbug zzbugVar4 = null;
        switch (i7) {
            case 1:
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zze(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z4 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbud;
                }
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbuo zzbuoVar = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbugVar = queryLocalInterface instanceof zzbug ? (zzbug) queryLocalInterface : new zzbue(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzg(zzbuoVar, zzbugVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbuo zzbuoVar2 = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbugVar4 = queryLocalInterface2 instanceof zzbug ? (zzbug) queryLocalInterface2 : new zzbue(readStrongBinder3);
                }
                zzaxp.zzc(parcel);
                zzf(zzbuoVar2, zzbugVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbuo zzbuoVar3 = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbugVar3 = queryLocalInterface3 instanceof zzbug ? (zzbug) queryLocalInterface3 : new zzbue(readStrongBinder4);
                }
                zzaxp.zzc(parcel);
                zze(zzbuoVar3, zzbugVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbugVar2 = queryLocalInterface4 instanceof zzbug ? (zzbug) queryLocalInterface4 : new zzbue(readStrongBinder5);
                }
                zzaxp.zzc(parcel);
                zzh(readString, zzbugVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbty zzbtyVar = (zzbty) zzaxp.zza(parcel, zzbty.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbuhVar = queryLocalInterface5 instanceof zzbuh ? (zzbuh) queryLocalInterface5 : new zzbuh(readStrongBinder6);
                }
                zzaxp.zzc(parcel);
                zzi(zzbtyVar, zzbuhVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
