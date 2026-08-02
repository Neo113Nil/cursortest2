package com.google.android.gms.internal.ads;

import F2.F0;
import F2.InterfaceC0265y0;
import F2.M;
import F2.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzazp extends zzaxo implements zzazq {
    public zzazp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzazq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzazq ? (zzazq) queryLocalInterface : new zzazo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzazx zzazvVar;
        switch (i7) {
            case 2:
                M zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z4 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzazu;
                }
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzazvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzazvVar = queryLocalInterface instanceof zzazx ? (zzazx) queryLocalInterface : new zzazv(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzi(Z6, zzazvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                F0 zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0265y0 Z7 = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(Z7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
