package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbsn extends zzaxo implements zzbso {
    public zzbsn() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbso zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbso ? (zzbso) queryLocalInterface : new zzbsm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) zzaxp.zza(parcel, Intent.CREATOR);
                zzaxp.zzc(parcel);
                zzh(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzk(Z6);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzaxp.zzc(parcel);
                zzp(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
