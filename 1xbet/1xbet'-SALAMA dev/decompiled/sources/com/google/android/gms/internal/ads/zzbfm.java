package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbfm extends zzaxo implements zzbfn {
    public zzbfm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbfn zzdy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbfg zzbfeVar;
        switch (i7) {
            case 1:
                String string = parcel.readString();
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdt(string, aVarZ);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                p105o3.a aVarZzb = zzb(string2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzb);
                return true;
            case 3:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdx(aVarZ2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                p105o3.b.Z(parcel.readStrongBinder());
                parcel.readInt();
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdu(aVarZ3);
                parcel2.writeNoException();
                return true;
            case 7:
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzd(aVarZ4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbfeVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbfeVar = iInterfaceQueryLocalInterface instanceof zzbfg ? (zzbfg) iInterfaceQueryLocalInterface : new zzbfe(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzdv(zzbfeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdw(aVarZ5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
