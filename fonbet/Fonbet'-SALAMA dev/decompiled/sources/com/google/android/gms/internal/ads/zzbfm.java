package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbfm extends zzaxo implements zzbfn {
    public zzbfm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbfn zzdy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbfn ? (zzbfn) queryLocalInterface : new zzbfl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbfg zzbfeVar;
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdt(readString, Z6);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                InterfaceC1506a zzb = zzb(readString2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzb);
                return true;
            case 3:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdx(Z7);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                BinderC1507b.Z(parcel.readStrongBinder());
                parcel.readInt();
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdu(Z8);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzd(Z9);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbfeVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbfeVar = queryLocalInterface instanceof zzbfg ? (zzbfg) queryLocalInterface : new zzbfe(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzdv(zzbfeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdw(Z10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
