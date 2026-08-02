package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbon extends zzaxo implements zzboo {
    public zzbon() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzboo zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzboo ? (zzboo) queryLocalInterface : new zzbom(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zzbor zzb = zzb(readString);
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzb);
        } else if (i7 == 2) {
            String readString2 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i7 == 3) {
            String readString3 = parcel.readString();
            zzaxp.zzc(parcel);
            zzbqn zzc = zzc(readString3);
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzc);
        } else {
            if (i7 != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
