package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbza extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbzb {
    public zzbza() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static com.google.android.gms.internal.ads.zzbzb zzI(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbzb ? (com.google.android.gms.internal.ads.zzbzb) queryLocalInterface : new com.google.android.gms.internal.ads.zzbyz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                parcel2.writeNoException();
                return true;
            case 8:
                zzq();
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzg = zzg();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzg ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzm(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(asInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                java.lang.String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzH(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
