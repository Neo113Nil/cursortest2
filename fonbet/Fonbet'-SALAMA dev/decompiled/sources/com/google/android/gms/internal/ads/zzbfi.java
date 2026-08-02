package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbfi extends zzaxo implements zzbfj {
    public zzbfi() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbfj zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbfj ? (zzbfj) queryLocalInterface : new zzbfh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC1506a zzf = zzf();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzf);
        } else if (i7 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, zze);
        } else if (i7 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i7 == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            if (i7 != 5) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
