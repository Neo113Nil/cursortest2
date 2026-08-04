package com.google.android.gms.internal.ads;

import F2.F0;
import F2.InterfaceC0265y0;
import F2.M;
import F2.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzazp extends zzaxo implements zzazq {
    public zzazp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzazq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzazq ? (zzazq) iInterfaceQueryLocalInterface : new zzazo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzazx zzazvVar;
        switch (i7) {
            case 2:
                M mZze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z4 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzazu;
                }
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzazvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzazvVar = iInterfaceQueryLocalInterface instanceof zzazx ? (zzazx) iInterfaceQueryLocalInterface : new zzazv(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzi(aVarZ, zzazvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                F0 f0Zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, f0Zzf);
                return true;
            case 6:
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0265y0 interfaceC0265y0Z = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(interfaceC0265y0Z);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
